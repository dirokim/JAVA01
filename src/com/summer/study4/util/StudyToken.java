package com.summer.study4.util;

import java.util.StringTokenizer;

public class StudyToken {

	public static void main(String[] args) {
	String str="서울-10-비-80-부산-25-맑음-50-대구-82-눈-12-제주-25-태풍-75";
	
	String sum ;
	StringTokenizer st = new StringTokenizer(str,"-");
	int count = st.countTokens();

	
	ArrayList<Weather> ar = new AraayList<>();
	
	
	
	while(st.hasMoreTokens()) {
		String value =st.nextToken();
		System.out.println(value);
	}
	}

}
