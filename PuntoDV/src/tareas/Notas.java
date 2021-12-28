/*
 * Ventas.java
 *
 * Created on 5/04/2011, 07:02:26 PM
 */

package tareas;

import controladores.*;
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
public class Notas extends javax.swing.JFrame implements ActionListener,KeyListener{

    /** Creates new form Ventas */
    DefaultTableModel modelo_tabla;
    private Articulo nuevo_articulo;
    Cliente cliente;    
    private JTextComponent editor_cliente, editor_articulo;
    controladores.Notas nota;    
    
    public Notas() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
       editor_cliente = (JTextComponent) nom_cliente.getEditor().getEditorComponent();
       editor_cliente.addKeyListener(this);
       editor_articulo = (JTextComponent) articulo.getEditor().getEditorComponent();
       editor_articulo.addKeyListener(new SearchingArt());
        modelo_tabla = (DefaultTableModel) tabla.getModel();
        nuevo_articulo = new Articulo();
        nuevo_articulo.setComboBox(articulo); //combo donde guardaremos el resultado de la busqueda de articuos
        cliente = new Cliente();
        nota = new controladores.Notas();
        radioGroup.add(contado);
        radioGroup.add(credito);
        radioGroup.add(preventa);
        setAlwaysOnTop(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radioGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nom_cliente = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        no_nota = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fecha_venta = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        combo_rutas = new javax.swing.JComboBox();
        nom_negocio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        articulo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        iva = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cantidad_con_letra = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        id_articulo = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        subtot = new javax.swing.JTextField();
        leyenda = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        descuento = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        subtotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dcto = new javax.swing.JTextField();
        iva_art = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        total_articulos = new javax.swing.JLabel();
        registrar_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        contado = new javax.swing.JRadioButton();
        credito = new javax.swing.JRadioButton();
        preventa = new javax.swing.JRadioButton();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario de registro de notas de venta");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nota de venta"));

        jLabel1.setText("ID Cliente:");

        id_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_cliente.setToolTipText("Ingrese ID del cliente");
        id_cliente.setNextFocusableComponent(id_articulo);
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
        nom_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nom_cliente.setKeySelectionManager(null);
        nom_cliente.setNextFocusableComponent(no_nota);

        jLabel3.setText("No. Nota:");

        no_nota.setFont(new java.awt.Font("Tahoma", 1, 11));
        no_nota.setForeground(new java.awt.Color(255, 0, 0));
        no_nota.setNextFocusableComponent(id_articulo);
        no_nota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                no_notaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                no_notaFocusLost(evt);
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

        jLabel4.setText("Fecha:");

        fecha_venta.setFont(new java.awt.Font("Tahoma", 1, 11));
        fecha_venta.setForeground(new java.awt.Color(0, 153, 51));
        fecha_venta.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_ventaFocusLost(evt);
            }
        });
        fecha_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_ventaKeyTyped(evt);
            }
        });

        jLabel12.setText("Ruta:");

        jLabel13.setText("Dirección:");

        direccion.setBackground(new java.awt.Color(204, 204, 204));
        direccion.setEditable(false);

        jLabel14.setText("RFC:");

        rfc.setBackground(new java.awt.Color(204, 204, 204));
        rfc.setEditable(false);

        jLabel15.setText("Teléfono:");

        telefono.setBackground(new java.awt.Color(204, 204, 204));
        telefono.setEditable(false);

        nom_negocio.setToolTipText("Escriba todo o parte del nombre y presione \"Enter\"");
        nom_negocio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nom_negocioFocusGained(evt);
            }
        });
        nom_negocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nom_negocioKeyPressed(evt);
            }
        });

        jLabel11.setText("Negocio:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_negocio, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 312, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nom_cliente, 0, 360, Short.MAX_VALUE)))))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(no_nota, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fecha_venta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(no_nota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fecha_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nom_negocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalle de la nota"));

        jLabel5.setText("Artículo:");

        articulo.setEditable(true);
        articulo.setFont(new java.awt.Font("Tahoma", 1, 12));

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

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Cantidad", "Descripción", "P/U", "Total", "Descuento", "Importe", "IVA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setToolTipText("Seleccione y presione \"Supr\" para eliminar una fila");
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tablaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(1).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(2).setPreferredWidth(180);
        tabla.getColumnModel().getColumn(3).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(4).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(5).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(6).setPreferredWidth(20);
        tabla.getColumnModel().getColumn(7).setPreferredWidth(20);

        jLabel8.setText("I.V.A.:");

        iva.setForeground(new java.awt.Color(0, 0, 102));
        iva.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        iva.setText("0");

        jLabel10.setText("Cantidad con letra:");

        cantidad_con_letra.setEditable(false);
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

        jLabel17.setText("Total:");

        total.setBackground(new java.awt.Color(204, 204, 204));
        total.setEditable(false);
        total.setFont(new java.awt.Font("Tahoma", 1, 11));
        total.setForeground(new java.awt.Color(0, 0, 153));
        total.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total.setText("0");

        jLabel18.setText("Subtotal:");

        subtot.setBackground(new java.awt.Color(204, 204, 204));
        subtot.setEditable(false);
        subtot.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtot.setForeground(new java.awt.Color(0, 0, 153));
        subtot.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtot.setText("0");

        leyenda.setText("Total articulos:");

        jLabel19.setText("Descuento:");

        descuento.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        descuento.setText("0");
        descuento.setToolTipText("Presione \"Enter\" para efectuar");
        descuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descuentoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descuentoKeyTyped(evt);
            }
        });

        jLabel20.setText("Sub_total:");

        subtotal.setBackground(new java.awt.Color(204, 204, 204));
        subtotal.setEditable(false);
        subtotal.setFont(new java.awt.Font("Tahoma", 1, 11));
        subtotal.setForeground(new java.awt.Color(0, 0, 153));
        subtotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        subtotal.setText("0");

        jLabel7.setText("Dcto:$");

        dcto.setText("0.0");
        dcto.setToolTipText("IVA incluido");
        dcto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dctoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dctoFocusLost(evt);
            }
        });
        dcto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dctoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dctoKeyTyped(evt);
            }
        });

        iva_art.setText("0.0");
        iva_art.setToolTipText("%iva en venta");
        iva_art.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                iva_artFocusGained(evt);
            }
        });
        iva_art.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                iva_artKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iva_artKeyTyped(evt);
            }
        });

        jLabel9.setText("%IVA:");

        total_articulos.setFont(new java.awt.Font("Tahoma", 1, 11));
        total_articulos.setText("0.0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iva_art, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dcto, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(articulo, 0, 453, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(leyenda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(367, 367, 367)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel8)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel18))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(iva, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(descuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(subtot, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(cantidad_con_letra, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
                .addGap(335, 335, 335))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dcto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iva_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leyenda)
                            .addComponent(total_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(66, 66, 66)
                        .addComponent(jLabel10)
                        .addGap(2, 2, 2)
                        .addComponent(cantidad_con_letra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(iva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))))
                .addContainerGap())
        );

        registrar_btn.setForeground(new java.awt.Color(0, 153, 51));
        registrar_btn.setText("Registrar");
        registrar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setForeground(new java.awt.Color(0, 0, 102));
        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        salir_btn.setForeground(new java.awt.Color(153, 0, 0));
        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        contado.setForeground(new java.awt.Color(0, 153, 51));
        contado.setSelected(true);
        contado.setText("Contado");
        contado.setOpaque(false);

        credito.setForeground(new java.awt.Color(0, 0, 153));
        credito.setText("Crédito");

        preventa.setForeground(new java.awt.Color(0, 0, 204));
        preventa.setText("Preventa");
        preventa.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(preventa)
                                .addGap(28, 28, 28)
                                .addComponent(contado)
                                .addGap(28, 28, 28)
                                .addComponent(credito))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(registrar_btn)
                        .addGap(45, 45, 45)
                        .addComponent(cancelar_btn)
                        .addGap(46, 46, 46)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registrar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(preventa)
                            .addComponent(contado)
                            .addComponent(credito))))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){ //evento de Enter           
           no_nota.requestFocus();
         }
    }//GEN-LAST:event_id_clienteKeyPressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fecha_venta.setText(Fecha.getFechaHoy());
        cargarRutas();
    }//GEN-LAST:event_formWindowOpened

    private void registrar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_btnActionPerformed
       if(validarDatos()) 
        registrarNota();
       else
            JOptionPane.showMessageDialog(this, "Hay campos vacios requeridos...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
       id_cliente.requestFocus();
    }//GEN-LAST:event_registrar_btnActionPerformed

    private void id_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyTyped
      Validador.validarNumero(evt);
      if(id_cliente.getText().length()==6)
          evt.consume();
    }//GEN-LAST:event_id_clienteKeyTyped

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        limpiarCampos();
        if(!registrar_btn.isVisible()){
          registrar_btn.setVisible(true);
        }
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
      dispose();
    }//GEN-LAST:event_salir_btnActionPerformed

    private void no_notaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_no_notaFocusLost
        nota.setNo_Nota(no_nota.getText());
        if(nota.buscarNota()){
            if(JOptionPane.showConfirmDialog(id_articulo, "¿Desea consultar esta NOTA?", "Atención!, NOTA registrada", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
              nota.extraerNota(modelo_tabla);
              id_cliente.requestFocus();
              id_cliente.setText(""+nota.getId_Cliente());               
              no_nota.setText(nota.getNota());
              fecha_venta.setText(nota.getFecha());
              combo_rutas.setSelectedIndex(nota.getId_Ruta()-1);
              subtot.setText(""+nota.getSubtotal());
              descuento.setText(""+nota.getDescuento());
              subtotal.setText(""+nota.getSub_total());
              iva.setText(""+nota.getIVA());
              total.setText(""+nota.getTotal());
              total_articulos.setText(""+nota.getCantidad());
              if(nota.getId_estatus()==1)
                  contado.setSelected(true);
              else if(nota.getId_estatus()==2)
                  credito.setSelected(true);
              else if(nota.getId_estatus()==4)
                  preventa.setSelected(true);
              registrar_btn.setVisible(false);
              cantidad_con_letras();
            }else
                id_cliente.requestFocus();
        }
    }//GEN-LAST:event_no_notaFocusLost

    private void no_notaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_notaKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_no_notaKeyTyped

    private void tablaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
          if(tabla.getRowCount()!=-1){
             try{
                 if(!registrar_btn.isVisible()){
                   if(JOptionPane.showConfirmDialog(this, "¿Desea eliminar éste registro de la base de datos?", "Advertencia...", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION){
                      String codigo_art = tabla.getValueAt(tabla.getSelectedRow(),0).toString(); //guardo el codigo del art a eliminar
                         modelo_tabla.removeRow(tabla.getSelectedRow()); //elimino la fila
                         calcularImportes(); //calculamos nuevamente los importes
                       nota.setSubtotal(Double.parseDouble(subtot.getText()));
                       nota.setDescuento(Double.parseDouble(descuento.getText()));
                       nota.setSub_total(Double.parseDouble(subtotal.getText()));
                       nota.setIVA(Double.parseDouble(iva.getText()));
                       nota.setTotal(Double.parseDouble(total.getText()));
                       nota.setCantidad(Double.parseDouble(total_articulos.getText()));
                       nota.eliminarRegistro(modelo_tabla, codigo_art);
                   }
                 }
                 else{
                  modelo_tabla.removeRow(tabla.getSelectedRow());
                  calcularImportes();
                 }
               tabla.clearSelection();
               id_articulo.requestFocus();
             }catch(Exception e){  System.out.println("error al eliminar...");     }
          }
        }else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!registrar_btn.isVisible()){
            
          }
        }
    }//GEN-LAST:event_tablaKeyReleased

    private void id_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_clienteFocusLost
        buscarCliente();
    }//GEN-LAST:event_id_clienteFocusLost

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        nuevo_articulo.desconectar();
        cliente.desconectar();
        nota.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void fecha_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_ventaKeyTyped
        if(fecha_venta.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_fecha_ventaKeyTyped

    private void fecha_ventaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_ventaFocusLost
        if(!Validador.validarFecha(fecha_venta.getText()))
            JOptionPane.showMessageDialog(this, "El formato de fecha ingresado no es válido...", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_fecha_ventaFocusLost

    private void descuentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            if(!descuento.getText().equals("")){
                subtotal.setText(""+(Double.parseDouble(subtot.getText())-Double.parseDouble(descuento.getText())));
                total.setText(""+(Matematicas.redondear(Double.parseDouble(subtotal.getText())+Double.parseDouble(iva.getText()),2)));
                cantidad_con_letras();
            }
        }
}//GEN-LAST:event_descuentoKeyPressed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        Validador.validarPrecio(cantidad,evt);
        if(cantidad.getText().length()==9)
            evt.consume();
}//GEN-LAST:event_cantidadKeyTyped

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            prepararInsercion();
        }
        else if(evt.getKeyCode()==KeyEvent.VK_ESCAPE)
            limpiar();
}//GEN-LAST:event_cantidadKeyPressed

    private void id_articuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyTyped
        Validador.validarNumero(evt);
        if(id_articulo.getText().length()==15)
            evt.consume();
}//GEN-LAST:event_id_articuloKeyTyped

    private void id_articuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            cantidad.requestFocus();
        else if(evt.getKeyCode()==KeyEvent.VK_ADD){
           if(validarDatos()) {
              registrarNota();            
           }
        }
}//GEN-LAST:event_id_articuloKeyPressed

    private void id_articuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusLost
        buscarArticulo();
}//GEN-LAST:event_id_articuloFocusLost

    private void dctoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dctoKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER) 
        if(!dcto.getText().equals(""))
            prepararInsercion();
    }//GEN-LAST:event_dctoKeyPressed

    private void dctoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dctoFocusLost
        if(dcto.getText().equals(""))
            dcto.setText("0.0");
    }//GEN-LAST:event_dctoFocusLost

    private void iva_artKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iva_artKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           if(Double.parseDouble(iva_art.getText())>=1){
              iva_art.setText(""+Matematicas.redondear(Double.parseDouble(iva_art.getText())/100,2));
              prepararInsercion();
           }
    }//GEN-LAST:event_iva_artKeyPressed

    private void dctoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dctoFocusGained
        dcto.selectAll();
    }//GEN-LAST:event_dctoFocusGained

    private void iva_artFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_iva_artFocusGained
        iva_art.selectAll();
    }//GEN-LAST:event_iva_artFocusGained

    private void dctoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dctoKeyTyped
        Validador.validarPrecio(dcto, evt);
    }//GEN-LAST:event_dctoKeyTyped

    private void iva_artKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iva_artKeyTyped
        Validador.validarPrecio(iva_art, evt);
    }//GEN-LAST:event_iva_artKeyTyped

    private void descuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descuentoKeyTyped
        Validador.validarPrecio(descuento, evt);
    }//GEN-LAST:event_descuentoKeyTyped

    private void no_notaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_notaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            id_articulo.requestFocus();
    }//GEN-LAST:event_no_notaKeyPressed

    private void no_notaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_no_notaFocusGained
        no_nota.selectAll();
    }//GEN-LAST:event_no_notaFocusGained

    private void id_articuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusGained
        id_articulo.selectAll();
    }//GEN-LAST:event_id_articuloFocusGained

    private void id_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_clienteFocusGained
        id_cliente.selectAll();
    }//GEN-LAST:event_id_clienteFocusGained

    private void cantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cantidadFocusGained
        cantidad.selectAll();
    }//GEN-LAST:event_cantidadFocusGained

    private void nom_negocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_negocioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          cliente.setNegocio(nom_negocio.getText());
          if(cliente.buscarClientePorNegocio()){
              mostrarCliente();
              no_nota.requestFocus();
          }else
              limpiarCamposCliente();
        }
    }//GEN-LAST:event_nom_negocioKeyPressed

    private void nom_negocioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nom_negocioFocusGained
        nom_negocio.selectAll();
    }//GEN-LAST:event_nom_negocioFocusGained

    void prepararInsercion(){
      if(!id_articulo.getText().equals("")){
            if(!cantidad.getText().equals("")){
                   agregar_a_Tabla();
                   calcularImportes();
                   limpiar();               
            }
       }
    }
    
    void buscarArticulo(){
       if(!id_articulo.getText().equals("")){
           articulo.removeAllItems();
            nuevo_articulo.setId_articulo(id_articulo.getText());
             if(nuevo_articulo.buscarArticuloPorID_enTArticulos()){                   
                articulo.addItem(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion()+" $"+nuevo_articulo.getPrecioVenta());
                iva_art.setText(""+nuevo_articulo.getPorcentajeIvaVenta());
                cantidad.requestFocus();
             }else
                articulo.requestFocus();
            }
    }
    
    void buscarCliente(){
      if(!id_cliente.getText().equals("")){              
              cliente.setID(Integer.parseInt(id_cliente.getText()));
              if(cliente.buscarClientePorID()){
                mostrarCliente();
              }else{                  
                limpiarCamposCliente();
              }
        }
    }
    
    void mostrarCliente(){
       id_cliente.setText(""+cliente.getID());
       nom_cliente.removeAllItems();
       nom_cliente.addItem(cliente.getNombre());
       direccion.setText(cliente.getDireccion());
       rfc.setText(cliente.getRFC());
       telefono.setText(""+cliente.getTelefono());                
       nom_negocio.setText("\""+cliente.getNegocio()+"\"");
    }
    
    void limpiarCamposCliente(){
       id_cliente.setText(null); 
       nom_cliente.removeAllItems();
       direccion.setText(null);
       rfc.setText(null);
       telefono.setText(null);
       nom_negocio.setText(null);
    }
            
    public void agregar_a_Tabla(){
        nuevo_articulo.agregar_a_Tabla(modelo_tabla, cantidad.getText(), iva_art.getText(), dcto.getText());        
      calcularImportes();
      limpiar();
    }
    
    void limpiar(){
       id_articulo.setText("");        
        articulo.removeAllItems();
        cantidad.setText("");
        dcto.setText("0.0");
        iva_art.setText("0.0");
        id_articulo.requestFocus();
    }
    
    public void calcularImportes(){
        nuevo_articulo.calcularImportes(tabla); //4 y 5 son columnas del iva y del importe
      subtot.setText(""+nuevo_articulo.getTSV());
      descuento.setText(""+nuevo_articulo.getTDescuento());
      subtotal.setText(""+Matematicas.redondear(nuevo_articulo.getTSV()-nuevo_articulo.getTDescuento(),2));
      iva.setText(""+nuevo_articulo.getTivaV());
      total.setText(""+(Matematicas.redondear(nuevo_articulo.getTImporte()+nuevo_articulo.getTivaV(),2)));
      total_articulos.setText(""+nuevo_articulo.getTotalArticulos());
      cantidad_con_letras();
    }
    
    public void cantidad_con_letras(){
      cantidad_con_letra.setText(controladores.Convertidor.getStringOfNumber(Float.parseFloat(total.getText())));
    }
    
    public void cargarRutas(){
        Rutas r = new Rutas();
      r.getRutas(combo_rutas);
      r.desconectar();
    }

    public void registrarNota(){
      nota.setNo_Nota(no_nota.getText());
      nota.setFecha(fecha_venta.getText());
      nota.setCantidad(Double.parseDouble(total_articulos.getText()));
      nota.setSubtotal(Double.parseDouble(subtot.getText()));
      nota.setDescuento(Double.parseDouble(descuento.getText()));
      nota.setSub_total(Double.parseDouble(subtotal.getText()));
      nota.setIVA(Double.parseDouble(iva.getText()));
      nota.setTotal(Double.parseDouble(total.getText()));
      nota.setId_Ruta(combo_rutas.getSelectedIndex()+1);
      nota.setId_Cliente(Integer.parseInt(id_cliente.getText()));
      if(contado.isSelected())
          nota.setId_Estatus(1); //nota de contado
      else if(credito.isSelected())
          nota.setId_Estatus(2); //nota a credito
      else if(preventa.isSelected())
          nota.setId_Estatus(4);  //nota en preventa
      if(nota.registrarNota(tabla))
          limpiarCampos();      
    }
    
    public void limpiarCampos(){
      id_cliente.setText(null);
      nom_cliente.removeAllItems();
      no_nota.setText(null);
      direccion.setText(null);
      rfc.setText(null);
      telefono.setText(null);
      nom_negocio.setText(null);
      id_articulo.setText(null);
      articulo.removeAllItems();
      cantidad.setText(null);      
      subtot.setText("0.00");
      subtotal.setText("0.00");
      iva.setText("0.00");
      total.setText("0.00");
      total_articulos.setText("0");
      cantidad_con_letra.setText(null);
       for(int x=tabla.getRowCount()-1; x>=0;x--){
         modelo_tabla.removeRow(x);
       }
       id_cliente.requestFocus();
    }       
   
    boolean validarDatos(){
      if(tabla.getRowCount()>0 &
          !id_cliente.getText().equals("") &
          !no_nota.getText().equals("") &
          !fecha_venta.getText().equals("")
        )
          return true;
      else
          return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox articulo;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JTextField cantidad;
    private javax.swing.JTextField cantidad_con_letra;
    private javax.swing.JComboBox combo_rutas;
    private javax.swing.JRadioButton contado;
    private javax.swing.JRadioButton credito;
    private javax.swing.JTextField dcto;
    private javax.swing.JTextField descuento;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField fecha_venta;
    private javax.swing.JTextField id_articulo;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField iva;
    private javax.swing.JTextField iva_art;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel leyenda;
    private javax.swing.JTextField no_nota;
    private javax.swing.JComboBox nom_cliente;
    private javax.swing.JTextField nom_negocio;
    private javax.swing.JRadioButton preventa;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JButton registrar_btn;
    private javax.swing.JTextField rfc;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField subtot;
    private javax.swing.JTextField subtotal;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField total;
    private javax.swing.JLabel total_articulos;
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
            mostrarCliente();
            no_nota.requestFocus();
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
             nuevo_articulo.setDescripcion(editor_articulo.getText().trim());             
             nuevo_articulo.buscarArticuloPorDescripcion();
             if(articulo.getItemCount()>1)               
               editor_articulo.setText(nuevo_articulo.getDescripcion()); //le reasignamos el texto si queremos seguir consultando
          }
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){            
            nuevo_articulo.setSelectedArt(articulo.getSelectedIndex());
            nuevo_articulo.buscarArticuloPorID_enTArticulos();            
            id_articulo.setText(""+nuevo_articulo.getId_Articulo());
            iva_art.setText(""+nuevo_articulo.getPorcentajeIvaVenta());
            cantidad.requestFocus();
        }
    }

        @Override
    public void keyReleased(KeyEvent e) {

    }

}
}//fin de la clase ventas