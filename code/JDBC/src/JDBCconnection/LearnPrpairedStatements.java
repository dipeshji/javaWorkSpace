/*
 * Prepared statements solve the problem of sql injection
*/

package JDBCconnection;
import java.sql.*;
import java.util.Scanner;

public class LearnPrpairedStatements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/classicmodels", "root","1234");
			String query = "select * from employees";
			PreparedStatement pst = con.prepareStatement(query);
			ResultSet set = pst.executeQuery();
//			while(set.next()) {
//				System.out.println(set.getInt(1) + "   " +set.getString(3)+"      "+set.getString(2));
//			}
			set.close();
//			===================insert data===================
			String empQuery = "insert into employees values (?,?,?,?,?,?,?,?)";
			PreparedStatement empPst = con.prepareStatement(empQuery);
			empPst.setInt(1, 2610);
			empPst.setString(2, "Patidar");
			empPst.setString(3, "Dipesh");
			empPst.setString(4, "asa");
			empPst.setString(5, "dfg");
			empPst.setString(6, "Dipewesh");
			empPst.setInt(7, 1056);
			empPst.setString(8, "Dipeasdassh");
			int rs = empPst.executeUpdate();
			ResultSet res = empPst.getResultSet();
			System.out.println(rs);
			if(rs>0) {
				while(res.next()) {
					System.out.println(res.getInt(1) + "   " +res.getString(3)+"      "+res.getString(2));
				}
			}else
				System.out.println("no data inserted");
			empPst.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
