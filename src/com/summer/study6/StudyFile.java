package com.summer.study6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class StudyFile {
	
	public void f4() throws Exception {
		
		File file = new File("C:\\study\\test2.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		while(true) {
			String s = br.readLine();
			if(s==null) {
				break;
			}else if(!s.equals("")) {
				System.out.println(s);		
			}
			
		}
		//연결된 순서의 역순으로 해제
		br.close();
		fr.close();

		
	
		
	}
	
	
	
	
	public void f3() throws Exception{
		Scanner sc = new Scanner(System.in);
		File file = new File("c:\\study\\test2.txt");
//		FileWriter fw = new FileWriter(file,true); //기본값 false 덮어씌우다 true >append 추가
		
		FileWriter fw2 = new FileWriter(file,true);
		boolean check = true;
		while(check) {
			System.out.println("입력하세요");
			String num = sc.next();
			fw2.write(num);
			fw2.flush();
			if(num.toUpperCase().equals("EXIT")){
				break;
			}
			
		}
		
		
//		fw.write("winter"+"\n\r");//exit 입력
//		fw.flush();
//		fw.close(); //자원 종료
		
		
		
	}
	
	
	public void f2() throws Exception {
		File file = new File("c:\\study");
		
		String [] ar = file.list();
		File [] files = file.listFiles();//배열에담아서 리턴
		
		for(String s: ar) {
			System.out.println(s);
			System.out.println(s.length());
		}
	}
	
	
	public void f1() throws Exception {
		System.out.println("\n");
		File file = new File("c:\\study\\Test.java");
		file = new File("c:\\study\\test","sub1"); //스터디 밑에 테스트 
//		file.mkdir(); 						//디렉토리 만듬
		if(!file.exists()) {
		file.mkdirs(); 					//여러 디렉토리 만듬
		}
		
		file = new File(file,"t1.txt");
		file.createNewFile();
		System.out.println(file.exists()); //파일이 있냐 없냐 boolean 리턴
		System.out.println(file.isDirectory());//디렉토리 있냐없냐 
		System.out.println(file.isFile());//파일인가요 ?
		System.out.println(file.length());//파일의 크기
		
		file = new File("c:\\study\\test\\sub1");
		
		file.delete();
	}
}
