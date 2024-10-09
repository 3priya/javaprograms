package com.stringprgms.p1;
public class stringmethods {
	public static void main(String args[]) {
String str = "raja ram mohan roy";
String res1=str.toUpperCase();
System.out.println(res1);
String res2=str.toLowerCase();
System.out.println(res2);
int res3=str.length();
System.out.println(res3);
boolean res4=str.endsWith("Raja");
System.out.println(res4);
boolean res5=str.startsWith("Raj");
System.out.println(res5);
boolean res6=str.contains("mohan");
System.out.println(res6);
char res7=str.charAt(7);
System.out.println(res7);
int res8=str.charAt(7);
System.out.println(res8);
int res9=str.indexOf('a');
System.out.println(res9);
int res10=str.indexOf('z');
System.out.println(res10);
	}
}

