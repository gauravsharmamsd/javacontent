package com.Attribute;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	ApplicationContext ctx=new ClassPathXmlApplicationContext("ant.xml");
	Model m=(Model) ctx.getBean("model");
}
}
