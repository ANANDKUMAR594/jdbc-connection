package java.sql;
import java.sql.connection;
public class connection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
		Connection con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/jdbc");
		Statement stmt=con.createStatement();
		String sql="create table table (id int,name varchar(20))";
		stmt.execute(sql);
		System.out.println("done");

	}

}
