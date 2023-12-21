package com.summer.study7;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	OutputStream os;
	OutputStreamWriter ow;
	BufferedWriter bw;
	InputStream is;
	InputStreamReader ir;
	BufferedReader br;
	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 8282);
		System.out.println("서버와 접속이 되었습니다.");
		
		os = socket.getOutputStream(); //0과1 처리
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
		is = socket.getInputStream();
		ir = new InputStreamReader(is);
		br = new BufferedReader(ir);
		
		while(true) {
		System.out.println("서버로 보낼 메세지 보냄");
		String m = sc.next();
		if(m.toUpperCase().equals("EXIT")) {break;}
		bw.write(m+"\n\r");
		bw.flush();
		System.out.println("서버로부터 메세지받음");
		System.out.println(br.readLine());}
		
		br.close();
		ir.close();
		is.close();
		bw.close();
		ow.close();
		os.close();
		socket.close();
		

		
	
		
		
	}
	
	
	
}
