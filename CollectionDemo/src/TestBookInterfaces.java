import java.util.Scanner;

import com.interfaces.BookIOImplementation;

public class TestBookInterfaces {
 public static void main(String[]args) {
	 
	
 
 Scanner sc= new Scanner(System.in);
 
 BookOperationsImplementation bo = new BookOperationsImplementation();
 BookIOImplementation bb = new BookIOImplementation();
 
 int choice = 0;
 do
 {
	 System.out.println("MENU  :\n0.exit  \n 1. Add Book \n  2. Update Book\n  3. Find by ID \n Enter choice\n 4.Print all books ");
	 
	 choice =sc.nextInt();
	 switch(choice)
	 {
	 case 1:
		 Book bbo;
		 
		 System.out.println("\n Enter number of books");
		 int n = sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
			 bbo = bb.getBook();
			 bo.addBook(bbo);
			 System.out.println("Book Added");
		 }
		 break;
		 
	 case 2: //update entry
		 System.out.println("Enter isbn of book whose entry is to be updated : ");
		 int user_update = sc.nextInt();
		 System.out.println("Enter new name : ");
		 sc.nextLine();
		 String user_new_name = sc.nextLine();
		 
		 Book User_book = new Book(user_update, user_new_name,00d);
		 Book Updated_book = bo.FindBookById(User_book);
		 
		 bo.addBook(Updated_book);
		 break;
		 
		 
	 case 3: // find book by ID
		 
		 System.out.println("Enter Isbn of book to be found"):
			 int user_isbn = sc.nextInt();
		 Book user_book = new Book(user_isbn, "",00d);
		 Book returned _book = bo.FindBookById(user_book);
		 System.out.println(returned_book);
		 break;
		 
	 case 4:
		 bb.printBook(bo.books);
		 default:
			 System.out.println("blah");
	 }
 }while(choice!=0);
 
 
}
}
