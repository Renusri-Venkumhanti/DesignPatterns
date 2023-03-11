package com.creational.design.patterns.singleton.pattern;

import java.io.Serializable;

public class SingletonWithSerialization implements Serializable,Cloneable{
	
	private static final long serialVersionUID = 1L;
	private static SingletonWithSerialization instance;
	
	private SingletonWithSerialization()
	{
	}
	
	public static SingletonWithSerialization getInstance() {
		if(instance == null) {
			instance = new SingletonWithSerialization();
		}
		return instance; 
	}
	//overriding this method is internally called by object input stream while deserializing . So we are making sure to return same object without creating new object while deserializing 
	protected Object readResolve() {
		return instance;		
	}
	
	//if any class extending our singleton class and inside that class clone is called to get the super.clone(). We don't want our singleton class object to be cloned. 
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
}
