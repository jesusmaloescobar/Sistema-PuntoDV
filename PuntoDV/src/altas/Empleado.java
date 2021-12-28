/*
 * Trabajador.java
 *
 * Created on 5/04/2011, 06:22:37 PM
 */
package altas;

import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Malo
 */
public class Empleado extends javax.swing.JFrame {

    controladores.Empleado e;
    /** Creates new form Trabajador */
    public Empleado() {
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        e = new controladores.Empleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id_empleado = new javax.swing.JTextField();
        rfc = new javax.swing.JTextField();
        guardar_btn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        cancelar_btn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        fecha_ingreso = new javax.swing.JTextField();
        salir_btn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        id_empleado_a = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nombre_a = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        rfc_a = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        direccion_a = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        telefono_a = new javax.swing.JTextField();
        actualizar_btn = new javax.swing.JButton();
        cancelarAct_btn = new javax.swing.JButton();
        buscar_btn = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        fecha_ingreso_a = new javax.swing.JTextField();
        salirAct_btn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        sueldo_a = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        id_emp_eliminar = new javax.swing.JTextField();
        eliminar_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Operaciones sobre trabajadores");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setText("Nombre:");

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        jLabel1.setText("ID:");

        id_empleado.setEditable(false);

        rfc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfcKeyTyped(evt);
            }
        });

        guardar_btn.setForeground(new java.awt.Color(0, 102, 0));
        guardar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Guardar.png"))); // NOI18N
        guardar_btn.setText("Guardar");
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        jLabel6.setText("Dirección:");

        direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccionKeyTyped(evt);
            }
        });

        cancelar_btn.setForeground(new java.awt.Color(0, 0, 204));
        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        jLabel7.setText("Telefono:");

        nombre.setToolTipText("Nombre completo del nuevo empleado");
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        jLabel5.setText("RFC:");

        jLabel16.setText("Fecha de ingreso:");

        fecha_ingreso.setToolTipText("dd-mm-aaaa");
        fecha_ingreso.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_ingresoFocusLost(evt);
            }
        });
        fecha_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_ingresoKeyTyped(evt);
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

        jLabel18.setText("Sueldo:$");

        sueldo.setToolTipText("dd-mm-aaaa");
        sueldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldoKeyTyped(evt);
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
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salir_btn)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salir_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.addTab("     Alta     ", jPanel1);

        jLabel9.setText("ID:");

        id_empleado_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_empleado_aKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_empleado_aKeyTyped(evt);
            }
        });

        jLabel10.setText("Nombre:");

        nombre_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_aKeyTyped(evt);
            }
        });

        jLabel13.setText("RFC:");

        rfc_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                rfc_aKeyTyped(evt);
            }
        });

        jLabel14.setText("Dirección:");

        direccion_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                direccion_aKeyTyped(evt);
            }
        });

        jLabel15.setText("Telefono:");

        telefono_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono_aKeyTyped(evt);
            }
        });

        actualizar_btn.setForeground(new java.awt.Color(0, 102, 0));
        actualizar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Actualizar.png"))); // NOI18N
        actualizar_btn.setText("Actualizar");
        actualizar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_btnActionPerformed(evt);
            }
        });

        cancelarAct_btn.setForeground(new java.awt.Color(0, 0, 153));
        cancelarAct_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancelarAct_btn.setText("Cancelar");
        cancelarAct_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarAct_btnActionPerformed(evt);
            }
        });

        buscar_btn.setText("Buscar");
        buscar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_btnActionPerformed(evt);
            }
        });

        jLabel17.setText("Fecha de ingreso:");

        fecha_ingreso_a.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fecha_ingreso_aFocusLost(evt);
            }
        });
        fecha_ingreso_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fecha_ingreso_aKeyTyped(evt);
            }
        });

        salirAct_btn.setForeground(new java.awt.Color(153, 0, 0));
        salirAct_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        salirAct_btn.setText("Salir");
        salirAct_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirAct_btnActionPerformed(evt);
            }
        });

        jLabel19.setText("Sueldo:$");

        sueldo_a.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sueldo_aKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rfc_a, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direccion_a, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telefono_a, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha_ingreso_a, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id_empleado_a, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buscar_btn))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombre_a, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(actualizar_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelarAct_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salirAct_btn)))
                        .addGap(118, 118, 118))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sueldo_a, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(211, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(id_empleado_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar_btn))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nombre_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(rfc_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(direccion_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(telefono_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(fecha_ingreso_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(sueldo_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarAct_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actualizar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salirAct_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.addTab("     Modificación     ", jPanel3);

        jLabel8.setText("ID empleado:");

        id_emp_eliminar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_emp_eliminar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_emp_eliminarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_emp_eliminarKeyTyped(evt);
            }
        });

        eliminar_btn.setForeground(new java.awt.Color(153, 0, 0));
        eliminar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/eliminar.png"))); // NOI18N
        eliminar_btn.setText("Dar de baja");
        eliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8))
                            .addComponent(eliminar_btn)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(id_emp_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id_emp_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(eliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        panel.addTab("     Baja     ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        id_empleado.setText(""+e.getSigEmpleado());
    }//GEN-LAST:event_formWindowOpened

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        if(!validarCampos())
            JOptionPane.showMessageDialog(null, "Aún hay campos vacios...", "Atención", JOptionPane.INFORMATION_MESSAGE);
        else
            registrarEmpleado();
    }//GEN-LAST:event_guardar_btnActionPerformed

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

    private void fecha_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_ingresoKeyTyped
        Validador.validarCadena(evt);
        if(fecha_ingreso.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_fecha_ingresoKeyTyped

    private void sueldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldoKeyTyped
        Validador.validarPrecio(sueldo, evt);
    }//GEN-LAST:event_sueldoKeyTyped

    private void id_empleado_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_empleado_aKeyTyped
        Validador.validarNumero(evt);
        if(id_empleado_a.getText().length()==6)
            evt.consume();
    }//GEN-LAST:event_id_empleado_aKeyTyped

    private void id_empleado_aKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_empleado_aKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
           buscarEmpleado();
    }//GEN-LAST:event_id_empleado_aKeyPressed

    private void actualizar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_btnActionPerformed
        if(!validarCamposAct()){
            JOptionPane.showMessageDialog(null, "Complete los campos vacíos...", "Atención!", JOptionPane.INFORMATION_MESSAGE);
        }else
            actualizarEmpleado();
    }//GEN-LAST:event_actualizar_btnActionPerformed

    private void sueldo_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sueldo_aKeyTyped
        Validador.validarPrecio(sueldo_a, evt);
    }//GEN-LAST:event_sueldo_aKeyTyped

    private void id_emp_eliminarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_emp_eliminarKeyTyped
        Validador.validarNumero(evt);
        if(id_emp_eliminar.getText().length()==6)
            evt.consume();
    }//GEN-LAST:event_id_emp_eliminarKeyTyped

    private void id_emp_eliminarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_emp_eliminarKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         if(!id_emp_eliminar.getText().equals("")){
           e.setID(Integer.parseInt(id_emp_eliminar.getText()));
           e.eliminarEmpleado();
         }
         id_emp_eliminar.setText(null);
         id_emp_eliminar.requestFocus();
        }
    }//GEN-LAST:event_id_emp_eliminarKeyPressed

    private void eliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_btnActionPerformed
        if(!id_emp_eliminar.getText().equals("")){
           e.setID(Integer.parseInt(id_emp_eliminar.getText()));
           e.eliminarEmpleado();
         }
        id_emp_eliminar.setText(null);
        id_emp_eliminar.requestFocus();
    }//GEN-LAST:event_eliminar_btnActionPerformed

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        limpiarCamposRegistro();
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        dispose();
    }//GEN-LAST:event_salir_btnActionPerformed

    private void cancelarAct_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarAct_btnActionPerformed
        limpiarCamposActualizacion();
    }//GEN-LAST:event_cancelarAct_btnActionPerformed

    private void salirAct_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirAct_btnActionPerformed
        dispose();
    }//GEN-LAST:event_salirAct_btnActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        e.desconectar();
        e = null;
    }//GEN-LAST:event_formWindowClosed

    private void telefono_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_aKeyTyped
        Validador.validarNumero(evt);
        if(telefono_a.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_telefono_aKeyTyped

    private void nombre_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_aKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_nombre_aKeyTyped

    private void rfc_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rfc_aKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_rfc_aKeyTyped

    private void direccion_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_direccion_aKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_direccion_aKeyTyped

    private void fecha_ingreso_aKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fecha_ingreso_aKeyTyped
        if(fecha_ingreso_a.getText().length()==10)
            evt.consume();
    }//GEN-LAST:event_fecha_ingreso_aKeyTyped

    private void fecha_ingreso_aFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_ingreso_aFocusLost
        if(!Validador.validarFecha(fecha_ingreso_a.getText()))
            JOptionPane.showMessageDialog(null, "El formato de fecha ingresado no es válido...!", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_fecha_ingreso_aFocusLost

    private void fecha_ingresoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fecha_ingresoFocusLost
        if(!Validador.validarFecha(fecha_ingreso.getText()))
            JOptionPane.showMessageDialog(null, "El formato de fecha ingresado no es válido...!", "Atención", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_fecha_ingresoFocusLost

    private void buscar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_btnActionPerformed
        buscarEmpleado();
    }//GEN-LAST:event_buscar_btnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_btn;
    private javax.swing.JButton buscar_btn;
    private javax.swing.JButton cancelarAct_btn;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField direccion_a;
    private javax.swing.JButton eliminar_btn;
    private javax.swing.JTextField fecha_ingreso;
    private javax.swing.JTextField fecha_ingreso_a;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JTextField id_emp_eliminar;
    private javax.swing.JTextField id_empleado;
    private javax.swing.JTextField id_empleado_a;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField nombre_a;
    public static javax.swing.JTabbedPane panel;
    private javax.swing.JTextField rfc;
    private javax.swing.JTextField rfc_a;
    private javax.swing.JButton salirAct_btn;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField sueldo;
    private javax.swing.JTextField sueldo_a;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefono_a;
    // End of variables declaration//GEN-END:variables

    boolean validarCampos(){
      if(!nombre.getText().equals("") &
          !direccion.getText().equals("") &
              !rfc.getText().equals("") &
              !telefono.getText().equals("") &
              !fecha_ingreso.getText().equals("") &
              !sueldo.getText().equals("")
          )
          return true;
      else
          return false;
    }
    
    boolean validarCamposAct(){
      if(!nombre_a.getText().equals("") &
          !direccion_a.getText().equals("") &
              !rfc_a.getText().equals("") &
              !telefono_a.getText().equals("") &
              !fecha_ingreso_a.getText().equals("") &
              !sueldo_a.getText().equals("")
          )
          return true;
      else
          return false;
    }

    private void actualizarEmpleado() {
        e.setNombre(nombre_a.getText());
        e.setDireccion(direccion_a.getText());
        e.setRFC(rfc_a.getText());
        e.setTelefono(telefono_a.getText());
        e.setFechaIngreso(fecha_ingreso_a.getText());
        e.setSueldo(Double.parseDouble(sueldo_a.getText()));
        if(e.actualizarEmpleado())
          limpiarCamposActualizacion();
    }
    private void limpiarCamposActualizacion(){
              nombre_a.setText(null);
               direccion_a.setText(null);
               rfc_a.setText(null);
               telefono_a.setText(null);
               fecha_ingreso_a.setText(null);
               sueldo_a.setText(null);
               id_empleado_a.setText(null);
               id_empleado_a.requestFocus();
    }
    
    private void limpiarCamposRegistro(){
               nombre.setText(null);
               direccion.setText(null);
               rfc.setText(null);
               telefono.setText(null);
               fecha_ingreso.setText(null);
               sueldo.setText(null);
               id_empleado.setText(""+(Integer.parseInt(id_empleado.getText())+1));
               nombre.requestFocus();
    }

    private void registrarEmpleado() {
        e.setNombre(nombre.getText());
        e.setDireccion(direccion.getText());
        e.setRFC(rfc.getText());
        e.setTelefono(telefono.getText());
        e.setFechaIngreso(fecha_ingreso.getText());
        e.setSueldo(Double.parseDouble(sueldo.getText()));
         if(e.registrarEmpleado())
           limpiarCamposRegistro();
    }

    private void buscarEmpleado() {
        if(!id_empleado_a.getText().equals("")){
               e.setID(Integer.parseInt(id_empleado_a.getText()));
             if(e.buscarEmpleadoPorID()){
               nombre_a.setText(e.getNombre());
               direccion_a.setText(e.getDireccion());
               rfc_a.setText(e.getRFC());
               telefono_a.setText(e.getTelefono());
               fecha_ingreso_a.setText(e.getFechaIngreso());
               sueldo_a.setText(""+e.getSueldoBase());
             }else
                 limpiarCamposActualizacion();
           }
    }
    
}
