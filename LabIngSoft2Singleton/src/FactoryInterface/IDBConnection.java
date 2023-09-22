package FactoryInterface;

/**
 *
 * @author Jesus
 */
public interface IDBConnection 
{   
    void initDatabase(String sqlCommand);
    
    void connectDatabase();
    
    void disconnectDatabase();
}
