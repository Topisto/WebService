package UI;

import java.util.Map;

import org.netbeans.spi.wizard.Wizard;
import org.netbeans.spi.wizard.WizardBranchController;
import org.netbeans.spi.wizard.WizardPage;


public class ClientWizard extends WizardBranchController
{
	//Ontology Service Sequence
	WizardPage[] ontologyServiceSequence = new WizardPage[] { new OntologyServicePage() };
	ResultProducer producer = new ResultProducer();
	Wizard ontologyServiceWizard = WizardPage.createWizard( ontologyServiceSequence, producer );
	
	//Terminology Service Sequence
	Wizard terminologyServiceWizard = new TerminologyServiceBranchController().createWizard();
	
	public ClientWizard() 
	{   
		super( new WizardPage[]{new LocationServicePage()}); 
	}
	   
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


