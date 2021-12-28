package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesus Malo 26/abril/2011 10:21am
 */
public class Salidas {

  private int no_salida;
  private double subtotal, descuento,sub_total,iva, total, totalArts;
  private String observaciones="", fecha;
  private int id_ruta, id_tipo_salida, aux, cant;
  private ResultSet res;
  private DefaultTableModel modelo_tabla; 
          ConexionDB c;
          boolean isSalida;
  private Rutas ruta;
  
  public Salidas(){
    ruta = new Rutas();
    c = new ConexionDB();
  }
  
  public void setNumSalida(int ns){
      no_salida = ns;
  }
  public void setFecha(String f){
    fecha = f;
  }
  public void setTotalArts(double t){
    totalArts = t;
  }
  public void setSubtotal(double subtot){
      subtotal = subtot;
  }
  public void setDescuento(double d){
    descuento = d;
  }
  public void setSub_total(double st){
    sub_total = st;
  }
  public void setIVA(double iva){
     this.iva = iva;
  }
  public void setTotal(double tot){
    total = tot;
  }  
  public void setObservaciones(String obs){
    observaciones = obs;
  }
  public void setId_Ruta(int nr){
    id_ruta = nr;
  }
  public void setTipoSalida(int ts){
    id_tipo_salida = ts;
  }

  public int getNumSalida(){
    return no_salida+1;
  }
  public int getId_Ruta(){
    return id_ruta;
  }
  public String getRuta(){
      ruta.setIdRuta(id_ruta);
      ruta.desconectar();
      return ruta.getNomRuta();    
  }
  public String getFecha(){
   return fecha;
  }
  public double getTotalArts(){
    return totalArts;
  }
  public double getSubtotal(){
   return subtotal;
  }
  public double getDescuento(){
   return descuento;
  }
  public double getSub_total(){
   return sub_total;
  }
  public double getIVA(){
   return iva;
  }
  public float getTotal(){
   return (float)total;
  }  
  public String getObservaciones(){
   return observaciones;
  }

  public int getTipoSalida(){
    return id_tipo_salida;
  }
  
  public void desconectar(){
    c.desconectar();
    c=null;
    ruta=null;
  }

