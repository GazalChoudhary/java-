import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class Connection {
	public static void main(String args[]) throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Gazal","gazal18");
			Statement smt=con.createStatement();
			String sql="select * from customer";
			ResultSet rs=smt.executeQuery(sql);
			while(rs.next())
				System.out.println(rs.getInt(1)+ "  "+rs.getString(2));
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
