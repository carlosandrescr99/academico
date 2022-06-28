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
public interface IDAO {
    public boolean crear(String sql);       //Create
    public ResultSet leer(String sql);        //Read
    public boolean actualizar(String sql);  //Update
    public ResultSet borrar(String sql);    //Delete
    
}

