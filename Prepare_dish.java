package com.Multi_threading;
public class Prepare_dish extends Thread {
	Restaurant r;
	public Prepare_dish(Restaurant r)
	{
		this.r=r;
	}
	public void run()
	{
		int i=1;
		while(true)
		{

			try {
			   r.Prepare_dish(i);
			i++;
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	}
}
