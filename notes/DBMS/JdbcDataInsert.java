import java.sql.*;
class JdbcDataInsert
{
 public static void main(String[] ar) throws ClassNotFoundException, 
                                                           SQLException
  {
  Class.forName("com.mysql.jdbc.Driver");


  Connection con=DriverManager.getConnection
                  ("jdbc:mysql://localhost:3306/online","root","root");
  Statement stmt = con.createStatement();

  int res=stmt.executeUpdate("insert into dep values('d8','Sales','Indore')");
  if(res==1)
      System.out.println("Record Deleted");
   else
       System.out.println("Record is not Deleted");
  System.out.println(con.getClass().getName());
  System.out.println(stmt.getClass().getName());
  }
}