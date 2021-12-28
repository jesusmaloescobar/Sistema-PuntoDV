package controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Jesus Malo --05 de Abril de 2011
 */
public class ConexionDB {
   private  PreparedStatement pstmt;
   private  Statement stmt;
   private  Connection con;
   private static String host="localhost", db="distribuidora_manantiales", user="postgres", pass="postgres";

   public void setHost(String h){
     host = h;
   }
   public void setDBName(String db_name){
     db = db_name;
   }
   public void setUser(String usr){
     user = usr;
   }
   public void setPass(String pwd){
     pass = pwd;
   }
   
   public static String getUsuario(){
    return user;
   }
   public static String getPass(){
    return pass;
   }
   public static String getDBName(){
    return db;
   }
   public static String getHost(){
     return host;
   }

   public boolean hayConexion(){
     try{
         if(con==null){
          Class.forName("org.postgresql.Driver");
          con = (Connection)DriverManager.getConnection("jdbc:postgresql://"+host+"/"+db, user, pass);
         }
         return true;
     }catch(Exception e){
         System.out.println(e.getMessage());
     }
     return false;
   }

   public PreparedStatement getStatement(){
     return pstmt;
   }
   
   public Statement getScrollableStatement(){
      try{ 
        stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      }catch(Exception e){}
     return stmt;     
   }

   public void setStatement(String sql){
     try{
       pstmt = con.prepareStatement(sql);
     }catch(Exception e){ System.out.println("error:"+e.getMessage()); }
   }
   
   public void desconectar(){
     try{         
       con.close();
       stmt.close();
       pstmt.close();
     }catch(Exception e){}
   }
   
}
