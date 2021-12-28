package controladores;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTextField;

/**
 *
 * @author Jesus Malo 21/abril/2011 9:29 am
 */
public class Validador {
        
   static char c;
   static SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");
   static Date fechita;
    public static boolean validarNumero(java.awt.event.KeyEvent evt){
        c = evt.getKeyChar();
        if(c>='0' & c<='9')
            return true;
        else{
            evt.consume();
            return false;
        }
    }

    public static boolean validarCadena(java.awt.event.KeyEvent evt){
        c=evt.getKeyChar();
       if(c!='\'')
          return true;
        else{
            evt.consume();
           return false;
        }
    }

    public static boolean validarPrecio(JTextField caja , java.awt.event.KeyEvent evt){
      if(caja.getText().contains(".") && evt.getKeyChar()=='.'){
           evt.consume();
           return false;
       }
       c=evt.getKeyChar();
       if(c!=' ' & c!='\'' & c!='$' & c!=',' & c>='0' & c<='9' || c=='.')
          return true;
        else{
            evt.consume();
           return false;
        }
    }
    
    public static boolean validarFecha(String fecha){
       try {      
          fechita = formatoFecha.parse(fecha);
       } catch (ParseException e) {
         return false;
       }
         return true;
    }
    
    public static Date getFormateada(){
     return fechita;
    }
    
}
