package FactoryImplementation;

import FactoryInterface.IDBConnection;

/**
 *
 * @author Jesus
 */
public class DBEmpleados implements IDBConnection
{
    public DBEmpleados()
    {
        initDatabase("a");
    }
    
    @Override
    public void initDatabase(String sqlCommand) 
    {
        System.out.println("Empleados:");
    }

    @Override
    public void connectDatabase() 
    {
        System.out.println("Conectando a la tabla empleados");
    }

    @Override
    public void disconnectDatabase() 
    {
        System.out.println("Desonectando la tabla empleados");
    }
    
    
}
