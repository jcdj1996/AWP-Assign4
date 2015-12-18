package util;

import java.sql.*;

/**
 * Manages database interactions
 */
public enum DB {
    INSTANCE;
    
    private Connection conn;
    public void connect() throws SQLException {
        conn = DriverManager.getConnection(
            "jdbc:mysql://sql.computerstudi.es:3306/gc020087918",
            "gc020087918",
            "BRZpiK7j"); 
    }
    
}