import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/saif","root","welcome");  
			  
			//here sonoo is database name, root is username and password  
			  
			Statement stmt=con.createStatement();  
			  
			/*ResultSet rs=stmt.executeQuery("select * from actor");  
			  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));*/  
			/*int actor_id=201;
			String first_name = "hello";
			String last_name = "holla";
			String sql = "INSERT INTO actor (actor_id,first_name,last_name)VALUES ("+actor_id+", '"+first_name+"','"+last_name+"')";
			stmt.executeUpdate(sql);*/
	         
			String newName = "UpdateName";
			int id = 11;
			int age=55;
			String update = "UPDATE emp2 set id="+newName+" where pid="+id+"";
			stmt.executeUpdate(update);
			
			stmt.executeUpdate(update);
			 
			con.close();  
			  
		}catch(Exception e){ System.out.println(e);
		} 

	}
 
}
