package com.summer.study7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	
	public void s() throws Exception {
		System.out.println("클라이언트가 접속하기를 기다리는중 ");
		ServerSocket ss = new ServerSocket(8283);
		
		
		Socket sc = ss.accept();
		System.out.println("Client 연결 성공 ");
		
		while(true) {
			System.out.println("클라이언트로부터 메세지받음");
		InputStream is = sc.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println(br.readLine());

		//받아서 반대로 클라이언트한테 다시 메세지 전송
		
		System.out.println("클라이언트한테 메세지보냄");
		OutputStream os =  sc.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		Scanner sc1 = new Scanner(System.in);
		String abc = sc1.next();
		bw.write(abc+"\n\r");
		bw.flush();
		
		
		
		if(abc.equals("exit")) {
			break;
		}
		}
		
		
		
		
	
	


	}
	
	
}
