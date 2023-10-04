package Access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Repository implements IRepository {

    private Connection conn;
    
    private static Repository instancia;
    
    public static Repository getInstancia() {
        if (instancia == null) {
            instancia = new Repository();
        }

        return instancia;
    }
    
    @Override
    public void initDatabase(String sqlCommand) 
    {
        try 
        {
            this.connectDatabase();
            Statement stmt;
            stmt = conn.createStatement();
            stmt.execute(sqlCommand);
        } catch (SQLException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void connectDatabase() 
    {
        try {
            // SQLite connection string
            //String url = "jdbc:sqlite:./myDatabase.db"; //Para Linux/Mac
            //String url = "jdbc:sqlite:C:/sqlite/db/myDatabase.db"; //Para Windows
            String url = "jdbc:sqlite::memory:";
            conn =  DriverManager.getConnection(url);
            setConn(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Repository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void disconnectDatabase() 
    {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
}
