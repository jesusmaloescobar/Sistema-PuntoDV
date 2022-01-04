package reportes;


import controladores.ConexionDB;
import java.awt.print.PageFormat;
import java.io.File;
import java.io.InputStream;
import net.sf.jasperreports.engine.*;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import javax.swing.JOptionPane;
import net.sf.jasperreports.view.JasperViewer;
import tareas.MsjReporte;

public class ReportesClass{
    String path_reporte, nombre_reporte;
    HashMap parameters;
    SimpleDateFormat formato;
    JasperViewer visor;
    MsjReporte msjRep;
    ConexionDB c;
    public ReportesClass(java.awt.Frame f){
      parameters = new HashMap();  
      formato = new SimpleDateFormat("dd-MM-yyyy");
      msjRep = new MsjReporte(f, false);
      c = new ConexionDB();
      c.hayConexion();
    }
    
    public void setNomReporte(String nom){
       nombre_reporte = nom; 
       path_reporte="Reportes/"+nom+".jasper";
       path_reporte = new File(path_reporte).getAbsolutePath();
        System.out.println("GENERANDO REPORTE:"+path_reporte);
    }
    public void setParametroFecha(String nom_param, String fecha){
      try{
         //java.util.Date f =  formato.parse(fecha);
        parameters.put(nom_param, (java.util.Date)formato.parse(fecha));
      }catch(Exception e){}
    }
    
    public void setParametro(String nombre_parametro, String valor){
        parameters.put(nombre_parametro, valor);
    }
    
    public void setParametro(String nombre_parametro, int valor){
       parameters.put(nombre_parametro, valor);
    }
        
    public String getNomReporte(){
        //System.out.println("nom_reporte:"+nom_reporte);
     return path_reporte;
    }    
                    
    public void doReporte(){
      new Thread(){
        @Override
        public void run(){
          try{
        msjRep.setVisible(true);
        c = new ConexionDB();
        if(c.hayConexion()){
            /*final InputStream inputStream = ReportesClass.class
					.getResourceAsStream("/reportes/" + nombre_reporte + ".jrxml");
            
            JasperReport report = JasperCompileManager.compileReport(inputStream);*/
            System.out.println("File:"+getNomReporte());
            JasperPrint jasperPrint = JasperFillManager.fillReport(getNomReporte(), parameters, c.getScrollableStatement().getConnection());
            
            visor = new JasperViewer(jasperPrint,false); //false para no cerrar todo el sistema            
            visor.setVisible(true);          
        }
        c.desconectar();
        c=null;
     }
     catch (Exception e){
         e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en:"+nombre_reporte, JOptionPane.ERROR_MESSAGE);
     }
      msjRep.dispose();
        }
      }.start();      
    }
    
    public void enviarImprimir(){
      new Thread(){
        @Override
        public void run(){
         try{
          msjRep.setVisible(true);
          c = new ConexionDB();
         if(c.hayConexion()){
            JasperPrint jasperPrint=JasperFillManager.fillReport(getNomReporte(), parameters, c.getScrollableStatement().getConnection());
            JasperPrintManager.printReport(jasperPrint, true);
         }
         c.desconectar();
         c=null;
       }
     catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error en:"+path_reporte, JOptionPane.ERROR_MESSAGE);
     }
      msjRep.dispose();
        }
      }.start();      
    }

}