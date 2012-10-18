package UI;

import java.util.Map;

import javax.swing.JOptionPane;

import org.netbeans.spi.wizard.WizardException;
import org.netbeans.spi.wizard.WizardPage.WizardResultProducer;

import WebServiceClient.InformationSearchFactory;
import WebServiceClient.InformationSearchRequest;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * This class starts the search request
 */
public class ResultProducer implements WizardResultProducer
{
	/**
	* Creates a request in the InformationSearchFactory and provide the result.
	* 
    * @param wizardData: Thee map with key-value pairs which has been 
    * populated by the UI as the user progressed through the wizard.  
    * 
    * @throws WizardException
    * @return Object
    */ 
	public Object finish (Map wizardData) throws WizardException
	{
		try
	   	{
			InformationSearchRequest request = InformationSearchFactory.CreateRequest(WizardSettings.GetTerminologyInformationSearchType(),  
					WizardSettings.GetIrdi(), WizardSettings.GetTerminologyServer());
			Object result = (Object) request.SendRequest();
			return new ResultPage( result );
		}
		catch( Exception exception )
		{
			JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		} 
		return null;
	}

	/**
	* Allow the user to cancel the wizard.
	* 
    * @param settings: The settings gathered over the course of the wizard. 
    * 
    * @return boolean
    */ 
   public boolean cancel (Map settings)
   {
      return true;
   }
}
