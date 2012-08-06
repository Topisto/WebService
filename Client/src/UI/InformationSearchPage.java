package UI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javax.swing.JPanel;

import org.netbeans.spi.wizard.WizardPage;

import WebServiceClient.InformationSearchTypes;

public class InformationSearchPage extends WizardPage
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7224071823619149750L;
	private JComboBox _functionComboBox ;
	private List<String> _functionList;
	
	public InformationSearchPage() 
	{
		super( "Informationssuche" );
	    initComponents();
	}
	
	public static String getStep()
	{
		return "InformationSearchPage"; 
	}

	private void initComponents()
	{
		JPanel informationSearchPanel = new JPanel ();
		_functionList = new ArrayList<String>();
		_functionList.add( InformationSearchTypes.Abbreviation.toString() );
		_functionList.add( InformationSearchTypes.Concept.toString() );
		_functionList.add( InformationSearchTypes.Concept_Type.toString() );
		_functionList.add( InformationSearchTypes.Definition.toString());
		_functionList.add( InformationSearchTypes.Document.toString());
		_functionList.add( InformationSearchTypes.Language.toString());
		_functionList.add( InformationSearchTypes.Organization.toString());
		_functionList.add( InformationSearchTypes.Symbol.toString());
		_functionList.add( InformationSearchTypes.Term.toString());
		
		informationSearchPanel.setLayout( new java.awt.GridLayout( 2, 1 ) );
		JLabel choiceLabel = new JLabel("Auswahl:");
		informationSearchPanel.add( choiceLabel );
		
		//Create the combo box, select the item at index 0.
		_functionComboBox= new JComboBox( _functionList.toArray() );
		_functionComboBox.setPreferredSize(new Dimension(240,30));
		 informationSearchPanel.add( _functionComboBox);
	    
       add( informationSearchPanel );
	}
	
	protected String validateContents( Component comp, Object o )
	{
		if( _functionComboBox.getSelectedItem() == null  )
		{
	        return "Bitte treffen Sie eine Auswahl";
		}
	    else
	    { 
    	  WizardSettings.SetTerminologyInformation(_functionComboBox.getSelectedItem().toString());	
          return null;
	    }
	 }
 

	public static final String getDescription() 
	{
	    return "Informationssuche"; 
	}

}



