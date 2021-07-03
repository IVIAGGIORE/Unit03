package com.training.unit03.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Random rond = new Random ();
		
		int n = rond.nextInt(10) + 1;
		int m = rond.nextInt(10) + 1;
		
		int[][] number = new int[n][m];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
			number[i][j] = rond.nextInt(1000) - 500;	
			}	
		}
		
		System.out.println("source " + Arrays.deepToString(number));
		
		int k = rond.nextInt(n);
		System.out.println("k=" + k);
		
		for (int j = 0; j < m; j++) {
			System.out.print(number[k][j] + ",");
			}
		
		System.out.println();
		int p = rond.nextInt(m);
		
		System.out.println("p=" + p);
		for (int i = 0; i < n; i++) {
			System.out.print(number[i][p] + ",");
			}
		

	}

}
