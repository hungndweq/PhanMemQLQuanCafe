/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hyun
 */
public class DBConnection {

    public static Connection getConnect() {
        try {
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QLQCP;encrypt=true;trustServerCertificate=true;", "sa", "123");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) throws SQLException {
        Connection conn = getConnect();
        System.out.println(conn.getMetaData().getDriverName());
        System.out.println(conn.getMetaData().getDatabaseProductName());
        System.out.println(conn.getMetaData().getDatabaseProductVersion());
    }
}
