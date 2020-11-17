import java.sql.*;
import java.util.*;
class SQLInjection1 {
public static void main(String[] args) throws ClassNotFoundException,SQLException
{
Scanner s = new Scanner(System.in);
System.out.println("Enter UserName :");
String user = s.nextLine();
						//user = "'"+user+"'";
System.out.println("Enter Password :");
String pass = s.nextLine();
						//pass = "'"+pass+"'";
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");

String qry="select count(*) from Student where username=? and password=?";
PreparedStatement st = con.prepareStatement(qry);	
                                         //"select count(*) from Student where username=? and password=?");

st.setString(1,user);
st.setString(2,pass);
ResultSet rs= st.executeQuery();
int cnt = 0;
if(rs.next())
 {
  cnt=rs.getInt(1);
 }
if(cnt==0)
  System.out.println("Invalid Credentials ");
else
  System.out.println("Valid Credentials ");
rs.close();
st.close();
con.close();
}
}