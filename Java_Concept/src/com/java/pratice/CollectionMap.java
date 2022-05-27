package com.java.pratice;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
public static void main(String[] args) {
	
	Map<String, Integer> m = new LinkedHashMap<String, Integer>();
	
	m.put("a", 1);
	m.put("a", 2);
	m.put("b", 1);
	m.put(null, 3);
	m.put("c", null);
	
	System.out.println(m);
	
	
	int a = m.size();
	System.out.println(a);
	
	boolean ck = m.containsKey("a");
	System.out.println(ck);
	
	boolean cv = m.containsValue(88);
	System.out.println(cv);
	
	int g = m.get("b");
	System.out.println(g);
	
	Set<String> ss = m.keySet();
	System.out.println(ss);
	
	Collection<Integer> vv  = m.values();
	System.out.println(vv);
	
	Set<Entry<String, Integer>>  en = m.entrySet();
	System.out.println(en);
	
}
}
