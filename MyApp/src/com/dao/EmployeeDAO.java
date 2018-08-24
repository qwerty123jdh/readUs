package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connections.MyConnection;

public class EmployeeDAO {
 
	public List <Employee> findAllEmployees()
	{
		Connection con = MyConnection.getMyconnection();
		List<Employee> employees = new ArrayList<>();
		
		String SELECT_ALL="select * from EMPLOYEE";
		try {
			Statement st=con.createStatement();
			ResultSet set= st.executeQuery(SELECT_ALL);
			while(set.next())
			{
				Employee employee = new Employee();
				employee.setEmpId(set.getInt(1));
				employee.setName(set.getString(2));
				employee.setEmpSalary(set.getInt(6));
				employees.add(employee);
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employees;
	}
}