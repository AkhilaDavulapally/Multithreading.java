package com.Multi_threading;
public class Main_method_synchronized {
	public static void main(String[] args) {
		System.out.println("Main starts");
		Magic m=new Magic();
		Akhilad a=new Akhilad(m);
		Thilaks t=new Thilaks(m);
		a.start();
		t.start();
		System.out.println("Main ends");
	}
}
