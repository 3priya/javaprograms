package com.oops.p1;
class p1{
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


public class shadow1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 p1 d1=new p1();
		d1.setdata("rocky","brown",5000,3,"gr");
		d1.getdata();

	}

}
