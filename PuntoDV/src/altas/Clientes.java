/*
 * Clientes.java
 *
 * Created on 5/04/2011, 06:44:52 PM
 */
package altas;

import controladores.Cliente;
import controladores.EstadosCiudades;
import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Clientes extends javax.swing.JFrame {

    Cliente c = null;
    EstadosCiudades estcid;
    int aux;
    String frec;
    /** Creates new form Clientes */
    public Clientes() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        nombre.requestFocus();
        c = new Cliente();
        estcid = new EstadosCiudades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        rfc = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        estado_alta = new javax.swing.JComboBox();
        ciudad_alta = new javax.swing.JComboBox();
        telefono = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        limite_credito = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        dias_plazo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        combo_rutas = new javax.swing.JComboBox();
        jLabel27 = new javax.swing.JLabel();
        prioridad = new javax.swing.JComboBox();
        jLabel28 = new javax.swing.JLabel();
        negocio = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        actividad = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        id_cliente_act = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nombre_mod = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rfc_mod = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        direccion_mod = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        estado_mod = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        ciudad_mod = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        telefono_mod = new javax.swing.JTextField();
        actualizar = new javax.swing.JButton();
        cancelar_mod = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        limite_credito_mod = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        dias_plazo_mod = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        combo_rutas_mod = new javax.swing.JComboBox();
        jLabel26 = new javax.swing.JLabel();
        prioridad_mod = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();
        negocio_mod = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        actividad_mod = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        id_cliente_eliminar = new javax.swing.JTextField();
        eliminar_cliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operaciones sobre clientes");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("ID:");
        jLabel1.setPreferredSize(null);

        jLabel2.setText("Nombre:");
        jLabel2.setPreferredSize(null);

        jLabel3.setText("Dirección:");
        jLabel3.setPreferredSize(null);

        jLabel4.setText("RFC:");
        jLabel4.setPreferredSize(null);

        jLabel5.setText("Estado:");
        jLabel5.setPreferredSize(null);

        jLabel6.setText("Ciudad:");
        jLabel6.setPreferredSize(null);

        jLabel7.setText("Telefono:");
        jLabel7.setPreferredSize(null);

        id_cliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_clienteFocusLost(evt);
            }
        });
        id_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_clienteKeyTyped(evt);
            }
        });

        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        rfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfcKeyTyped(evt);
            }
        });

        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });

        estado_alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_altaActionPerformed(evt);
            }
        });

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        registrar.setForeground(new java.awt.Color(0, 102, 0));
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        registrar.setText("Registar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        cancelar.setForeground(new java.awt.Color(0, 0, 102));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Limite de crédito:");
        jLabel8.setPreferredSize(null);

        limite_credito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                limite_creditoKeyTyped(evt);
            }
        });

        jLabel18.setText("Plazo:");
        jLabel18.setPreferredSize(null);

        dias_plazo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias_plazoKeyTyped(evt);
            }
        });

        jLabel19.setText("dias");
        jLabel19.setPreferredSize(null);

        salir.setForeground(new java.awt.Color(102, 0, 0));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        jLabel20.setText("pesos");
        jLabel20.setPreferredSize(null);

        jLabel17.setText("Ruta:");
        jLabel17.setPreferredSize(null);

        jLabel27.setText("Prioridad:");
        jLabel27.setPreferredSize(null);

        prioridad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Potencial", "General" }));

        jLabel28.setText("Negocio:");
        jLabel28.setPreferredSize(null);

        negocio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                negocioKeyTyped(evt);
            }
        });

        jLabel29.setText("Actividad:");
        jLabel29.setPreferredSize(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(estado_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ciudad_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(limite_credito, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dias_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(actividad, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(negocio, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(direccion))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(registrar)
                .addGap(18, 18, 18)
                .addComponent(cancelar)
                .addGap(18, 18, 18)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(negocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rfc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(estado_alta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_alta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limite_credito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dias_plazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_rutas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.addTab("     Alta     ", jPanel2);

        jLabel10.setText("ID:");
        jLabel10.setRequestFocusEnabled(false);

        id_cliente_act.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_cliente_actKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_cliente_actKeyTyped(evt);
            }
        });

        jLabel11.setText("Nombre:");

        nombre_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_modKeyTyped(evt);
            }
        });

        jLabel12.setText("RFC:");

        rfc_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfc_modKeyTyped(evt);
            }
        });

        jLabel13.setText("Dirección:");

        direccion_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccion_modKeyTyped(evt);
            }
        });

        jLabel14.setText("Estado:");

        estado_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estado_modActionPerformed(evt);
            }
        });

        jLabel15.setText("Ciudad:");

        jLabel16.setText("Telefono:");

        telefono_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono_modKeyTyped(evt);
            }
        });

        actualizar.setForeground(new java.awt.Color(0, 102, 0));
        actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actualizar.png"))); // NOI18N
        actualizar.setText("Actualizar");
        actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarActionPerformed(evt);
            }
        });

        cancelar_mod.setForeground(new java.awt.Color(0, 0, 102));
        cancelar_mod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancelar_mod.setText("Cancelar");
        cancelar_mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_modActionPerformed(evt);
            }
        });

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel21.setText("Limite de crédito:");

        limite_credito_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                limite_credito_modKeyTyped(evt);
            }
        });

        jLabel22.setText("pesos");

        jLabel23.setText("Plazo:");

        dias_plazo_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dias_plazo_modKeyTyped(evt);
            }
        });

        jLabel24.setText("dias");

        exit.setForeground(new java.awt.Color(102, 0, 0));
        exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel25.setText("Ruta:");

        jLabel26.setText("Prioridad:");

        prioridad_mod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Potencial", "General" }));

        jLabel30.setText("Negocio:");

        negocio_mod.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                negocio_modKeyTyped(evt);
            }
        });

        jLabel31.setText("Actividad:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(id_cliente_act, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6)
                            .addContainerGap(279, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(103, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel31)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(actividad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(negocio_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(109, 109, 109))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(rfc_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel13)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(direccion_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel21)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(limite_credito_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel22))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(dias_plazo_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel24))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combo_rutas_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(prioridad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(telefono_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(estado_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(ciudad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGap(32, 32, 32)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(actualizar)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar_mod)
                        .addGap(18, 18, 18)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(id_cliente_act, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nombre_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(negocio_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(actividad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rfc_mod))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(direccion_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(estado_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(telefono_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(limite_credito_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(dias_plazo_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(combo_rutas_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(prioridad_mod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar_mod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.addTab("     Modificacion     ", jPanel3);

        jLabel9.setText("ID Cliente:");

        id_cliente_eliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_cliente_eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_cliente_eliminarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_cliente_eliminarKeyTyped(evt);
            }
        });

        eliminar_cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        eliminar_cliente.setText("Eliminar cliente");
        eliminar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_clienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(eliminar_cliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(id_cliente_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(id_cliente_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eliminar_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(233, Short.MAX_VALUE))
        );

        panel.addTab("     Baja     ", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        id_cliente.setText(""+c.getSigCliente());
        estcid.getEstados(estado_alta);
        estcid.getEstados(estado_mod);        
        estado_alta.setSelectedIndex(4);
        controladores.Rutas r = new controladores.Rutas();
         r.getRutas(combo_rutas);
         r.getRutas(combo_rutas_mod);
         r.desconectar();
        c.getActividades(actividad);
        c.getActividades(actividad_mod);
        id_cliente.requestFocus();
    }//GEN-LAST:event_formWindowOpened

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        dispose();
}//GEN-LAST:event_salirActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        limpiarCamposAlta();
}//GEN-LAST:event_cancelarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
      if(verificarCampos()){
        registrarCliente();
      }else
        JOptionPane.showMessageDialog(null, "Se requiere que llene todos los campos...", "Atención!", JOptionPane.INFORMATION_MESSAGE);

}//GEN-LAST:event_registrarActionPerformed

    private void estado_altaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_altaActionPerformed
        new EstadosCiudades().getCiudades(ciudad_alta, estado_alta.getSelectedIndex()+1);
}//GEN-LAST:event_estado_altaActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void cancelar_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_modActionPerformed
       limpiarCamposModificacion();
    }//GEN-LAST:event_cancelar_modActionPerformed

    private void eliminar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_clienteActionPerformed
       if(!id_cliente_eliminar.getText().equals(""))
        eliminarCliente();
    }//GEN-LAST:event_eliminar_clienteActionPerformed

    private void id_cliente_eliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliente_eliminarKeyPressed
       if(!id_cliente_eliminar.getText().equals(""))
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)
               eliminarCliente();
    }//GEN-LAST:event_id_cliente_eliminarKeyPressed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_nombreKeyTyped

    private void rfcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfcKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_rfcKeyTyped

    private void direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccionKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_direccionKeyTyped

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        Validador.validarNumero(evt);
        if(telefono.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_telefonoKeyTyped

    private void limite_creditoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limite_creditoKeyTyped
        Validador.validarPrecio(limite_credito, evt);
         if(limite_credito.getText().length()==11)
             evt.consume();
    }//GEN-LAST:event_limite_creditoKeyTyped

    private void dias_plazoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias_plazoKeyTyped
        Validador.validarNumero(evt);
        if(dias_plazo.getText().length()==3)
           evt.consume();
    }//GEN-LAST:event_dias_plazoKeyTyped

    private void id_cliente_actKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliente_actKeyTyped
        Validador.validarNumero(evt);
        if(id_cliente.getText().length()==6)
            evt.consume();
    }//GEN-LAST:event_id_cliente_actKeyTyped

    private void nombre_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_modKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_nombre_modKeyTyped

    private void rfc_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfc_modKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_rfc_modKeyTyped

    private void direccion_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccion_modKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_direccion_modKeyTyped

    private void telefono_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_modKeyTyped
        Validador.validarNumero(evt);
        if(telefono_mod.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_telefono_modKeyTyped

    private void limite_credito_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_limite_credito_modKeyTyped
        Validador.validarPrecio(limite_credito_mod, evt);
        if(limite_credito_mod.getText().length()==11)
            evt.consume();
    }//GEN-LAST:event_limite_credito_modKeyTyped

    private void dias_plazo_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dias_plazo_modKeyTyped
        Validador.validarNumero(evt);
        if(dias_plazo_mod.getText().length()==3)
            evt.consume();
    }//GEN-LAST:event_dias_plazo_modKeyTyped

    private void id_cliente_eliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliente_eliminarKeyTyped
        Validador.validarNumero(evt);
        if(id_cliente_eliminar.getText().length()==6)
            evt.consume();
    }//GEN-LAST:event_id_cliente_eliminarKeyTyped

    private void actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarActionPerformed
        if(verificarCamposAct()){
          actualizarDatosCliente();
        }else
            JOptionPane.showMessageDialog(null, "Hay campos pendientes por llenar!", "Atención...", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_actualizarActionPerformed

    private void id_cliente_actKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_cliente_actKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          if(!id_cliente_act.getText().equals("")){
            c.setID(Integer.parseInt(id_cliente_act.getText()));
            buscarCliente();            
          }
        }
    }//GEN-LAST:event_id_cliente_actKeyPressed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if(!id_cliente_act.getText().equals("")){
            c.setID(Integer.parseInt(id_cliente_act.getText()));
            buscarCliente();
          }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void estado_modActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estado_modActionPerformed
        new EstadosCiudades().getCiudades(ciudad_mod, estado_mod.getSelectedIndex()+1);
    }//GEN-LAST:event_estado_modActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        c.desconectar();
        estcid.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void id_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyTyped
        Validador.validarNumero(evt);
        if(id_cliente.getText().length()==6)
            evt.consume();
    }//GEN-LAST:event_id_clienteKeyTyped

    private void id_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_clienteFocusLost
       if(!id_cliente.getText().equals("")){
        c.setID(Integer.parseInt(id_cliente.getText()));
        if(c.buscarClientePorID()){
            JOptionPane.showMessageDialog(null, "Este ID de cliente ya fue utilizado...", "Atención, ID existente!", JOptionPane.INFORMATION_MESSAGE);
            id_cliente.setText(""+(c.getID()+1));
            id_cliente.requestFocus();
        }
       }else
           id_cliente.requestFocus();
    }//GEN-LAST:event_id_clienteFocusLost

    private void negocioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_negocioKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_negocioKeyTyped

    private void negocio_modKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_negocio_modKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_negocio_modKeyTyped

    void buscarCliente(){
      if(c.buscarClientePorID()){
              nombre_mod.setText(c.getNombre());
              negocio_mod.setText(c.getNegocio());
               actividad_mod.setSelectedIndex(c.getGiroEmpresa()-1);
              rfc_mod.setText(c.getRFC());
              direccion_mod.setText(c.getDireccion());
              estado_mod.setSelectedIndex(c.getIdEstado()-1);
              ciudad_mod.setSelectedItem(c.getCiudad());               
              telefono_mod.setText(""+c.getTelefono());
              limite_credito_mod.setText(""+c.getLimiteCredito());
              dias_plazo_mod.setText(""+c.getDiasPlazo());
              combo_rutas_mod.setSelectedIndex(c.getId_Ruta()-1);
              prioridad_mod.setSelectedIndex(c.getPrioridad()-1);
      }else{
          id_cliente_act.setText(null);
          limpiarCamposModificacion();
      }
    }
    
    void registrarCliente(){
      c.setID(Integer.parseInt(id_cliente.getText()));
      c.setNombre(nombre.getText());
      c.setNegocio(negocio.getText());
      c.setDireccion(direccion.getText());
      c.setRFC(rfc.getText());
      c.setTelefono(telefono.getText());
        estcid.getIdCiudad(estado_alta.getSelectedIndex()+1, ciudad_alta.getSelectedItem().toString());
      c.setID_ciudad(estcid.getIdCiudad());
      c.setLimiteCredito(Double.parseDouble(limite_credito.getText()));
      c.setDiasPlazo(Integer.parseInt(dias_plazo.getText()));
      c.setId_Ruta(combo_rutas.getSelectedIndex()+1);
       c.setPrioridad(prioridad.getSelectedIndex()+1);
       c.setGiroEmpresa(actividad.getSelectedIndex()+1);
         frec="";
         for(aux=0; aux<6; aux++)
             if(Calendar.getInstance().get(Calendar.DAY_OF_WEEK)==aux+2)
                 frec+="1";
             else
                 frec+="0";  
       c.setFrecuentado(frec);
      if(c.registrarCliente()){
       limpiarCamposAlta();       
      }
    }

    void actualizarDatosCliente(){
      c.setID(Integer.parseInt(id_cliente_act.getText()));
      c.setNombre(nombre_mod.getText());
      c.setNegocio(negocio_mod.getText());
      c.setDireccion(direccion_mod.getText());
      c.setRFC(rfc_mod.getText());
      c.setTelefono(telefono_mod.getText());
        estcid.getIdCiudad(estado_mod.getSelectedIndex()+1, ciudad_mod.getSelectedItem().toString());
      c.setID_ciudad(estcid.getIdCiudad());
      c.setLimiteCredito(Double.parseDouble(limite_credito_mod.getText()));
      c.setDiasPlazo(Integer.parseInt(dias_plazo_mod.getText()));
      c.setId_Ruta(combo_rutas_mod.getSelectedIndex()+1);
       c.setPrioridad(prioridad_mod.getSelectedIndex()+1);
       c.setGiroEmpresa(actividad_mod.getSelectedIndex()+1);       
      c.actualizarCliente();  
        limpiarCamposModificacion();
    }

    void limpiarCamposAlta(){
        id_cliente.setText(""+(Integer.parseInt(id_cliente.getText())+1));
      nombre.setText(null);
      direccion.setText(null);
      rfc.setText(null);
      telefono.setText(null);
      limite_credito.setText(null);
      dias_plazo.setText(null);
      negocio.setText(null);
       id_cliente.requestFocus();
    }
    void limpiarCamposModificacion(){
      id_cliente_act.setText(null);
       nombre_mod.setText(null);
      direccion_mod.setText(null);
      rfc_mod.setText(null);
      telefono_mod.setText(null);
      limite_credito_mod.setText(null);
      dias_plazo_mod.setText(null);
      negocio_mod.setText(null);
      id_cliente_act.requestFocus();
    }

    void eliminarCliente(){
        c.setID(Integer.parseInt(id_cliente_eliminar.getText()));
      if(c.buscarClientePorID()) 
      if(c.eliminarCliente()){
            JOptionPane.showMessageDialog(null, "Eliminado correctamente", "Atención", JOptionPane.INFORMATION_MESSAGE);
            id_cliente_eliminar.setText(null);
            id_cliente_eliminar.requestFocus();
      }else{
            JOptionPane.showMessageDialog(null, "El cliente que ingresó no se encuentra", "Error!", JOptionPane.INFORMATION_MESSAGE);
            id_cliente_eliminar.requestFocus();
      }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox actividad;
    private javax.swing.JComboBox actividad_mod;
    private javax.swing.JButton actualizar;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cancelar_mod;
    private javax.swing.JComboBox ciudad_alta;
    private javax.swing.JComboBox ciudad_mod;
    private javax.swing.JComboBox combo_rutas;
    private javax.swing.JComboBox combo_rutas_mod;
    private javax.swing.JTextField dias_plazo;
    private javax.swing.JTextField dias_plazo_mod;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField direccion_mod;
    private javax.swing.JButton eliminar_cliente;
    private javax.swing.JComboBox estado_alta;
    private javax.swing.JComboBox estado_mod;
    private javax.swing.JButton exit;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField id_cliente_act;
    private javax.swing.JTextField id_cliente_eliminar;
    private javax.swing.JButton jButton6;
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
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField limite_credito;
    private javax.swing.JTextField limite_credito_mod;
    private javax.swing.JTextField negocio;
    private javax.swing.JTextField negocio_mod;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre_mod;
    public static javax.swing.JTabbedPane panel;
    private javax.swing.JComboBox prioridad;
    private javax.swing.JComboBox prioridad_mod;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField rfc;
    private javax.swing.JTextField rfc_mod;
    private javax.swing.JButton salir;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefono_mod;
    // End of variables declaration//GEN-END:variables

    private boolean verificarCampos() {
      if(!id_cliente.getText().trim().equals("") &
         !nombre.getText().trim().equals("") &
         !rfc.getText().trim().equals("") &
         !direccion.getText().trim().equals("") &
         !telefono.getText().trim().equals("") &
         !limite_credito.getText().trim().equals("") &
         !dias_plazo.getText().trim().equals("")
        )
          return true;
       else
          return false;
    }

    private boolean verificarCamposAct() {
       if(!id_cliente_act.getText().trim().equals("") &
          !nombre_mod.getText().trim().equals("") &
          !direccion_mod.getText().trim().equals("") &
          !rfc_mod.getText().trim().equals("") &
          !telefono_mod.getText().trim().equals("") &
          !limite_credito_mod.getText().trim().equals("") &
          !dias_plazo_mod.getText().trim().equals("")
         )
           return true;
        else
           return false;
    }

}
