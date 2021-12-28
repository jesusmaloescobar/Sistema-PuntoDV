package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jesús Malo
 */
public class Notas {
  private String nota_venta, fecha;
  private double subtotal, iva, cantidad, descuento, sub_total, total;
  private int id_cliente,id_ruta,aux, id_estatus;
  private boolean busqueda;
  ConexionDB c;
  ResultSet res;
  Articulo articulo;
  JTable tabla;
  DefaultTableModel modelo;
  
  public Notas(){
    articulo = new Articulo();
    c = new ConexionDB();
  }
  public void setNo_Nota(String no_nota){
      nota_venta = no_nota;
  }
  public void setFecha(String fecha){
      this.fecha = fecha;
  }
  public void setSubtotal(double subtot){
      subtotal = subtot;
  }
  public void setIVA(double iva){
     this.iva = iva;
  }
  public void setTotal(double tot){
    total = tot;
  }
  public void setId_Ruta(int nr){
    id_ruta = nr;
  }  
  public void setId_Cliente(int id_c){
     id_cliente = id_c;
  }
  public void setCantidad(double cant){
    cantidad = cant;
  }
  public void setDescuento(double desc){
    descuento = desc;
  }
  public void setSub_total(double st){
    sub_total = st;
  }
  
  public void setId_Estatus(int i){
    id_estatus = i;
  }
  
  public String getNota(){
    return nota_venta;
  }
  public String getFecha(){
      return fecha;
  }
  public double getSubtotal(){
      return subtotal;
  }
  public double getIVA(){
      return iva;
  }
  public double getTotal(){
    return total;
  }
  public int getId_Ruta(){
    return id_ruta;
  }  
  public int getId_Cliente(){
     return id_cliente;
  }
  public double getCantidad(){
    return cantidad;
  }
  public double getDescuento(){
    return descuento;
  }
  public double getSub_total(){
    return sub_total;
  }
  public int getId_estatus(){
    return id_estatus;
  }
  
  public void desconectar(){
    try{  
      c.desconectar();      
    }catch(Exception e){}
  }
  
