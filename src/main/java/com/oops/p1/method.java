package com.oops.p1;

public class method {
	int add(int a,int b) {
		return a+b;
	}
		float add(float a,float b) {
			return a+b;
		}
		double add(double a ,double b) {
			return a+b;
		}
		int add(int a,int b,int c) {
			return a+b+c;
		}
		float add(float a,float b,float c) {
			return a+b+c;
		}
		double add(double a ,double b,double c) {
			return a+b+c;
		}
		float add(int a,int b,float c) {
			return a+b+c;
		}
		double add(int a ,float b,double c) {
			return a+b+c;
		}
		double add(float a,double b) {
			return a+b;
		}
		public static void main(String args[]) {
			method c1=new method();
			int a=10,b=20,c=30;
			float p=10.4f,q=20.4f,r=30.4f;
			double m=10.456f,n=20.4f,o=30.4f;
			System.out.println(c1.add(a,b));
			System.out.println(c1.add(m,n));
			System.out.println(c1.add(a,p,m));
			System.out.println(c1.add(p,m));
			System.out.println(c1.add(a,m));
		}
	}
			
			
		
		
		
		