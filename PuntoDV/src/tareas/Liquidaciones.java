/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Liquidaciones.java
 *
 * Created on 28/05/2011, 12:40:54 PM
 */
package tareas;

import controladores.*;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus
 */
public class Liquidaciones extends javax.swing.JFrame {

    private controladores.Notas notas;
    private Cliente cliente;
    DefaultTableModel tabla_model;
    int var;
    Liquidacion liquidacion;
    
    public Liquidaciones() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        notas = new controladores.Notas();
        cliente = new Cliente();
        tabla_model = (DefaultTableModel) tabla.getModel();
        liquidacion = new Liquidacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nota_venta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fecha_factura = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        abono = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        hoy = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        estatus = new javax.swing.JLabel();
        eliminar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Liquidar facturas pendientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota"));

        jLabel1.setText("ID Cliente:");

        id_cliente.setBackground(new java.awt.Color(230, 228, 228));
        id_cliente.setEditable(false);
        id_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_cliente.setToolTipText("Ingrese ID del cliente");

        jLabel2.setText("Nombre:");

        jLabel3.setText("No. Nota:");

        nota_venta.setFont(new java.awt.Font("Tahoma", 1, 11));
        nota_venta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nota_ventaFocusLost(evt);
            }
        });
        nota_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nota_ventaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nota_ventaKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha de expedición:");

        fecha_factura.setBackground(new java.awt.Color(230, 228, 228));
        fecha_factura.setEditable(false);

        jLabel13.setText("Dirección:");

        direccion.setBackground(new java.awt.Color(230, 228, 228));
        direccion.setEditable(false);

        jLabel14.setText("RFC:");

        rfc.setBackground(new java.awt.Color(230, 228, 228));
        rfc.setEditable(false);

        jLabel15.setText("Teléfono:");

        telefono.setBackground(new java.awt.Color(230, 228, 228));
        telefono.setEditable(false);

        nombre.setBackground(new java.awt.Color(230, 228, 228));
        nombre.setEditable(false);

        jLabel17.setText("Costo total:");

        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 11));
        total.setForeground(new java.awt.Color(0, 0, 153));
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nota_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nota_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de los abonos"));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha de pago", "Monto", "Importe", "Restante"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla);

        jLabel18.setText("Abono:$");

        abono.setFont(new java.awt.Font("Tahoma", 1, 11));
        abono.setForeground(new java.awt.Color(0, 0, 153));
        abono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        abono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                abonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                abonoKeyTyped(evt);
            }
        });

        ok.setText("Aceptar");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel5.setText("Fecha:");

        hoy.setBackground(new java.awt.Color(230, 228, 228));
        hoy.setToolTipText("dd-mm-aaaa");
        hoy.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hoyFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(abono, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(hoy, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok)
                    .addComponent(hoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar nota");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        estatus.setFont(new java.awt.Font("Tahoma", 1, 14));
        estatus.setForeground(new java.awt.Color(0, 0, 204));

        eliminar_btn.setText("Eliminar");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(eliminar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addComponent(estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nota_ventaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nota_ventaFocusLost
        buscarNota();
}//GEN-LAST:event_nota_ventaFocusLost

    private void nota_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota_ventaKeyTyped
        Validador.validarCadena(evt);
}//GEN-LAST:event_nota_ventaKeyTyped

    private void nota_ventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nota_ventaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            buscarNota();
    }//GEN-LAST:event_nota_ventaKeyPressed

    private void abonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_abonoKeyTyped
        Validador.validarPrecio(abono, evt);
    }//GEN-LAST:event_abonoKeyTyped

    private void abonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_abonoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            pagar();
    }//GEN-LAST:event_abonoKeyPressed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
            pagar();
    }//GEN-LAST:event_okActionPerformed

    private void hoyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hoyFocusLost
        if(!Validador.validarFecha(hoy.getText()))
            JOptionPane.showMessageDialog(null, "El formato de fecha proporcionado es erroneo.", "Atención", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_hoyFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        hoy.setText(Fecha.getFechaHoy());        
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        liquidacion.desconectar();
        liquidacion=null;
        notas.desconectar();
        cliente.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        if(!nota_venta.getText().equals(""))
          if(JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cancelar esta Nota?", "Atención!", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            liquidacion.cancelarNota();
            estatus.setForeground(Color.red);
            estatus.setText("La Nota se ha cancelado");            
          }
    }//GEN-LAST:event_cancelarActionPerformed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "¿Seguro que desea eliminar ésta Nota?", "Eliminación segura...", JOptionPane.YES_NO_OPTION);
        if(x==JOptionPane.YES_OPTION){
         controladores.Notas n = new controladores.Notas();
         n.setNo_Nota(nota_venta.getText());
         if(n.eliminarNota()){
            JOptionPane.showMessageDialog(null, "La Nota se ha eliminado...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
            limpiarCampos();
         }
        }
    }//GEN-LAST:event_eliminar_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abono;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JLabel estatus;
    private javax.swing.JTextField fecha_factura;
    private javax.swing.JTextField hoy;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nota_venta;
    private javax.swing.JButton ok;
    private javax.swing.JTextField rfc;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables

    private void buscarNota() {
        if(!nota_venta.getText().equals("")){
        notas.setNo_Nota(nota_venta.getText());
        if(notas.buscarNota()){                
                 if(notas.getId_estatus()==1){  //liquidada
                     estatus.setForeground(Color.blue);
                     estatus.setText("La Nota está pagada");
                 }else if(notas.getId_estatus()==2){ //pendite de pagar
                     estatus.setForeground(Color.GRAY);
                     estatus.setText("La Nota está pendiente de pago");
                 }else if(notas.getId_estatus()==3){
                     estatus.setForeground(Color.red);
                     estatus.setText("Esta Nota fue cancelada...");
                 }else if(notas.getId_estatus()==4){
                   estatus.setForeground(Color.BLACK);
                     estatus.setText("Esta Nota esta en preventa...");
                 }
                cliente.setID(notas.getId_Cliente());
                cliente.cargarInformacionCliente();
                id_cliente.setText(""+cliente.getID());
                nombre.setText(cliente.getNombre());
                direccion.setText(cliente.getDireccion());
                rfc.setText(cliente.getRFC());
                fecha_factura.setText(notas.getFecha());
                telefono.setText(cliente.getTelefono());
                total.setText(""+notas.getTotal());
                 liquidacion.setNoFactura(nota_venta.getText());
                 liquidacion.setMonto(notas.getTotal());
                liquidacion.getPagos(tabla_model);
              abono.requestFocus();
         }else
            limpiarCampos();
       }
    }

    private void pagar() {
        if(!abono.getText().equals("")){
          if(JOptionPane.showConfirmDialog(null, "¿El importe es correcto? $"+abono.getText(), "Atención!", JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION)
              return;
          var = tabla.getRowCount()-1;
          if(var>0){
           if(Double.parseDouble(tabla.getValueAt(var, 3).toString())==0)
              return;
          }
          tabla_model.addRow(new Object[1]);
          var = tabla.getRowCount()-1;
          tabla.setValueAt(hoy.getText(), var, 0);
          if(var>0)
            tabla.setValueAt(tabla.getValueAt(var-1, 3), var, 1);
          else
            tabla.setValueAt(total.getText(), var, 1);
          if(Double.parseDouble(tabla.getValueAt(var, 1).toString())<=Double.parseDouble(abono.getText())){
            tabla.setValueAt(tabla.getValueAt(var, 1), var, 2);
            tabla.setValueAt(0, var, 3);
            estatus.setForeground(Color.BLUE);
            estatus.setText("Pago completado");
          }else{
            tabla.setValueAt(Matematicas.redondear(Double.parseDouble(tabla.getValueAt(var, 1).toString())-Double.parseDouble(abono.getText()),2), var, 3);
            tabla.setValueAt(abono.getText(), var, 2);          
          }
         abono.setText(null);
         registrarPago();
        }
    }
    
    void registrarPago(){
      liquidacion.registrarPago(tabla);
    }

    private void limpiarCampos() {
        id_cliente.setText(null);
        nombre.setText(null);
        direccion.setText(null);
        rfc.setText(null);
        fecha_factura.setText(null);
        telefono.setText(null);
        total.setText(null);
        for(var=tabla.getRowCount()-1; var>=0; var--)
            tabla_model.removeRow(var);
    }
}
