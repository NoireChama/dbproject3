
package dbprograming3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Student
 */
public class Lab9 {
    
    public static void main(String[] args) {
        
        String URL = "jdbc:mysql://localhost:3306/mydb03";
        String username = "root";
        String password = "mysql@sit";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement = con.createStatement();
            String sql = "insert into student (studentId, firstname, lastname, email, deptID) "
                    + "values('111111','aaaa','bbbb','aaaa@gmail.com','IT')";
            statement.executeUpdate(sql);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Lab9.class.getName()).log(Level.SEVERE, null, ex);
        }
}
}
