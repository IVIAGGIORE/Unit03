package com.training.unit03.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Random rond = new Random ();
		
		int n = rond.nextInt(10) + 1;
				
		int[][] number = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
			number[i][j] = rond.nextInt(1000) - 500;	
			}	
		}
		
		System.out.println("source ");
		for (int i = 0; i < n; i++) {
			System.out.print ("[ ");
			for (int j = 0; j < n; j++) {
				System.out.printf("%d \t", number[i][j]);
			}
			System.out.println ("]");
		}
		
		System.out.println ();
		
		for (int i = 0; i < n; i++) {
			System.out.print(number[i][i] + " ");	
			}
		
	}

}
