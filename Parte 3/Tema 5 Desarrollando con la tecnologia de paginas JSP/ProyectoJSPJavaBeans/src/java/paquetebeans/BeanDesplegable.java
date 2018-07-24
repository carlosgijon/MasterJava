package paquetebeans;

import java.sql.*;


public class BeanDesplegable {
    
    Connection conexion = null;
    java.sql.Statement estado = null;
    final String usuario = "DB_TEST";
    final String password = "DB_TEST";
    final String cadena_conexion = "jdbc:oracle:thin:@192.168.1.37:1521:XE";
    
    // CONSTRUCTOR
    public BeanDesplegable() {
        
    }
    
    public void conectar() throws SQLException, Exception {
        try {
            // 1.- Cargamos el driver
            DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

            // 2.- Nos conectamos
            this.conexion = DriverManager.getConnection(cadena_conexion, usuario, password); 
        }
        catch(SQLException exc_con) {
            System.out.println(exc_con.toString());
        }
    }
    
    public ResultSet crear_ResultSet(String consulta) throws Exception {
        ResultSet rs;
        estado = conexion.createStatement();
        rs = estado.executeQuery(consulta);
        
        return rs;
    }
    
    public String crear_combo(ResultSet rs, String nombre_selec, String valor_selec) {
        String combo;
        
        try {
            combo = "<select class='uk-select' name='" +nombre_selec+ "'>";
            while(rs.next()) {
                if(rs.getString(1).equals(valor_selec)) {
                    combo += "<option SELECTED ";
                }
                else {
                    combo += "<option ";
                }
                
                combo += "value=" +rs.getString(1)+">";
                combo += rs.getString(2);
                combo += "</option>";
            }
            
            combo += "</select>";
            return combo;
        }
        catch(SQLException exc_sql) {
            return exc_sql.toString();
        }
        
    }
}
