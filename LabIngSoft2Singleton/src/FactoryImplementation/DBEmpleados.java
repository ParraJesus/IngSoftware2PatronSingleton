package FactoryImplementation;

import Access.Repository;
import FactoryInterface.IDBConnection;

/**
 *
 * @author Jesus
 */
public class DBEmpleados implements IDBConnection
{
    private Repository repos = new Repository();
    
    public DBEmpleados()
    {
        
    }
    
    @Override
    public void initDatabase(String sqlCommand) 
    {
        System.out.println("Empleados:");
        
        String sql = "CREATE TABLE IF NOT EXISTS empleados (\n"
                + "	id integer PRIMARY KEY AUTOINCREMENT,\n"
                + "	name text NOT NULL,\n"
                + "	description text NULL\n"
                + ");";
        
        repos.initDatabase(sql);
    }

    @Override
    public void connectDatabase() 
    {
        System.out.println("Conectando a la tabla empleados");
        repos.connectDatabase();
    }

    @Override
    public void disconnectDatabase() 
    {
        System.out.println("Desonectando la tabla empleados");
        repos.disconnectDatabase();
    }
    
    
}
