package controladores;

import java.awt.Toolkit;
import java.net.InetAddress;

/**
 *
 * @author Jesus Malo 15/abril/2011
 */
public class RecursosPC {
    
    public static double getAncho(){
      return Toolkit.getDefaultToolkit().getScreenSize().getWidth();
    }

    public static double getAlto(){
      return Toolkit.getDefaultToolkit().getScreenSize().getHeight();
    }
    
    public static String getIp(String nombre_host){
        String ip=null;
        try {            
            ip = InetAddress.getByName(nombre_host).getHostAddress();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ip;
    }

}
