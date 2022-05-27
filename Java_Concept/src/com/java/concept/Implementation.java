package com.java.concept;

public class Implementation extends PartialAbstraction{

	@Override
	public void abstractMethod() {
		System.out.println(" i am abstract method ");
	}

	
	public static void main(String[] args) {
		
		Implementation a = new Implementation();
		
		a.abstractMethod();
		a.nonAbstractMethod();
		
		
		
		
	}
	
	
	
	
	
}
