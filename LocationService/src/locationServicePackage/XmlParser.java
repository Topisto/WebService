package locationServicePackage;

import ExceptionHandler.implementation_exception;
import LocationService.source_identification;

import java.io.File;
import javax.xml.namespace.QName;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.Document;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.*;

/**
 * This class searches for a provided regration authority identifier for terminology and ontology server 
 * in the ProductOntologyProvider.xml (which is located in „%AppData%\WebServce\LocationService)
*/
public class XmlParser
{
	private String _registrationAuthorityIdentifier;
	private String _xmlFile;
	private Document _xmlDocument;
	private XPath xPath;
	
	protected XmlParser( String registrationAuthorityIdentifier ) throws implementation_exception
	{
		_registrationAuthorityIdentifier = registrationAuthorityIdentifier;
		_xmlFile = GetXmlPath();	
		InitObjects();
	}
	
	/**
	 * Initialize XmlDocument and XPath for parsing through the given XML file
	*/
	private void InitObjects() throws implementation_exception
    {        
        try 
        {
            _xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(_xmlFile);            
            xPath =  XPathFactory.newInstance().newXPath();
        } 
        catch( Exception exception )
        {
        	throw new implementation_exception( String.format("ErrorMessage: %n Stacktrace: %n", exception.getMessage(), exception.getStackTrace()), 0 ) ;
        }
      }
	
	/**
	 * Returns all URI of the given registration authority identifier as SourceIdentification object
	 * @return SourceIdentification 
	 * @throws implementation_exception 
	*/
	 protected source_identification GetSourceIdentificationList() throws implementation_exception
	{
		try
		{
			source_identification identification = new source_identification();
			identification.setRA_ref(_registrationAuthorityIdentifier);		
			identification.setTerminology_server_URI(FindServerUri( "TerminologyServer"));
			identification.setOntology_server_URI(FindServerUri( "OntologyServer"));
		   return identification;
		}
		catch( Exception exception )
		{
			throw new implementation_exception( String.format("ErrorMessage: %n Stacktrace: %n", exception.getMessage(), exception.getStackTrace()), 1 ) ;
		}
	}
	
	/**
	 * Returns the URI of the given server which corresponds to the registration authority identifier
	 * If an empty string is provided, the first found server is returned 
	 * @return String 
	 * @throws implementation_exception 
	*/
	 protected String FindServerUri( String expression ) throws implementation_exception
	{
		String serverExpression = String.format( "/LocationService/Suppliers/%s/Supplier", expression );
        NodeList serverNodeList = (NodeList) Read( serverExpression, XPathConstants.NODESET);
             
        for( int index = 1; index <= serverNodeList.getLength(); index++ )
        {
        	String idExpression = String.format( "/LocationService/Suppliers/%s/Supplier[%d]/@Id", expression, index );
        	String readResult =  (String) Read( idExpression, XPathConstants.STRING);
        	
        	if( readResult.equals( _registrationAuthorityIdentifier ) )
        	{
        		 String uriExpression = String.format( "/LocationService/Suppliers/%s/Supplier[%d]/@Uri", expression, index );
        		 return (String) Read( uriExpression, XPathConstants.STRING);
        	}
        }
        
       return null;
	}
	
	
	/**
	 * Returns the xml node of the given expression
	 * @return Object 
	 * @throws implementation_exception 
	*/
	 private Object Read( String expression, QName returnType ) throws implementation_exception
    {
        try 
        {
            XPathExpression xPathExpression = xPath.compile(expression);
	        return xPathExpression.evaluate( _xmlDocument, returnType );
        } 
        catch( Exception exception )
        {
        	throw new implementation_exception( String.format("ErrorMessage: %n Stacktrace: %n", exception.getMessage(), exception.getStackTrace()), 2 ) ;
        }
    }

		
	/**
	 * Returns the path to the ProductOntologyProvider.xml („%AppData%\WebServce\LocationService)
	 * @return XML path as string
	*/
    private String GetXmlPath()
	{
	    File appDataFile = new File(System.getenv("APPDATA"));
	    File xmlFile = new File( appDataFile, "WebService\\LocationService\\ProductOntologyProvider.xml");
	    return xmlFile.getPath();
	}
}
