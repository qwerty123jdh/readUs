import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> m = new HashMap<>();
		m.put("Citi", "Pune");
		m.put("Wipro", "Hinjewadi");
		m.put("Accenture","Malad");
		
		System.out.println(m);
		
		m.put("Wipro", "Hyderabad");
		System.out.println("After duplicate key");
		System.out.println(m);
				
		Set<Entry<String,String>> entries =m.entrySet();
		Iterator<Entry<String,String>> iterator = entries.iterator();
		while(iterator.hasNext())
		{
			Entry<String,String> entry = iterator.next();
			
			System.out.println(entry.getKey()+": :"+entry.getValue());
		}

	}

}
