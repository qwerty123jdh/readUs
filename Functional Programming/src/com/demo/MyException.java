package com.demo;

public class MyException extends Exception {
	private String message;
	public void MyException()
	{
		message="You got XXXX exception";
	}
	public MyException(String message)
	{
		super();
		this.message=message;
	}
	public void showCause()
	{
		System.out.println("You got XXXX exception");
	}
@Override
public void printStackTrace() {
	// TODO Auto-generated method stub
	super.printStackTrace();
	System.out.println("This is my message");
}
}
