package com.oops.p1;
abstract class calcyTest{
abstract void add();
}
public class innertype {
	public static void main(String args[]) {
		calcyTest ct1=new calcyTest() {
			void add() {
				System.out.println("hi from add() implementation from main()");
			}
		};
		System.out.println(ct1);
		ct1.add();
	}
}
