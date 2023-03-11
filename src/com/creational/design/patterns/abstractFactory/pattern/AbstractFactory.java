package com.creational.design.patterns.abstractFactory.pattern;

public interface AbstractFactory {

	Dao createDao(String type);
}
