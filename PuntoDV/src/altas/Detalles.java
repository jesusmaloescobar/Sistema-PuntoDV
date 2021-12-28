/*
 * Detalles.java
 *
 * Created on 21/04/2011, 10:41:56 AM
 */
package altas;

import controladores.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Jesús Malo
 */
public class Detalles extends javax.swing.JFrame implements KeyListener{

    private DefaultTableModel estados_model,ciudades_model,conceptos_model,estatus_model,presentaciones_model,rutas_model, actividad_model;
    private EstadosCiudades estcid;
    private ConceptoEstatus ce;
    private controladores.Presentacion pres;
    private DefaultTableModel tasa_iva_model;
    private Impuestos ivas;
    JTextComponent editor_empleado;
    private controladores.Empleado empleado;
    private controladores.Rutas rutas;
    private Cliente c;
    /** Creates new form Detalles */
    public Detalles() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        estados_model = (DefaultTableModel) estado.getModel();
        ciudades_model = (DefaultTableModel) ciudad.getModel();
        conceptos_model = (DefaultTableModel) concepto.getModel();
        estatus_model = (DefaultTableModel) estatus.getModel();
        presentaciones_model = (DefaultTableModel) presentacion.getModel();
        rutas_model = (DefaultTableModel) tabla_rutas.getModel();
        tasa_iva_model = (DefaultTableModel) tabla_ivas.getModel();
        actividad_model = (DefaultTableModel) tabla_actividad.getModel();
        c = new Cliente();
        editor_empleado = (JTextComponent) empleado_cmb.getEditor().getEditorComponent();
        editor_empleado.addKeyListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        descr_presentacion = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        presentacion = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        descr_ruta = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        guardar_ruta_btn = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        tabla_rutas = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        empleado_cmb = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nom_estado = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        estado = new javax.swing.JTable();
        guardar_estado = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nom_ciudad = new javax.swing.JTextField();
        guardar_ciudad = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ciudad = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        descr_estado = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        actividad_giro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tabla_actividad = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tabla_ivas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        año = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        iva_en_compra = new javax.swing.JTextField();
        iva_en_venta = new javax.swing.JTextField();
        registrar_iva = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        descr_concepto = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        concepto = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        descr_estatus = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        estatus = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajustes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel9.setText("Descripción:");

