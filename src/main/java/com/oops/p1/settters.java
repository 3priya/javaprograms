package com.oops.p1;
 class hyma {
	private String  name;
	private String  color;
	private int  cost;
	private int  age;
	private String  breed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color=	color;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost=cost;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed=breed;
	}
}
public class settters{
	public static void main(String args[]) {
		hyma s1=new hyma();
		s1.setName("ramu");
		s1.setColor("brown");
		s1.setCost(7000);
		System.out.println(s1.getName());
		System.out.println(s1.getColor());
		System.out.println(s1.getCost());
		System.out.println(s1.getAge());
		System.out.println(s1.getBreed());
	}
}