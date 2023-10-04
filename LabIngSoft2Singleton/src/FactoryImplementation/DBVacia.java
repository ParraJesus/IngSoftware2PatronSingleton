package FactoryImplementation;

import FactoryInterface.IDBConnection;

/**
 *
 * @author Jesus
 */
public class DBVacia implements IDBConnection
{
    public DBVacia()
    {
        initDatabase("");
    }
    
    @Override
    public void initDatabase(String sqlCommand) 
    {
        System.out.println("No se puede crear una tabla vacía");
    }

    @Override
    public void connectDatabase() 
    {
        System.out.println("tabla Vacia");
    }

    @Override
    public void disconnectDatabase() 
    {
        System.out.println("tabla Vacia");
    }
}
