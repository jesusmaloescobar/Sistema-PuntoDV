
package controladores;

import java.sql.ResultSet;
import javax.swing.JTable;

/**
 *
 * @author Jesus Malo 27-abril-2011 01:51 p.m.
 */
public class Devoluciones {
    ResultSet res;
    private boolean busqueda;
    private String fecha, observaciones;
    private int id_ruta, tipo_salida;    
    private ConexionDB c;
    private int no_salida, total_arts, aux;
    private double subtotal, iva, total;
    private Rutas ruta;
    
    public Devoluciones(){
      ruta = new Rutas();
      c = new ConexionDB();
    }
    public void setFecha(String f){
      fecha = f;
    }
    public void setNoSalida(int ns){
      no_salida=ns;
    }
    public void setSubtotal(double subt){
      subtotal = subt;
    }
    public void setIva(double i){
      iva = i;
    }
    public void setTotal(double tot){
      total = tot;
    }
    public void setObservaciones(String obs){
      observaciones = obs.toUpperCase();
    }
    public void setIdRuta(int id_r){
      id_ruta = id_r;
    }
    public String getFecha(){
     return fecha;
    }
    
    public String getRuta(){       
        ruta.setIdRuta(id_ruta);
        return ruta.getNomRuta();       
    }
    public int getIdRuta(){
      return id_ruta;
    }
    public int getTipoSalida(){
     return tipo_salida;
    }
    
    public int getTotalArts(){
      return total_arts;
    }
    
    public void desconectar(){
      c.desconectar();
      c=null;
    }
    
    public boolean isSalida(int no_salida){
      try {
          busqueda=false;
          if(c.hayConexion()){
              c.setStatement("select fecha, id_ruta, id_tipo_salida from salidas where no_salida=?;");
              c.getStatement().setInt(1, no_salida);
             res = c.getStatement().executeQuery();
              if(res.next()){
                  fecha = res.getString(1);
                  id_ruta = res.getInt(2);
                  tipo_salida = res.getInt(3);
                  busqueda=true;
              }
          }
          res.close();
          res=null;
      } catch (Exception e) {
      }
      return busqueda;
  }
    
    public boolean isArticuloEnSalida(int n_salida, int n_art){
        try {
           busqueda=false;
            if(c.hayConexion()){
                c.setStatement("SELECT cantidad "
                                +"FROM detalle_salida ds, articulos a "
                                +"WHERE no_salida=? AND ds.id_articulo=a.id_articulo and a.id_articulo=?;");
                c.getStatement().setInt(1, n_salida);
                c.getStatement().setInt(2,n_art);
              res = c.getStatement().executeQuery();
              if(res.next()){
                  busqueda=true;
                  total_arts = res.getInt(1);
              }
            }
            res.close();
            res=null;
        } catch (Exception e) { System.out.println("Error:"+e.getMessage());
        }         
     return busqueda;
    }

    public boolean registrarDevolucion(JTable tabla){
      try{
          busqueda=false;
           if(c.hayConexion()){
               c.setStatement("insert into devoluciones(no_salida,subtotal,iva,total,observaciones) values("+no_salida+","+subtotal+","+iva+","+total+",?);");
                c.getStatement().setString(1, observaciones);
               c.getStatement().executeUpdate();
               res = c.getScrollableStatement().executeQuery("select last_value from sig_devolucion;");
                res.next();
              for(aux=0; aux<tabla.getRowCount(); aux++)
                 c.getScrollableStatement().executeUpdate("insert into detalle_devolucion(cns_dev,id_articulo,cantidad,precio_venta,iva_venta) values("+res.getInt(1)+","+tabla.getValueAt(aux, 0)+","+tabla.getValueAt(aux, 1)+","+tabla.getValueAt(aux, 3)+","+Double.parseDouble(tabla.getValueAt(aux, 5).toString())/Double.parseDouble(tabla.getValueAt(aux, 1).toString())+");");                 
              
              busqueda=true;
           }
        }catch(Exception e){ System.out.println("error:"+e.getMessage());}
     return busqueda;
    }
    
    public boolean devolverAInventario(JTable tabla){
      try{
          busqueda=false;
           if(c.hayConexion()){
              for(aux=0; aux<tabla.getRowCount(); aux++){
                 res = c.getScrollableStatement().executeQuery("SELECT dsc.no_entrada, de.precio_compra, de.iva_c "
                        +"FROM detalle_salida ds, detalle_salida_capas dsc, articulos a, detalle_entrada de "
                        +"WHERE ds.no_salida="+no_salida+" and dsc.cns_ds=ds.cns_ds and de.cns_ent=dsc.no_entrada AND ds.id_articulo=a.id_articulo and a.id_articulo=de.id_articulo and ds.id_articulo="+tabla.getValueAt(aux, 0)+" "
                        +"order by no_entrada desc;");
                 res.next();
                 c.getScrollableStatement().executeUpdate("insert into inventario(cns_ent,id_articulo,precio_compra,iva_c,existencia,fecha_caducidad) values("+res.getInt(1)+","+tabla.getValueAt(aux, 0)+","+res.getDouble(2)+","+res.getDouble(3)+","+tabla.getValueAt(aux, 1)+",'"+Fecha.getFechaFutura(4)+"');");                
              }
              busqueda=true;
           }
        }catch(Exception e){ System.out.println("error:"+e.getMessage());}
     return busqueda;
    }
    
}
