/*
 * WPrincipal.java
 * Created on 5/05/2011, 02:26:56 PM
 */
package tareas;

import altas.*;
//import com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel;
import controladores.Articulo;
import controladores.Cliente;
import controladores.Impuestos;
import controladores.RecursosPC;
import controladores.Respaldos;
import controladores.Validador;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import reportes.Intervalo;
import reportes.ReportesClass;

/**
 *
 * @author Jesus Malo
 */
public class Principal extends javax.swing.JFrame{    
    
    ReportesClass r;
    Intervalo i;
    private SeleccionRuta seleccion_ruta;
    Articulo nuevo_articulo;    
    javax.swing.text.JTextComponent editor_articulo;
    
    @SuppressWarnings("LeakingThisInConstructor")
    public Principal() {
        initComponents();
        try{             
             //UIManager.setLookAndFeel(new NimbusLookAndFeel());
            //UIManager.setLookAndFeel(new LiquidLookAndFeel());
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
             SwingUtilities.updateComponentTreeUI(this);
          }catch(Exception e){ }
        setLocation((int)RecursosPC.getAncho()/2-getWidth()/2, (int)RecursosPC.getAlto()/2-getHeight()/2);
        new Impuestos().getTasaIVA();
      r = new ReportesClass(this);
      i = new Intervalo(this,true,r);
      nuevo_articulo = new Articulo();
      nuevo_articulo.setComboBox(articulo);
      editor_articulo = (JTextComponent) articulo.getEditor().getEditorComponent();
      editor_articulo.addKeyListener(new SearchingArt());
      seleccion_ruta = new SeleccionRuta(this,true,r,i);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        arts = new javax.swing.JButton();
        clients = new javax.swing.JButton();
        conf = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        compras = new javax.swing.JButton();
        ventas = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        nots = new javax.swing.JButton();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        id_articulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        articulo = new javax.swing.JComboBox();
        precio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivo = new javax.swing.JMenu();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        salir = new javax.swing.JMenuItem();
        altas_ajustes = new javax.swing.JMenu();
        articulos = new javax.swing.JMenu();
        articulos_agregar = new javax.swing.JMenuItem();
        articulos_modificar = new javax.swing.JMenuItem();
        articulos_eliminar = new javax.swing.JMenuItem();
        mobiliario = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        clientes = new javax.swing.JMenu();
        clientes_agregar = new javax.swing.JMenuItem();
        clientes_actualizar = new javax.swing.JMenuItem();
        clientes_eliminar = new javax.swing.JMenuItem();
        dia_visitas = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        trabajadores = new javax.swing.JMenu();
        trabajadores_agregar = new javax.swing.JMenuItem();
        trabajadores_actualizar = new javax.swing.JMenuItem();
        trabajadores_eliminar = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        configs = new javax.swing.JMenuItem();
        entradas_salidas = new javax.swing.JMenu();
        es_compras = new javax.swing.JMenuItem();
        es_inventario = new javax.swing.JMenu();
        es_inventario_salidas = new javax.swing.JMenuItem();
        es_inventario_devoluciones = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        inventario = new javax.swing.JMenuItem();
        formatos = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        notas = new javax.swing.JMenuItem();
        f_liquidacion = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        estatus = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        f_registrar = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        comodato = new javax.swing.JMenuItem();
        Reportes = new javax.swing.JMenu();
        r_inv = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu9 = new javax.swing.JMenu();
        r_compras = new javax.swing.JMenuItem();
        r_compras_detallado = new javax.swing.JMenuItem();
        r_salidas = new javax.swing.JMenu();
        r_ventadeldia = new javax.swing.JMenu();
        r_ventas_totales = new javax.swing.JMenuItem();
        r_venta_global = new javax.swing.JMenuItem();
        r_venta_del_dia = new javax.swing.JMenuItem();
        r_ventadeldia_rutas = new javax.swing.JMenuItem();
        productos_vendidos = new javax.swing.JMenu();
        r_ventadeldia_prodsvends = new javax.swing.JMenuItem();
        productos_vendidos_x_ruta = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        r_merma = new javax.swing.JMenuItem();
        r_merma_detallado = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        r_mas_vend = new javax.swing.JMenuItem();
        r_utilidades = new javax.swing.JMenuItem();
        r_men_vend = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        r_notas = new javax.swing.JMenu();
        r_notas_consultar = new javax.swing.JMenuItem();
        r_preventa = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        r_notas_general = new javax.swing.JMenuItem();
        r_notas_detallada = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        notas_clientes = new javax.swing.JMenu();
        r_nota_x_cliente = new javax.swing.JMenuItem();
        r_cliente_prods = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        r_clientes_frecuentes = new javax.swing.JMenuItem();
        notas_rutas = new javax.swing.JMenu();
        r_n_r_global = new javax.swing.JMenuItem();
        r_n_r_detallado = new javax.swing.JMenuItem();
        n_r_productos_vendidos = new javax.swing.JMenuItem();
        notas_region = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        r_facturas_busqueda = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        r_vale_carga = new javax.swing.JMenuItem();
        r_catalogo_rutas = new javax.swing.JMenuItem();
        r_comodatos = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        r_clientes = new javax.swing.JMenu();
        r_clientes_deudores = new javax.swing.JMenuItem();
        r_clientes_historial = new javax.swing.JMenuItem();
        r_cliente_catalogo = new javax.swing.JMenuItem();
        r_trabajadores = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        r_devoluciones = new javax.swing.JMenuItem();
        r_caducidad = new javax.swing.JMenuItem();
        respaldos = new javax.swing.JMenu();
        respaldar = new javax.swing.JMenuItem();
        restaurar = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        reiniciar = new javax.swing.JMenuItem();
        acerca_de = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de punto de ventas y control de clientes");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jToolBar1.setRollover(true);
        jToolBar1.setEnabled(false);

        arts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/articulo.png"))); // NOI18N
        arts.setToolTipText("Articulos");
        arts.setFocusable(false);
        arts.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        arts.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        arts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                artsActionPerformed(evt);
            }
        });
        jToolBar1.add(arts);

        clients.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cliente.png"))); // NOI18N
        clients.setToolTipText("Clientes");
        clients.setFocusable(false);
        clients.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clients.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientsActionPerformed(evt);
            }
        });
        jToolBar1.add(clients);

        conf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/detalles.png"))); // NOI18N
        conf.setToolTipText("Ajustes");
        conf.setFocusable(false);
        conf.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        conf.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        conf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confActionPerformed(evt);
            }
        });
        jToolBar1.add(conf);

        jToolBar2.setRollover(true);
        jToolBar2.setEnabled(false);

        compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compras.png"))); // NOI18N
        compras.setToolTipText("Compras");
        compras.setFocusable(false);
        compras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        compras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprasActionPerformed(evt);
            }
        });
        jToolBar2.add(compras);

        ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ventas.png"))); // NOI18N
        ventas.setToolTipText("Ventas");
        ventas.setFocusable(false);
        ventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventasActionPerformed(evt);
            }
        });
        jToolBar2.add(ventas);

        jToolBar3.setRollover(true);
        jToolBar3.setEnabled(false);

        nots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notas.png"))); // NOI18N
        nots.setToolTipText("Notas");
        nots.setFocusable(false);
        nots.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nots.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        nots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notsActionPerformed(evt);
            }
        });
        jToolBar3.add(nots);

        jInternalFrame1.setResizable(true);
        jInternalFrame1.setTitle("Checador de precios");
        jInternalFrame1.setToolTipText("Consulte precio de los artículos");
        jInternalFrame1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jInternalFrame1.setPreferredSize(new java.awt.Dimension(501, 451));
        jInternalFrame1.setVisible(true);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel1.setText("Código:");

        id_articulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        id_articulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_articulo.setPreferredSize(new java.awt.Dimension(7, 25));
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

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setText("Artículo:");

        articulo.setBackground(new java.awt.Color(204, 204, 204));
        articulo.setEditable(true);
        articulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        articulo.setPreferredSize(new java.awt.Dimension(126, 25));
        articulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                articuloKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                articuloKeyTyped(evt);
            }
        });

        precio.setFont(new java.awt.Font("Stencil", 0, 80)); // NOI18N
        precio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        precio.setText("$000.00");
        precio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(183, 183, 183))
                            .addComponent(articulo, 0, 416, Short.MAX_VALUE)))
                    .addComponent(precio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(id_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jMenuBar1.setPreferredSize(new java.awt.Dimension(472, 40));

        archivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/archivo.png"))); // NOI18N
        archivo.setMnemonic('a');
        archivo.setText("ARCHIVO");
        archivo.setMinimumSize(new java.awt.Dimension(80, 20));
        archivo.setPreferredSize(new java.awt.Dimension(120, 20));
        archivo.add(jSeparator17);

        salir.setBackground(new java.awt.Color(204, 204, 204));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/system-log-out.png"))); // NOI18N
        salir.setText("Salir");
        salir.setPreferredSize(new java.awt.Dimension(117, 30));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        archivo.add(salir);

        jMenuBar1.add(archivo);

        altas_ajustes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        altas_ajustes.setMnemonic('t');
        altas_ajustes.setText("ALTAS Y AJUSTES");
        altas_ajustes.setPreferredSize(new java.awt.Dimension(160, 20));

        articulos.setBackground(new java.awt.Color(204, 204, 204));
        articulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/articulo.png"))); // NOI18N
        articulos.setText("Articulos");
        articulos.setPreferredSize(new java.awt.Dimension(120, 30));
        articulos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                articulosMouseClicked(evt);
            }
        });

        articulos_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        articulos_agregar.setText("Agregar");
        articulos_agregar.setPreferredSize(new java.awt.Dimension(135, 25));
        articulos_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articulos_agregarActionPerformed(evt);
            }
        });
        articulos.add(articulos_agregar);

        articulos_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        articulos_modificar.setText("Modificar");
        articulos_modificar.setPreferredSize(new java.awt.Dimension(135, 25));
        articulos_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articulos_modificarActionPerformed(evt);
            }
        });
        articulos.add(articulos_modificar);

        articulos_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        articulos_eliminar.setText("Eliminar");
        articulos_eliminar.setPreferredSize(new java.awt.Dimension(135, 25));
        articulos_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                articulos_eliminarActionPerformed(evt);
            }
        });
        articulos.add(articulos_eliminar);

        altas_ajustes.add(articulos);

        mobiliario.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        mobiliario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/mobiliario.png"))); // NOI18N
        mobiliario.setText("Mobiliario");
        mobiliario.setEnabled(false);
        mobiliario.setPreferredSize(new java.awt.Dimension(120, 30));
        mobiliario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobiliarioActionPerformed(evt);
            }
        });
        altas_ajustes.add(mobiliario);
        altas_ajustes.add(jSeparator4);

        clientes.setBackground(new java.awt.Color(204, 204, 204));
        clientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cliente.png"))); // NOI18N
        clientes.setText("Clientes");
        clientes.setPreferredSize(new java.awt.Dimension(120, 30));
        clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesMouseClicked(evt);
            }
        });

        clientes_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        clientes_agregar.setText("Agregar");
        clientes_agregar.setPreferredSize(new java.awt.Dimension(133, 25));
        clientes_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientes_agregarActionPerformed(evt);
            }
        });
        clientes.add(clientes_agregar);

        clientes_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        clientes_actualizar.setText("Actualizar");
        clientes_actualizar.setPreferredSize(new java.awt.Dimension(133, 25));
        clientes_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientes_actualizarActionPerformed(evt);
            }
        });
        clientes.add(clientes_actualizar);

        clientes_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        clientes_eliminar.setText("Eliminar");
        clientes_eliminar.setPreferredSize(new java.awt.Dimension(133, 25));
        clientes_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientes_eliminarActionPerformed(evt);
            }
        });
        clientes.add(clientes_eliminar);

        dia_visitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/frecuente.png"))); // NOI18N
        dia_visitas.setText("Día de visita");
        dia_visitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia_visitasActionPerformed(evt);
            }
        });
        clientes.add(dia_visitas);

        altas_ajustes.add(clientes);
        altas_ajustes.add(jSeparator5);

        trabajadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/empleado.png"))); // NOI18N
        trabajadores.setText("Empleados");
        trabajadores.setPreferredSize(new java.awt.Dimension(120, 30));
        trabajadores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trabajadoresMouseClicked(evt);
            }
        });

        trabajadores_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        trabajadores_agregar.setText("Alta");
        trabajadores_agregar.setPreferredSize(new java.awt.Dimension(135, 25));
        trabajadores_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadores_agregarActionPerformed(evt);
            }
        });
        trabajadores.add(trabajadores_agregar);

        trabajadores_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update.png"))); // NOI18N
        trabajadores_actualizar.setText("Modificación");
        trabajadores_actualizar.setPreferredSize(new java.awt.Dimension(113, 25));
        trabajadores_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadores_actualizarActionPerformed(evt);
            }
        });
        trabajadores.add(trabajadores_actualizar);

        trabajadores_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        trabajadores_eliminar.setText("Baja");
        trabajadores_eliminar.setPreferredSize(new java.awt.Dimension(113, 25));
        trabajadores_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trabajadores_eliminarActionPerformed(evt);
            }
        });
        trabajadores.add(trabajadores_eliminar);

        altas_ajustes.add(trabajadores);
        altas_ajustes.add(jSeparator6);

        configs.setBackground(new java.awt.Color(204, 204, 204));
        configs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/detalles.png"))); // NOI18N
        configs.setText("Configuraciones");
        configs.setPreferredSize(new java.awt.Dimension(150, 30));
        configs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                configsActionPerformed(evt);
            }
        });
        altas_ajustes.add(configs);

        jMenuBar1.add(altas_ajustes);

        entradas_salidas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/e_s.png"))); // NOI18N
        entradas_salidas.setMnemonic('s');
        entradas_salidas.setLabel("ENTRADAS / SALIDAS");
        entradas_salidas.setPreferredSize(new java.awt.Dimension(180, 20));

        es_compras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/compras.png"))); // NOI18N
        es_compras.setText("Compras");
        es_compras.setToolTipText("Agregue productos a su inventario");
        es_compras.setPreferredSize(new java.awt.Dimension(150, 30));
        es_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                es_comprasActionPerformed(evt);
            }
        });
        entradas_salidas.add(es_compras);

        es_inventario.setBackground(new java.awt.Color(204, 204, 204));
        es_inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ventas.png"))); // NOI18N
        es_inventario.setText("Ventas");
        es_inventario.setToolTipText("Inicie sus ventas");
        es_inventario.setPreferredSize(new java.awt.Dimension(150, 30));
        es_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                es_inventarioMouseClicked(evt);
            }
        });

        es_inventario_salidas.setText("Salidas");
        es_inventario_salidas.setPreferredSize(new java.awt.Dimension(113, 25));
        es_inventario_salidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                es_inventario_salidasActionPerformed(evt);
            }
        });
        es_inventario.add(es_inventario_salidas);

        es_inventario_devoluciones.setText("Devoluciones");
        es_inventario_devoluciones.setPreferredSize(new java.awt.Dimension(113, 25));
        es_inventario_devoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                es_inventario_devolucionesActionPerformed(evt);
            }
        });
        es_inventario.add(es_inventario_devoluciones);

        entradas_salidas.add(es_inventario);
        entradas_salidas.add(jSeparator7);

        inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/inventario.png"))); // NOI18N
        inventario.setText("Inventario");
        inventario.setPreferredSize(new java.awt.Dimension(150, 30));
        inventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventarioActionPerformed(evt);
            }
        });
        entradas_salidas.add(inventario);

        jMenuBar1.add(entradas_salidas);

        formatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/formats.png"))); // NOI18N
        formatos.setMnemonic('f');
        formatos.setText("FORMATOS");
        formatos.setPreferredSize(new java.awt.Dimension(130, 20));

        jMenu10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/notas.png"))); // NOI18N
        jMenu10.setText("Notas");
        jMenu10.setPreferredSize(new java.awt.Dimension(150, 30));

        notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        notas.setText("Registrar");
        notas.setPreferredSize(new java.awt.Dimension(120, 21));
        notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notasActionPerformed(evt);
            }
        });
        jMenu10.add(notas);

        f_liquidacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        f_liquidacion.setText("Liquidar");
        f_liquidacion.setPreferredSize(new java.awt.Dimension(100, 21));
        f_liquidacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_liquidacionActionPerformed(evt);
            }
        });
        jMenu10.add(f_liquidacion);
        jMenu10.add(jSeparator14);

        estatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/estatus.png"))); // NOI18N
        estatus.setText("Estatus");
        estatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estatusActionPerformed(evt);
            }
        });
        jMenu10.add(estatus);

        formatos.add(jMenu10);

        jMenu5.setBackground(new java.awt.Color(204, 204, 204));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/facturas.png"))); // NOI18N
        jMenu5.setText("Facturas");
        jMenu5.setPreferredSize(new java.awt.Dimension(150, 30));

        f_registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/add.png"))); // NOI18N
        f_registrar.setText("Registrar");
        f_registrar.setPreferredSize(new java.awt.Dimension(87, 21));
        f_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_registrarActionPerformed(evt);
            }
        });
        jMenu5.add(f_registrar);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/remove.png"))); // NOI18N
        jMenuItem3.setText("Cancelar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem3);

        formatos.add(jMenu5);
        formatos.add(jSeparator9);

        comodato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/comodat.png"))); // NOI18N
        comodato.setText("Comodatos");
        comodato.setEnabled(false);
        comodato.setPreferredSize(new java.awt.Dimension(150, 30));
        comodato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comodatoActionPerformed(evt);
            }
        });
        formatos.add(comodato);

        jMenuBar1.add(formatos);

        Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/report.png"))); // NOI18N
        Reportes.setMnemonic('r');
        Reportes.setText("REPORTES");
        Reportes.setPreferredSize(new java.awt.Dimension(130, 20));

        r_inv.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_inv.setText("Inventario");
        r_inv.setPreferredSize(new java.awt.Dimension(150, 25));
        r_inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_invActionPerformed(evt);
            }
        });
        Reportes.add(r_inv);
        Reportes.add(jSeparator1);

        jMenu9.setBackground(new java.awt.Color(204, 204, 204));
        jMenu9.setText("Entradas");
        jMenu9.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jMenu9.setPreferredSize(new java.awt.Dimension(117, 25));

        r_compras.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_compras.setText("General");
        r_compras.setPreferredSize(new java.awt.Dimension(117, 25));
        r_compras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_comprasActionPerformed(evt);
            }
        });
        jMenu9.add(r_compras);

        r_compras_detallado.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_compras_detallado.setText("Analítico");
        r_compras_detallado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_compras_detalladoActionPerformed(evt);
            }
        });
        jMenu9.add(r_compras_detallado);

        Reportes.add(jMenu9);

        r_salidas.setText("Salidas");
        r_salidas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_salidas.setPreferredSize(new java.awt.Dimension(117, 25));

        r_ventadeldia.setText("Ventas");
        r_ventadeldia.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        r_ventas_totales.setText("Total");
        r_ventas_totales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_ventas_totalesActionPerformed(evt);
            }
        });
        r_ventadeldia.add(r_ventas_totales);

        r_venta_global.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_venta_global.setText("General");
        r_venta_global.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_venta_globalActionPerformed(evt);
            }
        });
        r_ventadeldia.add(r_venta_global);

        r_venta_del_dia.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_venta_del_dia.setText("Venta del dia");
        r_venta_del_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_venta_del_diaActionPerformed(evt);
            }
        });
        r_ventadeldia.add(r_venta_del_dia);

        r_ventadeldia_rutas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_ventadeldia_rutas.setText("Rutas (venta acum)");
        r_ventadeldia_rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_ventadeldia_rutasActionPerformed(evt);
            }
        });
        r_ventadeldia.add(r_ventadeldia_rutas);

        productos_vendidos.setText("Productos vendidos");
        productos_vendidos.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        r_ventadeldia_prodsvends.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_ventadeldia_prodsvends.setText("Total");
        r_ventadeldia_prodsvends.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_ventadeldia_prodsvendsActionPerformed(evt);
            }
        });
        productos_vendidos.add(r_ventadeldia_prodsvends);

        productos_vendidos_x_ruta.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        productos_vendidos_x_ruta.setText("x Rutas");
        productos_vendidos_x_ruta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos_vendidos_x_rutaActionPerformed(evt);
            }
        });
        productos_vendidos.add(productos_vendidos_x_ruta);

        r_ventadeldia.add(productos_vendidos);

        r_salidas.add(r_ventadeldia);

        jMenu8.setText("Mermas");
        jMenu8.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        r_merma.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_merma.setText("General");
        r_merma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_mermaActionPerformed(evt);
            }
        });
        jMenu8.add(r_merma);

        r_merma_detallado.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_merma_detallado.setText("Detallado");
        r_merma_detallado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_merma_detalladoActionPerformed(evt);
            }
        });
        jMenu8.add(r_merma_detallado);

        r_salidas.add(jMenu8);

        Reportes.add(r_salidas);
        Reportes.add(jSeparator11);

        r_mas_vend.setBackground(new java.awt.Color(204, 204, 204));
        r_mas_vend.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_mas_vend.setText("Lo + vendido");
        r_mas_vend.setPreferredSize(new java.awt.Dimension(117, 25));
        r_mas_vend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_mas_vendActionPerformed(evt);
            }
        });
        Reportes.add(r_mas_vend);

        r_utilidades.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_utilidades.setText("Utilidad bruta");
        r_utilidades.setEnabled(false);
        r_utilidades.setPreferredSize(new java.awt.Dimension(117, 25));
        r_utilidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_utilidadesActionPerformed(evt);
            }
        });
        Reportes.add(r_utilidades);

        r_men_vend.setBackground(new java.awt.Color(204, 204, 204));
        r_men_vend.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_men_vend.setText("Lo - vendido");
        r_men_vend.setPreferredSize(new java.awt.Dimension(117, 25));
        r_men_vend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_men_vendActionPerformed(evt);
            }
        });
        Reportes.add(r_men_vend);
        Reportes.add(jSeparator2);

        r_notas.setText("Notas");
        r_notas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_notas.setPreferredSize(new java.awt.Dimension(117, 25));

        r_notas_consultar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_notas_consultar.setText("Consulta");
        r_notas_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_notas_consultarActionPerformed(evt);
            }
        });
        r_notas.add(r_notas_consultar);

        r_preventa.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_preventa.setText("Total Preventa");
        r_preventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_preventaActionPerformed(evt);
            }
        });
        r_notas.add(r_preventa);
        r_notas.add(jSeparator13);

        r_notas_general.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_notas_general.setText("Global");
        r_notas_general.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_notas_generalActionPerformed(evt);
            }
        });
        r_notas.add(r_notas_general);

        r_notas_detallada.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_notas_detallada.setText("Analítico");
        r_notas_detallada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_notas_detalladaActionPerformed(evt);
            }
        });
        r_notas.add(r_notas_detallada);
        r_notas.add(jSeparator12);

        notas_clientes.setText("Clientes");
        notas_clientes.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        r_nota_x_cliente.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_nota_x_cliente.setText("Historial de compras");
        r_nota_x_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_nota_x_clienteActionPerformed(evt);
            }
        });
        notas_clientes.add(r_nota_x_cliente);

        r_cliente_prods.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_cliente_prods.setText("Productos adquiridos");
        r_cliente_prods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cliente_prodsActionPerformed(evt);
            }
        });
        notas_clientes.add(r_cliente_prods);
        notas_clientes.add(jSeparator16);

        r_clientes_frecuentes.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_clientes_frecuentes.setText("Clientes frecuentes");
        r_clientes_frecuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_clientes_frecuentesActionPerformed(evt);
            }
        });
        notas_clientes.add(r_clientes_frecuentes);

        r_notas.add(notas_clientes);

        notas_rutas.setText("Rutas (Liquidación)");
        notas_rutas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        r_n_r_global.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_n_r_global.setText("Global");
        r_n_r_global.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_n_r_globalActionPerformed(evt);
            }
        });
        notas_rutas.add(r_n_r_global);

        r_n_r_detallado.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_n_r_detallado.setText("Detallado");
        r_n_r_detallado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_n_r_detalladoActionPerformed(evt);
            }
        });
        notas_rutas.add(r_n_r_detallado);

        n_r_productos_vendidos.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        n_r_productos_vendidos.setText("Productos vendidos");
        n_r_productos_vendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n_r_productos_vendidosActionPerformed(evt);
            }
        });
        notas_rutas.add(n_r_productos_vendidos);

        r_notas.add(notas_rutas);

        notas_region.setText("Region");
        notas_region.setEnabled(false);
        notas_region.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N

        jMenuItem5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jMenuItem5.setText("Total compras");
        notas_region.add(jMenuItem5);

        r_notas.add(notas_region);

        Reportes.add(r_notas);

        r_facturas_busqueda.setBackground(new java.awt.Color(204, 204, 204));
        r_facturas_busqueda.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_facturas_busqueda.setText("Facturas");
        r_facturas_busqueda.setPreferredSize(new java.awt.Dimension(117, 25));
        r_facturas_busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_facturas_busquedaActionPerformed(evt);
            }
        });
        Reportes.add(r_facturas_busqueda);
        Reportes.add(jSeparator15);

        r_vale_carga.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_vale_carga.setText("Vale de carga");
        r_vale_carga.setPreferredSize(new java.awt.Dimension(99, 25));
        r_vale_carga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_vale_cargaActionPerformed(evt);
            }
        });
        Reportes.add(r_vale_carga);

        r_catalogo_rutas.setBackground(new java.awt.Color(204, 204, 204));
        r_catalogo_rutas.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_catalogo_rutas.setText("Libro diario");
        r_catalogo_rutas.setPreferredSize(new java.awt.Dimension(113, 25));
        r_catalogo_rutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_catalogo_rutasActionPerformed(evt);
            }
        });
        Reportes.add(r_catalogo_rutas);

        r_comodatos.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_comodatos.setText("Comodatos");
        r_comodatos.setEnabled(false);
        Reportes.add(r_comodatos);
        Reportes.add(jSeparator3);

        r_clientes.setText("Clientes");
        r_clientes.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_clientes.setPreferredSize(new java.awt.Dimension(117, 25));

        r_clientes_deudores.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_clientes_deudores.setText("Deudores (Notas)");
        r_clientes_deudores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_clientes_deudoresActionPerformed(evt);
            }
        });
        r_clientes.add(r_clientes_deudores);

        r_clientes_historial.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_clientes_historial.setText("Historial de ventas (Facturas)");
        r_clientes_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_clientes_historialActionPerformed(evt);
            }
        });
        r_clientes.add(r_clientes_historial);

        r_cliente_catalogo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_cliente_catalogo.setText("Catálogo");
        r_cliente_catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_cliente_catalogoActionPerformed(evt);
            }
        });
        r_clientes.add(r_cliente_catalogo);

        Reportes.add(r_clientes);

        r_trabajadores.setBackground(new java.awt.Color(204, 204, 204));
        r_trabajadores.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_trabajadores.setText("Empleados");
        r_trabajadores.setPreferredSize(new java.awt.Dimension(117, 25));
        r_trabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_trabajadoresActionPerformed(evt);
            }
        });
        Reportes.add(r_trabajadores);
        Reportes.add(jSeparator8);

        r_devoluciones.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_devoluciones.setText("Devoluciones");
        r_devoluciones.setPreferredSize(new java.awt.Dimension(117, 25));
        r_devoluciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_devolucionesActionPerformed(evt);
            }
        });
        Reportes.add(r_devoluciones);

        r_caducidad.setBackground(new java.awt.Color(204, 204, 204));
        r_caducidad.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        r_caducidad.setText("Caducidad");
        r_caducidad.setPreferredSize(new java.awt.Dimension(117, 25));
        r_caducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_caducidadActionPerformed(evt);
            }
        });
        Reportes.add(r_caducidad);

        jMenuBar1.add(Reportes);

        respaldos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resguardar.png"))); // NOI18N
        respaldos.setMnemonic('o');
        respaldos.setText("BACKUP");
        respaldos.setPreferredSize(new java.awt.Dimension(120, 20));

        respaldar.setBackground(new java.awt.Color(204, 204, 204));
        respaldar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        respaldar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/resguardar.png"))); // NOI18N
        respaldar.setText("Resguardar");
        respaldar.setToolTipText("Guarde una copia del estado del inventario");
        respaldar.setPreferredSize(new java.awt.Dimension(150, 30));
        respaldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                respaldarActionPerformed(evt);
            }
        });
        respaldos.add(respaldar);

        restaurar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        restaurar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/restaurar.png"))); // NOI18N
        restaurar.setText("Restaurar");
        restaurar.setToolTipText("Restaure una copia anterior del inventario");
        restaurar.setPreferredSize(new java.awt.Dimension(150, 30));
        restaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaurarActionPerformed(evt);
            }
        });
        respaldos.add(restaurar);
        respaldos.add(jSeparator10);

        reiniciar.setBackground(new java.awt.Color(204, 204, 204));
        reiniciar.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        reiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reciclar.png"))); // NOI18N
        reiniciar.setText("Reiniciar");
        reiniciar.setToolTipText("Ponga el inventario a un estado inicial");
        reiniciar.setPreferredSize(new java.awt.Dimension(150, 30));
        reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reiniciarActionPerformed(evt);
            }
        });
        respaldos.add(reiniciar);

        jMenuBar1.add(respaldos);

        acerca_de.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aboutIcon.png"))); // NOI18N
        acerca_de.setMnemonic('d');
        acerca_de.setText("ACERCA DE ¿?");
        acerca_de.setPreferredSize(new java.awt.Dimension(120, 25));
        acerca_de.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acerca_deMouseClicked(evt);
            }
        });
        jMenuBar1.add(acerca_de);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(237, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void articulosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_articulosMouseClicked
        new Articulos().setVisible(true);
    }//GEN-LAST:event_articulosMouseClicked

    private void clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesMouseClicked
        new Clientes().setVisible(true);
    }//GEN-LAST:event_clientesMouseClicked

    private void trabajadoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trabajadoresMouseClicked
        new Empleado().setVisible(true);
    }//GEN-LAST:event_trabajadoresMouseClicked

    private void es_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_es_inventarioMouseClicked
        new VentasDevoluciones().setVisible(true);
    }//GEN-LAST:event_es_inventarioMouseClicked

    private void notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notasActionPerformed
        new Notas().setVisible(true);
    }//GEN-LAST:event_notasActionPerformed

    private void f_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_registrarActionPerformed
        new Facturacion().setVisible(true);
    }//GEN-LAST:event_f_registrarActionPerformed

    private void es_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_es_comprasActionPerformed
        new Compras().setVisible(true);
    }//GEN-LAST:event_es_comprasActionPerformed

    private void acerca_deMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acerca_deMouseClicked
        new AcercaDe(this,true).setVisible(true);
    }//GEN-LAST:event_acerca_deMouseClicked

    private void articulos_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articulos_agregarActionPerformed
        frameArticulos(0);
    }//GEN-LAST:event_articulos_agregarActionPerformed

    private void articulos_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articulos_modificarActionPerformed
        frameArticulos(1);
    }//GEN-LAST:event_articulos_modificarActionPerformed

    private void articulos_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_articulos_eliminarActionPerformed
        frameArticulos(2);
    }//GEN-LAST:event_articulos_eliminarActionPerformed

    private void clientes_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientes_agregarActionPerformed
        frameClientes(0);
    }//GEN-LAST:event_clientes_agregarActionPerformed

    private void clientes_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientes_actualizarActionPerformed
        frameClientes(1);
    }//GEN-LAST:event_clientes_actualizarActionPerformed

    private void clientes_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientes_eliminarActionPerformed
        frameClientes(2);
    }//GEN-LAST:event_clientes_eliminarActionPerformed

    private void trabajadores_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadores_agregarActionPerformed
        frameEmpleados(0);
    }//GEN-LAST:event_trabajadores_agregarActionPerformed

    private void trabajadores_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadores_actualizarActionPerformed
        frameEmpleados(1);
    }//GEN-LAST:event_trabajadores_actualizarActionPerformed

    private void trabajadores_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trabajadores_eliminarActionPerformed
        frameEmpleados(2);
    }//GEN-LAST:event_trabajadores_eliminarActionPerformed

    private void es_inventario_salidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_es_inventario_salidasActionPerformed
        frameSalida(0);
    }//GEN-LAST:event_es_inventario_salidasActionPerformed

    private void es_inventario_devolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_es_inventario_devolucionesActionPerformed
        frameSalida(1);
    }//GEN-LAST:event_es_inventario_devolucionesActionPerformed

    private void r_invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_invActionPerformed
       r.setNomReporte("inventario");
        r.doReporte();
    }//GEN-LAST:event_r_invActionPerformed

    private void r_comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_comprasActionPerformed
       r.setNomReporte("ReporteCompras");                        
       i.setVisible(true);
    }//GEN-LAST:event_r_comprasActionPerformed

    private void r_venta_del_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_venta_del_diaActionPerformed
        r.setNomReporte("Ventas_del_dia");
        i.setVisible(true);
