/*
 * Intervalo.java
 * Created on 7/06/2011, 10:11:25 AM
 */
package reportes;

import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Malo
 */
public class Intervalo extends javax.swing.JDialog {

    
    ReportesClass reporte;
    public Intervalo(java.awt.Frame parent, boolean modal, ReportesClass r) {
        super(parent, modal);
        initComponents();
        reporte = r;
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aceptar_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fecha_i = new javax.swing.JTextField();
        fecha_f = new javax.swing.JTextField();
        cancelar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        aceptar_btn.setText("Aceptar");
        aceptar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptar_btnActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Intervalo de fechas para el reporte"));

        jLabel1.setText("Fecha inicial:");

        jLabel2.setText("Fecha final:");

        fecha_i.setToolTipText("dd-mm-aaaa");
        fecha_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_iKeyPressed(evt);
            }
        });

        fecha_f.setToolTipText("dd-mm-aaaa");
        fecha_f.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_fFocusLost(evt);
            }
        });
        fecha_f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fecha_fKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(fecha_f, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fecha_i, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(fecha_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(aceptar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelar_btn)
                    .addComponent(aceptar_btn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptar_btnActionPerformed
        buscar();
    }//GEN-LAST:event_aceptar_btnActionPerformed

    private void fecha_fFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_fFocusLost
        if(!Validador.validarFecha(fecha_f.getText()))
            JOptionPane.showMessageDialog(null, "Formato de fecha erroneo", "Atención!", JOptionPane.ERROR_MESSAGE);
}//GEN-LAST:event_fecha_fFocusLost

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        dispose();
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fecha_i.setText(controladores.Fecha.getFechaHoy());
        fecha_f.setText(fecha_i.getText());        
    }//GEN-LAST:event_formWindowOpened

    private void fecha_fKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_fKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            buscar();
    }//GEN-LAST:event_fecha_fKeyPressed

    private void fecha_iKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_iKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(Validador.validarFecha(fecha_i.getText()))
                fecha_f.requestFocus();
        }
    }//GEN-LAST:event_fecha_iKeyPressed

    public void buscar(){
        if(!Validador.validarFecha(fecha_f.getText())){
            JOptionPane.showMessageDialog(null, "Verifique la fecha final", "Error de formato de fecha", JOptionPane.ERROR_MESSAGE);
            return;
        }        
        //tipoReporte();
        reporte.setParametroFecha("P_FECHA_I", fecha_i.getText());
        reporte.setParametroFecha("P_FECHA_F", fecha_f.getText());
        reporte.doReporte();
        dispose();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Intervalo dialog = new Intervalo(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar_btn;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JTextField fecha_f;
    private javax.swing.JTextField fecha_i;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
