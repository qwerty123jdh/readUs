package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;



public class MyBookLambdaDemo {

	public static void main(String[]args)
	{
		List<Book> books =new ArrayList<Book>();
		List<String> l = new ArrayList<>();

		books.add(new Book());
		books.add(new Book(123, "ADV JAVA", "Oracle",1234d));
		books.add(new Book (300, "Adv Java", "Oracle", 2000d));
		books.add(new Book(123, "Adv Java", "Oracle",1234d));
		
		//System.out.println(books);
		books.stream().filter(data -> {return data.getName().endsWith("a");}).collect(Collectors.toList()).forEach(System.out::println);
	}
}
