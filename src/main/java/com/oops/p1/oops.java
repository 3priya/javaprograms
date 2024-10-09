package com.oops.p1;
import java.util.Scanner;
abstract class shapes{
	double area;
	abstract void collect();
	abstract void calculate();
	void display() {
		System.out.println(area);
	}
}
class square extends shapes{
	private double side;
	void collect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side value");
		side=sc.nextInt();
	}
	void calculate() {
		 area = side*side;
	}
}
class circle extends shapes{
	private double radius;
	private double pi=3.14786;
	void collect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radious value");
		radius=sc.nextDouble();
	}
	void calculate() {
	area=pi*radius*radius;
}
}
class rectangle extends shapes{
	private double l;
	private double b;
	void collect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length value");
		l=sc.nextDouble();
		System.out.println("enter the breadth value");
		b=sc.nextDouble();
	}
	void calculate() {
		area =l*b;
	}
}
class geometry{
	void permit(shapes s) {
		s.collect();
		s.calculate();
		s.display();
	}
}
public class oops{
	public static void main(String args[]) {
		square sq=new square();
		circle cr=new circle();
		rectangle rm=new rectangle();
		geometry gm=new geometry();
		System.out.println("square related ops");
		gm.permit(sq);
		System.out.println("-----------");
		System.out.println("circle related ops");
		gm.permit(cr);
		System.out.println("-----------");
		System.out.println("rectangle related ops");
		gm.permit(rm);

	}
}

