package datbase_testing;

import java.sql.Connection;
import java.sql.DriverManager;

/**
*
*@author Sanjeev Chaudhary
*https://github.com/sanjeevss3/
*
*/

public class Test {

	public static void main(String[] args) {
		Connection conn=null;
		try {
			conn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306//selenium","root", null);
			
			if(conn!=null) {
				System.out.println("Database connection done successfully");
			}
		}catch (Exception e) {
			System.out.println("Not Connected to Database");
		}
	}
}
