package com.creational.design.patterns.iterator.pattern;

public interface Collection {

	public Iterator createIterator();
	public void add(Product pro);
}
