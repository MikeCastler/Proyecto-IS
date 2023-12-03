package GestorProyecto;

import java.sql.ResultSet;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class GestorCRUD {

    Conexion con;

    public GestorCRUD(Conexion con) {
        this.con = con;
    }

    /*---------------------------------------------------------------------------------------------------------------*/
    // ADMINISTRADOR 
    public ResultSet AgregarAdministradorProyecto(String IdAdmon, String nombre, String apellidos, String edad, String genero, String especialidad) throws SQLException {
        String proceso = "call AgregarAdministradorProyecto(" + IdAdmon + ",'" + nombre + "','" + apellidos + "','" + edad + "','" + genero + "','" + especialidad + "')";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    /*public ResultSet ActualizarAdministrador(String IdAdmon, String nombres,String apellidos String edad, String genero, String especialidad) throws SQLException {
        String proceso = "call ActualizarAdministrador(" + IdAdmon + ",'" + nombres + "','" + apellidos + "','" + edad + "','" + genero + "','" + especialidad + "')";
        ResultSet rs = con.call(proceso);
        return rs;
    }*/
    public ResultSet ActualizarAdministrador(String IdAdmon, String nombres, String apellidos, String edad, String genero, String especialidad) throws SQLException {
        String sql = "{call ActualizarAdministrador(?, ?, ?, ?, ?,?)}";

        try (CallableStatement statement = con.getConexion().prepareCall(sql)) {
            statement.setInt(1, Integer.parseInt(IdAdmon));
            statement.setString(2, nombres);
            statement.setString(3, apellidos);
            statement.setInt(4, Integer.parseInt(edad));
            statement.setString(5, genero);
            statement.setString(6, especialidad);

            // Ejecutar la llamada al procedimiento almacenado
            statement.execute();

            // Obtener el resultado si es necesario
            ResultSet rs = statement.getResultSet();

            return rs;
        }
    }

    /*---------------------------------------------------------------------------------------------------------------*/

 /*---------------------------------------------------------------------------------------------------------------*/
    // JEFE 
    public ResultSet AgregarJefeProyecto(String IdJefe, String nombre, String apellidos, String edad, String genero, String especialidad, String IdAdmon) throws SQLException {
        String proceso = "call AgregarJefeProyecto(" + IdJefe + ",'" + nombre + "','" + apellidos + "','" + edad + "','" + genero + "','" + especialidad + "','" + IdAdmon + "')";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    public ResultSet ActualizarJefeProyecto(String IdJefe, String nombre, String apellidos, String edad, String genero, String especialidad, String IdAdmon) throws SQLException {
        String sql = "{call ActualizarJefeProyecto(?, ?, ?, ?, ?, ?,?)}";

        try (CallableStatement statement = con.getConexion().prepareCall(sql)) {
            statement.setInt(1, Integer.parseInt(IdJefe));
            statement.setString(2, nombre);
            statement.setString(3, apellidos);
            statement.setInt(4, Integer.parseInt(edad));
            statement.setString(5, genero);
            statement.setString(6, especialidad);
            statement.setInt(7, Integer.parseInt(IdAdmon));

            // Ejecutar la llamada al procedimiento almacenado
            statement.execute();

            // Obtener el resultado si es necesario
            ResultSet rs = statement.getResultSet();

            return rs;
        }
    }


    /*---------------------------------------------------------------------------------------------------------------*/

 /*---------------------------------------------------------------------------------------------------------------*/
    // PROYECTO
    public ResultSet AgregarProyecto(String IdProyecto, String nombre, String objetivo, String estado, String fechainicio, String fechaterm, String IdJefe) throws SQLException {
        String proceso = "call AgregarProyecto(" + IdProyecto + ",'" + nombre + "','" + objetivo + "','" + estado + "','" + fechainicio + "','" + fechaterm + "','" + IdJefe + "')";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    public ResultSet ActualizarProyecto(String IdProyecto, String nombre, String objetivo, String estado, String fechainicio, String fechaterm, String IdJefe) throws SQLException {
        String proceso = "call ActualizarProyecto(" + IdProyecto + ",'" + nombre + "','" + objetivo + "','" + estado + "','" + fechainicio + "','" + fechaterm + "','" + IdJefe + "')";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    /*---------------------------------------------------------------------------------------------------------------*/

 /*---------------------------------------------------------------------------------------------------------------*/
    // PARTICIPANTE 
    public ResultSet AgregarParticipante(String IdParticipante, String nombre, String apellidos, String correo, String edad, String genero, String especialidad) throws SQLException {
        String proceso = "call AgregarParticipante(" + IdParticipante + ",'" + nombre + "','" + apellidos + "','" + correo + "','" + edad + "','" + genero + "','" + especialidad + "')";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    public ResultSet ActualizarParticipante(String IdParticipante, String nombre, String apellidos, String correo, String edad, String genero, String especialidad) throws SQLException {
        String sql = "{call ActualizarParticipante(?, ?, ?, ?, ?,?,?)}";

        try (CallableStatement statement = con.getConexion().prepareCall(sql)) {
            statement.setInt(1, Integer.parseInt(IdParticipante));
            statement.setString(2, nombre);
            statement.setString(3, apellidos);
            statement.setString(4, correo);
            statement.setInt(5, Integer.parseInt(edad));
            statement.setString(6, genero);
            statement.setString(7, especialidad);

            // Ejecutar la llamada al procedimiento almacenado
            statement.execute();

            // Obtener el resultado si es necesario
            ResultSet rs = statement.getResultSet();

            return rs;
        }
    }

    public ResultSet EliminarParticipante(String IdParticipante) throws SQLException {
        String proceso = "call EliminarParticipante(" + IdParticipante + ")";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    /*---------------------------------------------------------------------------------------------------------------*/

 /*---------------------------------------------------------------------------------------------------------------*/
    // TAREA
    public ResultSet AgregarTarea(String IdTarea, String nombre, String prioridad, String estado, String fechainicio, String fechaterm, String IdProyecto) throws SQLException {
        String proceso = "call AgregarTarea(" + IdTarea + ",'" + nombre + "','" + prioridad + "','" + estado + "','" + fechainicio + "','" + fechaterm + "','" + IdProyecto + "')";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    public ResultSet ActualizarTarea(String IdTarea, String nombre, String prioridad, String estado, String fechainicio, String fechaterm, String IdProyecto) throws SQLException {
        String sql = "{call ActualizarTarea(?, ?, ?, ?, ?, ?, ?)}";

        try (CallableStatement statement = con.getConexion().prepareCall(sql)) {
            statement.setInt(1, Integer.parseInt(IdTarea));
            statement.setString(2, nombre);
            statement.setString(3, prioridad);
            statement.setString(4, estado);
            statement.setString(5, fechainicio);
            statement.setString(6, fechaterm);
            statement.setInt(7, Integer.parseInt(IdProyecto));

            // Ejecutar la llamada al procedimiento almacenado
            statement.execute();

            // Obtener el resultado si es necesario
            ResultSet rs = statement.getResultSet();

            return rs;
        }
    }

    public ResultSet EliminarTarea(String IdTarea) throws SQLException {
        String proceso = "call EliminarTarea(" + IdTarea + ")";
        ResultSet rs = con.call(proceso);
        return rs;
    }

    /*---------------------------------------------------------------------------------------------------------------*/

 /*---------------------------------------------------------------------------------------------------------------*/
    // PROYECTO - PARTICIPANTE
    public ResultSet AsignarParticipantesAProyecto(String IdProyecto, String IdParticipante) throws SQLException {
        String sql = "{call AsignarParticipantesAProyecto(?, ?)}";

        try (CallableStatement statement = con.getConexion().prepareCall(sql)) {
            statement.setInt(1, Integer.parseInt(IdProyecto));
            statement.setInt(2, Integer.parseInt(IdParticipante));

            // Ejecutar la llamada al procedimiento almacenado
            statement.execute();

            // Obtener el resultado si es necesario
            ResultSet rs = statement.getResultSet();

            return rs;
        }
    }

    public ResultSet MostrarProyectosTerminados() throws SQLException {
        String proceso = "{call MostrarProyectosTerminados()}";
        CallableStatement cs = con.getConexion().prepareCall(proceso);
        return cs.executeQuery();
    }

    /*---------------------------------------------------------------------------------------------------------------*/

 /*---------------------------------------------------------------------------------------------------------------*/
    // TAREA - PARTICIPANTE
    public ResultSet AsignarTareaEmpleado(String IdTarea, String IdParticipante) throws SQLException {
        String sql = "{call AsignarTareaEmpleado(?,?)}";
        try (CallableStatement statement = con.getConexion().prepareCall(sql)) {
            statement.setInt(1, Integer.parseInt(IdTarea));
            statement.setInt(2, Integer.parseInt(IdParticipante));

            // Ejecutar la llamada al procedimiento almacenado
            statement.execute();

            // Obtener el resultado si es necesario
            ResultSet rs = statement.getResultSet();

            return rs;
        }
    }

    public ResultSet MostrarTareasTerminadas() throws SQLException {
        String proceso = "{call MostrarTareasTerminadas()}";
        CallableStatement cs = con.getConexion().prepareCall(proceso);
        return cs.executeQuery();
    }

    /*---------------------------------------------------------------------------------------------------------------*/
    public void finalizeCall() throws SQLException {
        con.Cerrar_Conexion();
    }
}
