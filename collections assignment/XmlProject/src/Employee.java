//package com.rkit;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
public class Employee {
	@XmlElement(name = "FIRST_NAME")
	private String fname;
	@XmlAttribute(name = "EMP_ID")
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String lname;
	private Department dept;
	private String designation;
	//@XmlElementWrapper(name = "DOMAINS")
	@XmlList
	private List<String> domain;//InsuranceDomain , Heatcare, Logistics
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<String> getDomain() {
		return domain;
	}
	public void setDomain(List<String> projects) {
		this.domain = projects;
	}
	

}

/* We are going to use library function provided inside those Jars that you just added 
 * to your BuildPath(Classpath)
 * Those Jars have done all the heavy lifting that you have been doing since yday
 * Use our brain . At least that much
 * We are going to create object of Employee , set all its properties
 * and directly create XMLin just 2 lines.
 * 1. Create(Write) XML by using Object (Marshalling)
 * 2. Get Object from an XML(Unmarshalling)
 * Need to use some annotations given by third party library called JAXB
 * JAXB : Java Architecture for XML Binding 
 * This defines some rules for using it
 * 
 * 
 */ 
