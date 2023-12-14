package com.summer.study4.lang;

public class StringStudy2 {
	public static void main(String[]args) {
		String name = "summer";
		System.out.println(name.indexOf(0));
		int num1 =  name.indexOf('m',4 );
		System.out.println(num1);
		int num=-1;
		boolean check = true;
		int count=0;
		while(check){
			 num = name.indexOf('m',num+1);
			if(num== -1) {
				break;
				
			}
			count++;
		}
		System.out.println(count);
	}
}
