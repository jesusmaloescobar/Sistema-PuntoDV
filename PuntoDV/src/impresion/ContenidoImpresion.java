package impresion;

import java.awt.Graphics;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

/**
 * @author Jesus Malo 04-07-2011
 */

public class ContenidoImpresion implements Printable{

    Graphics g;
    
    @Override
    public int print(Graphics g, PageFormat pageFormat, int pageIndex) throws PrinterException {
        if(pageIndex==0){
           //g.drawString("Distribuidora Manantiales De", 0, 0);
           //g.drawString("Tapachula, S.A. de C.V.", 0, 0);
           //g.drawString("", 0, 0);                       
           return PAGE_EXISTS;
        }
        else
           return NO_SUCH_PAGE;
    }
    
}
