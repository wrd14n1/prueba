/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miro_vidal.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public class AccesoDB {

    
    public AccesoDB() {
    }
    
    public static Connection getConnection() throws SQLException{
        Connection cn=null;
        
        try{
            //Load the JDBC driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            //Establish the connection to the database.            
            String url="jdbc:mysql://localhost:3306/bdmirovidal";
            cn=DriverManager.getConnection(url, "root", "wrd14n1");
                        
        }catch(SQLException e){
            
         throw e;
        }catch (ClassNotFoundException e){
         throw new SQLException("No se encontr+ó el driver de la base de datos");
        }catch(Exception e){
         throw new SQLException("No se puede establecer la conexión con la base de datos");
        }
        return cn;
            
    }   
    
}
