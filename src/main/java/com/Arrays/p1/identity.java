package com.Arrays.p1;
import java.util.Scanner;
public class identity {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int flag=0;
		System.out.println("enter colums no:");
		int col=sc.nextInt();
		System.out.println("enter rows no:");
		int rows=sc.nextInt();
		int arr[][]=new int[col][rows];
		for(int i=0;i<arr.length;i++) {
			System.out.print(" enter colum value:"+(i+1));
			for(int j=0;j<arr.length;j++) {
				System.out.print(" enter row value:"+(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
				 if(i==j && arr[i][j]==1) {
					 flag=1;
				 }
			}
			}
				if(flag==1) {
					System.out.println(" matrix is identical");
				}
				else {
					System.out.println("matrix is not identical matrix");
				}
		}
		
		}
