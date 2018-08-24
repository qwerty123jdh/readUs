import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.xml.transform.Result;

import com.connections.MyConnection;

public class DemoFetchData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con =MyConnection.getMyconnection();
String FIND_ALL_EMPLOYEES ="SELECT * from employee";
String CREATE_TABLE ="CREATE TABLE EMPPP(EMPID INT CONSTRAINT EMPID PRIMARY KEY, NAME VARCHAR(20), SALARY INT)";

Statement s1;
try {
	s1 = con.createStatement();
	int rows_affected =s1.executeUpdate(CREATE_TABLE);
	System.out.println("table created");
	/*  String INSERT_EMPLOYEE="insert into employee values(1,'CITI',10000)";
	    Statement st = con.createStatement();
	    int rows=st.executeUpdate(INSERT_EMPLOYEE);
	    System.out.println("rows inserted :" +rows);
	*/  
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


//try {
//	Statement st = con.createStatement();
//		ResultSet set =st.executeQuery(FIND_ALL_EMPLOYEES);
//		while(((ResultSet) set).next())
//		{
//			int empId=set.getInt(1);
//			String name=set.getString(2);
//			int salary =set.getInt(3);
//			System.out.println(empId+""+salary);
//		}
//} catch (SQLException e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}

	}

}
