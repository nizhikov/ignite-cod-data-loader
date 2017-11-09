
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.api.model.published.instance.PublishedDocument;

 import ru.sbt.kmdtransform.TransformType.*;

 public class PublishedDocumentBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         PublishedDocument r = new PublishedDocument();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.type_DPL_id = DelimetedStringParser._long(4, line, indexes);
r.code = DelimetedStringParser.str(5, line, indexes);
r.name = DelimetedStringParser.str(6, line, indexes);
r.client_DPL_id = DelimetedStringParser._long(7, line, indexes);
r.docNum = DelimetedStringParser.str(8, line, indexes);
r.createDate = DelimetedStringParser.date(9, line, indexes);
r.receiveDate = DelimetedStringParser.date(10, line, indexes);
r.parameters_DPL_collectField = DelimetedStringParser.strBuilder(11, line, indexes);
r.issuing = DelimetedStringParser.str(12, line, indexes);
r.docScan = DelimetedStringParser.str(13, line, indexes);
r.docForm_DPL_id = DelimetedStringParser._long(14, line, indexes);
r.status_DPL_id = DelimetedStringParser._long(15, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(16, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(17, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         PublishedDocument f = (PublishedDocument)first;
         PublishedDocument s = (PublishedDocument)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.type_DPL_id, s.type_DPL_id) != 0) return CompareUtils.compare(f.type_DPL_id, s.type_DPL_id);
if (CompareUtils.compare(f.code, s.code) != 0) return CompareUtils.compare(f.code, s.code);
if (CompareUtils.compare(f.name, s.name) != 0) return CompareUtils.compare(f.name, s.name);
if (CompareUtils.compare(f.client_DPL_id, s.client_DPL_id) != 0) return CompareUtils.compare(f.client_DPL_id, s.client_DPL_id);
if (CompareUtils.compare(f.docNum, s.docNum) != 0) return CompareUtils.compare(f.docNum, s.docNum);
if (CompareUtils.compare(f.createDate, s.createDate) != 0) return CompareUtils.compare(f.createDate, s.createDate);
if (CompareUtils.compare(f.receiveDate, s.receiveDate) != 0) return CompareUtils.compare(f.receiveDate, s.receiveDate);
if (CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString()) != 0) return CompareUtils.compare(f.parameters_DPL_collectField==null ? null : f.parameters_DPL_collectField.toString(), s.parameters_DPL_collectField==null ? null : s.parameters_DPL_collectField.toString());
if (CompareUtils.compare(f.issuing, s.issuing) != 0) return CompareUtils.compare(f.issuing, s.issuing);
if (CompareUtils.compare(f.docScan, s.docScan) != 0) return CompareUtils.compare(f.docScan, s.docScan);
if (CompareUtils.compare(f.docForm_DPL_id, s.docForm_DPL_id) != 0) return CompareUtils.compare(f.docForm_DPL_id, s.docForm_DPL_id);
if (CompareUtils.compare(f.status_DPL_id, s.status_DPL_id) != 0) return CompareUtils.compare(f.status_DPL_id, s.status_DPL_id);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
