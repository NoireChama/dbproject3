/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dbprograming3;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Student
 */
public class Dbprograming3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb3";
        String username = "root";
        String password = "mysql@sit";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement = con.createStatement();
            String sql = "select * from student";
            ResultSet results = statement.executeQuery(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dbprograming3.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dbprograming3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}