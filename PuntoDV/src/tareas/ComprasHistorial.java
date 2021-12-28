/*
 * Inventario.java
 *
 * Created on 5/04/2011, 08:59:20 PM
 */

package tareas;

import controladores.Convertidor;
import controladores.RecursosPC;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus
 */
public class ComprasHistorial extends javax.swing.JFrame {
   DefaultTableModel tabla;
   private controladores.Entradas compras=null;
    /** Creates new form Inventario */
    public ComprasHistorial() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        tabla = (DefaultTableModel) tabla_compras.getModel();
        setAlwaysOnTop(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_compras = new javax.swing.JTable();
        siguiente_pagina = new javax.swing.JButton();
        pagina_anterior = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        descuento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sub_total = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        calculando = new javax.swing.JProgressBar();
        inversion_en_letra = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        paginas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historial de compras");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabla_compras.setAutoCreateRowSorter(true);
        tabla_compras.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tabla_compras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No. control", "Fecha", "Cantidad", "Subtotal", "Descuento", "Sub_total", "IVA", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_compras.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla_compras.setAutoscrolls(false);
        tabla_compras.setColumnSelectionAllowed(true);
        tabla_compras.setDragEnabled(true);
        tabla_compras.getTableHeader().setReorderingAllowed(false);
        tabla_compras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_comprasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_compras);
        tabla_compras.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_compras.getColumnModel().getColumn(0).setPreferredWidth(30);
        tabla_compras.getColumnModel().getColumn(1).setPreferredWidth(30);
        tabla_compras.getColumnModel().getColumn(2).setPreferredWidth(30);
        tabla_compras.getColumnModel().getColumn(3).setPreferredWidth(30);
        tabla_compras.getColumnModel().getColumn(4).setPreferredWidth(30);
        tabla_compras.getColumnModel().getColumn(5).setPreferredWidth(30);
        tabla_compras.getColumnModel().getColumn(6).setPreferredWidth(30);
        tabla_compras.getColumnModel().getColumn(7).setPreferredWidth(30);
        tabla_compras.getAccessibleContext().setAccessibleDescription("");

        siguiente_pagina.setText("Siguiente>>");
        siguiente_pagina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguiente_paginaActionPerformed(evt);
            }
        });

        pagina_anterior.setText("<<Anterior");
        pagina_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagina_anteriorActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Compras"));

        jLabel1.setText("Subtotal:");

        subtotal.setEditable(false);

        jLabel2.setText("I.V.A.:");

        iva.setEditable(false);

        jLabel3.setText("Total:");

        total.setEditable(false);

        descuento.setEditable(false);

        jLabel4.setText("Descuento:");

        sub_total.setEditable(false);

        jLabel5.setText("Sub_total:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(iva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(sub_total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(descuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sub_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        calculando.setIndeterminate(true);
        calculando.setRequestFocusEnabled(false);
        calculando.setString("Calculando...");
        calculando.setStringPainted(true);

        inversion_en_letra.setBackground(new java.awt.Color(204, 204, 255));
        inversion_en_letra.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        inversion_en_letra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        inversion_en_letra.setText("0 PESOS 00/100 M.N.");
        inversion_en_letra.setToolTipText("Total de gastos por compras");
        inversion_en_letra.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        paginas.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        paginas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paginas.setText("0 páginas de 0");
        paginas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        paginas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 803, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(pagina_anterior)
                                .addGap(18, 18, 18)
                                .addComponent(siguiente_pagina)
                                .addGap(18, 18, 18)
                                .addComponent(calculando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inversion_en_letra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(siguiente_pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagina_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calculando, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(inversion_en_letra)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      new Thread(){
            @Override
        public void run(){
           compras = new controladores.Entradas();
        compras.setTabla(tabla);
        compras.setMaxColumnAndRow(tabla.getColumnCount(),tabla.getRowCount());
        compras.inicializarTabla();
        compras.cargarCompras();
        compras.inicio(); //mostramos los datos en la primera página
        compras.getInversionTotal(); //mandamos calcular la inversion total
        paginas.setText("Página 1 de "+compras.getTotPag());
        //total_articulos.setText(""+compras.getTotalArticulos());
        subtotal.setText(""+compras.getSubtotal());
        descuento.setText(""+compras.getDescuento());
        sub_total.setText(""+compras.getSub_total());
        iva.setText(""+compras.getIva());
        total.setText(""+compras.getTotal());
        inversion_en_letra.setText(Convertidor.getStringOfNumber(Float.parseFloat(total.getText())));
         calculando.setVisible(false);
        }
      }.start(); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        compras.desconectar();        
    }//GEN-LAST:event_formWindowClosing

    private void siguiente_paginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente_paginaActionPerformed
        compras.setSiguiente();
        paginas.setText("Página "+compras.getPaginaActual()+" de "+compras.getTotPag());
    }//GEN-LAST:event_siguiente_paginaActionPerformed

    private void pagina_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagina_anteriorActionPerformed
        compras.setAnterior();
        paginas.setText("Página "+compras.getPaginaActual()+" de "+compras.getTotPag());
    }//GEN-LAST:event_pagina_anteriorActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        compras.inicio();
        paginas.setText("Página "+compras.getPaginaActual()+" de "+compras.getTotPag());
    }//GEN-LAST:event_inicioActionPerformed

    private void tabla_comprasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_comprasKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
         if(!tabla.getValueAt(tabla_compras.getSelectedRow(), tabla_compras.getSelectedColumn()).equals("")) //comprobar si la fila tiene datos
          if(JOptionPane.showConfirmDialog(this, "Si hay artículos en inventario bajo esta entrada \ntambién se eliminarán, ¿Desea eliminar ésta entrada?", "Mucha atención!", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
              compras.setNumEntrada(Integer.parseInt(tabla.getValueAt(tabla_compras.getSelectedRow(), 0).toString()));
              compras.eliminarEntrada();
              tabla.removeRow(tabla_compras.getSelectedRow());              
          }
        }        
    }//GEN-LAST:event_tabla_comprasKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar calculando;
    private javax.swing.JTextField descuento;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel inversion_en_letra;
    private javax.swing.JTextField iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pagina_anterior;
    private javax.swing.JLabel paginas;
    private javax.swing.JButton siguiente_pagina;
    private javax.swing.JTextField sub_total;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla_compras;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
        
}
