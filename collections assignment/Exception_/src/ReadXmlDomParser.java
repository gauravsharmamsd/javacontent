


import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.text.Document;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ReadXmlDomParser {

  
  public static void main(String[] args) {
	  try {
      // Instantiate the Factory
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

          DocumentBuilder builder=factory.newDocumentBuilder();
		
					

        Document doc=   (Document) builder.parse("students.xml");
          System.out.println(((org.w3c.dom.Document) doc).getDocumentElement().getNodeName());
  }
		catch(Exception e) {
			
		}
		}}