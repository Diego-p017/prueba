
package Recursos;

/** 
 * @author AustiinTellez
 */

import java.sql.Connection;
import java.sql. DriverManager; 
import javax.swing.JOptionPane; 

public class Conexion {
<<<<<<< HEAD
    
    String url="jdbc:mysql://localhost:3306/gestion_citas";
    String user="root",pass="";
    Connection con;
    public Connection getConnection(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(url,user,pass);
           JOptionPane.showMessageDialog(null,"conexion a la base de datos");
        }  catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR conexion a la base de datos");
        }
          return con;
=======
   String url="jdbc:mysql://localhost:3306/gestion_citas";
 String user="root",pass="";
 Connection con; 
 
    public Connection getConnection(){ 
     try {
        Class.forName ("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection (url, user,pass);
             JOptionPane.showMessageDialog(null,"conexion a la base de datos ");
       } catch (Exception e) { 
           JOptionPane.showMessageDialog(null,"Error de conexion a la base de datos");
       }
           return con;
>>>>>>> 8043944ea44e6caa46aef11069552c2fc0e5946a
    }
}
