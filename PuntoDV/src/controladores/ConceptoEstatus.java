package controladores;

import java.sql.ResultSet;

/**
 *
 * @author Jesus Malo 21-Abril-2011
 */
public class ConceptoEstatus {
    private int fila;
    private ConexionDB c=null;
    private String concepto, estatus;
    ResultSet res;
    
    public ConceptoEstatus(){
     c = new ConexionDB();
    }
    
    public void setConcepto(String concept){
      concepto = concept.toUpperCase();
    }
    public void setEstatus(String est){
      estatus = est.toUpperCase();
    }
    
    public String getConcepto(){
      return concepto;
    }
    public String getEstatus(){
      return estatus;
    }
    public void desconectar(){
      c.desconectar();
      c=null;
    }
    public void grabarConcepto(){
        try {
            if(c.hayConexion()){
                c.setStatement("insert into concepto_de_factura(descripcion) values(?)");
                 c.getStatement().setString(1, concepto);
                c.getStatement().executeUpdate();              
            }
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
    }

    public void grabarEstatus(){
         try {
            if(c.hayConexion()){
                c.setStatement("insert into estatus_de_factura(descripcion) values(?)");
                 c.getStatement().setString(1, estatus);
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
    }

    public void actualizarConcepto(int id_c){

    }

    public void actualizarEstatus(int id_e){
    
    }

   public void getConceptos(javax.swing.table.DefaultTableModel concepts){
     try {
          if(concepts.getRowCount()>0)
              for(fila=concepts.getRowCount()-1; fila>=0; fila--)
                 concepts.removeRow(fila);
          fila=0;
          if(c.hayConexion()){              
            res = c.getScrollableStatement().executeQuery("select * from concepto_de_factura order by cns_c;");
            while(res.next()){
              concepts.addRow(new Object[1]);
              concepts.setValueAt(res.getString(1), fila, 0);
              concepts.setValueAt(res.getString(2), fila, 1);
              fila++;
            }
            res.close();
            res=null;
          }
      } catch (Exception e) { System.out.println("error:"+e.getMessage());
      }
  }

  public void getEstatus( javax.swing.table.DefaultTableModel estatus ){
     try {
          if(estatus.getRowCount()>0)
              for(fila=estatus.getRowCount()-1; fila>=0; fila--)
                 estatus.removeRow(fila);
          fila=0;
          if(c.hayConexion()){              
            res = c.getScrollableStatement().executeQuery("select * from estatus_de_factura order by cns_e;");
            fila=0;
            while(res.next()){
              estatus.addRow(new Object[1]);
              estatus.setValueAt(res.getString(1), fila, 0);
              estatus.setValueAt(res.getString(2), fila, 1);             
              fila++;
            }
            res.close();
            res=null;
          }
      } catch (Exception e) { System.out.println("error:"+e.getMessage());  }
  }
}
