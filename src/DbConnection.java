import java.sql.*;

public class DbConnection {



 
 
 
 public boolean refresh(int room){
	 boolean ava = true;
		try {
			   Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
			   Connection c = DriverManager.getConnection(
			            "jdbc:odbc:hotel" );
			   
			   PreparedStatement rooms = c.prepareStatement("SELECT Rooms.something FROM Rooms WHERE RoomNumber = '?'");
			   rooms.setInt(1,room);
			   ResultSet rs = rooms.executeQuery();
			   if (rs.next()){
				   ava = rooms.getResultSet().getBoolean(1); 
				   System.out.println(ava);
			   }
					   
		
		}
		 catch ( SQLException sqlException ) {
			   System.out.println(sqlException.getMessage());
		       System.exit( 1 );}
		 catch ( ClassNotFoundException classNotFound ) {
		       System.exit( 1 );}

	 return ava;
 }
}