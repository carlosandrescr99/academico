/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.ArrayList;



/**
 *
 * @author AC_Inc
 */
public class Estudiante extends Persona {
    private Double nota1, nota2, nota3, promedio, descuento;
    String grado;
	
    public Estudiante(){
    }
    
    public Estudiante(int codigo, String tipoDocumento, String id, String nombres, String apellidos,
            String nacionalidad, String direccion, String celular, int edad, int estrato,
            String grado) {
        super(codigo, tipoDocumento,  id,  nombres,  apellidos,  nacionalidad,  direccion,  celular,  edad,
                estrato);
        this.grado = grado;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    



    

}
