package controlador;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Descuentos;
import modelo.Estudiante;
import modelo.EstudianteDAO;
import modelo.LeerBD;
/**
 *
 * @author AC_Inc
CRUD
*/
public class EstudianteBO {
    EstudianteDAO estudianteDAO;
    LeerBD leerBD;
    public EstudianteBO(){
        estudianteDAO = new EstudianteDAO();
    }
    
    public Double sumar(){
        
        leerBD = new LeerBD();
        Double resultado = leerBD.sumar();
        return resultado;
    }
    
    public String insertar(String tipoDocumento,String id,String nombres,String apellidos,
                String nacionalidad, String direccion,String celular,
                String edad,String estrato, String grado){
        String msj;
                
        // Crear estudiante antes de validador :::: validar estudiante
        String sql = "INSERT INTO persona (tipoDocumento, id, nombres,  apellidos, nacionalidad, direccion,"
                + " celular,edad, estrato, estado) VALUES "
                + "('"+tipoDocumento+"', '"+id+"', '"+nombres+"', '"+apellidos+"', '"+nacionalidad+"',"
                + " '"+direccion+"', '"+celular+"',"+Integer.parseInt(edad)+","+Integer.parseInt(estrato)+","
                + " 'ACTIVO')";
        leerBD = new LeerBD();
        Estudiante estudiante = new Estudiante(); 
        
        
        System.out.println("el grado es:  "+Integer.parseInt(grado));
        System.out.println("elgrado orig:   "+ grado);
        //JOptionPane.showMessageDialog(null, codigo);
        
        if (id.length() < 2 || id.length() > 15){
            msj = "Datos Erroneos";
        }else{
            estudianteDAO.crear(sql);
            estudiante = leerBD.leer(id);//buscar identidad en ell array y preguntar por la llave
            int codigo = estudiante.getCodigo();
            sql = "INSERT INTO estudiante (codigo, id, grado) VALUES "
                + "("+codigo+", '"+id+"',"+grado+")";
            estudianteDAO.crear(sql);
            msj = "Datos correctamente agregados";
            
        }
        
    return msj;
    }
    
  
    
    
    public String insertarNotas(String id,String nota1,String nota2, String nota3, String extranjero, String estrato){
        double nota1D = Double.parseDouble(nota1);
        double nota2D = Double.parseDouble(nota2);
        double nota3D = Double.parseDouble(nota3);
        double promedio = (nota1D * 0.3) + (nota2D * 0.3) + (nota3D * 0.4);
        double descuento;
        int edad = 0;
        int estratoD = Integer.parseInt(estrato);
        if (extranjero=="Ext") {
            descuento = Descuentos.descuento(promedio, edad, estratoD);
        }else {
            descuento = Descuentos.descuento(promedio, edad);
        }
         
        // Crear estudiante antes de validador :::: validar estudiante
        String sql = "update estudiante set descuento = "+descuento+" , promedio = "+promedio+", nota1 = "+nota1D+", nota2 = "+nota2D+", nota3 =  "+nota3D+" where id='"+id+"' ";        
        estudianteDAO.actualizar(sql);
        return "Actualizado";

    }
    
    public DefaultTableModel getModelo(){
        DefaultTableModel modelo = new DefaultTableModel();
        leerBD = new LeerBD();
        String[] columnas = {"codigo","id", "nombres", "nacional","edad", "estrato", "grado"};
        modelo.setColumnIdentifiers(columnas);
        for (Estudiante estudiante : leerBD.leer()){
            String[] fila = {String.valueOf(estudiante.getCodigo()) ,estudiante.getId(), estudiante.getNombres(),
                estudiante.getNacionalidad(),String.valueOf(estudiante.getEdad()), String.valueOf(estudiante.getEstrato()),
                estudiante.getGrado()};
            modelo.addRow(fila);
            System.out.println(Arrays.asList(fila));
        }
        return modelo;
        

    }

    public DefaultTableModel getModeloDescuento(){
        DefaultTableModel modelo = new DefaultTableModel();
        leerBD = new LeerBD();
        String[] columnas = {"codigo","id", "nombres", "nacional","edad", "estrato", "descuento"};
        modelo.setColumnIdentifiers(columnas);
        for (Estudiante estudiante : leerBD.leer()){
            String[] fila = {String.valueOf(estudiante.getCodigo()) ,estudiante.getId(), estudiante.getNombres(),
                estudiante.getNacionalidad(),String.valueOf(estudiante.getEdad()), String.valueOf(estudiante.getEstrato()),
                String.valueOf(estudiante.getDescuento())};
            modelo.addRow(fila);
            System.out.println(Arrays.asList(fila));
        }
        return modelo;
        

    }

    
    
    public boolean validarId(String id) {
        ResultSet resultado = estudianteDAO.leer("select codigo from persona where id = '" + id + "'");
        try {
            while (resultado.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    


    
}
