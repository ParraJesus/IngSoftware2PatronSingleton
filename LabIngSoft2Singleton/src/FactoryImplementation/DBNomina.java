package FactoryImplementation;

import Access.Repository;
import FactoryInterface.IDBConnection;

/**
 *
 * @author Jesus
 */
public class DBNomina implements IDBConnection
{
    private Repository repos = new Repository();

    public DBNomina() 
    {
    }
    
    @Override
    public void initDatabase(String sqlCommand) 
    {
        System.out.println("Nomina:");
        
        String sql = "CREATE TABLE IF NOT EXISTS nomina (\n"
                + "	id integer PRIMARY KEY AUTOINCREMENT,\n"
                + "	name text NOT NULL,\n"
                + "	description text NULL\n"
                + ");";
        
        repos.initDatabase(sql);
    }

    @Override
    public void connectDatabase() 
    {
        System.out.println("Conectando a la tabla nomina");
        repos.connectDatabase();
    }

    @Override
    public void disconnectDatabase() 
    {
        System.out.println("Desonectando la tabla nomina");
        repos.disconnectDatabase();
    }
    
}
