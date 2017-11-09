
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.MbvEvents;

 import ru.sbt.kmdtransform.TransformType.*;

 public class MbvEventsBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         MbvEvents r = new MbvEvents();
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

     @Override public int compare(Object first, Object second) {
         MbvEvents f = (MbvEvents)first;
         MbvEvents s = (MbvEvents)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id) != 0) return CompareUtils.compare(f.operationRun_DPL_id, s.operationRun_DPL_id);
if (CompareUtils.compare(f.mbveventsBalance, s.mbveventsBalance) != 0) return CompareUtils.compare(f.mbveventsBalance, s.mbveventsBalance);
if (CompareUtils.compare(f.mbveventsBirthdayNew, s.mbveventsBirthdayNew) != 0) return CompareUtils.compare(f.mbveventsBirthdayNew, s.mbveventsBirthdayNew);
if (CompareUtils.compare(f.mbveventsBirthdayOld, s.mbveventsBirthdayOld) != 0) return CompareUtils.compare(f.mbveventsBirthdayOld, s.mbveventsBirthdayOld);
if (CompareUtils.compare(f.mbvevents_branchno, s.mbvevents_branchno) != 0) return CompareUtils.compare(f.mbvevents_branchno, s.mbvevents_branchno);
if (CompareUtils.compare(f.mbveventsCreatetime, s.mbveventsCreatetime) != 0) return CompareUtils.compare(f.mbveventsCreatetime, s.mbveventsCreatetime);
if (CompareUtils.compare(f.mbveventsCurrency, s.mbveventsCurrency) != 0) return CompareUtils.compare(f.mbveventsCurrency, s.mbveventsCurrency);
if (CompareUtils.compare(f.mbveventsDbranchno, s.mbveventsDbranchno) != 0) return CompareUtils.compare(f.mbveventsDbranchno, s.mbveventsDbranchno);
if (CompareUtils.compare(f.mbveventsDoffice, s.mbveventsDoffice) != 0) return CompareUtils.compare(f.mbveventsDoffice, s.mbveventsDoffice);
if (CompareUtils.compare(f.mbveventsExceedsum, s.mbveventsExceedsum) != 0) return CompareUtils.compare(f.mbveventsExceedsum, s.mbveventsExceedsum);
if (CompareUtils.compare(f.mbveventsExternalkind, s.mbveventsExternalkind) != 0) return CompareUtils.compare(f.mbveventsExternalkind, s.mbveventsExternalkind);
if (CompareUtils.compare(f.mbveventsFnumber, s.mbveventsFnumber) != 0) return CompareUtils.compare(f.mbveventsFnumber, s.mbveventsFnumber);
if (CompareUtils.compare(f.mbveventsHiststate, s.mbveventsHiststate) != 0) return CompareUtils.compare(f.mbveventsHiststate, s.mbveventsHiststate);
if (CompareUtils.compare(f.mbveventsIdocAccH2Major, s.mbveventsIdocAccH2Major) != 0) return CompareUtils.compare(f.mbveventsIdocAccH2Major, s.mbveventsIdocAccH2Major);
if (CompareUtils.compare(f.mbveventsIdocAccH2Minor, s.mbveventsIdocAccH2Minor) != 0) return CompareUtils.compare(f.mbveventsIdocAccH2Minor, s.mbveventsIdocAccH2Minor);
if (CompareUtils.compare(f.mbveventsIsarrested, s.mbveventsIsarrested) != 0) return CompareUtils.compare(f.mbveventsIsarrested, s.mbveventsIsarrested);
if (CompareUtils.compare(f.mbveventsIsbankservcomm, s.mbveventsIsbankservcomm) != 0) return CompareUtils.compare(f.mbveventsIsbankservcomm, s.mbveventsIsbankservcomm);
if (CompareUtils.compare(f.mbveventsIsdulchanged, s.mbveventsIsdulchanged) != 0) return CompareUtils.compare(f.mbveventsIsdulchanged, s.mbveventsIsdulchanged);
if (CompareUtils.compare(f.mbveventsIsf190, s.mbveventsIsf190) != 0) return CompareUtils.compare(f.mbveventsIsf190, s.mbveventsIsf190);
if (CompareUtils.compare(f.mbveventsIsinterestchanged, s.mbveventsIsinterestchanged) != 0) return CompareUtils.compare(f.mbveventsIsinterestchanged, s.mbveventsIsinterestchanged);
if (CompareUtils.compare(f.mbveventsIsopened, s.mbveventsIsopened) != 0) return CompareUtils.compare(f.mbveventsIsopened, s.mbveventsIsopened);
if (CompareUtils.compare(f.mbveventsIspermchanged, s.mbveventsIspermchanged) != 0) return CompareUtils.compare(f.mbveventsIspermchanged, s.mbveventsIspermchanged);
if (CompareUtils.compare(f.mbveventsIssvbookdupl, s.mbveventsIssvbookdupl) != 0) return CompareUtils.compare(f.mbveventsIssvbookdupl, s.mbveventsIssvbookdupl);
if (CompareUtils.compare(f.mbveventsIsterminated, s.mbveventsIsterminated) != 0) return CompareUtils.compare(f.mbveventsIsterminated, s.mbveventsIsterminated);
if (CompareUtils.compare(f.mbveventsIsthirdpartytype, s.mbveventsIsthirdpartytype) != 0) return CompareUtils.compare(f.mbveventsIsthirdpartytype, s.mbveventsIsthirdpartytype);
if (CompareUtils.compare(f.mbveventsIsudbochanged, s.mbveventsIsudbochanged) != 0) return CompareUtils.compare(f.mbveventsIsudbochanged, s.mbveventsIsudbochanged);
if (CompareUtils.compare(f.mbveventsJrnno, s.mbveventsJrnno) != 0) return CompareUtils.compare(f.mbveventsJrnno, s.mbveventsJrnno);
if (CompareUtils.compare(f.mbvevents_office, s.mbvevents_office) != 0) return CompareUtils.compare(f.mbvevents_office, s.mbvevents_office);
if (CompareUtils.compare(f.mbveventsOldprcntrate, s.mbveventsOldprcntrate) != 0) return CompareUtils.compare(f.mbveventsOldprcntrate, s.mbveventsOldprcntrate);
if (CompareUtils.compare(f.mbveventsOpcash, s.mbveventsOpcash) != 0) return CompareUtils.compare(f.mbveventsOpcash, s.mbveventsOpcash);
if (CompareUtils.compare(f.mbveventsOpno, s.mbveventsOpno) != 0) return CompareUtils.compare(f.mbveventsOpno, s.mbveventsOpno);
if (CompareUtils.compare(f.mbveventsPersonNew, s.mbveventsPersonNew) != 0) return CompareUtils.compare(f.mbveventsPersonNew, s.mbveventsPersonNew);
if (CompareUtils.compare(f.mbveventsPersonOld, s.mbveventsPersonOld) != 0) return CompareUtils.compare(f.mbveventsPersonOld, s.mbveventsPersonOld);
if (CompareUtils.compare(f.mbveventsPrcntrate, s.mbveventsPrcntrate) != 0) return CompareUtils.compare(f.mbveventsPrcntrate, s.mbveventsPrcntrate);
if (CompareUtils.compare(f.mbveventsQcno, s.mbveventsQcno) != 0) return CompareUtils.compare(f.mbveventsQcno, s.mbveventsQcno);
if (CompareUtils.compare(f.mbveventsSscode, s.mbveventsSscode) != 0) return CompareUtils.compare(f.mbveventsSscode, s.mbveventsSscode);
if (CompareUtils.compare(f.mbveventsState, s.mbveventsState) != 0) return CompareUtils.compare(f.mbveventsState, s.mbveventsState);
if (CompareUtils.compare(f.mbveventsTransday, s.mbveventsTransday) != 0) return CompareUtils.compare(f.mbveventsTransday, s.mbveventsTransday);
if (CompareUtils.compare(f.mbveventsTurncode, s.mbveventsTurncode) != 0) return CompareUtils.compare(f.mbveventsTurncode, s.mbveventsTurncode);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
