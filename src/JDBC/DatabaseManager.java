package JDBC;


import utils.DataEntry;
import utils.DataAnalyzer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;


public class DatabaseManager {


    // !!! IMPORTANT: Configure your database connection details here !!!
    private static final String DB_URL = "jdbc:mysql://localhost:3306/data_analysis"; // Example: jdbc:mysql://localhost:3306/your_database_name
    private static final String DB_USER = "root"; // Your MySQL username
    private static final String DB_PASSWORD = "Fe@362al"; // Your MySQL password


    private static Connection connection = null;

    /**
     * Establishes a connection to the database.
     * @return true if connection is successful, false otherwise.
     */
    public static boolean connect() {
        if (connection != null) {
            return true; // Already connected
        }
        try {
            // Load the MySQL JDBC driver (not strictly necessary for newer JDBC versions but good practice)
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Database connected successfully.");
            createTable(); // Ensure table exists
            return true;
        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Database connection failed: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database connection failed: " + e.getMessage() + "\nPlease ensure MySQL is running and connection details are correct.", "Database Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * Closes the database connection.
     */
    public static void disconnect() {
        if (connection != null) {
            try {
                connection.close();
                connection = null;
                System.out.println("Database disconnected.");
            } catch (SQLException e) {
                System.err.println("Error disconnecting from database: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    /**
     * Creates the 'data_entries' table if it doesn't exist.
     */
    private static void createTable() {
        if (connection == null) {
            System.err.println("Cannot create table: Not connected to database.");
            return;
        }
        String sql = "CREATE TABLE IF NOT EXISTS data_entries (" +
                     "id INT AUTO_INCREMENT PRIMARY KEY," +
                     "name VARCHAR(255) NOT NULL," +
                     "data1_raw TEXT," +
                     "data2_raw TEXT," +
                     "timestamp VARCHAR(50) NOT NULL" +
                     ");";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Table 'data_entries' checked/created.");
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error creating database table: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Saves a DataEntry object to the database.
     * @param entry The DataEntry object to save.
     * @return true if save is successful, false otherwise.
     */
    public static boolean saveDataEntry(DataEntry entry) {
        if (!connect()) {
            return false;
        }
        String sql = "INSERT INTO data_entries (name, data1_raw, data2_raw, timestamp) VALUES (?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            pstmt.setString(1, entry.getName());
            pstmt.setString(2, convertListToString(entry.getData1()));
            pstmt.setString(3, convertListToString(entry.getData2()));
            pstmt.setString(4, entry.getTimestamp());
            int affectedRows = pstmt.executeUpdate();

            if (affectedRows > 0) {
                try (ResultSet generatedKeys = pstmt.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        System.out.println("DataEntry saved with ID: " + generatedKeys.getInt(1));
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Error saving data entry: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error saving data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Retrieves all DataEntry objects from the database.
     * @return A list of DataEntry objects.
     */
    public static List<DataEntry> getAllDataEntries() {
        List<DataEntry> entries = new ArrayList<>();
        if (!connect()) {
            return entries;
        }
        String sql = "SELECT id, name, data1_raw, data2_raw, timestamp FROM data_entries ORDER BY timestamp DESC";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                List<Double> data1 = convertStringToList(rs.getString("data1_raw"));
                List<Double> data2 = convertStringToList(rs.getString("data2_raw"));
                String timestamp = rs.getString("timestamp");
                entries.add(new DataEntry(id, name, data1, data2, timestamp));
            }
        } catch (SQLException e) {
            System.err.println("Error retrieving data entries: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error retrieving data from database: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return entries;
    }

    /**
     * Deletes a DataEntry from the database by its ID.
     * @param entry The DataEntry object to delete.
     * @return true if deletion is successful, false otherwise.
     */
    public static boolean deleteDataEntry(DataEntry entry) {
        if (!connect()) {
            return false;
        }
        String sql = "DELETE FROM data_entries WHERE id = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, entry.getId());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Error deleting data entry: " + e.getMessage());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }

    /**
     * Converts a List of Doubles to a comma-separated String.
     * @param list The list to convert.
     * @return A comma-separated string, or an empty string if the list is null or empty.
     */
    private static String convertListToString(List<Double> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        return list.stream()
                   .map(Object::toString)
                   .collect(Collectors.joining(","));
    }

    /**
     * Converts a comma-separated String to a List of Doubles.
     * @param str The string to convert.
     * @return A list of Doubles, or an empty list if the string is null or empty.
     */
    private static List<Double> convertStringToList(String str) {
        if (str == null || str.trim().isEmpty()) {
            return new ArrayList<>();
        }
        return Arrays.stream(str.split(","))
                     .map(Double::parseDouble)
                     .collect(Collectors.toList());
    }
}
