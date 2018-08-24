import java.util.Scanner;

import com.pojo.Employee;

public class testEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		System.out.println("Enter name");
		String name =s.nextLine();
		System.out.println("Enter age");
		int age = Integer.parseInt(s.next());
		System.out.println("Enter Id");
		int Id=Integer.parseInt(s.next());
		System.out.println("Enter Salary");
		double Salary = Double.parseDouble(s.next());
		
		Employee emp = new Employee(Id, Salary, age, name);
		emp.show();
		s.close();
		
	}

}
