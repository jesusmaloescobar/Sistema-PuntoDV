/*
 * Ventas.java
 *
 * Created on 11/05/2011, 10:00:00 AM
 */

package tareas;

import controladores.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;


/**
 *
 * @author Jesus
 */
public class Compras extends javax.swing.JFrame{

    /** Creates new form Ventas */
    DefaultTableModel modelo_tabla;
    private Articulo nuevo_articulo;
    Cliente cliente;
    private double subtotal_venta;
    private JTextComponent editor_articulo;
    private Entradas compra;
    int aux;
    
    public Compras() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);       
       editor_articulo = (JTextComponent) articulo.getEditor().getEditorComponent();
       editor_articulo.addKeyListener(new SearchingArt());
        modelo_tabla = (DefaultTableModel) tabla_articulos.getModel();
        nuevo_articulo = new Articulo();
        nuevo_articulo.setComboBox(articulo); //asignamos el combo donde mostraremos los articulos...
        cliente = new Cliente();
        compra = new Entradas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        no_entrada = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fecha_compra = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        articulo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_articulos = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        cantidad_con_letra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        id_articulo = new javax.swing.JTextField();
        total_articulos = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        caducidad = new javax.swing.JTextField();
        articulos_tot = new javax.swing.JLabel();
        subtot = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        total_descuento = new javax.swing.JTextField();
        subtotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        registrar_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        historial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de registro de compras");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nueva compra"));

        jLabel1.setText("Compra No.:");

        no_entrada.setBackground(new java.awt.Color(204, 204, 204));
        no_entrada.setEditable(false);
        no_entrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no_entrada.setToolTipText("Consecutivo de compra");

        jLabel4.setText("Fecha:");

        fecha_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_compraKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_compra, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(no_entrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la compra"));

        jLabel5.setText("Artículo:");

        articulo.setEditable(true);
        articulo.setFont(new java.awt.Font("Tahoma", 1, 12));

        jLabel6.setText("Cantidad:");

        cantidad.setFont(new java.awt.Font("Tahoma", 1, 12));
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        tabla_articulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cantidad", "Descripción", "P. Costo.", "%IVA C", "P. Venta.", "%IVA V", "Importe", "Tot. IVA", "Caducidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_articulos.setToolTipText("Modificables: precio costo, precio venta");
        tabla_articulos.setColumnSelectionAllowed(true);
        tabla_articulos.getTableHeader().setReorderingAllowed(false);
        tabla_articulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_articulosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_articulos);
        tabla_articulos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla_articulos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(1).setPreferredWidth(5);
        tabla_articulos.getColumnModel().getColumn(2).setPreferredWidth(250);
        tabla_articulos.getColumnModel().getColumn(3).setPreferredWidth(30);
        tabla_articulos.getColumnModel().getColumn(4).setPreferredWidth(10);
        tabla_articulos.getColumnModel().getColumn(5).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(6).setPreferredWidth(10);
        tabla_articulos.getColumnModel().getColumn(7).setPreferredWidth(10);
        tabla_articulos.getColumnModel().getColumn(8).setPreferredWidth(10);
        tabla_articulos.getColumnModel().getColumn(9).setPreferredWidth(10);

        jLabel10.setText("Cantidad con letra:");

        cantidad_con_letra.setBackground(new java.awt.Color(204, 204, 204));
        cantidad_con_letra.setEditable(false);
        cantidad_con_letra.setForeground(new java.awt.Color(0, 0, 153));

        jLabel16.setText("ID:");

        id_articulo.setFont(new java.awt.Font("Tahoma", 1, 12));
        id_articulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_articulo.setNextFocusableComponent(cantidad);
        id_articulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_articuloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_articuloFocusLost(evt);
            }
        });
        id_articulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_articuloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_articuloKeyTyped(evt);
            }
        });

        total_articulos.setText("Total articulos: ");

        jLabel19.setText("Caducidad:");

        caducidad.setFont(new java.awt.Font("Tahoma", 1, 12));
        caducidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caducidad.setNextFocusableComponent(id_articulo);
        caducidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                caducidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                caducidadKeyTyped(evt);
            }
        });

        articulos_tot.setFont(new java.awt.Font("Tahoma", 1, 11));
        articulos_tot.setText("0.0");

        subtot.setBackground(new java.awt.Color(204, 204, 204));
        subtot.setEditable(false);
        subtot.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtot.setForeground(new java.awt.Color(0, 0, 153));
        subtot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtot.setText("0.0");

        jLabel7.setText("Subtotal:");

        jLabel9.setText("Descuento:");

        total_descuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_descuento.setText("0.0");
        total_descuento.setToolTipText("Presione \"Enter\" para efectuar");
        total_descuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                total_descuentoFocusGained(evt);
            }
        });
        total_descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                total_descuentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                total_descuentoKeyTyped(evt);
            }
        });

        subtotal.setBackground(new java.awt.Color(204, 204, 204));
        subtotal.setEditable(false);
        subtotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtotal.setForeground(new java.awt.Color(0, 0, 153));
        subtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtotal.setText("0.0");

        jLabel18.setText("Sub_total:");

        jLabel8.setText("I.V.A.:");

        iva.setForeground(new java.awt.Color(0, 0, 102));
        iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        iva.setText("0.0");
        iva.setToolTipText("Presione \"Enter\" para efectuar");
        iva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                ivaFocusGained(evt);
            }
        });
        iva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ivaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ivaKeyTyped(evt);
            }
        });

        total.setBackground(new java.awt.Color(204, 204, 204));
        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 11));
        total.setForeground(new java.awt.Color(0, 0, 153));
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0.0");

        jLabel17.setText("Total:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(total_articulos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(articulos_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cantidad_con_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel17)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(total)
                            .addComponent(iva)
                            .addComponent(subtotal)
                            .addComponent(total_descuento)
                            .addComponent(subtot, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(cantidad_con_letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(articulos_tot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(total_articulos))
                        .addGap(93, 93, 93))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotal)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );

        registrar_btn.setForeground(new java.awt.Color(0, 153, 51));
        registrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guarda.png"))); // NOI18N
        registrar_btn.setText("Registrar");
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setForeground(new java.awt.Color(0, 0, 102));
        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        salir_btn.setForeground(new java.awt.Color(153, 0, 0));
        salir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        historial.setForeground(new java.awt.Color(0, 153, 51));
        historial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/comodat.png"))); // NOI18N
        historial.setText("Historial");
        historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(historial, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 394, Short.MAX_VALUE)
                        .addComponent(registrar_btn)
                        .addGap(100, 100, 100)
                        .addComponent(cancelar_btn)
                        .addGap(82, 82, 82)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir_btn)
                    .addComponent(registrar_btn)
                    .addComponent(cancelar_btn)
                    .addComponent(historial, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         agregar();
       }
    }//GEN-LAST:event_cantidadKeyPressed

    private void id_articuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            cantidad.requestFocus();
        else if(evt.getKeyCode()==KeyEvent.VK_ADD)            
            validar_y_registrar();
    }//GEN-LAST:event_id_articuloKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fecha_compra.setText(Fecha.getFechaHoy());           
        compra.getSiguienteNumEntrada();
        no_entrada.setText(""+compra.getNumEntrada());
        caducidad.setText(Fecha.getFechaFutura(4));
        id_articulo.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
       validar_y_registrar();
    }//GEN-LAST:event_registrar_btnActionPerformed

    private void id_articuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyTyped
        Validador.validarNumero(evt);
        if(id_articulo.getText().length()==15)
            evt.consume();
    }//GEN-LAST:event_id_articuloKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        Validador.validarPrecio(cantidad, evt);
        if(cantidad.getText().length()==11)
            evt.consume();
    }//GEN-LAST:event_cantidadKeyTyped

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
      dispose();
    }//GEN-LAST:event_salir_btnActionPerformed

    private void tabla_articulosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_articulosKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
          if(tabla_articulos.getRowCount()>0){
            modelo_tabla.removeRow(tabla_articulos.getSelectedRow());
            calcularImportes();
          }
          id_articulo.requestFocus();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           if(tabla_articulos.getSelectedColumn()==5|tabla_articulos.getSelectedColumn()==6){ //si se está modificando el precio de venta
               nuevo_articulo.setId_articulo(tabla_articulos.getValueAt(tabla_articulos.getSelectedRow(),0).toString()); //el código del producto...
             if(tabla_articulos.getSelectedColumn()==5){ //actualizamos el costo de venta
              double precio = Double.parseDouble(tabla_articulos.getValueAt(tabla_articulos.getSelectedRow(), tabla_articulos.getSelectedColumn()).toString());
              nuevo_articulo.setPrecioVenta(precio, 0); //el nuevo costo de venta
              nuevo_articulo.actualizarPrecioVenta();
             }
             else
             { //actualizar el iva en venta
              nuevo_articulo.setPrecioVenta(0, Double.parseDouble(tabla_articulos.getValueAt(tabla_articulos.getSelectedRow(),6).toString())); //el nuevo IVA de venta
              nuevo_articulo.actualizarIVAVenta();
             }
          }
           calcularUnImporte(tabla_articulos.getSelectedRow());
        }
    }//GEN-LAST:event_tabla_articulosKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        cliente.desconectar();
        nuevo_articulo.desconectar();
        compra.desconectar();
        cliente=null;
        nuevo_articulo=null;
        compra=null;
    }//GEN-LAST:event_formWindowClosed

    private void caducidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caducidadKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        agregar();
    }//GEN-LAST:event_caducidadKeyPressed

    private void caducidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_caducidadKeyTyped
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            Validador.validarFecha(caducidad.getText());
    }//GEN-LAST:event_caducidadKeyTyped

    private void id_articuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusLost
        buscarArticulo();
    }//GEN-LAST:event_id_articuloFocusLost

    private void fecha_compraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_compraKeyTyped
        if(fecha_compra.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_fecha_compraKeyTyped

    private void id_articuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusGained
       id_articulo.selectAll();
    }//GEN-LAST:event_id_articuloFocusGained

    private void total_descuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total_descuentoFocusGained
        total_descuento.selectAll();
}//GEN-LAST:event_total_descuentoFocusGained

    private void total_descuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_descuentoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!total_descuento.getText().equals("")){
                subtotal.setText(""+(Double.parseDouble(subtot.getText())-Double.parseDouble(total_descuento.getText())));
                total.setText(""+(Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),3)));
                cantidad_con_letras();
                iva.requestFocus();
            }
        }
}//GEN-LAST:event_total_descuentoKeyPressed

    private void total_descuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_descuentoKeyTyped
        Validador.validarPrecio(total_descuento, evt);
}//GEN-LAST:event_total_descuentoKeyTyped

    private void ivaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ivaFocusGained
        iva.selectAll();
}//GEN-LAST:event_ivaFocusGained

    private void ivaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ivaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            total.setText(""+Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),2));
            cantidad_con_letras();
        }
}//GEN-LAST:event_ivaKeyPressed

    private void ivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ivaKeyTyped
        Validador.validarPrecio(iva, evt);
}//GEN-LAST:event_ivaKeyTyped

    private void historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historialActionPerformed
        ComprasHistorial c = new ComprasHistorial();
        c.setVisible(true);
    }//GEN-LAST:event_historialActionPerformed

    public void cantidad_con_letras(){
      cantidad_con_letra.setText(controladores.Convertidor.getStringOfNumber(Float.parseFloat(total.getText())));
    }
    
    void validar_y_registrar(){
       if(validarDatos()) 
        registrarCompra();
       else
        JOptionPane.showMessageDialog(null, "Hay campos vacios requeridos...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
    }
    
    void buscarArticulo(){
       if(!id_articulo.getText().equals("")){
           articulo.removeAllItems();
           nuevo_articulo.setId_articulo(id_articulo.getText());
            if(nuevo_articulo.buscarArticuloPorID() || nuevo_articulo.buscarArticuloPorID_enTArticulos()){
               articulo.addItem(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion()+" $"+nuevo_articulo.getPrecioCompra());
               cantidad.requestFocus();                                  
            }
       }else
           articulo.requestFocus();
    }
    
    void agregar(){
       if(!id_articulo.getText().equals("")){
            if(!cantidad.getText().equals("") & Double.parseDouble(cantidad.getText())>0){
             if(articulo.getItemCount()>0){
              if(!buscarEnTabla())
                agregar_a_Tabla();
              else{
                calcularImportes();
               limpiar();
              }
             }
            }
         }
    }
    
    int n_filas;
    double cant;
    public void agregar_a_Tabla(){
      modelo_tabla.addRow(new Object[1]);
      n_filas = tabla_articulos.getRowCount()-1;
      cant = Double.parseDouble(cantidad.getText());
      tabla_articulos.setValueAt(id_articulo.getText(), n_filas, 0); //codigo
      tabla_articulos.setValueAt(cant, n_filas, 1); //cantidad
      tabla_articulos.setValueAt(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion(), n_filas, 2); //descripcion
      tabla_articulos.setValueAt(Matematicas.redondear(nuevo_articulo.getPrecioCompra(),2), n_filas, 3); //precio de compra sin iva
      tabla_articulos.setValueAt(Matematicas.redondear(nuevo_articulo.getPorcentajeIvaCompra(),3), n_filas, 4); //iva en compra
      tabla_articulos.setValueAt(Matematicas.redondear(nuevo_articulo.getPrecioVenta(),2), n_filas, 5); //precio de venta sin iva
      tabla_articulos.setValueAt(Matematicas.redondear(nuevo_articulo.getPorcentajeIvaVenta(),3), n_filas, 6); //iva en venta
      tabla_articulos.setValueAt( Matematicas.redondear(cant*nuevo_articulo.getPrecioCompraSinIVA(),3), n_filas, 7); //importe total
      tabla_articulos.setValueAt(Matematicas.redondear(cant*(nuevo_articulo.getPrecioCompraSinIVA()*nuevo_articulo.getPorcentajeIvaCompra()),3), n_filas, 8); //iva
      tabla_articulos.setValueAt(caducidad.getText(), n_filas, 9); //fecha de caducidad
      calcularImportes();
      limpiar();
    }
    
    double totalAgregado;
    public boolean buscarEnTabla(){
      for(aux=0; aux<tabla_articulos.getRowCount(); aux++){
          if(tabla_articulos.getValueAt(aux, 0).toString().equals(id_articulo.getText())){
           tabla_articulos.setValueAt(Double.parseDouble(tabla_articulos.getValueAt(aux, 1).toString())+Double.parseDouble(cantidad.getText()), aux, 1); //se acumula la cantidad de articulos
           totalAgregado = Double.parseDouble(tabla_articulos.getValueAt(aux, 1).toString());
           tabla_articulos.setValueAt( Matematicas.redondear(totalAgregado*nuevo_articulo.getPrecioCompraSinIVA(),3), aux, 7); //importe
           tabla_articulos.setValueAt( Matematicas.redondear(totalAgregado*nuevo_articulo.getIvaCompra(),3), aux, 8);//iva
           return true;          
        }
      }
      return false;
    }
    
    void limpiar(){
       id_articulo.setText("");        
        articulo.removeAllItems();
        cantidad.setText("");
        id_articulo.requestFocus();
    }

    void calcularUnImporte(int nf){
       subtotal_venta =  Double.parseDouble(tabla_articulos.getValueAt(nf, 1).toString())*Double.parseDouble(tabla_articulos.getValueAt(nf, 3).toString()); //calcular el importe total
        tabla_articulos.setValueAt(Matematicas.redondear(subtotal_venta, 3), nf, 7); //importe
       subtotal_venta = subtotal_venta*Double.parseDouble(tabla_articulos.getValueAt(nf, 4).toString());
        tabla_articulos.setValueAt(Matematicas.redondear(subtotal_venta, 3), nf, 8); //total iva
       calcularImportes();
    }
    
    public void calcularImportes(){
        nuevo_articulo.calcularImportes(tabla_articulos, 8, 7);
      subtot.setText(""+nuevo_articulo.getTSV()); //todo el total subtotal
      subtotal.setText(""+(nuevo_articulo.getTSV()-Double.parseDouble(total_descuento.getText())));
      iva.setText(""+nuevo_articulo.getTivaV());
      total.setText(""+Matematicas.redondear(((nuevo_articulo.getTSV()-Double.parseDouble(total_descuento.getText()))+nuevo_articulo.getTivaV()),2));
      articulos_tot.setText(""+nuevo_articulo.getTotalArticulos());
      cantidad_con_letra.setText(controladores.Convertidor.getStringOfNumber(Float.parseFloat(total.getText())));
    }
    
    public void registrarCompra(){
      compra.setFecha(fecha_compra.getText());
      compra.setSubtotal(Double.parseDouble(subtot.getText())); //SUBTOTAL
      compra.setDescuento(Double.parseDouble(total_descuento.getText()));//DESCUENTO
      compra.setSub_total(Double.parseDouble(subtotal.getText()));//SUB_TOTAL
      compra.setIVA(Double.parseDouble(iva.getText())); //IVA
      compra.setTotal(Double.parseDouble(total.getText())); //TOTAL     
      compra.setCantTot(Double.parseDouble(articulos_tot.getText())); //CANTIDAD TOTAL
      if(compra.registrarEntrada(tabla_articulos)){
        limpiarCampos();        
      }
    }
    
    public void limpiarCampos(){
      no_entrada.setText(""+(compra.getNumEntrada()+1));
      id_articulo.setText(null);
      articulo.removeAllItems();
      cantidad.setText(null);
      articulos_tot.setText("0.0");
      subtotal.setText("0");
      iva.setText("0");
      total.setText("0");
      cantidad_con_letra.setText(null);
      subtotal_venta=0;      
       for(int x=tabla_articulos.getRowCount()-1; x>=0;x--){
         modelo_tabla.removeRow(x);
       }
       id_articulo.requestFocus();
    }       
   
    boolean validarDatos(){
      if(tabla_articulos.getRowCount()>0 & !fecha_compra.getText().equals("") )
          return true;
      else
          return false;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox articulo;
    private javax.swing.JLabel articulos_tot;
    private javax.swing.JTextField caducidad;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cantidad_con_letra;
    private javax.swing.JTextField fecha_compra;
    private javax.swing.JButton historial;
    private javax.swing.JTextField id_articulo;
    private javax.swing.JTextField iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField no_entrada;
    private javax.swing.JButton registrar_btn;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField subtot;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla_articulos;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_articulos;
    private javax.swing.JTextField total_descuento;
    // End of variables declaration//GEN-END:variables

    
   
class SearchingArt implements KeyListener{
   
        @Override
    public void keyTyped(KeyEvent e) {
       if(e.getKeyCode()==' '){
        e.consume();
        return;
       }
       Validador.validarCadena(e);
    }

        @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
          if(!editor_articulo.getText().equals("")){
             nuevo_articulo.setDescripcion(editor_articulo.getText().trim());             
             nuevo_articulo.buscarArticuloPorDescripcion();
             editor_articulo.setText(nuevo_articulo.getDescripcion());
          }
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){            
            nuevo_articulo.setSelectedArt(articulo.getSelectedIndex());
            nuevo_articulo.buscarArticuloPorID_enTArticulos();            
            id_articulo.setText(""+nuevo_articulo.getId_Articulo());            
            cantidad.requestFocus();
        }
    }

        @Override
    public void keyReleased(KeyEvent e) {

    }

}
}//fin de la clase ventas