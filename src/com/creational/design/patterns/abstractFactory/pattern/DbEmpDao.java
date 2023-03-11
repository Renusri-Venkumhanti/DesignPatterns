package com.creational.design.patterns.abstractFactory.pattern;

public class DbEmpDao implements Dao {

	@Override
	public void save() {
		System.out.println("Save to DB emp");
		
	}

}
