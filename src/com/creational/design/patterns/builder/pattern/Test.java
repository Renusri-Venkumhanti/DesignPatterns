package com.creational.design.patterns.builder.pattern;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HttpClient hc = new HttpClient.HttpClientBuilder().method("Put").secret("Renu", "123").body("{}").build();

		System.out.println(hc);
	}

}
