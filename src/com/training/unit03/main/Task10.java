package com.training.unit03.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		Random rond = new Random ();
		int n;
		
		do {
			n = rond.nextInt(10) + 1;
		} while (n % 2 != 0);
		
		int[][] number = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0 || i == n-1 || j == n-1) {
					number [i][j] = 1;
				} else {
					number [i][j] = 0;
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
