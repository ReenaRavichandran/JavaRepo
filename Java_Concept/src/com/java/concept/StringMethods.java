package com.java.concept;

public class StringMethods {
public static void main(String[] args) {
	
	String s = "welcome to java class";
	
	int a = s.length();
	System.out.println(" the length of the string :"+a );
	
	
	boolean b = s.startsWith("eelo");
	System.out.println("the string starts with :"+b);
	
	boolean c = s.endsWith("class");
	System.out.println("the string ends with :"+ c);
	
	String d = s.toUpperCase();
	System.out.println("the upper case :"+d);
	
	String e = s.toLowerCase();
	System.out.println("the lower case :"+ e);
	
	boolean f = s.equals("hello");
	System.out.println("the equals  string :"+f);
	
	String s1 = "WELCOME to java CLASS";
	boolean g =s.equalsIgnoreCase(s1);
	System.out.println("the equlas ignore case :"+g);
	
	String s2; // initialize - is empty 
	String s3 =null;
	String s4 = "";
	String s5 = " ";
	
	boolean h = s.isEmpty();
	System.out.println("the string s is empty :"+ h);
	
//	boolean i = s3.isEmpty();
//	System.out.println("the string s3 is empty :"+ i);
//	int l = s3.length();
//	System.out.println("the length of s3 :"+l);
	
	boolean j =s4.isEmpty();
	System.out.println("the string s4 is empty :"+ j);
	
	boolean k = s5.isEmpty();
	System.out.println("the string s5 is empty :"+ k);
	
	boolean l = s.contains("e");
	System.out.println("the string s contains :"+l);
	
	String s6 = "   welcome    to  java    ";
	
	String m = s6.trim();
	System.out.println("the s6 trim string :"+m);
	
	String n = s.replace("e", "$");
	System.out.println("the replaces string s :"+n);
	
	String s7 = "welCome";
	String s8 = "welcome";
	
	int o =s7.compareTo(s8);
	System.out.println("the s7 compare s8 :"+ o);
	
	int p = s5.length();
	System.out.println("the length of s5 string :" +p);
	
	
	String s9 ="hello";
	
	int r =s9.indexOf("e");
	System.out.println("the index of e is :"+r);
	
	int t = s9.lastIndexOf("l");
	System.out.println("the last index of l is :"+t);
	
	
	char u =s9.charAt(2);
	System.out.println("the 2nd charcter  :"+u);
	
	
	String q =s.repeat(3);
	System.out.println("the repeat of string s is :"+q);
	
	
	boolean v =s5.isBlank();
	System.out.println("the blank "+v);
	
	
	String w =s.concat(s9);
	System.out.println(w);
	
	
	System.out.println(s6.strip());
	
	String x = s9.substring(2);
	System.out.println("the substring of s9 :"+x);
	
	String y = s9.substring(1, 3);
	System.out.println("the sub string of s9 :"+y);
	
	
	String[] z = s9.split("");
	
	for(String  ss: z) {
		System.out.println(ss);
	}
	
	String[] sss= s.split(" ");
	
	for (String st: sss) {
		System.out.println(st);
	}
	

}
}
