package com.oops.p1;
class dog1 {
	private String  name;
	private String  color;
	private int  cost;
	private int  age;
	private String  breed;
	void setdata(String a,String b,int c,int d,String e) {
		name=a;
		color=b;
		cost=c;
		age=d;
		breed=e;
	}
	void getdata(){
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);	
	}
}
 public class constructor{
	public static void main(String args[]) {
		dog1 d1=new dog1();
		d1.setdata("rocky","brown",5000,3,"gr");
		d1.getdata();
	}
}
