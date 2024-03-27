package com.kodnest.inhertince;

public class RobotApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot rr=new Robot();
rr.talk();
rr.walk();
rr.charge();
System.out.println("        ");
Teacher tr=new Teacher();
tr.teach();
tr.talk();
tr.walk();
System.out.println("         ");
Shief sh=new Shief();
sh.cook();
sh.talk();
sh.walk();
System.out.println("          ");
Doctor dr=new Doctor();
dr.surgery();
dr.talk();
dr.walk();
	}

}
