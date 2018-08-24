package com.annotations;

public class TestAnnotation {
	@MyAnnotation(value=100)
	public static void display()
	{
		System.out.println("display");
	}
	public static void main(String[]args)
	{
		display();
	}

}
