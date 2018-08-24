package com.pojo;

public class DemoStringBuffer1 {
	
	public static void main(String[] args)
	{
		StringBuilder builder = new StringBuilder("city 1");
		System.out.println("initial value " +builder);
		builder.append(",EON");
		
		System.out.println("new value :" +builder);
	}

}
