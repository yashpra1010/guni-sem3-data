
package databasehandling;

import java.sql.*;

public class CreateTable {
public static void main(String args[])
{
     try{
	 Class.forName("com.mysql.jdbc.Driver"); //driver 
			
	 String driverUrl = "jdbc:mysql://localhost:3306/demo";
			
	 Connection con = DriverManager.getConnection(driverUrl,"root","ganpat"); //connection
			
         String createTableQuery ="CREATE table GanpatStudent( "
					+ "id INTEGER PRIMARY KEY NOT NULL AUTO_INCREMENT , "
					+ "name VARCHAR(30) ,"
					+ "enrollmentNo VARCHAR(12))";
			
			
	 PreparedStatement CreateTable=con.prepareStatement(createTableQuery); //prepared statement for create table
			
	 CreateTable.execute(); //execute create table query
       }		
       catch(Exception e){
	 System.out.println(e);
    }
  }
}
