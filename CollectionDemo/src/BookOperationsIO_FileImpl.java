import java.io.BufferedReader;
import java.util.List;

import com.beans.Book;
import com.interfaces.BookOperationsIO_File;

public class BookOperationsIO_FileImpl implements BookOperationsIO_File {

	@Override
	public List<Book> readDataFromFile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean writeDataToFile(List<Book> books) {
		BufferedReader br = new BufferedReader(System.in);
		
		
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int addBook(Book book) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteBook(Book book) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Book findBookById(Book book) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
