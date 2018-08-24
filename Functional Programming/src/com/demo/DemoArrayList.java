package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList {

	public static void main(String[]args)
	{
		List<String> l = new ArrayList<>();
		l.add("ABC");
		l.add("XYZ");
		l.add("C");
		l.add("LMN45");
		l.add("ABC45");
		
		System.out.println(l);
		l.forEach(System.out::println);
           
		System.out.println("testing");
		
		l.stream().filter(data -> {return data.length()>=3;}).collect(Collectors.toList()).forEach(System.out::println);
	
	
	}
}
