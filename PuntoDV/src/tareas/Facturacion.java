/*
 * Ventas.java
 *
 * Created on 5/04/2011, 07:02:26 PM
 */

package tareas;

import controladores.*;
import reportes.ReportesClass;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;


/**
 *
 * @author Jesus
 */
public class Facturacion extends javax.swing.JFrame implements ActionListener,KeyListener{

    /** Creates new form Ventas */
    DefaultTableModel modelo_tabla;
    private Articulo new_art;
    Cliente cliente;
    private double subtotal_venta;
    private JTextComponent editor_cliente, editor_articulo;
    Facturas factura;
    BuscarNotas search_notas;
    private int aux;
    private ReportesClass r;
    
    public Facturacion() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
       editor_cliente = (JTextComponent) nom_cliente.getEditor().getEditorComponent();
       editor_cliente.addKeyListener(this);
       editor_articulo = (JTextComponent) articulo.getEditor().getEditorComponent();
       editor_articulo.addKeyListener(new SearchingArt());       
         tipo_venta.add(contado);
         tipo_venta.add(credito);
        modelo_tabla = (DefaultTableModel) tabla_articulos.getModel();
        new_art = new Articulo();
        new_art.setComboBox(articulo); //asingar el combo donde se mostraran los articulos...
        cliente = new Cliente();       
        search_notas = new BuscarNotas();
        factura = new Facturas();
         r = new ReportesClass(this);         
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tipo_venta = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nom_cliente = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        no_factura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fecha_factura = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        combo_rutas = new javax.swing.JComboBox();
        negocio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        articulo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_articulos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        subtot = new javax.swing.JTextField();
        iva = new javax.swing.JTextField();
        total_descuento = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cantidad_con_letra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        id_articulo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        total_articulos = new javax.swing.JLabel();
        buscar_notas_btn = new javax.swing.JButton();
        total_articulo = new javax.swing.JLabel();
        registrar_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        contado = new javax.swing.JRadioButton();
        credito = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextArea();
        imprimir_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario para facturación");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Factura"));

        jLabel1.setText("ID Cliente:");

        id_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_cliente.setToolTipText("Ingrese ID del cliente");
        id_cliente.setNextFocusableComponent(no_factura);
        id_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                id_clienteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_clienteFocusLost(evt);
            }
        });
        id_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_clienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_clienteKeyTyped(evt);
            }
        });

        jLabel2.setText("Nombre:");

        nom_cliente.setEditable(true);
        nom_cliente.setFont(new java.awt.Font("Tahoma", 1, 11));
        nom_cliente.setNextFocusableComponent(no_factura);

        jLabel3.setText("No. Factura:");

        no_factura.setFont(new java.awt.Font("Tahoma", 1, 11));
        no_factura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no_factura.setNextFocusableComponent(id_articulo);
        no_factura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                no_facturaFocusLost(evt);
            }
        });
        no_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                no_facturaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_facturaKeyTyped(evt);
            }
        });

        jLabel4.setText("Fecha:");

        fecha_factura.setForeground(new java.awt.Color(0, 0, 102));
        fecha_factura.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_facturaFocusLost(evt);
            }
        });
        fecha_factura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_facturaKeyTyped(evt);
            }
        });

        jLabel12.setText("Ruta:");

        jLabel13.setText("Dirección:");

        direccion.setToolTipText("Presione \"Enter\" para actualizar");
        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                direccionKeyPressed(evt);
            }
        });

        jLabel14.setText("RFC:");

        rfc.setToolTipText("Presione \"Enter\" para actualizar");
        rfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rfcKeyPressed(evt);
            }
        });

        jLabel15.setText("Teléfono:");

        telefono.setToolTipText("Presione \"Enter\" para actualizar");
        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                telefonoKeyPressed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(nom_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(negocio, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(no_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(nom_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(negocio, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la factura"));

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
                "Código", "Cantidad", "Descripción", "Precio Unitario", "IVA", "Importe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
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
        tabla_articulos.getColumnModel().getColumn(1).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(2).setPreferredWidth(280);
        tabla_articulos.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(4).setPreferredWidth(20);
        tabla_articulos.getColumnModel().getColumn(5).setPreferredWidth(20);

        jLabel7.setText("Subtotal:");

        jLabel8.setText("I.V.A.:");

        jLabel9.setText("Descuento:");

        subtot.setBackground(new java.awt.Color(204, 204, 204));
        subtot.setEditable(false);
        subtot.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtot.setForeground(new java.awt.Color(0, 0, 153));
        subtot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtot.setText("0");

        iva.setForeground(new java.awt.Color(0, 0, 102));
        iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        iva.setText("0");
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

        total_descuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_descuento.setText("0");
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

        jLabel10.setText("Cantidad con letra:");

        cantidad_con_letra.setBackground(new java.awt.Color(204, 204, 204));
        cantidad_con_letra.setEditable(false);
        cantidad_con_letra.setForeground(new java.awt.Color(0, 0, 153));

        jLabel16.setText("ID:");

        id_articulo.setFont(new java.awt.Font("Tahoma", 1, 12));
        id_articulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_articulo.setNextFocusableComponent(articulo);
        id_articulo.setPreferredSize(new java.awt.Dimension(6, 20));
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

        jLabel17.setText("Total:");

        total.setBackground(new java.awt.Color(204, 204, 204));
        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 11));
        total.setForeground(new java.awt.Color(0, 0, 153));
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0");

        jLabel18.setText("Sub_total:");

        subtotal.setBackground(new java.awt.Color(204, 204, 204));
        subtotal.setEditable(false);
        subtotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtotal.setForeground(new java.awt.Color(0, 0, 153));
        subtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtotal.setText("0");

        total_articulos.setText("Total articulos:");

        buscar_notas_btn.setText("Notas");
        buscar_notas_btn.setToolTipText("Cargue notas registradas");
        buscar_notas_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_notas_btnActionPerformed(evt);
            }
        });

        total_articulo.setFont(new java.awt.Font("Tahoma", 1, 12));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(articulo, 0, 473, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar_notas_btn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(546, 546, 546))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(total_articulos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(total_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(495, 495, 495))
                                    .addComponent(cantidad_con_letra, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel17)))
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(total)
                            .addComponent(iva)
                            .addComponent(subtotal)
                            .addComponent(total_descuento)
                            .addComponent(subtot, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 893, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(buscar_notas_btn)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(total_articulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_articulos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(subtot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(total_descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subtotal)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(cantidad_con_letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

        cancelar_btn.setForeground(new java.awt.Color(0, 0, 153));
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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de venta"));

        contado.setSelected(true);
        contado.setText("Contado");
        contado.setOpaque(false);

        credito.setText("Credito");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(contado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(credito)
                .addGap(33, 33, 33))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(contado)
                .addComponent(credito))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));

        observaciones.setColumns(20);
        observaciones.setRows(5);
        observaciones.setText("Nota(s):");
        jScrollPane2.setViewportView(observaciones);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        imprimir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/imprimir.png"))); // NOI18N
        imprimir_btn.setText("Imprimir");
        imprimir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imprimir_btn)
                                .addGap(33, 33, 33)
                                .addComponent(registrar_btn)
                                .addGap(25, 25, 25)
                                .addComponent(cancelar_btn)
                                .addGap(18, 18, 18)
                                .addComponent(salir_btn)
                                .addGap(16, 16, 16))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(imprimir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salir_btn)
                            .addComponent(registrar_btn)
                            .addComponent(cancelar_btn)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         if(!id_articulo.getText().equals("")){
            if(!cantidad.getText().equals("")){
//                nuevo_articulo.setId_articulo(id_articulo.getText());
                if(!new_art.buscarEnTabla(tabla_articulos,cantidad.getText()))
                   agregar_a_Tabla();
                else
                    calcularImporteTotal();
             id_articulo.setText("");
             id_articulo.requestFocus();
             articulo.removeAllItems();
             cantidad.setText("");             
            }
         }
       }
    }//GEN-LAST:event_cantidadKeyPressed

    private void id_articuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            cantidad.requestFocus();
    }//GEN-LAST:event_id_articuloKeyPressed

    private void id_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){ //evento de Enter
           no_factura.requestFocus();
        }    
    }//GEN-LAST:event_id_clienteKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fecha_factura.setText(Fecha.getFechaHoy());
        cargarRutas();
    }//GEN-LAST:event_formWindowOpened

    private void total_descuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_descuentoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!total_descuento.getText().equals("")){
            subtotal.setText(""+(Double.parseDouble(subtot.getText())-Double.parseDouble(total_descuento.getText())));
            total.setText(""+(Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),3)));
            cantidad_con_letras();
          }
        }
    }//GEN-LAST:event_total_descuentoKeyPressed

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
       if(verificarCampos()){
         registrarFactura(); 
         limpiarCampos();
       }else
           JOptionPane.showMessageDialog(null, "Es necesario llenar todos los campos...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_registrar_btnActionPerformed

    private void id_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyTyped
      if(!Character.isDigit(evt.getKeyChar()))
         evt.consume();
    }//GEN-LAST:event_id_clienteKeyTyped

    private void id_articuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyTyped
        Validador.validarNumero(evt);
        if(id_articulo.getText().length()==15)
            evt.consume();
    }//GEN-LAST:event_id_articuloKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        Validador.validarPrecio(cantidad, evt);
        if(cantidad.getText().length()==9)
            evt.consume();
    }//GEN-LAST:event_cantidadKeyTyped

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
      dispose();
    }//GEN-LAST:event_salir_btnActionPerformed

    private void buscar_notas_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_notas_btnActionPerformed
       if(!id_cliente.getText().equals("")){
        search_notas.setTabla(tabla_articulos, Integer.parseInt(id_cliente.getText()));
        search_notas.setForm(this);
        search_notas.setVisible(true);
       }else
            JOptionPane.showMessageDialog(null, "Indíque un cliente para la búsqueda", "Atención por favor", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buscar_notas_btnActionPerformed

    private void no_facturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_no_facturaFocusLost
       if(!no_factura.getText().equals("")){ 
        factura.setNo_Factura(no_factura.getText());
        if(factura.buscarFactura()){
        int x = JOptionPane.showConfirmDialog(null, "Esta factura ya fue registrada!, desea consultarla?","Factura encontrada",JOptionPane.YES_NO_OPTION);
           if(x==JOptionPane.OK_OPTION){
                   consultarFactura();
                  mostrar(); //mostrar la plantilla de impresion
           }
        }
       }
    }//GEN-LAST:event_no_facturaFocusLost

    private void no_facturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_facturaKeyTyped
         Validador.validarCadena(evt);        
    }//GEN-LAST:event_no_facturaKeyTyped

    private void imprimir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_btnActionPerformed
        if(verificarCampos()){
           registrarFactura();
           consultarFactura();
           imprimir(); //enviar a imprimir directamente la factura
        }else
            JOptionPane.showMessageDialog(null, "Hay campos pendientes por llenar...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_imprimir_btnActionPerformed

    private void tabla_articulosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_articulosKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            calcularUnImporte(tabla_articulos.getSelectedRow());        
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
           if(tabla_articulos.getRowCount()>0){
             modelo_tabla.removeRow(tabla_articulos.getSelectedRow());
             calcularImporteTotal();
             id_articulo.requestFocus();
           }
        }
    }//GEN-LAST:event_tabla_articulosKeyReleased

    private void id_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_clienteFocusLost
        buscarCliente();
    }//GEN-LAST:event_id_clienteFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        new_art.desconectar();
        cliente.desconectar();
        factura.desconectar();
        new_art=null;
        cliente=null;
        factura=null;
    }//GEN-LAST:event_formWindowClosed

    private void fecha_facturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_facturaKeyTyped
        if(fecha_factura.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_fecha_facturaKeyTyped

    private void fecha_facturaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_facturaFocusLost
        if(!Validador.validarFecha(fecha_factura.getText()))            
            JOptionPane.showMessageDialog(null, "El formato para la fecha ingresada no es válido...", "Atención", JOptionPane.INFORMATION_MESSAGE);    
    }//GEN-LAST:event_fecha_facturaFocusLost

    private void id_articuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusLost
        buscarArticulo();
    }//GEN-LAST:event_id_articuloFocusLost

    private void total_descuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_total_descuentoKeyTyped
        Validador.validarPrecio(total_descuento, evt);
    }//GEN-LAST:event_total_descuentoKeyTyped

    private void direccionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          cliente.setDireccion(direccion.getText());
          cliente.actualizarDireccion();
        }
    }//GEN-LAST:event_direccionKeyPressed

    private void rfcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfcKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          cliente.setRFC(rfc.getText());
          cliente.actualizarRFC();
        }
    }//GEN-LAST:event_rfcKeyPressed

    private void telefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          cliente.setTelefono(telefono.getText());
          cliente.actualizarTelefono();
        }
    }//GEN-LAST:event_telefonoKeyPressed

    private void ivaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ivaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            total.setText(""+Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),2));
            cantidad_con_letras();
        }
    }//GEN-LAST:event_ivaKeyPressed

    private void ivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ivaKeyTyped
        Validador.validarPrecio(iva, evt);
    }//GEN-LAST:event_ivaKeyTyped

    private void ivaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ivaFocusGained
        iva.selectAll();
    }//GEN-LAST:event_ivaFocusGained

    private void total_descuentoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_total_descuentoFocusGained
        total_descuento.selectAll();
    }//GEN-LAST:event_total_descuentoFocusGained

    private void no_facturaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_facturaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            id_articulo.requestFocus();        
    }//GEN-LAST:event_no_facturaKeyPressed

    private void id_articuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusGained
        id_articulo.selectAll();
    }//GEN-LAST:event_id_articuloFocusGained

    private void id_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_clienteFocusGained
        id_cliente.selectAll();
    }//GEN-LAST:event_id_clienteFocusGained

    private void buscarArticulo() {
        if(!id_articulo.getText().equals("")){
                new_art.setId_articulo(id_articulo.getText());
                 if(new_art.buscarArticuloPorID_enTArticulos()){
                   articulo.removeAllItems();
                     articulo.addItem(new_art.getDescripcion()+" "+new_art.getDescripcionPresentacion()+" $"+new_art.getPrecioVenta());
                    cantidad.requestFocus();
                 }else{
                     articulo.removeAllItems();
                     cantidad.setText(null);
                   articulo.requestFocus();
                 }
            }
    }
    
    void buscarCliente(){
      if(!id_cliente.getText().equals("")){              
              cliente.setID(Integer.parseInt(id_cliente.getText()));
              if(cliente.buscarClientePorID()){
                nom_cliente.removeAllItems();
                nom_cliente.addItem(cliente.getNombre());
                direccion.setText(cliente.getDireccion());
                rfc.setText(cliente.getRFC());
                telefono.setText(""+cliente.getTelefono());
                no_factura.requestFocus();
              }             
       }
    }
        
    int n_filas;
    public void agregar_a_Tabla(){
      modelo_tabla.addRow(new Object[1]);
      n_filas = tabla_articulos.getRowCount()-1;
      tabla_articulos.setValueAt(new_art.getId_Articulo(), n_filas, 0); //id articulo
      tabla_articulos.setValueAt(cantidad.getText(), n_filas, 1); //cantidad
      tabla_articulos.setValueAt(new_art.getDescripcion()+" "+new_art.getDescripcionPresentacion(), n_filas, 2); //descripcion
      tabla_articulos.setValueAt(Matematicas.redondear(new_art.getPrecioVentaSinIva(),2), n_filas, 3); //precio de venta
       tabla_articulos.setValueAt( Matematicas.redondear(Double.parseDouble(cantidad.getText())*new_art.getPrecioVentaSinIva(),2), n_filas, 5); //importe      
      tabla_articulos.setValueAt(Matematicas.redondear(Double.parseDouble(tabla_articulos.getValueAt(n_filas, 5).toString())*new_art.getPorcentajeIvaVenta(),2), n_filas, 4); //total iva            
      calcularImporteTotal();
      id_articulo.requestFocus();
    }

    public void calcularImporteTotal(){
        new_art.calcularImportes(tabla_articulos,4,5);
      subtot.setText(""+new_art.getTSV());
      subtotal.setText(""+Matematicas.redondear(new_art.getTSV()-Double.parseDouble(total_descuento.getText()),2));
      iva.setText(""+new_art.getTivaV());
      total.setText(""+(Matematicas.redondear(Double.parseDouble(subtotal.getText())+new_art.getTivaV(),2)));
       total_articulo.setText(""+new_art.getTotalArticulos());
      cantidad_con_letras();
    }
    
    void calcularUnImporte(int nf){
       subtotal_venta =  Double.parseDouble(tabla_articulos.getValueAt(nf, 1).toString())*Double.parseDouble(String.valueOf(tabla_articulos.getValueAt(nf, 3)));
      tabla_articulos.setValueAt(Matematicas.redondear(subtotal_venta, 3), nf, 5);
      calcularImporteTotal();
    }
    
    public void cantidad_con_letras(){
      cantidad_con_letra.setText(controladores.Convertidor.getStringOfNumber(Float.parseFloat(total.getText())));
    }

    public void cargarRutas(){
        Rutas rr = new Rutas();
        rr.getRutas(combo_rutas);
       rr.desconectar();
       rr = null;
    }

    public void registrarFactura(){
      factura.setNo_Factura(no_factura.getText());
      factura.setFecha(fecha_factura.getText());
      factura.setSubtotal(subtotal.getText());
      factura.setIVA(iva.getText());
      factura.setTotal(total.getText());
      factura.setDescuento(total_descuento.getText());
      if(credito.isSelected())
        factura.setObservaciones("Hr."+Fecha.getHora());
      else
        factura.setObservaciones(observaciones.getText());
      factura.setId_Ruta(combo_rutas.getSelectedIndex()+1);
      if(contado.isSelected()){
        factura.setId_Concepto(1); //de contado
        factura.setId_Estatus(1);
      }else if(credito.isSelected()){
        factura.setId_Concepto(2);
        factura.setId_Estatus(2);
      }
      factura.setId_Cliente(cliente.getID());
      factura.registrarFactura(tabla_articulos);
    }

    public void limpiarCampos(){
      id_cliente.setText(null);
      id_cliente.requestFocus();
      nom_cliente.removeAllItems();
      no_factura.setText(null);
      direccion.setText(null);
      rfc.setText(null);
      telefono.setText(null);
      id_articulo.setText(null);
      articulo.removeAllItems();
      cantidad.setText(null);
      tabla_articulos.removeAll();
      total_articulo.setText("0.0");
      subtot.setText("0.00");
      total_descuento.setText("0.00");
      subtotal.setText("0.00");
      iva.setText("0.00");
      total.setText("0.00");
      cantidad_con_letra.setText(null);
      observaciones.setText("Nota(s):");
      subtotal_venta=0;
      limpiarTabla();
    }
    
    void limpiarTabla(){
      for(int x=tabla_articulos.getRowCount()-1; x>=0;x--){
         modelo_tabla.removeRow(x);
       }
    }

    public void setObservaciones(String obs){
       observaciones.setText(observaciones.getText()+" : "+obs);
    }
    public void borrarObservaciones(){
       observaciones.setText(null);
    }    

    boolean verificarCampos(){
      if(!id_cliente.getText().equals("") & nom_cliente.getItemCount()>0 &
              !no_factura.getText().equals("") &
              tabla_articulos.getRowCount()>0
         )
          return true;
      else
          return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox articulo;
    private javax.swing.JButton buscar_notas_btn;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cantidad_con_letra;
    private javax.swing.JComboBox combo_rutas;
    private javax.swing.JRadioButton contado;
    private javax.swing.JRadioButton credito;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField fecha_factura;
    private javax.swing.JTextField id_articulo;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JButton imprimir_btn;
    private javax.swing.JTextField iva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel negocio;
    private javax.swing.JTextField no_factura;
    private javax.swing.JComboBox nom_cliente;
    private javax.swing.JTextArea observaciones;
    private javax.swing.JButton registrar_btn;
    private javax.swing.JTextField rfc;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField subtot;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla_articulos;
    private javax.swing.JTextField telefono;
    private javax.swing.ButtonGroup tipo_venta;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_articulo;
    private javax.swing.JLabel total_articulos;
    private javax.swing.JTextField total_descuento;
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
          if(!editor_cliente.getText().equals("")){              
             cliente.setNombre(editor_cliente.getText().trim());
             cliente.buscarClientePorNombre(nom_cliente);
              editor_cliente.setText(cliente.getNombre());
          }
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            cliente.setNombre(editor_cliente.getText().trim());
            cliente.buscarClientePorNombre(null);
            id_cliente.setText(""+cliente.getID());
            direccion.setText(cliente.getDireccion());
            rfc.setText(cliente.getRFC());
            telefono.setText(""+cliente.getTelefono());
            no_factura.requestFocus();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {  }

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
             new_art.setDescripcion(editor_articulo.getText().trim());
             new_art.buscarArticuloPorDescripcion();
             editor_articulo.setText(new_art.getDescripcion());
          }
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){            
            new_art.setSelectedArt(articulo.getSelectedIndex());
            new_art.buscarArticuloPorID_enTArticulos();            
            id_articulo.setText(""+new_art.getId_Articulo());
            cantidad.requestFocus();
        }
    }

        @Override
    public void keyReleased(KeyEvent e) {

    }

}

