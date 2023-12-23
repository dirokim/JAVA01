package com.summer.study8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerController {

	public void start() throws Exception {
		//client 와 연결 // 서버소켓 > sc.accept ;
		//1 or 2  or 3 이지선다 통해 날씨정보 보내주기 ArrayList
		//
			System.out.println("클라이언트 기다리는중");
			ServerSocket ss = new ServerSocket(8283);
			Socket sc = ss.accept();
			System.out.println("클라이언트 연결 성공");
		
			InputStream is = sc.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			ServerDAO severDAO =new ServerDAO();
			
			OutputStream os = sc.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);
			
			
			
			severDAO.getweathers();
			boolean check =true;
			
			while(check) {
			String s= br.readLine();
			switch(s) {
				case "1":
				System.out.println("1.날씨 정보 출력");
			String str =severDAO.getweathers();
				bw.write(str+"\n\r");
				bw.flush();
				break;
			case "2":
				System.out.println("2.날씨 정보 검색");
			String	s2 =br.readLine();
	     	String	str2=severDAO.find(s2);
				bw.write(str2+"\n\r");
				bw.flush();
				break;
			case "3":
				check=false;
			
			}
			}
			
			bw.close();
			ow.close();
			os.close();
			br.close();
			ir.close();
			is.close();
			sc.close();

			
			
			
			
			
			
			
			
			
		
		
		
		
	}
}
