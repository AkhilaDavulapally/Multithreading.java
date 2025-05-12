package com.Multi_threading;
public class Dining {
	public static void main(String[] args) {
		Restaurant r=new Restaurant();
		Prepare_dish p=new Prepare_dish(r);
		Serving s=new Serving(r);
		p.start();
		s.start();
	}
}
