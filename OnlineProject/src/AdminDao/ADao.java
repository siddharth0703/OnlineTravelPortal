package AdminDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ADao {
	public String doGetCredentials(String uname) {
		String pass = "";
		Connection con = ConectionUtil.getConnection();
		String query = "select pass from Admin where uname=?";
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, uname);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {

				pass = rs.getString(1);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return pass;
	}
	
	public String doGetCredentialsforUser(String uname) {
		String pass = "";
		Connection con = ConectionUtil.getConnection();
		String query = "select password from Customer where username=?";
		try {
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setString(1, uname);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {

				pass = rs.getString(1);
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return pass;
	}
	
	
}
