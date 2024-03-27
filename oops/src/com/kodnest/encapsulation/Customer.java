package com.kodnest.encapsulation;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter ur pin");
int pin=sc.nextInt();

System.out.println("enter the amt");
int amt=sc.nextInt();

Bank b1=new Bank();
b1.setData(pin,amt);
System.out.println(b1.getData(pin,amt));
	}

}
