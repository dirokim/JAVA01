package com.summer.study6.ex1;

import java.util.List;
import java.util.Scanner;

public class WeatherController {
	//의존적이다 Dependency
	//주입하다 Injection 
	private WeatherDAO weatherdao;
	private WeatherView weatherView;
	private Scanner sc;
	
	public WeatherController() {
		//강한 결합이다
		this.weatherdao = new WeatherDAO(); //생성자 호출  같이죽음
		this.weatherView = new WeatherView();
		this.sc = new Scanner(System.in);
		}
	public WeatherController(WeatherDAO weatherdao) { //매개변수로 받을시 dao 는살아있고 생명주기 다름
		this.weatherdao = weatherdao;
		//느슨한 결합이다
	}
	
	
	
	public WeatherDAO getWeatherdao() {
		return weatherdao;
	}
	public void setWeatherdao(WeatherDAO weatherdao) {  // 개터세터로 컨트롤러가 죽어도 살아있는 weatherdto
		this.weatherdao = weatherdao;
	}
	
	
	
	public void start() throws Exception {
		//처음 한번만 예외처리 
		List<WeatherDTO> ar = weatherdao.getWeather();
		
		boolean check = true;
		 
		while(check) {
			System.out.println("1.날씨 정보 출력");
			System.out.println("5.프로그램 종료");
			try {
			int select =sc.nextInt();
				if(select==1) {
					this.weatherView.view(ar);
				}else {
					System.out.println("종료합니다");
					check = false;
				}
			}catch (Exception e) {
				System.out.println("잘못입력 했다");
				System.out.println(sc.next());
			}
			
			
		}
		
	}
}
