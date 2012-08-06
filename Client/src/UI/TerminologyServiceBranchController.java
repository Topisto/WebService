package UI;

import java.util.Map;

import org.netbeans.spi.wizard.Wizard;
import org.netbeans.spi.wizard.WizardBranchController;
import org.netbeans.spi.wizard.WizardPage;

import LocationService.source_identification;

public class TerminologyServiceBranchController extends WizardBranchController
{
	//Information Search Sequence
	ResultProducer producer = new ResultProducer();
	WizardPage[] informationSearchSequence = new WizardPage[] { new InformationSearchPage() };
	Wizard informationSearchWizard = WizardPage.createWizard( informationSearchSequence, producer );
		
	//Concept Search Sequence
	WizardPage[] conceptSearchSequence = new WizardPage[] { new ConceptSearchPage() };
	Wizard conceptSearchWizard = WizardPage.createWizard( conceptSearchSequence, producer );
		
		
	TerminologyServiceBranchController()
	{
		super (new WizardPage[] { new TerminologyServiceChoicePage() }); 
	}
		
	public Wizard getWizardForStep (String step, Map data) 
	{ 
		if ("UI.TerminologyServiceChoicePage".equals(step)) 
		{ 
			if (Boolean.TRUE.equals(data.get("Informationssuche"))) 
			{ 
				return informationSearchWizard;
			} 
			else 
			{ 
				return conceptSearchWizard;
			} 
		} 
		return null; 
	} 
}
