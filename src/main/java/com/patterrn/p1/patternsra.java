package com.patterrn.p1;

import java.util.Scanner;

public class patternsra {
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.print("enetr: ");
	        int n=sc.nextInt();
	        for(int i=0;i<n;i++) {
	        	for(int j=0;j<n;j++) {
	        		if((i==0 && j<=n/2 && j!=0) || (j==0 && i!=0 && i<n/2) || (i==n/2 && j<n/2 && j!=0) || (i==(n-1) && j<n/2) || (j==n/2 && i!=n/2 && i>n/2 && i!=(n-1))){
	        		System.out.print("* ");
	        	}
	        		else {
	        			System.out.print("  ");
	        		}
	        	}
	        	for(int j=0;j<n;j++) {
					if(i==0 && j<n/2 || j==0 || i==(n/2) && j<n/2  || j==n/2 && i!=0 && i<n/2 || i-j==n/2) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
	        	for(int j=0;j<n;j++) {
					if((i==0 && j<(n/2) && j!=0) || (i==n/2 && j<=(n/2)) || (j==0 && i!=0) || (j==(n/2) && i!=0)){
						System.out.print("*");				
					}
					else {
						System.out.print(" ");
					}
				}
	        	for(int j=0;j<n;j++) {
					if(j==0 && i<n/2 || i-j==n/2 || j==n-1 && i<n/2 || i+j==((n-1)+(n/2))){
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
	        	for(int j=0;j<n;j++) {
					if((i==0 && j<(n/2) && j!=0) || (i==n/2 && j<=(n/2)) || (j==0 && i!=0) || (j==(n/2) && i!=0)){
						System.out.print("*");				
					}
					else {
						System.out.print(" ");
					}
				}
	        	for(int j=0;j<n;j++) {
					if(j==0 || i==j || j==n-1){
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
	        	for(int j=0;j<n;j++) {
					if(i==0 && j<n/2 || j==n/4) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
	        	for(int j=0;j<n;j++) {
					if(j==0 || (i==n/2 && j<n/2) || j==n/2) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
				}
	        	for(int j=0;j<n;j++) {
					if((i==0 &&  j<n/2) || j==n/4 ||( i==n-1 && j<n/2)) {
						System.out.print("* ");
					}
					else {
						System.out.print("  ");
					}
					System.out.print("  ");
				}
	        	System.out.println("  ");
	        }
	    }
	}

