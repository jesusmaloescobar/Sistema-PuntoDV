package controladores;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Articulo {
  private int num_registro, id_presentacion, aux;
  private String id_articulo,descripcion,descr_pres, fecha_caducidad;  
  private double precio_compra,
                 iva_c=Impuestos.getIVAenCActual()*0.01,                 
                 precio_venta, 
                 iva_v=Impuestos.getIVAenVActual()*0.01,                  
                 total_arts;
  private float existencia;
private ResultSet res=null;
private ConexionDB c=null;
private JComboBox combo_articulos;    
    private boolean encontradono;    
    private double total_n,descuento_n,importe_n,iva_n;
    List<String> codigo;
    
  public Articulo(){
    c = new ConexionDB();
    codigo = new ArrayList<String>();
  }  
//SETs    
  public void setId_articulo(String id_art){
   id_articulo = id_art;
  }
  public void setNumRegistro(int reg){
   num_registro = reg;
  }
  public void setDescripcion(String descr){
   descripcion = descr.toUpperCase();
  }
  public void setPresentacion(int pres){
   id_presentacion = pres;
  }
  public void setDescrPresentacion(String dp){
    descr_pres = dp;
  }
  public void setPrecioCompra(double precio, double iva){
   precio_compra=precio;
   iva_c = iva;
  }
  public void setPrecioVenta(double precio, double iva){
   precio_venta = precio;
   iva_v = iva;
  }
  public void setExistencia(float exist){
    existencia = exist;
  }
  public void setFechaCaducidad(String fc){
    fecha_caducidad=fc;
  }
  public void setSelectedArt(int n_art){
    id_articulo = codigo.get(n_art);
  }
//GETs  
  public String getId_Articulo(){
    return id_articulo;
  }
  public int getNumRegistro(){
    return num_registro;
  }
  public String getDescripcion(){
    return descripcion;
  }
  public String getDescripcionPresentacion(){
    return descr_pres;
  }
  public int getPresentacionID(){
    return id_presentacion;
  }
  public double getPrecioCompra(){
    return precio_compra;
  }
  public double getPrecioCompraSinIVA(){
    return Matematicas.redondear(precio_compra/(1+iva_c),2);
  }
  public double getIvaCompra(){
    return Matematicas.redondear((precio_compra/(1+iva_c))*iva_c,2);
  }
  public double getPorcentajeIvaCompra(){
    return iva_c;
  }
//  public double getCostoTotal_compra(){
//    return total_c;
//  }
  public double getPrecioVenta(){ //precio de venta total con iva
    return precio_venta;
  }
  public double getPrecioVentaSinIva(){ //precio de venta sin iva
    return Matematicas.redondear(precio_venta/(1+iva_v),2);
  }
  public double getIvaVenta(){  //iva en compra de x articulo
    return Matematicas.redondear((precio_venta/(1+iva_v))*iva_v,2);
  }
  public double getPorcentajeIvaVenta(){ //% de iva en venta
    return iva_v;
  }
//  public double getCostoTotal_venta(){
//    return total_v;
//  }
  public float getExistencia(){
    return existencia;
  }
  public String getFechaCaducidad(){
    return fecha_caducidad;
  }
  public double getTotalArticulos(){
   return total_arts;
  }
  public void desconectar(){
    c.desconectar();    
  }

/* Registrar el artículo en el catálogo, guardar una entrada+detalle_entrada y cargarlo al inventario*/
  public boolean grabarArticulo(){
      try {
          if(c.hayConexion()){
            c.setStatement("insert into articulos values("+id_articulo+",?,"+precio_venta+","+iva_v+","+id_presentacion+");");
              c.getStatement().setString(1, descripcion);              
            c.getStatement().executeUpdate();
            
      if(existencia>0){ //si hay artículos iniciales los mandamos a inventario
            c.getScrollableStatement().executeUpdate("insert into entradas(cantidad,subtotal,descuento,sub_total,iva,total) values("+existencia+","+(getPrecioCompraSinIVA()*existencia)+",0,"+(getPrecioCompraSinIVA()*existencia)+","+(getPrecioCompraSinIVA()*existencia)*iva_c+","+(precio_compra*existencia)+");");
            res = c.getScrollableStatement().executeQuery("select last_value from sig_entrada;");
              res.next();
            c.getScrollableStatement().executeUpdate("insert into detalle_entrada(cns_ent,id_articulo,cantidad,precio_compra,iva_c) values("+res.getInt(1)+","+id_articulo+","+existencia+","+precio_compra+","+iva_c+");");
           
             c.setStatement("insert into inventario(cns_ent,id_articulo,precio_compra,iva_c,existencia,fecha_caducidad) values("+res.getInt(1)+","+id_articulo+","+precio_compra+","+iva_c+","+existencia+",?);");
              c.getStatement().setDate(1, Fecha.getFecha(fecha_caducidad));
             c.getStatement().executeUpdate();
      }
          }
          res.close();
          res=null;
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE); }
      return false;
  }
    
  public void setComboBox(JComboBox cb){
    combo_articulos = cb;
  }

  public void mostrarEnCombo(ResultSet res){
      try {          
          combo_articulos.removeAllItems();
          codigo.clear(); //arreglo para guardar el codigo de los productos encontrados
          while(res.next()){
            combo_articulos.addItem(res.getString(2)+" "+res.getString(3)+" $"+res.getDouble(4));
            codigo.add(res.getString(1));
          }
          combo_articulos.showPopup();          
      } catch (Exception e) { System.out.println("Error en mostrarEnCombo()"+e.getMessage());  }
  }
  
  public boolean estaRegistrado(){
   try {
          encontradono=false;
          if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("SELECT * from articulos where id_articulo="+id_articulo+";");
           if(res.next())
               encontradono=true;           
          }
          res.close();
          res=null;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE);} 
    return encontradono;
  }

  public boolean buscarArticuloPorID(){
      try {
          encontradono=false;
          if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("SELECT a.id_articulo,a.descripcion,a.id_presentacion,p.descripcion_p as presentacion,i.precio_compra,i.iva_c,a.precio_venta,a.iva_venta,(select sum(existencia) from inventario where id_articulo=i.id_articulo) as existencia,i.fecha_caducidad "
                            +"FROM inventario i, articulos a, presentacion p "
                            +"WHERE i.id_articulo="+id_articulo+" AND i.id_articulo = a.id_articulo AND i.existencia>0 AND p.id_presentacion=a.id_presentacion "
                            +"ORDER BY i.id_articulo;");              
           if(res.next()){
               cargarCampos();
               encontradono=true;
           }
          }
          res.close();
          res=null;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE);}
      return encontradono;
  }
  
    public boolean buscarArticuloPorID_enTArticulos(){
      try {
          encontradono=false;
          if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("SELECT a.id_articulo,a.descripcion,a.id_presentacion,p.descripcion_p as presentacion,0.00,0.00,a.precio_venta,a.iva_venta,0,null "
                                                            +"FROM articulos a, presentacion p "
                                                            +"WHERE a.id_articulo="+id_articulo+" AND p.id_presentacion=a.id_presentacion;");
           if(res.next()){
               cargarCampos();
               encontradono=true;
           }
          }
          res.close();
          res=null;          
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE);}
      return encontradono;
  }
  

  public boolean buscarArticuloPorDescripcion(){
      try {
        encontradono=false;
         if(c.hayConexion()){
             res = c.getScrollableStatement().executeQuery("SELECT id_articulo,descripcion,descripcion_p as presentacion,precio_venta "
                            +"FROM articulos a, presentacion p "
                            +"WHERE a.descripcion like '%"+descripcion+"%' and a.id_presentacion=p.id_presentacion "
                            +"ORDER BY descripcion;");             
          if(res!=null){
             mostrarEnCombo(res);          
           encontradono=true;
          }
         }
        res.close();
        res=null;        
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE); }
    return encontradono;
  }

  public boolean actualizarArticulo(){
      try {
          if(c.hayConexion()){
            c.setStatement("update articulos set descripcion=?,precio_venta=?,iva_venta=?,id_presentacion=? WHERE id_articulo="+id_articulo+";");
              c.getStatement().setString(1, descripcion);
              c.getStatement().setDouble(2, precio_venta);
              c.getStatement().setDouble(3, iva_v);
              c.getStatement().setInt(4, id_presentacion);             
            c.getStatement().executeUpdate();
          }
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "error:"+e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE); }
      return false;
  }
  
  public boolean actualizarPrecioVenta(){
      try {
          if(c.hayConexion()){
            c.setStatement("update articulos set precio_venta=? WHERE id_articulo="+id_articulo+";");
              c.getStatement().setDouble(1, precio_venta);
            c.getStatement().executeUpdate();
          }
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "error:"+e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE); }
      return false;
  }
  public boolean actualizarIVAVenta(){
      try {
          if(c.hayConexion()){
            c.setStatement("update articulos set iva_venta=? WHERE id_articulo="+id_articulo+";");
              c.getStatement().setDouble(1, iva_v);
            c.getStatement().executeUpdate();
          }
          return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "error:"+e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE); }
      return false;
  }

  public void cargarCampos(){
      try{
         setId_articulo(res.getString(1));
         setDescripcion(res.getString(2));
         setPresentacion(res.getInt(3));
         setDescrPresentacion(res.getString(4));
         setPrecioCompra(res.getDouble(5), res.getDouble(6));
         setPrecioVenta(res.getDouble(7), res.getDouble(8));
         setExistencia(res.getInt(9));
         setFechaCaducidad(res.getString(10));
      }catch(Exception e){ System.out.println("error:"+e.getMessage());}
  }

  public boolean deleteFromInventario(){
      try {
         if(c.hayConexion()){
             c.getScrollableStatement().executeUpdate("delete from inventario where id_articulo="+id_articulo+";");
         }
        return true;
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "ERROR!", JOptionPane.ERROR_MESSAGE); }
      return false;
  }
  
  
    int n_filas;
    private double auxi, dctoT;
    public void agregar_a_Tabla(javax.swing.table.DefaultTableModel tabla, String cantidad, String iva_art, String dcto){
      tabla.addRow(new Object[1]);
      n_filas = tabla.getRowCount()-1;
      tabla.setValueAt(getId_Articulo(), n_filas, 0); //id_articulo
      tabla.setValueAt(cantidad, n_filas, 1);//cantidad
      tabla.setValueAt(getDescripcion()+" "+getDescripcionPresentacion(), n_filas, 2);//descripcion
       auxi = Double.parseDouble(iva_art); //%iva
         dctoT = Double.parseDouble(dcto);
         dctoT = dctoT/(1+auxi);
       auxi = getPrecioVenta()/(1+auxi); //calculo precio de venta sin iva
      tabla.setValueAt(Matematicas.redondear(auxi,2), n_filas, 3); //precio unitario
       auxi = auxi*Double.parseDouble(cantidad); //calculo total
      tabla.setValueAt(Matematicas.redondear(auxi,2), n_filas, 4); //asigna el total      
      tabla.setValueAt(dctoT, n_filas, 5); //descuento
       auxi = auxi - dctoT;//calculo importe
      tabla.setValueAt(Matematicas.redondear(auxi, 2), n_filas, 6); //asigno importe
       //auxi = auxi * Double.parseDouble(iva_art); //calculo iva
      tabla.setValueAt( Matematicas.redondear(auxi*Double.parseDouble(iva_art),2), n_filas, 7); //asigna el iva        
    }
  
    float totalAgregado, cant;
    public boolean buscarEnTabla(javax.swing.JTable tabla_a, String cantidad){
      for(aux=0; aux<tabla_a.getRowCount(); aux++){
        if(tabla_a.getValueAt(aux, 0).toString().equals(id_articulo)){
           cant = Float.parseFloat(cantidad); 
           tabla_a.setValueAt(Float.parseFloat(tabla_a.getValueAt(aux, 1).toString())+cant, aux, 1); //cantidad
           totalAgregado = Float.parseFloat(tabla_a.getValueAt(aux, 1).toString()); //suma la cantidad de articulos
           tabla_a.setValueAt( Matematicas.redondear(totalAgregado*Double.parseDouble(tabla_a.getValueAt(aux, 3).toString()),3), aux, 4); //calcula el importe
           tabla_a.setValueAt(Matematicas.redondear(Double.parseDouble(tabla_a.getValueAt(aux, 4).toString())*iva_v,3), aux, 5);
           return true;
        }
      }
      return false;
    }
    
    /** calcule los totales en la tabla*/
    public void calcularImportes(javax.swing.JTable tabla_articulos){
      total_n=0;descuento_n=0; importe_n=0; iva_n=0; total_arts=0;
       for(aux=0; aux<tabla_articulos.getRowCount(); aux++){
         total_n += Double.parseDouble(tabla_articulos.getValueAt(aux, 4).toString());
         descuento_n+=Double.parseDouble(tabla_articulos.getValueAt(aux, 5).toString());
         importe_n += Double.parseDouble(tabla_articulos.getValueAt(aux, 6).toString());
         iva_n+=Double.parseDouble(tabla_articulos.getValueAt(aux, 7).toString());
         total_arts += Double.parseDouble(tabla_articulos.getValueAt(aux, 1).toString());
       }
    }
    
    public void calcularImportes(javax.swing.JTable tabla_articulos, int columna_iva, int columna_importe){
      total_n=0; iva_n=0; total_arts=0;
       for(aux=0; aux<tabla_articulos.getRowCount(); aux++){
         iva_n += Double.parseDouble(tabla_articulos.getValueAt(aux, columna_iva).toString());
         total_n += Double.parseDouble(tabla_articulos.getValueAt(aux, columna_importe).toString());
         total_arts += Double.parseDouble(tabla_articulos.getValueAt(aux, 1).toString());
       }
    }
    
    public double getTSV(){ //total del subtotal de la venta
      return Matematicas.redondear(total_n,2);
    }
    public double getTivaV(){ //total del iva de la venta
      return Matematicas.redondear(iva_n,2);
    }
    public double getTDescuento(){ //total de descuento
      return Matematicas.redondear(descuento_n, 2);
    }
    public double getTImporte(){ //total importe de la venta
      return Matematicas.redondear(importe_n,2);
    }
    public double getTotalVenta(){
      return Matematicas.redondear(total_n+iva_n, 2);
    }
    
}