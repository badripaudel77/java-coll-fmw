package com.ncit.coll.generics;

public class GenericsTest {

	public static void main(String[] args) {		
		GenericsExample<? extends Object> genericsString = new GenericsExample<String>("Badri Paudel", 12);
		GenericsExample<? extends Object> genericsInteger = new GenericsExample<Integer>(100, 12);
		
		genericsString.testGenerics();
		genericsInteger.testGenerics();
		
	}
}
