package controladores;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 *
 * @author Jesus Malo
 */
public class Fecha {
  static Date fechita;
  static SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
  private static GregorianCalendar fecha = new GregorianCalendar();
  
  public static String getFechaHoy(){
      if(Calendar.MONTH>=10)
        return (""+Calendar.getInstance().get(Calendar.DATE)+"-"+ (Calendar.getInstance().get(Calendar.MONTH)+1)+"-"+ Calendar.getInstance().get(Calendar.YEAR));
      else
        return (""+Calendar.getInstance().get(Calendar.DATE)+"-0"+ (Calendar.getInstance().get(Calendar.MONTH)+1)+"-"+ Calendar.getInstance().get(Calendar.YEAR));
  }
  
  public static int getDiaHoy(){
    return Calendar.getInstance().get(Calendar.DATE);
  }
  
  public static int getMesHoy(){
    return Calendar.getInstance().get(Calendar.MONTH);
  }
  
  public static int getAño(){
    return Calendar.getInstance().get(Calendar.YEAR);
  }
  
  public static java.sql.Date getFecha(String fecha) throws ParseException{
      return (new java.sql.Date(formatoFecha.parse(fecha).getTime()));
  }
  
    
    public static String getFechaFutura(int meses){
       try{
        fecha.setTime(getFecha(getFechaHoy()));
        fecha.roll(Calendar.MONTH, meses);        
       }catch(Exception e){}       
         return ""+fecha.get(Calendar.DATE)+"-"+(fecha.get(Calendar.MONTH)+1)+"-"+fecha.get(Calendar.YEAR);
    }
    
    public static String getHora(){
      return (""+Calendar.getInstance().get(Calendar.HOUR)+":"+ Calendar.getInstance().get(Calendar.MINUTE)+":"+ Calendar.getInstance().get(Calendar.SECOND));
    }
    
}
