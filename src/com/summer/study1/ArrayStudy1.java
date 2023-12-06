package com.summer.study1;

import java.util.Scanner;

public class ArrayStudy1 {
	public static void main(String[]args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int [] ar = new int[3];
		System.out.println(ar);
		//배열 사용 => 배열 변수명 [index number]
		ar[0] = 5;
		ar[1] = 7;
		ar[2] = 9;
		
		String [] names = new String[4];

		for(int i=0;i<names.length;i++) {
			names[i]=sc.next();
		}
		
		
	}
}
