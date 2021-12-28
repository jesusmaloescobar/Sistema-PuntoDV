
package controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Malo 08/abril/2011
 */
public class Cliente {
    
    private String nombre, direccion,RFC, ciudad,edo, telefono, negocio,frecuentado;
    private int id_cliente, dias_plazo, id_ciudad,id_estado, id_ruta, aux, prioridad,giro_empresa;
    private double limite_de_credito;    
    boolean busqueda;
    ConexionDB c = null;
    ResultSet res;    
    PreparedStatement pstmt;
    
    public Cliente(){
      c = new ConexionDB();
    }
    public void setID(int id_cliente){
      this.id_cliente = id_cliente;
    }
    
    public void setNombre(String nombre){
     this.nombre = nombre.toUpperCase();
    }
    public void setNegocio(String nom){
      negocio = nom.toUpperCase();
    }
    public void setDireccion(String dir){
      direccion = dir.toUpperCase();
    }
    
    public void setRFC(String RFC){
       this.RFC = RFC.toUpperCase();
    }
    
    public void setTelefono(String telefono){
      this.telefono = telefono;
    }
    
    public void setID_ciudad(int id_c){
     id_ciudad = id_c;
    }
    public void setCiudad(String ciud){
      ciudad = ciud;
    }
    public void setEstado(String estado){
      edo = estado;
    }
    public void setIdEstado(int id_e){
      id_estado = id_e;
    }
    public void setLimiteCredito(double lc){
     limite_de_credito = lc;
    }
    public void setDiasPlazo(int dias){
     dias_plazo = dias;
    }
    public void setId_Ruta(int id){
     id_ruta = id;
    }
    public void setPrioridad(int prior){
      prioridad = prior;
    }
    public void setGiroEmpresa(int giro){
      giro_empresa = giro;
    }
    public void setFrecuentado(String frec){
      frecuentado = frec;
    }
    
    //getes
    public int getID(){
      return id_cliente;
    }    
    public String getNombre(){
     return nombre;
    }    
    public String getNegocio(){
      return negocio;
    }
    public String getDireccion(){
      return direccion;
    }    
    public String getRFC(){
       return RFC;
    }    
    public String getTelefono(){
      return telefono;
    }    
    public int getID_ciudad(){
      return id_ciudad;
    }
    public String getCiudad(){
     return ciudad;
    }
    public int getIdEstado(){
     return id_estado;
    }
    public String getEdo(){
     return edo;
    }
    public double getLimiteCredito(){
      return limite_de_credito;
    }
    public int getDiasPlazo(){
      return dias_plazo;
    }
    public int getId_Ruta(){
      return id_ruta;
    }
    public int getGiroEmpresa(){
      return giro_empresa;
    }
    public int getPrioridad(){
      return prioridad;
    }
    public String getFrecuentado(){
      return frecuentado;
    }
    public void desconectar(){
      c.desconectar();
      //c=null;
    }
  //consultas
    public boolean buscarClientePorID(){
        try {
            busqueda=false;
            if(c.hayConexion()){
                c.setStatement("SELECT id_cliente,nombre,negocio,direccion,rfc,telefono,c.id_ciudad,limite_credito,dias_credito,id_estado,descripcion as ciudad,id_ruta,id_ruta,prioridad,frecuentado,id_actividad,fecha_registro from clientes c, ciudad ci where id_cliente=? and c.id_ciudad=ci.id_ciudad");
                c.getStatement().setInt(1, id_cliente);
                res = c.getStatement().executeQuery();
             if(res.next()){
               cargarInformacion(res);
               ciudad=res.getString("ciudad");
               id_estado=res.getInt("id_estado");
               busqueda=true;
             }
            }
            pstmt.close();
            pstmt=null;
            res.close();
            res=null;            
        } catch (Exception e) {}
        return busqueda;
    }

