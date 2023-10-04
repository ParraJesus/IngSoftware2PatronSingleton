package Main;

import Access.DBConnection;
import FactoryInterface.IDBConnection;

/**
 * @author Jesus
 */

public class LabIngSoft2Singleton {

    public static void main(String[] args) 
    {
        IDBConnection conn = DBConnection.getDBConnection("empleados");
        
        IDBConnection conn2 = DBConnection.getDBConnection("nomina");
        
        //DBConnection conn3 = new DBConnection(); //Esta línea da error
        
        //DBConnection conn3 = DBConnection.getInstance(); //Esta linea no devuelve error, porque trae la única instancia
    }
    
}
