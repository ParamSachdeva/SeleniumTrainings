package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {
	
	public static void main(String[] args) throws SQLException {
		 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","root");  
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("Select * from Employee");
		
		while(rs.next()) {
			int EmpId= rs.getInt("EmpId");
			String EmpName= rs.getString("EmpName");
			String EmpAddress=rs.getString(3);
			Double EmpSal= rs.getDouble(4);
			String EmpDept=rs.getString("EmpDept");
			System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
			}
	}
	
}

