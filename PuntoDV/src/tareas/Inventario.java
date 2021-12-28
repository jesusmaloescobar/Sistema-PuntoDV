/*
 * Inventario.java
 *
 * Created on 5/04/2011, 08:59:20 PM
 */

package tareas;

import altas.Articulos;
import controladores.Convertidor;
import controladores.Impuestos;
import controladores.RecursosPC;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus
 */
public class Inventario extends javax.swing.JFrame {
   DefaultTableModel tabla;
   private controladores.Inventario inv=null;
    /** Creates new form Inventario */
    public Inventario() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        tabla = (DefaultTableModel) tabla_inventario.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_inventario = new javax.swing.JTable();
        siguiente_pagina = new javax.swing.JButton();
        pagina_anterior = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        calculando = new javax.swing.JProgressBar();
        inversion_en_letra = new javax.swing.JLabel();
        inicio = new javax.swing.JButton();
        paginas = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        total_articulos = new javax.swing.JLabel();
        vaciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operaciones sobre inventario");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tabla_inventario.setAutoCreateRowSorter(true);
        tabla_inventario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        tabla_inventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Presentación", "Precio/Compra S/IVA", "IVA C.", "Precio/Venta S/IVA", "IVA V.", "Existencia", "Inversión"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_inventario.setToolTipText("Datos modificables: Precio de venta; presione la tecla \"+\" para modificar");
        tabla_inventario.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tabla_inventario.setAutoscrolls(false);
        tabla_inventario.setColumnSelectionAllowed(true);
        tabla_inventario.setDragEnabled(true);
        tabla_inventario.getTableHeader().setReorderingAllowed(false);
        tabla_inventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tabla_inventarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_inventarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_inventario);
        tabla_inventario.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tabla_inventario.getColumnModel().getColumnCount() > 0) {
            tabla_inventario.getColumnModel().getColumn(0).setPreferredWidth(20);
            tabla_inventario.getColumnModel().getColumn(1).setPreferredWidth(300);
            tabla_inventario.getColumnModel().getColumn(2).setPreferredWidth(30);
            tabla_inventario.getColumnModel().getColumn(3).setPreferredWidth(20);
            tabla_inventario.getColumnModel().getColumn(4).setPreferredWidth(20);
            tabla_inventario.getColumnModel().getColumn(5).setPreferredWidth(20);
            tabla_inventario.getColumnModel().getColumn(6).setPreferredWidth(20);
            tabla_inventario.getColumnModel().getColumn(7).setPreferredWidth(15);
            tabla_inventario.getColumnModel().getColumn(8).setPreferredWidth(20);
        }

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos sobre la inversión actual"));

        jLabel1.setText("Subtotal:");

        subtotal.setEditable(false);

        jLabel2.setText("I.V.A.:");

        iva.setEditable(false);

        jLabel3.setText("Total:");

        total.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total)
                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(iva))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        calculando.setIndeterminate(true);
        calculando.setRequestFocusEnabled(false);
        calculando.setString("Calculando...");
        calculando.setStringPainted(true);

        inversion_en_letra.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        inversion_en_letra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        inversion_en_letra.setToolTipText("Inversión del total de inventario en precio de compra");

        inicio.setText("Inicio");
        inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioActionPerformed(evt);
            }
        });

        paginas.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        paginas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        paginas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        paginas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setText("Número de registros:");

        total_articulos.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N

        vaciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reciclar.png"))); // NOI18N
        vaciar.setText("Vaciar inventario");
        vaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vaciar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(308, 308, 308)
                                        .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pagina_anterior)
                                        .addGap(18, 18, 18)
                                        .addComponent(siguiente_pagina)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calculando, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(inversion_en_letra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(total_articulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addComponent(vaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paginas, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(siguiente_pagina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pagina_anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(calculando, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inversion_en_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      new Thread(){
            @Override
        public void run(){
           inv = new controladores.Inventario();
       inv.setTabla(tabla);
        inv.setMaxColumnAndRow(tabla.getColumnCount(),tabla.getRowCount());
        inv.inicializarTabla();
        inv.cargarInventario();
        inv.inicio(); //mostramos los datos de la primera pagina
        inv.getInversionTotal(); //mandamos calcular la inversion total
        paginas.setText("Página 1 de "+inv.getTotPag());
        total_articulos.setText(""+inv.getTotalRegistros());
        subtotal.setText(""+inv.getSubtotal());
        iva.setText(""+inv.getIva());
        total.setText(""+inv.getTotal());
        inversion_en_letra.setText(Convertidor.getStringOfNumber(Float.parseFloat(total.getText())));
         calculando.setVisible(false);
        }
      }.start(); 
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        inv.desconectar();        
    }//GEN-LAST:event_formWindowClosing

    private void siguiente_paginaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguiente_paginaActionPerformed
        inv.setSiguiente();
        paginas.setText("Página "+inv.getPaginaActual()+" de "+inv.getTotPag());
    }//GEN-LAST:event_siguiente_paginaActionPerformed

    private void pagina_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagina_anteriorActionPerformed
        inv.setAnterior();
        paginas.setText("Página "+inv.getPaginaActual()+" de "+inv.getTotPag());
    }//GEN-LAST:event_pagina_anteriorActionPerformed

    private void inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioActionPerformed
        inv.inicio();
        paginas.setText("Página "+inv.getPaginaActual()+" de "+inv.getTotPag());
    }//GEN-LAST:event_inicioActionPerformed

    private void tabla_inventarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_inventarioKeyReleased
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!tabla.getValueAt(tabla_inventario.getSelectedRow(), tabla_inventario.getSelectedColumn()).equals("")) //comprobar si la fila tiene datos
          if(tabla_inventario.getSelectedColumn()==5){ //si esta modificando el precio              
              double precio = Double.parseDouble(tabla.getValueAt(tabla_inventario.getSelectedRow(), tabla_inventario.getSelectedColumn()).toString());
              precio = precio*(1+(Impuestos.getIVAenVActual()/100));
              controladores.Articulo a = new controladores.Articulo();
              a.setId_articulo(tabla_inventario.getValueAt(tabla_inventario.getSelectedRow(),0).toString()); //el código del producto...
              a.setPrecioVenta(precio, precio); //el nuevo costo de venta
              a.actualizarPrecioVenta();
              a.desconectar();
              a=null;
              inv.cargarInventario(); //volvemos a cargar el inventario
              inv.setAnterior();
          }
        }
       else if(evt.getKeyCode()==KeyEvent.VK_ADD)
       {
          Articulos a = new Articulos();          
          a.datosIniciales();
          a.setAccionForanea(); //determinamos si se cargaran datos iniciales desde Articulos
         a.setIdArticulo(tabla_inventario.getValueAt(tabla_inventario.getSelectedRow(), 0).toString());
         a.buscarArticulo();
         a.setVisible(true);
       }
    }//GEN-LAST:event_tabla_inventarioKeyReleased

    private void vaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarActionPerformed
        if(JOptionPane.showConfirmDialog(this, "¿Está seguro que desea vaciar el inventario?", "Mucha atención!", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
              inv.vaciarInventario();
              JOptionPane.showMessageDialog(this, "Operación completada exitósamente", "Atención", JOptionPane.INFORMATION_MESSAGE);
              inv.inicializarTabla();
        }
    }//GEN-LAST:event_vaciarActionPerformed

    private void tabla_inventarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_inventarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
         if(!tabla.getValueAt(tabla_inventario.getSelectedRow(), tabla_inventario.getSelectedColumn()).equals("")) //comprobar si la fila tiene datos
         if(JOptionPane.showConfirmDialog(this, "¿Desea eliminar todas las capas para éste artículo en el inventario?", "Atención!", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
              controladores.Articulo a = new controladores.Articulo();
              a.setId_articulo(tabla_inventario.getValueAt(tabla_inventario.getSelectedRow(),0).toString()); //el código del producto...
              a.deleteFromInventario();
              a.desconectar();
              a=null;
              inv.cargarInventario();
              inv.setAnterior();
         }
        }
    }//GEN-LAST:event_tabla_inventarioKeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar calculando;
    private javax.swing.JButton inicio;
    private javax.swing.JLabel inversion_en_letra;
    private javax.swing.JTextField iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton pagina_anterior;
    private javax.swing.JLabel paginas;
    private javax.swing.JButton siguiente_pagina;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla_inventario;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_articulos;
    private javax.swing.JButton vaciar;
    // End of variables declaration//GEN-END:variables
        
}
