package com.Multi_threading;
public class Calculator implements Runnable {
	private double num1;
    private double num2;
    private String operation;

    public Calculator(double num1, double num2, String operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    @Override
    
	    public void run()
	    {
    	switch(operation)
		{
		case "add":
		{
			System.out.println("Addition:"+(num1+num2));
		}
		break;
		case "subtract":
		{
			System.out.println("Subtraction:"+(num1-num2));
		}
		break;
		case "multiply":
		{
			System.out.println("Multiplication:"+(num1*num2));
		}
		break;
		case "divide":
		{
			System.out.println("Division:"+(num1/num2));
		}
		break;
		default:
		{
			System.out.println("Enter the correct operation");
		}
	}
	    }
}
	     
