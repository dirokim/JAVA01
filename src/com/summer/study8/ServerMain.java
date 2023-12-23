package com.summer.study8;

public class ServerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerController serverController = new ServerController();
		try {
			serverController.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
	}

}
