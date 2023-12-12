package com.summer.study3.members;

public class Member {
	//비만관리 회원프로그램
	private String name;
	private double muge;
	private double ki;
	private int age;

	public Member() {}
	
	public Member(double muge) {
		this.muge=muge;
	}
	
	//데이터입력
	public void setName(String name) {
		this.name=name;
	}
	//데이터조회
	public String getName() {
		return this.name;
	}
	public void setMuge(double muge) {
		this.muge=muge;
	}
	public double getMuge() {
		return this.muge;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
