package com.summer.study7;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public void send() throws Exception {
		Socket socket = new Socket("192.168.7.191", 8282);
		System.out.println("서버와 접속이 되었습니다.");
		
	}
	
	
	
}
