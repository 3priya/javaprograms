package com.oops.p1;
class heart{
	float heartbeat;
public heart (float heartbeat) {
	super();
	this.heartbeat=heartbeat;
}
public float getheartbeat(){
	return heartbeat;
}
}
class brain{
	float weight;
	String function;
public brain (float weight,String function){
	this.weight=weight;
	this.function=function;
}
public float getweight(){
	return weight;
}
public String getfunction() {
	return function;
}
}
class bike{
	int milage;
	String brand;
public bike (int milage,String brand) {
	this.milage=milage;
	this.brand=brand;
}
public int getmilage() {
	return milage;
}
public String getbrand() {
	return brand;
}
}
class book{
	int pages;
	String name;
public book(int pages,String name) {
	this.pages=pages;
	this.name=name;
}
public int getpages() {
	return pages;
}
public String getname() {
	return name;
}
}
class human {
	 heart h=new heart(121.7f);
	 brain b=new brain(445.68f,"working");
	void hasbike(bike bi) {
		System.out.println(bi.getmilage());
		System.out.println(bi.getbrand());
	}
		void hasbook(book bo) {
		System.out.println(bo.getpages());
		System.out.println(bo.getname());
	}
}
public class hasarelation1{
	public static void main(String args[]) {
		human hu= new human();
		bike bi=new	bike(1111,"honda");
		book bo=new book(5,"claasic");
		System.out.println(hu.h.getheartbeat());
		System.out.println(hu.b.getweight());
		System.out.println(hu.b.getfunction());
		hu.hasbike(bi);
		hu.hasbook(bo);
		hu=null;
		System.out.println(bi.getmilage ());
		System.out.println(bo.getpages());
		System.out.println(hu.h.getheartbeat());
		hu.hasbike(bi);
		hu.hasbook(bo);
	}
}