//        i.setSalida(new Salidas());                
    }//GEN-LAST:event_r_venta_del_diaActionPerformed

    private void r_ventadeldia_rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_ventadeldia_rutasActionPerformed
        r.setNomReporte("Ventas_del_dia_rutas");        
        i.setVisible(true);
//        i.setSalida(new Salidas());                
    }//GEN-LAST:event_r_ventadeldia_rutasActionPerformed

    private void r_mermaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_mermaActionPerformed
        r.setNomReporte("Salidas_merma");        
        i.setVisible(true);
//        i.setMerma(new Salidas());        
    }//GEN-LAST:event_r_mermaActionPerformed

    private void r_ventadeldia_prodsvendsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_ventadeldia_prodsvendsActionPerformed
        r.setNomReporte("venta_tot_pres");
        i.setVisible(true);
//        i.setSalida(new Salidas());        
    }//GEN-LAST:event_r_ventadeldia_prodsvendsActionPerformed

    private void r_mas_vendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_mas_vendActionPerformed
        r.setNomReporte("LoMasVendido");        
        i.setVisible(true);
    }//GEN-LAST:event_r_mas_vendActionPerformed

    private void r_men_vendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_men_vendActionPerformed
        r.setNomReporte("LoMenosVendido");        
        i.setVisible(true);
    }//GEN-LAST:event_r_men_vendActionPerformed

    private void r_notas_generalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_notas_generalActionPerformed
        r.setNomReporte("ReporteGeneralNotas");        
        i.setVisible(true);
    }//GEN-LAST:event_r_notas_generalActionPerformed

    private void r_notas_detalladaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_notas_detalladaActionPerformed
        r.setNomReporte("ReporteDetalladoNotas");
        i.setVisible(true);
    }//GEN-LAST:event_r_notas_detalladaActionPerformed

    private void r_facturas_busquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_facturas_busquedaActionPerformed
        r.setNomReporte("ReporteFacturaciones");
        i.setVisible(true);
    }//GEN-LAST:event_r_facturas_busquedaActionPerformed

    private void f_liquidacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_liquidacionActionPerformed
        new Liquidaciones().setVisible(true);
    }//GEN-LAST:event_f_liquidacionActionPerformed

    private void r_merma_detalladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_merma_detalladoActionPerformed
        r.setNomReporte("Salidas_merma_detallado");
        i.setVisible(true);
