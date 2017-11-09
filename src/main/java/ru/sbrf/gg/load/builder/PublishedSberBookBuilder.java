
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedSberBook;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedSberBookBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedSberBook r = new PublishedSberBook();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.product_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.accessToolType_DPL_id = DelimetedStringParser._long(5, line, indexes);
r.code = DelimetedStringParser.str(6, line, indexes);
r.name = DelimetedStringParser.str(7, line, indexes);
r.dateRelease = DelimetedStringParser.date(8, line, indexes);
r.beginDate = DelimetedStringParser.date(9, line, indexes);
r.endDate = DelimetedStringParser.date(10, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(11, line, indexes);
r.states_DPL_collectField = DelimetedStringParser.strBuilder(12, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(13, line, indexes);
r.numberMask = DelimetedStringParser.str(14, line, indexes);
r.dupsBookNum = DelimetedStringParser._int(15, line, indexes);
r.lineNum = DelimetedStringParser._int(16, line, indexes);
r.unseenOpCnt = DelimetedStringParser._int(17, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(18, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(19, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedSberBook f = (PublishedSberBook)first;
         PublishedSberBook s = (PublishedSberBook)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.product_DPL_id, s.product_DPL_id) != 0) return CompareUtils.compare(f.product_DPL_id, s.product_DPL_id);
if (CompareUtils.compare(f.accessToolType_DPL_id, s.accessToolType_DPL_id) != 0) return CompareUtils.compare(f.accessToolType_DPL_id, s.accessToolType_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.dateRelease, s.dateRelease) != 0) return CompareUtils.compare(f.dateRelease, s.dateRelease);
if (CompareUtils.compare(f.beginDate, s.beginDate) != 0) return CompareUtils.compare(f.beginDate, s.beginDate);
if (CompareUtils.compare(f.endDate, s.endDate) != 0) return CompareUtils.compare(f.endDate, s.endDate);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.states_DPL_collectField==null ? null : f.states_DPL_collectField.toString(), s.states_DPL_collectField==null ? null : s.states_DPL_collectField.toString());
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.numberMask, s.numberMask) != 0) return CompareUtils.compare(f.numberMask, s.numberMask);
if (CompareUtils.compare(f.dupsBookNum, s.dupsBookNum) != 0) return CompareUtils.compare(f.dupsBookNum, s.dupsBookNum);
if (CompareUtils.compare(f.lineNum, s.lineNum) != 0) return CompareUtils.compare(f.lineNum, s.lineNum);
if (CompareUtils.compare(f.unseenOpCnt, s.unseenOpCnt) != 0) return CompareUtils.compare(f.unseenOpCnt, s.unseenOpCnt);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
