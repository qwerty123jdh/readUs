package com.pojo;
import com.myabstract.EmployeeIO;
import com.myabstract.Shape;
import com.pojo.Employee;

public class DemoMyClass {

	public static void main(String[] args) {
		EmployeeIO empIO = new EmployeeIO()
				{
			
			@Override
			public void writeEmployee(Employee employee)
			{
				employee.display();
			}
			@Override
				public Employee readEmployee() {
					// TODO Auto-generated method stub
					return new Employee();
				}
			
				};
		// TODO Auto-generated method stub
Employee emp =empIO.readEmployee();
empIO.writeEmployee(emp);
	}

}
