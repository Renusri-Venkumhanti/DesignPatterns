package com.creational.design.patterns.abstractFactory.pattern;

public class AbstractProvider {
	
	public static AbstractFactory createFctory(String type) {
		AbstractFactory fac = null;
		if(type == "xml")
			fac = new XmlDaoFactory();
		else if (type == "db")
			fac = new DbDaoFactory();
		
		return fac;
	}

}