    public boolean buscarClientePorNombre(JComboBox combo){
       try {
            busqueda=false;
            if(c.hayConexion()){
             c.setStatement("select *from clientes where nombre like ? ORDER BY nombre;");
             c.getStatement().setString(1, "%"+nombre+"%");
             res = c.getStatement().executeQuery();                                
             if(res.next()){ //si hay registros mostrarlos...
                if(combo!=null){
                    combo.removeAllItems();                     
                    combo.addItem(res.getString(2)); //primer dato encontrado en la consulta
                     while(res.next())
                         combo.addItem(res.getString(2));
                     combo.showPopup();
                 }else{
                   cargarInformacion(res);                    
                 }
               busqueda=true;
            }          
           }
            res.close();
            res=null;            
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
     return busqueda;
    }
    
    public boolean buscarClientePorNegocio(){
      try {
            busqueda=false;
            if(c.hayConexion()){
             c.setStatement("select *from clientes where negocio like ? ORDER BY negocio;");
             c.getStatement().setString(1, "%"+negocio+"%");
             res = c.getStatement().executeQuery();
             if(res.next()){ //si hay registros mostrarlos...               
                   cargarInformacion(res);
               busqueda=true;
            }
           }
            res.close();
            res=null;            
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
     return busqueda;
    }

    public void cargarInformacion(ResultSet res){
        try {
               id_cliente=res.getInt("id_cliente");
               nombre=res.getString("nombre");
               negocio = res.getString("negocio"); 
               direccion=res.getString("direccion");
               RFC=res.getString("rfc");
               telefono=res.getString("telefono");
               id_ciudad=res.getInt("id_ciudad");
               limite_de_credito=res.getFloat("limite_credito");
               dias_plazo=res.getInt("dias_credito");     
               id_ruta = res.getInt("id_ruta");
               prioridad = res.getInt("prioridad");
               frecuentado = res.getString("frecuentado");
               giro_empresa = res.getInt("id_actividad");
//               fecha_registro = res.getString("fecha_registro");
        } catch (Exception e) {  System.out.println("error:"+e.getMessage());  }
    }

    public boolean registrarCliente(){
        try {
           if(c.hayConexion()){
              c.setStatement("insert into clientes(nombre,negocio,direccion,rfc,telefono,id_ciudad,limite_credito,dias_credito,id_ruta,prioridad,frecuentado,id_actividad,id_cliente) values(?,?,?,?,?,?,?,?,?,?,?,?,?);");
                preparaCliente();              
              c.getStatement().executeUpdate();
           }
           return true;
        } catch (Exception e) { JOptionPane.showMessageDialog(null, e.getMessage(), "Atención, registro abortado!", JOptionPane.ERROR_MESSAGE);}
        return false;
    }

    public boolean actualizarCliente(){
      try {
           if(c.hayConexion()){
               c.setStatement("UPDATE clientes set nombre=?,negocio=?,direccion=?,rfc=?,telefono=?,id_ciudad=?,limite_credito=?,dias_credito=?,id_ruta=?,prioridad=?,frecuentado=?,id_actividad=? WHERE id_cliente=?;");
                 preparaCliente();                 
               c.getStatement().executeUpdate();                
           }
           return true;
        } catch (Exception e) { System.out.println("error:"+e.getMessage());    }
        return false;
    }
    
    private void preparaCliente(){
      try{  
         c.getStatement().setString(1, nombre);
         c.getStatement().setString(2, negocio);
         c.getStatement().setString(3, direccion);
         c.getStatement().setString(4, RFC);
         c.getStatement().setString(5, telefono);
         c.getStatement().setInt(6, id_ciudad);
         c.getStatement().setDouble(7, limite_de_credito);
         c.getStatement().setInt(8, dias_plazo);
         c.getStatement().setInt(9, id_ruta);
         c.getStatement().setInt(10, prioridad);
         c.getStatement().setString(11, frecuentado);
         c.getStatement().setInt(12, giro_empresa);
         c.getStatement().setInt(13, id_cliente);
      }catch(Exception e){}
    }

    public int getSigCliente(){
        try {
            if(c.hayConexion()){
                res = c.getScrollableStatement().executeQuery("select max(id_cliente) from clientes;");
              if(res.next()){
                id_cliente = res.getInt(1);
              }
            }
            res.close();
            res=null;
        }catch (Exception e) { System.out.println("error:"+e.getMessage());  }
        return id_cliente+1;
    }

    public boolean eliminarCliente(){
      try {
            if(c.hayConexion()){
              c.setStatement("DELETE FROM clientes WHERE id_cliente=?;");
              c.getStatement().setInt(1, id_cliente);
              c.getStatement().executeUpdate();
            }
            return true;
        } catch (Exception e) { System.out.println("error:"+e.getMessage());  }
      return false;
    }
    
    public void cargarInformacionCliente(){
       try {
            if(c.hayConexion()){
                c.setStatement("SELECT cs.nombre,cs.direccion,cs.rfc,cs.telefono,ciud.descripcion AS ciudad, e.descripcion AS estado "
                      + "FROM   clientes cs, ciudad ciud, estado e "
                      + "WHERE   id_cliente=? AND ciud.id_estado=e.id_estado AND cs.id_ciudad=ciud.id_ciudad;");
                c.getStatement().setInt(1, id_cliente);                
                res = c.getStatement().executeQuery();
              if(res.next()){                                  
                 setNombre(res.getString(1));
               setDireccion(res.getString(2));
               setRFC(res.getString(3));
               setTelefono(res.getString(4));
               setCiudad(res.getString(5));
               setEstado(res.getString(6));               
              }
            }            
        } catch (Exception e) { System.out.println("error:"+e.getMessage());  }
    }
    
    public void actualizarDireccion(){
        try {
            if(c.hayConexion()){
              c.setStatement("UPDATE clientes set direccion=? where id_cliente="+id_cliente+";");
              c.getStatement().setString(1, direccion);
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) {
        }
    }
    
    public void actualizarRFC(){
        try {
            if(c.hayConexion()){
              c.setStatement("UPDATE clientes set rfc=? where id_cliente="+id_cliente+";");
              c.getStatement().setString(1, RFC);
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) {
        }
    }
    public void actualizarTelefono(){
        try {
            if(c.hayConexion()){
              c.setStatement("UPDATE clientes set telefono=? where id_cliente="+id_cliente+";");
              c.getStatement().setString(1, telefono);
              c.getStatement().executeUpdate();
            }
        } catch (Exception e) {
        }
    }
    
    public void getActividades(javax.swing.JComboBox combo){
        try {
            combo.removeAllItems();
            if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("select * from actividad order by id_actividad;");
               while(res.next())
                   combo.addItem(res.getString(2));
            }
        } catch (Exception e) {
        }
    }
    public void getActividades(javax.swing.table.DefaultTableModel tabla){
        try {
            if(tabla.getRowCount()>0)
                for(int x=tabla.getRowCount()-1; x>=0; x--)
                    tabla.removeRow(x);
            if(c.hayConexion()){
              res = c.getScrollableStatement().executeQuery("select * from actividad order by id_actividad;");
              aux=0;
               while(res.next()){
                 tabla.addRow(new Object[1]);
                 tabla.setValueAt(res.getString(1), aux, 0);
                 tabla.setValueAt(res.getString(2), aux, 1);
                  aux++;
               }                   
            }
        } catch (Exception e) {
        }
    }
    public void setActividad(String act){
        try {
            if(c.hayConexion()){
              c.getScrollableStatement().executeUpdate("INSERT INTO actividad(descr_act) values('"+act+"')");                
            }
        } catch (Exception e) { System.out.println(e.getMessage());   }
    }
        
}
