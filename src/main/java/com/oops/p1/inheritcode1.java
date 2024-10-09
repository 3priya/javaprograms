package com.oops.p1;
class Animal{
	String name;
	int age;
	String country;
	Animal(){
		super();
		name="ramu";
		age=5;
		country="india";
	}
	}
	class elephant extends Animal{
		public elephant() {
			super();
			String name = "arjun";
			int age=15;
		}
		void display() {
			System.out.println(name);
			System.out.println(age);
			System.out.println(country);
		}
	}
	public class inheritcode1 {
		public static void main(String args[]) {
			elephant e=new elephant();
			e.display();
		}
	}
