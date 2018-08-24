import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookOperations;
public class BookOperationsImplementation implements BookOperations {

	List<Book> books = new ArrayList()<Book>();
	
	@Override 
	public int addBook(Book book)
	{
		books.add(book);
		return 0;
	}
	
	@Override
	public boolean deleteBook(Book book)
	{
		books.remove(book);
		return true;
	}
	@Override
	public Book FindBookById(Book book)
	{
		boolean found;
		Iterator<Book> boo = books.iterator();
		
		if(book.getName().equals(""))
		{
			while(boo.hasNext())
			{
				Book boo1;
				boo1.boo.next();
				if(boo1.getIsbn()==book.getIsbn())
					book=(Book) boo1;
			}
		}
		else 
		{
			Book boo2 = null;
			while(boo.hasNext())
			{
				boo2 = boo.next();
				if(boo2.getIsbn()==book.getIsbn)
				{
					book.setPrice(boo2.getPrice());
					break;
				}
			}
			deleteBook(boo2);
		}
	return book;
	}
	
	
}
