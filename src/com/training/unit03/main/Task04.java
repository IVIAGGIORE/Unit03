package com.training.unit03.main;

import java.util.Arrays;
import java.util.Random;


public class Task04 {

	public static void main(String[] args) {
		//пузырек на убывание 
		Random rond = new Random ();
		
		int n=rond.nextInt(50) + 1;
		
		int[] number = new int [n];
		
		for (int i = 0; i < n; i++) {
			number[i] = rond.nextInt(1000)-500;
		}

		System.out.println("source ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(number[i] + " ");
		}
		
		int k;
		
		for (int i = 0; i < n; i ++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (number[j] < number[j + 1]) {
					k = number[j];
					number[j] = number[j + 1];
					number[j + 1] = k;
				}
				}
			}
		
		System.out.println();
		System.out.println("received ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(number[i] + " ");
		}
		}
		
}


	