//        i.setMerma(new Salidas());        
    }//GEN-LAST:event_r_merma_detalladoActionPerformed

    private void r_devolucionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_devolucionesActionPerformed
        r.setNomReporte("Devoluciones");
         i.setVisible(true);       
//         i.setDevolucion(new Salidas());        
    }//GEN-LAST:event_r_devolucionesActionPerformed

    private void r_clientes_deudoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_clientes_deudoresActionPerformed
        r.setNomReporte("Clientes_deudores");
        i.setVisible(true);
    }//GEN-LAST:event_r_clientes_deudoresActionPerformed

    private void r_clientes_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_clientes_historialActionPerformed
        r.setNomReporte("Clientes_historial");
        i.setVisible(true);
    }//GEN-LAST:event_r_clientes_historialActionPerformed

    private void r_cliente_catalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cliente_catalogoActionPerformed
        r.setNomReporte("ClientesCatalogo");
           r.doReporte();
    }//GEN-LAST:event_r_cliente_catalogoActionPerformed

    private void r_trabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_trabajadoresActionPerformed
        r.setNomReporte("Empleados_catalogo");
         r.doReporte();        
    }//GEN-LAST:event_r_trabajadoresActionPerformed

    private void r_caducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_caducidadActionPerformed
        r.setNomReporte("Articulos_caducidad");
        i.setVisible(true);
    }//GEN-LAST:event_r_caducidadActionPerformed

    private void reiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reiniciarActionPerformed
        if(JOptionPane.showConfirmDialog(null, "Esta operación elimina todos los registros de Entrada/Salida,\n"
                                                + "esto significa que se eliminarán compras,ventas,devoluciones,\n"
                                                + "facturas, notas... sin embargo, el inventario queda vigente\n "
                                                + "para continuar operando. ¿Desea continuar con la operación?",
                                                null, 
                                                JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            dropAll();
    }//GEN-LAST:event_reiniciarActionPerformed

    private void respaldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_respaldarActionPerformed
        Respaldos resp = new Respaldos();
        resp.respaldar();
    }//GEN-LAST:event_respaldarActionPerformed

    private void restaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaurarActionPerformed
        Respaldos resp = new Respaldos();
        resp.restaurar();
    }//GEN-LAST:event_restaurarActionPerformed

    private void r_nota_x_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_nota_x_clienteActionPerformed
        Cliente c = new Cliente();
        String x="0";
        boolean correcto=false;
        while(!correcto){
            x = JOptionPane.showInputDialog(null,"Ingrese el ID del cliente:",0);
         c.setID(Integer.parseInt(x));
         c.buscarClientePorID();
         int xx = JOptionPane.showConfirmDialog(null, "¿Es correcto?: "+c.getNombre(), "Confirmación de la busqueda", JOptionPane.YES_NO_CANCEL_OPTION);
           if(xx==JOptionPane.YES_OPTION){
              correcto=true;              
                 r.setNomReporte("NotasClienteHistorico");
                 r.setParametro("ID_CLIENTE", c.getID());
                 r.setParametro("NOM_CLIENTE", c.getNombre());
                 i.setVisible(true);                 
           }else if(xx==JOptionPane.CANCEL_OPTION)
               correcto=false;
        }
        c.desconectar();
    }//GEN-LAST:event_r_nota_x_clienteActionPerformed

    private void r_notas_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_notas_consultarActionPerformed
        controladores.Notas n = new controladores.Notas();
        String nota="0";        
            nota = JOptionPane.showInputDialog(null,"Ingrese la Nota de venta:",0);
         n.setNo_Nota(nota);
         if(n.buscarNota()){
           r.setNomReporte("NotaBusqueda");
           r.setParametro("NOTA", nota);
           r.doReporte();
         }        
    }//GEN-LAST:event_r_notas_consultarActionPerformed

    private void r_vale_cargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_vale_cargaActionPerformed
        r.setNomReporte("ValeCarga");        
        seleccion_ruta.setVisible(true);
    }//GEN-LAST:event_r_vale_cargaActionPerformed

    private void estatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estatusActionPerformed
        new NotasEst(this,true).setVisible(true);
    }//GEN-LAST:event_estatusActionPerformed

    private void r_cliente_prodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_cliente_prodsActionPerformed
        Cliente c = new Cliente();
        String x="0";
        boolean correcto=false;
        while(!correcto){
            x = JOptionPane.showInputDialog(null,"Ingrese el ID del cliente:",0);
         c.setID(Integer.parseInt(x));
         if(c.buscarClientePorID()){
          int xx = JOptionPane.showConfirmDialog(null, "¿Es correcto?: "+c.getNombre(), "Confirmación de la busqueda", JOptionPane.YES_NO_CANCEL_OPTION);
           if(xx==JOptionPane.YES_OPTION){
              correcto=true;              
                 r.setNomReporte("NotasClientesProductosComprados");
                 r.setParametro("ID_CLIENTE", c.getID());
                 r.setParametro("NOM_CLIENTE", c.getNombre());
                 i.setVisible(true);                 
           }else if(xx==JOptionPane.CANCEL_OPTION)
               correcto=false;
         }
        }
        c.desconectar();
    }//GEN-LAST:event_r_cliente_prodsActionPerformed

    private void r_n_r_detalladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_n_r_detalladoActionPerformed
        r.setNomReporte("Liquidacion_rutas_detallado");
        i.setVisible(true);
    }//GEN-LAST:event_r_n_r_detalladoActionPerformed

    private void r_n_r_globalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_n_r_globalActionPerformed
        r.setNomReporte("Liquidacion_rutas");
        i.setVisible(true);
    }//GEN-LAST:event_r_n_r_globalActionPerformed

    private void configsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_configsActionPerformed
        new Detalles().setVisible(true);
    }//GEN-LAST:event_configsActionPerformed

    private void dia_visitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia_visitasActionPerformed
        new ClienteVisitas(this,true).setVisible(true);
    }//GEN-LAST:event_dia_visitasActionPerformed

    private void r_catalogo_rutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_catalogo_rutasActionPerformed
        new CatalogoRutas(this,false).setVisible(true);
    }//GEN-LAST:event_r_catalogo_rutasActionPerformed

    private void n_r_productos_vendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n_r_productos_vendidosActionPerformed
        r.setNomReporte("VentaDelDia");
        seleccion_ruta.setVisible(true);
    }//GEN-LAST:event_n_r_productos_vendidosActionPerformed

    private void r_venta_globalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_venta_globalActionPerformed
        r.setNomReporte("VentasTotales");
        i.setVisible(true);
    }//GEN-LAST:event_r_venta_globalActionPerformed

    private void artsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_artsActionPerformed
        new Articulos().setVisible(true);
    }//GEN-LAST:event_artsActionPerformed

    private void clientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientsActionPerformed
        new Clientes().setVisible(true);
    }//GEN-LAST:event_clientsActionPerformed

    private void confActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confActionPerformed
        new Detalles().setVisible(true);
    }//GEN-LAST:event_confActionPerformed

    private void comprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprasActionPerformed
        new Compras().setVisible(true);
    }//GEN-LAST:event_comprasActionPerformed

    private void ventasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventasActionPerformed
        new VentasDevoluciones().setVisible(true);
    }//GEN-LAST:event_ventasActionPerformed

    private void notsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notsActionPerformed
        new Notas().setVisible(true);
    }//GEN-LAST:event_notsActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new FacturacionCancelar(this,true).setVisible(true);        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void r_preventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_preventaActionPerformed
        r.setNomReporte("Preventa");
        i.setVisible(true);
    }//GEN-LAST:event_r_preventaActionPerformed

    private void productos_vendidos_x_rutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productos_vendidos_x_rutaActionPerformed
        r.setNomReporte("venta_tot_pres_ruta"); //venta total por presentacion y por ruta
        seleccion_ruta.setVisible(true);        
    }//GEN-LAST:event_productos_vendidos_x_rutaActionPerformed

    private void r_clientes_frecuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_clientes_frecuentesActionPerformed
        r.setNomReporte("Monitoreo_clientes");
        i.setVisible(true);
    }//GEN-LAST:event_r_clientes_frecuentesActionPerformed

    private void comodatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comodatoActionPerformed
       new Comodato().setVisible(true); 
    }//GEN-LAST:event_comodatoActionPerformed

    private void mobiliarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobiliarioActionPerformed
        new altas.Mobiliario().setVisible(true);
    }//GEN-LAST:event_mobiliarioActionPerformed

    private void r_ventas_totalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_ventas_totalesActionPerformed
        r.setNomReporte("Indicadores");
        i.setVisible(true);
    }//GEN-LAST:event_r_ventas_totalesActionPerformed

    private void r_utilidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_utilidadesActionPerformed
        r.setNomReporte("Utilidad");
        i.setVisible(true);
    }//GEN-LAST:event_r_utilidadesActionPerformed

    private void id_articuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusGained
        id_articulo.selectAll();
}//GEN-LAST:event_id_articuloFocusGained

    private void id_articuloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_id_articuloFocusLost
        buscarArticulo();
}//GEN-LAST:event_id_articuloFocusLost

    private void id_articuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            buscarArticulo();
            //precio.requestFocus();            
        }
                    
}//GEN-LAST:event_id_articuloKeyPressed

    private void id_articuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_articuloKeyTyped
        Validador.validarNumero(evt);
        if(id_articulo.getText().length()==15)
            evt.consume();
}//GEN-LAST:event_id_articuloKeyTyped

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        nuevo_articulo.desconectar();
    }//GEN-LAST:event_formWindowClosed

    private void r_compras_detalladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_compras_detalladoActionPerformed
        r.setNomReporte("ReporteComprasAnalitico");
        i.setVisible(true);
    }//GEN-LAST:event_r_compras_detalladoActionPerformed

    private void inventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventarioActionPerformed
        Inventario inv = new Inventario();
        inv.setVisible(true);
    }//GEN-LAST:event_inventarioActionPerformed

    private void articuloKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_articuloKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_articuloKeyPressed

    private void articuloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_articuloKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_articuloKeyTyped
    
    
    @SuppressWarnings("static-access")
    void frameArticulos(int index){
      Articulos a = new Articulos();
      a.panel.setSelectedIndex(index);
      a.setVisible(true);
    }
    @SuppressWarnings("static-access")
    void frameClientes(int index){
      Clientes c = new Clientes();
      c.panel.setSelectedIndex(index);
      c.setVisible(true);
    }
    @SuppressWarnings("static-access")
    void frameEmpleados(int index){
      Empleado e = new Empleado();
      e.panel.setSelectedIndex(index);
      e.setVisible(true);
    }
    @SuppressWarnings("static-access")
    void frameSalida(int index){
      VentasDevoluciones v = new VentasDevoluciones();
      v.panel.setSelectedIndex(index);
      v.setVisible(true);
    }

    void buscarArticulo(){
       if(!id_articulo.getText().equals("")){
           articulo.removeAllItems();
            nuevo_articulo.setId_articulo(id_articulo.getText());
             if(nuevo_articulo.buscarArticuloPorID_enTArticulos()){
                articulo.addItem(nuevo_articulo.getDescripcion()+" "+nuevo_articulo.getDescripcionPresentacion());
                precio.setText("$"+nuevo_articulo.getPrecioVenta());
             }
             else{
                articulo.requestFocus();
                precio.setText("$0.0");
             }
       }
       id_articulo.selectAll();
    }
    
    public static void main(String args[]){        
        java.awt.EventQueue.invokeLater(new Runnable() {        
            @Override
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Reportes;
    private javax.swing.JMenu acerca_de;
    private javax.swing.JMenu altas_ajustes;
    private javax.swing.JMenu archivo;
    private javax.swing.JComboBox articulo;
    private javax.swing.JMenu articulos;
    private javax.swing.JMenuItem articulos_agregar;
    private javax.swing.JMenuItem articulos_eliminar;
    private javax.swing.JMenuItem articulos_modificar;
    private javax.swing.JButton arts;
    private javax.swing.JMenu clientes;
    private javax.swing.JMenuItem clientes_actualizar;
    private javax.swing.JMenuItem clientes_agregar;
    private javax.swing.JMenuItem clientes_eliminar;
    private javax.swing.JButton clients;
    private javax.swing.JMenuItem comodato;
    private javax.swing.JButton compras;
    private javax.swing.JButton conf;
    private javax.swing.JMenuItem configs;
    private javax.swing.JMenuItem dia_visitas;
    private javax.swing.JMenu entradas_salidas;
    private javax.swing.JMenuItem es_compras;
    private javax.swing.JMenu es_inventario;
    private javax.swing.JMenuItem es_inventario_devoluciones;
    private javax.swing.JMenuItem es_inventario_salidas;
    private javax.swing.JMenuItem estatus;
    private javax.swing.JMenuItem f_liquidacion;
    private javax.swing.JMenuItem f_registrar;
    private javax.swing.JMenu formatos;
    private javax.swing.JTextField id_articulo;
    private javax.swing.JMenuItem inventario;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JMenuItem mobiliario;
    private javax.swing.JMenuItem n_r_productos_vendidos;
    private javax.swing.JMenuItem notas;
    private javax.swing.JMenu notas_clientes;
    private javax.swing.JMenu notas_region;
    private javax.swing.JMenu notas_rutas;
    private javax.swing.JButton nots;
    private javax.swing.JLabel precio;
    private javax.swing.JMenu productos_vendidos;
    private javax.swing.JMenuItem productos_vendidos_x_ruta;
    private javax.swing.JMenuItem r_caducidad;
    private javax.swing.JMenuItem r_catalogo_rutas;
    private javax.swing.JMenuItem r_cliente_catalogo;
    private javax.swing.JMenuItem r_cliente_prods;
    private javax.swing.JMenu r_clientes;
    private javax.swing.JMenuItem r_clientes_deudores;
    private javax.swing.JMenuItem r_clientes_frecuentes;
    private javax.swing.JMenuItem r_clientes_historial;
    private javax.swing.JMenuItem r_comodatos;
    private javax.swing.JMenuItem r_compras;
    private javax.swing.JMenuItem r_compras_detallado;
    private javax.swing.JMenuItem r_devoluciones;
    private javax.swing.JMenuItem r_facturas_busqueda;
    private javax.swing.JMenuItem r_inv;
    private javax.swing.JMenuItem r_mas_vend;
    private javax.swing.JMenuItem r_men_vend;
    private javax.swing.JMenuItem r_merma;
    private javax.swing.JMenuItem r_merma_detallado;
    private javax.swing.JMenuItem r_n_r_detallado;
    private javax.swing.JMenuItem r_n_r_global;
    private javax.swing.JMenuItem r_nota_x_cliente;
    private javax.swing.JMenu r_notas;
    private javax.swing.JMenuItem r_notas_consultar;
    private javax.swing.JMenuItem r_notas_detallada;
    private javax.swing.JMenuItem r_notas_general;
    private javax.swing.JMenuItem r_preventa;
    private javax.swing.JMenu r_salidas;
    private javax.swing.JMenuItem r_trabajadores;
    private javax.swing.JMenuItem r_utilidades;
    private javax.swing.JMenuItem r_vale_carga;
    private javax.swing.JMenuItem r_venta_del_dia;
    private javax.swing.JMenuItem r_venta_global;
    private javax.swing.JMenu r_ventadeldia;
    private javax.swing.JMenuItem r_ventadeldia_prodsvends;
    private javax.swing.JMenuItem r_ventadeldia_rutas;
    private javax.swing.JMenuItem r_ventas_totales;
    private javax.swing.JMenuItem reiniciar;
    private javax.swing.JMenuItem respaldar;
    private javax.swing.JMenu respaldos;
    private javax.swing.JMenuItem restaurar;
    private javax.swing.JMenuItem salir;
    private javax.swing.JMenu trabajadores;
    private javax.swing.JMenuItem trabajadores_actualizar;
    private javax.swing.JMenuItem trabajadores_agregar;
    private javax.swing.JMenuItem trabajadores_eliminar;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables

    private void dropAll() {
        controladores.Inventario inv = new controladores.Inventario();
        inv.inicializar();
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
             nuevo_articulo.setDescripcion(editor_articulo.getText().trim());             
             nuevo_articulo.buscarArticuloPorDescripcion();
             if(articulo.getItemCount()>1)
               editor_articulo.setText(nuevo_articulo.getDescripcion()); //le reasignamos el texto si queremos seguir consultando
             else
               precio.setText("$0.0");  
          }
        }
        else if(e.getKeyCode()==KeyEvent.VK_ENTER){
            if(articulo.getSelectedIndex()>=0){
                nuevo_articulo.setSelectedArt(articulo.getSelectedIndex());
                nuevo_articulo.buscarArticuloPorID_enTArticulos();            
                id_articulo.setText(""+nuevo_articulo.getId_Articulo());
                precio.setText("$"+nuevo_articulo.getPrecioVenta());
            }            
        }
    }

        @Override
    public void keyReleased(KeyEvent e) {

    }
 }

}