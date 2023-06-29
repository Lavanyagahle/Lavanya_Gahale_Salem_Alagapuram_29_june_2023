/*
 *     1
 *    2 2
 *   3 3 3
 *    1
 *   2 2
 *      1
 *     2 2
 *    3 3 3
 *   4 4 4 4
 */



package com.assignment;

import java.util.Scanner;

public class NumericPattern {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			 
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				int n3 = sc.nextInt();
				int l = 1;
			for (int i = 1; i <= n1; i++) {
		    	for (int j = 1; j <= n1-i; j++) {
					System.out.print(" ");
				}
		    	for (int k = 1; k <= i; k++) {
					System.out.print(i+(k==i ? "":" "));
					l++;
				}
		    	System.out.println();
			}
			l=1;
			for (int i = 1; i <= n2; i++) {
		    	for (int j = 1; j <= n2-i; j++) {
					System.out.print(" ");
				}
		    	for (int k = 1; k <= i; k++) {
					System.out.print(i+(k==i ? "":" "));
					l++;
				}
		    	System.out.println();
			}
			l=1;
			for (int i = 1; i <= n3; i++) {
		    	for (int j = 1; j <= n3-i; j++) {
					System.out.print(" ");
				}
		    	for (int k = 1; k <= i; k++) {
					System.out.print(i+(k==i ? "":" "));
					l++;
				}
		    	System.out.println();
			}
		   
		    
		}

	}
