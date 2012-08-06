package UI;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.netbeans.spi.wizard.WizardPage;

import LocationService.source_identification;
import WebServiceClient.Communication;

public class LocationServicePage extends WizardPage
{
	private static final long serialVersionUID = 4008301137502406913L;
	private JTextField _raiTextField;
	private JTextField _eprTextField;
	private DefaultListModel _model;

	private JList _decisionList;

	public LocationServicePage() 
	{
		super( "Location Service" );
	    initComponents();
	}
	
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
		_raiTextField.setText( "0173-1#01-AAF577#3" );
	    WizardSettings.SetIrdi("0173-1#01-AAF577#3" );
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
	    			Communication client = new Communication();
	    			source_identification sourceIdentification = client.GetSourceIdentification( _raiTextField.getText(), _eprTextField.getText() );
	    			if( sourceIdentification != null)
	    			{
		    			_model.add(0, sourceIdentification.getTerminologyServer());
		    			_model.add(1, sourceIdentification.getOntologyServer());
	    			}
	    			
	    		}
	    		catch( Exception exception )
	    		{
	    			JOptionPane.showMessageDialog(null, exception.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
	
	public static final String getDescription() 
	{
	    return "Location Service" + getStep(); 
	}
}