  public boolean registrarNota(JTable tabla){
      try {
          if(c.hayConexion()){
              c.setStatement("insert into notas values(?,'"+fecha+"',"+id_cliente+","+id_ruta+","+cantidad+","+subtotal+","+descuento+","+sub_total+","+iva+","+total+","+id_estatus+");");
               c.getStatement().setString(1, nota_venta);               
              c.getStatement().executeUpdate();
            for(int auxi=0; auxi<tabla.getRowCount(); auxi++){
              c.setStatement("insert into detalle_nota(nota_venta,id_articulo,cantidad,subtotal,descuento,sub_total,iva,total) values(?,"+tabla.getValueAt(auxi,0).toString()+","+tabla.getValueAt(auxi,1).toString()+","+tabla.getValueAt(auxi,4).toString()+","+tabla.getValueAt(auxi,5).toString()+","+tabla.getValueAt(auxi,6).toString()+","+tabla.getValueAt(auxi,7).toString()+","+(Double.parseDouble(tabla.getValueAt(auxi,6).toString())+Double.parseDouble(tabla.getValueAt(auxi,7).toString()))+");");
                c.getStatement().setString(1, nota_venta);                
              c.getStatement().executeUpdate();               
            }
          }
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage(), "Error durante el registro!", JOptionPane.ERROR_MESSAGE); }
   return false;
  }
  
  public boolean buscarNota(){
      busqueda=false;
      try {
          if(c.hayConexion()){
              c.setStatement("select *from notas where nota_venta=?;");
              c.getStatement().setString(1, nota_venta);
            res = c.getStatement().executeQuery();
            if(res.next()){
                nota_venta = res.getString(1);
                fecha = res.getString(2);
                id_cliente = res.getInt(3);
                id_ruta = res.getInt(4);
                cantidad = res.getDouble(5);
                subtotal = res.getDouble(6);
                descuento = res.getDouble(7);
                sub_total = res.getDouble(8);
                iva = res.getDouble(9);
                total = res.getDouble(10);
                id_estatus = res.getInt(11);
              busqueda=true;
            }
          }
          res.close();
          res=null;
      } catch (Exception e) { System.out.println("error"+e.getMessage());
         }
    return busqueda;
  }
  
  public boolean extraerNota(javax.swing.table.DefaultTableModel tabla_mod){
    try {
         for(aux=tabla_mod.getRowCount()-1; aux>=0; aux--)
            tabla_mod.removeRow(aux);
         aux=0;
          if(c.hayConexion()){
              c.setStatement("SELECT  dn.id_articulo, cantidad, descripcion, descripcion_p, subtotal/cantidad, subtotal, descuento, sub_total, iva "
                +"FROM detalle_nota dn, articulos arts, presentacion p "
                +"WHERE nota_venta=? AND dn.id_articulo=arts.id_articulo and arts.id_presentacion=p.id_presentacion "
                +"ORDER BY dn.cns_det_nota asc;");
               c.getStatement().setString(1, nota_venta);
              res = c.getStatement().executeQuery();            
            while(res.next()){
                   tabla_mod.addRow(new Object[1]);
                 tabla_mod.setValueAt(res.getString(1), aux, 0); //id_articulo
                 tabla_mod.setValueAt(res.getString(2), aux, 1); //cantidad
                 tabla_mod.setValueAt(res.getString(3) +" "+res.getString(4), aux, 2); //descripción
                 tabla_mod.setValueAt(res.getString(5), aux, 3); //PU
                 tabla_mod.setValueAt(res.getString(6), aux, 4); //subtotal
                 tabla_mod.setValueAt(res.getString(7), aux, 5); //descuento
                 tabla_mod.setValueAt(res.getString(8), aux, 6); //sub_total
                 tabla_mod.setValueAt(res.getString(9), aux, 7); //iva
                 aux++;
                }
             return true;            
          }       
      } catch (Exception e) { 
          JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error durante la consulta!", JOptionPane.ERROR_MESSAGE);           
      }
    return false;
  }
  
  public void eliminarRegistro(javax.swing.table.DefaultTableModel tabla_mod, String id_articulo){
      try {
          if(c.hayConexion()){
            c.getScrollableStatement().executeUpdate("UPDATE notas SET cant_tot="+cantidad+",subtotal="+subtotal+",descuento="+descuento+",sub_total="+sub_total+",iva="+iva+",total="+total+" WHERE nota_venta='"+nota_venta+"';");
            c.getScrollableStatement().executeUpdate("DELETE FROM detalle_nota where nota_venta='"+nota_venta+"' and id_articulo="+id_articulo+";");
          }
      } catch (Exception e) { System.out.println("Eliminar:"+e.getMessage()); }
  }
  
  public void actualizarRegistro(javax.swing.table.DefaultTableModel tabla_mod, int pos){
     try {
          if(c.hayConexion()){
            c.getScrollableStatement().executeUpdate("UPDATE notas SET cant_tot=cant_tot-"+tabla_mod.getValueAt(pos, 1)+",subtotal="+subtotal+",descuento="+descuento+",sub_total="+sub_total+",iva="+iva+",total="+total+" WHERE nota_venta='"+nota_venta+"';");
            c.getScrollableStatement().executeUpdate("UPDATE detalle_nota SET cantidad=where nota_venta='"+nota_venta+"' and id_articulo="+tabla_mod.getValueAt(pos, 0)+";");
          }
      } catch (Exception e) { System.out.println("Actualizar:"+e.getMessage()); }
  }
  
  public void setTablaArticulos(JTable tabla){
     this.tabla = tabla;
     modelo = (DefaultTableModel) tabla.getModel();     
     aux=0;
  }
  
  public boolean conseguirNotaParaFacturar(){
    try {
        busqueda=false;
          aux=tabla.getRowCount();
          if(c.hayConexion()){
              c.setStatement("SELECT arts.id_articulo,dn.cantidad,arts.descripcion,p.descripcion_p,(arts.precio_venta/(1+arts.iva_venta)),((arts.precio_venta/(1+arts.iva_venta))*arts.iva_venta) "
                        +"FROM  detalle_nota dn, articulos arts,presentacion p "
                        +"WHERE nota_venta=? AND dn.id_articulo=arts.id_articulo and arts.id_presentacion=p.id_presentacion "
                        +"ORDER BY dn.cns_det_nota asc;");
               c.getStatement().setString(1, nota_venta);
              res = c.getStatement().executeQuery();            
            while(res.next()){
                articulo.setId_articulo(res.getString("id_articulo"));                  
                if(!articulo.buscarEnTabla(tabla, res.getString("cantidad"))){
                   modelo.addRow(new Object[1]);              
                 tabla.setValueAt(res.getInt("id_articulo"), aux, 0);              
                 tabla.setValueAt(res.getInt("cantidad"), aux, 1);   
                 tabla.setValueAt(res.getString(3) +" ("+res.getString(4)+")", aux, 2);
                 tabla.setValueAt(Matematicas.redondear(res.getDouble(5),2), aux, 3);
                 tabla.setValueAt(Matematicas.redondear(res.getDouble(6),2), aux, 4);
                 tabla.setValueAt(Matematicas.redondear(res.getInt("cantidad")*res.getDouble(5),2), aux, 5);
                 aux++;
                }
              busqueda=true;
            }
          }       
      } catch (Exception e) {           
          JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error durante la consulta!", JOptionPane.ERROR_MESSAGE);           
      }
    return busqueda;
  }
  
  public boolean conseguirVariasNotas(String fecha_i, String fecha_f){
    try {
        busqueda=false;
          aux=tabla.getRowCount();
          if(c.hayConexion()){
              c.setStatement("SELECT arts.id_articulo,dn.cantidad,arts.descripcion,p.descripcion_p,dn.precio_venta,dn.iva_venta,n.nota_venta "
                +"FROM  notas n, detalle_nota dn, articulos arts,presentacion p "
                +"WHERE n.nota_venta=dn.nota_venta AND n.id_cliente=? AND (fecha between ? AND ?) AND dn.id_articulo=arts.id_articulo and arts.id_presentacion=p.id_presentacion "
                +"ORDER BY dn.cns_det_nota asc;");
               c.getStatement().setInt(1, id_cliente);
               c.getStatement().setDate(2, Fecha.getFecha(fecha_i));
               c.getStatement().setDate(3, Fecha.getFecha(fecha_f));
              res = c.getStatement().executeQuery();
            while(res.next()){
                articulo.setId_articulo(res.getString(1));
                if(!articulo.buscarEnTabla(tabla, res.getString("cantidad"))){
                   modelo.addRow(new Object[1]);              
                 tabla.setValueAt(res.getInt(1), aux, 0);              
                 tabla.setValueAt(res.getInt(2), aux, 1);   
                 tabla.setValueAt(res.getString(3) +" ("+res.getString(4)+")", aux, 2);
                 tabla.setValueAt(res.getDouble(5), aux, 3);
                 tabla.setValueAt(res.getDouble(6), aux, 4);
                 tabla.setValueAt(res.getInt(2)*res.getDouble(5), aux, 5);
                 tabla.setValueAt(res.getString(7), aux, 6);
                 aux++;
                }
              busqueda=true;
            }
          }       
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error durante la consulta!", JOptionPane.ERROR_MESSAGE); }
    return busqueda;
  }
  
  public String getNumNotas(String fecha_i, String fecha_f){
      String notas="";
      try {
          if(c.hayConexion()){
              c.setStatement("SELECT nota_venta FROM notas WHERE id_cliente=? AND fecha BETWEEN ? AND ?;");
              c.getStatement().setInt(1, id_cliente);
              c.getStatement().setDate(2, Fecha.getFecha(fecha_i));
              c.getStatement().setDate(3, Fecha.getFecha(fecha_f));
            res = c.getStatement().executeQuery();
            while(res.next()){
              notas+=res.getString(1)+",";
            }
          }
          res.close();
          res=null;
      } catch (Exception e) {    }
    return notas;
  }
  
  public boolean eliminarNota(){
      try {
          busqueda=false;
          if(c.hayConexion()){
            c.getScrollableStatement().executeUpdate("DELETE from detalle_nota where nota_venta='"+nota_venta+"';");
            c.getScrollableStatement().executeUpdate("DELETE from notas where nota_venta='"+nota_venta+"';");
            busqueda=true;
          }
      } catch (Exception e) { System.out.println("error al intentar eliminar la nota...."+e.getMessage());  }
      return busqueda;
  }
  
//  public void getTotalSumaNotas(String fecha_i, String fecha_f){
//    try {
//       if(c.hayConexion()){
//         res = c.getScrollableStatement().executeQuery("select sum(subtotal),sum(descuento),sum(sub_total),sum(iva),sum(total) from notas where fecha between '"+fecha_i+"' and '"+fecha_f+"';");
//         if(res.next()){
//            sub_total = res.getDouble(1);
//            descuento = res.getDouble(2);
//            subtotal = res.getDouble(3);
//            iva = res.getDouble(4);
//            total = res.getDouble(5);
//         }
//       }
//       c.desconectar();
//       res.close();
//      } catch (Exception e) { System.out.println("No se pudo hacer la sumatoria de todas las notas...."+e.getMessage());  }
//  }
  
  public void notasPreventa(javax.swing.table.DefaultTableModel tabla){
      if(tabla.getRowCount()>0)
          for(aux=tabla.getRowCount()-1; aux>=0; aux--) //iniciar la tabla con cero filas...
              tabla.removeRow(aux);
      try {
          if(c.hayConexion()){
             res = c.getScrollableStatement().executeQuery("select nota_venta,total,id_estatus from notas where id_ruta="+id_ruta+" and fecha='"+fecha+"' order by nota_venta;");
             aux=0;
             while(res.next()){
               tabla.addRow(new Object[1]);
               tabla.setValueAt(res.getString(1), aux, 0);
               tabla.setValueAt(res.getString(2), aux, 1);
               tabla.setValueAt(res.getString(3), aux, 2);
               aux++;
             }
          }
      } catch (Exception e) {   }
  }
  
  public void actualizarEstatus(javax.swing.table.DefaultTableModel tablita){
    try {
          if(c.hayConexion()){
             for(aux=0; aux<tablita.getRowCount(); aux++){
               c.getScrollableStatement().executeUpdate("UPDATE notas SET id_estatus="+tablita.getValueAt(aux, 2)+" where nota_venta='"+tablita.getValueAt(aux, 0)+"';");
             }
          }
      } catch (Exception e) {  System.out.println(e.getMessage());   }
  }
  
  public void actualizarEstatus(){
    try {
          if(c.hayConexion()){
                            c.getScrollableStatement().executeUpdate("UPDATE notas SET id_estatus="+id_estatus+" where nota_venta='"+nota_venta+"';");
          }
      } catch (Exception e) {  System.out.println(e.getMessage());   }
  }
  
}
