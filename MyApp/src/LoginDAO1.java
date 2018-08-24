import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.connections.MyConnection;

public class LoginDAO1 {
 public boolean checkLogin(String username, String password)
 {
	boolean success = false;
	
	Connection con = MyConnection.getMyconnection();
	String CHECK_LOGIN= "select username, password from login where username =? and passwrod =?";
	PreparedStatement ps;
	try {
		ps= con.prepareStatement(CHECK_LOGIN);
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet set= ps.executeQuery();
		
		while(set.next())
		{
			user=set.getString(1);
			pwd=set.getString(2);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return success; 
 }
 
}
