import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Delete_record {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			Statement smt = con.createStatement();
			String q = "delete from employee where eid=107";
			smt.executeUpdate(q);
			
			
			System.out.println("record deleted succesfully...");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
