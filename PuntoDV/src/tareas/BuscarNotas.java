/*
 * BuscarNotas.java
 *
 * Created on 29/04/2011, 08:59:29 AM
 */
package tareas;

import controladores.Fecha;
import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesús Malo
 */
public class BuscarNotas extends javax.swing.JFrame {
   javax.swing.JTable notas;
   controladores.Notas nota;
   Facturacion f;
   int aux=0;
   private GregorianCalendar primera, segunda;
    /** Creates new form BuscarNotas */
    public BuscarNotas() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        nota = new controladores.Notas();        
        primera = new GregorianCalendar();
        segunda = new GregorianCalendar();   
        setAlwaysOnTop(true);
    }
    
    public void setForm(Facturacion f){
     this.f = f;
    }

    public void setTabla(javax.swing.JTable t, int id_cliente){
      notas = t;
      nota.setId_Cliente(id_cliente);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buscar_btn = new javax.swing.JButton();
        no_nota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fecha_f = new javax.swing.JTextField();
        buscarVarias_btn = new javax.swing.JButton();
        fecha_i = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda de notas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda de notas"));

        jLabel1.setText("Fecha de captura:");

        jLabel4.setText("-");

        buscar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscar.png"))); // NOI18N
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        no_nota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                no_notaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_notaKeyTyped(evt);
            }
        });

        jLabel3.setText("No. Nota:");

        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Búsqueda específica");

        fecha_f.setToolTipText("dd-mm-aaaa");
        fecha_f.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fecha_fFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_fFocusLost(evt);
            }
        });
        fecha_f.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_fKeyTyped(evt);
            }
        });

        buscarVarias_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/buscarVarias.png"))); // NOI18N
        buscarVarias_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarVarias_btnActionPerformed(evt);
            }
        });

        fecha_i.setToolTipText("dd-mm-aaaa");
        fecha_i.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fecha_iFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_iFocusLost(evt);
            }
        });
        fecha_i.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_iKeyTyped(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Búsqueda por fechas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha_i, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha_f, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarVarias_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(no_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buscar_btn)
                        .addGap(18, 18, 18)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(fecha_i, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(fecha_f, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(buscarVarias_btn))))
        );

        jButton3.setForeground(new java.awt.Color(153, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(329, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void no_notaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_notaKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_no_notaKeyTyped

    private void no_notaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_notaKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         if(!no_nota.getText().equals("")){             
          nota.setNo_Nota(no_nota.getText());          
           if(nota.conseguirNotaParaFacturar()){             
             f.setObservaciones(nota.getNota());
           }
           f.calcularImporteTotal();
         }
         no_nota.setText(null);
       }
    }//GEN-LAST:event_no_notaKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nota.setTablaArticulos(notas);
        fecha_i.setText(Fecha.getFechaHoy());
        fecha_f.setText(Fecha.getFechaHoy());
    }//GEN-LAST:event_formWindowOpened

    private void fecha_iFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_iFocusGained
        fecha_i.selectAll();
    }//GEN-LAST:event_fecha_iFocusGained

    private void fecha_fFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_fFocusGained
        fecha_f.selectAll();
    }//GEN-LAST:event_fecha_fFocusGained

    private void fecha_iFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_iFocusLost
        if(!Validador.validarFecha(fecha_i.getText()))
            JOptionPane.showMessageDialog(null, "Formato de fecha no válido... ingrese(DD-MM-AAAA)", "Atención!", JOptionPane.ERROR_MESSAGE);       
    }//GEN-LAST:event_fecha_iFocusLost

    private void fecha_fFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_fFocusLost
       if(!Validador.validarFecha(fecha_f.getText()))
            JOptionPane.showMessageDialog(null, "Formato de fecha no válido... ingrese(DD-MM-AAAA)", "Atención!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_fecha_fFocusLost

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        if(!no_nota.getText().equals("")){
          nota.setNo_Nota(no_nota.getText());         
           if(nota.conseguirNotaParaFacturar()){
             f.calcularImporteTotal();
             f.setObservaciones(nota.getNota());
           }
         }
         no_nota.setText(null);
    }//GEN-LAST:event_buscar_btnActionPerformed

    private void fecha_iKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_iKeyTyped
        Validador.validarCadena(evt);
        if(fecha_i.getText().length()==8)
            evt.consume();
    }//GEN-LAST:event_fecha_iKeyTyped

    private void buscarVarias_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarVarias_btnActionPerformed
       Validador.validarFecha(fecha_i.getText());
        primera.setTime(Validador.getFormateada());
       Validador.validarFecha(fecha_f.getText()); 
        segunda.setTime(Validador.getFormateada());                
        if(primera.after(segunda)){
            JOptionPane.showMessageDialog(null, "La primer fecha es mayor que la segunda", "Atención", JOptionPane.ERROR_MESSAGE);
            return;
        }
        nota.conseguirVariasNotas(fecha_i.getText(), fecha_f.getText());
         f.calcularImporteTotal();
         f.borrarObservaciones();
         f.setObservaciones("Nota(s):"+nota.getNumNotas(fecha_i.getText(), fecha_f.getText()));
    }//GEN-LAST:event_buscarVarias_btnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        nota.desconectar();        
    }//GEN-LAST:event_formWindowClosed

    private void fecha_fKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_fKeyTyped
        if(fecha_f.getText().length()==8)
            evt.consume();
    }//GEN-LAST:event_fecha_fKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarVarias_btn;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JTextField fecha_f;
    private javax.swing.JTextField fecha_i;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField no_nota;
    // End of variables declaration//GEN-END:variables
}
