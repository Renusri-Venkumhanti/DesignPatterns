package com.creational.design.patterns.singleton.pattern;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// TODO Auto-generated method stub

		SingletonClass instance1 = SingletonClass.getInstance();
		SingletonClass instance2 = SingletonClass.getInstance1();
		System.out.println(SingletonClass.getInstance1().hashCode()+"  "+instance1.hashCode());
		if (instance1 == instance2)
			System.out.println("Singleton class");
		else
			System.out.println(" Not a singleton class");
		//singleton with Serialization 
		SingletonWithSerialization instance3 = SingletonWithSerialization.getInstance();
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("E://DSA/singleton/example.ser")));
		oos.writeObject(instance3);
		
		
		ObjectInputStream ois =new ObjectInputStream(new FileInputStream(new File("E://DSA/singleton/example.ser")));
		SingletonWithSerialization instance4 = (SingletonWithSerialization) ois.readObject();
		
		System.out.println(instance3.hashCode()+"  "+instance4.hashCode());
		
		if (instance3 == instance4)
			System.out.println("Singleton class");
		else
			System.out.println(" Not a singleton class");

		oos.close();ois.close();
	}

}
