import java.sql.*;
class JdbcConcept
{
 public static void main(String[] s) throws ClassNotFoundException,SQLException
{
 Class.forName("com.mysql.jdbc.Driver");

 Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
 Statement st = con.createStatement();
 con.setAutoCommit(false);
int i= st.executeUpdate("insert into table1(d) values(210)");
if(i == 1) 
 con.commit();
else 
  con.rollback();
System.out.println(con.getClass().getName());
 System.out.println(st.getClass().getName());
 }
}