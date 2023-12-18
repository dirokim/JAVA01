package com.summer.study4.util;

import java.util.Calendar;
import java.util.UUID;

public class StudyCalendar3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		//날짜더하기 1  변수에 담아 더하기
		calendar.set(2023,11,31);
		System.out.println(calendar.getTime());
		int d = calendar.get(Calendar.DATE);
		d=d+3;
		calendar.set(Calendar.DATE, d);
		System.out.println(d);
		System.out.println(calendar.getTime());
		
		//날짜 더하기 2 .add 매소드 통해 더하기
		calendar.set(2023, 11,31);	
		
//		calendar.roll(Calendar.DATE, 3);
		
		calendar.add(Calendar.DATE, 3);
		System.out.println(calendar.getTime());
		
		//UUID
		String n = UUID.randomUUID().toString();
		System.out.println(n);
	
	
	}

}
