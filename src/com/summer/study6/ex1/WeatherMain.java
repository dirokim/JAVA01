package com.summer.study6.ex1;

import java.util.ArrayList;

public class WeatherMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherDAO weatherdao = new WeatherDAO();
		WeatherDTO weatherdto = new WeatherDTO();
		ArrayList<WeatherDTO> list = new ArrayList<>();
		try {
		list = weatherdao.getWeather();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}
	
	
	
	
}
