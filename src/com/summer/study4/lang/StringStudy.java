package com.summer.study4.lang;

import java.util.Scanner;

public class StringStudy {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1==obj2);
		
		
		
		String str = new String();
		String str2 = "";
		String name ="summer";
		String name2 = "summer";
		System.out.println(name == name2);
		String name3=sc.next();
		System.out.println(name.equals(name3));
		
		
		
		
		char ad = name.charAt(1);
		System.out.println(ad);
		for(int i=0;i<name.length();i++){
			System.out.println(name.charAt(i));
		}
		String n = "abc";
		String n2 = "123";
		String n3;
		n3 = n+n2;
		System.out.println(n3);
		
	}
}
