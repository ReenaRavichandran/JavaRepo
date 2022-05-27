package com.java.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
public class CollectionList {
	public static void main(String[] args) {
		// object creation 
//	ArrayList<String> l = new ArrayList<String>();
	// parent              // child 	
	List<Object> a = new ArrayList<Object>(); // upcasting 
	
	a.add(23);
	a.add(45);
	a.add("java");
	
	System.out.println(a);
	
	int s = a.size();
	System.out.println(s);
	
	a.add(false);
	a.add(77);
	
	System.out.println(a);
	
	a.remove(1);
	System.out.println(a);
	
	a.add(2,89.67);
	
	System.out.println(a);
	
	int b =a.indexOf("java");
	System.out.println(b);
	
	Object c =a.get(3);
	System.out.println(c);
	
	a.set(3, true);
	
	System.out.println(a);
	
	boolean d =a.contains(23);
	System.out.println(d);
	
	
	boolean e = a.isEmpty();
	System.out.println(e);
	
	a.clear();
	
	System.out.println(a);
	
	int j =a.size();
	System.out.println(j);
	
	a.add(90);
	a.add("java");
	a.add('a');
	
	List<Integer> a1 = new ArrayList<Integer>();
	
	a1.add(100);
	a1.add(89);
	a1.add(90);
	
//	a.addAll(a1);
	
//	a.retainAll(a1);
	
//	a.removeAll(a1);
//	System.out.println(a);
	System.out.println(a1);
	Collections.sort(a1);
	System.out.println(a1);
	
	
	Set<Object> se = new LinkedHashSet<Object>();
	
	
	}
}
