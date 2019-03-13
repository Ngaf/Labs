package Exam;
import java.sql.*;
import java.io.*;

 public class Index{
 	private static Connection con = null;
 	static String driver = "com.mysql.jdbc.Driver";
 	static String connectionUrl = "jdbc:mysql://localhost:3306/KaceStudents";
 	static String userName = "root";
 	static String password = "password";
 	
 	static {

 		try{
 			Class.forName(driver).newInstance();
 			con=DriverManager.getConnection(connectionUrl, userName, password);
 		}catch(Exception e){
 			System.out.print(e);
 		}

    }
    public static Connection getCon(){
    	return con;
    }

 }
 