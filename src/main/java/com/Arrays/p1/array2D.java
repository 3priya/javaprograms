package com.Arrays.p1;

import java.util.Scanner;
public class array2D {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter row no:");
		int row=sc.nextInt();
		System.out.println("enter column no:");
		int col=sc.nextInt();
		int arr1[][]=new int[row][col];
		int arr2[][]=new int[row][col];
		int res[][]=new int[row][col];
		System.out.println("enter array1 elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter array2 elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("result array elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
