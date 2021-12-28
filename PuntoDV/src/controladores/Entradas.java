
package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class Entradas extends Tabla{
  private String fecha;
  private double subtotal,descuento,sub_total, iva, total, cant_tot;
  private int no_entrada,aux;
  ConexionDB c;
  ResultSet res;
  Articulo articulo;  
  javax.swing.table.DefaultTableModel modelo;
  
  public Entradas(){
    articulo = new Articulo();
    c = new ConexionDB();
  }
  public void setNumEntrada(int ne){
      no_entrada = ne;
  }
  public void setFecha(String fecha){
      this.fecha = fecha;
  }
  public void setSubtotal(double subtot){
      subtotal = subtot;
  }
  public void setDescuento(double dcto){
      descuento = dcto;
  }
  public void setSub_total(double subtot){
      sub_total = subtot;
  }
  public void setIVA(double iva){
     this.iva = iva;
  }
  public void setTotal(double tot){
    total = tot;
  }
  public void setCantTot(double cant){
    cant_tot = cant;
  }
  
  public int getNumEntrada(){
    return no_entrada;
  }
  public String getFecha(){
   return fecha;
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
  public double getIva(){
   return iva;
  }
  public double getTotal(){
   return total;
  }
  public double getCantTot(){
    return cant_tot;
  }
  public void desconectar(){
    c.desconectar();
    c=null;
  }
  
  public void getSiguienteNumEntrada(){
    try {
          if(c.hayConexion()){
            res = c.getScrollableStatement().executeQuery("select last_value from sig_entrada;");
            if(res.next()){
              no_entrada = res.getInt(1);
            }
          }         
          res.close();
          res=null;
      } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error durante la consulta!", JOptionPane.ERROR_MESSAGE); 
      }
  }
    
  public boolean registrarEntrada(javax.swing.JTable tabla){
      try {
          if(c.hayConexion()){
              c.setStatement("insert into entradas(fecha_compra,subtotal,descuento,sub_total,iva,total,cantidad) values(?,"+subtotal+","+descuento+","+sub_total+","+iva+","+total+","+cant_tot+");");
               c.getStatement().setDate(1, Fecha.getFecha(fecha));               
              c.getStatement().executeUpdate();
              res = c.getScrollableStatement().executeQuery("select last_value from sig_entrada;");
              res.next();
              no_entrada=res.getInt(1);
              for(aux=0; aux<tabla.getRowCount(); aux++){
                  c.getScrollableStatement().executeUpdate("insert into detalle_entrada(cns_ent,id_articulo,cantidad,precio_compra,iva_c) values("+no_entrada+","+tabla.getValueAt(aux, 0)+","+tabla.getValueAt(aux, 1)+","+tabla.getValueAt(aux, 3)+","+tabla.getValueAt(aux, 4)+");");               
              }
              for(aux=0; aux<tabla.getRowCount(); aux++){
                  c.getScrollableStatement().executeUpdate("insert into inventario(cns_ent,id_articulo,precio_compra,iva_c,existencia,fecha_caducidad) "
                          + "values("+no_entrada+","+tabla.getValueAt(aux, 0)+","+tabla.getValueAt(aux, 3)+","+tabla.getValueAt(aux, 4)+","+tabla.getValueAt(aux, 1)+",'"+tabla.getValueAt(aux, 9).toString()+"');");                  
              }
          }
          res.close();
          res=null;           
          JOptionPane.showMessageDialog(null, "El registro de la compra se efectuó exitósamente!", "Atención...", JOptionPane.INFORMATION_MESSAGE);
          return true;
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE); 
      }
    return false;
  }
 
  public void cargarCompras(){
    try {
          if(c.hayConexion()){
            res = c.getScrollableStatement().executeQuery("select cns_ent,fecha_compra,cantidad,subtotal,descuento,sub_total,iva,total from entradas order by cns_ent;");
               setResultSet(res); //clase Tabla
               res.last(); //consultamos cual es el último registro
               setNumMaxPaginas(res.getRow());
               res.beforeFirst(); //regresamos al inicio el cursor del ResultSet               
          }          
      } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error durante la consulta!", JOptionPane.ERROR_MESSAGE); 
      }
  }
  
  public void getInversionTotal(){
        try {
            if(c.hayConexion()){
                c.setStatement("SELECT sum(subtotal),"
                                +"sum(descuento),"
                                +"sum(sub_total),"
                                +"sum(iva),"
                                +"sum(total) from entradas;");
              res = c.getStatement().executeQuery();
              if(res.next()){
                subtotal = Matematicas.redondear(res.getDouble(1),2);
                descuento = Matematicas.redondear(res.getDouble(2),2);
                sub_total = Matematicas.redondear(res.getDouble(3),2);
                iva = Matematicas.redondear(res.getDouble(4),2);
                total = Matematicas.redondear(res.getDouble(5),2);
              }
              res.close();
              res=null;
            }
        } catch (Exception e) { System.out.println(e.getMessage());  }
    }
  
  public boolean eliminarEntrada(){
      try {
          if(c.hayConexion()){
            c.getScrollableStatement().executeUpdate("delete from detalle_entrada where cns_ent="+no_entrada+";");
            c.getScrollableStatement().executeUpdate("delete from entradas where cns_ent="+no_entrada+";");
            c.getScrollableStatement().executeUpdate("delete from inventario where cns_ent="+no_entrada+";");
          }
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE); }
      return false;
  }
  
}