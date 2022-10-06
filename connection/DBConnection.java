package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Fabio
 */
public class DBConnection {
    
        Connection connection;
    static String bd = "sql10524486";
    static String port = "3306";
    static String login = "sql10524486";
    static String password = "Yuql3R2NsX";
    
    
    public DBConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://sql10.freemysqlhosting.net"+this.port+"/"+this.bd;
            connection=DriverManager.getConnection(url,this.login,this.password);
            System.out.println("Connection sucess");
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    
    public void desconectar(){
        connection=null;
    }
    
}
