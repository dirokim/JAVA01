package com.summer.study3.ex;

import java.util.Scanner;

public class Function {
	Scanner sc = new Scanner(System.in);
	
	//추가
	public Data [] add(Data[]datas) {
		System.out.println("1.데이터 추가");
		Data data = new Data();
		System.out.println("1.번호는 무엇입니까 ?");
		data.setNumber(sc.nextInt());	
		System.out.println("1.회사이름은 무엇입니까 ?");
		data.setCompany(sc.next());	
		System.out.println("1.이름은 무엇입니까 ?");
		data.setName(sc.next());	
		System.out.println("1.직책은 무엇입니까 ?");
		data.setPosition(sc.next());	
		System.out.println("1.번호는 무엇입니까 ?");
		data.setPhone(sc.next());
		System.out.println("1.이메일은 무엇입니까 ?");
		data.setEmail(sc.next());
		System.out.println("1.주소는 무엇입니까 ?");
		data.setAddress(sc.next());	
		
		
		if(datas==null) {
			Data [] newdatas =new Data[1];
			newdatas[0] = data;
			return newdatas;
		}else {
		Data [] newdatas = new Data[datas.length+1];
	
		for(int i=0;i<datas.length;i++) {	
			newdatas[i]=datas[i];
			}
		newdatas[datas.length] = data;			
			return newdatas;
		}
	}
	
	//삭제
	
	public Data[] minus( Data[] datas) {
		System.out.println("삭제할 번호는 무엇입니까?");
		int num = sc.nextInt();

		Data [] newdatas = new Data[datas.length-1];
		
		for(int i=0;i<datas.length;i++) {
			if(num != datas[i].getNumber()) {
				newdatas[i]=datas[i];
			
			}
				
		}
		
		return newdatas;
		
	}
	
	
	
	
}
