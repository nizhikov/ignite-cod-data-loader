
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class EdboBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.model.extension.deposit.Edbo()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.agreementInst_DPL_id = LONG.fromStr(line(3)).asInstanceOf[java.lang.Long]
r.edboBranchNo = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.edboClerkKod = LONG.fromStr(line(5)).asInstanceOf[java.lang.Long]
r.edboFormBranch = LONG.fromStr(line(6)).asInstanceOf[java.lang.Long]
r.edboEmail = STRING.fromStr(line(7)).asInstanceOf[java.lang.String]
r.edboTb = LONG.fromStr(line(8)).asInstanceOf[java.lang.Long]
r.edboMobOper = STRING.fromStr(line(9)).asInstanceOf[java.lang.String]
r.edboMobPhone = STRING.fromStr(line(10)).asInstanceOf[java.lang.String]
r.edboOffice = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.edboPhone = STRING.fromStr(line(12)).asInstanceOf[java.lang.String]
r.edboState = LONG.fromStr(line(13)).asInstanceOf[java.lang.Long]
r.edboTypeMessage = LONG.fromStr(line(14)).asInstanceOf[java.lang.Long]
r.edboTypeSbnkd = LONG.fromStr(line(15)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(16)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(17)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
