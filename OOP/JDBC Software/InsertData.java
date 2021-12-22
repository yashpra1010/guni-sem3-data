
package databasehandling;

import java.util.*;
import java.sql.*;

public class InsertData {
public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
        
        String studentName,enrollmentNo;                     

    		try{
			
			Class.forName("com.mysql.jdbc.Driver"); //driver 
			
			String driverUrl = "jdbc:mysql://localhost:3306/demo";
			
			Connection con = DriverManager.getConnection(driverUrl,"root","ganpat"); //connection
			
                        //insert query
			String InsertDataQuery = "INSERT INTO Student(name,enrollmentNo) VALUES(?,?)";
			
			//prepared statement for insert query
			PreparedStatement InsertData = con.prepareStatement(InsertDataQuery);
		
			//getting values form the user
			System.out.println("Enter student name : ");
			studentName = sc.next();
			System.out.println("Enter student enrollment no. : ");
			enrollmentNo = sc.next();
			
			//applying setstring to add values to insert query
			InsertData.setString(1,studentName);
			InsertData.setString(2,enrollmentNo);
			
			//for applying changes to the table 
			InsertData.executeUpdate();
			
			//close the connection and query satement
			
			InsertData.close();
			con.close();
                }		
                catch(Exception e){
                    System.out.println(e);
                }
        }
}
