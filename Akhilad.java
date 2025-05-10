package com.Multi_threading;
public class Akhilad extends Thread {
	Magic m;
	public Akhilad(Magic m)
	{
		this.m=m;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			m.Akhilad(i);
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
