package com.summer.study7.ex1.Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.naming.ldap.SortControl;

public class ClientController {

	
	public void start() throws UnknownHostException, IOException {
		//1.서버와 소켓 연결 시도
		//1.서버 정보 받아서 날씨정보 출력
		//2.서버 정보 받아서 날씨정보 검색
		//3.서버 정보 받아서 프로그램 종료 
		//4.출력 까지
		ClientView clientView = new ClientView();
		Socket socket = new Socket("localhost",8283);
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter or = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(or);
		Scanner sc = new Scanner(System.in);
		boolean check = true;

		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		String str ="";
		
		while(check) {
			System.out.println("1.날씨 정보 출력");
			System.out.println("2.날씨 정보 검색");
			System.out.println("3.프로그램 종료");
			String s = sc.next();
			bw.write(s+"\n\r");
			bw.flush();
			str =  br.readLine();
			switch(s) {
			case "1" :
				System.out.println("1.날씨 정보 출력");
				clientView.view(str);
				break;
			case "2" :
				System.out.println("2.날씨 정보 검색");
				System.out.println("검색할 지역은 ?");
				String a = sc.next();
				bw.write(a+"\n\r");
				bw.flush();
				str = br.readLine();
				clientView.view2(str);
				break;
			case "3":
				System.out.println("3.프로그램 종료");
				check=false;
				
			}
		}
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		or.close();
		os.close();
		socket.close();
		
		
		
	}
}
