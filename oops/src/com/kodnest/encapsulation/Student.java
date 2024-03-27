package com.kodnest.encapsulation;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentApp s1=new StudentApp();
s1.setData(10,"manju",23,89.11);
System.out.println(s1.getrollnum());
System.out.println(s1.getname());
System.out.println(s1.getage());
System.out.println(s1.getpercentage());

System.out.println();
StudentApp s2=new StudentApp();
s2.setData(20,"sanju", 19,88.99);
System.out.println(s2.getrollnum());
System.out.println(s2.getname());
System.out.println(s2.getage());
System.out.println(s2.getpercentage());
	}

}
