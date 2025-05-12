package com.Multi_threading;
public class Serving extends Thread {
	Restaurant r;

	public Serving(Restaurant r)
	{
		this.r=r;
	}
    public void run()
	{
		int i=1;
		while(true)
		{
			try {
			   r.Serving(i);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
			i++;
			try {
				
			   Thread.sleep(10000);
		}
		   catch(Exception e)
		{
	
		}
	}
	}
}
		


	
