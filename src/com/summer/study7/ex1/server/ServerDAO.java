package com.summer.study7.ex1.server;

import java.io.BufferedReader;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ServerDAO {

	///getWeathers
	// 파일에서 내용을 읽어와서 리스트에 담아서 리턴 
	//기능 
	
	File file;
	FileReader fr;
	BufferedReader br;
	ArrayList<String> ar;
	public String getweathers() throws Exception {
		file = new File("C:\\study\\weather.txt");
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		br.readLine();
		ar = new ArrayList<>();
		for(int i=0;i<4;i++) {
		String s = br.readLine();
		StringTokenizer sr = new StringTokenizer(s,"-");
		ar.add(sr.nextToken());
		ar.add(sr.nextToken());
		ar.add(sr.nextToken());
		ar.add(sr.nextToken());
		}
		String str = "";
		for(int i=0;i<ar.size();i++) {
			str += ar.get(i)+",";
		}
		return str;
	}
	
	public String find(String s2) throws Exception  {
			String str2 = this.getweathers();
			String a;
			String result = "";
			StringTokenizer ar = new StringTokenizer(str2,",");
			while(ar.hasMoreTokens()) {
				a = ar.nextToken();
				if(s2.equals(a)) {
					result=a+ar.nextToken()+ar.nextToken()+ar.nextToken();
					System.out.println(result);
					break;
				}
			}

			return result;
			
			
		
	
		}
	
		
	
	
}
	
	
	
	
	

