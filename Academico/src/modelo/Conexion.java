/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author AC_Inc
 */
public class Conexion {

    Connection conexion;

    public Conexion() {
        conectar();
    }

    private void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/academico?autoReconnect=true", "root", "");
        } catch (Exception e) {
            System.out.print(e.getMessage());

        }
    }

    public ResultSet get(String sql) {
        try {
            return conexion.createStatement().executeQuery(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public boolean set(String sql) {
        try {
            return conexion.createStatement().execute(sql);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
