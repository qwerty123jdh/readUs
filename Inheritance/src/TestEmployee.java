import com.pojo.Employee;
import com.pojo.Person;
public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Person p1= new Person(12,"ABC");
	Person p2= new Person(12,"ABC");
	
	if (p1.equals(p2))
		System.out.println("both are Equal");
	else
		System.out.println("Not Equal");
		//emp.show();
      
	}

}
