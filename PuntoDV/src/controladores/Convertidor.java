
package controladores;

/**
 *
 * @author Jesus Malo Escobar
 */
public class Convertidor {
    
private static String nombreDeMoneda="PESOS";

public Convertidor(){
  nombreDeMoneda = "PESOS";
}

public static String getStringOfNumber(Integer $num){  
  return doThings($num);
}
public static String getStringOfNumber(String tot){    
   return getStringOfNumber(Float.parseFloat(tot));
}
public static void setNombreMoneda(String nombre){
  nombreDeMoneda = nombre;
}

public static float deMoneda_a_digito(String tot){
    String total="";
  for(int x=0; x<tot.length(); x++){
       if(tot.charAt(x)!='$' & tot.charAt(x)!=','){
         total+=tot.charAt(x);
       }
  }
  return Float.parseFloat(total);
}

public static float deDigito_a_moneda(String tot){
    String total="";
  for(int x=0; x<tot.length(); x++){
       if(tot.charAt(x)!='$' & tot.charAt(x)!=','){
         total+=tot.charAt(x);
       }
  }
  return Float.parseFloat(total);
}

static int _counter, fraccion;
static float resto;
//Redondeo y convierto a entero puedo tener problemas  
/** Con formato centavos/100MN **/
public static String getStringOfNumber(float $num){
// this.counter = $num;
  _counter = (int) $num;
  resto = $num - _counter; //Almaceno la parte decimal
//Redondeo y convierto a entero puedo tener problemas
  fraccion = Math.round(resto * 100);
  if(fraccion==0)
     return doThings(_counter) + " " + nombreDeMoneda + " 00/100 MN.";
  else
    return doThings(_counter) + " " + nombreDeMoneda + " "+fraccion+"/100 MN.";  
}

private static String doThings(Integer _counter){
  if(_counter >2000000) //valor limite
    return ""+_counter;

    switch(_counter){
    case 0: return "CERO";
    case 1: return "UN"; //UNO
    case 2: return "DOS";
    case 3: return "TRES";
    case 4: return "CUATRO";
    case 5: return "CINCO";
    case 6: return "SEIS";
    case 7: return "SIETE";
    case 8: return "OCHO";
    case 9: return "NUEVE";
    case 10: return "DIEZ";
    case 11: return "ONCE";
    case 12: return "DOCE";
    case 13: return "TRECE";
    case 14: return "CATORCE";
    case 15: return "QUINCE";
    case 20: return "VEINTE";
    case 30: return "TREINTA";
    case 40: return "CUARENTA";
    case 50: return "CINCUENTA";
    case 60: return "SESENTA";
    case 70: return "SETENTA";
    case 80: return "OCHENTA";
    case 90: return "NOVENTA";
    case 100: return "CIEN";

    case 200: return "DOSCIENTOS";
    case 300: return "TRESCIENTOS";
    case 400: return "CUATROCIENTOS";
    case 500: return "QUINIENTOS";
    case 600: return "SEISCIENTOS";
    case 700: return "SETECIENTOS";
    case 800: return "OCHOCIENTOS";
    case 900: return "NOVECIENTOS";

    case 1000: return "MIL";

    case 1000000: return "UN MILLON";
    case 2000000: return "DOS MILLONES";
}
if(_counter<20){
  return "DIECI"+ doThings(_counter-10);
}
if(_counter<30){
  return "VEINTI" + doThings(_counter-20);
}
if(_counter<100){
  return doThings( (int)(_counter/10)*10 ) + " Y " + doThings(_counter%10);
}
if(_counter<200){
  return "CIENTO " + doThings( _counter - 100 );
}
if(_counter<1000){
  return doThings( (int)(_counter/100)*100 ) + " " + doThings(_counter%100);
}
if(_counter<2000){
  return "MIL " + doThings( _counter % 1000 );
}
if(_counter<1000000){
 String var="";
   var = doThings((int)(_counter/1000)) + " MIL" ;
      if(_counter % 1000!=0){
         var += " " + doThings(_counter % 1000);
      }
   return var;
}
if(_counter<2000000){
   return "UN MILLON " + doThings( _counter % 1000000 );
}

return "";
}

}