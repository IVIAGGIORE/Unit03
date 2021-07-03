package com.training.unit03.main;

import java.util.Random;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Random rond = new Random ();
		
		int n = rond.nextInt(50) + 1;
		
		int[] number = new int [n];
		
		for (int i = 0; i < n; i++) {
			number[i] = rond.nextInt(1000) - 500;
		}
		System.out.println("Array");
		for (int i = 0; i < number.length; i++) {
		System.out.print(number[i] + " ");
		}
		System.out.println();
		
		int positive, negative, zero;
		positive = negative = zero = 0;
		
		for (int i = 0; i < n; i++) {
			if (number[i] > 0) {
				positive++;
			}
			if (number[i] < 0) {
				negative++;
			}
			if (number[i] == 0) {
				zero++;
			}
		}
		
		if (positive == 0) {
			System.out.println("no elements");
		} else {
			System.out.println("number of positive elements =" + positive);
		}
		if (negative == 0) {
			System.out.println("no elements");
		}else {
			System.out.println("number of negative elements =" + negative);
		}
		if (zero == 0) {
			System.out.println("no elements");
		}else {
			System.out.println("number of zero elements =" + zero);
		}
		
	}
}
