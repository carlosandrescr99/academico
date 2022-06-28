/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author AC_Inc
 */
public class Persona {

    private String tipoDocumento, id, nombres, apellidos, nacionalidad, direccion,
            celular;
    private int codigo, edad, estrato;
    
    public Persona(){
    }
    
    public Persona(int codigo, String tipoDocumento, String id, String nombres, String apellidos,
            String nacionalidad, String direccion, String celular, int edad,
            int estrato) {
        inicializar(tipoDocumento, id, nombres, apellidos, nacionalidad, direccion,
                celular, edad, estrato);
    }

    private void inicializar(String tipoDocumento, String id, String nombres,
            String apellidos, String nacionalidad, String direccion, String celular,
            int edad, int estrato) {
        setTipoDocumento(tipoDocumento);
        setId(id);
        setNombres(nombres);
        setApellidos(apellidos);
        setNacionalidad(nacionalidad);
        setDireccion(direccion);
        setCelular(celular);
        setEdad(edad);
        setEstrato(estrato);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }



}
