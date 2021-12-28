package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Malo
 */
public class Comodato {
    int no_comod, id_cliente, id_mob, cantidad, aux;
    String fecha_elaboracion, fecha_cancelacion, observaciones;
    ConexionDB c;
    ResultSet res;
    
    public Comodato(){
      c = new ConexionDB();
    }
    
    //SETs
    public void setNumComodato(int nc){
      no_comod = nc;
    }
    public void setIdCliente(int id_c){
      id_cliente = id_c;
    }
    public void setIdMobiliario(int id_m){
      id_mob = id_m;
    }
    public void setCantidadTotal(int c){
      cantidad = c;
    }
    public void setFechaElaboracion(String fe){
      fecha_elaboracion = fe;
    }
    public void setFechaCancelacion(String fc){
      fecha_cancelacion = fc;
    }
    public void setObservaciones(String obs){
     observaciones = obs.toUpperCase();
    }
    //GETs
    public int getNumComodato(){
      return no_comod;
    }
    public int getIdCliente(){
      return id_cliente;
    }
    public int getIdMobiliario(){
      return id_mob;
    }
    public int getCantidad(){
      return cantidad;
    }
    public String getFechaElaboracion(){
      return fecha_elaboracion;
    }
    public String getFechaCancelacion(){
      return fecha_cancelacion;
    }
    public String getObservaciones(){
     return observaciones;
    }
    
    public boolean registrar(javax.swing.JTable tabla){
      try {
         if(c.hayConexion()){
             c.getScrollableStatement().executeUpdate("insert into comodatos(no_comod,id_cliente,total_mob,fecha_elaboracion,fecha_cancelacion,observaciones) values("+no_comod+","+id_cliente+","+cantidad+",'"+fecha_elaboracion+"','"+fecha_cancelacion+"','"+observaciones+"');");
             for(aux=0; aux<tabla.getRowCount(); aux++)
               c.getScrollableStatement().executeUpdate("insert into detalle_comodato(no_comod,id_mob,cantidad,serie) values("+no_comod+","+tabla.getValueAt(aux, 0)+","+tabla.getValueAt(aux, 1)+",'"+tabla.getValueAt(aux, 3)+"');");
           return true;
         }
      } catch (Exception e) { 
         JOptionPane.showMessageDialog(null,e.getMessage(),"Error grave",JOptionPane.ERROR_MESSAGE);    
      }
      return false;
    }
    
    public boolean buscar(javax.swing.table.DefaultTableModel tabla){
       try {
         if(c.hayConexion()){
           res = c.getScrollableStatement().executeQuery("select *from comodatos where no_comod="+no_comod+";");
           if(res.next()){
             id_cliente=res.getInt("id_cliente");
             cantidad=res.getInt("total_mob");
             fecha_elaboracion=res.getString("fecha_elaboracion");
             fecha_cancelacion=res.getString("fecha_cancelacion");
             observaciones=res.getString("observaciones");
              res = c.getScrollableStatement().executeQuery("select dc.id_mob,cantidad,descripcion,modelo,serie,marca,logo from detalle_comodato dc, mobiliario_y_equipo me where dc.id_mob=me.id_mob and no_comod="+no_comod+";");
              for(aux=0;res.next();aux++){
                tabla.addRow(new Object[1]);
                tabla.setValueAt(res.getString(1), aux, 0);
                tabla.setValueAt(res.getString(2), aux, 1);
                tabla.setValueAt(res.getString(3), aux, 2);
                tabla.setValueAt(res.getString(4), aux, 3);
                tabla.setValueAt(res.getString(5), aux, 4);
                tabla.setValueAt(res.getString(6), aux, 5);
                tabla.setValueAt(res.getString(7), aux, 6);
              }
              res.close();
              res=null;
             return true;
           }           
         }
       } catch (Exception e) { System.out.println(e.getMessage());}
       return false;
    }
    
    public boolean finalizarContrato(){
     try {
        if(c.hayConexion()){
           c.getScrollableStatement().executeUpdate("update comodatos set fecha_cancelacion='"+fecha_cancelacion+"' where no_comod="+no_comod+";");
           return true;
        }
     } catch (Exception e) { System.out.println(e.getMessage());}
     return false;
    }
    
    public boolean eliminar(){
     try {
        if(c.hayConexion()){
           c.getScrollableStatement().executeUpdate("delete from detalle_comodato where no_comod="+no_comod+";");
           c.getScrollableStatement().executeUpdate("delete from comodatos where no_comod="+no_comod+";");
           return true;
        }
     } catch (Exception e) { System.out.println(e.getMessage());}
     return false;
    }

}
