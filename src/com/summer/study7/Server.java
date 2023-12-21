package com.summer.study7;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	
	public void s() throws Exception {
		System.out.println("클라이언트가 접속하기를 기다리는중 ");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("Client 연결 성공 ");
		
		
		
		System.out.println("서버 프로그램 종료");

	}
	
	
}
