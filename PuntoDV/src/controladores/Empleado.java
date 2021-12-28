
package controladores;

import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus 15/Mayo/2011
 */
public class Empleado {
    
        private int id_empleado;
    private String nombre, direccion,RFC, telefono,fecha_ingreso;
    private double sueldo_base;
    ConexionDB c = null;
    ResultSet res;
    
    public Empleado(){
      c = new ConexionDB();
    }
    
    public void setID(int id_empleado){
      this.id_empleado = id_empleado;
    }
    
    public void setNombre(String nombre){
     this.nombre = nombre.toUpperCase();
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
    
    public void setFechaIngreso(String fecha){
      fecha_ingreso = fecha;
    }
       
    public void setSueldo(double sueldo){
     sueldo_base = sueldo;
    }    
            
    
    //getes
    public int getID(){
      return id_empleado;
    }    
    public String getNombre(){
     return nombre;
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
    public String getFechaIngreso(){
      return fecha_ingreso;
    }
    public double getSueldoBase(){
      return sueldo_base;
    }
    
    public void desconectar(){
      c.desconectar();
      c=null;
    }

  //consultas
    public boolean buscarEmpleadoPorID(){
        try {
            if(c.hayConexion()){
                c.setStatement("select *from empleado where id_empleado=?");
                c.getStatement().setInt(1, id_empleado);                
             res = c.getStatement().executeQuery();
             if(res.next()){
               cargarInformacion(res);
               res.close();
               return true;
             }
            }
        } catch (Exception e) {}
        return false;
    }

    public boolean buscarEmpleadoPorNombre(javax.swing.JComboBox combo){
       try {
            if(c.hayConexion()){
                c.setStatement("select *from empleado where nombre like ?;");
                c.getStatement().setString(1, nombre+"%");
             res = c.getStatement().executeQuery();
                if(combo!=null){
                    combo.removeAllItems();
                     while(res.next())
                         combo.addItem(res.getString(2));
                     combo.showPopup();
                 }
                 else{
                   res.next();
                   cargarInformacion(res); 
                 }
            }
            res.close();
            res=null;
            return true;
        } catch (Exception e) { System.out.println("error:"+e.getMessage());}
     return false;
    }

    public void cargarInformacion(ResultSet res){
        try {
               setID(res.getInt(1));
               setNombre(res.getString(2));
               setRFC(res.getString(3));
               setDireccion(res.getString(4));               
               setTelefono(res.getString(5));
               setFechaIngreso(res.getString(6));
               setSueldo(res.getFloat(7));               
        } catch (Exception e) {
        }
    }

    public boolean registrarEmpleado(){
        try {
           if(c.hayConexion()){
               c.setStatement("insert into empleado(nombre,rfc,direccion,telefono,fecha_de_ingreso,sueldo_base) values(?,?,?,?,?,?);");
               parametrosCliente();
             c.getStatement().executeUpdate();
           }
           return true;
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Atención, registro abortado!", JOptionPane.ERROR_MESSAGE);}
        return false;
    }

    public boolean actualizarEmpleado(){
      try {
           if(c.hayConexion()){
               c.setStatement("update empleado set nombre=?,rfc=?,direccion=?,telefono=?,fecha_de_ingreso=?,sueldo_base=? WHERE id_empleado=?");
                parametrosCliente();
               c.getStatement().setInt(7, id_empleado);
             c.getStatement().executeUpdate();
           }
           return true;
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "Error:"+e.getMessage(), "Atención!", JOptionPane.INFORMATION_MESSAGE);  }
        return false;
    }

    private void parametrosCliente(){
        try {
            c.getStatement().setString(1, nombre);
            c.getStatement().setString(2, RFC);
            c.getStatement().setString(3, direccion);
            c.getStatement().setString(4, telefono);
            c.getStatement().setDate(5, Fecha.getFecha(fecha_ingreso));
            c.getStatement().setDouble(6, sueldo_base);
        } catch (Exception e) {    }
    }
    
    public int getSigEmpleado(){
        try {
            if(c.hayConexion()){                
              res = c.getScrollableStatement().executeQuery("select max(id_empleado) from empleado;");
              if(res.next()){
                id_empleado=res.getInt(1);
              }
            }
            res.close();
            res=null;
        }catch (Exception e) { System.out.println("error:"+e.getMessage());  }
        return id_empleado+1;
    }

    public boolean eliminarEmpleado(){
      try {
            if(c.hayConexion()){
              c.getScrollableStatement().executeUpdate("delete from empleado where id_empleado="+getID());
            }
            return true;
        } catch (Exception e) { JOptionPane.showMessageDialog(null, "MSJ:"+e.getMessage(), "Error!", JOptionPane.ERROR_MESSAGE);   }
      return false;
    }
    
}
