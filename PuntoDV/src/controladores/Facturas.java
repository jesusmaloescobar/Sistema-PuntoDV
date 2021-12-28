package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Jesús Malo
 */
public class Facturas {
  private String no_factura, fecha;
  private String subtotal,descuento, sub_total, iva, total;
  private String observaciones="";
  private int id_ruta, id_concepto, id_estatus;
    private int id_cliente,aux;
    private boolean busqueda;
  ConexionDB c;
  ResultSet res;
  
  public Facturas(){
    c = new ConexionDB();
  }
  
  public void setNo_Factura(String fact){
      no_factura = fact;
  }
  public void setFecha(String fecha){
      this.fecha = fecha;
  }
  public void setSubtotal(String subtot){
      subtotal = subtot;
  }
  public void setIVA(String iva){
     this.iva = iva;
  }
  public void setTotal(String tot){
    total = tot;
  }
  public void setDescuento(String desc){
    descuento = desc;
  }
  public void setObservaciones(String obs){
    observaciones = obs.toUpperCase();
  }
  public void setId_Ruta(int nr){
    id_ruta = nr;
  }
  public void setId_Concepto(int nc){
    id_concepto = nc;
    
  }
  public void setId_Estatus(int id_est){
      id_estatus = id_est;
  }
  public void setId_Cliente(int id_c){
     id_cliente = id_c;
  }
  
 public String getNumFactura() {
        return no_factura;
 }
  public int getIdCliente(){
    return id_cliente;
  }
  public String getFecha(){
   return fecha;
  }
  public String getSubtot(){
   return sub_total;
  }
  public String getDescuento(){
   return descuento;
  } 
  public String getSubtotal(){
   return subtotal;
  }
  public String getIVA(){
   return iva;
  }
  public String getTotal(){
   return total;
  }
  public String getObservaciones() {
   return observaciones;
  }
  public int getId_Ruta(){
    return id_ruta;
  }
  public int getId_Concepto(){
    return id_concepto;
  }
  public int getId_Estatus(){
      return id_estatus;
  }
  public int getId_Cliente(){
     return id_cliente;
  }
  
  public void desconectar(){
    c.desconectar();
    c=null;
  }
  
  public boolean registrarFactura(JTable tabla){
      try {
          if(c.hayConexion()){
            c.setStatement("insert into facturacion(no_factura,fecha,subtotal,iva,total,descuento,observaciones,id_ruta,id_concepto,id_estatus,id_cliente) values('"+no_factura+"','"+fecha+"','"+subtotal+"','"+iva+"','"+total+"','"+descuento+"',?,"+id_ruta+","+id_concepto+","+id_estatus+","+id_cliente+");");
              c.getStatement().setString(1, observaciones);
            c.getStatement().executeUpdate();
            for(aux=0; aux<tabla.getRowCount(); aux++){
                c.getScrollableStatement().executeUpdate("insert into detalle_facturacion(no_factura,id_articulo,cantidad,precio_venta,iva_venta,importe) values('"+no_factura+"',"+tabla.getValueAt(aux, 0)+","+tabla.getValueAt(aux, 1)+",'"+tabla.getValueAt(aux, 3)+"','"+tabla.getValueAt(aux, 4)+"','"+tabla.getValueAt(aux, 5)+"');");
            }
          }
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error durante el registro!", JOptionPane.ERROR_MESSAGE); }
   return false;
  }

    public boolean buscarFactura() {
      busqueda=false;
      try {
          if(c.hayConexion()){
              c.setStatement("select *from facturacion where no_factura=?;");
              c.getStatement().setString(1, no_factura);
            res = c.getStatement().executeQuery();
            if(res.next()){
              busqueda=true;
              setId_Cliente(res.getInt("id_cliente"));
            }
          }
          res.close();
          res=null;
      } catch (Exception e) {    }
    return busqueda;  
    }


    
    public void cargarFactura(){
      try {
          if(c.hayConexion()){
              c.setStatement("SELECT fact.fecha,(fact.subtotal+fact.descuento) as subtot,fact.descuento,fact.subtotal,fact.iva,fact.total, fact.observaciones, rut.id_ruta AS ruta, edf.cns_e as estatus FROM facturacion fact, ruta rut, estatus_de_factura edf WHERE fact.no_factura=? AND fact.id_ruta=rut.id_ruta AND fact.id_estatus=edf.cns_e;");
               c.getStatement().setString(1, no_factura);
            res = c.getStatement().executeQuery();
            if(res.next()){
              fecha=res.getString("fecha");
              sub_total = res.getString("subtot");
              descuento=res.getString("descuento");
              subtotal=res.getString("subtotal");
              iva=res.getString("iva");
              total=res.getString("total");
              observaciones=res.getString("observaciones");
              id_ruta=res.getInt("ruta");
              id_estatus=res.getInt("estatus");             
            }
          }
          res.close();
          res=null;
      } catch (Exception e) { System.out.println("error:"+e.getMessage()); }
    }
    
    public boolean eliminarFactura(){
      try {
        if(c.hayConexion()){
          c.getScrollableStatement().executeUpdate("DELETE FROM detalle_facturacion where no_factura='"+no_factura+"';");
          c.getScrollableStatement().executeUpdate("DELETE FROM facturacion where no_factura='"+no_factura+"';");
         return true;
        }
      } catch (Exception e) {System.out.println(e.getMessage());}
      return false;
    }
}