public void consultarFactura(){
  if(!no_factura.getText().equals("")){
        //factura.setNo_Factura(no_factura.getText());
        if(factura.buscarFactura()){            
              factura.cargarFactura();             
              cliente.cargarInformacionCliente();
             r.setParametro("P_FACTURA", no_factura.getText());
             r.setParametro("P_CLIENTE", cliente.getID()+":"+cliente.getNombre());
             r.setParametro("P_DIRECCION", cliente.getDireccion());
             r.setParametro("P_CIUDAD", cliente.getCiudad()+","+cliente.getEdo());
             r.setParametro("P_RFC", cliente.getRFC());
             r.setParametro("P_TELEFONO", ""+cliente.getTelefono());
             r.setParametro("P_FECHA", factura.getFecha());
             r.setParametro("P_DESCUENTO", ""+factura.getDescuento());
             r.setParametro("P_SUBTOT", ""+factura.getSubtot());
             r.setParametro("P_IVA", ""+factura.getIVA());
             r.setParametro("P_TOTAL", ""+factura.getTotal());
             r.setParametro("P_SUBTOTAL", ""+factura.getSubtotal());
             r.setParametro("P_EN_LETRA", Convertidor.getStringOfNumber(Convertidor.deMoneda_a_digito(factura.getTotal())));
             r.setParametro("P_OBS", factura.getObservaciones());
             r.setNomReporte("facturacion");            
           limpiarCampos();   
        }
       }
}

void mostrar(){
    r.doReporte();
}
void imprimir(){
    r.enviarImprimir();
}

}//fin de la clase ventas