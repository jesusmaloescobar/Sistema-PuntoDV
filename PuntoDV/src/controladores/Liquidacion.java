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
public class Liquidacion {
    ConexionDB c;
    ResultSet res;
    private String nota_venta;
    int aux;
    double monto;
    
    public Liquidacion(){
      c = new ConexionDB();
    }
    public void setNoFactura(String nf){
      nota_venta = nf;
    }
    public void setMonto(double m){
      monto = m;
    }
    public void desconectar(){
      c.desconectar();      
    }
    
    public void registrarPago(javax.swing.JTable tabla){
      try {
           if(c.hayConexion()){               
            c.getScrollableStatement().executeUpdate("insert into pago_notas(fecha_pago,nota_venta,cns_pago,importe) values('"+tabla.getValueAt(tabla.getRowCount()-1, 0)+"','"+nota_venta+"',"+tabla.getRowCount()+","+tabla.getValueAt(tabla.getRowCount()-1, 2)+");");
            if(Double.parseDouble(tabla.getValueAt(tabla.getRowCount()-1, 3).toString())==0)
              c.getScrollableStatement().executeUpdate("UPDATE notas set id_estatus=1 WHERE nota_venta='"+nota_venta+"';");
           }
        } catch (Exception e) {            
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error al registrar el pago", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void getPagos(javax.swing.table.DefaultTableModel tabla){
        try {
           if(tabla.getRowCount()>0)
               for(aux=tabla.getRowCount()-1; aux>=0; aux--)
                   tabla.removeRow(aux);
           if(c.hayConexion()){
            c.setStatement("select *from pago_notas where nota_venta=? order by cns_pago;");
            c.getStatement().setString(1, nota_venta);
            res = c.getStatement().executeQuery();
            aux=0;
            if(res.next()){
             tabla.addRow(new Object[1]);
             tabla.setValueAt(monto, 0, 1);
             tabla.setValueAt(res.getString("fecha_pago"), aux, 0);
             tabla.setValueAt(res.getString("importe"), aux, 2);
             tabla.setValueAt(Matematicas.redondear(monto-res.getDouble("importe"),2), aux, 3);
             aux++;
            }
            while(res.next()){
              tabla.addRow(new Object[1]);
              tabla.setValueAt(res.getString("fecha_pago"), aux, 0); //fecha del pago
              tabla.setValueAt(tabla.getValueAt(tabla.getRowCount()-2, 3), aux, 1); //monto a pagar
             tabla.setValueAt(res.getString("importe"), aux, 2); //importe realizado
             tabla.setValueAt(Matematicas.redondear(Double.parseDouble(tabla.getValueAt(tabla.getRowCount()-2, 3).toString())-res.getDouble("importe"),2), aux, 3); //restante
              aux++;
            }
           }
           res.close();
           res = null;
        } catch (Exception e) {            
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en la consulta de los pagos", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void cancelarNota(){
        try {
            if(c.hayConexion()){
              c.getScrollableStatement().executeUpdate("UPDATE notas set id_estatus=3 WHERE nota_venta='"+nota_venta+"';");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar cancelar la nota", "Error al cancelar", JOptionPane.ERROR_MESSAGE);
        }
    }
}
