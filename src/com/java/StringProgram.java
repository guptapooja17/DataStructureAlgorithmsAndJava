package com.java;

public class StringProgram {
	public static void main (String[] arg) {

		String s1 = "abc";
		String s2 = "abc";
		System.out.println((s1 == s2) ? true : false);
		System.out.println((s1.equals(s2)) ? true : false);    //check the content of string/string object.
		System.out.println("___________________________");

		String objs1 = new String("abc");
		String objs2 = new String("abc");
		System.out.println((objs1 == objs2) ? true : false);
		System.out.println((objs1.equals(objs2)) ? true : false);
		System.out.println("___________________________");

		System.out.println((objs1 == s1) ? true : false);
		System.out.println((objs1.equals(s1)) ? true : false);
		System.out.println("___________________________");

		String s = "DataScience";
		String s3 = new String("DataScience");
		String objs3 = new String("DataScience").intern(); //puts the string into  STRING POOL or refer another string literal from STRING POOL having the same value.
		System.out.println((s == objs3) ? true : false);
		System.out.println((s3 == objs3) ? true : false);
	}
}
