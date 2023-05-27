
package com.db;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnect {
    
    private static Connection conn;
    
    /**
     *
     * @return
     */
    public static Connection getConn()
    { 
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_2", "root", "");
        }catch(Exception e){
        
        }
        
      return conn;
    }
}
