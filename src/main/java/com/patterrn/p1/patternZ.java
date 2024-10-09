package com.patterrn.p1;

import java.util.Scanner;
public class patternZ {
		public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the size");
			int n= sc.nextInt();
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					if(i==0 || i+j==n-1 || i==n-1){
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println("  ");
			}
		}
	}
