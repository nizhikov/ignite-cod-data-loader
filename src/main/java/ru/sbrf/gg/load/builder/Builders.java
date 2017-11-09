
 package ru.sbrf.gg.load.builder;

 import java.util.Map;
 import java.util.HashMap;

 public class Builders {
     public static Map<Class<?>, ObjectBuilder> builders = new HashMap<>();
     static {
         builders.put(com.sbt.dpl.gridgain.AffinityParticleKey.class, new AffinityParticleKeyBuilder());
         		builders.put(com.sbt.cdm.model.extension.deposit.DepoRezerv.class, new DepoRezervBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedProductPartyRoleInst.class, new PublishedProductPartyRoleInstBuilder());
		builders.put(com.sbt.cdm.api.model.extension.PublishedHsDeposit.class, new PublishedHsDepositBuilder());
		builders.put(com.sbt.cdm.api.model.extension.PublishedDeposit.class, new PublishedDepositBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.CardServiceDebt.class, new CardServiceDebtBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.DepoBuild.class, new DepoBuildBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.HistSBookNo.class, new HistSBookNoBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.DepoRelation.class, new DepoRelationBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.PinPK.class, new PinPKBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedSberBook.class, new PublishedSberBookBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.AccCloseProlong.class, new AccCloseProlongBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedAccessTool.class, new PublishedAccessToolBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedPerformedService.class, new PublishedPerformedServiceBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.DCard.class, new DCardBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedContract.class, new PublishedContractBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.DepoHist.class, new DepoHistBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedPerformedServiceParty.class, new PublishedPerformedServicePartyBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedProductRegisterRec.class, new PublishedProductRegisterRecBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.MbvEvents.class, new MbvEventsBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedSubProcess.class, new PublishedSubProcessBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedPlasticCard.class, new PublishedPlasticCardBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.CardToDepoTo.class, new CardToDepoToBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.Accreditive.class, new AccreditiveBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.HsAgreement.class, new HsAgreementBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedContractProduct.class, new PublishedContractProductBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedPerformedOperation.class, new PublishedPerformedOperationBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedProductRegister.class, new PublishedProductRegisterBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.Edbo.class, new EdboBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedSignatory.class, new PublishedSignatoryBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedProductParty.class, new PublishedProductPartyBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedDocument.class, new PublishedDocumentBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.HsCertificate.class, new HsCertificateBuilder());
		builders.put(com.sbt.cdm.model.extension.deposit.OperDepoBuild.class, new OperDepoBuildBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedPartyProductIdentifier.class, new PublishedPartyProductIdentifierBuilder());
		builders.put(com.sbt.cdm.api.model.published.instance.PublishedContractLink.class, new PublishedContractLinkBuilder());
     }
 }
