package com.Arrays.p1;

import java.util.Scanner;

public class evensum{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		int evensum=0;
		int oddsum=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the elements "+(i+1));
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				evensum+=arr[i];
			}
			else {
				oddsum+=arr[i];
			}

		}
		System.out.println("even sum is:"+evensum);
		System.out.println("odd sum is:"+oddsum);
	}
}
		
		

	
