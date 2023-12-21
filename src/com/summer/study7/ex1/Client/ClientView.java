package com.summer.study7.ex1.Client;

public class ClientView {

	//view 날씨정보 출력 
	
	public void view(String str) {
	
		 String[]ar;
		ar = str.split(",");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]+ar[i+1]+ar[i+2]+ar[i+3]);
			i+=3;
		}	
	}
	
	public void view2(String str) {
				System.out.println(str);
			
	}
}
