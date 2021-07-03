package com.training.unit03.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		Random rond = new Random ();
		int n = rond.nextInt(10) + 1;
		int m = rond.nextInt(10) + 1;
		
		int[][] number = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			number[i][j] = rond.nextInt(10);	
			}	
		}
		System.out.println("source ");
		for (int i = 0; i < n; i++) {
			System.out.print ("[ ");
			for (int j = 0; j < m; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println ("]");
		}
		
		int k = 0;
		for (int i = 0;i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (number[i][j] == 7) {
					k++;
				}	
			}	
		}
		System.out.println("the number 7 was encountered " + k);
	}

}
