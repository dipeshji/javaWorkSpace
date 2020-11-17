import java.sql.*;
import java.util.Scanner;
class JdbcExample
{
public static void main(String[] ar) throws ClassNotFoundException, 
                                                           SQLException
{ Scanner sc = new Scanner(System.in);
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection
                  ("jdbc:mysql://localhost:3306/Sample","root","root");
Statement st = con.createStatement();
System.out.println("enter a integer value");
//int n = sc.nextInt();
String s = sc.next();//s="'"+s+"'"  "Select * from table1 where b ="+s
boolean res =st.execute("Select * from table1 where b ='"+s+"'");
System.out.println(res);
   ResultSet rs = st.getResultSet();


   while(rs.next())
{
System.out.println(rs.getInt("a")+"    "+rs.getString(2)+"   "+
                                    rs.getString(3)+"   "+rs.getInt(4));
}



/*
int i = st.executeUpdate("delete from table1 where a =1010");
System.out.println(i);
if(i==1)
 System.out.println("Only one record deleted");
else
System.out.println("more than one records deleted"); */








// //"insert into table1 values(100,'fd','re',101)");
//int i = st.executeUpdate("update table1 set a =50 where a = 10");
//System.out.println("records updated :"+i);
/*
ResultSet rs = st.executeQuery("Select * from table1");
while(rs.next())
{
System.out.println(rs.getInt("a")+"    "+rs.getString(2)+"   "+
                                    rs.getString(3)+"   "+rs.getInt(4));
} */


System.out.println(con.getClass().getName());
System.out.println(st.getClass().getName());
System.out.println(rs.getClass().getName());
}
}


class JdbcExample1
{
public static void main(String[] ar) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
Statement st = con.createStatement();
 boolean f = st.execute("select * from table1");
System.out.println(f);
ResultSet rs = st.getResultSet();
while(rs.next())
{
System.out.println(rs.getInt(1)+"    "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getInt(4));
} 
/* boolean f = st.execute("insert into table1 values (101,'fd','re',1003)");
System.out.println(f);
int i = st.getUpdateCount();
System.out.println("No of records updated :"+i); */
rs.close();
st.close();
con.close();
}
}



class JdbcExample2
{
public static void main(String[] ar) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
Statement st = con.createStatement();
con.setAutoCommit(false);
int i = st.executeUpdate("update table1 set a= 101 where a= 100");
if(i<=3)
 con.commit();
else 
 con.rollback();
}
}

class JdbcExample3
{
public static void main(String[] ar) throws ClassNotFoundException, SQLException
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sample","root","root");
Statement st = con.createStatement();
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int i = st.executeUpdate("update table1 set a= 14 where a=" + n);
}
}