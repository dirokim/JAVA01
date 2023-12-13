package com.summer.study3.ex;

public class View {

	
	
	
	//목록
	public void list(Data [] datas) {
		System.out.println("목록");
		if(datas==null) {
			System.out.println("값 x");
		}else {
		for(int i=0;i<datas.length;i++) {
			System.out.println("번호 : "+datas[i].getNumber());
			System.out.println("회사 : "+datas[i].getCompany());
			System.out.println("이름 : "+datas[i].getName());
			System.out.println("=============================");
			
		}
		}
	}
	//디테일 
	public void detail(Data [] datas) {
		System.out.println("목록");
		for(int i=0;i<datas.length;i++) {
			System.out.println("번호 : "+datas[i].getNumber());
			System.out.println("회사 : "+datas[i].getCompany());
			System.out.println("이름 : "+datas[i].getName());
			System.out.println("직책 : "+datas[i].getPosition());
			System.out.println("폰번호 : "+datas[i].getPhone());
			System.out.println("이메일 : "+datas[i].getEmail());
			System.out.println("주소 : "+datas[i].getAddress());
		}
	}
	
}
