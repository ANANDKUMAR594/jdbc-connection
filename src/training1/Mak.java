package training1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Mak {

	public static void main(String[] args)  throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jdbc","user","");
		
		Statement stmt=con.createStatement();
		String sql="create table table (id int,name varchar(20))";
		stmt.execute(sql);
		System.out.println("done");

	}

}
