
import java.sql.*;
import java.util.*;

public class A2Q2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String find;
		int enrollment;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop_assign2", "root", "");
			
			System.out.print("Enter enrollment number whose details you want to display:");
			enrollment = sc.nextInt();
			find = "select * from StudentPortal where enroll=" + enrollment;
			PreparedStatement obj = con.prepareStatement(find);
			ResultSet rs = obj.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getDouble(3) + " " + rs.getDouble(4)
						+ " " + rs.getDouble(5) + " " + rs.getDouble(6));
			}
			obj.close();
			con.close();
			sc.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}