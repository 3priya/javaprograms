package com.Arrays.p1;

import java.util.Scanner;
public class arraycode4 {
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enetr the school count : ");
	        int sch=sc.nextInt();
	        System.out.println("enetr the class count : ");
	        int cls=sc.nextInt();
	        System.out.println("enetr the student count : ");
	        int stu=sc.nextInt();
	        String arr [][][]=new String[sch][cls][stu];
	        for(int i=0;i<arr.length;i++) {
	        	 System.out.println("enter the school : "+(i+1));
	        for(int j=0;j<arr[i].length;j++) {
	        	System.out.println(" inside the class no : "+(j+1));
	        	  for(int k=0;k<arr[i][j].length;k++) {
	  	        	System.out.println(" enter the name of the student no : "+(k+1));
	  	        	arr[i][j][k]=sc.next();
	        	  }
	        }
	        }
	        for(int i=0;i<arr.length;i++) {
	        	 System.out.println("inside school number : "+(i+1));
	        for(int j=0;j<arr[i].length;j++) {
	        	System.out.println(" inside the class no : "+(j+1));
	        	  for(int k=0;k<arr[i][j].length;k++) {
	  	        	System.out.println(" student is:"+(k+1)+" is:"+arr[i][j][k]);
	        	  }
	        }
	        }
	        }
}
	   
