
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import com.sbt.CompareUtils;
 import ru.sbrf.gg.load.builder.ObjectBuilder;
 import com.sbt.cdm.model.extension.deposit.HsCertificate;

 import ru.sbt.kmdtransform.TransformType.*;

 public class HsCertificateBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         HsCertificate r = new HsCertificate();
         int[] indexes = new int[]{0, 0, line.length()};

         r.id = DelimetedStringParser._long(0, line, indexes);
r.objectId = DelimetedStringParser._long(0, line, indexes);
r.colocationKey = DelimetedStringParser._long(1, line, indexes);
r.rootParticle_DPL_id = DelimetedStringParser._long(2, line, indexes);
r.docInst_DPL_id = DelimetedStringParser._long(3, line, indexes);
r.addnumber = DelimetedStringParser._long(4, line, indexes);
r.area = DelimetedStringParser.bigDecimal(5, line, indexes);
r.authority = DelimetedStringParser.str(6, line, indexes);
r.bankaccount = DelimetedStringParser.str(7, line, indexes);
r.bankbic = DelimetedStringParser.str(8, line, indexes);
r.bankname = DelimetedStringParser.str(9, line, indexes);
r.docdate = DelimetedStringParser.date(10, line, indexes);
r.docnumber = DelimetedStringParser.str(11, line, indexes);
r.docoriginator = DelimetedStringParser.str(12, line, indexes);
r.execdate = DelimetedStringParser.date(13, line, indexes);
r.execorder = DelimetedStringParser.str(14, line, indexes);
r.f190number = DelimetedStringParser._long(15, line, indexes);
r.office = DelimetedStringParser._long(16, line, indexes);
r.fnumber = DelimetedStringParser._long(17, line, indexes);
r.tb = DelimetedStringParser._long(18, line, indexes);
r.isChecked = DelimetedStringParser._long(19, line, indexes);
r.hscertificateKbk = DelimetedStringParser.str(20, line, indexes);
r.kpp = DelimetedStringParser.str(21, line, indexes);
r.hscertificateOktmo = DelimetedStringParser.str(22, line, indexes);
r.branchno = DelimetedStringParser._long(23, line, indexes);
r.paymentSum = DelimetedStringParser.bigDecimal(24, line, indexes);
r.purpose = DelimetedStringParser.str(25, line, indexes);
r.recAccount = DelimetedStringParser.str(26, line, indexes);
r.recInn = DelimetedStringParser.str(27, line, indexes);
r.recName = DelimetedStringParser.str(28, line, indexes);
r.recType = DelimetedStringParser._long(29, line, indexes);
r.ssCode = DelimetedStringParser._long(30, line, indexes);
r.state = DelimetedStringParser._long(31, line, indexes);
r.town = DelimetedStringParser.str(32, line, indexes);
r.hscertificateYip = DelimetedStringParser.str(33, line, indexes);
r.hsAgreement_DPL_id = DelimetedStringParser._long(34, line, indexes);
r.category_DPL_id = DelimetedStringParser._long(36, line, indexes);
r.partition_DPL_id = DelimetedStringParser._long(37, line, indexes);

         return r;
     }

     @Override public int compare(Object first, Object second) {
         HsCertificate f = (HsCertificate)first;
         HsCertificate s = (HsCertificate)second;

         if (CompareUtils.compare(f.id, s.id) != 0) return CompareUtils.compare(f.id, s.id);
if (CompareUtils.compare(f.objectId, s.objectId) != 0) return CompareUtils.compare(f.objectId, s.objectId);
if (CompareUtils.compare(f.colocationKey, s.colocationKey) != 0) return CompareUtils.compare(f.colocationKey, s.colocationKey);
if (CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id) != 0) return CompareUtils.compare(f.rootParticle_DPL_id, s.rootParticle_DPL_id);
if (CompareUtils.compare(f.docInst_DPL_id, s.docInst_DPL_id) != 0) return CompareUtils.compare(f.docInst_DPL_id, s.docInst_DPL_id);
if (CompareUtils.compare(f.addnumber, s.addnumber) != 0) return CompareUtils.compare(f.addnumber, s.addnumber);
if (CompareUtils.compare(f.area, s.area) != 0) return CompareUtils.compare(f.area, s.area);
if (CompareUtils.compare(f.authority, s.authority) != 0) return CompareUtils.compare(f.authority, s.authority);
if (CompareUtils.compare(f.bankaccount, s.bankaccount) != 0) return CompareUtils.compare(f.bankaccount, s.bankaccount);
if (CompareUtils.compare(f.bankbic, s.bankbic) != 0) return CompareUtils.compare(f.bankbic, s.bankbic);
if (CompareUtils.compare(f.bankname, s.bankname) != 0) return CompareUtils.compare(f.bankname, s.bankname);
if (CompareUtils.compare(f.docdate, s.docdate) != 0) return CompareUtils.compare(f.docdate, s.docdate);
if (CompareUtils.compare(f.docnumber, s.docnumber) != 0) return CompareUtils.compare(f.docnumber, s.docnumber);
if (CompareUtils.compare(f.docoriginator, s.docoriginator) != 0) return CompareUtils.compare(f.docoriginator, s.docoriginator);
if (CompareUtils.compare(f.execdate, s.execdate) != 0) return CompareUtils.compare(f.execdate, s.execdate);
if (CompareUtils.compare(f.execorder, s.execorder) != 0) return CompareUtils.compare(f.execorder, s.execorder);
if (CompareUtils.compare(f.f190number, s.f190number) != 0) return CompareUtils.compare(f.f190number, s.f190number);
if (CompareUtils.compare(f.office, s.office) != 0) return CompareUtils.compare(f.office, s.office);
if (CompareUtils.compare(f.fnumber, s.fnumber) != 0) return CompareUtils.compare(f.fnumber, s.fnumber);
if (CompareUtils.compare(f.tb, s.tb) != 0) return CompareUtils.compare(f.tb, s.tb);
if (CompareUtils.compare(f.isChecked, s.isChecked) != 0) return CompareUtils.compare(f.isChecked, s.isChecked);
if (CompareUtils.compare(f.hscertificateKbk, s.hscertificateKbk) != 0) return CompareUtils.compare(f.hscertificateKbk, s.hscertificateKbk);
if (CompareUtils.compare(f.kpp, s.kpp) != 0) return CompareUtils.compare(f.kpp, s.kpp);
if (CompareUtils.compare(f.hscertificateOktmo, s.hscertificateOktmo) != 0) return CompareUtils.compare(f.hscertificateOktmo, s.hscertificateOktmo);
if (CompareUtils.compare(f.branchno, s.branchno) != 0) return CompareUtils.compare(f.branchno, s.branchno);
if (CompareUtils.compare(f.paymentSum, s.paymentSum) != 0) return CompareUtils.compare(f.paymentSum, s.paymentSum);
if (CompareUtils.compare(f.purpose, s.purpose) != 0) return CompareUtils.compare(f.purpose, s.purpose);
if (CompareUtils.compare(f.recAccount, s.recAccount) != 0) return CompareUtils.compare(f.recAccount, s.recAccount);
if (CompareUtils.compare(f.recInn, s.recInn) != 0) return CompareUtils.compare(f.recInn, s.recInn);
if (CompareUtils.compare(f.recName, s.recName) != 0) return CompareUtils.compare(f.recName, s.recName);
if (CompareUtils.compare(f.recType, s.recType) != 0) return CompareUtils.compare(f.recType, s.recType);
if (CompareUtils.compare(f.ssCode, s.ssCode) != 0) return CompareUtils.compare(f.ssCode, s.ssCode);
if (CompareUtils.compare(f.state, s.state) != 0) return CompareUtils.compare(f.state, s.state);
if (CompareUtils.compare(f.town, s.town) != 0) return CompareUtils.compare(f.town, s.town);
if (CompareUtils.compare(f.hscertificateYip, s.hscertificateYip) != 0) return CompareUtils.compare(f.hscertificateYip, s.hscertificateYip);
if (CompareUtils.compare(f.hsAgreement_DPL_id, s.hsAgreement_DPL_id) != 0) return CompareUtils.compare(f.hsAgreement_DPL_id, s.hsAgreement_DPL_id);
if (CompareUtils.compare(f.category_DPL_id, s.category_DPL_id) != 0) return CompareUtils.compare(f.category_DPL_id, s.category_DPL_id);
if (CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id) != 0) return CompareUtils.compare(f.partition_DPL_id, s.partition_DPL_id);

         return 0;
     }
 }
            
