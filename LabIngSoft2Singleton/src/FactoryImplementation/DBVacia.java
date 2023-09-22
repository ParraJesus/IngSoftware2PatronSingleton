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
        initDatabase("a");
    }
    
    @Override
    public void initDatabase(String sqlCommand) 
    {
        System.out.println("Vacia:");
    }

    @Override
    public void connectDatabase() 
    {
        System.out.println("Conectando a la tabla Vacia");
    }

    @Override
    public void disconnectDatabase() 
    {
        System.out.println("Desonectando la tabla Vacia");
    }
}
