package com.summer.study4.util;

import java.util.HashMap;
import java.util.Iterator;

public class StudyMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<>();
		map.put("k1", 1);
		map.put("k2", 2);
		System.out.println(map);
		Integer num =  map.get("k2");
		System.out.println(num);
		
		Set<Stirng> k = map.keySet();
		Iterator<String>keys= k.iterator();
		wild(keys.hasNext()){
			String key = keys.next();
			System.out.println("key : "+key);
			System.out.println(map.get(key));
		}
	}

}
