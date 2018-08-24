package com.beans;

public class Book {
	
	private String isbn;
	private String name;
	private String publication;
	private String author;
	
	
	public Book()
	{
	isbn ="One";
	name = "Core Java";
	publication="My Publication";
	author = "Sen";
	}
	

@Override
public String toString() {
	return "Book [isbn=" + isbn + ", name=" + name + ", publication=" + publication + ", author =" + author + "]";
}


public Book(String isbn, String name, String publication, double price) {
	super();
	this.isbn = isbn;
	this.name = name;
	this.publication = publication;
	this.author = author;
}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
