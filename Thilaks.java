package com.Multi_threading;
public class Thilaks extends Thread {
	Magic m;
	public Thilaks(Magic m)
	{
		this.m=m;
	}
	public void run()
	{
		for(int i=10;i>0;i--)
		{
			m.Thilaks(i);
		}
		try
		{
			sleep(1000);
		}
		catch(Exception e)
		{
			
		}
	}
}
