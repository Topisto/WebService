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
 * Initialize the initial location service page
  */
public class ClientWizard extends WizardBranchController
{
	//Ontology Service Sequence
	WizardPage[] ontologyServiceSequence = new WizardPage[] { new OntologyServicePage() };
	ResultProducer producer = new ResultProducer();
	Wizard ontologyServiceWizard = WizardPage.createWizard( ontologyServiceSequence, producer );
	
	//Terminology Service Sequence
	Wizard terminologyServiceWizard = new TerminologyServiceBranchController().createWizard();
	
	
	/**
	*Constructor, which creates a new WizardBranchController using the 
	*passed LocationServicePage instance as the initial page of the wizard. 
	*/   
	public ClientWizard() 
	{   
		super( new WizardPage[]{new LocationServicePage()}); 
	}
	
	/**
	 *Overrides getWizardStep in WizardBranchController, which get the wizard which 
	 *represents the subsequent panes after this step.
	 * 
	 * @param step: The current step the user is on in the wizard
	 * @param data: The settings map, which previous panes of the wizard have been writing information into
	 * 
	 * @return Wizard
	 */   
	public Wizard getWizardForStep (String step, Map data) 
	{
	    //The class name is the default ID for instantiated WizardPages 
		if( "UI.LocationServicePage".equals(step) ) 
		{ 
			if( WizardSettings.GetTerminologyServer() != null)
			{
				return terminologyServiceWizard; 
			}
			else
			{
				return ontologyServiceWizard; 
			}
		 } 
		return null; 
	}
}


