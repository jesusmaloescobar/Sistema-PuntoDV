/*
 * Articulos.java
 *
 * Created on 5/04/2011, 05:56:22 PM
 */
package altas;

import controladores.Articulo;
import controladores.Impuestos;
import controladores.Matematicas;
import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Articulos extends javax.swing.JFrame {
  private Articulo a;
  boolean desdeaqui=true;
    /** Creates new form Articulos */
    public Articulos() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        a = new Articulo();
        id_articulo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pc_sin_iva = new javax.swing.JTextField();
        iva_c = new javax.swing.JTextField();
        precio_compra = new javax.swing.JTextField();
        pv_sin_iva = new javax.swing.JTextField();
        iva_v = new javax.swing.JTextField();
        precio_venta = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        iva_en_compra = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        iva_en_venta = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        existencia = new javax.swing.JTextField();
        id_articulo = new javax.swing.JTextField();
        descripcion = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        presentacion = new javax.swing.JComboBox();
        nuevo = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        fecha_caducidad = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        id_art = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        descr = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pc = new javax.swing.JTextField();
        iva_c1 = new javax.swing.JTextField();
        precio_compra_act = new javax.swing.JTextField();
        pv = new javax.swing.JTextField();
        iva_v1 = new javax.swing.JTextField();
        precio_venta_act = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        iva_en_compra1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        iva_en_venta1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        exist = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        presentacion1 = new javax.swing.JComboBox();
        exit = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        fecha_caducidad1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        id_articulo_eliminar = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operaciones sobre articulos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Código:");

        jLabel2.setText("Descripción:");

        jLabel3.setText("Presentación:");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Costos"))));

        jLabel4.setText("Precio compra S/IVA:");

        jLabel5.setText("Precio venta S/IVA:");

        jLabel6.setText("I.V.A.");

        jLabel7.setText("P.C.:");

        jLabel8.setText("I.V.A.");

        jLabel9.setText("P.V.:");

        pc_sin_iva.setBackground(new java.awt.Color(204, 204, 204));
        pc_sin_iva.setNextFocusableComponent(pv_sin_iva);

        iva_c.setBackground(new java.awt.Color(204, 204, 204));

        precio_compra.setToolTipText("Ingrese el costo total para calcular automáticamente");
        precio_compra.setNextFocusableComponent(precio_venta);
        precio_compra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precio_compraFocusLost(evt);
            }
        });
        precio_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precio_compraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precio_compraKeyTyped(evt);
            }
        });

        pv_sin_iva.setBackground(new java.awt.Color(204, 204, 204));
        pv_sin_iva.setNextFocusableComponent(existencia);

        iva_v.setBackground(new java.awt.Color(204, 204, 204));

        precio_venta.setToolTipText("Al ingresar el costo total, el calculo es automático");
        precio_venta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                precio_ventaFocusLost(evt);
            }
        });
        precio_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precio_ventaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precio_ventaKeyTyped(evt);
            }
        });

        jLabel11.setText("% IVA");

        iva_en_compra.setToolTipText("sintáxis: 0.00");
        iva_en_compra.setNextFocusableComponent(pc_sin_iva);
        iva_en_compra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                iva_en_compraFocusLost(evt);
            }
        });
        iva_en_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iva_en_compraKeyTyped(evt);
            }
        });

        jLabel23.setText("% IVA");

        iva_en_venta.setToolTipText("sintáxis: 0.00");
        iva_en_venta.setNextFocusableComponent(pv_sin_iva);
        iva_en_venta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                iva_en_ventaFocusLost(evt);
            }
        });
        iva_en_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iva_en_ventaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(iva_c, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(precio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iva_en_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(pc_sin_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel4)))
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iva_v, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iva_en_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel5))
                            .addComponent(pv_sin_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(iva_en_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(iva_en_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pv_sin_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pc_sin_iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iva_c, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precio_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iva_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precio_venta))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("Existencia:");

        existencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                existenciaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                existenciaKeyTyped(evt);
            }
        });

        id_articulo.addFocusListener(new java.awt.event.FocusAdapter() {
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

        descripcion.setNextFocusableComponent(fecha_caducidad);
        descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descripcionKeyTyped(evt);
            }
        });

        guardar.setForeground(new java.awt.Color(0, 102, 0));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guarda.png"))); // NOI18N
        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setForeground(new java.awt.Color(0, 0, 153));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        nuevo.setText("+");
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        salir.setForeground(new java.awt.Color(102, 0, 0));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel26.setText("Caducidad:");

        fecha_caducidad.setToolTipText("dd/mm/aaaa");
        fecha_caducidad.setNextFocusableComponent(precio_compra);
        fecha_caducidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_caducidadFocusLost(evt);
            }
        });
        fecha_caducidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_caducidadKeyTyped(evt);
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(guardar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nuevo)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(fecha_caducidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(existencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.addTab("          Alta          ", jPanel1);

        jLabel12.setText("Código:");

        id_art.setNextFocusableComponent(precio_venta_act);
        id_art.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_artFocusLost(evt);
            }
        });
        id_art.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_artKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_artKeyTyped(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        jLabel13.setText("Descripción:");

        descr.setNextFocusableComponent(precio_venta_act);
        descr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descrKeyTyped(evt);
            }
        });

        jLabel14.setText("Presentación:");

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Costos"))));

        jLabel15.setText("Precio compra S/IVA:");

        jLabel16.setText("Precio venta S/IVA:");

        jLabel17.setText("I.V.A.");

        jLabel18.setText("P.C.:");

        jLabel19.setText("I.V.A.");

        jLabel20.setText("P.V.:");

        pc.setBackground(new java.awt.Color(204, 204, 204));
        pc.setEditable(false);

        iva_c1.setBackground(new java.awt.Color(204, 204, 204));
        iva_c1.setEditable(false);

        precio_compra_act.setBackground(new java.awt.Color(204, 204, 204));
        precio_compra_act.setEditable(false);

        pv.setBackground(new java.awt.Color(204, 204, 204));
        pv.setNextFocusableComponent(exist);

        iva_v1.setBackground(new java.awt.Color(204, 204, 204));

        precio_venta_act.setNextFocusableComponent(actualizar);
        precio_venta_act.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                precio_venta_actFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                precio_venta_actFocusLost(evt);
            }
        });
        precio_venta_act.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                precio_venta_actKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                precio_venta_actKeyTyped(evt);
            }
        });

        jLabel21.setText("% IVA");

        iva_en_compra1.setBackground(new java.awt.Color(204, 204, 204));
        iva_en_compra1.setEditable(false);

        jLabel24.setText("% IVA");

        iva_en_venta1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                iva_en_venta1FocusLost(evt);
            }
        });
        iva_en_venta1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iva_en_venta1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iva_c1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel18)
                                .addGap(5, 5, 5)
                                .addComponent(precio_compra_act))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel20))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel15))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(iva_en_compra1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iva_en_venta1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(precio_venta_act, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(iva_v1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pv, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(iva_en_venta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iva_en_compra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(iva_c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iva_v1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel20)
                                .addComponent(jLabel18)
                                .addComponent(precio_compra_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(precio_venta_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        jLabel22.setText("Existencia:");

        exist.setBackground(new java.awt.Color(204, 204, 204));
        exist.setEditable(false);
        exist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                existKeyTyped(evt);
            }
        });

        actualizar.setForeground(new java.awt.Color(0, 153, 0));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actualizar.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        cancel.setForeground(new java.awt.Color(0, 0, 153));
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancel.setText("Cancelar");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exit.setForeground(new java.awt.Color(153, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel27.setText("Caducidad:");

        fecha_caducidad1.setBackground(new java.awt.Color(204, 204, 204));
        fecha_caducidad1.setToolTipText("dd/mm/aaaa");
        fecha_caducidad1.setNextFocusableComponent(pc_sin_iva);
        fecha_caducidad1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_caducidad1FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_art, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buscar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descr, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_caducidad1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(presentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exist, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(actualizar)
                .addGap(18, 18, 18)
                .addComponent(cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(id_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(descr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha_caducidad1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(presentacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exist))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.addTab("     Modificaciones     ", jPanel2);

        jLabel25.setText("Código del artículo:");

        id_articulo_eliminar.setFont(new java.awt.Font("Tahoma", 1, 11));
        id_articulo_eliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_articulo_eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_articulo_eliminarKeyTyped(evt);
            }
        });

        eliminar.setForeground(new java.awt.Color(153, 0, 0));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        eliminar.setText("Aceptar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 11));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText("*Utilice este panel para dar de baja a los artículos que considere que se encuentran dados de alta en el inventario y aún se encuentran reflejados.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane8.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel25)
                .addContainerGap(214, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_articulo_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(eliminar)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_articulo_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel.addTab("     Bajas     ", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
       guardarArticulo();
    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       if(!id_art.getText().equals(""))
         buscarArticulo();
    }//GEN-LAST:event_buscarActionPerformed

    private void id_artKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_artKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         if(!id_art.getText().equals("")){
          buscarArticulo();
         }
        }
    }//GEN-LAST:event_id_artKeyPressed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        Presentacion p = new Presentacion();
        p.setElemento(presentacion);
        p.setVisible(true);
    }//GEN-LAST:event_nuevoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       if(desdeaqui) 
        datosIniciales();
    }//GEN-LAST:event_formWindowOpened

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiarCamposAlta();
    }//GEN-LAST:event_cancelarActionPerformed

    void guardarArticulo(){
      if(consultarCampos()){
        a.setId_articulo(id_articulo.getText());
        a.setDescripcion(descripcion.getText());
        a.setPresentacion(presentacion.getSelectedIndex()+1);
        a.setPrecioCompra(Double.parseDouble(precio_compra.getText()),Double.parseDouble(iva_en_compra.getText()));
        a.setPrecioVenta(Double.parseDouble(precio_venta.getText()),Double.parseDouble(iva_en_venta.getText()));
        a.setExistencia(Float.parseFloat(existencia.getText()));
        a.setFechaCaducidad(fecha_caducidad.getText());
        if(a.grabarArticulo())
          limpiarCamposAlta();
        id_articulo.requestFocus();        
     }else
         JOptionPane.showMessageDialog(null, "Hay campos vacios!", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void limpiarCamposAlta(){
       id_articulo.setText("");
        descripcion.setText("");
        //presentacion.removeAllItems();
        pc_sin_iva.setText("");
        pv_sin_iva.setText("");
        iva_c.setText("");
        iva_v.setText("");
        precio_compra.setText("");
        precio_venta.setText("");
        existencia.setText("");
    }

    public void limpiarCamposActualizacion(){
      id_art.setText("");
        descr.setText("");
        //presentacion.removeAllItems();
        pc.setText("");
        pv.setText("");
        iva_c1.setText("");
        iva_v1.setText("");
        precio_compra_act.setText("");
        precio_venta_act.setText("");
        exist.setText("");
        id_art.requestFocus();
    }

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
      limpiarCamposActualizacion();
    }//GEN-LAST:event_cancelActionPerformed

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
      if(consultarCamposAct()){        
        a.setId_articulo(id_art.getText());
        a.setDescripcion(descr.getText());
        a.setPresentacion(presentacion1.getSelectedIndex()+1);
        //a.setPrecioCompra(Double.parseDouble(pc.getText()), Double.parseDouble(iva_c1.getText()));
        a.setPrecioVenta(Double.parseDouble(precio_venta_act.getText()), Double.parseDouble(iva_en_venta1.getText()));
        //a.setFechaCaducidad(fecha_caducidad1.getText());
        //a.setExistencia(Float.parseFloat(exist.getText()));
        if(a.actualizarArticulo()){
          limpiarCamposActualizacion();
        }
      }else
            JOptionPane.showMessageDialog(null, "Ha dejado campos vacios!", "Atención", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_actualizarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
      if(!id_articulo_eliminar.getText().equals("")){
       a.setId_articulo(id_articulo_eliminar.getText());
       if(a.deleteFromInventario()){
           JOptionPane.showMessageDialog(null, "El artículo con código: "+a.getId_Articulo()+" ha sido dado de baja del inventario", "Atención!", JOptionPane.INFORMATION_MESSAGE);
           id_articulo_eliminar.setText("");
           id_articulo_eliminar.requestFocus();
       }
      }
    }//GEN-LAST:event_eliminarActionPerformed

    private void id_articuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusLost
        if(!id_articulo.getText().equals("")){            
            a.setId_articulo(id_articulo.getText());
            if(a.estaRegistrado()){
                JOptionPane.showMessageDialog(null, "Ya hay un producto registrado con este código!", "Atención", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_id_articuloFocusLost

    private void id_articuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyTyped
        Validador.validarNumero(evt);
        if(id_articulo.getText().length()==15)
            evt.consume();
    }//GEN-LAST:event_id_articuloKeyTyped

    private void iva_en_compraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iva_en_compraKeyTyped
        Validador.validarPrecio(iva_en_compra,evt);
    }//GEN-LAST:event_iva_en_compraKeyTyped

    private void descripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descripcionKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_descripcionKeyTyped

    private void iva_en_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iva_en_ventaKeyTyped
        Validador.validarPrecio(iva_en_venta, evt);
    }//GEN-LAST:event_iva_en_ventaKeyTyped

    private void existenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciaKeyTyped
        Validador.validarPrecio(existencia, evt);
        if(existencia.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_existenciaKeyTyped

    private void id_artKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_artKeyTyped
        Validador.validarNumero(evt);
        if(id_art.getText().length()==15)
            evt.consume();
    }//GEN-LAST:event_id_artKeyTyped

    private void descrKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descrKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_descrKeyTyped

    private void iva_en_venta1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iva_en_venta1KeyTyped
        Validador.validarPrecio(iva_en_venta1, evt);
    }//GEN-LAST:event_iva_en_venta1KeyTyped

    private void existKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existKeyTyped
        Validador.validarPrecio(exist, evt);
    }//GEN-LAST:event_existKeyTyped

    private void id_articulo_eliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articulo_eliminarKeyTyped
        Validador.validarNumero(evt);
        if(id_articulo_eliminar.getText().length()==15)
            evt.consume();
    }//GEN-LAST:event_id_articulo_eliminarKeyTyped

    private void fecha_caducidad1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_caducidad1FocusLost
        if(!Validador.validarFecha(fecha_caducidad1.getText()))
            JOptionPane.showMessageDialog(null, "Formato de fecha no válido...", "Error grave!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_fecha_caducidad1FocusLost

    private void fecha_caducidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_caducidadFocusLost
        if(!Validador.validarFecha(fecha_caducidad.getText()))
            JOptionPane.showMessageDialog(null, "Formato de fecha no válido...", "Error grave!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_fecha_caducidadFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        a.desconectar();
        a=null;
        
    }//GEN-LAST:event_formWindowClosed

    private void fecha_caducidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_caducidadKeyTyped
        if(fecha_caducidad.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_fecha_caducidadKeyTyped

    private void precio_compraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_compraKeyTyped
        Validador.validarPrecio(precio_compra, evt);
    }//GEN-LAST:event_precio_compraKeyTyped

    private void precio_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_ventaKeyTyped
        Validador.validarPrecio(precio_venta, evt);
    }//GEN-LAST:event_precio_ventaKeyTyped

    private void precio_compraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_compraKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!precio_compra.getText().equals("")){
            precioCompra();
            precio_venta.requestFocus();
          }
        }
    }//GEN-LAST:event_precio_compraKeyPressed

    private void precio_ventaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_ventaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!precio_venta.getText().equals("")){
            precioVenta();
            existencia.requestFocus();
          }
        }            
    }//GEN-LAST:event_precio_ventaKeyPressed

    private void precio_compraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_compraFocusLost
        if(!precio_compra.getText().equals("")){
            precioCompra();
            precio_venta.requestFocus();
          }
    }//GEN-LAST:event_precio_compraFocusLost

    private void precio_ventaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_ventaFocusLost
        if(!precio_venta.getText().equals("")){
            precioVenta();
            existencia.requestFocus();
          }
    }//GEN-LAST:event_precio_ventaFocusLost

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void precio_venta_actKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_venta_actKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            if(!precio_venta_act.getText().equals(""))
                precioVentaActualizar();
    }//GEN-LAST:event_precio_venta_actKeyPressed

    private void precio_venta_actKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_precio_venta_actKeyTyped
        Validador.validarPrecio(precio_venta_act, evt);
    }//GEN-LAST:event_precio_venta_actKeyTyped

    private void iva_en_compraFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iva_en_compraFocusLost
        if(!iva_en_compra.getText().equals(""))
            precioCompra();
    }//GEN-LAST:event_iva_en_compraFocusLost

    private void iva_en_ventaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iva_en_ventaFocusLost
        if(!iva_en_venta.getText().equals(""))
            precioVenta();
    }//GEN-LAST:event_iva_en_ventaFocusLost

    private void iva_en_venta1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iva_en_venta1FocusLost
        if(!iva_en_venta1.getText().equals(""))
            precioVentaActualizar();
    }//GEN-LAST:event_iva_en_venta1FocusLost

    private void id_artFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_artFocusLost
        if(!id_art.getText().equals("")){
          buscarArticulo();
         }
    }//GEN-LAST:event_id_artFocusLost

    private void precio_venta_actFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_venta_actFocusGained
        precio_venta_act.selectAll();
    }//GEN-LAST:event_precio_venta_actFocusGained

    private void precio_venta_actFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_precio_venta_actFocusLost
        if(!precio_venta_act.getText().equals(""))
            precioVentaActualizar();
    }//GEN-LAST:event_precio_venta_actFocusLost

    private void existenciaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_existenciaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            guardarArticulo();
    }//GEN-LAST:event_existenciaKeyPressed

    private void id_articuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            descripcion.requestFocus();
    }//GEN-LAST:event_id_articuloKeyPressed
        
    void precioCompra(){
      iva_c.setText(""+(Matematicas.redondear(getIva(Double.parseDouble(precio_compra.getText()), Double.parseDouble(iva_en_compra.getText())),2)));
      pc_sin_iva.setText(""+(Matematicas.redondear(Double.parseDouble(precio_compra.getText())/(1+Double.parseDouble(iva_en_compra.getText())),2)));
    }
    
    void precioVenta(){
      iva_v.setText(""+(Matematicas.redondear(getIva(Double.parseDouble(precio_venta.getText()), Double.parseDouble(iva_en_venta.getText())),2)));
      pv_sin_iva.setText(""+(Matematicas.redondear(Double.parseDouble(precio_venta.getText())/(1+Double.parseDouble(iva_en_venta.getText())),2)));
    }
    
    private void precioVentaActualizar(){
      iva_v1.setText(""+(Matematicas.redondear(getIva(Double.parseDouble(precio_venta_act.getText()), Double.parseDouble(iva_en_venta1.getText())),2)));
      pv.setText(""+(Matematicas.redondear(Double.parseDouble(precio_venta_act.getText())/(1+Double.parseDouble(iva_en_venta1.getText())),2)));
    }
    
    public double getIva(double precio, double iva){
      return (precio/(1+iva))*iva;
    }

    public void buscarArticulo()
    {
      a.setId_articulo(id_art.getText());
      if(a.buscarArticuloPorID() || a.buscarArticuloPorID_enTArticulos())
      {
        descr.setText(a.getDescripcion());        
        presentacion1.setSelectedIndex(a.getPresentacionID()-1);
        fecha_caducidad1.setText(a.getFechaCaducidad());
        precio_compra_act.setText(""+a.getPrecioCompra());
        precio_venta_act.setText(""+a.getPrecioVenta());        
        iva_en_compra1.setText(""+a.getPorcentajeIvaCompra());
        iva_en_venta1.setText(""+a.getPorcentajeIvaVenta());
        pc.setText(""+(Matematicas.redondear((a.getPrecioCompra()/(1+a.getPorcentajeIvaCompra())*a.getPorcentajeIvaCompra()),2)));
        pv.setText(""+(Matematicas.redondear((a.getPrecioVenta()/(1+a.getPorcentajeIvaVenta())*a.getPorcentajeIvaVenta()),2)));
        exist.setText(String.valueOf(a.getExistencia()));
      }else
          limpiarCamposActualizacion();
    }

    boolean consultarCampos(){
      if(!id_articulo.getText().trim().equals("") &
         !descripcion.getText().trim().equals("") &
         !pc_sin_iva.getText().trim().equals("") &
         !pv_sin_iva.getText().trim().equals("") &
         !existencia.getText().trim().equals("") &
         !fecha_caducidad.getText().trim().equals("") 
        )
          return true;
       else
          return false;
    }
    boolean consultarCamposAct(){
      if(!id_art.getText().trim().equals("") &
         !descr.getText().trim().equals("") &
         !pc.getText().trim().equals("") &
         !pv.getText().trim().equals("") &
         !fecha_caducidad1.getText().trim().equals("") &
         !exist.getText().trim().equals("")
        )
          return true;
       else
          return false;
    }
    
    public void setIdArticulo(String id)
    {
      id_art.setText(id);
      panel.setSelectedIndex(1);      
    }

    public void datosIniciales()
    {
       controladores.Presentacion p = new controladores.Presentacion();
        p.getPresentaciones(presentacion);
        p.getPresentaciones(presentacion1);
        p.desconectar();
        p=null;
        iva_en_compra.setText(""+(Impuestos.getIVAenCActual()/100));
        iva_en_venta.setText(""+(Impuestos.getIVAenVActual()/100));
        iva_en_compra1.setText(""+iva_en_compra.getText());
        iva_en_venta1.setText(""+iva_en_venta.getText());
    }
    
    public void setAccionForanea()
    {
      desdeaqui=false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton cancel;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField descr;
    private javax.swing.JTextField descripcion;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField exist;
    private javax.swing.JTextField existencia;
    private javax.swing.JButton exit;
    private javax.swing.JTextField fecha_caducidad;
    private javax.swing.JTextField fecha_caducidad1;
    private javax.swing.JButton guardar;
    private javax.swing.JTextField id_art;
    private javax.swing.JTextField id_articulo;
    private javax.swing.JTextField id_articulo_eliminar;
    private javax.swing.JTextField iva_c;
    private javax.swing.JTextField iva_c1;
    private javax.swing.JTextField iva_en_compra;
    private javax.swing.JTextField iva_en_compra1;
    private javax.swing.JTextField iva_en_venta;
    private javax.swing.JTextField iva_en_venta1;
    private javax.swing.JTextField iva_v;
    private javax.swing.JTextField iva_v1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton nuevo;
    public static javax.swing.JTabbedPane panel;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField pc_sin_iva;
    private javax.swing.JTextField precio_compra;
    private javax.swing.JTextField precio_compra_act;
    private javax.swing.JTextField precio_venta;
    private javax.swing.JTextField precio_venta_act;
    private javax.swing.JComboBox presentacion;
    private javax.swing.JComboBox presentacion1;
    private javax.swing.JTextField pv;
    private javax.swing.JTextField pv_sin_iva;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables

}
