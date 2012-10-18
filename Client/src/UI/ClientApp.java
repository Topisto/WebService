package UI;

import java.awt.Rectangle;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import org.netbeans.api.wizard.WizardDisplayer;
import org.netbeans.spi.wizard.Wizard;

import WebServiceLogging.WebServiceLogger;


/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janßen
 * @version 1.0
 * 
 * Main-class: Starts the client application
  */
public class ClientApp
{
	/**
	 * Main-method: Initializes the logger and creates the client wizard application
	 * 
	 * @param args
	 * @throws exception
	 */
	public static void main(String[] args) throws Exception 
	{
	    try 
	    {
	    	WebServiceLogger.Log("ClientApp.java", "main", "Start application");
		    UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
			ClientWizard brancher = new ClientWizard(); 
			Wizard wizard = brancher.createWizard();
			WizardDisplayer.showWizard( wizard, new Rectangle( 650, 300 )); 
			System.exit(0);
		} 
	    catch (SecurityException e) 
	    {
	    	JOptionPane.showMessageDialog(null, "Ein Security Manager erlaubt die Erzeugung des Logfiles nicht, bzw. " +
	    			"hat die Applikation nicht genügend Rechte.", "Error", JOptionPane.ERROR_MESSAGE);
	    	
	    } 
	    catch( Exception e)
	    {
	    	JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
}
