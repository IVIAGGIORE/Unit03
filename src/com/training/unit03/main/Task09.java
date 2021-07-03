package com.training.unit03.main;

import java.util.Arrays;
import java.util.Random;


public class Task09 {

	public static void main(String[] args) {
		Random rond = new Random ();
		int n;
		
		do {
			n = rond.nextInt(10) + 1;
		} while (n % 2 != 0);
		
		int[][] number = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == n-i-1) {
					number[i][j] = i+1;
				} else {
					number[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print ("[ ");
			for (int j = 0; j < n; j++) {
				System.out.print(number[i][j]+" ");
			}
			System.out.println ("]");
		}
		
		
	}

}
