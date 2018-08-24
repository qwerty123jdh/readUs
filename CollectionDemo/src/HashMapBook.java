import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.beans.Book;

public class HashMapBook {
	
	public static void main(String[]args)
	{
		Map<String, List<Book>> m =new HashMap<>();
		List<Book> books_java=new ArrayList<Book>();
		books_java.add(new Book(1, "Java1", "Oracle", 100d));
		books_java.add(new Book(12, "Java2", "Oracle", 200d));
		books_java.add(new Book(67, "Adv Java1", "Oracle", 100d));
		m.put("Java", books_java);
		
		List<Book> books_dotNet
= new ArrayList<Book>();
		books_dotNet.add(new Book(1,".Net 1", "Microsoft", 100d));
		books_dotNet.add(new Book(12, ".NET 2", "Microsoft", 200d));
		books_dotNet.add(new Book(67, "C#", "Microsoft", 100d));
		m.put("DOT NET", books_dotNet);
		
		List<Book> books_stories = new ArrayList<Book>();
		books_stories.add(new Book(1, "Ramayana", "publi1", 100d));
		books_stories.add(new Book(12, "Mahabharata", "publication 2", 200d));
		m.put("Stories", books_stories);
		
		System.out.println(m);
		
		Set<Entry<String,List<Book>>> entries = m.entrySet();
		Iterator<Entry<String, List<Book>>> iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Entry<String,List<Book>> entry = iterator.next();
			System.out.println("**BOOK CAT :-  "+entry.getKey()+ "**");
			List<Book>books=entry.getValue();
			for (Book book:books)
			{
				System.out.println(book.getName() + "-->" +book.getIsbn());
			}
		}
		
		
	}

}