        jButton7.setForeground(new java.awt.Color(0, 102, 0));
        jButton7.setText("Ok");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        descr_presentacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descr_presentacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descr_presentacionKeyTyped(evt);
            }
        });

        presentacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Presentación"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        presentacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                presentacionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                presentacionKeyTyped(evt);
            }
        });
        jScrollPane5.setViewportView(presentacion);
        presentacion.getColumnModel().getColumn(0).setPreferredWidth(10);
        presentacion.getColumnModel().getColumn(1).setPreferredWidth(160);

        jTextArea1.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setEditable(false);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 11));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(2);
        jTextArea1.setText("*La presentación identifica la categoría a la que pertenece cada producto.");
        jTextArea1.setWrapStyleWord(true);
        jScrollPane8.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(descr_presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jButton7)
                    .addComponent(descr_presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel.addTab("Presentacion", jPanel3);

        jLabel11.setText("Descripción:");

        descr_ruta.setToolTipText("Nombre de la nueva ruta/area");
        descr_ruta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descr_rutaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descr_rutaKeyTyped(evt);
            }
        });

        jTextArea3.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setEditable(false);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 0, 11));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(2);
        jTextArea3.setText("*Agregue rutas para canalizar sus salidas y obtener un reporte detallado de las ventas realizadas en cada una.");
        jTextArea3.setWrapStyleWord(true);
        jScrollPane10.setViewportView(jTextArea3);

        guardar_ruta_btn.setForeground(new java.awt.Color(0, 153, 0));
        guardar_ruta_btn.setText("Ok");
        guardar_ruta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_ruta_btnActionPerformed(evt);
            }
        });

        tabla_rutas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ruta(ID)", "Empleado (ID)", "Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_rutas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_rutasKeyReleased(evt);
            }
        });
        jScrollPane6.setViewportView(tabla_rutas);
        tabla_rutas.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabla_rutas.getColumnModel().getColumn(1).setPreferredWidth(10);
        tabla_rutas.getColumnModel().getColumn(2).setPreferredWidth(160);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Asignar un empleado a la ruta"));

        jLabel13.setText("Empleado:");

        empleado_cmb.setEditable(true);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(empleado_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(empleado_cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descr_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guardar_ruta_btn))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(descr_ruta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_ruta_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel.addTab("Ruta", jPanel4);

        jLabel2.setText("Estado:");

        nom_estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nom_estadoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_estadoKeyTyped(evt);
            }
        });

        estado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        estado.getTableHeader().setReorderingAllowed(false);
        estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estadoMouseClicked(evt);
            }
        });
        estado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                estadoKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(estado);
        estado.getColumnModel().getColumn(0).setPreferredWidth(10);
        estado.getColumnModel().getColumn(1).setPreferredWidth(250);

        guardar_estado.setForeground(new java.awt.Color(0, 153, 0));
        guardar_estado.setText("Ok");
        guardar_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_estadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Ciudad:");

        nom_ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nom_ciudadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nom_ciudadKeyTyped(evt);
            }
        });

        guardar_ciudad.setForeground(new java.awt.Color(0, 153, 0));
        guardar_ciudad.setText("Ok");
        guardar_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_ciudadActionPerformed(evt);
            }
        });

        ciudad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_E", "ID_C", "Ciudad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ciudad.getTableHeader().setReorderingAllowed(false);
        ciudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ciudadKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(ciudad);
        ciudad.getColumnModel().getColumn(0).setPreferredWidth(10);
        ciudad.getColumnModel().getColumn(1).setPreferredWidth(10);
        ciudad.getColumnModel().getColumn(2).setPreferredWidth(160);

        descr_estado.setEditable(false);
        descr_estado.setText("seleccione un estado de la lista ^");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar_ciudad))
                    .addComponent(descr_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar_estado)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nom_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_estado))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(descr_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nom_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_ciudad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel.addTab("Estado/Ciudad", jPanel1);

        jLabel3.setText("Descripción:");

        actividad_giro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                actividad_giroKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                actividad_giroKeyTyped(evt);
            }
        });

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tabla_actividad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CNS", "Actividad/Giro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_actividad.getTableHeader().setReorderingAllowed(false);
        tabla_actividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_actividadMouseClicked(evt);
            }
        });
        tabla_actividad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_actividadKeyReleased(evt);
            }
        });
        jScrollPane12.setViewportView(tabla_actividad);
        tabla_actividad.getColumnModel().getColumn(0).setPreferredWidth(10);
        tabla_actividad.getColumnModel().getColumn(1).setPreferredWidth(250);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actividad_giro, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(actividad_giro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panel.addTab("  Actividades  ", jPanel7);

        tabla_ivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Año", "IVA en compras", "IVA en ventas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_ivas.getTableHeader().setReorderingAllowed(false);
        tabla_ivas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_ivasKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(tabla_ivas);

        jLabel1.setText("Año:");

        año.setBackground(new java.awt.Color(0, 0, 153));
        año.setFont(new java.awt.Font("Tahoma", 1, 12));
        año.setForeground(new java.awt.Color(0, 0, 204));

        jLabel5.setText("%IVA en compra:");

        jLabel7.setText("%IVA en venta:");

        iva_en_compra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iva_en_compraKeyTyped(evt);
            }
        });

        iva_en_venta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                iva_en_ventaKeyTyped(evt);
            }
        });

        registrar_iva.setFont(new java.awt.Font("Tahoma", 1, 11));
        registrar_iva.setForeground(new java.awt.Color(0, 153, 0));
        registrar_iva.setText("Registrar datos");
        registrar_iva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_ivaActionPerformed(evt);
            }
        });

        jTextArea4.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea4.setColumns(20);
        jTextArea4.setEditable(false);
        jTextArea4.setFont(new java.awt.Font("Monospaced", 0, 11));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(2);
        jTextArea4.setText("*Indíque el % de IVA para sus compras y ventas.");
        jTextArea4.setWrapStyleWord(true);
        jScrollPane11.setViewportView(jTextArea4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(iva_en_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(iva_en_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(registrar_iva))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(iva_en_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(iva_en_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(registrar_iva, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(351, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        panel.addTab("Tasa interes", jPanel5);

        jLabel6.setText("Concepto:");

        descr_concepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descr_conceptoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descr_conceptoKeyTyped(evt);
            }
        });

        jButton3.setForeground(new java.awt.Color(0, 153, 0));
        jButton3.setText("Ok");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        concepto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Concepto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        concepto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                conceptoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                conceptoKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(concepto);
        concepto.getColumnModel().getColumn(0).setPreferredWidth(10);
        concepto.getColumnModel().getColumn(1).setPreferredWidth(160);

        jLabel8.setText("Estatus:");

        descr_estatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                descr_estatusKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                descr_estatusKeyTyped(evt);
            }
        });

        jButton4.setForeground(new java.awt.Color(0, 153, 0));
        jButton4.setText("Ok");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        estatus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Estatus"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        estatus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                estatusKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                estatusKeyTyped(evt);
            }
        });
        jScrollPane4.setViewportView(estatus);
        estatus.getColumnModel().getColumn(0).setPreferredWidth(10);
        estatus.getColumnModel().getColumn(1).setPreferredWidth(160);

        jTextArea2.setBackground(new java.awt.Color(204, 204, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setEditable(false);
        jTextArea2.setFont(new java.awt.Font("Monospaced", 0, 11));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(2);
        jTextArea2.setText("*El \"concepto\" identifica el tipo de salida, y el \"estatus\" el estado actual de tal salida. p.e. puede haber una salida a credito(concepto) y estar liquidada o pendiente de pagar(estatus). Estos datos son indispensables para facturar.");
        jTextArea2.setWrapStyleWord(true);
        jScrollPane9.setViewportView(jTextArea2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descr_concepto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descr_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(descr_concepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(descr_estatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(272, Short.MAX_VALUE)))
        );

        panel.addTab("Concepto/Estatus", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        grabarPresentacion();
        
}//GEN-LAST:event_jButton7ActionPerformed

    private void descr_rutaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_rutaKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_descr_rutaKeyTyped

    private void nom_estadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_estadoKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_nom_estadoKeyTyped

    private void nom_ciudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_ciudadKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_nom_ciudadKeyTyped

    private void descr_conceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_conceptoKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_descr_conceptoKeyTyped

    private void descr_estatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_estatusKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_descr_estatusKeyTyped

    private void descr_presentacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_presentacionKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_descr_presentacionKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablas();
    }//GEN-LAST:event_formWindowOpened

    private void estadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estadoMouseClicked
        descr_estado.setText(""+estado.getValueAt(estado.getSelectedRow(), 1));
    }//GEN-LAST:event_estadoMouseClicked

    private void guardar_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_estadoActionPerformed
       guardarEstado();
    }//GEN-LAST:event_guardar_estadoActionPerformed

    private void guardar_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_ciudadActionPerformed
       guardarCiudad();
    }//GEN-LAST:event_guardar_ciudadActionPerformed

    private void nom_estadoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_estadoKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           guardarEstado();
    }//GEN-LAST:event_nom_estadoKeyPressed

    private void nom_ciudadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_ciudadKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           guardarCiudad();
    }//GEN-LAST:event_nom_ciudadKeyPressed

    private void estadoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estadoKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          estcid.setEstado(""+estado.getValueAt(estado.getSelectedRow(), 1));            
          estcid.actualizarEstado(Integer.parseInt(""+estado.getValueAt(estado.getSelectedRow(), 0)));
        }
    }//GEN-LAST:event_estadoKeyReleased

    private void ciudadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ciudadKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          estcid.setCiudad(""+ciudad.getValueAt(ciudad.getSelectedRow(), 2));
          estcid.actualizarCiudad(Integer.parseInt(""+ciudad.getValueAt(ciudad.getSelectedRow(), 1)));
        }
    }//GEN-LAST:event_ciudadKeyReleased

    private void conceptoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conceptoKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_conceptoKeyTyped

    private void estatusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estatusKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_estatusKeyTyped

    private void descr_conceptoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_conceptoKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER) 
          grabarConcepto();
    }//GEN-LAST:event_descr_conceptoKeyPressed

    private void descr_estatusKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_estatusKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
           grabarEstatus();
    }//GEN-LAST:event_descr_estatusKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        grabarConcepto();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        grabarEstatus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void descr_presentacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_presentacionKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            grabarPresentacion();       
    }//GEN-LAST:event_descr_presentacionKeyPressed

    private void presentacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_presentacionKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_presentacionKeyTyped
  
    private void conceptoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_conceptoKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          ce.setConcepto(""+concepto.getValueAt(concepto.getSelectedRow(), 1));
          ce.actualizarConcepto(Integer.parseInt(""+concepto.getValueAt(concepto.getSelectedRow(), 0)));
        }
    }//GEN-LAST:event_conceptoKeyReleased

    private void estatusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_estatusKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          ce.setEstatus(""+estatus.getValueAt(estatus.getSelectedRow(), 1));
          ce.actualizarEstatus(Integer.parseInt(""+estatus.getValueAt(estatus.getSelectedRow(), 0)));
        }
    }//GEN-LAST:event_estatusKeyReleased

    private void presentacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_presentacionKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          pres.setPresentacion(""+presentacion.getValueAt(presentacion.getSelectedRow(), 1));
          pres.actualizarPresentacion(Integer.parseInt(""+presentacion.getValueAt(presentacion.getSelectedRow(), 0)));
        }  
    }//GEN-LAST:event_presentacionKeyReleased

    private void tabla_ivasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_ivasKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            ivas.setTasaIva(Double.parseDouble(tabla_ivas.getValueAt(tabla_ivas.getSelectedRow(), 1).toString()), Double.parseDouble(tabla_ivas.getValueAt(tabla_ivas.getSelectedRow(), 2).toString()));
            ivas.actualizarIvas(Integer.parseInt(tabla_ivas.getValueAt(tabla_ivas.getSelectedRow(), 0).toString()));
        }
    }//GEN-LAST:event_tabla_ivasKeyReleased

    private void descr_rutaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_descr_rutaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!descr_ruta.getText().equals("")){
            rutas.setNomRuta(descr_ruta.getText());
            rutas.setIdTrabajador(empleado.getID());
            rutas.grabarRuta();
            rutas.getRutasList(rutas_model);
            descr_ruta.setText(null);
          }
        }
    }//GEN-LAST:event_descr_rutaKeyPressed

    private void guardar_ruta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_ruta_btnActionPerformed
        if(!descr_ruta.getText().equals("")){
            rutas.setNomRuta(descr_ruta.getText());
            rutas.setIdTrabajador(empleado.getID());
            rutas.grabarRuta();
            rutas.getRutasList(rutas_model);
            descr_ruta.setText(null);
          }
    }//GEN-LAST:event_guardar_ruta_btnActionPerformed

    private void tabla_rutasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_rutasKeyReleased
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            rutas.setIdRuta(Integer.parseInt(tabla_rutas.getValueAt(tabla_rutas.getSelectedRow(), 0).toString()));
            rutas.setIdTrabajador(Integer.parseInt(tabla_rutas.getValueAt(tabla_rutas.getSelectedRow(), 1).toString())); //ID del trabajador
            rutas.setNomRuta(tabla_rutas.getValueAt(tabla_rutas.getSelectedRow(), 2).toString());             
            rutas.actualizarRuta();             
        }
    }//GEN-LAST:event_tabla_rutasKeyReleased

    private void registrar_ivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_ivaActionPerformed
       if(!iva_en_compra.getText().equals("") & !iva_en_venta.getText().equals("")){
         ivas.setTasaIva(Double.parseDouble(iva_en_compra.getText()), Double.parseDouble(iva_en_venta.getText()));
         ivas.grabarNuevoImpuesto();
         iva_en_compra.setText(null);
         iva_en_venta.setText(null);
         ivas.getTasaIVAList(tasa_iva_model);
         iva_en_compra.requestFocus();
       }
    }//GEN-LAST:event_registrar_ivaActionPerformed

    private void iva_en_compraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iva_en_compraKeyTyped
        Validador.validarNumero(evt);
        if(iva_en_compra.getText().length()==3)
            evt.consume();
    }//GEN-LAST:event_iva_en_compraKeyTyped

    private void iva_en_ventaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_iva_en_ventaKeyTyped
        Validador.validarNumero(evt);
        if(iva_en_venta.getText().length()==3)
            evt.consume();
    }//GEN-LAST:event_iva_en_ventaKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        ce.desconectar();
        pres.desconectar();
        rutas.desconectar();
        estcid.desconectar();
        ivas.desconectar();
        empleado.desconectar();
        c.desconectar();
        ce=null;
        pres=null;
        rutas=null;
        estcid=null;
        ivas=null;
        empleado=null;
        c=null;
    }//GEN-LAST:event_formWindowClosed

    private void tabla_actividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_actividadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_actividadMouseClicked

    private void tabla_actividadKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_actividadKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tabla_actividadKeyReleased

    private void actividad_giroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actividad_giroKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
           if(!actividad_giro.getText().equals("")){
               c.setActividad(actividad_giro.getText().toUpperCase());
               c.getActividades(actividad_model);
               actividad_giro.setText(null);
           }
        }
    }//GEN-LAST:event_actividad_giroKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(!actividad_giro.getText().equals("")){
               c.setActividad(actividad_giro.getText().toUpperCase());
               c.getActividades(actividad_model);
               actividad_giro.setText(null);
           }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void actividad_giroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actividad_giroKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_actividad_giroKeyTyped

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField actividad_giro;
    private javax.swing.JLabel año;
    private javax.swing.JTable ciudad;
    private javax.swing.JTable concepto;
    private javax.swing.JTextField descr_concepto;
    private javax.swing.JTextField descr_estado;
    private javax.swing.JTextField descr_estatus;
    private javax.swing.JTextField descr_presentacion;
    private javax.swing.JTextField descr_ruta;
    private javax.swing.JComboBox empleado_cmb;
    private javax.swing.JTable estado;
    private javax.swing.JTable estatus;
    private javax.swing.JButton guardar_ciudad;
    private javax.swing.JButton guardar_estado;
    private javax.swing.JButton guardar_ruta_btn;
    private javax.swing.JTextField iva_en_compra;
    private javax.swing.JTextField iva_en_venta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField nom_ciudad;
    private javax.swing.JTextField nom_estado;
    public static javax.swing.JTabbedPane panel;
    private javax.swing.JTable presentacion;
    private javax.swing.JButton registrar_iva;
    private javax.swing.JTable tabla_actividad;
    private javax.swing.JTable tabla_ivas;
    private javax.swing.JTable tabla_rutas;
    // End of variables declaration//GEN-END:variables

    private void cargarTablas() {
      estcid = new EstadosCiudades();
      ce = new ConceptoEstatus();
      pres = new controladores.Presentacion();
      ivas = new Impuestos();
      empleado = new controladores.Empleado();
      rutas = new Rutas();
      pres.getPresentaciones(presentaciones_model);
      estcid.getEstados(estados_model);
      estcid.getCiudades(ciudades_model);
      ce.getConceptos(conceptos_model);
      ce.getEstatus(estatus_model);
      c.getActividades(actividad_model);
      año.setText(""+Fecha.getAño());
      ivas.getTasaIVAList(tasa_iva_model);
      rutas.getRutasList(rutas_model);
    }

    private void guardarEstado(){
      if(!nom_estado.getText().equals("")) {
          estcid.setEstado(nom_estado.getText());
        estcid.grabarEstado();
        estcid.getEstados(estados_model);        
        nom_estado.setText("");
       }
    }

    private void guardarCiudad(){
      if(!nom_ciudad.getText().equals(""))
        if(estado.getSelectedRow()!=-1){
            estcid.grabarCiudad(Integer.parseInt(String.valueOf(estado.getValueAt(estado.getSelectedRow(), 0))),nom_ciudad.getText());
            estcid.getCiudades(ciudades_model);            
            nom_ciudad.setText("");
        }
    }
    
    void grabarConcepto(){
      if(!descr_concepto.getText().equals("")){
          ce.setConcepto(descr_concepto.getText());
            ce.grabarConcepto();
            ce.getConceptos(conceptos_model);
            descr_concepto.setText(null);
      }
    }
    void grabarEstatus(){
      if(!descr_estatus.getText().equals("")){
          ce.setEstatus(descr_estatus.getText());
            ce.grabarEstatus();
            ce.getEstatus(estatus_model);
            descr_estatus.setText(null);
      }
    }
    
    void grabarPresentacion(){
      if(!descr_presentacion.getText().equals("")){
        pres.setPresentacion(descr_presentacion.getText());
        pres.registrarPresentacion();
        pres.getPresentaciones(presentaciones_model);
        descr_presentacion.setText(null);
      }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        Validador.validarCadena(e);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_SPACE){
          empleado.setNombre(editor_empleado.getText().trim());
          empleado.buscarEmpleadoPorNombre(empleado_cmb);
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
          empleado.setNombre(editor_empleado.getText().trim());
          empleado.buscarEmpleadoPorNombre(null);            
            descr_ruta.requestFocus();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

}
