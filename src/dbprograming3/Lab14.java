
package dbprograming3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Lab14 {
    public static void main(String[] args) {
    
        String URL = "jdbc:mysql://localhost:3306/mydb03";
        String username = "root";
        String password = "mysql@sit";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            DatabaseMetaData Meta= con.getMetaData();
            System.out.println("database URL: " + Meta.getURL());
            System.out.println("database product name: " + Meta.getDatabaseProductName());
            System.out.println("database product version: " + Meta.getDatabaseProductVersion());
            System.out.println("JDBC driver name: " + Meta.getDriverName());
            System.out.println("JDBC driver major version: " + Meta.getDriverMajorVersion());
            System.out.println("JDBC driver major version: " + Meta.getDriverMinorVersion());
            System.out.println("Max number of connections: " + Meta.getMaxConnections());
            System.out.println("MaxTableNameLength: " + Meta.getMaxTableNameLength());
            System.out.println("MaxColumnsInTable: " + Meta.getMaxColumnsInTable());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

