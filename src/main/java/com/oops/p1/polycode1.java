package com.oops.p1;
class plane{
	void takeoff() {
		System.out.println("plane take off");
	}
	void fly() {
		System.out.println("plane is flying");
	}
	void land() {
		System.out.println("plane is land");
	}
}
class cargolPane extends plane{
	void fly() {
		System.out.println("cargo plane is flying at lower height");	
	}
	void carrygoods() {
		System.out.println("cargo plane is carry goods");	
	}
}
class passengerplane extends plane{
	void fly() {
		System.out.println("passenger plane is flying at lower height");	
	}
	void carryhumans() {
		System.out.println("passenger plane is carry humans");	
	}
}
class fighterplane extends plane{
	void fly() {
		System.out.println("fighter plane is flying at lower height");	
	}
	void carryweapons() {
		System.out.println("fighter plane is carry weapons");	
	}
}
public class polycode1{
	public static void main(String args[]) {
		cargolPane cp=new cargolPane();
		passengerplane pp=new passengerplane();
		fighterplane fp=new fighterplane();
		System.out.println("--------cargoplane");
		plane ref;
		ref=cp;
		ref.takeoff();
		ref.fly();
		ref.land();
		cp.carrygoods();
		System.out.println("*******");
		System.out.println("------passengerplane--------");
		ref=pp;
		ref.takeoff();
		ref.fly();
		ref.land();
		pp.carryhumans();
		System.out.println("*******");
		System.out.println("------fighterplane--------");
		ref=fp;
		ref.takeoff();
		ref.fly();
		ref.land();
		fp.carryweapons();
		System.out.println("*******");
	}
}
