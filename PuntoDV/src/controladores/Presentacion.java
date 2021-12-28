/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package controladores;

import java.sql.ResultSet;
import javax.swing.JComboBox;

/**
 *
 * @author Jesus Malo
 */
public class Presentacion {
ConexionDB con;
ResultSet res;
private String presentacion;
private int fila, id_pres;

public Presentacion(){
  con = new ConexionDB();
}

  public void setIdPresentacion(int id_p){
    id_pres = id_p;
  }
  
  public void setPresentacion(String pres){
    presentacion = pres.toUpperCase();
  }
  
  public String getPresentacion(){
    return presentacion;
  }
  
  public int getIdPresentacion(){
    return id_pres;
  }
  
  public void desconectar(){
    con.desconectar();
    con = null;
  }

  public void registrarPresentacion(){
      try {
          if(con.hayConexion()){
              con.setStatement("insert into presentacion(descripcion_p) values(?)");
              con.getStatement().setString(1, presentacion);
            con.getStatement().executeUpdate();
          }
      } catch (Exception e) {
          System.out.println("Error:"+e.getMessage());
      }
  }

  public void getPresentaciones(JComboBox c){
      try {
          c.removeAllItems();
          if(con.hayConexion()){
            res = con.getScrollableStatement().executeQuery("select descripcion_p from presentacion ORDER BY id_presentacion;");
            while(res.next()){
              c.addItem(res.getString(1));
            }
            res.close();
          }
          res.close();
          res=null;          
      } catch (Exception e) {
      }
  }
  
   public void getPresentaciones(javax.swing.table.DefaultTableModel tabla){
      try {
          if(tabla.getRowCount()>0)
              for(fila=tabla.getRowCount()-1; fila>=0; fila--)
                 tabla.removeRow(fila);
          if(con.hayConexion()){
            res = con.getScrollableStatement().executeQuery("select * from presentacion ORDER BY id_presentacion;");
            fila=0;
            while(res.next()){
              tabla.addRow(new Object[1]);
              tabla.setValueAt(res.getString(1), fila, 0);
              tabla.setValueAt(res.getString(2), fila, 1);
              fila++;
            }
            res.close();
          }
          res.close();
          res=null;          
      } catch (Exception e) {  }
  }

    public void actualizarPresentacion(int id_pres) {
        try {
          if(con.hayConexion()){
              con.setStatement("UPDATE presentacion set descripcion_p=? WHERE id_presentacion=?;");
              con.getStatement().setString(1, presentacion);
              con.getStatement().setInt(2, id_pres);
              con.getStatement().executeUpdate();
          }
      } catch (Exception e) {
          System.out.println("Error:"+e.getMessage());
      }
    }
         
}