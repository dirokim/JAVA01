package com.summer.study6.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WeatherDAO {
	//DAO : Data Access Object
	//메소드 getWeathers 
	//file에서 file 에 내용을 읽어오는 역활 
	//토큰으로 만들고 DTO 에 저장 
	//1.파일의 내용을 한줄씩 읽어오는것 
	//2.한줄의 내용을 pasing 
	//3.파싱한 토큰을 DTO 생성후 DTO 에 대입
	//4.DTO를 LIST 에 추가
	//5.LIST를 return 
	
	
	
	public ArrayList<WeatherDTO> getWeather() throws Exception {
		
	

	File file = new File("c:\\study\\weather.txt");
	FileReader fr = new FileReader(file);
	BufferedReader br = new BufferedReader(fr);
	String a = br.readLine();
	ArrayList<WeatherDTO> list = new ArrayList<>();
	while(true) {
		String s = br.readLine();
		if(s==null) {
			break;
		}	
		StringTokenizer ar = new StringTokenizer(s,"-");
		WeatherDTO weatherdto = new WeatherDTO();
		weatherdto.setLocal(ar.nextToken());
		weatherdto.setTemp(Integer.parseInt(ar.nextToken()));
		weatherdto.setWeather(ar.nextToken());
		weatherdto.setPersent(Double.parseDouble(ar.nextToken()));
		list.add(weatherdto);	
	}

		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getLocal());
			System.out.println(list.get(i).getTemp());
			System.out.println(list.get(i).getWeather());
			System.out.println(list.get(i).getPersent());
		}
		br.close();
		fr.close();
		return list;
		
	}


}
	

