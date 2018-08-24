package com.dao;

import java.util.List;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.beans.Book;
import com.connections.MyConnection;

public class BookDAOImpl implements BookDAO  {
private static Connection con;
	
	

	@Override
	public boolean addBook(Book book) {
		// TODO Auto-generated method stub
			String INSERT_BOOK = "insert into book values (?,?,?,?)";	
		PreparedStatement ps;
		try{
			
			ps= MyConnection.getMyconnection().prepareStatement(INSERT_BOOK);
			ps.setString(1, book.getIsbn());
            ps.setString(2, book.getName());
            ps.setString(3, book.getPublication());
            ps.setString(4, book.getAuthor());
            ps.executeQuery();
		
		
		}catch (SQLException e)
		{
			e.printStackTrace();
		}
;		
		return true;
	}
	@Override
	public int updateBook(Book Book, String ISBN) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteBook(String ISBN) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public Book findBookByISBN(String ISBN) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> findBooksByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> findAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Book> findBooksByAuthor(String auth_name) {
		// TODO Auto-generated method stub
		return null;
	}
}

