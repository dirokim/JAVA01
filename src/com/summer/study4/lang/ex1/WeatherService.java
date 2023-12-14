package com.summer.study4.lang.ex1;

public class WeatherService {
	private String datas;
	

	
	
	public WeatherService() {
		this.datas="서울-10-비-80-부산-25-맑음-50,대구-82-눈-12,제주.25-태풍.75";

	
	}
	
	public Weather[] init() {
		
	this.datas = this.datas.replace(".","-");
	this.datas = this.datas.replace(",","-");
	
	 	String []num = this.datas.split("-");
	 	Weather[] datas = new Weather[num.length/4];
	 	
	 	int j=0;
	 	for(int i =0;i<num.length;i=+4) {
	 		Weather data = new Weather();
	 		data.setCity(num[i]);
	 		data.setGion(num[i+1]);
	 		data.setHum(num[i+2]);
	 		data.setInfo(num[i+3]);
	 		datas[j]=data;
	 		j++;
	 		 		
	 	}
	 	return datas;
	 		

	}
}
