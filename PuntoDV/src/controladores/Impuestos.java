/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class Impuestos {
    private ConexionDB c;
    private ResultSet resultado;
    private static double tasa_iva_compras, tasa_iva_ventas;    
    
    public Impuestos(){
      c = new ConexionDB();
    }
    
     public void setTasaIva(double tc, double tv){
      tasa_iva_compras = tc;
      tasa_iva_ventas = tv;
    }
    
    public static double getIVAenCActual() {
        return tasa_iva_compras;
    }

    public static double getIVAenVActual() {
        return tasa_iva_ventas;
    }
    
    public void desconectar(){
      c.desconectar();
      c=null;
    }

    public void grabarNuevoImpuesto(){
      try {
          if(c.hayConexion()){
              c.setStatement("INSERT into ivas values(?,?,?);");
              c.getStatement().setInt(1, Fecha.getAño());
              c.getStatement().setDouble(2, tasa_iva_ventas);
              c.getStatement().setDouble(3, tasa_iva_compras);
              c.getStatement().executeUpdate();
          }
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE);}
    }
    
 public void getTasaIVA(){
    try {                    
          if(c.hayConexion()){
              c.setStatement("select * from ivas where anio=?;");
              c.getStatement().setInt(1, Fecha.getAño());
           resultado = c.getStatement().executeQuery();
           if(resultado.next()){
               setTasaIva(resultado.getDouble("iva_en_compras"), resultado.getDouble("iva_en_ventas"));
           }          
           c.desconectar();
           resultado.close();
           resultado=null;    
          }      
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE);}
    }
    
    public void actualizarIvas(int id_año){
      try {
          if(c.hayConexion()){
            c.setStatement("UPDATE ivas set iva_en_ventas=?, iva_en_compras=? WHERE anio=?");
             c.getStatement().setDouble(1, tasa_iva_ventas);
             c.getStatement().setDouble(2, tasa_iva_compras);
              c.getStatement().setInt(3, id_año);
              c.getStatement().executeUpdate();         
          }
      } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Error en la busqueda", JOptionPane.ERROR_MESSAGE);}
    }
    
   
    
    public void getTasaIVAList( javax.swing.table.DefaultTableModel tabla_tasa_iva ){
     try {
         int fila;
          if(tabla_tasa_iva.getRowCount()>0)
              for(fila=tabla_tasa_iva.getRowCount()-1; fila>=0; fila--)
                 tabla_tasa_iva.removeRow(fila);
          fila=0;
          if(c.hayConexion()){
            resultado = c.getScrollableStatement().executeQuery("SELECT * FROM ivas ORDER BY anio;");
            fila=0;
            while(resultado.next()){
              tabla_tasa_iva.addRow(new Object[1]);
              tabla_tasa_iva.setValueAt(resultado.getString(1), fila, 0);
              tabla_tasa_iva.setValueAt(resultado.getString(2), fila, 2);
              tabla_tasa_iva.setValueAt(resultado.getString(3), fila, 1);
              fila++;
            }
            resultado.close();
            resultado=null;
          }
      } catch (Exception e) { System.out.println("error:"+e.getMessage());  }
    }
}
