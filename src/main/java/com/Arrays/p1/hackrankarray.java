package com.Arrays.p1;

import java.util.Scanner;

public class hackrankarray {
	 public static void main(String args[])
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enetr the of languages in which suraj is production"+"house is producing the movie: ");
	        int lang=sc.nextInt();
	        System.out.println("enetr the categories in which the movies are being produced by"+"suraj production house:");
	        int cat=sc.nextInt();
	        System.out.println("enetr the count  of movies produced in each category of language"+"by suraj production house:");
	        int mov=sc.nextInt();
	        long arr [][][]=new long[lang][cat][mov];
	        long overal_collection=0;
	        for(int i=0;i<arr.length;i++) {
	        	 System.out.println("**** language no:"+(i+1)+"****");
	        for(int j=0;j<arr[i].length;j++) {
	        	System.out.println("**** categoryno :"+(j+1)+"****");
	        	  for(int k=0;k<arr[i][j].length;k++) {
	  	        	System.out.println(" enter the collection of the movie no : "+(k+1));
	  	        	arr[i][j][k]=sc.nextLong();
	        	  }
	        }
	        }
	        for(int i=0;i<arr.length;i++) {
	        	 System.out.println("**** language no:"+(i+1)+"****");
	        for(int j=0;j<arr[i].length;j++) {
	        	System.out.println("**** categoryno :"+(j+1)+"****");
	        	  for(int k=0;k<arr[i][j].length;k++) {
	  	        	System.out.println(" collection of movie no:"+(k+1)+" is="+arr[i][j][k]);
	  	        	overal_collection=overal_collection+arr[i][j][k];
	        	  }
	        }
	        }
	        if(overal_collection>6000000000l) {
	        	System.out.println("suraj is on the profitable side");
	        	System.out.println("the profit made by suraj is="+( overal_collection>6000000000l));
	        }
	        else
	        	System.out.println("suraj is under loss");
        	System.out.println("the loss incured by suraj is="+( 6000000000l-overal_collection));
	        {
	        	
	        }
	    }
}
