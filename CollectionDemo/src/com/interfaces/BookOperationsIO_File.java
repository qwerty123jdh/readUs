package com.interfaces;
import java.util.List;
import java.io.FileInputStream;

import com.beans.Book;
public interface BookOperationsIO_File {
	
	public List<Book> readDataFromFile();
	
	public boolean writeDataToFile(List<Book>books);
	public int addBook(Book book);
	public boolean deleteBook(Book book);
	public Book findBookById(Book book);

}
