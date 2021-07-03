package com.training.unit03.main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Random rond = new Random ();
		
		int n=rond.nextInt(50) + 1;
		
		int[] number = new int[n];
		
		for (int i = 0; i < n; i ++) {
			number[i] = rond.nextInt(1000) - 500;
		}
		
		int k;
		
		System.out.println("source ");
		
		for (int i = 0; i < n; i++) {
			System.out.print(number[i] + " ");
		}
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if(number[j - 1] > number[j]) {
					k = number[j];
					number[j] = number[j - 1];
					number[j - 1] = k;
				} else {
					break;
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
