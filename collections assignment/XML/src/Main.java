import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Main {


	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException{  
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document doc = builder.parse("products.xml");//document is a Tree , Nodes
			Node rootNode = doc.getDocumentElement();
			System.out.println("Name of root node is "+rootNode.getNodeName());
			//Get All Classes
			NodeList classNodes = rootNode.getChildNodes();	
			for(int i=0; i< classNodes.getLength();i++) {
				Node node = classNodes.item(i);
				if(node.getNodeType()==Node.ELEMENT_NODE) {
					System.out.println(node.getNodeName());
					System.out.println(".....................");
					//String className = ((Element)node).getNodeName());
					NamedNodeMap attrMap=node.getAttributes();
					for(int j=0; j< attrMap.getLength();j++) {
						Node attr=attrMap.item(j);
					System.out.println(attr.getNodeName());
				System.out.println(attr.getNodeValue());
					}
					//get nodes of node
					NodeList orderNodes = node.getChildNodes();	
					for(int i1=0; i1< orderNodes.getLength();i1++) {
					Node order = orderNodes.item(i1);
						if(order.getNodeType()==Node.ELEMENT_NODE) {
							System.out.println(order.getNodeName());
							System.out.println(".....................");
							//String className = ((Element)node).getNodeName());
							NamedNodeMap orderAtMap=order.getAttributes();
							for(int j=0; j< orderAtMap.getLength();j++) {
								Node orderAttribute=orderAtMap.item(j);
						System.out.println(orderAttribute.getNodeName());
						System.out.println(orderAttribute.getNodeValue());
							}
							NodeList miniorderNodes = order.getChildNodes();	
							for(int m=0; m< miniorderNodes.getLength();m++) {
							Node miniorder = miniorderNodes.item(m);
								if(miniorder.getNodeType()==Node.ELEMENT_NODE) {
									System.out.println(miniorder.getNodeName());
									System.out.println(".....................");
									//String className = ((Element)node).getNodeName());
									NamedNodeMap miniorderAtMap=miniorder.getAttributes();
									for(int j=0; j< miniorderAtMap.getLength();j++) {
										Node miniorderAttribute=miniorderAtMap.item(j);
								System.out.println(miniorderAttribute.getNodeName());
								System.out.println(miniorderAttribute.getNodeValue());
									}
							//
							
					
				}}}
						}}}
			


				

	}}

