package com.connections;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {
	
	public void addEmployee(Employee emp)
	{
	String INSERT_EMPLOYEE = "insert into employee values(?, ?, ?)";
	int r=0;
	try{
		PreparedStatement ps =MyConnection.getMyconnection().prepareStatement(INSERT_EMPLOYEE);
		
		ps.setInt(1,emp.getEmpId());
		ps.setString(2, (emp).getName());
		ps.setInt(3, (int) emp.getEmpSalary());
		r=ps.executeUpdate();
		}catch(SQLException e)
	{
			e.printStackTrace();
	}
	}
	
	
	}

public List<Employee> finAllEmployees(){
	List<Employee> employees = NEW ArrayList<>();
	String FIND_ALL_EMPLOYEES ="select * from employee";
	try
	{
		Statement st = MyConnection.getMyconnection().createStatement();
		ResultSet set=st.executeQuery(FIND_ALL_EMPLOYEES);
		while(set.next())
		{
			int empId=set.getInt(1);
			String name = set.getString(2);
			int salary =set.getInt(3);
			Employee emp = new Employee(empId, salary,name);
			employees.add(emp);
		}
	}catch (SQLException e)
	{
		e.printStackTrace();
	}
return employees;

public void updateEmployee(int empId, Employee employee)
{
Employee emp = new Employee();
String UPDATE_EMPLOYEE=" update employee set salary=? where  empId=?";
try{
	PreparedStatement ps = MyConnection.getMyconnection().prepareStatement(UPDATE_EMPLOYEE);
     ps.setInt(1,employee.getSalary());
     ps.setInt(2, empId);

int row=ps.executeUpdate();
if(row>0)
	emp=employee;

}
catch(SQLException e)
{
e.printStackTrace();	
}
return emp;
}

public Employee findEmployeeById(int empId)
{
Employee emp = new Employee();
String Find_By_Id="select * from employee where empId =?";
try {
PreparedStatement ps=MyConnection.getMyconnection().prepareStatement(Find_By_Id);
ps.setInt(1, empId);

ResultSet set =ps.executeQuery();
while(set.next())
{
emp = new Employee(set.getInt("empId"), set.getInt("salary"), set.getString("name"));
}
}
catch(SQLException e)
{
e.printStackTrace();	
}
return emp;




}
}







}















}