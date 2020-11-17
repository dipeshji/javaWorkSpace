import java.sql.*;

public class PreparedStatmentDemo1 {
	 
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
        Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Prestige","root","root");
	String qry = "insert into employee values (?,?,?,?,?) "; //place holder or Parameter 
        PreparedStatement ps = con.prepareStatement(qry);
    	 ps.setInt(1,5004);
	 ps.setString(2, "Suresh");
	 ps.setString(3, "Ratlam");
	 ps.setFloat(4, 878.9f);
	 ps.setString(5,"d2");
	 ps.executeUpdate();
	 ps.close();
	 con.close();
}

}
