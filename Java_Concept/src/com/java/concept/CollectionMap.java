package com.java.concept;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
	public static void main(String[] args) {

		Map<Object, Object> m = new HashMap<Object, Object>();
		
		m.put(1, "java");
		m.put(1, "hello"); // over ride
		m.put(2, "hello"); // key diff
		m.put(null, "world"); // key null 
		m.put(null, null); // key , value null 
		m.put(3, null); // key based null - value accept 
		
		System.out.println(m);
		
		int a = m.size();
		System.out.println(a);
		
		boolean b =m.containsKey(3);
		System.out.println(b);

		boolean c = m.containsValue("java");
		System.out.println(c);
		
		Object d = m.get(2);
		System.out.println(d);
		
		Set<Object> e =m.keySet();
		System.out.println(e);
		
		Collection<Object> f =m.values();
		System.out.println(f);
		
		Set<Entry<Object, Object>>g = m.entrySet();
		System.out.println(g);
		
		
		
		
		
		
		
	}
}
