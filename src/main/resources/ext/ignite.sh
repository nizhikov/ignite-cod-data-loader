#!/bin/bash
#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#      http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
export IGNITE_HOME=/gridgain/ssd/nizhikov/bin/gridgain-ultimate-fabric-8.1.6/
export IGNITE_JMX_PORT=49113

#
# Grid command line loader.
#

#
# Import common functions.
#
if [ "${IGNITE_HOME}" = "" ];
    then IGNITE_HOME_TMP="$(dirname "$(cd "$(dirname "$0")"; "pwd")")";
    else IGNITE_HOME_TMP=${IGNITE_HOME};
fi

#
# Set SCRIPTS_HOME - base path to scripts.
#
SCRIPTS_HOME="${IGNITE_HOME_TMP}/bin"

source "${SCRIPTS_HOME}"/include/functions.sh

#
# Discover path to Java executable and check it's version.
#
checkJava

#
# Discover IGNITE_HOME environment variable.
#
setIgniteHome

if [ "${DEFAULT_CONFIG}" == "" ]; then
    DEFAULT_CONFIG=config/default-config.xml
fi

#
# Parse command line parameters.
#
. "${SCRIPTS_HOME}"/include/parseargs.sh

#
# Set IGNITE_LIBS.
#
. "${SCRIPTS_HOME}"/include/setenv.sh

CP="${IGNITE_LIBS}"

RANDOM_NUMBER=$("$JAVA" -cp "${CP}" org.apache.ignite.startup.cmdline.CommandLineRandomNumberGenerator)

RESTART_SUCCESS_FILE="${IGNITE_HOME}/work/ignite_success_${RANDOM_NUMBER}"
RESTART_SUCCESS_OPT="-DIGNITE_SUCCESS_FILE=${RESTART_SUCCESS_FILE}"

#
# Find available port for JMX
#
# You can specify IGNITE_JMX_PORT environment variable for overriding automatically found JMX port
#
# This is executed when -nojmx is not specified
#
if [ "${NOJMX}" == "0" ] ; then
    findAvailableJmxPort
fi

# Mac OS specific support to display correct name in the dock.
osname=`uname`

if [ "${DOCK_OPTS}" == "" ]; then
    DOCK_OPTS="-Xdock:name=Ignite Node"
fi

#
# JVM options. See http://java.sun.com/javase/technologies/hotspot/vmoptions.jsp for more details.
#
# ADD YOUR/CHANGE ADDITIONAL OPTIONS HERE
#
if [ -z "$JVM_OPTS" ] ; then
    if [[ `"$JAVA" -version 2>&1 | egrep "1\.[7]\."` ]]; then
        JVM_OPTS="-XX:+AggressiveOpts \
        -XX:MaxPermSize=256m \
        -XX:+CMSClassUnloadingEnabled \
        -XX:+CMSPermGenSweepingEnabled \
        -XX:+CMSScavengeBeforeRemark \
        -XX:+UnlockCommercialFeatures \
        -XX:+UnlockDiagnosticVMOptions \
        -XX:+UnlockExperimentalVMOptions \
        -Xloggc:/gridgain/ssd/nizhikov/gc.log \
        -XX:GCLogFileSize=100M \
        -XX:+UseGCLogFileRotation \
        -XX:NumberOfGCLogFiles=10 \
        -XX:+PrintGC \
        -XX:+PrintGCDetails \
        -XX:+PrintGCTimeStamps \
        -XX:+PrintGCApplicationStoppedTime \
        -XX:+PrintAdaptiveSizePolicy \
        -XX:+PrintTenuringDistribution \
        -XX:+TraceMetadataHumongousAllocation \
        -XX:+G1TraceEagerReclaimHumongousObjects \
        -XX:OnOutOfMemoryError='kill -3 %p; sleep 2; kill -9 %p' \
        -XX:HeapDumpPath=/gridgain/ssd/nizhikov/bin/heapdump.log \
        -XX:+DisableExplicitGC \
        -XX:+ScavengeBeforeFullGC \
        -XX:G1HeapRegionSize=8m \
        -XX:InitiatingHeapOccupancyPercent=30 \
        -XX:G1NewSizePercent=1 \
        -XX:+UseG1GC \
        -XX:+AlwaysPreTouch \
        -Xms20g \
        -Xmx31g \
        -XX:ErrorFile=/gridgain/ssd/nizhikov/bin/jvm_error.log \
        -DIGNITE_QUIET=true \
        -DIGNITE_USE_ASYNC_FILE_IO_FACTORY=true \
        -server"
    else
        JVM_OPTS="-XX:+AggressiveOpts \
        -XX:MaxPermSize=256m \
        -XX:+CMSClassUnloadingEnabled \
        -XX:+CMSPermGenSweepingEnabled \
        -XX:+CMSScavengeBeforeRemark \
        -XX:+UnlockCommercialFeatures \
        -XX:+UnlockDiagnosticVMOptions \
        -XX:+UnlockExperimentalVMOptions \
        -Xloggc:/gridgain/ssd/nizhikov/gc.log \
        -XX:GCLogFileSize=100M \
        -XX:+UseGCLogFileRotation \
        -XX:NumberOfGCLogFiles=10 \
        -XX:+PrintGC \
        -XX:+PrintGCDetails \
        -XX:+PrintGCTimeStamps \
        -XX:+PrintGCApplicationStoppedTime \
        -XX:+PrintAdaptiveSizePolicy \
        -XX:+PrintTenuringDistribution \
        -XX:+TraceMetadataHumongousAllocation \
        -XX:+G1TraceEagerReclaimHumongousObjects \
        -XX:OnOutOfMemoryError='kill -3 %p; sleep 2; kill -9 %p' \
        -XX:HeapDumpPath=/gridgain/ssd/nizhikov/bin/heapdump.log \
        -XX:+DisableExplicitGC \
        -XX:+ScavengeBeforeFullGC \
        -XX:G1HeapRegionSize=8m \
        -XX:InitiatingHeapOccupancyPercent=30 \
        -XX:G1NewSizePercent=1 \
        -XX:+UseG1GC \
        -XX:+AlwaysPreTouch \
        -Xms20g \
        -Xmx31g \
        -XX:ErrorFile=/gridgain/ssd/nizhikov/bin/jvm_error.log \
        -DIGNITE_QUIET=true \
        -DIGNITE_USE_ASYNC_FILE_IO_FACTORY=true \
        -server"
    fi
