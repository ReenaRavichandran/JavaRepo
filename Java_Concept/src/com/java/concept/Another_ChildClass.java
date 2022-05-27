package com.java.concept;

public class Another_ChildClass extends Single_ParentClass {

	private void another_SubMethod() {
		System.out.println("another child class property ");
	}

	public static void main(String[] args) {

		Another_ChildClass a = new Another_ChildClass();

		a.sub_Method();
		a.sub_Method2();
		a.another_SubMethod();

	}
}
