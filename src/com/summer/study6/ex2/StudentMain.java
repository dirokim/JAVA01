package com.summer.study6.ex2;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentDAO studentdao = new StudentDAO();
		try {
			studentdao.getstudent();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
