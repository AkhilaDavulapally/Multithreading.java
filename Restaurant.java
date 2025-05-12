package com.Multi_threading;
public class Restaurant {
int order_no;
boolean complete=false;
synchronized public void Prepare_dish(int order_no) throws Exception {
	if(complete)
	{
		wait();
		
	}
	this.order_no=order_no;
	System.out.println("The dish"+order_no+"is prepared");
	complete=true;
	notify();
}
synchronized public int Serving() throws Exception {
	if(!complete)
	{
		wait();
		
	}
	System.out.println("The dish"+order_no+"is served");
	complete=false;
	notify();
	return order_no;
}
}
