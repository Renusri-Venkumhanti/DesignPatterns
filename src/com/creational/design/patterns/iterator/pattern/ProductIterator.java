package com.creational.design.patterns.iterator.pattern;

public class ProductIterator implements Iterator {

	Product[] products;
	int pos=0;
	public ProductIterator(Product[] products) {
		this.products = products;
	}
	@Override
	public boolean hasNext() {
		if(pos>=products.length || products[pos]== null)
			return false;
		return true;
	}

	@Override
	public Product next() {
		Product pro = products[pos];
		pos++;
		return pro;
	}

}
