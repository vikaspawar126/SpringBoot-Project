import java.sql.*;
public class Create_Table {

	public static void main(String[] args) {
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			Statement smt = con.createStatement();
			String q = "create table employee(eid number, ename varchar(10), esalary number)";
			smt.executeUpdate(q);
			
			System.out.println("execute query succesfully...");
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
