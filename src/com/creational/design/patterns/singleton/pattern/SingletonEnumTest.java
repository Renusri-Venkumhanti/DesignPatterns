package com.creational.design.patterns.singleton.pattern;

public class SingletonEnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//only one object will be created no matter how may times we call this. No other way to use reflection utils as there is no concept of constructors in enum
		SingletonEnum en = SingletonEnum.INSTANCE;
		System.out.println( en.getName());
		en.setName("Renu");
		System.out.println(en.getName());
		System.out.println(en.hashCode());
		System.out.println(SingletonEnum.INSTANCE.hashCode());
	}

}
