/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cobradors.java
 *
 * Created on 21/06/2011, 12:23:13 PM
 */
package tareas;

import controladores.Matematicas;
import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Cobradors extends javax.swing.JDialog {

    private double total_a_pagar, vuelto;
    private VentasDevoluciones venta;
    
    public Cobradors(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        venta = (VentasDevoluciones) parent;
        importe.requestFocus(); 
    }        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        total = new javax.swing.JTextField();
        cobrar_btn = new javax.swing.JButton();
        cobrar_btn1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        cambio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        importe = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setForeground(java.awt.Color.white);
        setUndecorated(true);

        total.setBackground(new java.awt.Color(0, 0, 0));
        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 48));
        total.setForeground(new java.awt.Color(0, 255, 0));

        cobrar_btn.setFont(new java.awt.Font("Tahoma", 1, 14));
        cobrar_btn.setForeground(new java.awt.Color(0, 102, 0));
        cobrar_btn.setText("$Cobrar");
        cobrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrar_btnActionPerformed(evt);
            }
        });
        cobrar_btn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cobrar_btnKeyPressed(evt);
            }
        });

        cobrar_btn1.setFont(new java.awt.Font("Tahoma", 1, 14));
        cobrar_btn1.setForeground(new java.awt.Color(153, 153, 153));
        cobrar_btn1.setText("Cancelar");
        cobrar_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cobrar_btn1ActionPerformed(evt);
            }
        });

        jSeparator2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel1.setText("Total:");

        cambio.setBackground(new java.awt.Color(0, 0, 0));
        cambio.setFont(new java.awt.Font("Tahoma", 1, 48));
        cambio.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel4.setText("Cambio:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Importe:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        importe.setFont(new java.awt.Font("Tahoma", 1, 48));
        importe.setForeground(new java.awt.Color(0, 0, 102));
        importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                importeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                importeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(importe, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1)
                            .addComponent(jSeparator2)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator1)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                            .addComponent(cambio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(cobrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cobrar_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cambio, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cobrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cobrar_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cobrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrar_btnActionPerformed
        finalizar();
}//GEN-LAST:event_cobrar_btnActionPerformed

    private void cobrar_btnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cobrar_btnKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            finalizar();
        }
}//GEN-LAST:event_cobrar_btnKeyPressed

    private void cobrar_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cobrar_btn1ActionPerformed
        setVisible(false);
}//GEN-LAST:event_cobrar_btn1ActionPerformed

    private void importeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            elCambio();
        }else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE)
            setVisible(false);
}//GEN-LAST:event_importeKeyPressed

    private void importeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_importeKeyTyped
        Validador.validarPrecio(importe, evt);
        if(importe.getText().length()==15)
            evt.consume();
}//GEN-LAST:event_importeKeyTyped

void elCambio(){
      if(!importe.getText().equals("")){
          if(Double.parseDouble(importe.getText())>=total_a_pagar){
            setImporte(Double.parseDouble(importe.getText()));
            cobrar_btn.requestFocus();
          }else
              JOptionPane.showMessageDialog(this, "El importe es menor al total", "Atención!", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    void finalizar(){
      if(!importe.getText().equals("")){
           venta.registrarSalida();
           importe.setText(null);
           cambio.setText(null);
           setVisible(false);
       }
    }
    
    public void setTotal(double tot ){
     total_a_pagar =  tot;
     total.setText("$"+total_a_pagar);
     importe.requestFocus();
   }
   
   public void setImporte(double importe){
       vuelto = (Matematicas.redondear((importe-total_a_pagar),3));
       if(vuelto<1)
         cambio.setText("¢"+(int)(vuelto*100));
       else
         cambio.setText("$"+vuelto);
   }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cambio;
    private javax.swing.JButton cobrar_btn;
    private javax.swing.JButton cobrar_btn1;
    private javax.swing.JTextField importe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
}
