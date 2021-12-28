
package controladores;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Jesus Malo 02:26 p.m 11-07-2011
 */
public class Mobiliario {
     private int id_mob,existencia;
     String descripcion,modelo,marca,logo;
     ConexionDB c;
     ResultSet res;
    private boolean encontradono;
    private javax.swing.JComboBox combomob; 
    List<Integer> codigo;
    
     public Mobiliario(){
       c = new ConexionDB();
       codigo = new ArrayList<Integer>();
     }
     //SETs
     public void setIdMobilario(int id){
       id_mob = id;
     }
     public void setDescripcion(String descr){
       descripcion = descr.toUpperCase();
     }
     public void setModelo(String mod){
       modelo = mod.toUpperCase();
     }
     public void setExistencia(int ext){
       existencia = ext;
     }
     public void setMarca(String m){
       marca = m.toUpperCase();
     }
     public void setLogo(String l){
       logo = l.toUpperCase();
     }
     //GETs
     public int getIdMobiliario(){
       return id_mob;
     }
     public int getSigID(){
       return ++id_mob;
     }     
     public String getDescripcion(){
       return descripcion;
     }
     public String getModelo(){
       return modelo;
     }
     public int getExistencia(){
       return existencia;
     }
     public String getMarca(){
       return marca;
     }
     public String getLogo(){
       return logo;
     }
     
     public void setComboBox(javax.swing.JComboBox cb){
       combomob = cb;
     }
     
     public boolean registrar(){
       try {
          if(c.hayConexion()){
            c.getScrollableStatement().executeUpdate("insert into mobiliario_y_equipo values("+id_mob+",'"+descripcion+"','"+modelo+"','"+marca+"','"+logo+"',"+existencia+");");
            return true;
          }
       } catch (Exception e) { System.out.println(e.getMessage());}
       return false;
     }
     
     public boolean buscarPorID(){
       try {
          if(c.hayConexion()){              
            res = c.getScrollableStatement().executeQuery("select *from mobiliario_y_equipo where id_mob="+id_mob+";");
            if(res.next()){
              id_mob = res.getInt("id_mob");
              descripcion = res.getString("descripcion");
              modelo = res.getString("modelo");
              existencia = res.getInt("existencia");
              marca = res.getString("marca");
              logo = res.getString("logo");
              res.close();
              res = null;
              return true;
            }
          }
       } catch (Exception e) { e.printStackTrace();}
       return false;
     }
     public boolean actualizar(){
       try {
          if(c.hayConexion()){
            c.getScrollableStatement().executeUpdate("update mobiliario_y_equipo set descripcion='"+descripcion+"',modelo='"+modelo+"',existencia="+existencia+",marca='"+marca+"',logo='"+logo+"' where id_mob="+id_mob+";");
            return true;
          }          
       } catch (Exception e) {System.out.println(e.getMessage());}
       return false;
     }

    public void desconectar() {
        c.desconectar();
    }

    public void ultimoRegistroID(){
      try {
          if(c.hayConexion()){
            res = c.getScrollableStatement().executeQuery("select max(id_mob) from mobiliario_y_equipo;");
            if(res.next())
                id_mob=res.getInt(1);
            else
                id_mob=0;
          }
       } catch (Exception e) {System.out.println(e.getMessage());}
    }
    
    public boolean buscarMobiliarioPorDescripcion(){
      try {
        encontradono=false;
         if(c.hayConexion()){
             res = c.getScrollableStatement().executeQuery("SELECT id_mob,descripcion,modelo,marca,logo "
                            +"FROM mobiliario_y_equipo "
                            +"WHERE descripcion like '%"+descripcion+"%' "
                            +"ORDER BY descripcion;");
          if(res!=null){
           if(combomob!=null){
             mostrarEnCombo(res);
           }
           encontradono=true;
          }
         }
        res.close();
        res=null;        
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE); }
    return encontradono;
  }
    
    public void mostrarEnCombo(ResultSet res){
      try {          
          combomob.removeAllItems();
          codigo.clear();          
          while(res.next()){
            combomob.addItem(res.getString(2)+" "+res.getString(3)+" "+res.getString(4)+" "+res.getString(5));
            codigo.add(res.getInt(1));            
          }
          combomob.showPopup();          
      } catch (Exception e) { System.out.println("Error en mostrarEnCombo()"+e.getMessage());  }
  }
    
    public void setSelectedMob(int n_art){
      id_mob = codigo.get(n_art);
    }
    
}
