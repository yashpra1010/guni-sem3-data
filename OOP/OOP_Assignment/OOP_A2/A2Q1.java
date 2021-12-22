//package Assigment2;

import java.sql.*;
import java.util.*;

public class A2Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String create, insert, id, name;
		int i, n;
		double mark1, mark2, mark3, avg;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_assign2", "root", "");
			create = "create table StudentPortal(enroll varchar(20),name varchar(20),mark1 double(10,2),mark2 double(10,2),mark3 double(10,2),Avg double(10,2))";
			PreparedStatement obj = con.prepareStatement(create);
			obj.execute();
			insert = "insert into StudentPortal values(?,?,?,?,?,?)";
			PreparedStatement obj1 = con.prepareStatement(insert);
			System.out.print("Enter number of Data ypu want to insert:");
			n = sc.nextInt();
			for (i = 0; i < n; i++) {
				System.out.print("Enter Enrollment number:");
				id = sc.next();
				System.out.print("Enter Name:");
				name = sc.next();
				System.out.print("Enter marks of subject 1:");
				mark1 = sc.nextDouble();
				System.out.print("Enter marks of subject 2:");
				mark2 = sc.nextDouble();
				System.out.print("Enter marks of subject 3:");
				mark3 = sc.nextDouble();
				avg = (mark1 + mark2 + mark3) / 3;
				obj1.setString(1, id);
				obj1.setString(2, name);
				obj1.setDouble(3, mark1);
				obj1.setDouble(4, mark2);
				obj1.setDouble(5, mark3);
				obj1.setDouble(6, avg);
				obj1.executeUpdate();
				System.out.println("Student-" + (i + 1) + " average:" + avg);
				System.out.println("Data inserted to table");
			}
			obj1.close();
			obj.close();
			con.close();
			sc.close();
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}