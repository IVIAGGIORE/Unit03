package com.training.unit03.main;

import java.util.Random;
import java.util.Vector;


public class Task01 {

	public static void main(String[] args) {
		Random rond = new Random ();
		
		int n = rond.nextInt(50)+1;
		int [] a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = rond.nextInt(1000);
		}
		
		System.out.println("Array a ");
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
		}
		System.out.println();
		
		
		int k = - 1;
		
		for (int i = 0; i < n; i++) {
			if ( a[i] % 2 == 0) {
				k ++;
			}
		}
		
		if (k!= -1){
			int l = 0;			
			int [] number = new int[k+1];
			
			for (int i = 0; i < n; i++) {
				if ( a[i] % 2 == 0) {
					number[l] = a[i];
					l++;
				}
			}
			
			System.out.println("Array of even elements ");
			
			for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
			}
			
		} else {
			System.out.println("no elements ");
		}
		
	}
}
