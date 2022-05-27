package com.java.concept;

public class Hybrid1 implements Hybrid2,Hybrid3 {

	@Override
	public void submethod1() {
		System.out.println("parent 1");
	}

	@Override
	public void submethod() {
		System.out.println(" parent 2");
	}
	
	public void submethod3() {
		System.out.println(" child ");
	}

}
