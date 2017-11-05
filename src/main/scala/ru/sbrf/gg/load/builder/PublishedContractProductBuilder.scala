
 package ru.sbrf.gg.load.builder

 import ru.sbrf.gg.load.TableInfo
 import ru.sbt.kmdtransform.TransformType._

 class PublishedContractProductBuilder extends ObjectBuilder {
     def build(line: Array[String], tableInfo: TableInfo): Any = {
         val r = new com.sbt.cdm.api.model.published.instance.PublishedContractProduct()

         r.id = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.objectId = LONG.fromStr(line(0)).asInstanceOf[java.lang.Long]
r.colocationKey = LONG.fromStr(line(1)).asInstanceOf[java.lang.Long]
r.rootParticle_DPL_id = LONG.fromStr(line(2)).asInstanceOf[java.lang.Long]
r.contract_DPL_id = LONG.fromStr(line(4)).asInstanceOf[java.lang.Long]
r.product_DPL_id = LONG.fromStr(line(5)).asInstanceOf[java.lang.Long]
r.code = STRING.fromStr(line(6)).asInstanceOf[java.lang.String]
r.productRoleType_DPL_id = LONG.fromStr(line(7)).asInstanceOf[java.lang.Long]
r.name = STRING.fromStr(line(8)).asInstanceOf[java.lang.String]
r.lawConditions_DPL_collectField = CSL_AFFINITYPARTICLES.fromStr(line(9)).asInstanceOf[java.lang.StringBuilder]
r.printForm_DPL_id = LONG.fromStr(line(10)).asInstanceOf[java.lang.Long]
r.category_DPL_id = LONG.fromStr(line(11)).asInstanceOf[java.lang.Long]
r.partition_DPL_id = LONG.fromStr(line(12)).asInstanceOf[java.lang.Long]

         r
     }
 }
            
