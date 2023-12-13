package com.summer.study3.rpg;

import com.summer.study3.rpg.weapon.*;
public class RpgMain {
	public static void main(String[]args) {

			
		Worrier worrier = new Worrier();
		Axe axe = new Axe();
		worrier.setAxe(axe);
		worrier.getWeapone().attack();
		
		Bow bow = new Bow ();
		worrier.setAxe(bow);
		worrier.getWeapone().attack();
	}
}
