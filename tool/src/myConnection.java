
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class myConnection {
      public Connection conn;
    
    public Connection getConnection()
    {   try{
        String dbpath="jdbc:mysql://localhost/store";
         conn=DriverManager.getConnection(dbpath,"root","");
    }
    catch(SQLException e)
    {System.out.print(e.getMessage());
    
    }
    return conn;
}
    
}
