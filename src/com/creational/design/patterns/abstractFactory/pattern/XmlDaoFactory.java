package com.creational.design.patterns.abstractFactory.pattern;

public class XmlDaoFactory implements AbstractFactory {

	@Override
	public Dao createDao(String type) {
		Dao dao = null;
		if(type == "emp")
			dao = new XmlEmpDao();
		else if(type == "dept")
			dao = new XmlDeptDao();
		return dao;
	}

}
