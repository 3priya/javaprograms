package com.Arrays.p1;

import java.util.Scanner;
public class arraycode1 {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the student count: ");
		int n= sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println(" Enter the marks of student no:"+(i+1));
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			System.out.println("the marks of student no"+(i+1)+" is="+(arr[i]));
		}
	}
}
			
		
