/*
 * FacturacionCancelar.java
 * Created on 23/06/2011, 12:13:24 PM
 */
package tareas;

import controladores.Facturas;
import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 * @author Jesus Malo:  23-jun-2011
 */
public class FacturacionCancelar extends javax.swing.JDialog {
    
    public FacturacionCancelar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        no_factura = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Eliminar");
        setResizable(false);

        jLabel1.setText("No. de Factura:");

        no_factura.setToolTipText("Presione \"Enter\" para ejecutar");
        no_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                no_facturaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_facturaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(no_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(no_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void no_facturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_facturaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            Facturas f = new Facturas();
            f.setNo_Factura(no_factura.getText());
            if(f.eliminarFactura())
               JOptionPane.showMessageDialog(null,"Factura eliminada correctamente","Atención!",JOptionPane.INFORMATION_MESSAGE);
         no_factura.setText(null);
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE)
            dispose();        
    }//GEN-LAST:event_no_facturaKeyPressed

    private void no_facturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_facturaKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_no_facturaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField no_factura;
    // End of variables declaration//GEN-END:variables
}
