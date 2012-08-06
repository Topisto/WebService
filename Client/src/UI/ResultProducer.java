package UI;

import java.util.Map;

import javax.swing.JOptionPane;

import org.netbeans.spi.wizard.WizardException;
import org.netbeans.spi.wizard.WizardPage.WizardResultProducer;

import LocationService.source_identification;
import WebServiceClient.Communication;

public class ResultProducer implements WizardResultProducer
{
	public Object finish (Map wizardData) throws WizardException
	{
		try
	   	{
			Communication client = new Communication();
			String information = client.GetTerminologyInformation( WizardSettings.GetIrdi(), 
					WizardSettings.GetTerminologyServer(), WizardSettings.GetTerminologyInformation() );
			return new ResultPage( information );
		}
		catch( Exception exception )
		{
			JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		} 
		return null;
	}

   public boolean cancel (Map settings)
   {
      return true; // Allow the user to cancel the wizard.
   }
}
