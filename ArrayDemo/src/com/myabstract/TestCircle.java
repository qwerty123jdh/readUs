package com.myabstract;
import com.myabstract.Shape;
import com.myabstract.Circle;

public class TestCircle {
	public static void main(String[]args)
	{
		Shape s = new Circle(4,"circle");
		double a =s.area();System.out.println("Area " +a);
		
	}
	

}
