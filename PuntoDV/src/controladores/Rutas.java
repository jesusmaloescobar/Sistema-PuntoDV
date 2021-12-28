package controladores;

import java.sql.ResultSet;

/**
 *
 * @author Jesus Malo
 */
public class Rutas {
private ResultSet res;
private String aux;
ConexionDB con;
private String nombre_ruta;
private int id_ruta=0, fila, id_trabajador;

public Rutas(){
  con = new ConexionDB();
}

 public void setIdRuta(int id){
   id_ruta = id;
 }
 public void setIdTrabajador(int id){
   id_trabajador = id;
 }
 public void setNomRuta(String n){
    nombre_ruta = n.toUpperCase();
 }
 
 public int getIdRuta(){
   return id_ruta;
 }
 public int getIdTrabajador(){
  return id_trabajador;
 }
 public String getNombreRuta(){
   return nombre_ruta;
 }
 
 public void desconectar(){
   con.desconectar();
 }
 
    public void grabarRuta(){
       try {
            if(con.hayConexion()){
                con.setStatement("INSERT INTO ruta(id_trabajador,descripcion) values(?,?);");              
                con.getStatement().setInt(1, id_trabajador);
                con.getStatement().setString(2, nombre_ruta);
                con.getStatement().executeUpdate();
            }
            res.close();
            res=null;            
        } catch (Exception e) { System.out.println(e.getMessage());   }
    }
    
    public void getRutas(javax.swing.JComboBox combo){
      combo.removeAllItems();
        try {
            if(con.hayConexion()){
              res = con.getScrollableStatement().executeQuery("select descripcion from ruta order by id_ruta;");
              while(res.next()){
                combo.addItem(res.getString(1));
              }
              res.close();
            }            
        } catch (Exception e) { e.printStackTrace();   }
    }

    
    public String getResponsable(){
        try {
            ResultSet resu=null;
           if(con.hayConexion()){               
             resu = con.getScrollableStatement().executeQuery("select id_ruta,e.nombre from ruta, empleado e where id_ruta="+id_ruta+" and id_trabajador=e.id_empleado;");
             if(resu.next())
                 nombre_ruta = resu.getString(2);
           }          
          resu.close();          
          resu = null;
        } catch (Exception e) { System.out.println(e.getMessage()); }
        return nombre_ruta;
    }

    public String getNomRuta(){
       try {
           if(con.hayConexion()){
             res = con.getScrollableStatement().executeQuery("select descripcion from ruta where id_ruta="+id_ruta+";");
             if(res.next())
                 aux = res.getString("descripcion");
           }
          res.close();
          res = null;
        } catch (Exception e) { }       
       return aux;
    }
    
    public void getRutasList(javax.swing.table.DefaultTableModel tabla){
       try {
           if(tabla.getRowCount()>0)
               for(fila=tabla.getRowCount()-1; fila>=0; fila--)
                   tabla.removeRow(fila);
           fila=0;
           if(con.hayConexion()){
             res = con.getScrollableStatement().executeQuery("select * from ruta order by id_ruta;");
             while(res.next()){
                 tabla.addRow(new Object[1]);
                 tabla.setValueAt(res.getString(1), fila, 0);
                 tabla.setValueAt(res.getString(2), fila, 1);
                 tabla.setValueAt(res.getString(3), fila, 2);
                 fila++;
             }
           }
          res.close();
          res = null;
        } catch (Exception e) { }
    }
    
    public void actualizarRuta(){
       try {
           if(con.hayConexion()){
               con.setStatement("UPDATE ruta set id_trabajador=?,descripcion=? WHERE id_ruta=?;");
               con.getStatement().setInt(1, id_trabajador);
               con.getStatement().setString(2, nombre_ruta);
               con.getStatement().setInt(3, id_ruta);
               con.getStatement().executeUpdate();
           }          
        } catch (Exception e) { System.out.println("error:"+e.getMessage());
       }
    }

}
