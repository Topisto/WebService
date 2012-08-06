package UI;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.netbeans.spi.wizard.WizardPage;

public class OntologyServicePage extends WizardPage 
{
	private static final long serialVersionUID = 4281251669860165136L;

	public OntologyServicePage() 
	{
		super( "Ontology Service" );
	    initComponents();
	}
	
	public static String getStep()
	{
		return "OntologyServicePage"; 
	}

	private void initComponents()
	{
		JPanel ontologyPanel = new JPanel ();
		ontologyPanel.add( new JLabel( "Currently not implemented" ) );
		add( ontologyPanel, BorderLayout.CENTER );
	}
	
	public static final String getDescription() 
	{
	    return "Ontology Service"; 
	}
}
