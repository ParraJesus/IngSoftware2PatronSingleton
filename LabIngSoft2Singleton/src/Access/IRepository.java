package Access;

/**
 *
 * @author Jesus Parra
 */
public interface IRepository {
    
    void initDatabase(String sqlCommand);
    
    void connectDatabase();
    
    void disconnectDatabase();
}
