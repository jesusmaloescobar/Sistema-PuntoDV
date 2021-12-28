
package impresion;

import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

/**
 *
 * @author Jesus Malo 04-07-2011 at 07:43 pm
 */
public class Imprimir {
    
    public void imprimir(Printable p){
       PrinterJob imp = PrinterJob.getPrinterJob();
       imp.setPrintable(p);
        try {
          imp.print(); //a la impresora por default            
        } catch (PrinterException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
      Imprimir p = new Imprimir();
      p.imprimir(new ContenidoImpresion());
    }
}
