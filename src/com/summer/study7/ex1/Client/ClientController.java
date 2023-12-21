package com.summer.study7.ex1.Client;

import java.io.BufferedWriter;
import java.io.IOException;
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
		
		Socket socket = new Socket("localhost",8383);
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter or = new OutputStreamWriter(os);
		BufferedWriter br = new BufferedWriter(or);
		Scanner sc = new Scanner(System.in);
		System.out.println("1.날씨 정보 출력");
		System.out.println("2.날씨 정보 검색");
		System.out.println("3.프로그램 종료");
		br.write(null);
		br.flush();
		
		
		
	}
}
