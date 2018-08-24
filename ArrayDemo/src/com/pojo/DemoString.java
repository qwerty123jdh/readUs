package com.pojo;
import java.util.*;

public class DemoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s =new Scanner (System.in);
		
		System.out.println("Enter a string name : ");
		String name= s.nextLine();
		
		System.out.println("Enter another string");
		String name1= s.nextLine();

System.out.println(name.codePointBefore(2));
		
		if (name1.equals(name))
            System.out.println("Equal");
		else 
			System.out.println("Not Equal");
	}

}
