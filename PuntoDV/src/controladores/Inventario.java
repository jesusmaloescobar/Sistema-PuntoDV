package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import tareas.MsjInicializar;

/**
 *
 * @author Jesus Malo
 */
public class Inventario extends Tabla{
    private ConexionDB c;
    ResultSet resultado, inversion;
    private double subtotal, iva, total;
      
      public Inventario(){
        c = new ConexionDB();
      }

      public double getSubtotal(){
        return subtotal;
      }

      public double getIva(){
        return iva;
      }

      public double getTotal(){
          return total;
      }

  public void desconectar(){
      try {
        c.desconectar();
        resultado.close();
        c=null;
        resultado=null;
      } catch (Exception e) {   }
  }

  public void cargarInventario(){
        try {
            if(c.hayConexion()){
              resultado = c.getScrollableStatement().executeQuery("SELECT a.id_articulo,a.descripcion,p.descripcion_p, i.precio_compra/(1+iva_c), (i.precio_compra/(1+i.iva_c))*iva_c, a.precio_venta/(1+iva_venta), (a.precio_venta/(1+a.iva_venta))*iva_venta,(select sum(existencia) where i.id_articulo=a.id_articulo) as total,(select sum(existencia) where i.id_articulo=a.id_articulo)*i.precio_compra as inversion "
                +"FROM   inventario i,articulos a,presentacion p "
                +"WHERE  i.id_articulo=a.id_articulo and p.id_presentacion=a.id_presentacion "
                +"GROUP  BY i.id_articulo,a.id_articulo,a.descripcion,p.descripcion_p, i.precio_compra, i.iva_c, a.precio_venta, a.iva_venta "
                +"ORDER  BY i.id_articulo;");
              setResultSet(resultado); //clase Tabla
               resultado.last(); //consultamos cual es el ultimo registro
               setNumMaxPaginas(resultado.getRow());
                resultado.beforeFirst(); //regresamos al inicio el cursor del ResultSet               
            }
        } catch (Exception e) { System.out.println("error:"+e.getMessage());  }
    }

    public void getInversionTotal(){
        try {            
            if(c.hayConexion()){
                c.setStatement("SELECT "
                      + "sum(precio_compra*existencia), "
                      + "sum(((precio_compra/(1+iva_c))*iva_c)*existencia), "
                      + "sum(precio_compra*existencia+((precio_compra/(1+iva_c))*iva_c)*existencia) "
                      + "FROM inventario i;");                      
              inversion = c.getStatement().executeQuery();
              if(inversion.next()){
                subtotal = Matematicas.redondear(inversion.getDouble(1),2);
                iva = Matematicas.redondear(inversion.getDouble(2),2);
                total = Matematicas.redondear(inversion.getDouble(3),2);
              }
              inversion.close();
              inversion=null;
            }            
        } catch (Exception e) { System.out.println(e.getMessage());  }
    }
    
   public boolean vaciarInventario(){
      try {
          if(c.hayConexion()){
            c.getScrollableStatement().executeUpdate("delete from inventario;");
          }
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE); }
      return false;
  }
    
    public void inicializar(){
        new Thread(){
            @Override
          public void run(){
           try{
            MsjInicializar i = new MsjInicializar();
            i.setVisible(true);
              if(c==null)
                  c = new ConexionDB();
              if(c.hayConexion()){
                  //eliminando facturas                  
                     c.getScrollableStatement().executeUpdate("delete from detalle_facturacion where no_factura in(select no_factura from facturacion where id_estatus!=2);");                     
                     c.getScrollableStatement().executeUpdate("delete from facturacion where id_estatus!=2;");
                 //eliminando notas
                 c.getScrollableStatement().executeUpdate("delete from pago_notas where nota_venta in(select nota_venta from notas where id_estatus!=2);");
                 c.getScrollableStatement().executeUpdate("delete from detalle_nota;");
                 c.getScrollableStatement().executeUpdate("delete from notas");
                 //eliminando salidas
                 c.getScrollableStatement().executeUpdate("delete from detalle_salida_capas;");
                 c.getScrollableStatement().executeUpdate("delete from detalle_salida;");
                 c.getScrollableStatement().executeUpdate("delete from salidas;");
                 //eliminando devoluciones
                 c.getScrollableStatement().executeUpdate("delete from detalle_devolucion");
                 c.getScrollableStatement().executeUpdate("delete from devoluciones");
                 //eliminando entradas
                 c.getScrollableStatement().executeUpdate("delete from detalle_entrada where cns_ent not in(select cns_ent from inventario);");
                 c.getScrollableStatement().executeUpdate("delete from entradas where cns_ent not in(select cns_ent from inventario);");
              }
              c.desconectar();
              resultado.close();
            i.setVisible(false);
               JOptionPane.showMessageDialog(null, "Se ha completado el reinicio de la base de datos", "Atención!", JOptionPane.INFORMATION_MESSAGE);
           }catch(Exception e){ System.out.println("error:"+e.getMessage());  }
          }
        }.start();
    }
}
