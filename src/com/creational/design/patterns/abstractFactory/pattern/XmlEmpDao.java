package com.creational.design.patterns.abstractFactory.pattern;

public class XmlEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Save to XML emp");
	}

}
