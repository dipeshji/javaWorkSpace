import java.sql.*;
import java.util.Scanner;
public class PreparedStatmentDemoMultiPle {
	static Connection con;
	static PreparedStatement ps;
	
public static void main(String[] arg) throws ClassNotFoundException,SQLException
{     Scanner sc = new Scanner(System.in);
	 getConnection();
	 System.out.println("How many records you want to inset");
	 int n = sc.nextInt();
	 for(int i = 1;i<=n;i++)
	 {
		System.out.println("Enter record No : "+i);
		 int e =sc.nextInt();
	 	 ps.setInt(1,e);
	 	 String s = sc.next();
	 ps.setString(2, s);
	 String s1 = sc.next();
	 ps.setString(3, s1);
	 float s2 = sc.nextFloat();
	 ps.setFloat(4, s2);
	 String s3 = sc.next();
	 ps.setString(5,s3);
	 ps.executeUpdate();
	 }
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
