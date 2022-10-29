
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eryck Tz
 */
public class LeerNoticias {
    
    public List<Noticia> getAllDB (){
        
        try {
            Statement statement = VariablesGlobales.conn.createStatement();
            String consulta = "select * from noticiasprueba";
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LeerNoticias.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
