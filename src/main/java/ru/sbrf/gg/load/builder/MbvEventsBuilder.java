
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class MbvEventsBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.MbvEvents r = new com.sbt.cdm.model.extension.deposit.MbvEvents();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.operationRun_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.mbveventsBalance = DelimetedStringParser.bigDecimal(4, line, indexes);
r.mbveventsBirthdayNew = DelimetedStringParser.date(5, line, indexes);
r.mbveventsBirthdayOld = DelimetedStringParser.date(6, line, indexes);
r.mbvevents_branchno = DelimetedStringParser._long(7, line, indexes);
r.mbveventsCreatetime = DelimetedStringParser.date(8, line, indexes);
r.mbveventsCurrency = DelimetedStringParser._long(9, line, indexes);
r.mbveventsDbranchno = DelimetedStringParser._long(10, line, indexes);
r.mbveventsDoffice = DelimetedStringParser._long(11, line, indexes);
r.mbveventsExceedsum = DelimetedStringParser.bigDecimal(12, line, indexes);
r.mbveventsExternalkind = DelimetedStringParser._long(13, line, indexes);
r.mbveventsFnumber = DelimetedStringParser._long(14, line, indexes);
r.mbveventsHiststate = DelimetedStringParser._long(15, line, indexes);
r.mbveventsIdocAccH2Major = DelimetedStringParser._long(16, line, indexes);
r.mbveventsIdocAccH2Minor = DelimetedStringParser._long(17, line, indexes);
r.mbveventsIsarrested = DelimetedStringParser._long(18, line, indexes);
r.mbveventsIsbankservcomm = DelimetedStringParser._long(19, line, indexes);
r.mbveventsIsdulchanged = DelimetedStringParser._long(20, line, indexes);
r.mbveventsIsf190 = DelimetedStringParser._long(21, line, indexes);
r.mbveventsIsinterestchanged = DelimetedStringParser._long(22, line, indexes);
r.mbveventsIsopened = DelimetedStringParser._long(23, line, indexes);
r.mbveventsIspermchanged = DelimetedStringParser._long(24, line, indexes);
r.mbveventsIssvbookdupl = DelimetedStringParser._long(25, line, indexes);
r.mbveventsIsterminated = DelimetedStringParser._long(26, line, indexes);
r.mbveventsIsthirdpartytype = DelimetedStringParser._long(27, line, indexes);
r.mbveventsIsudbochanged = DelimetedStringParser._long(28, line, indexes);
r.mbveventsJrnno = DelimetedStringParser._long(29, line, indexes);
r.mbvevents_office = DelimetedStringParser._long(30, line, indexes);
r.mbveventsOldprcntrate = DelimetedStringParser.bigDecimal(31, line, indexes);
r.mbveventsOpcash = DelimetedStringParser.bigDecimal(32, line, indexes);
r.mbveventsOpno = DelimetedStringParser._long(33, line, indexes);
r.mbveventsPersonNew = DelimetedStringParser._long(34, line, indexes);
r.mbveventsPersonOld = DelimetedStringParser._long(35, line, indexes);
r.mbveventsPrcntrate = DelimetedStringParser.bigDecimal(36, line, indexes);
r.mbveventsQcno = DelimetedStringParser._long(37, line, indexes);
r.mbveventsSscode = DelimetedStringParser._long(38, line, indexes);
r.mbveventsState = DelimetedStringParser._long(39, line, indexes);
r.mbveventsTransday = DelimetedStringParser.date(40, line, indexes);
r.mbveventsTurncode = DelimetedStringParser._long(41, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(42, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(43, line, indexes);

         return r;
     }
 }
            
