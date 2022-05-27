package com.java.concept;

public class Child_Class extends Single_ParentClass {

	private void child_Property() {
		System.out.println("child class property 1");
	}

	public static void main(String[] args) {

		Child_Class a = new Child_Class();
		a.sub_Method();
		a.sub_Method2();
		a.child_Property();

	}

}
