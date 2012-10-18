package UI;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.netbeans.spi.wizard.WizardPage;

/**
 *<p>Implementation of the Web service according to the ISO 29002-20</p>
 * @author Sandra Janﬂen
 * @version 1.0
 * 
 * Initialize the ontology service page
 */
public class OntologyServicePage extends WizardPage 
{
	private static final long serialVersionUID = 4281251669860165136L;

	/**
	* Constructor, which creates a new ontology service page. 
	*/ 
	public OntologyServicePage() 
	{
		super( "Ontology Service" );
	    initComponents();
	}
	
	/**
	* Gets the current step.
	*
	* @return String
	*/ 
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
	
	/**
	* Gets the description of the page.
	*
	* @return String
	*/ 
	public static final String getDescription() 
	{
	    return "Ontology Service"; 
	}
}
