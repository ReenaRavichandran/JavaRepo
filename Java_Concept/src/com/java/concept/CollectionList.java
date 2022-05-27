package com.java.concept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class CollectionList {
	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<Object>(); // upcasting
		// syntax : list<object> l = new list<object>(); // interface 
		// no object  creation 
		l.add(1);
		l.add(1);
		l.add(78);	
		System.out.println(l);	
		l.add(89);
		l.add(99);	
		System.out.println(l);	
		l.add("java");
		l.add(false);
		l.add(2.3);
		l.add('a');	
		System.out.println(l);
		int a = l.size();
		System.out.println(a);	
		l.add(7, "python");
		System.out.println(l);	
		l.remove(6); // index 
		System.out.println(l);
		
		l.remove("java"); // value 
		System.out.println(l);
		
		l.set(1, 2);
		System.out.println(l);
		
		Object b = l.get(5); // index pass - value get 
		System.out.println(b);
		
		int c = l.indexOf("python"); //value pass-index get
		System.out.println(c);
		
		boolean d =l.contains('a');
		System.out.println(d);
		
		boolean e = l.isEmpty();
		System.out.println(e);
		
		l.clear();
		System.out.println(l);
		
		boolean f = l.isEmpty();
		System.out.println(f);
		
		l.add(23);
		l.add(89);
		l.add(77);
		l.add(11);
		
		System.out.println(l);
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(23);
		l1.add(89);
		l1.add(33);
		
		boolean g =l.equals(l1);
		System.out.println(g);
		
		l.addAll(l1);	 // add 
		System.out.println(l);
//		System.out.println(l1);
		
//		l.retainAll(l1); // common 
//		System.out.println(l);
		
		
//		l.removeAll(l1); // uncommon 
//		System.out.println(l);
		
		
//		for(int i = 0; i<l.size();i++) {
//			System.out.println(l.get(i));
//		}
		ListIterator<Object> i = l.listIterator();
		
//		Object k =i.next();
//		System.out.println(k);
//		boolean m= i.hasNext();
//		System.out.println(m);
//		Object k1 =i.next();
//		System.out.println(k1);
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(l1);
		// insertion - list -ascending
		// Collections - class  - sort - method 
		// list - ascending print 
		Collections.sort(l1);
		System.out.println(l1);
		
		
		
	}
}
