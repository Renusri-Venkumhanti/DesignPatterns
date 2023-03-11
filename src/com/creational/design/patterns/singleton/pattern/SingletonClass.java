package com.creational.design.patterns.singleton.pattern;

public class SingletonClass {
	private static volatile SingletonClass instance;
	// for eager initialization 
	//private static SingletonClass instance = new SingletonClass();
	//get rid of if block in getInstance method
	
	//other way of intialization is having static block 
	//
	//static {
	//instance = new SingletonClass();
	//}
	
	private SingletonClass() {
	}
	//to handle multiple instances creation during multithreading , synchronized keyword is usred 
	// this is lazy initialization as the instance will be created only when getInstanceMethod is called
	public static synchronized SingletonClass getInstance() {
		
		if(instance ==null)
			instance = new SingletonClass();
		return instance;
	}
	
	//other way to handle multithreading is by using synchronized block
	public static SingletonClass getInstance1() {
		
		if(instance ==null)
			synchronized(SingletonClass.class) {
				if(instance ==null)
				instance = new SingletonClass();
			}
		return instance;
	}
}
