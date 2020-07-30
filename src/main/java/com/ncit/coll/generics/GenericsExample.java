package com.ncit.coll.generics;

/*
   1) generics enable types (classes and interfaces) to be parameters 
   when defining classes, interfaces and methods.
   
   2) Stronger type checks at compile time.
     A Java compiler applies strong type checking to generic code and issues errors if the code violates type safety. 
     Fixing compile-time errors is easier than fixing runtime errors, which can be difficult to find.
     
   List list = new ArrayList();
   list.add("hello");
   String s = (String) list.get(0); 
   
   When re-written to use generics, the code does not require casting:
     List<String> list = new ArrayList<String>();
     list.add("hello");
     String s = list.get(0);   // no cast  
*/

public class GenericsExample<A> {

	private A a;
		
	private int number;

	public GenericsExample(A a, int number) {
		this.number = number;
		this.a = a;
	}
	

	public void testGenerics() {
		System.out.println(this.a + " , " + this.number);
	}
}

