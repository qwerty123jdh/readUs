package com.dao;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.beans.Book;
import com.connections.MyConnection;

	public class TestBookDAO1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Connection con = MyConnection.getMyconnection();
			
//			String CREATE_TABLE = "CREATE TABLE BOOKS (ISBN INT CONSTRAINT ISBN_PK PRIMARY KEY, NAME VARCHAR(20),"
//			                        + "PUBLICATION varchar(20))";
//					
			                        Statement st;
			try {
				st= con.createStatement();
//				st.executeUpdate(CREATE_TABLE);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(" Table started");
			
			BookDAOImpl bb= new BookDAOImpl();
			Scanner sc = new Scanner(System.in);
			int ch=0;
			do
			{
				System.out.println("Menu---- \n 0. Exit \n 1. Add Book \n 2. Update Book \n 3. Display All Books \n 4. Find Books by Name");
				ch=sc.nextInt();
				switch(ch)
				{
				case 1:
					Book b = new Book();
					System.out.println("Enter book details :");
					System.out.println("Enter book isbn :");
					b.setIsbn(sc.nextLine());
					System.out.println("Enter book name :");
					b.setName(sc.nextLine());
					System.out.println("Enter the publication");
					b.setPublication(sc.nextLine());
					System.out.println("Enter the author name");
					sc.nextLine();
					b.setAuthor(sc.nextLine());
					
					bb.addBook(b);
					System.out.println("Book details added");
					break;
					
				case 2:
					break;
					
				case 3:
					break;
				case 4:
					break;
				
				}
			}while(ch!=0) ;
		}

		}






