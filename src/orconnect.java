/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author polep
 */
import java.sql.*;

public class orconnect
{
    public static Connection connectdb()
    {
        Connection conn=null;
        try
        {
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            conn = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-IUPKBLF:1521:xe","seenu","123");
            System.out.println("Successfully connected to the database");
        } catch (ClassNotFoundException e){
        System.out.println("Could not find the database driver" + e.getMessage());
        } catch (SQLException e) {
         System.out.println("Could not connect to the database" + e.getMessage());
        }
        return conn;
    }
    
    
}
