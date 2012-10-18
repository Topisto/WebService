package UI;

import java.util.Map;

import org.netbeans.spi.wizard.Wizard;
import org.netbeans.spi.wizard.WizardBranchController;
import org.netbeans.spi.wizard.WizardPage;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class creates the wizard branch: information search or concept search. 
 */
public class TerminologyServiceBranchController extends WizardBranchController
{
	//Information Search Sequence
	ResultProducer producer = new ResultProducer();
	
	WizardPage[] informationSearchSequence = new WizardPage[] { new InformationSearchPage() };
	Wizard informationSearchWizard = WizardPage.createWizard( informationSearchSequence, producer );
		
	//Concept Search Sequence
	WizardPage[] conceptSearchSequence = new WizardPage[] { new ConceptSearchPage() };
	Wizard conceptSearchWizard = WizardPage.createWizard( conceptSearchSequence, producer );
		
	/**
	*Constructor, which creates a new WizardBranchController using the 
	*passed TerminologyServiceChoicePage instance as the initial page of the wizard. 
	*/ 		
	public TerminologyServiceBranchController()
	{
		super (new WizardPage[] { new TerminologyServiceChoicePage() }); 
	}

	/**
	*Overrides getWizardForStep in the WizardBranchController, which gets the wizard 
	*which represents the subsequent panes after this step.  
	*
	*@return Wizard
	*/ 	
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
