package com.oops.p1;
class owner{
	private manager m;
	public owner() {
		m=new manager();
	}
	void sweep() {
		m.sweep();
	}
	void mop() {
		m.mop();
	}
	void dryclean() {
		m.dryclean();
	}
}
class manager{
	private worker w;
	public manager() {
		w=new worker();
	}
public void sweep() {
	w.sweep();
}
public void mop() {
	w.mop();
}
public void dryclean() {
	w.dryclean();
}
}
class worker{
	public void sweep() {
		System.out.println("sweeping the floor is completed");
	}
	public void mop() {
		System.out.println("mop the floor is completed");
	}
	public void dryclean() {
		System.out.println("dryclean the floor is completed");
	}
}
public class deligation {
public static void main(String args[]) {
	owner o=new owner();
	o.sweep();
	o.mop();
	o.dryclean();
}
}
