/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connecttosqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class ConnectToSQLServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var server = "DESKTOP-A6A2PD3\\SQLEXPRESS";
        var user = "sa";
        var password = "abc123!@#";
        var db = "QLTourDuLich";
        var port = 1433;
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setServerName(server);
        ds.setPortNumber(port);
        ds.setDatabaseName(db);
        try ( Connection conn = ds.getConnection()) {
            System.out.println("Kết nối với SQL Server thành công!");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
