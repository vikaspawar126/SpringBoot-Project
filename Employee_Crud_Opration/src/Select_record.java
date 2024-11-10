import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Select_record {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			Statement smt = con.createStatement();
			String q = "select * from employee";
			ResultSet rs = smt.executeQuery(q);
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3));
			}
			
				
			//System.out.println("execute query succesfully...");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
