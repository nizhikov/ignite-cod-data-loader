
 package ru.sbrf.gg.load

 package object builder {
     val value2builder = Map[Class[_], ObjectBuilder](
         classOf[com.sbt.dpl.gridgain.AffinityParticleKey] -> new AffinityParticleKeyBuilder(),
         		classOf[com.sbt.cdm.model.extension.deposit.HsAgreement] -> new HsAgreementBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedContractLink] -> new PublishedContractLinkBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.CardServiceDebt] -> new CardServiceDebtBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.Accreditive] -> new AccreditiveBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedAccessTool] -> new PublishedAccessToolBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.DepoRelation] -> new DepoRelationBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedProductRegisterRec] -> new PublishedProductRegisterRecBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedSberBook] -> new PublishedSberBookBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.AccCloseProlong] -> new AccCloseProlongBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.PinPK] -> new PinPKBuilder(),
		classOf[com.sbt.cdm.api.model.extension.PublishedDeposit] -> new PublishedDepositBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.DepoBuild] -> new DepoBuildBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.Edbo] -> new EdboBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedContractProduct] -> new PublishedContractProductBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.CardToDepoTo] -> new CardToDepoToBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.MbvEvents] -> new MbvEventsBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedPerformedService] -> new PublishedPerformedServiceBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedProductPartyRoleInst] -> new PublishedProductPartyRoleInstBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedSignatory] -> new PublishedSignatoryBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.HistSBookNo] -> new HistSBookNoBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedDocument] -> new PublishedDocumentBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.DepoRezerv] -> new DepoRezervBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedPartyProductIdentifier] -> new PublishedPartyProductIdentifierBuilder(),
		classOf[com.sbt.cdm.api.model.extension.PublishedHsDeposit] -> new PublishedHsDepositBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedProductRegister] -> new PublishedProductRegisterBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.DepoHist] -> new DepoHistBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.HsCertificate] -> new HsCertificateBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedPerformedOperation] -> new PublishedPerformedOperationBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.DCard] -> new DCardBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedProductParty] -> new PublishedProductPartyBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedPerformedServiceParty] -> new PublishedPerformedServicePartyBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedPlasticCard] -> new PublishedPlasticCardBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedSubProcess] -> new PublishedSubProcessBuilder(),
		classOf[com.sbt.cdm.model.extension.deposit.OperDepoBuild] -> new OperDepoBuildBuilder(),
		classOf[com.sbt.cdm.api.model.published.instance.PublishedContract] -> new PublishedContractBuilder()
     )
 }
            
