package com.java.pratice;

public class ImplementatioN implements  FullyAbstraction2 {
	public static void main(String[] args) {
		ImplementatioN a = new ImplementatioN();
		a.subMethod();
		a.subMethod2();
		a.subMethod3();
	}

	@Override
	public void subMethod() {
		System.out.println(" ab ");
	}

	@Override
	public void subMethod2() {
		System.out.println(" ab 1");
	}

	@Override
	public void subMethod3() {
		System.out.println("ab 3");
	}
}
