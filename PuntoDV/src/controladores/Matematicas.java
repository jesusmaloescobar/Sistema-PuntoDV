package controladores;

/**
 *
 * @author Jesus Malo
 */
public class Matematicas {

    static String total="";
    static long mult=0;
    static double resultado=0;
  public static double redondear(double numero,int numeroDecimales) {
     mult=(long)Math.pow(10,numeroDecimales);
     resultado=(Math.round(numero*mult))/(double)mult;
   return resultado;
  }

  public static Float getFloat(String tot){
      total = "";
     for(int x=0; x<tot.length(); x++){
        if(tot.charAt(x)!='$' & tot.charAt(x)!=','){
         total+=tot.charAt(x);
        }
      }
    return Float.parseFloat(total);
  }
}
