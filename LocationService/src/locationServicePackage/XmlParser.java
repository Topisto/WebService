package locationServicePackage;

import ExceptionHandler.ImplementationException;
import Irdi.RegistrationAuthorityIdentifier;
import LocationService.source_identification;

import java.io.File;
import javax.xml.namespace.QName;
import javax.xml.parsers.*;
import javax.xml.xpath.*;
import org.w3c.dom.Document;
import javax.xml.xpath.XPathConstants;
import org.w3c.dom.*;

public class XmlParser
{
	private String _registrationAuthorityIdentifier;
	private String _xmlFile;
	private Document _xmlDocument;
	private XPath xPath;
	
	protected XmlParser( RegistrationAuthorityIdentifier registrationAuthorityIdentifier ) throws ImplementationException
	{
		_registrationAuthorityIdentifier = registrationAuthorityIdentifier.getRegistrationAuthorityIdentifierValue();
		_xmlFile = GetXmlPath();	
		InitObjects();
	}
	
	/**
	 * Initialize objects for parsing through the given XML file
	*/
	private void InitObjects() throws ImplementationException
    {        
        try 
        {
            _xmlDocument = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(_xmlFile);            
            xPath =  XPathFactory.newInstance().newXPath();
        } 
        catch( Exception exception )
        {
           throw new ImplementationException( exception.getMessage(), exception.getStackTrace().toString());
        }
      }
	
	/**
	 * Returns all URI of the given registration authority identifier as SourceIdentification object
	 * @return SourceIdentification 
	 * @throws ImplementationException 
	*/
	 protected source_identification GetSourceIdentificationList() throws ImplementationException
	{
		try
		{
			String terminologyServerURI = FindServerUri( "TerminologyServer");
			String ontologyServerURI = FindServerUri( "OntologyServer");
     		return new source_identification( _registrationAuthorityIdentifier, terminologyServerURI, ontologyServerURI );
		}
		catch( Exception exception )
		{
			throw new ImplementationException( exception.getMessage(), exception.getStackTrace().toString());
		}
	}
	
	/**
	 * Returns the URI of the given server which corresponds to the registration authority identifier
	 * If an empty string is provided, the first found server is returned 
	 * @return String 
	 * @throws ImplementationException 
	*/
	 protected String FindServerUri( String expression ) throws ImplementationException
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
	 * @throws ImplementationException 
	*/
	 private Object Read( String expression, QName returnType ) throws ImplementationException
    {
        try 
        {
            XPathExpression xPathExpression = xPath.compile(expression);
	        return xPathExpression.evaluate( _xmlDocument, returnType );
        } 
        catch( Exception exception )
        {
        	throw new ImplementationException( exception.getMessage(), exception.getStackTrace().toString());
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
