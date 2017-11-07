
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedProductPartyBuilder implements ObjectBuilder {
     public static void main(String[] args) {
     }

     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.api.model.published.instance.PublishedProductParty r = new com.sbt.cdm.api.model.published.instance.PublishedProductParty();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.templObjId = DelimetedStringParser._long(3, line, indexes);
r.description_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.owner_DPL_id = DelimetedStringParser._long(6, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.code = DelimetedStringParser.str(8, line, indexes);
r.name = DelimetedStringParser.str(9, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(10, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(11, line, indexes);
r.contract_DPL_id = DelimetedStringParser._long(12, line, indexes);
r.registers_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.custServices_DPL_collectField = DelimetedStringParser.strBuilder(14, line, indexes);
r.planServices_DPL_collectField = DelimetedStringParser.strBuilder(15, line, indexes);
r.performedServices_DPL_collectField = DelimetedStringParser.strBuilder(16, line, indexes);
r.performedOperations_DPL_collectField = DelimetedStringParser.strBuilder(17, line, indexes);
r.accessTools_DPL_collectField = DelimetedStringParser.strBuilder(18, line, indexes);
r.searchIdentifier_DPL_collectField = DelimetedStringParser.strBuilder(19, line, indexes);
r.indicators_DPL_collectField = DelimetedStringParser.strBuilder(20, line, indexes);
r.tariffList_DPL_id = DelimetedStringParser._long(21, line, indexes);
r.beginDate = DelimetedStringParser.date(22, line, indexes);
r.endDate = DelimetedStringParser.date(23, line, indexes);
r.endFactDate = DelimetedStringParser.date(24, line, indexes);
r.productPartyRoles_DPL_collectField = DelimetedStringParser.strBuilder(25, line, indexes);
r.relatedProducts_DPL_collectField = DelimetedStringParser.strBuilder(26, line, indexes);
r.comment = DelimetedStringParser.str(27, line, indexes);
r.assets_DPL_collectField = DelimetedStringParser.strBuilder(28, line, indexes);
r.division_DPL_id = DelimetedStringParser._long(29, line, indexes);
r.version_DPL_id = DelimetedStringParser._long(30, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(31, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(32, line, indexes);
r.reason_DPL_id = DelimetedStringParser._long(33, line, indexes);
r.documents_DPL_collectField = DelimetedStringParser.strBuilder(34, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(35, line, indexes);

         return r;
     }
 }

