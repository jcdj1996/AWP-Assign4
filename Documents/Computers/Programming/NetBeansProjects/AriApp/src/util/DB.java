package util;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

/**
 * Manages database interactions
 */
public class DB {
    
    private static Connection conn;
    private ResultSet rs;
    private ArrayList<HashMap<String, String>> resultList;
    private ResultSetMetaData rsmd;
    private String workingQuery;
    
    public static void connect() throws SQLException {
        conn = DriverManager.getConnection(
            "jdbc:mysql://sql.computerstudi.es:3306/gc020087918",
            "gc020087918",
            "BRZpiK7j"); 
    }
    
    /**
     * Loads the result set of a query
     * 
     * @param query The query to run
     * @return True if the result set was loaded, false otherwise
     */
    public boolean loadResultSet(String query) {
        try{
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(query);
            rsmd = rs.getMetaData();
            workingQuery = query;
            if (!loadList()) {
                System.out.println("loadResultSet error: could not load result list");
                return false;
            }
            return true;
        }catch(Exception error){
            System.out.println("loadResultSet error: could not load result set.");
            System.out.println(error.getMessage());
            return false;
        } 
    }
    
    public boolean updateData(String query) {
        try 
        {
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            return true;
            
        } catch (SQLException ex) {
            System.out.println("loadResultSet error: could not load result set.");
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    /**
     * Returns the result set of the last query loaded
     * 
     * @return The results of the query
     */
    public ArrayList<HashMap<String, String>> getResults() {
        return resultList;
    }
    
    /**
     * Gets the result set as a hashmap of strings
     * 
     * @return The result set
     */
    private boolean loadList() {
        
        // return empty if there is no result set
        if (rs == null) {
            System.out.println("getResults error: The result set is null");
            return false;        
        }
        
        // holds the results to be returned
        ArrayList<HashMap<String, String>> results = new ArrayList<HashMap<String, String>>();
        
        // add results to hashmap
        try {
            while (rs.next()) {
                
                // create a new hashmap to hold this row
                HashMap<String, String> row = new HashMap<String, String>();
                    
                for (int i = 1; i <= rsmd.getColumnCount(); i++) {
                    
                    // add the values to the hashmap
                    switch (rsmd.getColumnTypeName(i)) {
                        case "VARCHAR":
                            row.put(rsmd.getColumnName(i), rs.getString(i));
                            break;
                        case "DOUBLE":
                            row.put(rsmd.getColumnName(i), Double.toString(rs.getDouble(i)));
                            break;
                        case "INT UNSIGNED":
                            row.put(rsmd.getColumnName(i), Integer.toString(rs.getInt(i)));
                            break;
                        case "INT":
                            row.put(rsmd.getColumnName(i), Integer.toString(rs.getInt(i)));
                            break;
                    }
                }
                
                // add the row to the results
                results.add(row);
                
            }
        } catch (SQLException ex) {
            System.out.println("getResults error: An SQL exception occured");
            System.out.println(ex.getMessage());
            return false;
        }
        
        // load the result list
        resultList = results;
        return true;
    }
    
    /**
     * Returns the current working query
     * 
     * @return The last query which last had its result set loaded
     */
    public String getWorkingQuery() {
        return workingQuery;
    }
    
    /**
     * Returns the size of the currently loaded result set
     * 
     * @return (status message, result set count)
     */
    public Optional<Integer> getRSSize() {
        
        // null result sets have a value of zero
        if (rs == null) {
            return Optional.empty();
        }
        int size = 0;
        try {
            rs.last();
            size = rs.getRow();
            rs.beforeFirst();
        } catch (SQLException ex) {
            return Optional.empty();
        }
        return Optional.of(size);
    }
    
    
}