package datbase_testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class ConnectMySQL {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); //This is optional
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium", "root", null);
		Statement smt = conn.createStatement();
		ResultSet rs = smt.executeQuery("select * from employee");

		while (rs.next()) {
			String salary = rs.getString("salary");
			System.out.println("Database Records are: " + salary);
		}
	}

}
