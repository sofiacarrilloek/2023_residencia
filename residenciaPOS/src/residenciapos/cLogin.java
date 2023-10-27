/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package residenciapos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import vistas.login;

/**
 *
 * @author sofia
 */
public class cLogin {
    
        public void validaUsuario(JTextField usuario, JPasswordField contrasenia){
    
        try {
            ResultSet rs=null;           
            PreparedStatement ps= null;
            
            residenciapos.CConexion objetoConexion = new residenciapos.CConexion();
            
            String consulta="select * from users where users.username =(?) and users.password=(?);";
            ps=objetoConexion.establecerConexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contrasenia.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2,contra);
            
            rs = ps.executeQuery();
            
            if (rs.next()) {
                
                
                vistas.login b = new vistas.login();      
                b.setVisible(false);
                 
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El Usuario o contraseña es INCORRECTO, VUELVA A INTENTAR");
            }
            
      
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: "+e.toString());
        }
    }
}