fi

#
# Uncomment the following GC settings if you see spikes in your throughput due to Garbage Collection.
#
# JVM_OPTS="$JVM_OPTS -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:+UseTLAB -XX:NewSize=128m -XX:MaxNewSize=128m"
# JVM_OPTS="$JVM_OPTS -XX:MaxTenuringThreshold=0 -XX:SurvivorRatio=1024 -XX:+UseCMSInitiatingOccupancyOnly -XX:CMSInitiatingOccupancyFraction=60"

#
# Uncomment if you get StackOverflowError.
# On 64 bit systems this value can be larger, e.g. -Xss16m
#
# JVM_OPTS="${JVM_OPTS} -Xss4m"

#
# Uncomment to set preference for IPv4 stack.
#
JVM_OPTS="${JVM_OPTS} -Djava.net.preferIPv4Stack=true"

#
# Assertions are disabled by default since version 3.5.
# If you want to enable them - set 'ENABLE_ASSERTIONS' flag to '1'.
#
ENABLE_ASSERTIONS="0"

#
# Set '-ea' options if assertions are enabled.
#
if [ "${ENABLE_ASSERTIONS}" = "1" ]; then
    JVM_OPTS="${JVM_OPTS} -ea"
fi

#
# If this is a Hadoop edition, and HADOOP_HOME set, add the native library location:
#
if [ -d "${IGNITE_HOME}/libs/ignite-hadoop/" ] && [ -n "${HADOOP_HOME}" ] && [ -d "${HADOOP_HOME}/lib/native/" ]; then
   if [[ "${JVM_OPTS}${JVM_XOPTS}" != *-Djava.library.path=* ]]; then
      JVM_OPTS="${JVM_OPTS} -Djava.library.path=${HADOOP_HOME}/lib/native/"
   fi
fi

#
# Set main class to start service (grid node by default).
#
if [ "${MAIN_CLASS}" = "" ]; then
    MAIN_CLASS=org.apache.ignite.startup.cmdline.CommandLineStartup
fi

#
# Remote debugging (JPDA).
# Uncomment and change if remote debugging is required.
#
# JVM_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=8787 ${JVM_OPTS}"

ERRORCODE="-1"

while [ "${ERRORCODE}" -ne "130" ]
do
    if [ "${INTERACTIVE}" == "1" ] ; then
        case $osname in
            Darwin*)
                "$JAVA" ${JVM_OPTS} ${QUIET} "${DOCK_OPTS}" "${RESTART_SUCCESS_OPT}" ${JMX_MON} \
                 -DIGNITE_HOME="${IGNITE_HOME}" \
                -DIGNITE_PROG_NAME="$0" ${JVM_XOPTS} -cp "${CP}" ${MAIN_CLASS}
            ;;
            *)
                "$JAVA" ${JVM_OPTS} ${QUIET} "${RESTART_SUCCESS_OPT}" ${JMX_MON} \
                 -DIGNITE_HOME="${IGNITE_HOME}" \
                -DIGNITE_PROG_NAME="$0" ${JVM_XOPTS} -cp "${CP}" ${MAIN_CLASS}
            ;;
        esac
    else
        case $osname in
            Darwin*)
                "$JAVA" ${JVM_OPTS} ${QUIET} "${DOCK_OPTS}" "${RESTART_SUCCESS_OPT}" ${JMX_MON} \
                  -DIGNITE_HOME="${IGNITE_HOME}" \
                 -DIGNITE_PROG_NAME="$0" ${JVM_XOPTS} -cp "${CP}" ${MAIN_CLASS} "${CONFIG}"
            ;;
            *)
                "$JAVA" ${JVM_OPTS} ${QUIET} "${RESTART_SUCCESS_OPT}" ${JMX_MON} \
                  -DIGNITE_HOME="${IGNITE_HOME}" \
                 -DIGNITE_PROG_NAME="$0" ${JVM_XOPTS} -cp "${CP}" ${MAIN_CLASS} "${CONFIG}"
            ;;
        esac
    fi

    ERRORCODE="$?"

    if [ ! -f "${RESTART_SUCCESS_FILE}" ] ; then
        break
    else
        rm -f "${RESTART_SUCCESS_FILE}"
    fi
done

if [ -f "${RESTART_SUCCESS_FILE}" ] ; then
    rm -f "${RESTART_SUCCESS_FILE}"
fi
