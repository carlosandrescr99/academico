/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico.gui;
/**
 *
 * @author AC_Inc
 */

import controlador.EstudianteBO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Estudiante;
import javax.swing.table.DefaultTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import modelo.LeerBD;
import java.util.Date;


public class EstudianteVista extends javax.swing.JDialog {


    /**
     * Creates new form CrearEstudiante
     */
    
    ArrayList<Estudiante> listaEstudiante = new ArrayList<>();
    EstudianteBO estudianteBO;
    Estudiante estudiante;
    LeerBD leerBD;
    
    
    public EstudianteVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        estudianteBO = new EstudianteBO();
        listarTbl();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nombresTxt = new javax.swing.JTextField();
        tipoDocumentoCmb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        apellidosTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        celularTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        estratoCmb = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        gradoCmb = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        estudiantesTbl = new javax.swing.JTable();
        agregarBtn = new javax.swing.JButton();
        modificarBtn = new javax.swing.JButton();
        eliminarBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();
        codigoTxt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        edadSpn = new javax.swing.JSpinner();
        nacionCmb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Crear Nuevo Estudiante");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Tipo ID");

        nombresTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        tipoDocumentoCmb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipoDocumentoCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TI", "CC", "CE", "PP", "PEP" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombres");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Numero ID");

        idTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        apellidosTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Apellidos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Nacionalidad");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Celular");

        celularTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        celularTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                celularTxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Direcci??n");

        direccionTxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Estrato");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Edad");

        estratoCmb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        estratoCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Grado");

        gradoCmb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gradoCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11" }));
        gradoCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoCmbActionPerformed(evt);
            }
        });

        estudiantesTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estudiantesTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(estudiantesTbl);

        agregarBtn.setBackground(new java.awt.Color(204, 204, 204));
        agregarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        agregarBtn.setText("Agregar");
        agregarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        agregarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarBtnActionPerformed(evt);
            }
        });

        modificarBtn.setBackground(new java.awt.Color(204, 204, 204));
        modificarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        modificarBtn.setText("Modificar");
        modificarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eliminarBtn.setBackground(new java.awt.Color(204, 204, 204));
        eliminarBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eliminarBtn.setText("Eliminar");
        eliminarBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        salirBtn.setBackground(new java.awt.Color(204, 204, 204));
        salirBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        salirBtn.setText("Salir");
        salirBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        codigoTxt.setFont(new java.awt.Font("Tahoma", 0, 22)); // NOI18N
        codigoTxt.setForeground(new java.awt.Color(255, 51, 51));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Cod");

        edadSpn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        nacionCmb.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nacionCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nal", "Ext" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172)
                        .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(149, 149, 149)
                        .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(tipoDocumentoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(nombresTxt)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(apellidosTxt))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nacionCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(celularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(estratoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(gradoCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(edadSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(106, 106, 106))
                                    .addComponent(direccionTxt)))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(tipoDocumentoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(codigoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombresTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(apellidosTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nacionCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(celularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(estratoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(gradoCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(edadSpn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(agregarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );

        setSize(new java.awt.Dimension(1081, 605));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void celularTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_celularTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_celularTxtActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirBtnActionPerformed

    private void agregarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarBtnActionPerformed
        // TODO add your handling code here:
        agregar();
        
    }//GEN-LAST:event_agregarBtnActionPerformed

    private void gradoCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradoCmbActionPerformed

    private void estudiantesTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estudiantesTblMouseClicked
        // TODO add your handling code here:
        cargarValores();
    }//GEN-LAST:event_estudiantesTblMouseClicked

    private void cargarValores(){
        int fila = estudiantesTbl.getSelectedRow();
        
        estudiante = new Estudiante();
        leerBD = new LeerBD();
        String id;
        if(fila>=0){
            if (validarId(estudiantesTbl.getValueAt(fila, 1).toString())){
                id = estudiantesTbl.getValueAt(fila, 1).toString();
                System.out.println("el id a buscar es:  "+id);
                //JOptionPane.showMessageDialog(this, "Usuario encontrado");
                estudiante = leerBD.leer(id);
                tipoDocumentoCmb.setSelectedItem(estudiante.getTipoDocumento());
                idTxt.setText(estudiante.getId());                
                nombresTxt.setText(estudiante.getNombres());
                apellidosTxt.setText(estudiante.getApellidos());
                nacionCmb.setSelectedItem(estudiante.getNacionalidad());
                direccionTxt.setText(estudiante.getDireccion());
                celularTxt.setText(estudiante.getCelular());
                codigoTxt.setText(String.valueOf(estudiante.getCodigo()));
                edadSpn.setValue(estudiante.getEdad());
                System.out.println("tipo"+estudiante.getTipoDocumento()+"0");
                estratoCmb.setSelectedItem(String.valueOf(estudiante.getEstrato()));
                gradoCmb.setSelectedItem(String.valueOf(estudiante.getGrado()));

            }else{
                JOptionPane.showMessageDialog(this, "Usuario no encontrado");        
            }         
        }
        
    }
    
    private void listarTbl (){
           estudiantesTbl.setModel(estudianteBO.getModelo());
    }    
    
    private void agregar(){

        if (validarId(idTxt.getText())){
            JOptionPane.showMessageDialog(this, "Usuario duplicado");        
        }else{
        String msj = estudianteBO.insertar((String) tipoDocumentoCmb.getSelectedItem(), idTxt.getText(),
                nombresTxt.getText(), apellidosTxt.getText(),(String) nacionCmb.getSelectedItem(), direccionTxt.getText(),
                celularTxt.getText(),edadSpn.getValue().toString(),(String) estratoCmb.getSelectedItem(),
                 (String) gradoCmb.getSelectedItem());
        listarTbl();
        JOptionPane.showMessageDialog(this, msj);        
        }
    }

    private boolean validarId (String id){
        return estudianteBO.validarId(id);
    }


    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarBtn;
    private javax.swing.JTextField apellidosTxt;
    private javax.swing.JTextField celularTxt;
    private javax.swing.JLabel codigoTxt;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JSpinner edadSpn;
    private javax.swing.JButton eliminarBtn;
    private javax.swing.JComboBox<String> estratoCmb;
    private javax.swing.JTable estudiantesTbl;
    private javax.swing.JComboBox<String> gradoCmb;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JComboBox<String> nacionCmb;
    private javax.swing.JTextField nombresTxt;
    private javax.swing.JButton salirBtn;
    private javax.swing.JComboBox<String> tipoDocumentoCmb;
    // End of variables declaration//GEN-END:variables
}
