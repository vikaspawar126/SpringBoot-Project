import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class Insert_record {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
			PreparedStatement psmt = con.prepareStatement("insert into employee values(?,?,?)");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			while(true)
			{
				System.out.println("enter eid:");
			    int eid= Integer.parseInt(br.readLine());

				System.out.println("enter ename:");
			    String ename = br.readLine();
			    
			    System.out.println("enter esalary:");
			    int esalary= Integer.parseInt(br.readLine());
			    
			    psmt.setInt(1, eid);
			    psmt.setString(2, ename);
			    psmt.setInt(3, esalary);
			    
			    int count = psmt.executeUpdate();
			    
			    if(count>0)
			    	System.out.println(count+" record inserted");
			    else
			    	System.out.println("no recored inserted");
			    System.out.println("Do you want to more record[yes/no]");
			    
			    String ch=br.readLine();
			    if(ch.equalsIgnoreCase("no"))
			    {
			    	break;
			    }
			}
			con.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
