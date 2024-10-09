package com.oops.p1;
class os{
	float version;
	String name;
	public os(float version,String name) {
		super();
		this.version=version;
		this.name=name;
	}
	public float getversion() {
		return version;
	}
	public String getname() {
		return name;
}
}
class charger{
	float volts;
	String brand;
	public charger(float volts,String brand) {
		super();
		this.volts=volts;
		this.brand=brand;
	}
	public float getvolts() {
		return volts;
	}
	public String getbrand() {
		return brand;
}
}
 class mobile {
	os s=new os(7.7f,"android");
	void hascharger(charger c) {
		System.out.println(c.getvolts());
		System.out.println(c.getbrand());
	}

}
public class hasarelation{
	public static void main(String args[]) {
		charger c=new charger(5.6f,"samsung");
		mobile m=new mobile();
		System.out.println(m.s.getname());
		System.out.println(m.s.getversion());
		m.hascharger(c);
		m=null;
		System.out.println(c.getvolts ());
		System.out.println(c.getbrand());
		System.out.println(m.s.getname());
		System.out.println(m.s.getversion());
		m.hascharger(c);
	}
}
