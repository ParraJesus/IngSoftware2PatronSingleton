package Access;

import FactoryImplementation.DBEmpleados;
import FactoryImplementation.DBNomina;
import FactoryImplementation.DBVacia;
import FactoryInterface.IDBConnection;

/**
 *
 * @author Jesus
 */
public class DBConnection 
{
    private static DBConnection instance;
    
    private DBConnection()
    {
        
    }
    
    public static DBConnection getInstance() 
    {
        if (instance == null) 
        {
            instance = new DBConnection();
        }
        return instance;
    }
    
    public static IDBConnection getDBConnection(String tableName)
    {
        switch (tableName) 
        {
            case "empleados":
                return new DBEmpleados();
            case "nomina":
                return new DBNomina();
            default:
               return new DBVacia(); 
        }
    }
}
