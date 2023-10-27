/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package residenciapos;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author sofia
 */
public class CConexion {
    Connection conectar;
    
    String usuario="root";
    String password="Admin1234";
    String bd="dbboutique";
    String ip="localhost";
    String puerto="3306";
    
    String cadena="jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection establecerConexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection(cadena, usuario, password);
            System.out.println("Se conecto correctamente la base de datos");
        }catch(Exception e){
                 JOptionPane.showMessageDialog(null, "Problemas para concetarse a  la base de datos");

        }
        return conectar;
    }
    
}
