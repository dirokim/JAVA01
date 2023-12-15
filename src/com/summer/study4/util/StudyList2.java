package com.summer.study4.util;

import java.util.ArrayList;

public class StudyList2 {
public static void main(String[]args) {
//	ArrayList<> ar = new ArrayList();
	ArrayList<Object> ar = new ArrayList<Object>();
	ArrayList<Object> ar2 = new ArrayList<Object>();
	ArrayList<String> ar3 = new ArrayList<String>();
	ArrayList<Integer> ar4 = new ArrayList<>();
	ar.add(1);
	ar.add("second");
	ar.add(false);
	ar.add(4.23);
	ar3.add("a");

	String n = ar3.get(0);
	
	//
	//타입의 문제
	int num =  (Integer)ar.get(0);
	String sum = (String)ar.get(1);
	boolean c = (Boolean)ar.get(2);
	//제네릭 
	 
}
}
