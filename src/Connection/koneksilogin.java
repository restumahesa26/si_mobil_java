package Connection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AL-HACK3R
 */
import java.sql.*;
import javax.swing.*;

public class koneksilogin {
    Connection con = null;
    public static Connection ConnectDB(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/db_carrent","root","");
            return con;
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null; 
        }
    }
}
