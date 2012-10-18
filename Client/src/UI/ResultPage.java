package UI;

import java.util.Map;

import javax.swing.JTable;

import org.netbeans.spi.wizard.DeferredWizardResult;
import org.netbeans.spi.wizard.ResultProgressHandle;
import org.netbeans.spi.wizard.Summary;

import TerminologyModel.abbreviation_Type;
import TerminologyModel.definition_Type;
import TerminologyModel.language_Type;
import TerminologyModel.term_Type;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Initialize the result page
 */
public class ResultPage extends DeferredWizardResult 
{
	private Object _information;
	
	/**
	* The constructor initialize the result object.
	* 
	* @param information: Result of the search.
	*/ 
    public ResultPage ( Object information )
    {
    	_information = information;
    }
    
    public ResultPage (  )
    {
    }

        
	/**
	* Formats the result of the search into a user-friendly table.
	* 
    * @param settings - The settings gathered over the course of the wizard
    * @param progress - A handle which can be used to affect the progress bar. Progress 
    * bar is not used in this case. 
    */ 
    public void start (Map settings, ResultProgressHandle progress)
    {
    	String[] columnNames = {"Object", "Value"};
     	JTable table = null;
    	
    	switch( WizardSettings.GetTerminologyInformationSearchType())
    	{
	    	case Abbreviation:
	    	{
	    		abbreviation_Type abbreviation = (abbreviation_Type) _information;
		    	Object[][] data = {{"Abbreviation", abbreviation.getContent()}};
			    table = new JTable(data, columnNames); 
			    break;
	    	}
	    	case Definition:
	    	{
	    		definition_Type definition = (definition_Type) _information;
		    	Object[][] data = {{"Definition", definition.getContent()}};
			    table = new JTable(data, columnNames); 
			    break;
	    	}
    	  	case Language:
	    	{
	    	   language_Type language = (language_Type) _information;
	    	   Object[][] data = {
	    			  {"CountryCode", language.getCountryCode()},
	    			  {"LanguageCode", language.getLanguageCode()}
	    	  };
	    	   table = new JTable(data, columnNames); 
	       	  break;
	    	}	
    	  	case Term:
	    	{
	    	   term_Type term = (term_Type) _information;
	    	   Object[][] data = {
	    			  {"Term", term.getContent()},
	    			  {"Abbreviation", term.getAbbreviation().getContent()}
	    	  };
	    	   table = new JTable(data, columnNames); 
	       	  break;
	    	}
    	  	default:
	    	{
		      Object[][] data = { {"Ergebnis", String.format("Der Task %s ist nicht implementiert.", 
		    		  WizardSettings.GetTerminologyInformationSearchType())}
		      };
			  table = new JTable(data, columnNames); 
	    	}
    	}
    	
       progress.finished (Summary.create (table, null));
    }
}

