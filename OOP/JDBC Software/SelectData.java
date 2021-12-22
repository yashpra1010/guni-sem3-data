
package databasehandling;

import java.util.*;
import java.sql.*;

public class SelectData {
public static void main(String args[])
{
        Scanner sc=new Scanner(System.in);
    		try{
			
			Class.forName("com.mysql.jdbc.Driver"); //driver 
			
			String driverUrl = "jdbc:mysql://localhost:3306/demo";
			
			Connection con = DriverManager.getConnection(driverUrl,"root","ganpat"); //connection
			
                        
			
			//prepared statement for insert query
			Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select name from GanpatStudent where enrollmentNo=12");
			//getting values form the user
			
				rs.next();
			
			String studentName = rs.getString("name");  //getting the result as string 
			System.out.println(studentName);
	
			
			con.close();
                }		
                catch(Exception e){
                    System.out.println(e);
                }
        }
}
