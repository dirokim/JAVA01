package com.summer.study4.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StudyCalender {

	public static void main(String[] args) {
//		Calendar calendar = new GregorianCalendar();
		Calendar calender = Calendar.getInstance();
		
		
		int year = calender.get(Calendar.YEAR);
		System.out.println(year);
		int month =calender.get(Calendar.MONTH)+1;
		System.out.println(month);
		calender.set(Calendar.YEAR, 2200);
		calender.set(Calendar.MONTH, 0);
		System.out.println(calender.getTime());

	}

}
