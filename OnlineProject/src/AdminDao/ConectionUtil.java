package AdminDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionUtil {
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "user6");
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException ce) {
			ce.printStackTrace();
		}
		return con;
	}
}
