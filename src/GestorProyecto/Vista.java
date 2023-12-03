package GestorProyecto;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Vista {

    ResultSet rs;
    ResultSetMetaData rsMD;
    ArrayList<Object[]> registros;
    String message;

    public Vista(ResultSet rs) throws SQLException {
        this.rs = rs;
        this.rsMD = (ResultSetMetaData) rs.getMetaData();
        registros = new ArrayList<>();
        message = "";
        getData();
    }

    public int countColumns() throws SQLException {
        return rsMD.getColumnCount();
    }

    public boolean isMessage() {
        return !message.equals("");
    }

    private void getData() throws SQLException {
        if (rsMD.getColumnName(1).equals("Message")) {
            rs.next();
            message = rs.getString(1);
            return;
        }
        while (rs.next()) {
            Object[] filas = new Object[countColumns()];
            for (int i = 0; i < countColumns(); i++) {
                filas[i] = rs.getObject(i + 1);
            }
            registros.add(filas);
        }
    }

    public void setData(DefaultTableModel tbl) {
        for (Object[] filas : registros) {
            tbl.addRow(filas);
        }
    }

    public String getMessage() {
        return message;
    }
}
