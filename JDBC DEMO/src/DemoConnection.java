import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Connection con =null;
		try {
	Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	try {
		 con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI", "sa", "sa123");
	  con.setAutoCommit(false)
	  ;
		 
		 System.out.println("connection successful");
		    
	    
	    
	    Statement st = con.createStatement();
	    
	    st.executeUpdate("insert into emp values(91,'CITI',10000)");
	    st.executeUpdate("insert into emp values(92,'CITI', 10000)");
	    st.executeUpdate("insert into emplvalues(1,'CITI', 10000)");
	    st.executeUpdate("insert into emp values(94,'CITI',10000)");
	    con.commit();
	    
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		try {
			con.rollback();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
