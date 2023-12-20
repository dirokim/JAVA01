package com.summer.study6.ex1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WeatherView {
	public void view(List<WeatherDTO> ar) {
		System.out.println("도시명\t기온\t날씨\t습도%");
		for(WeatherDTO weatherdto : ar) {
			System.out.println(weatherdto.getLocal()+"\t");
			System.out.println(weatherdto.getTemp()+"\t");
			System.out.println(weatherdto.getWeather()+"\t");
			System.out.println(weatherdto.getPersent()+"%\n");
			System.out.println("===============================");
			
			
			
		}
	}
}
