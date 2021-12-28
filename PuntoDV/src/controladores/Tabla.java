/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

/**
 *
 * @author Jesus
 */
public class Tabla {
    private int fila,columna, MAX_COLUMN,MAX_ROW, counter=-1, total_paginas;
    private java.sql.ResultSet resultado;
    javax.swing.table.DefaultTableModel tabla;
    int no_filas;
    
    public void setResultSet(java.sql.ResultSet res){
      resultado = res; 
    }
    
    public void setTabla(javax.swing.table.DefaultTableModel tabla){
     this.tabla = tabla;
    }
    
    public void setMaxColumnAndRow(int maxc, int maxr){
        MAX_COLUMN = maxc;
        MAX_ROW = maxr;
    }

    public void setNumMaxPaginas(int n_row){
        if(n_row%MAX_ROW>0)
          total_paginas = n_row/MAX_ROW+1;
        else
          n_row = n_row/MAX_ROW;
        no_filas = n_row;
    }

    public int getTotPag(){
        return total_paginas;
    }

    public int getPaginaActual(){
       return counter+1;
    }
    
    public int getTotalRegistros(){
      return no_filas;
    }
    
    public void inicializarTabla(){
      for( fila=0; fila<MAX_COLUMN; fila++){
          for(columna=0; columna<tabla.getColumnCount(); columna++)
            tabla.setValueAt(null, fila, columna);
      }
    }
    
    public void setSiguiente(){
     try{
         fila=0;
      while(resultado.next()){
         for(columna=0; columna<MAX_COLUMN-1;columna++)
            tabla.setValueAt(resultado.getString(columna+1), fila, columna); //rellenamos toda la fila de resultados
        tabla.setValueAt(""+resultado.getString(columna+1), fila, columna);
        fila++;
         if(fila==MAX_ROW)
            break; //si llegamos al maximo de filas por página nos salimos
      }
       if(fila<MAX_ROW & fila!=0){ //si en la última página llenada sobran filas, entonces borramos posibles datos
         for(;fila<tabla.getRowCount();fila++)
           for(columna=0; columna<tabla.getColumnCount();columna++)
             tabla.setValueAt(null, fila, columna); //valos nulo para celdas sobrantes...
       }
         if(fila!=0)
             counter++;
     }catch(Exception e){ System.out.println(e.getMessage()); }
  }

  public void setAnterior(){
    try{
       if(counter>0){
           counter--; //decrementamos la página para posicionarnos en una anterior
        resultado.absolute(counter*MAX_ROW);
        setSiguiente(); //ver los registros en la pagina indicada
        counter--; //descontamos una vez más por el incremento que tuvo en next()
       }
    }catch(Exception e){ System.out.println(e.getMessage()); }
  }
  
  public void inicio(){ //vamos a la página inicial
    try{
      resultado.absolute(0);
      counter=-1;
      setSiguiente(); //ver los registros en la primer página
    }catch(Exception e){ System.out.println(e.getMessage()); }
  }
}
