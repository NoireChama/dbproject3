/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbprograming3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab15 {
    public static void main(String[] args) {
    
        String URL = "jdbc:mysql://localhost:3306/mydb03";
        String username = "root";
        String password = "mysql@sit";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "SELECT * FROM student";
            statement.executeQuery(sql);
            ResultSet resultset = statement.executeQuery(sql);
            ResultSet rsMetaData = statement.executeQuery("SELECT * FROM student");
            
            for (int i = 1; i < rsMetaData.getColumnCount(); i++) {
                System.out.println(rsMetaData.getColumnCount(i));
            }
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab12.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab12.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


