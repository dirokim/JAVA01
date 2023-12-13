package com.summer.study3.Himart;

public class HimartMain {

	public static void main(String[] args) {
		
		NoteBook notebook = new NoteBook();
		Phone phone = new Phone();
		Tv tv = new Tv();
		
		Customer customer = new Customer();
		
		
		customer.buy(tv);
		
		Himart [] himart = new Himart [3];
		himart[0]=tv;
		himart[1]=phone;
		himart[2]=notebook;
		

	}

}
