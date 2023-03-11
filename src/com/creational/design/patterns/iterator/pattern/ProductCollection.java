package com.creational.design.patterns.iterator.pattern;

public class ProductCollection implements Collection {

	Product[] products = new Product[10];
	int pos=0;
	@Override
	public Iterator createIterator() {
		Iterator iterator = new ProductIterator(products);
		return iterator;
	}

	@Override
	public void add(Product pro) {
		products[pos] = pro;
		pos++;
		
	}

}
