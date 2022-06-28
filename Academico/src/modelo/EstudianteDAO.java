/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;

/**
 *
 * @author AC_Inc
 */
public class EstudianteDAO implements IDAO {

    Conexion conectar;
    
    public EstudianteDAO(){
        conectar = new Conexion();
        
    }
    
    
    @Override
    public boolean crear(String sql) {
        return conectar.set(sql);
    }

    @Override
    public ResultSet leer(String sql) {
        return conectar.get(sql);
        
    }

    @Override
    public boolean actualizar(String sql) {
        return conectar.set(sql);
    }

    @Override
    public ResultSet borrar(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