  public boolean registrarSalida(JTable tabla){
      try {
          if(c.hayConexion()){
              c.setStatement("insert into salidas(fecha,cant_tot,subtotal,descuento,sub_total,iva,total,observaciones,id_ruta,id_tipo_salida) values('"+fecha+"',"+totalArts+","+subtotal+","+descuento+","+sub_total+","+iva+","+total+",?,"+id_ruta+","+id_tipo_salida+");");
              c.getStatement().setString(1, observaciones);
              c.getStatement().executeUpdate();
            res = c.getScrollableStatement().executeQuery("select last_value from sig_salida;");
            res.next();
            no_salida = res.getInt(1);
            for(aux=0; aux<tabla.getRowCount(); aux++){
              c.getScrollableStatement().executeUpdate("insert into detalle_salida(no_salida,id_articulo,cantidad,precio_venta,iva_venta) values("+no_salida+","+tabla.getValueAt(aux, 0)+","+tabla.getValueAt(aux, 1)+","+tabla.getValueAt(aux, 3)+","+Double.parseDouble(tabla.getValueAt(aux, 5).toString())/Double.parseDouble(tabla.getValueAt(aux, 1).toString())+");");
            }
          }
          return true;
      } catch (Exception e) {
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, e.getMessage(), "Error durante el registro!", JOptionPane.ERROR_MESSAGE); }
   return false;
  }
  
  public void descargarInventario(){
     try {
          if(c.hayConexion())
              c.getScrollableStatement().executeQuery("select descargaNow("+no_salida+");");
      } catch (Exception e) {      
          e.printStackTrace();
          JOptionPane.showMessageDialog(null, e.getMessage(), "Error durante el registro!", JOptionPane.ERROR_MESSAGE); 
      }
  }

  public void getSiguienteNumSalida(){
   try {
          if(c.hayConexion()){
            res = c.getScrollableStatement().executeQuery("select last_value from sig_salida;");
            if(res.next())
                no_salida = res.getInt(1);            
            res.close();
            res=null;
          }          
      } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error al consultar la última salida!", JOptionPane.ERROR_MESSAGE); 
      }
  }
  
  public boolean getSalida(JTable tabla){
      try {
          modelo_tabla = (DefaultTableModel) tabla.getModel();
          isSalida=false;
          if(c.hayConexion()){
             res = c.getScrollableStatement().executeQuery("select *from salidas where no_salida="+no_salida+";");
              if(res.next()){
                setNumSalida(res.getInt("no_salida"));
                setFecha(res.getString("fecha"));
                setSubtotal(res.getDouble("subtotal"));
                setDescuento(res.getDouble("descuento"));
                setSub_total(res.getDouble("sub_total"));
                setIVA(res.getDouble("iva"));
                setTotal(res.getDouble("total"));                
                setObservaciones(res.getString("observaciones"));
                setId_Ruta(res.getInt("id_ruta"));
                setTipoSalida(res.getInt("id_tipo_salida"));
              
             res = c.getScrollableStatement().executeQuery("SELECT art.id_articulo, ds.cantidad, art.descripcion, p.descripcion_p, art.iva_venta, art.precio_venta "
                                                        +"FROM salidas s, detalle_salida ds, articulos art, presentacion p "
                                                        +"WHERE s.no_salida="+no_salida+" AND s.no_salida=ds.no_salida AND ds.id_articulo=art.id_articulo AND art.id_presentacion=p.id_presentacion;");
             aux=0;
              while(res.next()){
                modelo_tabla.addRow(new Object[1]);
                tabla.setValueAt(res.getInt(1), aux, 0);
                tabla.setValueAt(res.getInt(2), aux, 1);
                tabla.setValueAt(res.getString(3)+" "+res.getString(4), aux, 2);
                tabla.setValueAt(res.getDouble(5), aux, 3);
                tabla.setValueAt(res.getDouble(6), aux, 4);
                tabla.setValueAt(Matematicas.redondear(res.getInt(2)*res.getDouble(5),3), aux, 5);
                aux++;
              }
              isSalida=true;
            }//fin si 
          }
          res.close();
          res=null;
      } catch (Exception e) { System.out.println("error:"+e.getMessage());  }
      return isSalida;
  }

    public boolean actualizar(JTable tabla){
        try {
          if(c.hayConexion()){
              c.setStatement("UPDATE salidas SET subtotal="+subtotal+", iva="+iva+",total="+total+",observaciones=? WHERE no_salida="+no_salida+";");
              c.getStatement().setString(1, observaciones);
            c.getStatement().executeUpdate();
            for(aux=0; aux<tabla.getRowCount(); aux++){
                c.setStatement("SELECT cantidad FROM detalle_salida WHERE no_salida="+no_salida+" AND cns_art=?;");
                c.getStatement().setInt(1, Integer.parseInt(tabla.getValueAt(aux, 0).toString()));
              res = c.getStatement().executeQuery();
              if(res.next()){
                cant = res.getInt(1);
                cant = Integer.parseInt(String.valueOf(tabla.getValueAt(aux, 1))) - cant;
                if(cant>0){
                 c.getScrollableStatement().executeUpdate("UPDATE inventario SET existencia=existencia-"+cant+" WHERE cns_art="+tabla.getValueAt(aux, 0)+";");
                 c.getScrollableStatement().executeUpdate("UPDATE detalle_salida SET cantidad=cantidad+"+cant+" WHERE no_salida="+getNumSalida()+" AND cns_art="+tabla.getValueAt(aux, 0)+";");
                }
              }else{
                c.getScrollableStatement().executeUpdate("insert into detalle_salida(no_salida,cns_art,cantidad) values("+no_salida+","+tabla.getValueAt(aux, 0)+","+tabla.getValueAt(aux, 1)+");");
                c.getScrollableStatement().executeUpdate("UPDATE inventario SET existencia=existencia-"+tabla.getValueAt(aux,1)+" WHERE cns_art="+tabla.getValueAt(aux, 0)+";");
              }
            }
          }
          res.close();
          res=null;
          return true;
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error durante el registro!", JOptionPane.ERROR_MESSAGE); }
      return false;
    }
    
    public void getTotalVentaDelDia(String fi, String ff){
        try {
            if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("select sum(subtotal) as subtotal,sum(iva) as iva,sum(total) as total,sum(descuento) as descuento from salidas where fecha between '"+fi+"' and '"+ff+"' AND id_tipo_salida=1;");
              if(res.next()){
                subtotal = res.getDouble(1);
                iva = res.getDouble(2);
                total = res.getDouble(3);
                descuento = res.getDouble(4);                  
              }
              desconectar();
            }            
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
    
    public void getTotalSalidasMerma(String fi, String ff){
      try {
            if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("select sum(subtotal) as subtotal,sum(iva) as iva,sum(total) as total from salidas where id_tipo_salida=2 and fecha between '"+fi+"' and '"+ff+"';");
              if(res.next()){
                subtotal = res.getDouble(1);
                iva = res.getDouble(2);
                total = res.getDouble(3);                
              }
              desconectar();
            }
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }
    public void getTotalDevolucion(String fi, String ff){
      try {
            if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("select sum(subtotal) as subtotal,sum(iva) as iva,sum(total) as total from devoluciones where fecha between '"+fi+"' and '"+ff+"';");
              if(res.next()){
                subtotal = res.getDouble(1);
                iva = res.getDouble(2);
                total = res.getDouble(3);                
              }
              desconectar();
            }
        } catch (Exception e) {
            System.out.println("error:"+e.getMessage());
        }
    }

}
