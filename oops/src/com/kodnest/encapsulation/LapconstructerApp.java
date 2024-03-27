package com.kodnest.encapsulation;

public class LapconstructerApp 
{
	private String processor;
	private int memorysize;
	public  LapconstructerApp(String processor,int memorysize)
	{
		this.processor=processor;
		this.memorysize=memorysize;
	}
	public String getprocessor()
	{
		return processor;
	}
	public int getmemorysize()
	{
		return memorysize;
	}
}
