package Conexiones;

import static Conexiones.Conexion.getConexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.util.ArrayList;

public class Conexion {    
    static Connection contacto = null;    
    public static Connection getConexion(){        
        String url = "jdbc:sqlserver://192.168.123.11:53446;databaseName=iERP90_1"; //iERP90_0 test //iERP90_1 Oficial
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer conexion" + e.getMessage(),"Error de Conexion ", JOptionPane.ERROR_MESSAGE);
        }
        try{
            contacto = DriverManager.getConnection(url,"sa","1000Beeomakin@");
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),"Error de Conexion ", JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }
    
    public static ResultSet Consulta(String consulta){
        Connection con = getConexion();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(),"Error de Conexion ", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }       

    public ArrayList excecuteQuery(String select_psc_lotes_po) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


