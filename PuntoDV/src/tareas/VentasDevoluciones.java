/*
 * Ventas.java
 *
 * Created on 5/04/2011, 07:02:26 PM
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
public class VentasDevoluciones extends javax.swing.JFrame implements KeyListener{

    /** Creates new form Ventas */
    DefaultTableModel modelo_tabla, modelo_devs;
    private Salidas salida;
    private Articulo nuevo_articulo;   
    private JTextComponent editor_articulo, editor_devoluciones_art;
    private Devoluciones devoluciones;    
      int  filas_dev, n_filas;
      double subtot_dev, iva_devol;         
    Cobradors cobrador;
    
    public VentasDevoluciones() {
        initComponents();
       setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);       
       editor_articulo = (JTextComponent) articulo.getEditor().getEditorComponent();
       editor_articulo.addKeyListener(new SearchingArt());
       editor_devoluciones_art = (JTextComponent) articulo_dev.getEditor().getEditorComponent();
       editor_devoluciones_art.addKeyListener(this);
        modelo_tabla = (DefaultTableModel) tabla_articulos.getModel();
        modelo_devs = (DefaultTableModel) tabla_articulos_dev.getModel();
        nuevo_articulo = new Articulo();
        nuevo_articulo.setComboBox(articulo);
        devoluciones = new Devoluciones();
        id_articulo.requestFocus();
        cobrador = new Cobradors(this, true);
        salidas.add(venta);
        salidas.add(merma);
        devs.add(inventario_dev);
        devs.add(merma_dev);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        salidas = new javax.swing.ButtonGroup();
        devs = new javax.swing.ButtonGroup();
        panel = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        no_salida = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fecha_venta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        combo_rutas = new javax.swing.JComboBox();
        jPanel11 = new javax.swing.JPanel();
        venta = new javax.swing.JRadioButton();
        merma = new javax.swing.JRadioButton();
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
        LabelSalidas = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        subtot = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        descuento = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        total_articulos = new javax.swing.JLabel();
        registrar_btn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextPane();
        jPanel6 = new javax.swing.JPanel();
        devolver_btn = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        no_salida_dev = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fecha_salida_dev = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        combo_rutas_dev = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        inventario_dev = new javax.swing.JRadioButton();
        merma_dev = new javax.swing.JRadioButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla_articulos_dev = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        iva_dev = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        en_letras_dev = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        total_dev = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        subtotal_dev = new javax.swing.JTextField();
        total_articulos_dev = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        id_articulo_dev = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        articulo_dev = new javax.swing.JComboBox();
        jLabel22 = new javax.swing.JLabel();
        cantidad_dev = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        observaciones_dev = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario para ventas y devoluciones");
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Salidas del inventario"));

        jLabel3.setText("No. de folio:");

        no_salida.setFont(new java.awt.Font("Tahoma", 1, 11));
        no_salida.setToolTipText("Para consultar una venta ingrese el numero de salida");
        no_salida.setNextFocusableComponent(combo_rutas);
        no_salida.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                no_salidaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_salidaKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha:");

        fecha_venta.setBackground(new java.awt.Color(245, 244, 244));

        jLabel12.setText("Ruta:");

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de salida"));

        venta.setSelected(true);
        venta.setText("Venta");

        merma.setText("Merma");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(venta)
                .addGap(18, 18, 18)
                .addComponent(merma)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(merma)
                    .addComponent(venta))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no_salida, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 379, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(no_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecha_venta)))
            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la salida"));

        jLabel5.setText("Artículo:");

        articulo.setEditable(true);
        articulo.setFont(new java.awt.Font("Tahoma", 1, 12));
        articulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                articuloFocusGained(evt);
            }
        });

        jLabel6.setText("Cantidad:");

        cantidad.setFont(new java.awt.Font("Tahoma", 1, 12));
        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cantidadFocusGained(evt);
            }
        });
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
                "Código", "Cantidad", "Descripción", "PU", "Importe", "Total IVA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_articulos.getTableHeader().setReorderingAllowed(false);
        tabla_articulos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_articulosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_articulos);
        tabla_articulos.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(1).setPreferredWidth(10);
        tabla_articulos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tabla_articulos.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(4).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(5).setPreferredWidth(20);

        jLabel10.setText("Cantidad con letra:");

        cantidad_con_letra.setBackground(new java.awt.Color(204, 204, 204));
        cantidad_con_letra.setEditable(false);
        cantidad_con_letra.setFont(new java.awt.Font("Comic Sans MS", 1, 12));
        cantidad_con_letra.setForeground(new java.awt.Color(0, 0, 153));

        jLabel16.setText("ID:");

        id_articulo.setFont(new java.awt.Font("Tahoma", 1, 12));
        id_articulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_articulo.setNextFocusableComponent(articulo);
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

        LabelSalidas.setText("Total salida:");

        jLabel8.setText("Subtotal:");

        subtot.setBackground(new java.awt.Color(204, 204, 204));
        subtot.setEditable(false);
        subtot.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtot.setForeground(new java.awt.Color(0, 0, 153));
        subtot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtot.setText("0");

        jLabel17.setText("Descuento:");

        descuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        descuento.setText("0");
        descuento.setToolTipText("Presione \"Enter\" para efectuar");
        descuento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                descuentoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                descuentoFocusLost(evt);
            }
        });
        descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descuentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descuentoKeyTyped(evt);
            }
        });

        jLabel18.setText("Subtotal:");

        subtotal.setBackground(new java.awt.Color(204, 204, 204));
        subtotal.setEditable(false);
        subtotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtotal.setForeground(new java.awt.Color(0, 0, 153));
        subtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtotal.setText("0");

        jLabel23.setText("I.V.A.:");

        iva.setForeground(new java.awt.Color(0, 0, 102));
        iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        iva.setText("0");
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

        jLabel24.setText("Total:");

        total.setBackground(new java.awt.Color(204, 204, 204));
        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 11));
        total.setForeground(new java.awt.Color(0, 0, 153));
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0");

        total_articulos.setFont(new java.awt.Font("Tahoma", 1, 12));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(articulo, 0, 580, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad_con_letra, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LabelSalidas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel8)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(descuento, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(subtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(subtot, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSalidas)
                    .addComponent(total_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad_con_letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        registrar_btn.setForeground(new java.awt.Color(0, 153, 51));
        registrar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guarda.png"))); // NOI18N
        registrar_btn.setText("Registrar");
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.setToolTipText("Cancele el registro de la venta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(153, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        observaciones.setBackground(new java.awt.Color(222, 222, 223));
        observaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));
        observaciones.setDragEnabled(true);
        observaciones.setMaximumSize(new java.awt.Dimension(22, 50));
        jScrollPane2.setViewportView(observaciones);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(registrar_btn)
                        .addGap(77, 77, 77)
                        .addComponent(jButton3)
                        .addGap(66, 66, 66)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))))
        );

        panel.addTab("     Ventas     ", jPanel5);

        devolver_btn.setForeground(new java.awt.Color(0, 153, 51));
        devolver_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/guarda.png"))); // NOI18N
        devolver_btn.setText("Registrar");
        devolver_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolver_btnActionPerformed(evt);
            }
        });

        jButton6.setForeground(new java.awt.Color(0, 0, 102));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        jButton6.setText("Cancelar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Salidas del inventario"));

        jLabel7.setText("No. de folio:");

        no_salida_dev.setFont(new java.awt.Font("Tahoma", 1, 11));
        no_salida_dev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                no_salida_devKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_salida_devKeyTyped(evt);
            }
        });

        jLabel9.setText("Fecha:");

        fecha_salida_dev.setEditable(false);

        jLabel13.setText("Ruta:");

        combo_rutas_dev.setEnabled(false);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder("Canalizar devolución a:"));

        inventario_dev.setSelected(true);
        inventario_dev.setText("Inventario");

        merma_dev.setText("Merma");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inventario_dev)
                .addGap(28, 28, 28)
                .addComponent(merma_dev)
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(merma_dev)
                .addComponent(inventario_dev))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(no_salida_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_salida_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_rutas_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 355, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_salida_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(combo_rutas_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fecha_salida_dev)))
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la devolución"));

        tabla_articulos_dev.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Devolución", "Descripción", "Precio venta", "Importe", "IVA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_articulos_dev.getTableHeader().setReorderingAllowed(false);
        tabla_articulos_dev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_articulos_devKeyReleased(evt);
            }
        });
        jScrollPane4.setViewportView(tabla_articulos_dev);
        tabla_articulos_dev.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabla_articulos_dev.getColumnModel().getColumn(1).setPreferredWidth(20);
        tabla_articulos_dev.getColumnModel().getColumn(2).setPreferredWidth(250);
        tabla_articulos_dev.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabla_articulos_dev.getColumnModel().getColumn(4).setPreferredWidth(20);
        tabla_articulos_dev.getColumnModel().getColumn(5).setPreferredWidth(20);

        jLabel11.setText("I.V.A.:");

        iva_dev.setEditable(false);
        iva_dev.setForeground(new java.awt.Color(0, 0, 102));
        iva_dev.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        iva_dev.setText("0");

        jLabel14.setText("Cantidad con letra:");

        en_letras_dev.setEditable(false);
        en_letras_dev.setForeground(new java.awt.Color(0, 0, 153));

        jLabel19.setText("Total:");

        total_dev.setEditable(false);
        total_dev.setFont(new java.awt.Font("Tahoma", 1, 11));
        total_dev.setForeground(new java.awt.Color(0, 0, 153));
        total_dev.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_dev.setText("0");

        jLabel20.setText("Subtotal:");

        subtotal_dev.setEditable(false);
        subtotal_dev.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtotal_dev.setForeground(new java.awt.Color(0, 0, 153));
        subtotal_dev.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtotal_dev.setText("0");

        total_articulos_dev.setText("Total devoluciones: 0");

        jLabel21.setText("ID:");

        id_articulo_dev.setFont(new java.awt.Font("Tahoma", 1, 12));
        id_articulo_dev.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_articulo_dev.setNextFocusableComponent(cantidad_dev);
        id_articulo_dev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_articulo_devKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_articulo_devKeyTyped(evt);
            }
        });

        jLabel15.setText("Artículo:");

        articulo_dev.setEditable(true);
        articulo_dev.setFont(new java.awt.Font("Tahoma", 1, 12));

        jLabel22.setText("Cantidad:");

        cantidad_dev.setFont(new java.awt.Font("Tahoma", 1, 12));
        cantidad_dev.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad_dev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidad_devKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidad_devKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_articulo_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(articulo_dev, 0, 550, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_articulos_dev)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(en_letras_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 229, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(subtotal_dev, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                    .addComponent(total_dev)
                    .addComponent(iva_dev, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(id_articulo_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articulo_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22)
                    .addComponent(cantidad_dev, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(total_articulos_dev)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotal_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iva_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(en_letras_dev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton7.setForeground(new java.awt.Color(153, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        jButton7.setText("Salir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        observaciones_dev.setBackground(new java.awt.Color(222, 222, 223));
        observaciones_dev.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));
        observaciones_dev.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        observaciones_dev.setDragEnabled(true);
        observaciones_dev.setMaximumSize(new java.awt.Dimension(22, 50));
        jScrollPane3.setViewportView(observaciones_dev);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                        .addComponent(devolver_btn)
                        .addGap(66, 66, 66)
                        .addComponent(jButton6)
                        .addGap(75, 75, 75)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(devolver_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panel.addTab("     Devoluciones     ", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1007, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        if(!id_articulo.getText().equals("")){
        if(!cantidad.getText().equals("")){
           if(nuevo_articulo.getExistencia()<Float.parseFloat(cantidad.getText())){
             JOptionPane.showMessageDialog(null, "Solo hay "+nuevo_articulo.getExistencia()+" articulos en inventario","Mensaje de stock!", JOptionPane.INFORMATION_MESSAGE);        
             return;
           }           
            if(!nuevo_articulo.buscarEnTabla(tabla_articulos,cantidad.getText())){
               agregar_a_Tabla();
            }else{
                calcularImportes();
                limpiar();
             }
            }
         }
       }
    }//GEN-LAST:event_cantidadKeyPressed

    private void id_articuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            cantidad.requestFocus();
        else if(evt.getKeyCode()==KeyEvent.VK_ADD)
            preRegistro();
    }//GEN-LAST:event_id_articuloKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fecha_venta.setText(Fecha.getFechaHoy());
        cargarRutas();
        salida = new Salidas();
        salida.getSiguienteNumSalida();
        no_salida.setText(""+salida.getNumSalida());        
    }//GEN-LAST:event_formWindowOpened

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
       preRegistro();
    }//GEN-LAST:event_registrar_btnActionPerformed

    private void id_articuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyTyped
        Validador.validarNumero(evt);
        if(id_articulo.getText().length()==15)
            evt.consume();
    }//GEN-LAST:event_id_articuloKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        Validador.validarPrecio(cantidad,evt);
    }//GEN-LAST:event_cantidadKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       if(!registrar_btn.isEnabled())
           registrar_btn.setEnabled(true);
           id_articulo.setEditable(true);
           articulo.setEditable(true);
           cantidad.setEditable(true);
        salida.getSiguienteNumSalida();
        limpiarCampos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void devolver_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolver_btnActionPerformed
        if(validarDatosDev()){
          registrarDevs();
        }else
            JOptionPane.showMessageDialog(null, "Hay campos vacíos que debe completar...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
}//GEN-LAST:event_devolver_btnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        limpiarCamposDev();
}//GEN-LAST:event_jButton6ActionPerformed

    private void no_salida_devKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_salida_devKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!no_salida_dev.getText().equals("")){
              limpiarTablaArticulosDevs();
            if(devoluciones.isSalida(Integer.parseInt(no_salida_dev.getText()))){
              fecha_salida_dev.setText(devoluciones.getFecha());
              combo_rutas_dev.removeAllItems();
              combo_rutas_dev.addItem(devoluciones.getRuta());              
              id_articulo_dev.requestFocus();
              observaciones_dev.setText("Devolución de salida No.:"+no_salida_dev.getText()+" con fecha:"+devoluciones.getFecha());
            }else{
                no_salida_dev.setText(null);                
                fecha_salida_dev.setText(null);
                combo_rutas_dev.removeAllItems();
                no_salida_dev.requestFocus();                
            }
          }
        }
}//GEN-LAST:event_no_salida_devKeyPressed

    private void no_salida_devKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_salida_devKeyTyped
        Validador.validarNumero(evt);// TODO add your handling code here:
}//GEN-LAST:event_no_salida_devKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        dispose();
}//GEN-LAST:event_jButton7ActionPerformed

    private void id_articulo_devKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articulo_devKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          buscarArticuloDevs();  
    }//GEN-LAST:event_id_articulo_devKeyPressed

    private void id_articulo_devKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articulo_devKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_id_articulo_devKeyTyped

    private void cantidad_devKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad_devKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
          if(!id_articulo_dev.getText().equals(""))
          if(!cantidad_dev.getText().equals("")) {
             if(Integer.parseInt(cantidad_dev.getText())<=devoluciones.getTotalArts()){
                if(!nuevo_articulo.buscarEnTabla(tabla_articulos_dev, cantidad_dev.getText())) 
                 agregarEnTablaDevs();
             }
             else
                JOptionPane.showMessageDialog(null, "Esta indicando más productos de los que salieron...", "Demasiados artículos", JOptionPane.INFORMATION_MESSAGE);
          }
    }//GEN-LAST:event_cantidad_devKeyPressed

    private void cantidad_devKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidad_devKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_cantidad_devKeyTyped

    private void no_salidaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_salidaKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_no_salidaKeyTyped

    private void no_salidaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_salidaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          salida.setNumSalida(Integer.parseInt(no_salida.getText()));
          limpiarTablaArts();
          mostrarSalida();
        }
    }//GEN-LAST:event_no_salidaKeyPressed

    private void tabla_articulosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_articulosKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
          if(tabla_articulos.getRowCount()>0){
            modelo_tabla.removeRow(tabla_articulos.getSelectedRow());
            calcularImportes();
          }
          tabla_articulos.clearSelection();
          id_articulo.requestFocus();
        }else if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            calcularImportes();
    }//GEN-LAST:event_tabla_articulosKeyReleased

    private void tabla_articulos_devKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_articulos_devKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
          if(tabla_articulos.getRowCount()>0){
            modelo_tabla.removeRow(tabla_articulos.getSelectedRow());
            importeDevs();
          }
        }
    }//GEN-LAST:event_tabla_articulos_devKeyReleased

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        salida.desconectar();
        nuevo_articulo.desconectar();
        devoluciones.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void descuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!descuento.getText().equals("")){
                subtotal.setText(""+(Double.parseDouble(subtot.getText())-Double.parseDouble(descuento.getText())));
                total.setText(""+(Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),3)));
                cantidad_con_letras(cantidad_con_letra,Float.parseFloat(total.getText()));
              iva.requestFocus();
            }
        }                
}//GEN-LAST:event_descuentoKeyPressed

    private void descuentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descuentoFocusLost
        if(!descuento.getText().equals("")){
                subtotal.setText(""+(Double.parseDouble(subtot.getText())-Double.parseDouble(descuento.getText())));
                total.setText(""+(Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),3)));
                cantidad_con_letras(cantidad_con_letra,Float.parseFloat(total.getText()));
            }
    }//GEN-LAST:event_descuentoFocusLost

    private void id_articuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusLost
         buscarArticulo();
    }//GEN-LAST:event_id_articuloFocusLost

    private void descuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyTyped
        Validador.validarPrecio(descuento, evt);
    }//GEN-LAST:event_descuentoKeyTyped

    private void descuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_descuentoFocusGained
        descuento.selectAll();
    }//GEN-LAST:event_descuentoFocusGained

    private void id_articuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusGained
        id_articulo.selectAll();
    }//GEN-LAST:event_id_articuloFocusGained

    private void cantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusGained
        cantidad.selectAll();
    }//GEN-LAST:event_cantidadFocusGained

    private void articuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_articuloFocusGained
        articulo.removeAllItems();
    }//GEN-LAST:event_articuloFocusGained

    private void ivaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ivaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            total.setText(""+Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),2));
            cantidad_con_letras(cantidad_con_letra, Float.parseFloat(total.getText()));
        }
    }//GEN-LAST:event_ivaKeyPressed

    private void ivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ivaKeyTyped
        Validador.validarPrecio(iva, evt);
    }//GEN-LAST:event_ivaKeyTyped

    private void ivaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ivaFocusGained
        iva.selectAll();
    }//GEN-LAST:event_ivaFocusGained

    void buscarArticulo(){
       if(!id_articulo.getText().equals("")){
                nuevo_articulo.setId_articulo(id_articulo.getText());
                articulo.removeAllItems();
                 if(nuevo_articulo.buscarArticuloPorID()){
                     articulo.addItem(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion()+" $"+(nuevo_articulo.getPrecioVenta()));
                     cantidad.requestFocus();
                 }else
                   articulo.requestFocus();
        }
    }
    
    void buscarArticuloDevs(){
          if(!id_articulo_dev.getText().equals("") & !no_salida_dev.getText().equals("")){
               if(devoluciones.isArticuloEnSalida(Integer.parseInt(no_salida_dev.getText()), 
                                                  Integer.parseInt(id_articulo_dev.getText()))){
                     articulo_dev.removeAllItems();
                     nuevo_articulo.setId_articulo(id_articulo_dev.getText());
                     nuevo_articulo.buscarArticuloPorID_enTArticulos();
                     articulo_dev.addItem(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion()+" $"+nuevo_articulo.getPrecioVenta());
                     cantidad_dev.requestFocus();
                 }else{
                    JOptionPane.showMessageDialog(null, "Este artículo no fue agregado en la salida ("+no_salida_dev.getText()+")", "Atención!", JOptionPane.INFORMATION_MESSAGE);
                   id_articulo_dev.setText(null);
                   id_articulo_dev.requestFocus();
                 }
           }else if(no_salida_dev.getText().equals(""))
                JOptionPane.showMessageDialog(null, "Especifíque un numero de salida", "Atención!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void agregar_a_Tabla(){
      modelo_tabla.addRow(new Object[1]);
      n_filas = tabla_articulos.getRowCount()-1;
      tabla_articulos.setValueAt(nuevo_articulo.getId_Articulo(), n_filas, 0);
      tabla_articulos.setValueAt(cantidad.getText(), n_filas, 1);
      tabla_articulos.setValueAt(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion(), n_filas, 2);
      tabla_articulos.setValueAt( Matematicas.redondear(nuevo_articulo.getPrecioVentaSinIva(),3), n_filas, 3);      
      tabla_articulos.setValueAt( Matematicas.redondear(Float.parseFloat(cantidad.getText())*nuevo_articulo.getPrecioVentaSinIva(),2), n_filas, 4);      
      tabla_articulos.setValueAt( Matematicas.redondear(Float.parseFloat(cantidad.getText())*nuevo_articulo.getIvaVenta(),2), n_filas, 5);       
       calcularImportes();
       limpiar();
    }

    public void calcularImportes(){
      nuevo_articulo.calcularImportes(tabla_articulos,5,4);
      subtot.setText(""+nuevo_articulo.getTSV());
      subtotal.setText(""+(nuevo_articulo.getTSV()-Double.parseDouble(descuento.getText())));
      iva.setText(""+nuevo_articulo.getTivaV());
      total.setText(""+(Matematicas.redondear(Double.parseDouble(subtotal.getText())+nuevo_articulo.getTivaV(),2)));
      total_articulos.setText(""+Matematicas.redondear(nuevo_articulo.getTotalArticulos(),2));
      cantidad_con_letras(cantidad_con_letra, Float.parseFloat(total.getText()));
    }
        
    void limpiar(){
       id_articulo.setText("");        
        articulo.removeAllItems();
        cantidad.setText("");
        id_articulo.requestFocus();
    }
    
    public void cantidad_con_letras(javax.swing.JTextField c, float cant){
      c.setText(controladores.Convertidor.getStringOfNumber(cant));
    }

    public void cargarRutas(){
        Rutas r = new Rutas();
      r.getRutas(combo_rutas);
      r.desconectar();
    }
    
    public void preRegistro(){
       if(validarDatos()){
           if(observaciones.getText().equals(""))
               observaciones.setText("Hr.("+Fecha.getHora()+")");
           if(venta.isSelected()){
             cobrador.setTotal(Double.parseDouble(total.getText()));
             cobrador.setVisible(true);             
           }else
             registrarSalida();
       }else
            JOptionPane.showMessageDialog(null, "Primero agregue artículos a la venta...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
    }

    public void registrarSalida(){
      salida.setFecha(fecha_venta.getText());  
      salida.setNumSalida(Integer.parseInt(no_salida.getText()));      
      salida.setTotalArts(nuevo_articulo.getTotalArticulos());
      salida.setSubtotal(Double.parseDouble(subtot.getText()));
      salida.setDescuento(Double.parseDouble(descuento.getText()));
      salida.setSub_total(Double.parseDouble(subtotal.getText()));
      salida.setIVA(Double.parseDouble(iva.getText()));
      salida.setTotal(Double.parseDouble(total.getText()));      
      salida.setObservaciones(observaciones.getText());
      salida.setId_Ruta(combo_rutas.getSelectedIndex()+1);
      if(venta.isSelected())
          salida.setTipoSalida(1);
      else
          salida.setTipoSalida(2);
      if(merma.isSelected()){ //salida por merma
         if(!observaciones.getText().equals("")){
          if(salida.registrarSalida(tabla_articulos));
            limpiarCampos();
         }else
            JOptionPane.showMessageDialog(null, "Escriba el motivo de la baja en 'Observaciones'", "Atención!", JOptionPane.INFORMATION_MESSAGE);
      }else{ //Salidas por otro concepto
          if(salida.registrarSalida(tabla_articulos))
              salida.descargarInventario();
          limpiarCampos();
      }
    }

    public void limpiarCampos(){
      no_salida.setText(""+salida.getNumSalida());      
      articulo.removeAllItems();
      cantidad.setText(null);
      total_articulos.setText("0");
      subtot.setText("0");
      descuento.setText("0");
      subtotal.setText("0");
      iva.setText("0");
      total.setText("0");
      cantidad_con_letra.setText(null);
      observaciones.setText(null);
      id_articulo.setText(null);
      id_articulo.requestFocus();
      limpiarTablaArts();
    }
    
    void limpiarTablaArts(){
      for(int x=tabla_articulos.getRowCount()-1; x>=0;x--){
         modelo_tabla.removeRow(x);
       }
    }
     
    public void limpiarCamposDev(){
      no_salida_dev.setText(null);
      no_salida_dev.requestFocus();
      id_articulo_dev.setText(null);
      articulo_dev.removeAllItems();
      cantidad_dev.setText(null);
      //tabla_articulos.removeAll();
      total_articulos_dev.setText("Total salida: 0");
      subtotal_dev.setText("0");
      iva_dev.setText("0");
      total_dev.setText("0");
      en_letras_dev.setText(null);
      observaciones_dev.setText(null);
      subtot_dev=0;
      iva_devol=0;
      limpiarTablaArticulosDevs();
    }

    void limpiarTablaArticulosDevs(){
       for(int x=tabla_articulos_dev.getRowCount()-1; x>=0;x--){
         modelo_devs.removeRow(x);
       }
    }
    
    boolean validarDatos(){
        if(tabla_articulos.getRowCount()>0)
            return true;
        return false;
    }
            
    public void agregarEnTablaDevs(){      
      modelo_devs.addRow(new Object[1]);
      filas_dev = tabla_articulos_dev.getRowCount()-1;
      tabla_articulos_dev.setValueAt(nuevo_articulo.getId_Articulo(), filas_dev, 0);
      tabla_articulos_dev.setValueAt(cantidad_dev.getText(), filas_dev, 1);
      tabla_articulos_dev.setValueAt(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion(), filas_dev, 2);
      tabla_articulos_dev.setValueAt(nuevo_articulo.getPrecioVenta(), filas_dev, 3);
      tabla_articulos_dev.setValueAt(nuevo_articulo.getPorcentajeIvaVenta(), filas_dev, 4);
      tabla_articulos_dev.setValueAt( Matematicas.redondear(Integer.parseInt(cantidad_dev.getText())*nuevo_articulo.getPrecioVenta(),3), filas_dev, 5);
      importeDevs();
       cantidad_dev.setText("");
       id_articulo_dev.setText("");
       articulo_dev.removeAllItems();
       id_articulo_dev.requestFocus();       
    }
    
    void importeDevs(){
      nuevo_articulo.calcularImportes(tabla_articulos_dev,4,5);
      subtotal_dev.setText(""+nuevo_articulo.getTSV());
      iva_dev.setText(""+nuevo_articulo.getTivaV());
      total_dev.setText(""+nuevo_articulo.getTotalVenta());
       total_articulos_dev.setText("Total devoluciones: ("+tabla_articulos_dev.getRowCount()+")");
      cantidad_con_letras(en_letras_dev, Float.parseFloat(total_dev.getText()));
    }
    
    boolean validarDatosDev(){
      if(modelo_devs.getRowCount()>0)
            return true;
        return false;
    }

    void registrarDevs(){
        if(inventario_dev.isSelected()){  //devolucion a inventario
          devoluciones.setNoSalida(Integer.parseInt(no_salida_dev.getText()));
          devoluciones.setFecha(fecha_salida_dev.getText());
          devoluciones.setSubtotal(Double.parseDouble(subtotal_dev.getText()));
          devoluciones.setIva(Double.parseDouble(iva_dev.getText()));
          devoluciones.setTotal(Double.parseDouble(total_dev.getText()));
          devoluciones.setObservaciones(observaciones_dev.getText());   
          if(devoluciones.registrarDevolucion(tabla_articulos_dev))
             if(devoluciones.devolverAInventario(tabla_articulos_dev))
                JOptionPane.showMessageDialog(null, "Ha devuelto el/los productos al inventario", "Acción completada con éxito!!!", JOptionPane.INFORMATION_MESSAGE);
        }else{
            salida.setNumSalida(Integer.parseInt(no_salida_dev.getText()));
            salida.setSubtotal(subtot_dev);
            salida.setIVA(iva_devol);
            salida.setTotal(subtot_dev);
            salida.setDescuento(0);
            salida.setObservaciones(observaciones_dev.getText());
            salida.setId_Ruta(devoluciones.getIdRuta());
            salida.setTipoSalida(2);  //devolución a merma...
            if(salida.registrarSalida(tabla_articulos_dev))
                JOptionPane.showMessageDialog(null, "Se ha enviado la devolución a merma de productos", "Registro completado!", JOptionPane.INFORMATION_MESSAGE);
        }
          limpiarCamposDev();
    }   
    
    void mostrarSalida(){
      if(salida.getSalida(tabla_articulos)){
            fecha_venta.setText(salida.getFecha());
            combo_rutas.setSelectedIndex(salida.getId_Ruta()-1);
            subtot.setText(""+(salida.getSubtotal()));
            descuento.setText(""+salida.getDescuento());
            subtotal.setText(""+salida.getSub_total());
            iva.setText(""+salida.getIVA());
            total.setText(""+salida.getTotal());
            cantidad_con_letra.setText(Convertidor.getStringOfNumber(Float.parseFloat(total.getText())));
            observaciones.setText(salida.getObservaciones());
            registrar_btn.setEnabled(false);
            id_articulo.setEditable(false);
            articulo.setEditable(false);
            cantidad.setEditable(false);
            if(salida.getTipoSalida()==1) //salida por venta
               venta.setSelected(true);
            else
                merma.setSelected(true); //salida por merma
            id_articulo.requestFocus();
          }else if(!registrar_btn.isEnabled()){
              salida.getSiguienteNumSalida();
              limpiarCampos();              
              id_articulo.setEditable(true);
              articulo.setEditable(true);
              cantidad.setEditable(true);
              registrar_btn.setEnabled(true);
          }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSalidas;
    private javax.swing.JComboBox articulo;
    private javax.swing.JComboBox articulo_dev;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cantidad_con_letra;
    private javax.swing.JTextField cantidad_dev;
    private javax.swing.JComboBox combo_rutas;
    private javax.swing.JComboBox combo_rutas_dev;
    private javax.swing.JTextField descuento;
    private javax.swing.JButton devolver_btn;
    private javax.swing.ButtonGroup devs;
    private javax.swing.JTextField en_letras_dev;
    private javax.swing.JTextField fecha_salida_dev;
    private javax.swing.JTextField fecha_venta;
    private javax.swing.JTextField id_articulo;
    private javax.swing.JTextField id_articulo_dev;
    private javax.swing.JRadioButton inventario_dev;
    private javax.swing.JTextField iva;
    private javax.swing.JTextField iva_dev;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JRadioButton merma;
    private javax.swing.JRadioButton merma_dev;
    private javax.swing.JTextField no_salida;
    private javax.swing.JTextField no_salida_dev;
    private javax.swing.JTextPane observaciones;
    private javax.swing.JTextPane observaciones_dev;
    public static javax.swing.JTabbedPane panel;
    private javax.swing.JButton registrar_btn;
    private javax.swing.ButtonGroup salidas;
    private javax.swing.JTextField subtot;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTextField subtotal_dev;
    private javax.swing.JTable tabla_articulos;
    private javax.swing.JTable tabla_articulos_dev;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_articulos;
    private javax.swing.JLabel total_articulos_dev;
    private javax.swing.JTextField total_dev;
    private javax.swing.JRadioButton venta;
    // End of variables declaration//GEN-END:variables

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
          if(!no_salida_dev.getText().equals("")){
           if(!editor_devoluciones_art.getText().equals("")){
             nuevo_articulo.setComboBox(articulo_dev);
             nuevo_articulo.setDescripcion(editor_devoluciones_art.getText().trim());
             nuevo_articulo.buscarArticuloPorDescripcion();
             editor_articulo.setText(nuevo_articulo.getDescripcion());
           }
          }else
             JOptionPane.showMessageDialog(null, "Indíque el número de salida donde registro el articulo", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            nuevo_articulo.setComboBox(null);
            nuevo_articulo.setSelectedArt(articulo_dev.getSelectedIndex());
            nuevo_articulo.buscarArticuloPorID();
            //nuevo_articulo.buscarArticuloPorDescripcion(editor_devoluciones_art.getText().trim());
            id_articulo_dev.setText(""+nuevo_articulo.getId_Articulo());
             if(devoluciones.isArticuloEnSalida(Integer.parseInt(no_salida_dev.getText()), 
                                                Integer.parseInt(id_articulo_dev.getText())))
             {
                cantidad_dev.requestFocus();
             }else{
                 JOptionPane.showMessageDialog(null, "Este articulo no fue agregado en la salida ("+no_salida_dev.getText()+")", "Atención!", JOptionPane.INFORMATION_MESSAGE);
                 id_articulo_dev.setText(null);
                 id_articulo_dev.requestFocus();
             }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

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
             //nuevo_articulo.setComboBox(articulo);
             nuevo_articulo.setDescripcion(editor_articulo.getText().trim());
             nuevo_articulo.buscarArticuloPorDescripcion();
               editor_articulo.setText(nuevo_articulo.getDescripcion()); //reasignar texto para seguir filtrando la busqueda
           }
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
          if(articulo.getSelectedIndex()!=-1){
            //nuevo_articulo.setComboBox(null);
            nuevo_articulo.setSelectedArt(articulo.getSelectedIndex());
            nuevo_articulo.buscarArticuloPorID();            
            id_articulo.setText(""+nuevo_articulo.getId_Articulo());
            cantidad.requestFocus();
          }
        }
    }
    @Override
    public void keyReleased(KeyEvent e) {

    }
}
}//fin de la clase ventas