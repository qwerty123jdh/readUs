package com.demo;

public class DemoLambda1 {

	public static void main(String [] args)
	{
		//MyInterface1 m =(x,y)-> {System.out.println("addition :-" +(x+y));};
		//m.add(12,70);
	
	MyInterface1 m = (p1,p2)-> {return (p1.getAge()==p2.getAge());};
	System.out.println(m.add(new Person(12,"XYZ"), new Person(12,"abc")));
	
	}
}
