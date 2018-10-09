package com.java.delotte.api;

public class Stringdemo {

	public static void main(String[] args) {
		String s1 = "Java Programming Language";
		System.out.println(s1);
		System.out.println(s1.length());
		System.out.println(s1.charAt(9));
		System.out.println(s1.indexOf("a"));
		System.out.println(s1.lastIndexOf("a"));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.hashCode());
		
		s1=s1+", Created by Sarmistha.";
		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println(s1.substring(10));
		System.out.println(s1.substring(10,12));
		
		String a="JAVA";
		String b="MAVA";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.contains("aa"));
		System.out.println(a.startsWith("JA"));
		System.out.println(a.startsWith("JA",2));
		System.out.println(a.endsWith("A"));
		String s3="  ";
		System.out.println(s3.isEmpty());	
		System.out.println(a.startsWith("JA",0));
		System.out.println(s3.trim().isEmpty());
		a="java";
		b="java";
		String c = new String("java");
		if(a==b)
		{
			System.out.println("a is equal to b");
		}
		else
		{
			System.out.println("a not equal to b");
		}
		if(a==c)
		{
			System.out.println("a is equal to c");
		}
		else
		{
			System.out.println("a not equal to c");
		}
		c=c.intern();
		if(a==c)
		{
			System.out.println("a is equal to c");
		}
		else
		{
			System.out.println("a not equal to c");
		}
		// TODO Auto-generated method stub

	}

}
