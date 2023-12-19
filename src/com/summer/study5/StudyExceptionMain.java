package com.summer.study5;

public class StudyExceptionMain {
	public static void main(String[]args) {
		
		StudyException se = new StudyException();
		
		try {
			se.t2();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
