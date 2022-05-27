package com.java.concept;

public class ImplementationInterface implements FullyAbstraction2 {

	@Override
	public void abstractMethod() {
		System.out.println(" abstract method");
	}

	@Override
	public void abstractMethod2() {
		System.out.println(" abstract method 2");
	}

	public static void main(String[] args) {

		ImplementationInterface a = new ImplementationInterface();

		a.abstractMethod();
		a.abstractMethod2();
		a.abstractMethod3();

	}

	@Override
	public void abstractMethod3() {
		System.out.println(" i am absractmethod ");
	}

}
