import java.sql.*;

public class PreparedStatmentDemo2 {
	 
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
        Class.forName("com.mysql.jdbc.Driver");
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Prestige","root","root");
	String qry = "select * from employee "; //place holder or Parameter 
        PreparedStatement ps = con.prepareStatement(qry);
    	 ResultSet rs = ps.executeQuery();
         rs.first();
       System.out.println(rs.getInt(1));
	 ps.close();
	 con.close();
}

}
