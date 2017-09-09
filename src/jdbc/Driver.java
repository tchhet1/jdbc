package jdbc;

import java.sql.*;

public class Driver {
	
	public static void main (String[] args) {
	
	try {
		//get connection
		Connection myconn = DriverManager.getConnection("jdbc:mysql://localhost:8888/dbProject", "root", "chitwan88");
		
		//create connection 
		Statement myStmt = myconn.createStatement();
		
		// execute sql query
		ResultSet myRs = myStmt.executeQuery("select * from college");
		
		System.out.println("Name");

		//process the result set
		while(myRs.next()) {
			System.out.println(myRs.getString("Name") + " , " + myRs.getString("Phone"));
			//System.out.println(myRs.getString("Name"));

		}
		
	
	}
	catch (Exception exc) {
		
		exc.printStackTrace();
	}
}
}


