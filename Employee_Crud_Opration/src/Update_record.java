import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Update_record {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			Statement smt = con.createStatement();
			String q = "Update employee set eid=104 where ename='ritik'";
			smt.executeUpdate(q);
			
			
			System.out.println("record updated succesfully...");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
