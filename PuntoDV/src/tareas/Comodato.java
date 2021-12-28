/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Comodato.java
 *
 * Created on 12/07/2011, 02:39:58 PM
 */
package tareas;

import controladores.Cliente;
import controladores.Fecha;
import controladores.Mobiliario;
import controladores.RecursosPC;
import controladores.Validador;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

/**
 *
 * @author USUARIO
 */
public class Comodato extends javax.swing.JFrame implements KeyListener{

    Cliente cliente;
    private Mobiliario mobiliario;
    DefaultTableModel modelo_tabla;
    controladores.Comodato comodato;
    int cant_tot=0;
    private JTextComponent editor_cliente, editor_mobiliario;
    
    public Comodato(){
        initComponents();
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        cliente = new Cliente();
        mobiliario = new Mobiliario();
        mobiliario.setComboBox(combomob);
        modelo_tabla = (DefaultTableModel) tabla_mobiliario.getModel();
        comodato = new controladores.Comodato();
        editor_cliente = (JTextComponent) nom_cliente.getEditor().getEditorComponent();
        editor_mobiliario = (JTextComponent) combomob.getEditor().getEditorComponent();
        editor_mobiliario.addKeyListener(new SearchingMob());
        editor_cliente.addKeyListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        no_comodato = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nom_cliente = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rfc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        nom_negocio = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        id_mobiliario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combomob = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_mobiliario = new javax.swing.JTable();
        guardar_btn = new javax.swing.JButton();
        cancelar_btn = new javax.swing.JButton();
        salir_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        observaciones = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        fecha = new javax.swing.JTextField();
        LabelSalidas = new javax.swing.JLabel();
        total_mobs = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        serie = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Registro de comodatos");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("No. de comodato:");

        no_comodato.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                no_comodatoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                no_comodatoFocusLost(evt);
            }
        });
        no_comodato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                no_comodatoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                no_comodatoKeyTyped(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cliente"));

        jLabel2.setText("ID Cliente:");

        id_cliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_cliente.setToolTipText("Ingrese ID del cliente");
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

        jLabel3.setText("Nombre:");

        nom_cliente.setEditable(true);
        nom_cliente.setFont(new java.awt.Font("Tahoma", 1, 11));
        nom_cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nom_cliente.setKeySelectionManager(null);

        jLabel13.setText("Dirección:");

        direccion.setBackground(new java.awt.Color(204, 204, 204));
        direccion.setEditable(false);

        jLabel14.setText("RFC:");

        rfc.setBackground(new java.awt.Color(204, 204, 204));
        rfc.setEditable(false);

        jLabel15.setText("Teléfono:");

        telefono.setBackground(new java.awt.Color(204, 204, 204));
        telefono.setEditable(false);

        nom_negocio.setText("Negocio");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel2)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_negocio, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(direccion, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nom_cliente, 0, 306, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_negocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("ID:");

        id_mobiliario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_mobiliario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                id_mobiliarioFocusLost(evt);
            }
        });
        id_mobiliario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                id_mobiliarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_mobiliarioKeyTyped(evt);
            }
        });

        jLabel5.setText("Descripción:");

        combomob.setEditable(true);

        jLabel6.setText("Cant.");

        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        tabla_mobiliario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Cant.", "Descripción", "Serie", "Modelo", "Marca", "Logo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_mobiliario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tabla_mobiliarioKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_mobiliario);
        tabla_mobiliario.getColumnModel().getColumn(0).setPreferredWidth(50);
        tabla_mobiliario.getColumnModel().getColumn(2).setPreferredWidth(250);
        tabla_mobiliario.getColumnModel().getColumn(3).setPreferredWidth(150);

        guardar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/down.png"))); // NOI18N
        guardar_btn.setText("Registrar");
        guardar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardar_btnActionPerformed(evt);
            }
        });

        cancelar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cancela.png"))); // NOI18N
        cancelar_btn.setText("Cancelar");
        cancelar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelar_btnActionPerformed(evt);
            }
        });

        salir_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salte.png"))); // NOI18N
        salir_btn.setText("Salir");
        salir_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salir_btnActionPerformed(evt);
            }
        });

        observaciones.setBorder(javax.swing.BorderFactory.createTitledBorder("Observaciones"));
        observaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                observacionesKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(observaciones);

        jLabel7.setText("Fecha I/F:");

        fecha.setFont(new java.awt.Font("Tahoma", 1, 11));
        fecha.setForeground(new java.awt.Color(0, 153, 51));
        fecha.setToolTipText("Elaboración/Cancelación");
        fecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fechaFocusLost(evt);
            }
        });
        fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fechaKeyTyped(evt);
            }
        });

        LabelSalidas.setText("Total:");

        total_mobs.setFont(new java.awt.Font("Tahoma", 1, 12));
        total_mobs.setText("0");

        jLabel8.setText("Serie:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(id_mobiliario, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(combomob, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serie, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(no_comodato, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelSalidas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(total_mobs, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(guardar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cancelar_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(salir_btn)))
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(no_comodato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(id_mobiliario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combomob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(serie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelSalidas)
                    .addComponent(total_mobs, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(guardar_btn)
                        .addComponent(cancelar_btn)
                        .addComponent(salir_btn)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_clienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_clienteFocusGained
        id_cliente.selectAll();
}//GEN-LAST:event_id_clienteFocusGained

    private void id_clienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_clienteFocusLost
        buscarCliente();
}//GEN-LAST:event_id_clienteFocusLost

    private void id_clienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){ //evento de Enter
            id_mobiliario.requestFocus();
        }
}//GEN-LAST:event_id_clienteKeyPressed

    private void id_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyTyped
        Validador.validarNumero(evt);
        if(id_cliente.getText().length()==6)
          evt.consume();
}//GEN-LAST:event_id_clienteKeyTyped

    private void fechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fechaFocusLost
      if(!Validador.validarFecha(fecha.getText())){
            JOptionPane.showMessageDialog(null, "El formato de fecha ingresado no es válido...", "¡Atención", JOptionPane.ERROR_MESSAGE);
            fecha.requestFocus();
      }
}//GEN-LAST:event_fechaFocusLost

    private void fechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fechaKeyTyped
        if(fecha.getText().length()==10)
            evt.consume();
}//GEN-LAST:event_fechaKeyTyped

    private void no_comodatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_comodatoKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_no_comodatoKeyTyped

    private void id_mobiliarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_mobiliarioKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_id_mobiliarioKeyTyped

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        Validador.validarNumero(evt);
    }//GEN-LAST:event_cantidadKeyTyped

    private void nom_negocioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nom_negocioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            cliente.setNegocio(nom_negocio.getText());
            if(cliente.buscarClientePorNegocio()){
                mostrarCliente();
                id_mobiliario.requestFocus();
            }else
                limpiarCamposCliente();
        }
}//GEN-LAST:event_nom_negocioKeyPressed

    private void id_mobiliarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_mobiliarioFocusLost
       if(!id_mobiliario.getText().equals("")){
        mobiliario.setIdMobilario(Integer.parseInt(id_mobiliario.getText()));
        combomob.removeAllItems();
        if(mobiliario.buscarPorID()){
          combomob.addItem(mobiliario.getDescripcion()+mobiliario.getModelo()+mobiliario.getMarca()+mobiliario.getLogo());
        }else{
          combomob.requestFocus();  
        }
       }
    }//GEN-LAST:event_id_mobiliarioFocusLost

    private void id_mobiliarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_mobiliarioKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            cantidad.requestFocus();
    }//GEN-LAST:event_id_mobiliarioKeyPressed

    private void cantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER)
       if(!cantidad.getText().equals("")){
        if(!id_mobiliario.getText().equals("")){
          if(!serie.getText().equals("")){
           cargarEnTabla();
           id_mobiliario.requestFocus();
          }
        }
      }
    }//GEN-LAST:event_cantidadKeyPressed

    private void guardar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardar_btnActionPerformed
        registrar();
    }//GEN-LAST:event_guardar_btnActionPerformed

    private void cancelar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelar_btnActionPerformed
        limpiarTodo();
        no_comodato.requestFocus();
        guardar_btn.setText("Registrar");
    }//GEN-LAST:event_cancelar_btnActionPerformed

    private void salir_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salir_btnActionPerformed
        dispose();        
    }//GEN-LAST:event_salir_btnActionPerformed

    private void tabla_mobiliarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tabla_mobiliarioKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DELETE){
            cant_tot-=Integer.parseInt(tabla_mobiliario.getValueAt(tabla_mobiliario.getSelectedRow(), 1).toString());
          modelo_tabla.removeRow(tabla_mobiliario.getSelectedRow());
          total_mobs.setText(""+cant_tot);
          id_mobiliario.requestFocus();
          tabla_mobiliario.clearSelection();
        }
    }//GEN-LAST:event_tabla_mobiliarioKeyReleased

    private void no_comodatoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_no_comodatoFocusLost
        if(!no_comodato.getText().equals("")){
          comodato.setNumComodato(Integer.parseInt(no_comodato.getText()));
          limpiarTodo();          
           if(comodato.buscar(modelo_tabla)){
              fecha.setText(comodato.getFechaElaboracion());
              id_cliente.setText(""+comodato.getIdCliente());
              id_cliente.requestFocus();              
              id_mobiliario.requestFocus();
              observaciones.setText(comodato.getObservaciones());              
              if(comodato.getFechaCancelacion().equals("1111-11-11")||comodato.getFechaCancelacion().equals("11-11-1111"))
                guardar_btn.setText("Concluir");
              else
                guardar_btn.setText("Eliminar");
           }else{               
               if(guardar_btn.getText().equals("Concluir"))
                 guardar_btn.setText("Registrar");               
           }
        }
    }//GEN-LAST:event_no_comodatoFocusLost

    private void no_comodatoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no_comodatoKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            id_cliente.requestFocus();
    }//GEN-LAST:event_no_comodatoKeyPressed

    private void observacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_observacionesKeyTyped
        Validador.validarCadena(evt);
    }//GEN-LAST:event_observacionesKeyTyped

    private void no_comodatoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_no_comodatoFocusGained
        no_comodato.selectAll();
    }//GEN-LAST:event_no_comodatoFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        fecha.setText(Fecha.getFechaHoy());
    }//GEN-LAST:event_formWindowOpened

    private void nom_negocioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nom_negocioFocusGained
        nom_negocio.selectAll();
    }//GEN-LAST:event_nom_negocioFocusGained

  private void registrar(){
     if(guardar_btn.getText().equals("Registrar")){ //registrar el comodato
      if(!no_comodato.getText().equals("") & 
              !id_cliente.getText().equals("") & 
              tabla_mobiliario.getRowCount()>0){
        if(observaciones.getText().equals(""))
          observaciones.setText("Hr.("+Fecha.getHora()+")");
        comodato.setNumComodato(Integer.parseInt(no_comodato.getText()));
        comodato.setIdCliente(Integer.parseInt(id_cliente.getText()));
        comodato.setCantidadTotal(cant_tot);
        comodato.setFechaElaboracion(fecha.getText());
        comodato.setFechaCancelacion("11-11-1111");
        comodato.setObservaciones(observaciones.getText());
        if(comodato.registrar(tabla_mobiliario)){
          limpiarTodo();
        }
      }else
          JOptionPane.showMessageDialog(this,"Hay campos vacios","Atención!",JOptionPane.INFORMATION_MESSAGE);
    }else if(guardar_btn.getText().equals("Concluir")){ //terminar contrato de comodato
        if(JOptionPane.showConfirmDialog(this, "Finalizando comodato en fecha:"+fecha.getText(),"¡Atención!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE)==JOptionPane.YES_OPTION) {
          comodato.setFechaCancelacion(fecha.getText()); 
          comodato.finalizarContrato();
          limpiarTodo();
          guardar_btn.setText("Registrar");
        }
    }else{ //eliminar definitivamente de la BD
       if(JOptionPane.showConfirmDialog(this, "¿Eliminará este comodato definitivamente?","¡Atención!",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE)==JOptionPane.YES_OPTION) {
          if(comodato.eliminar())
            JOptionPane.showMessageDialog(null,"Acción completada correctamente","¡Atención!",JOptionPane.INFORMATION_MESSAGE);          
          limpiarTodo();
          guardar_btn.setText("Registrar");
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
       id_mobiliario.requestFocus();
    }
    void limpiarCamposCliente(){
       id_cliente.setText(null); 
       nom_cliente.removeAllItems();
       direccion.setText(null);
       rfc.setText(null);
       telefono.setText(null);
       nom_negocio.setText(null);
    }
    
    private void limpiarBusquedaMob(){
      id_mobiliario.setText(null);
      combomob.removeAllItems();
      cantidad.setText(null);
    }
    
    int n_filas;
    public void cargarEnTabla(){
        cant_tot+=Integer.parseInt(cantidad.getText());
      modelo_tabla.addRow(new Object[1]);
      n_filas = tabla_mobiliario.getRowCount()-1;      
      tabla_mobiliario.setValueAt(mobiliario.getIdMobiliario(), n_filas, 0); //codigo
      tabla_mobiliario.setValueAt(cantidad.getText(), n_filas, 1); //cantidad
      tabla_mobiliario.setValueAt(mobiliario.getDescripcion(), n_filas, 2); //descripcion
      tabla_mobiliario.setValueAt(mobiliario.getModelo(), n_filas, 3); //modelo
      tabla_mobiliario.setValueAt(serie.getText(), n_filas, 4); //serie
      tabla_mobiliario.setValueAt(mobiliario.getMarca(), n_filas, 5); //marca
      tabla_mobiliario.setValueAt(mobiliario.getLogo(), n_filas, 6); //logo
       total_mobs.setText(""+cant_tot); //cantidad total
      limpiarBusquedaMob();
    }
    
    void limpiarTodo(){
      for(n_filas=tabla_mobiliario.getRowCount()-1; n_filas>=0; n_filas--){
        modelo_tabla.removeRow(n_filas);
      }
      observaciones.setText(null);
      limpiarBusquedaMob();
      limpiarCamposCliente();  
      cant_tot=0;
      total_mobs.setText("0");
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
    
    void mostrarComodato(){
    
    }
    void cancelarComodato(){
      
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelSalidas;
    private javax.swing.JButton cancelar_btn;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox combomob;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField fecha;
    private javax.swing.JButton guardar_btn;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JTextField id_mobiliario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField no_comodato;
    private javax.swing.JComboBox nom_cliente;
    private javax.swing.JTextField nom_negocio;
    private javax.swing.JTextPane observaciones;
    private javax.swing.JTextField rfc;
    private javax.swing.JButton salir_btn;
    private javax.swing.JTextField serie;
    private javax.swing.JTable tabla_mobiliario;
    private javax.swing.JTextField telefono;
    private javax.swing.JLabel total_mobs;
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
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }    
    
    class SearchingMob implements KeyListener{
   
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
          if(!editor_mobiliario.getText().equals("")){             
             mobiliario.setDescripcion(editor_mobiliario.getText().trim());             
             mobiliario.buscarMobiliarioPorDescripcion();
             if(combomob.getItemCount()>1)               
                 editor_mobiliario.setText(mobiliario.getDescripcion()); //le reasignamos el texto si queremos seguir consultando
          }
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){            
            mobiliario.setSelectedMob(combomob.getSelectedIndex());
            mobiliario.buscarPorID();            
            id_mobiliario.setText(""+mobiliario.getIdMobiliario());            
            cantidad.requestFocus();
        }
    }

        @Override
    public void keyReleased(KeyEvent e) {

    }

   }//fin clase interna
    
}
