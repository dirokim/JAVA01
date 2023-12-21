package com.summer.study6.ex1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.summer.study4.lang.ex1.Weather;

public class WeatherDAO {
	private static int count;
	{
	WeatherDAO.count=0;	
	}
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
		weatherdto.setPersent(Integer.parseInt(ar.nextToken()));
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
	public WeatherDTO getDetail(List<WeatherDTO> ar,Scanner sc) {
		System.out.println("검색할 도시명");
		WeatherDTO weatherdto = new WeatherDTO();
		weatherdto.setLocal(sc.next());
		for(WeatherDTO w: ar) {
			if(w.getLocal().equals(weatherdto.getLocal())) {
				return w;
			
			}
		}
		return null;
	}
	//추가
	public boolean add(List<WeatherDTO> ar,Scanner sc) {
		System.out.println("추가할 도시");
		WeatherDTO weatherdto = new WeatherDTO();
		System.out.println("추가할 도시명");
		weatherdto.setLocal(sc.next());
		System.out.println("추가할 기온");
		weatherdto.setTemp(sc.nextInt());
		System.out.println("추가할 날씨");
		weatherdto.setWeather(sc.next());
		System.out.println("추가할 퍼센트");
		weatherdto.setPersent(sc.nextInt());
		 return ar.add(weatherdto);
		
	}
	
	public boolean delete (List<WeatherDTO>ar,Scanner sc) {
		boolean result = false;
		System.out.println("삭제할 도시명은 ?");
		String name = sc.next();
		for(WeatherDTO weatherdto : ar) {
			if(weatherdto.getLocal().equals(name)) {
				result = ar.remove(weatherdto);
				break;
			}
		}
		return result;
	}
	public void save (List<WeatherDTO>ar) throws Exception {
		//1.받아서 파일에 작성
		//2.파일명 c > study >save.text 
		//3.##날씨정보
		//도시명-기온-정보-습도
		//20231220 저장할날짜 +count;
//		WeatherDAO.count++;
		
		File file = new File("c:\\study\\weather1");
		FileReader fr = new FileReader(file);	
		BufferedReader br = new BufferedReader(fr);
		
		

		String [] files = file.list();
		long [] name = new  long [files.length];
		long max=0;
		for(int i = 0; i<files.length;i++) {
			//split . StringTOken, subStirng
//			String [] r = files[i].split(".");
//			name[i]=r[0];
			
//			StringTokenizer st = new StringTokenizer(files[i],".");
//			name[i]=st.nextToken();
		
			name[i] = Long.parseLong(files[i].substring(0,files[i].lastIndexOf("."))) ;
			if(max<name[i]) {
				max=name[i];
			}
		}
		
//		
//		Calendar calendar = Calendar.getInstance();
//		int year = calendar.get(Calendar.YEAR);
//		int month = calendar.get(Calendar.MONTH)+1;
//		int date = calendar.get(Calendar.DATE);
//		String names = String.valueOf(year)+month+date+WeatherDAO.count+".txt";
				
//
//		File file1 = new File("c:\\study");
//		String fileName= calendar.getTimeInMillis()+".txt";
//				file1 = new File(file1,fileName);
//		FileWriter fw = new FileWriter(file1,false);
//		fw.write("##날씨정보");
//		fw.flush();
//		for(WeatherDTO weatherdto : ar) {
//			fw.write("\n");
//			fw.write(weatherdto.getLocal()+"-");
//			fw.write(weatherdto.getTemp()+"-");
//			fw.write(weatherdto.getWeather()+"-");
//			fw.write(weatherdto.getPersent()+"\r");
//			fw.flush();
//			
//		}
//		fw.close();
		
		 
	
		
		
	}


}
	

