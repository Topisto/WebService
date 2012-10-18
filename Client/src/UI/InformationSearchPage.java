package UI;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.netbeans.spi.wizard.WizardPage;

import TerminologyModel.InformationSearchTypes;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Initialize the initial information search page
  */
public class InformationSearchPage extends WizardPage
{
	private static final long serialVersionUID = 7224071823619149750L;
	private JComboBox _functionComboBox;
	private JTextField _irdiTextField;
	private JLabel _irdiLabel;
	
	private HashMap<String, String> _functionMap;
	
	/**
	*Constructor, which creates a new information search page. 
	*/ 
	public InformationSearchPage() 
	{
		super( "Informationssuche" );
	    initComponents();
	}
	
	/**
	* Gets the current step.
	*
	* @return String
	*/ 
	public static String getStep()
	{
		return "InformationSearchPage"; 
	}

	private void initComponents()
	{
		JPanel informationSearchPanel = new JPanel ();
		_functionMap = new HashMap<String, String>();
		_functionMap.put( InformationSearchTypes.Abbreviation.toString(), "Abbreviation_ID" );
		_functionMap.put( InformationSearchTypes.Concept.toString(), "Concept_ID" );
		_functionMap.put( InformationSearchTypes.Concept_Type.toString(), "Concept_Type_ID" );
		_functionMap.put( InformationSearchTypes.Definition.toString(), "Definition_ID" );
		_functionMap.put( InformationSearchTypes.Document.toString(), "Document_ID" );
		_functionMap.put( InformationSearchTypes.Language.toString(), "Language_ID" );
		_functionMap.put( InformationSearchTypes.Organization.toString(), "Organization_ID" );
		_functionMap.put( InformationSearchTypes.Symbol.toString(), "Symbol_ID" );
		_functionMap.put( InformationSearchTypes.Term.toString(), "Term_ID" );
		
		informationSearchPanel.setLayout( new java.awt.GridLayout( 2, 1 ) );
		JLabel choiceLabel = new JLabel("Auswahl");
		informationSearchPanel.add( choiceLabel );
		
		//Create the combo box, select the item at index 0.
		_functionComboBox= new JComboBox( _functionMap.keySet().toArray() );
		_functionComboBox.setSelectedIndex(0);
		ActionListener comboBoxActionListener = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				JComboBox cb = (JComboBox)e.getSource();
				String name = (String)cb.getSelectedItem();
				UpdateUI( name );
			}
		};
		_functionComboBox.addActionListener(comboBoxActionListener);
		  informationSearchPanel.add( _functionComboBox);
		 
		 //Create the text box
		 _irdiLabel = new JLabel("Abbreviation_Id");
		 informationSearchPanel.add( _irdiLabel );
		 _irdiTextField = new JTextField( 20 );
		 _irdiTextField.setText( "0173-1#01-AAF577#3" );
		 informationSearchPanel.add( _irdiTextField );
		 add( informationSearchPanel );
	}
	
	/**
	* When a new item in the combo box is selected, the page displays a new description text for 
	* irdi which has to be inserted.
	*
	* @param name: The item in the combo box
	*/ 
    public void UpdateUI( String name )
    {
      	if( _functionMap.containsKey(  _functionComboBox.getSelectedItem() ) )
    	{
    		_irdiLabel.setText(  (String) _functionMap.get(  _functionComboBox.getSelectedItem() ) );
    	}
    }
	
	protected String validateContents( Component comp, Object o )
	{
		if( _functionComboBox.getSelectedItem() == null  )
		{
	        return "Bitte treffen Sie eine Auswahl";
		}
	    else
	    { 
	     switch( _functionComboBox.getSelectedItem().toString() )
	     {
	     	case 	"Abbreviation":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Abbreviation);	
	     		 break;
	     	}
	     	case 	"Concept":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Concept);	
	     		 break;
	     	}
	     	case 	"Concept_Deep":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Concept_Deep);	
	     		 break;
	     	}
	     	case 	"Concept_Equivalence_Relationship":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Concept_Equivalence_Relationship);	
	     		 break;
	     	}
	     	case 	"Concept_Type":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Concept_Type);	
	     		 break;
	     	}
	     	case 	"Definition":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Definition);	
	     		 break;
	     	}
	     	case 	"Document":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Document);	
	     		 break;
	     	}
	     	case 	"File_Representation":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.File_Representation);	
	     		 break;
	     	}
	     	case 	"Graphic_File_Url":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Graphic_File_Url);	
	     		 break;
	     	}	
	     	case 	"Image":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Image);	
	     		 break;
	     	}	
	     	case 	"Language":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Language);	
	     		 break;
	     	}	
	     	case 	"Organization":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Organization);	
	     		 break;
	     	}	
	     	case 	"Symbol":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Symbol);	
	     		 break;
	     	}
	     	case 	"Term":
	     	{
	     		 WizardSettings.SetTerminologyInformationSearchType(InformationSearchTypes.Term);	
	     		 break;
	     	}
	     	default:
	     	{
	     		break;
	     	}
	     }
	     	
    	  WizardSettings.SetIrdi(_irdiTextField.getText());	
          return null;
	    }
	 }
 
	/**
	* Gets the description of the page.
	*
	* @return String
	*/ 
	public static final String getDescription() 
	{
	    return "Informationssuche"; 
	}

}



