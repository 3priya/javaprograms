package com.Arrays.p1;

import java.util.Scanner;
public class arraycode2 {
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enetr the class count : ");
	        int cls=sc.nextInt();
	        System.out.println("enetr the student count : ");
	        int stu=sc.nextInt();
	        String arr [][]=new String[cls][stu];
	        for(int i=0;i<cls;i++) {
	        	 System.out.println("inside class count : ");
	        	for(int j=0;j<stu;j++) {
	        		 System.out.println("enetr the name of the student: ");
	        		 arr[i][j]=sc.next();
	        	}
	        }
	        for(int i=0;i<cls;i++) {
	       	 System.out.println("inside class count:"(i+1));
	        }
	        
	        		 
