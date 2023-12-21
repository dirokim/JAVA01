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

	public void send() throws Exception {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 8283);
		System.out.println("서버와 접속이 되었습니다.");
		
		while(true) {
		System.out.println("서버로 보낼 메세지 보냄");
		String m = sc.next();
		OutputStream os = socket.getOutputStream(); //0과1 처리
		OutputStreamWriter ow = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(ow);
		
		bw.write(m+"\n\r");
		bw.flush();
		
		System.out.println("서버로부터 메세지받음");
		
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println(br.readLine());
		
		if(m.equals("exit")) {
			break;
		}
		
		
		
		}
		
		
		

		
	
		
		
	}
	
	
	
}
