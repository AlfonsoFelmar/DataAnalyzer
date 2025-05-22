package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseManager {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/data_analysis_db"; 

    static final String USER = "root"; 
    static final String PASS = "root"; 

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            return conn;
        } catch (java.sql.SQLException se) {
            System.err.println("SQL Error during connection: " + se.getMessage()); 
            se.printStackTrace();
        } catch (Exception e) {
            System.err.println("General Error during connection: " + e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
