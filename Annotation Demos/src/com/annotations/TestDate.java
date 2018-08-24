package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestDate {
	@MyDate(day= 13, month = "August", year=2018)
	public static void display()
	{
		System.out.println("display");
	}
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TestDate test = new TestDate();
     Class class1 =test.getClass();
     
     Method[] methods = class1.getMethods();
     for(Method method:methods)
     {
    	 Annotation[] annotations =method.getAnnotations();
    	 for (Annotation anno : annotations)
    	 {
    	 
    		 if(anno.annotationType().equals(MyDate.class))
    		 {
    			 MyDate m =(MyDate)anno;
    			 int day =m.day();
    			 System.out.println(day+"/"+m.month()+"/"+m.year());
    		 }
    		 
    	 }
     }
	}

}
