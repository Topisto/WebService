package UI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.netbeans.spi.wizard.WizardPage;

import ExceptionHandler.invalid_identifier_exception;
import LocationService.source_identification;
import WebServiceClient.SourceIdentificationSearch;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janßen
 * @version 1.0
 * 
 * Initialize the location service page
  */
public class LocationServicePage extends WizardPage
{
	private static final long serialVersionUID = 4008301137502406913L;
	private JTextField _raiTextField;
	private JTextField _eprTextField;
	private DefaultListModel _model;
	private JList _decisionList;

	/**
	* Constructor, which creates a new location service page. 
	*/ 
	public LocationServicePage() 
	{
		super( "Location Service" );
	    initComponents();
	}
	
	/**
	* Gets the current step.
	*
	* @return String
	*/ 
	public static String getStep()
	{
		return "LocationServicePage"; 
	}

	private void initComponents()
	{
		JPanel raiPanel = new JPanel ();
		_raiTextField = new JTextField();
		raiPanel.add( new JLabel( "Irdi" ) );
		_raiTextField = new JTextField( 40 );
		_raiTextField.setName( "raiTextField" );
		_raiTextField.setText( "0173-1" );
	    raiPanel.add( _raiTextField );
	    add( raiPanel, BorderLayout.NORTH );
	    
	    JPanel eprPanel = new JPanel();
	    _eprTextField = new JTextField();
	    eprPanel.add( new JLabel( "EPR" ) );
	    _eprTextField = new JTextField(40);
	    _eprTextField.setName( "eprTextField" );
	    _eprTextField.setText( "http://localhost:7779/axis2/services/LocationService" );
	    eprPanel.add( _eprTextField );
	    add( eprPanel );
	    
	    JPanel panel = new JPanel();	    
		_model = new DefaultListModel();
		_decisionList =  new JList(_model);
	    JScrollPane scrollPanel = new JScrollPane (_decisionList);
	    scrollPanel.setPreferredSize(new Dimension(280, 80));
	   
	    JButton searchButton = new JButton("Search");
	    searchButton.addActionListener(new ActionListener() 
	    {
	        public void actionPerformed(ActionEvent e) 
	        {
	    		try
	    	   	{
	    			SourceIdentificationSearch client = new SourceIdentificationSearch();
	    			source_identification sourceIdentification = client.GetSourceIdentification( _raiTextField.getText(), _eprTextField.getText() );
	    			WizardSettings.SetRegistrationAuthorityIdentifier(_raiTextField.getText());
	    			
	    			if( sourceIdentification != null)
	    			{
	    				if( sourceIdentification.getTerminology_server_URI() == null && 
	    						sourceIdentification.getOntology_server_URI() == null) 
	    				{
	    					 JOptionPane.showMessageDialog( null, "Der LocationService lieferte keinen Server",
	   		    				  "Error", JOptionPane.ERROR_MESSAGE);
	    				}
	    				else
	    				{
	    					if(sourceIdentification.getTerminology_server_URI() != null)
	    					{
		    					_model.add(0, sourceIdentification.getTerminology_server_URI());
	    					}
	    					if( sourceIdentification.getOntology_server_URI() != null)
	    					{	    					
	    						_model.add(1, sourceIdentification.getOntology_server_URI());
	    					}
	    				}
	    			}
	    		}
	    		catch( invalid_identifier_exception exception)
	    		{
	    		  JOptionPane.showMessageDialog( null, "Bitte geben Sie einen gültigen RegistrationAuthorityIdentifer ein: " + exception.getError_message(),
	    				  "Error", JOptionPane.ERROR_MESSAGE);
	    		}
	    		catch( Exception exception )
	    		{
	    			JOptionPane.showMessageDialog(null, exception.getMessage() + exception.getCause(), "Error", JOptionPane.ERROR_MESSAGE);
	    		} 
	        }
	      }
	    );

	    panel.add(scrollPanel);
	    panel.add(searchButton);
	    
	    add(panel, BorderLayout.SOUTH);
	}
	    
	
	protected String validateContents( Component comp, Object o )
	{
		if( _decisionList.isSelectionEmpty() )
		{
	        return "An welchen Service soll die Anfrage gehen?";
		}
	    else
	    { 
	      String service = _decisionList.getSelectedValue().toString();
	      if( service.endsWith("TerminologyService"))
	      {
	    	 WizardSettings.SetTerminologyServer(_decisionList.getSelectedValue().toString());	
	      }
	      else
	      {
	    	  WizardSettings.SetOntologyServer(_decisionList.getSelectedValue().toString());	  
	      }
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
	    return "Location Service" + getStep(); 
	}
}
