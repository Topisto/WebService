package UI;

import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

import org.netbeans.spi.wizard.WizardPage;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janßen
 * @version 1.0
 * 
 * This class initialize the terminology service choice page. 
 */
public class TerminologyServiceChoicePage  extends WizardPage
{
	private static final long serialVersionUID = -5441250714861932867L;
	private JRadioButton _jRadioButtonInformationSearch;
    private JRadioButton _jRadioButtonConceptSearch;
    
	/**
	* Constructor, which creates a new terminology service search page. 
	*/ 
	public TerminologyServiceChoicePage() 
	{
		super( "Terminology Service Auswahl" );
	    initComponents();
	}
	
	/**
	* Gets the current step.
	*
	* @return String
	*/ 
	public static String getStep()
	{
		return "TerminologyServiceChoice"; 
	}

	private void initComponents()
	{
	    ButtonGroup buttonGroup = new javax.swing.ButtonGroup();
	    _jRadioButtonInformationSearch = new javax.swing.JRadioButton();
	    _jRadioButtonConceptSearch = new javax.swing.JRadioButton();

	    setLayout( new java.awt.GridLayout( 2, 1 ) );

	    buttonGroup.add(_jRadioButtonInformationSearch);
	    _jRadioButtonInformationSearch.setText( "Informationssuche" );
	    _jRadioButtonInformationSearch.setMargin( new java.awt.Insets(0, 0, 0, 0) );
	    _jRadioButtonInformationSearch.setName( "Informationssuche" );
	    add( _jRadioButtonInformationSearch );

	    buttonGroup.add(_jRadioButtonConceptSearch);
	    _jRadioButtonConceptSearch.setText( "Konzeptsuche" );
	    _jRadioButtonConceptSearch.setMargin(new java.awt.Insets(0, 0, 0, 0));
	    _jRadioButtonConceptSearch.setName( "Konzeptsuche" );
	    add( _jRadioButtonConceptSearch );
	}
	
	protected String validateContents( Component comp, Object o )
	{
		if( !_jRadioButtonInformationSearch.isSelected() && !_jRadioButtonConceptSearch.isSelected() )
		{
	          return "Ein Konzept oder Informationen über ein Konzept suchen?";
		}
	    else
	    {    	
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
	    return "Konzept- oder Informationssuche?" + getStep(); 
	}

}
