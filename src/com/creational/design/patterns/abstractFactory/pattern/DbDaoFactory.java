package com.creational.design.patterns.abstractFactory.pattern;

public class DbDaoFactory implements AbstractFactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;
		if(type == "emp")
			dao = new DbEmpDao();
		else if(type == "dept")
			dao = new DbDeptDao();
		return dao;
	}

}
