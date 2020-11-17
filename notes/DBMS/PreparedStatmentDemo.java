import java.sql.*;

public class PreparedStatmentDemo {
	static Connection con;
	static PreparedStatement ps;
	
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
	 getConnection();
	 ps.setInt(1,5005);
	 ps.setString(2, "XYZ");
	 ps.setString(3, "Indore");
	 ps.setFloat(4, 4345.56f);
	 ps.setString(5,"d2");
	 ps.executeUpdate();
	 ps.close();
	 con.close();
}

static void getConnection() throws ClassNotFoundException,SQLException 
{
	Class.forName("com.mysql.jdbc.Driver");
	String qry = "insert into employee values (?,?,?,?,?) ";
	 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Prestige","root","root");
	 ps = con.prepareStatement(qry);
}
}
