package UI;

import java.util.Map;

import org.netbeans.spi.wizard.DeferredWizardResult;
import org.netbeans.spi.wizard.ResultProgressHandle;
import org.netbeans.spi.wizard.Summary;

import LocationService.source_identification;

public class ResultPage extends DeferredWizardResult
{
	private String _information;
		 	 
    public ResultPage ( String information )
    {
    	_information = information;
    }

    public void start (Map settings, ResultProgressHandle progress)
    {
       /*progress.setProgress ("Connection to location service", 0, 3);
       try
       {
           Thread.sleep (3000);
       }
       catch (InterruptedException ie)
       {
       }

       progress.setProgress ("Connection to terminology service", 1, 3);
       try
       {
           Thread.sleep (1000);
       }
       catch (InterruptedException ie)
       {
       }
       progress.setProgress ("Displaying result", 2, 3);
       try
       {
           Thread.sleep (2000);
       }
       catch (InterruptedException ie)
       {
       }*/

       String [] items = new String [4];
       items [0] = "Irdi: " + WizardSettings.GetIrdi();
       items [1] = "Terminology Server: " + WizardSettings.GetTerminologyServer();
       items [2] = "Request: " + WizardSettings.GetTerminologyInformation();
       items [3] = "Result: " + _information;
       progress.finished (Summary.create (items, null));
    }
}

