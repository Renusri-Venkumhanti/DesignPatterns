package com.creational.design.patterns.iterator.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection c = new ProductCollection();
		c.add(new Product("Pen","10"));
		c.add(new Product("Scale","5"));
		c.add(new Product("Table","150000"));
		Iterator it = c.createIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
