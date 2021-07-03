package com.training.unit03.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		Random rond = new Random ();
		
		int n=rond.nextInt(50) + 1;
		
		int[] a = new int [n];
		
		for (int i = 0; i < n; i++) {
			a[i] = rond.nextInt(1000)-500;
		}
		
		System.out.println("Array a ");
		for (int i = 0; i < a.length; i++) {
		System.out.print(a[i] + " ");
		}
		System.out.println();
		
		int max, min;
		
		max = min = a[0];
		
		for (int i = 1 ; i < n ; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.print(Math.abs(max - min));
	}

}
