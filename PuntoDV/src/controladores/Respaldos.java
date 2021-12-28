package controladores;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus Malo 11:33 a.m.
 */
public class Respaldos {
    ConexionDB c;
    JFileChooser chooser;
    public Respaldos(){
      c = new ConexionDB();
      chooser = new JFileChooser();
    }
                
public void respaldar(){
  new Thread(){
            @Override
    public void run(){
       try {
     int returnVal=0;
     chooser.showSaveDialog(null);
       if(returnVal == JFileChooser.APPROVE_OPTION) {
          String path = chooser.getCurrentDirectory().getAbsolutePath()+"\\"+chooser.getSelectedFile().getName()+".backup";
          List<String> cmds = new ArrayList<String>();
            cmds.add("C:\\Archivos de programa\\PostgreSQL\\9.0\\bin\\pg_dump.exe");
            cmds.add("-i");
            cmds.add("-h");
            cmds.add("localhost");
            cmds.add("-p");
            cmds.add("5432");
            cmds.add("-U");
            cmds.add("postgres");
            cmds.add("-F");
            cmds.add("c");
            cmds.add("-b");
            cmds.add("-v");
            cmds.add("-f");
            cmds.add(path); //ruta y nombre del archivo a guardar
              cmds.add(ConexionDB.getDBName()); //nombre de la base de datos
        ProcessBuilder pb = new ProcessBuilder(cmds);
        pb.environment().put("PGPASSWORD",ConexionDB.getPass()); //contraseña para usuario postgres
        pb.start();
           JOptionPane.showMessageDialog(null, "Se ha respaldado toda su informacion en:\n"+path, "Confirmacion de respaldo...", JOptionPane.INFORMATION_MESSAGE);
       }//fin if
      } catch (Exception e) { e.printStackTrace(); }
    }
  }.start();  
 
    }
    
public void restaurar(){
    new Thread(){
            @Override
       public void run(){
          try {
           chooser.showOpenDialog(null);
           int returnVal=0;
           String path;
           if(returnVal==chooser.APPROVE_OPTION){
               path = chooser.getSelectedFile().getAbsolutePath();
               System.out.println("ruta:"+path);
              //C:/Archivos de programa/PostgreSQL/9.0/bin\pg_restore.exe --host localhost --port 5432 --username "postgres" --dbname "prueba" --verbose "E:\Proyecto\DB\distribuidoraDB002.backup"
             List<String> cmds = new ArrayList<String>();
            cmds.add("C:\\Archivos de programa\\PostgreSQL\\9.0\\bin\\pg_restore.exe");
            cmds.add("-i");
            cmds.add("-h");
            cmds.add("localhost");
            cmds.add("-p");
            cmds.add("5432");
            cmds.add("-U");
            cmds.add("postgres");
            cmds.add("-d");
            cmds.add("distribuidora_manantiales");
            //cmds.add(ConexionDB.getDBName()); //nombre de la base de datos donde se restaurará
            cmds.add("-v");
            cmds.add(path); //ruta y nombre del archivo que se restaura...            
                ProcessBuilder pb = new ProcessBuilder(cmds);
                pb.environment().put("PGPASSWORD",ConexionDB.getPass()); //contraseña para usuario postgres
                pb.start();        
                JOptionPane.showMessageDialog(null, "La base de datos ahora posee nuevo valores", "Confirmacion de restauración", JOptionPane.INFORMATION_MESSAGE);
           }           
        } catch (Exception e) { e.printStackTrace(); }
       }
    }.start();        
    }


    public static void main(String[] args) {
        new Respaldos().respaldar();
    }
}
