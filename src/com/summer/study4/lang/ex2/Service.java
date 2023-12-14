package com.summer.study4.lang.ex2;

public class Service {
	
	
	public void gender(String sum) {
		char ch = sum.charAt(7);
		if(ch=='1'||ch=='3') {
			System.out.println("남자입니다.");
		}else if(ch=='2'||ch=='4') {
			System.out.println("여자입니다.");
		}
			
		}
		
	public void age(String sum) {
		int result=0;
		
		String sum1 = sum.substring(0,2);
		int sum3= Integer.parseInt(sum1);
		String sum2 = sum.substring(7, 8);
		System.out.println(sum2);
		
		if(sum2=="1"||sum2=="2") {
			result=2023-(1900+sum3);
		}else if (sum2=="3"||sum2=="4") {
			result=2023-(2000+sum3);
		}
		System.out.println(result);
	}
	
	public void weather(String sum) {
		String sum1 = sum.substring(2,4);
		int sum11 = Integer.parseInt(sum1);
		if(sum11>2&&sum11<6) {
			System.out.println("태어난 계절은 봄입니다.");
		}else if(sum11>5&&sum11<8) {
			System.out.println("태어난 계절은 여름입니다.");
		}else if(sum11>7&&sum11<11) {
			System.out.println("태어난 계절은 가을입니다.");	
		}else {
			System.out.println("태어난 계절은 겨울입니다.");
		}
	
	}
	public void tadang(String sum) {
		int j = 2;
		int val=0;
		String [] num1 = sum.split("");
		for(int i=0;i<num1.length;i++) {
		val += Integer.parseInt(num1[i])*j;
			j++;
			if(j>9) {
				j=2;
			}
			}
		val= val%11-11;
		int val2=0;
		int result = Integer.parseInt(num1[num1.length]) -val;
		if(result>10) {
			val2= result%10;
			if(val2==result) {
				System.out.println("일치합니다");
			}else {
				System.out.println("불일치합니다");
			}
		}else {
			if(val2==result) {
				System.out.println("일치합니다");
			}else {
				System.out.println("불일치합니다");
			}
			
		}
		
	}
			
	}

