package com.Multi_threading;
import java.util.*;
public class Calculator_main {
public static void main(String[] args) {
	            Thread addThread = new Thread(new Calculator(10, 20, "add"));
		        Thread subThread = new Thread(new Calculator(30, 20, "subtract"));
		        Thread mulThread = new Thread(new Calculator(40, 30, "multiply"));
		        Thread divThread = new Thread(new Calculator(10, 5, "divide"));

		        addThread.start();
		        subThread.start();
		        mulThread.start();
		        divThread.start();
			}
}
