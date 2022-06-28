/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.util.ArrayList;
import modelo.EstudianteDAO;
/**
 *
 * @author AC_Inc
 */
public class LeerBD {
    EstudianteDAO estudianteDAO;    
    public ArrayList<Estudiante> leer(){
        estudianteDAO = new EstudianteDAO();
//        String sql = "select codigo,tipoDocumento, id, nombres,  apellidos, nacionalidad,"
//                + " direccion, celular, edad, estrato, estado from persona INNER JOIN estudiante ON (persona.id = estudiante.id) where estado='ACTIVO' ";
        String sql = "select * from persona INNER JOIN estudiante ON (persona.id = estudiante.id) where estado='ACTIVO' ";
        ResultSet consulta = estudianteDAO.leer(sql);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Estudiante estudiante;
        try{
            while (consulta.next()){
            estudiante = new Estudiante();
            estudiante.setCodigo(consulta.getInt("persona.codigo"));
            estudiante.setTipoDocumento(consulta.getString("persona.tipoDocumento"));
            estudiante.setId(consulta.getString("id"));
            estudiante.setNombres(consulta.getString("persona.nombres"));
            estudiante.setApellidos(consulta.getString("persona.apellidos"));
            estudiante.setNacionalidad(consulta.getString("persona.nacionalidad"));
            estudiante.setDireccion(consulta.getString("persona.direccion"));
            estudiante.setCelular(consulta.getString("persona.celular"));
            estudiante.setEdad(consulta.getInt("persona.edad"));
            estudiante.setEstrato(consulta.getInt("persona.estrato"));
            estudiante.setGrado(consulta.getString("estudiante.grado"));
            estudiante.setNota1(consulta.getDouble("estudiante.nota1"));
            estudiante.setNota2(consulta.getDouble("estudiante.nota2"));
            estudiante.setNota3(consulta.getDouble("estudiante.nota3"));
            estudiante.setDescuento(consulta.getDouble("estudiante.descuento"));
            estudiantes.add(estudiante);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return estudiantes;
    }    
    public Estudiante leer(String id){
        estudianteDAO = new EstudianteDAO();
        Estudiante est = new Estudiante();
        //SELECT * FROM persona INNER JOIN estudiante ON (persona.id = estudiante.id) WHERE pesona.id = '103333';
        //String sql = "select codigo,tipoDocumento, id, nombres,  apellidos, nacionalidad,"
        //        + " direccion, celular, edad, estrato, estado from persona where id='"+id+"' ";
        String sql = "select * from persona INNER JOIN estudiante ON (persona.id = estudiante.id) where estudiante.id='"+id+"' ";
        ResultSet consulta = estudianteDAO.leer(sql);
        System.out.println("resultset buscado"+ consulta);
        Estudiante estudiante;        
        try{
            while (consulta.next()){
            estudiante = new Estudiante();
            estudiante.setCodigo(consulta.getInt("persona.codigo"));
            estudiante.setTipoDocumento(consulta.getString("persona.tipoDocumento"));
            estudiante.setId(consulta.getString("persona.id"));
            estudiante.setNombres(consulta.getString("persona.nombres"));
            estudiante.setApellidos(consulta.getString("persona.apellidos"));
            estudiante.setNacionalidad(consulta.getString("persona.nacionalidad"));
            estudiante.setDireccion(consulta.getString("persona.direccion"));
            estudiante.setCelular(consulta.getString("persona.celular"));
            estudiante.setEdad(consulta.getInt("persona.edad"));
            estudiante.setEstrato(consulta.getInt("persona.estrato"));
            estudiante.setNota1(consulta.getDouble("estudiante.nota1"));
            estudiante.setNota2(consulta.getDouble("estudiante.nota2"));
            estudiante.setNota3(consulta.getDouble("estudiante.nota3"));
            est = estudiante;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        
        return est;
    }    

   
    public Double sumar(){
        estudianteDAO = new EstudianteDAO();
//        String sql = "select codigo,tipoDocumento, id, nombres,  apellidos, nacionalidad,"
//                + " direccion, celular, edad, estrato, estado from persona INNER JOIN estudiante ON (persona.id = estudiante.id) where estado='ACTIVO' ";
        String sql = "select * from persona INNER JOIN estudiante ON (persona.id = estudiante.id) where estado='ACTIVO' ";
        ResultSet consulta = estudianteDAO.leer(sql);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        Estudiante estudiante;
        Double suma = 0.0;
        try{
            while (consulta.next()){
            estudiante = new Estudiante();
            estudiante.setCodigo(consulta.getInt("persona.codigo"));
            estudiante.setTipoDocumento(consulta.getString("persona.tipoDocumento"));
            estudiante.setId(consulta.getString("id"));
            estudiante.setNombres(consulta.getString("persona.nombres"));
            estudiante.setApellidos(consulta.getString("persona.apellidos"));
            estudiante.setNacionalidad(consulta.getString("persona.nacionalidad"));
            estudiante.setDireccion(consulta.getString("persona.direccion"));
            estudiante.setCelular(consulta.getString("persona.celular"));
            estudiante.setEdad(consulta.getInt("persona.edad"));
            estudiante.setEstrato(consulta.getInt("persona.estrato"));
            estudiante.setGrado(consulta.getString("estudiante.grado"));
            estudiante.setNota1(consulta.getDouble("estudiante.nota1"));
            estudiante.setNota2(consulta.getDouble("estudiante.nota2"));
            estudiante.setNota3(consulta.getDouble("estudiante.nota3"));
            estudiante.setDescuento(consulta.getDouble("estudiante.descuento"));
            estudiantes.add(estudiante);
            suma = suma + estudiante.getDescuento();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return suma;
    }
    
    
}
