/*
 * Mobiliario.java
 *
 * Created on 12/07/2011, 02:20:31 PM
 */
package altas;

import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;

/**
 *
 * @author USUARIO
 */
public class Mobiliario extends javax.swing.JFrame {

    controladores.Mobiliario mobiliario;
    
    public Mobiliario() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        mobiliario = new controladores.Mobiliario();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id_mobiliario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        modelo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        existencia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        marca = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        logo = new javax.swing.JTextField();
        guardar_actualizar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        descripcion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alta de mobiliario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID:");

        id_mobiliario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_mobiliarioFocusLost(evt);
            }
        });
        id_mobiliario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_mobiliarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_mobiliarioKeyTyped(evt);
            }
        });

        jLabel3.setText("Modelo:");

        modelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                modeloKeyTyped(evt);
            }
        });

        jLabel4.setText("Existencia:");

        existencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                existenciaKeyTyped(evt);
            }
        });

        jLabel5.setText("Marca:");

        marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                marcaKeyTyped(evt);
            }
        });

        jLabel6.setText("Logo:");

        logo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                logoKeyTyped(evt);
            }
        });

        guardar_actualizar.setText("Guardar");
        guardar_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_actualizarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Descripción"));

        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_mobiliario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(5, 5, 5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modelo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(marca, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(guardar_actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_mobiliario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar_actualizar)
                    .addComponent(cancelar)
                    .addComponent(salir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void guardar_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_actualizarActionPerformed
      if(guardar_actualizar.getText().equals("Guardar"))
        registrarMobiliario();
      else{
        actualizarMob();
        guardar_actualizar.setText("Guardar");
      }      
    }//GEN-LAST:event_guardar_actualizarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        mobiliario.ultimoRegistroID();
        limpiarCampos();
        guardar_actualizar.setText("Guardar");
    }//GEN-LAST:event_cancelarActionPerformed

    private void id_mobiliarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_mobiliarioKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_id_mobiliarioKeyTyped

    private void modeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_modeloKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_modeloKeyTyped

    private void existenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciaKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_existenciaKeyTyped

    private void marcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marcaKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_marcaKeyTyped

    private void logoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_logoKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_logoKeyTyped

    private void descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_descripcionKeyTyped

    private void id_mobiliarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_mobiliarioFocusLost
        mobiliario.setIdMobilario(Integer.parseInt(id_mobiliario.getText()));
        if(mobiliario.buscarPorID()){
            mostrar();
            guardar_actualizar.setText("Actualizar");
        }            
    }//GEN-LAST:event_id_mobiliarioFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        mobiliario.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void id_mobiliarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_mobiliarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            descripcion.requestFocus();
    }//GEN-LAST:event_id_mobiliarioKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        mobiliario.ultimoRegistroID();
        id_mobiliario.setText(""+mobiliario.getSigID());
        descripcion.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    void mostrar(){
        descripcion.setText(mobiliario.getDescripcion());
        modelo.setText(mobiliario.getModelo());
        existencia.setText(""+mobiliario.getExistencia());
        marca.setText(mobiliario.getMarca());
        logo.setText(mobiliario.getLogo());
    }
    
    public void registrarMobiliario(){
       if(validarCampos()){
           cargarDatos();
           if(mobiliario.registrar())
               limpiarCampos();
       }
    }
    
    public void actualizarMob(){
       if(validarCampos()){
           cargarDatos();
           if(mobiliario.actualizar()){
              mobiliario.ultimoRegistroID(); 
               limpiarCampos();
           }
       }
    }
    
    void cargarDatos(){
      mobiliario.setIdMobilario(Integer.parseInt(id_mobiliario.getText()));
      mobiliario.setDescripcion(descripcion.getText());
      mobiliario.setModelo(modelo.getText());
      mobiliario.setExistencia(Integer.parseInt(existencia.getText()));
      mobiliario.setMarca(marca.getText());
      mobiliario.setLogo(logo.getText());
    }
    
    public boolean validarCampos(){
       if(!id_mobiliario.getText().equals("") &
          !descripcion.getText().equals("") &
          !modelo.getText().equals("") &
          !existencia.getText().equals("") &
          !marca.getText().equals("") &
          !logo.getText().equals("") )
           return true;       
       else
           return false;       
    }
    
    private void limpiarCampos() {
        id_mobiliario.setText(""+mobiliario.getSigID());
        descripcion.setText(null);
        modelo.setText(null);
        existencia.setText(null);
        marca.setText(null);
        logo.setText(null);
        descripcion.requestFocus();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField descripcion;
    private javax.swing.JTextField existencia;
    private javax.swing.JButton guardar_actualizar;
    private javax.swing.JTextField id_mobiliario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField logo;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField modelo;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

    
}
