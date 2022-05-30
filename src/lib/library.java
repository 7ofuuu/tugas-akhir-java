/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lib;

import com.mysql.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author ASUS
 */
public class library {
    private static Connection lib;
    
    public static Connection GetConnection()throws SQLException{
        if (lib==null) {
            new Driver();
            lib = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_pendataan_komponen_komputer","root","");
    }
    return lib;
    }
}