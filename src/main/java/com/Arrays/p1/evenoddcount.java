package com.Arrays.p1;
import java.util.Scanner;
public class evenoddcount{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter the elements "+(i+1));
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				even+=1;
			}
			else {
				odd+=1;
			}

		}
		System.out.println("even num is:"+even);
		System.out.println("odd numis:"+odd);
	}
}


	
