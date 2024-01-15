package database;

import java.sql.*;
import java.util.Scanner;
public class DBDemo {

	public  static void main(String args[]) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "Bhavana@123");
		System.out.println("Established Connection");
		/*
		PreparedStatement pstmt=con.prepareStatement("insert into employee values(?,?,?)");
		Scanner s=new Scanner(System.in);
		for(int n=1;n<5;n++) {
		System.out.println("Enter Employee ID= ");
		int id=s.nextInt();
		System.out.println("Enter Employee Name= ");
		String name=s.next();
		System.out.println("Enter Employee Salary= ");
		float salary=s.nextFloat();
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setFloat(3, salary);
		
		int i=pstmt.executeUpdate();
		
		
		if(i>0)
		System.out.println("Employee data Suceesfully Inserted !!");
		else
			System.out.println("FAILED!!");
		}
		*/
		PreparedStatement pstmt=con.prepareStatement("select * from employee");
		ResultSet rs=pstmt.executeQuery();
		int r=pstmt.executeUpdate();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
		}
		
		
	}
}
