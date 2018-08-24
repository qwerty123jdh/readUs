package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestPerform {
	@PerformOperation()
	public static void display()
	{
		System.out.println("display");
	}
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TestPerform test = new TestPerform();
Class class1 =test.getClass();

Method[] methods = class1.getMethods();
for(Method method:methods)
{
	 Annotation[] annotations =method.getAnnotations();
	 for (Annotation anno : annotations)
	 {
	 
		 if(anno.annotationType().equals(PerformOperation.class))
		 {
			 PerformOperation m =(PerformOperation)anno;
			 int sum = m.number1() + m.number2();
			 System.out.println(sum);
		 }
		 
	 }
}
	}

}
