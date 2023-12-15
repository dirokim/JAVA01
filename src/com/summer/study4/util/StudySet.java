package com.summer.study4.util;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class StudySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<>();
		hs.add("test");
		hs.add("second");
		hs.add("third");
		hs.add("test");						//중복데이터 x 
		System.out.println(hs.size());
		System.out.println(hs);
		
		Iterator <String> it = hs.iterator();
		
	
		Collection<String>co=hs;
		while(it.hasNext()) {
			String v = it.next();
			
		}
		System.out.println(hs.iterator());
		
	}

}
