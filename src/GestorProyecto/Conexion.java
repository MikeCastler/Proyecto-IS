package GestorProyecto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    private final String url;
    private final String user;
    private final String password;
    private Connection con = null;
    private boolean conected;

    public Conexion(String user, String password) {
        String base = "ProyectoIs";
        this.url = "jdbc:mysql://localhost:3306/" + base + "?characterEncoding=latin1";
        this.user = user;
        this.password = password;
    }

    public Connection getConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(this.url,this.user,this.password);
            conected = true;
        } catch (ClassNotFoundException | SQLException ex) {
            conected = false;
        }
        return con;
    }

    public void Cerrar_Conexion() throws SQLException {
        if (con != null) {
            con.close();
        }
    }

    public ResultSet call(String procedure) throws SQLException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        getConexion();
        ps = (PreparedStatement) con.prepareStatement(procedure);
        rs = (ResultSet) ps.executeQuery();
        return rs;
    }

    public boolean isValid() {
        getConexion();
        try {
            Cerrar_Conexion();
        } catch (SQLException ex) {
        }
        return conected;
    }

}
