package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DBData {
	public  static void main(String args[]) throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emplo_info", "root", "Bhavana@123");
		System.out.println("Established Connection");
		
		PreparedStatement pstm=con.prepareStatement("insert into employee values(?,?,?)");
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Employee ID= ");
		int id=s.nextInt();
		System.out.println("Enter Employee Name= ");
		String name=s.next();
		System.out.println("Enter Employee Salary= ");
		float salary=s.nextFloat();
		
		
		pstm.setString(1, name);
		pstm.setFloat(3, salary);
		
		
		
		/*
		String query = "update users set num_points = ?  where first_name = ?";
	      PreparedStatement prstmt = con.prepareStatement(query);
	      String query1 = "update users set last_name = ?  where first_name = ?";
	      PreparedStatement pr = con.prepareStatement(query1);
	      prstmt.setInt   (1, 6000);
	      prstmt.setNString(2, "Barney");
	     
	     pr.setString(1, "kothawale");
	     pr.setNString(2,"Fred" );
	     prstmt.executeUpdate();
	      pr.executeUpdate();
	      System.out.println("UPDATE!!");
	 
	     String query4 = "update users set first_name = ? where Last_Name = ?";
	     PreparedStatement p = con.prepareStatement(query4);
	     p.setString(1, "Bhavana");
	     p.setNString(2, "kothawale");
	     
	     p.executeUpdate();
	     */
		
		/*
	     String query5 = "delete from users where first_name= ?";
	     PreparedStatement pre=con.prepareStatement(query5);
	     pre.setNString(1, "Barney");
	     pre.executeUpdate();
	     System.out.println("DELETEDED SUCESSFULLY!!!");
	    */
	      /*
	      String query2 = "ALTER TABLE users RENAME COLUMN last_name TO LastName"; 
	      PreparedStatement prst = con.prepareStatement(query2);
	      prst.executeUpdate();
	      System.out.println("UPDATE column name!!");
	      */
	      con.close();
	}
}
