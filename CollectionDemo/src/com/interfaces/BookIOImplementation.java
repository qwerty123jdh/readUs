package com.interfaces;
import java.util.List;
import java.util.Scanner;

import com.beans.Book;
import com.interfaces.BookIO;

public class BookIOImplementation implements BookIO {
@Override 
public Book getBook()
{
	Scanner sc = new Scanner(System.in);
	Book b = new Book();
	System.out.println("Enter book details :");
	System.out.println("Enter book isbn :");
	b.setIsbn(sc.nextInt());
	System.out.println("Enter book name :");
	sc.nextLine();
	b.setName(sc.nextLine());
	System.out.println("Enter book price");
	b.setPrice(sc.nextDouble());
	
	return b;
	
	
}
@Override 
public void printBook(List)
	
	
}
