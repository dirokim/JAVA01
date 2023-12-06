package com.summer.study1;

public class ArrayStudy3 {

	public static void main(String[] args) {
		
		int [] ar = {2,5,4,1,3};
		int [] ar2 = {1};
	
		
	
		
		for(int j=0;j<ar.length-1;j++) {
			for(int i=0;i<ar.length-1;i++) {
				if(ar[i]>ar[j]) {
					int C = ar[i];
					ar[i]=ar[j];
					ar[j]= C;
				}

			}
		}
		for(int i=0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
}
