package com.summer.study7.ex1.Client;

import java.io.IOException;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientController clientController = new ClientController();
		try {
			clientController.start();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
