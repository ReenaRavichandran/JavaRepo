package com.java.pratice;

public class StringNonPrimitive {
public static void main(String[] args) {
	
	String s = "Java";
	
	int a = s.length();
	System.out.println(a);
	
	String b =s.toUpperCase();
	System.out.println(b);
	
	String c =s.toLowerCase();
	System.out.println(c);
	
	boolean d=s.startsWith("j");
	System.out.println(d);
	
	boolean e =s.endsWith("a");
	System.out.println(e);
	
	boolean f =s.equals("jav");
	System.out.println(f);
	
	boolean g =s.equalsIgnoreCase("JAVA");
	System.out.println(g);
	
	char h =s.charAt(2);
	System.out.println(h);
	
	
	int i =s.indexOf("a");
	System.out.println(i);
	
	int j =s.lastIndexOf("a");
	System.out.println(j);
	
	boolean k=s.contains("z");
	System.out.println(k);
	
	String s1 = "welcome";
	int l =s.compareTo(s1);
	System.out.println(l);
	
	boolean m = s.isEmpty();
	System.out.println(m);
	
	String s2="";
	System.out.println(s2.isEmpty());
	
	String s3= " ";
	System.out.println(s3.isBlank());
	
	String s4= "   welcome to java  class   ";
	System.out.println(s4.trim());
	
	String n =s.replace("a", "*");
	System.out.println(n);
	
	String o =s.concat(s1);
	System.out.println(o);
	
	
	String[] p = s.split("a");
	
	for(String q : p) {
		System.out.println(q);
	}
	// value - index 
	// value - index , length-1 (index) 
	String r= s.substring(1,3);
	System.out.println(r);
	
	String t =s.repeat(3);
	System.out.println(t);
	
}
}
