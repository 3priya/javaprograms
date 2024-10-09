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
		System.out.println("cargo plane is carry goods");	`
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
class airport{
	void permit(plane ref) {
		ref.takeoff();
		ref.fly();
		ref.land();
	}
}
public class polycode2{
	public static void main(String args[]) {
		cargolPane cp=new cargolPane();
		passengerplane pp=new passengerplane();
		fighterplane fp=new fighterplane();
		airport ap=new airport();
		System.out.println("--------cargoplane-------");
		ap.permit(cp);
		cp.carrygoods();
		System.out.println("******");
		System.out.println("-----passengerplane------");
		ap.permit(pp);
		pp.carryhumans();
		System.out.println("******");
		System.out.println("-----fighterplane------");
		ap.permit(fp);
		fp.carryweapons();
	}
}
		
		
		
		
		
		
		