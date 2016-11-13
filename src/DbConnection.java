import java.sql.*;

public class DbConnection {
 public void bridge(){
	try {
		   Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
		   Connection c = DriverManager.getConnection(
		            "jdbc:odbc:Address-Book" );
}
	 catch ( SQLException sqlException ) {
		   System.out.println(sqlException.getMessage());
	       System.exit( 1 );}
	 catch ( ClassNotFoundException classNotFound ) {
	       System.exit( 1 );}
}
}