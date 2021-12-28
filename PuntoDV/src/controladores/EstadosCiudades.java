package controladores;

import java.sql.ResultSet;

/**
 *
 * @author Jesus Malo 13 abril 2011
 */
public class EstadosCiudades {
 private int fila;
 private ConexionDB c=null;
 private ResultSet res;
 private String estado,ciudad;
 private int id_ciudad;
 
 public EstadosCiudades(){
    c = new ConexionDB();
 }

 public void setEstado(String est){
   estado = est.toUpperCase();
 }

 public void setCiudad(String ciud){
   ciudad = ciud.toUpperCase();
 }

 public String getEstado(){
   return estado;
 }

 public String getCiudad(){
   return ciudad;
 }
 public int getIdCiudad(){
   return id_ciudad;
 }
 public void desconectar(){
   c.desconectar();   
 }

 public void grabarEstado(){
        try {
           if(c.hayConexion()){
               c.setStatement("insert into estado(descripcion) values(?)");
               c.getStatement().setString(1, estado);
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
 }

 public void grabarCiudad(int id_estado, String ciudad){
        try {
            if(c.hayConexion()){
                c.setStatement("insert into ciudad(id_estado,descripcion) values(?,?)");
                c.getStatement().setInt(1, id_estado);
                c.getStatement().setString(2, ciudad.toUpperCase());
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
 }

 public void actualizarEstado(int id_e){
    try {
            if(c.hayConexion()){
                c.setStatement("update estado set descripcion=? where id_estado=?;");
                c.getStatement().setString(1, estado);
                c.getStatement().setInt(2, id_e);
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
 }
 
 public void actualizarCiudad(int id_c){
    try {
            if(c.hayConexion()){
                c.setStatement("UPDATE ciudad SET descripcion=? WHERE id_ciudad=?;");
                c.getStatement().setString(1, ciudad);
                c.getStatement().setInt(2, id_c);
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
 }

  public void getEstados(javax.swing.JComboBox combo){
      try {
          if(c.hayConexion()){
            combo.removeAllItems();
            res = c.getScrollableStatement().executeQuery("select descripcion from estado order by id_estado;");
            while(res.next()){
              combo.addItem(res.getString(1));
            }            
            res.close();
            res=null;
          }
      } catch (Exception e) { System.out.println("error:"+e.getMessage());
      }
  }

  public void getCiudades(javax.swing.JComboBox combo, int id_estado){
     try {
          if(c.hayConexion()){
            combo.removeAllItems();              
            res = c.getScrollableStatement().executeQuery("select descripcion from ciudad where id_estado="+id_estado+" order by id_ciudad;");
            while(res.next()){
              combo.addItem(res.getString(1));
            }
            res.close();
            res=null;
          }
      } catch (Exception e) { System.out.println("error:"+e.getMessage());
      }
  }

  public void getEstados(javax.swing.table.DefaultTableModel estados){
     try {
          if(estados.getRowCount()>0)
              for(fila=estados.getRowCount()-1; fila>=0; fila--)
                 estados.removeRow(fila);
          fila=0;
          if(c.hayConexion()){
           res = c.getScrollableStatement().executeQuery("select * from estado order by descripcion;");
            while(res.next()){
              estados.addRow(new Object[1]);
              estados.setValueAt(res.getString(1), fila, 0);
              estados.setValueAt(res.getString(2), fila, 1);
              fila++;
            }            
            res.close();
            res=null;
          }
      } catch (Exception e) { System.out.println("error:"+e.getMessage());
      }
  }

  public void getCiudades( javax.swing.table.DefaultTableModel ciudades ){
     try {
          if(ciudades.getRowCount()>0)
              for(fila=ciudades.getRowCount()-1; fila>=0; fila--)
                 ciudades.removeRow(fila);
          fila=0;
          if(c.hayConexion()){
            res = c.getScrollableStatement().executeQuery("select id_estado,id_ciudad,descripcion from ciudad order by id_estado,descripcion;");
            fila=0;
            while(res.next()){
              ciudades.addRow(new Object[1]);
              ciudades.setValueAt(res.getString(1), fila, 0);
              ciudades.setValueAt(res.getString(2), fila, 1);
              ciudades.setValueAt(res.getString(3), fila, 2);
              fila++;
            }
            res.close();
            res=null;
          }
      } catch (Exception e) { System.out.println("error:"+e.getMessage());  }
  }
  
  public void getIdCiudad(int id_e, String nom_cid){
      try {
          if(c.hayConexion()){
            res = c.getScrollableStatement().executeQuery("select id_ciudad from ciudad where id_estado="+id_e+" and descripcion='"+nom_cid+"';");
            res.next();
            id_ciudad=res.getInt(1);
          }
          res.close();
          res=null;
      } catch (Exception e) {
          System.out.println("error:"+e.getMessage());
      }
  }

}
