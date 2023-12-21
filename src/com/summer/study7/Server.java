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
	
	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	OutputStream os;
	OutputStreamWriter ow;
	BufferedWriter bw;
	
	public void s() throws Exception {
		
		System.out.println("클라이언트가 접속하기를 기다리는중 ");
		ServerSocket ss = new ServerSocket(8282);
		Socket sc = ss.accept();
		System.out.println("Client 연결 성공 ");
		is = sc.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		os =  sc.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		Scanner sc1 = new Scanner(System.in);	
		
		while(true) {
		System.out.println("클라이언트로부터 메세지받음");
		System.out.println(br.readLine());
		System.out.println("클라이언트한테 메세지보냄");	
		String abc = sc1.next();
		bw.write(abc+"\n\r");
		bw.flush();
		if(abc.toUpperCase().equals("EXIT")) {break;}
		}
		bw.close();
		ow.close();
		os.close();
		br.close();
		ir.close();
		is.close();
		
		
		
	
	


	}
	
	
}
