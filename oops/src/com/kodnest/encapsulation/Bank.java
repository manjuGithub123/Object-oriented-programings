package com.kodnest.encapsulation;

public class Bank {
private int totalamt= 100000;
private int pin= 7259;


public void setData(int key,int amt)
{
	if(key==pin)
	{
	totalamt=totalamt-amt;	
	}
	else
	{
		System.out.println("invalid customer");
		System.exit(0);
	}}
	public int getData(int key,int amt)
	{
		if(key==pin)
		{
			System.out.println("the given amt is"+amt);
			System.out.println("the amt to be withdraw is"+amt);
			return totalamt;
		}
		else
		{
		System.out.println("invalid customer");	
		return -1;
		}
		
	
}
}
