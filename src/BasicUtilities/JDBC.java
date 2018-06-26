import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class JDBC {

	// JDBC driver name and database URL and variables	
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String DB_URL = "jdbc:oracle:thin:@qa-automation.cq66g54vnu5m.us-east-1.rds.amazonaws.com:1521:QA"; 
	static long mem1;
	static long mem2;
	static String str;
	static int x = 1;
	Integer someints[] = new Integer[1000]; 


	//  Database credentials
	static final String USER = "AUTOMATION";
	static final String PASS = "auto123";

	public static void main(String[] args) throws IOException {


		File file = new File("C:/Param/DatabasePerf/dbperf.txt");		
		if (!file.exists()) {
			file.createNewFile();
		}	

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);		

		while( x < 10 ) {
			
			Connection conn = null;
			Statement  stmt = null;
			
			bw.append(" ===== Execution Started ===== Start of Loop :- " + x);
			bw.newLine();
			Runtime r = Runtime.getRuntime();
			str = "Total memory before query execution in Loop- " + x + " : " + r.totalMemory();
			bw.append(str );
			bw.newLine();
			//System.out.println(str); 
			mem1 = r.freeMemory(); 
			str = "Free memory before query execution in Loop - " + x + " : " + mem1;
			bw.append(str );
			bw.newLine();
			//System.out.println("Initial free memory: " + mem1); 
			r.gc(); 
			mem1 = r.freeMemory(); 
			str = "Free memory after garbage cleaner in Loop  - " + x + " : " + mem1;
			//System.out.println("Free memory after garbage collection: " + mem1);
			bw.append(str );
			bw.newLine();

			try{
				//System.out.println("Memory consumption before query execution : " + 
				//		r.totalMemory()); 	
				Class.forName ("oracle.jdbc.driver.OracleDriver");
				
				System.out.println("Connecting to database...");
				conn = DriverManager.getConnection(DB_URL,USER,PASS);

				System.out.println("Creating statement...");
				stmt = conn.createStatement();
				String sql;
				sql = "SELECT id,project_id,test_case_id,team FROM testcases";
				ResultSet rs = stmt.executeQuery(sql);


				while(rs.next()){

					int id  = rs.getInt("id");
					String pid = rs.getString("project_id");
					String tcid = rs.getString("test_case_id");
					String team = rs.getString("team");


					System.out.print("ID: " + id);
					System.out.print(", Project Id: " + pid);
					System.out.print(", Test Case Id: " + tcid);
					System.out.println(", Team: " + team);
				}
				
				str = "Total memory after query execution in Loop - " + x + " : " +r.totalMemory();
				bw.append(str );
				bw.newLine();
				mem2 = r.freeMemory();
				str = "Free memory after query execution in Loop  - " + x + " : " + mem2;
				//System.out.println("Free memory after allocation: " + mem2); 
				bw.append(str );
				bw.newLine();
				str = "Memory used after query execution in Loop  - " + x + " : " + (mem1-mem2);
				bw.append(str );
				bw.newLine();
				//System.out.println("Memory used by allocation: " + (mem1-mem2)); 
				r.gc(); // request garbage collection 	
				str = "=======" + "End of Loop - " + x + "========";
				bw.append(str );
				bw.newLine();
				rs.close();
				stmt.close();
				conn.close();
				//System.out.println("End of Loop - " + x);
				
				//System.out.println("Memory consumption after query execution : " + 
				//		r.totalMemory()); 
				//System.out.println("Used Memory : " + rs.getUsedMemory());
				
			}catch(SQLException se){

				se.printStackTrace();
			}catch(Exception e){

				e.printStackTrace();
			}finally{

				try{
					if(stmt!=null)
						stmt.close();
				}catch(SQLException se2){
				}
				try{
					if(conn!=null)
						conn.close();
				}catch(SQLException se){
					se.printStackTrace();
				}
			}			
			x++;			
		}
		
		bw.close();			
		
	}
}