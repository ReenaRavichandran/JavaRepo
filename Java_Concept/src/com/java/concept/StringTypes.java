package com.java.concept;

public class StringTypes {
public static void main(String[] args) {
	
	
	StringBuffer s = new StringBuffer("java");
	
	StringBuffer s1 = new StringBuffer("java");
	
	int a =s.hashCode();
	System.out.println(" the address of s "+ s+ " "+ a);
	
	int b =s1.hashCode();
	System.out.println(" the address of s1 "+ s1+ " "+ b);
	
	s.append(s1);
	
	int c = s.hashCode();
	System.out.println("the append address of s "+s +" "+c);
	
	System.out.println("*****************");
	
	String s2 = "welcome";
	String s3= "welcome";  // 
	
	int d = s2.hashCode();
	System.out.println(" the address of s2 "+ s2+ " "+ d);
	int e = s3.hashCode();
	System.out.println(" the address of s3 "+ s3+ " "+ e);
	
	String s4 = s2.concat(s3);
	String s5 = s2+s3;
	int f =s4.hashCode();
	System.out.println(" the address of s4 "+ s4+ " "+ f);
	
	
	String s6 = new String("java"); // class object 
	
	int g = s6.hashCode();
	System.out.println("the address of s6 "+s6 +" "+g);
	
	String s7 ="java";
	
	int h = s7.hashCode();
	System.out.println("the address of s7 "+s7 +" "+h);
	
	
}
}
