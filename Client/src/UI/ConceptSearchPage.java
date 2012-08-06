package UI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.netbeans.spi.wizard.WizardPage;

public class ConceptSearchPage extends WizardPage
{
	private static final long serialVersionUID = 4730865874986279606L;

	public ConceptSearchPage() 
	{
		super( "Konzeptsuche" );
	    initComponents();
	}
	
	public static String getStep()
	{
		return "ConceptSearchPage"; 
	}

	private void initComponents()
	{
		JPanel ontologyPanel = new JPanel ();
		ontologyPanel.add( new JLabel( "Currently not implemented" ) );
		add( ontologyPanel, BorderLayout.CENTER );
	}
	
	public static final String getDescription() 
	{
	    return "Konzeptsuche"; 
	}
}
