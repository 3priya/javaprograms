package com.oops.p1;

public class dog7 {
	private String  name;
	private String  color;
	private int  cost;
	private int  age;
	private String  breed;
	void setdata(String name,String color,int cost,int age,String breed) {
		name=name;
		color=color;
		cost=cost;
		age=age;
		breed=breed;
	}
	void getdata(){
		System.out.println(name);
		System.out.println(color);
		System.out.println(cost);
		System.out.println(age);
		System.out.println(breed);	
	}
}
class shadow{
	public static void main(String args[]) {
		dog7 d1=new dog7();
		d1.setdata("rocky","brown",5000,3,"gr");
		d1.getdata();
	}
}
