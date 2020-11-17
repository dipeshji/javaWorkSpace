import java.sql.*;
class JdbcExam
{
public static void main(String[] ar) throws ClassNotFoundException, 
                                                           SQLException
{
    Class.forName("com.mysql.jdbc.Driver");
   Connection con = DriverManager.getConnection
                  ("jdbc:mysql://localhost:3306/Sample","root","root");
   Statement st = con.createStatement();
   con.setAutoCommit(false);
    int count=st.executeUpdate("update table1 set a=501 where a=500");
    if(count==2)
       con.rollback();
    else
       con.commit();  
   System.out.println("Number of records updated :"+count);
   st.close(); 
   con.close();
}
}