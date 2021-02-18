package com.ecolepratique.medicament2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import com.ecolepratique.medicament2.entite.Medicament;
import com.ecolepratique.medicament2.service.MedicamentServiceItf;

@SpringBootApplication
public class Medicament2Application {
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Medicament2Application.class, args);
		
		MedicamentServiceItf medicamentService = ctx.getBean(MedicamentServiceItf.class);
		
		Medicament medicament1 = new Medicament(12468L, "LEVOTHYROX"); 
		Medicament medicament2 = new Medicament(14680L, "TAHOR"); 
		Medicament medicament3 = new Medicament(24682L, "HELICIDINE"); 
		Medicament medicament4 = new Medicament(42568L, "ANTARENE"); 
		Medicament medicament5 = new Medicament(80642L, "IMODIUM"); 
		Medicament medicament6 = new Medicament(80642L, "ISIMIG"); 
		Medicament medicament7 = new Medicament(80642L, "SPEDIFEN"); 
		Medicament medicament8 = new Medicament(80642L, "IXPRIM"); 
		Medicament medicament9 = new Medicament(80642L, "FORLAX"); 
		Medicament medicament10 = new Medicament(80642L, "LAMALINE"); 
		Medicament medicament11 = new Medicament(80642L, "DAFLON"); 
		Medicament medicament12 = new Medicament(80642L, "CELESTENE"); 
		
		medicament12.addEffet("Hypokaliémie");
		medicament12.addEffet("Alcalose métabolique");
		medicament12.addEffet("Rétention hydrosodée");
		medicament12.addEffet("Hypertension artérielle");
		medicament12.addContreIndication("Herpès");
		medicament12.addContreIndication("Varicelle");
		medicament12.addContreIndication("Zona");
		medicament12.addContreIndication("Etat psychotique non contrôlé");
		
		medicament11.addEffet("Céphalée");
		medicament11.addEffet("Malaise");
		medicament11.addEffet("Diarrhée");
		medicament11.addEffet("Dyspepsie");
		medicament11.addContreIndication("Hypersensibilité flavonoïdes");
		medicament11.addContreIndication("Hypersensibilité diosmine");
		medicament11.addContreIndication("Hypersensibilité hespéridine");
		
		medicament10.addEffet("Choc anaphylactique");
		medicament10.addEffet("Oedème de Quincke");
		medicament10.addEffet("Erythème cutané");
		medicament10.addEffet("Urticaire allergique");
		medicament10.addContreIndication("Asthme");
		medicament10.addContreIndication("Grossesse");
		medicament10.addContreIndication("Allaitement");
		
		medicament9.addEffet("Diarrhée");
		medicament9.addEffet("Nausée");
		medicament9.addEffet("Vomissement");
		medicament9.addContreIndication("Hypersensibilité macrogol");
		medicament9.addContreIndication("Maladie de Crohn");
		medicament9.addContreIndication("Perforation digestive");
		
		medicament8.addEffet("Palpitation");
		medicament8.addEffet("Tachycardie");
		medicament8.addEffet("Arythmie");
		medicament8.addContreIndication("Hypersensibilité tramadol");
		medicament8.addContreIndication("Epilepsie non contrôlée");
		medicament8.addContreIndication("Grossesse");
		
		
		medicament7.addEffet("Thrombopénie");
		medicament7.addEffet("Agranulocytose");
		medicament7.addEffet("Anémie aplasique");
		medicament7.addEffet("Anémie");
		medicament7.addContreIndication("Hémorragie gastro-intestinale");
		medicament7.addContreIndication("Hémorragie cérébrovasculaire");
		medicament7.addContreIndication("Diathèse hémorragique");
		
		
		medicament5.addEffet("Céphalée");
		medicament5.addEffet("Sensation vertigineuse");
		medicament5.addEffet("Somnolence");
		medicament5.addEffet("Perte de conscience");
		medicament5.addContreIndication("Hypersensibilité lopéramide");
		medicament5.addContreIndication("Colite pseudomembraneuse");
		medicament5.addContreIndication("Intolérance au galactose");
		medicament5.addContreIndication("Déficit en lactase");
		
		medicament6.addEffet("Angioedème");
		medicament6.addEffet("Anaphylaxie");
		medicament6.addEffet("Déshydratation");
		medicament6.addEffet("Hypoglycémie");
		medicament6.addContreIndication("Pathologie cardiaque ischémique");
		medicament6.addContreIndication("Vasospasme coronarien");
		medicament6.addContreIndication("Pathologie vasculaire périphérique");
		
		medicament1.addEffet("Nausées");
		medicament1.addEffet("Maux de tête");
		medicament1.addEffet("Démangeaisons");
		medicament1.addContreIndication("Gentamicine");
		medicament1.addContreIndication("Halofantrine");
		
		medicament2.addEffet("Somnolence");
		medicament2.addEffet("Diarrhée");
		medicament2.addContreIndication("Lincomycine");
		medicament2.addContreIndication("Pindolol");
		
		medicament3.addEffet("Vision floue");
		medicament3.addEffet("Fatigue");
		medicament3.addContreIndication("Propafénone");
		medicament3.addContreIndication("Quinine");
		
		medicament4.addEffet("Somnolence");
		medicament4.addEffet("Vision floue");
		medicament4.addEffet("Eruption cutanée");
		medicament4.addContreIndication("Halofantrine");
		medicament4.addContreIndication("Pindolol");
		medicament4.addContreIndication("Quinine");
		
		medicamentService.create(medicament1);
		medicamentService.create(medicament2);
		medicamentService.create(medicament3);
		medicamentService.create(medicament4);
		medicamentService.create(medicament5);
		medicamentService.create(medicament6);
		medicamentService.create(medicament7);
		medicamentService.create(medicament8);
		medicamentService.create(medicament9);
		medicamentService.create(medicament10);
		medicamentService.create(medicament11);
		medicamentService.create(medicament12);
		
	}
	
	/*
	@Bean
	public Hibernate5Module datatypeHibernate5Module() {
		return new Hibernate5Module();
	}
	*/

}
