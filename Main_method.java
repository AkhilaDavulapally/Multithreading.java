package com.Multi_threading;
public class Main_method {
public static void main(String[] args) {
			System.out.println("Main starts");
			Akhila a=new Akhila();
			a.start();
			for(char ch='A';ch<='Z';ch++)
			{
				System.out.println("ch:"+ch);
			}
			System.out.println("Main ends");
		}

}
