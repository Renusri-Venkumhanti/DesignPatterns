package com.creational.design.patterns.singleton.pattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		// TODO Auto-generated method stub

		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = null;
		Constructor[] declaredConstructor = SingletonClass.class.getDeclaredConstructors();
		for (Constructor constructor : declaredConstructor) {
			//this will break the private constructor accessability and allows to access private constructor 
			constructor.setAccessible(true);
			try {
				// because of above statement the new object can be created though the constructor is private
				instance2= (SingletonClass) constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (instance1 == instance2)
			System.out.println("Singleton class");
		else
			System.out.println(" Not a singleton class");
		
	}

}
