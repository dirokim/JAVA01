package com.summer.study5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Study5Main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자입력");
		try {
			int num =sc.nextInt();
			//throw new InputMismatchException();

	
//				
//		String str = null;
//		
//		
//		System.out.println(str.toString());
		
		Test t = new Test();
		int [] arr = new int[2];
		//RuntimeException
		arr[3] = 10;
//		new ArrayIndexOutOfBoundsException();
		}catch(InputMismatchException e) {
			
		}catch(ArrayIndexOutOfBoundsException e){
			
		}catch(RuntimeException e) {
			System.out.println("Exception 발생");
		}finally {
			//예외가 발생하든 안하든 실행
		}
		System.out.println("정상 진행 ");
		
		int a = 10;
		a = a/0;
		new ArithmeticException();
		ArrayList<Integer> ar = new ArrayList<Integer>();
		t.t1(ar);
		
		System.out.println("종료 합니다");
	}

}
