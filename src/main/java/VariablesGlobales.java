
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
public class VariablesGlobales {
    
    private static final String DRIVER_DB = "oracle.jdbc.driver.OracleDriver";
    private static final String URL_DB = "jdbc:oracle:thin:@//localhost:1521/XEPDB1";
    private static final String USER_DB = "etzalam";
    private static final String PASSWORD_DB = "umg2022";
            
    public static Connection conn;
    
    static{
        try {
            Class.forName(DRIVER_DB);
            conn = DriverManager.getConnection(URL_DB, USER_DB, PASSWORD_DB);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(VariablesGlobales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Statement getStatement() throws SQLException{
        Statement st = null;
        st = conn.createStatement();
        return st;
    }
    
    public static Resultset getResultset (String consulta) throws SQLException{
        ResultSet rs = null;
        rs.getStatement().executeQuery(consulta);
        return (Resultset) rs;   
    }
}
