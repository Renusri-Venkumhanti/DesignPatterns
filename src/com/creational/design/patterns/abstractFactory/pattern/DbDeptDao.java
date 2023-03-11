package com.creational.design.patterns.abstractFactory.pattern;

public class DbDeptDao implements Dao {

	@Override
	public void save(){
		System.out.println("Save to DB dept ");
	}

}
