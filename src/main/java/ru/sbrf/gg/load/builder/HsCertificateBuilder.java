
 package ru.sbrf.gg.load.builder;

 import ru.sbrf.gg.load.TableInfo;
 import com.sbt.DelimetedStringParser;
 import ru.sbrf.gg.load.builder.ObjectBuilder;

 import ru.sbt.kmdtransform.TransformType.*;

 public class HsCertificateBuilder implements ObjectBuilder {
     @Override public Object build(String line, TableInfo tableInfo) {
         com.sbt.cdm.model.extension.deposit.HsCertificate r = new com.sbt.cdm.model.extension.deposit.HsCertificate();
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
 }
            
