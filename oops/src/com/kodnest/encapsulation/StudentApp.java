package com.kodnest.encapsulation;

public class StudentApp {
private int rollnum;
private String name;
private int age;
private double percentage;


public void setData(int rollnum,String name,int age,double percentage)
{
	this.rollnum=rollnum;
	this.name=name;
	this.age=age;
	this.percentage=percentage;
}
public int getrollnum()
{
	return rollnum;
}
public String getname()
{
	return name;
}
public int getage()
{
	return age;
}
public double getpercentage()
{
	return percentage;
}
}
