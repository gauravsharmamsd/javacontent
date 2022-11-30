//package com.rkit;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ExceptionHandler {
	String key;
	XMLUtlility x=new XMLUtlility();
    public void handle(String className,String method,Exception e) {
    	 key=className+"#"+method+"#"+e.getClass().getSimpleName();
    	System.out.println("key is   "+key);
    	String []actions=x.searchActionsForAKey(key);
    	for(String actionName:actions) {
    		Action action =null;
    		try {
    			action=(Action)Class.forName(actionName).newInstance();
    			action.takeAction();
    		} 
    		catch(InstantiationException | IllegalAccessException|ClassNotFoundException e1) {
    			e1.printStackTrace();
    		}
    	}
    }
		
	}

