/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.logina;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Moises
 */
public class ConsultaProfesor extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaProfesor
     */
    public ConsultaProfesor() {
        initComponents();
        CargarTabla();
        selector();  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Modificar: Seleccionar fila, Click derecho");

        jButton5.setText("Carga Masiva CSV");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Carga Masiva CSV");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton2.setText("Guardar CSV");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(32, 32, 32))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(188, 188, 188)
                    .addComponent(jButton5)
                    .addContainerGap(188, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(jButton5)
                    .addContainerGap(180, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void selector() {
        JMenuItem editar = new JMenuItem("Editar");
        JMenuItem Eliminar= new JMenuItem("Eliminar");
    editar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ModificarProfesor a = new ModificarProfesor(jTable1.getSelectedRow());
            a.setVisible(true);
            dispose();
        }
    });
    Eliminar.addActionListener((ActionEvent e) -> {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            LoginA.profesores.remove(selectedRow);  
        CargarTabla(); 
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un curso de la tabla.");
        }
    });
    

    jTable1.setComponentPopupMenu(new JPopupMenu());
    jTable1.getComponentPopupMenu().add(editar);
    jTable1.getComponentPopupMenu().add(Eliminar);
}
    public void CargarTabla(){
     DefaultTableModel data = new DefaultTableModel(new String[]{"Usuario", "Nombre", "Apellido", "Contraeña"},LoginA.profesores.size());
        jTable1.setModel(data);
        
        int row=0;
        
        for(Profesor c : LoginA.profesores){
            jTable1.setValueAt(c.usuario, row, 0);
            jTable1.setValueAt(c.nombre, row, 1); 
            jTable1.setValueAt(c.apellido, row, 2);
            jTable1.setValueAt(c.password, row, 3);
           
            row++;
        }
      }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Administrador a = new Administrador();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(this,"Cargar");
        if(retorno==JFileChooser.APPROVE_OPTION){
            leerArchivoTextoProfesores(archivo.getSelectedFile().toPath().toString());
        }
 // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
  StringBuilder contenido = new StringBuilder();
        
        for (Profesor e : LoginA.profesores) {
            contenido.append(e.usuario).append(",")
                     .append(e.nombre).append(",")
                     .append(e.apellido).append(",")
                     .append(e.password).append("\n");
        }

        // Crear y mostrar el JFileChooser para seleccionar la ubicación del archivo
        JFileChooser archivo = new JFileChooser();
        int retorno = archivo.showDialog(null, "Guardar");
        if (retorno == JFileChooser.APPROVE_OPTION) {
            escribirArchivoTexto(archivo.getSelectedFile().toPath().toString(), contenido.toString());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

        public void escribirArchivoTexto(String rutaConNombre, String contenido) {
        // Usar try-with-resources para asegurar el cierre de recursos
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaConNombre))) {
            bw.write(contenido);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void leerArchivoTextoProfesores(String rutaConNombre){
        
        try{
            File f = new File(rutaConNombre);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            
            String linea;
            while((linea = br.readLine())!=null){
                String[] datos = linea.split(",");
                Profesor e = new Profesor();
                e.usuario =datos[0];
                e.nombre = datos[1];
                e.apellido= datos[2];
                e.password= datos[3];
                LoginA.profesores.add(e);
            }
            CargarTabla();
            fr.close();
            br.close();
            
        
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}