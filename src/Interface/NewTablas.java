package Interface;

import GestorProyecto.Conexion;
import GestorProyecto.GestorCRUD;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class NewTablas extends javax.swing.JFrame {

    private final GestorCRUD con;
    private DefaultTableModel columnasAdmon, columnasJefe, columnasProyecto, columnasParticipante, columnasTarea, columnasProyPar, columnasTarPar;

    public NewTablas(Conexion con) {
        this.con = new GestorCRUD(con);
        initComponents();
        setDatostblAdministrador();
        setDatostblJefe();
        setDatostblProyecto();
        setDatostblParticipante();
        setDatostblTarea();
        setDatostblProyPar();
        setDatostblTarPar();
    }

    public NewTablas(GestorCRUD con, JTabbedPane PanelPestañas) {
        this.con = con;
        this.PanelPestañas = PanelPestañas;
    }

    private void setDatostblAdministrador() {
        columnasAdmon = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] header = {"Id Admon", "Nombres", "Apellidos", "Edad", "Genero", "Especialidad"};
        columnasAdmon.setColumnIdentifiers(header);
        tablaAdmon.setModel(columnasAdmon);
        tablaAdmon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaAdmon.setRowSelectionAllowed(true);
        tablaAdmon.setColumnSelectionAllowed(false);
        tablaAdmon.getTableHeader().setReorderingAllowed(false);
    }

    private void setDatostblJefe() {
        columnasJefe = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] header = {"Id Jefe", "Nombres", "Apellidos", "Edad", "Genero", "Especialidad", "Id Administrador"};
        columnasJefe.setColumnIdentifiers(header);
        tablaJefe.setModel(columnasJefe);
        tablaJefe.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaJefe.setRowSelectionAllowed(true);
        tablaJefe.setColumnSelectionAllowed(false);
        tablaJefe.getTableHeader().setReorderingAllowed(false);
    }

    private void setDatostblProyecto() {
        columnasProyecto = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] header = {"IdProyecto", "Nombre", "Objetivo", "Estado", "Fecha Inicio", "Fecha Termina", "Id Jefe"};
        columnasProyecto.setColumnIdentifiers(header);
        tablaProyecto.setModel(columnasProyecto);
        tablaProyecto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaProyecto.setRowSelectionAllowed(true);
        tablaProyecto.setColumnSelectionAllowed(false);
        tablaProyecto.getTableHeader().setReorderingAllowed(false);
    }

    private void setDatostblParticipante() {
        columnasParticipante = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] header = {"IdParticipante", "Nombres", "Apellidos", "Correo", "Edad", "Genero", "Especialidad"};
        columnasParticipante.setColumnIdentifiers(header);
        tablaParticipante.setModel(columnasParticipante);
        tablaParticipante.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaParticipante.setRowSelectionAllowed(true);
        tablaParticipante.setColumnSelectionAllowed(false);
        tablaParticipante.getTableHeader().setReorderingAllowed(false);
    }

    private void setDatostblTarea() {
        columnasTarea = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] header = {"Id Tarea", "Nombre", "Estado", "Prioridad", "Fecha Inicio", "Fecha Termina", "Id Proyecto"};
        columnasTarea.setColumnIdentifiers(header);
        tablaTarea.setModel(columnasTarea);
        tablaTarea.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaTarea.setRowSelectionAllowed(true);
        tablaTarea.setColumnSelectionAllowed(false);
        tablaTarea.getTableHeader().setReorderingAllowed(false);
    }

    private void setDatostblProyPar() {
        columnasProyPar = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] header = {"IdProyecto", "IdParticipante"};
        columnasProyPar.setColumnIdentifiers(header);
        tablaProyectoParticipante.setModel(columnasProyPar);
        tablaProyectoParticipante.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaProyectoParticipante.setRowSelectionAllowed(true);
        tablaProyectoParticipante.setColumnSelectionAllowed(false);
        tablaProyectoParticipante.getTableHeader().setReorderingAllowed(false);
    }

    private void setDatostblTarPar() {
        columnasTarPar = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        String[] header = {"IdTarea", "IdParticipante"};
        columnasTarPar.setColumnIdentifiers(header);
        tablaTareaParticipante.setModel(columnasTarPar);
        tablaTareaParticipante.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        tablaTareaParticipante.setRowSelectionAllowed(true);
        tablaTareaParticipante.setColumnSelectionAllowed(false);
        tablaTareaParticipante.getTableHeader().setReorderingAllowed(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        PanelPestañas = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIdAdmon = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombreAdmon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtApellidosAdmon = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEdadAdmon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btnInsertarAdmon = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtEspecialidadAdmon = new javax.swing.JTextField();
        txtGeneroAdmon = new javax.swing.JComboBox<>();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtActualizarIdAdmon = new javax.swing.JTextField();
        txtActualizarNombreAdmon = new javax.swing.JTextField();
        txtActualizarApellidosAdmon = new javax.swing.JTextField();
        txtActualizarEdadAdmon = new javax.swing.JTextField();
        btnActualizarAdmon = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        txtActualizarEspecialidadAdmon = new javax.swing.JTextField();
        txtActualizarGeneroAdmon = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAdmon = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        txtIdJefe = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtNombreJefe = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtApellidosJefe = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtEdadJefe = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtEspecialidadJefe = new javax.swing.JTextField();
        btnInsertarJefe = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtIdAdmonJefe = new javax.swing.JTextField();
        txtGeneroJefe = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        txtActualizarIdJefe = new javax.swing.JTextField();
        txtActualizarNombreJefe = new javax.swing.JTextField();
        txtActualizarApellidosJefe = new javax.swing.JTextField();
        txtActualizarEdadJefe = new javax.swing.JTextField();
        txtActualizarEspecialidadJefe = new javax.swing.JTextField();
        btnActualizarJefe = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtActualizarIdAdmonJefe = new javax.swing.JTextField();
        txtActualizarGeneroJefe = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaJefe = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        txtIdProyecto = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        txtNombreProyecto = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtFechaInicioProyecto = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txtFechaTerminaProyecto = new javax.swing.JTextField();
        btnInsertarProyecto = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        txtIdJefeProyecto = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        taObjetivoProyecto = new javax.swing.JTextArea();
        comboEstadoProyecto = new javax.swing.JComboBox<>();
        jPanel15 = new javax.swing.JPanel();
        jLabel91 = new javax.swing.JLabel();
        txtActualizarIdProyecto = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        txtActualizarNombreProyecto = new javax.swing.JTextField();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        txtActualizarFechaInicioProyecto = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        txtActualizarFechaTerminaProyecto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtActualizarIdJefeProyecto = new javax.swing.JTextField();
        btnActualizarProyecto = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        taActualizarObjetivoProyecto = new javax.swing.JTextArea();
        comboActualizarEstadoProyecto = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProyecto = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel16 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txtIdParticipante = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txtNombreParticipante = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txtApellidosParticipante = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txtCorreoParticipante = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txtEdadParticipante = new javax.swing.JTextField();
        btnInsertarParticipante = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtEspecialidadParticipante = new javax.swing.JTextField();
        txtGeneroParticipante = new javax.swing.JComboBox<>();
        jPanel17 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtActualizarIdParticipante = new javax.swing.JTextField();
        txtActualizarNombreParticipante = new javax.swing.JTextField();
        txtActualizarApellidosParticipante = new javax.swing.JTextField();
        txtActualizarCorreoParticipante = new javax.swing.JTextField();
        txtActualizarEdadParticipante = new javax.swing.JTextField();
        btnActualizarParticipante = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        txtActualizarEspecialidadParticipante = new javax.swing.JTextField();
        txtActualizarGeneroParticipante = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        txtBorrarIdParticipante = new javax.swing.JTextField();
        btnBorrarParticipante = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaParticipante = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel18 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        txtIdTarea = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        txtNombreTarea = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        txtFechaInicioTarea = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        txtFechaTerminaTarea = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        txtIdProyectoTarea = new javax.swing.JTextField();
        btnInsertarTarea = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        comboEstadoTarea = new javax.swing.JComboBox<>();
        comboPrioridadTarea = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        txtBorrarIdTarea = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        btnBorrarTarea = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        txtActualizarIdTarea = new javax.swing.JTextField();
        txtActualizarNombreTarea = new javax.swing.JTextField();
        txtActualizarFechaInicioTarea = new javax.swing.JTextField();
        txtActualizarFechaTerminaTarea = new javax.swing.JTextField();
        txtActualizarIdProyectoTarea = new javax.swing.JTextField();
        btnActualizarTarea = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        comboActualizarEstadoTarea = new javax.swing.JComboBox<>();
        comboActualizarPrioridadTarea = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaTarea = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel20 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        txtIdProyectoProyPar = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        txtIdParticipanteProyPar = new javax.swing.JTextField();
        btnAsignarProyPar = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        btnProyectosCompletos = new javax.swing.JButton();
        lblnumpt = new javax.swing.JLabel();
        txtCantidadProyectos = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaProyectoParticipante = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane7 = new javax.swing.JTabbedPane();
        jPanel22 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        txtIdParTar = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        txtIdTarPar = new javax.swing.JTextField();
        btnAsignarTarPar = new javax.swing.JButton();
        lblnumtc = new javax.swing.JPanel();
        btnTareasCompletas = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        lblnumtc1 = new javax.swing.JLabel();
        txtCantidadTareas = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaTareaParticipante = new javax.swing.JTable();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPestañas.setForeground(new java.awt.Color(0, 204, 204));

        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel7.setText("Id Admon: ");

        jLabel8.setText("Nombres: ");

        jLabel9.setText("Apellidos: ");

        jLabel10.setText("Edad:");

        jLabel11.setText("Genero:");

        btnInsertarAdmon.setText("Insertar");
        btnInsertarAdmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAdmonActionPerformed(evt);
            }
        });

        jLabel6.setText("Especialidad:");

        txtEspecialidadAdmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEspecialidadAdmonActionPerformed(evt);
            }
        });

        txtGeneroAdmon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Prefiero no decir" }));
        txtGeneroAdmon.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnInsertarAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecialidadAdmon))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosAdmon)
                            .addComponent(txtNombreAdmon)
                            .addComponent(txtIdAdmon, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEdadAdmon)
                            .addComponent(txtGeneroAdmon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtIdAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombreAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtApellidosAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtEdadAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGeneroAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtEspecialidadAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnInsertarAdmon)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Insertar", jPanel9);

        jPanel10.setForeground(new java.awt.Color(153, 153, 153));

        jLabel1.setText("Id Admon: ");

        jLabel2.setText("Nombres: ");

        jLabel3.setText("Apellidos:");

        jLabel4.setText("Edad:");

        jLabel5.setText("Genero:");

        btnActualizarAdmon.setText("Actualizar");
        btnActualizarAdmon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdmonActionPerformed(evt);
            }
        });

        jLabel17.setText("Especialidad:");

        txtActualizarGeneroAdmon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Prefiero no decir" }));
        txtActualizarGeneroAdmon.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnActualizarAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel17))
                .addGap(11, 11, 11)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtActualizarApellidosAdmon)
                    .addComponent(txtActualizarNombreAdmon)
                    .addComponent(txtActualizarIdAdmon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtActualizarEdadAdmon)
                    .addComponent(txtActualizarEspecialidadAdmon)
                    .addComponent(txtActualizarGeneroAdmon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtActualizarIdAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtActualizarNombreAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtActualizarApellidosAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtActualizarEdadAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtActualizarGeneroAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtActualizarEspecialidadAdmon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(btnActualizarAdmon)
                .addContainerGap(186, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Actualizar", jPanel10);

        tablaAdmon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaAdmon);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jTabbedPane1))
                .addContainerGap())
        );

        PanelPestañas.addTab("Administrador", jPanel1);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel19.setText("Id Jefe: ");

        jLabel20.setText("Nombres: ");

        jLabel21.setText("Apellidos:");

        jLabel22.setText("Edad:");

        jLabel23.setText("Genero: ");

        jLabel24.setText("Especialidad:");

        btnInsertarJefe.setText("Insertar");
        btnInsertarJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarJefeActionPerformed(evt);
            }
        });

        jLabel12.setText("Id Admon:");

        txtIdAdmonJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAdmonJefeActionPerformed(evt);
            }
        });

        txtGeneroJefe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Prefiero no decir" }));
        txtGeneroJefe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnInsertarJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23)
                    .addComponent(jLabel24)
                    .addComponent(jLabel12))
                .addGap(11, 11, 11)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreJefe)
                            .addComponent(txtIdJefe, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtEspecialidadJefe))
                        .addContainerGap())
                    .addComponent(txtIdAdmonJefe)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtEdadJefe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidosJefe, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGeneroJefe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtIdJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtNombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtApellidosJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtEdadJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtGeneroJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtEspecialidadJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtIdAdmonJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnInsertarJefe)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Insertar", jPanel12);

        jPanel13.setForeground(new java.awt.Color(153, 153, 153));

        jLabel25.setText("Id Jefe: ");

        jLabel26.setText("Nombres: ");

        jLabel27.setText("Apellidos:");

        jLabel28.setText("Edad:");

        jLabel29.setText("Genero:");

        jLabel30.setText("Especialidad:");

        btnActualizarJefe.setText("Actualizar");
        btnActualizarJefe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarJefeActionPerformed(evt);
            }
        });

        jLabel18.setText("Id Admon:");

        txtActualizarGeneroJefe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Prefiero no decir", " " }));
        txtActualizarGeneroJefe.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(btnActualizarJefe, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30))
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActualizarIdAdmonJefe)
                                    .addComponent(txtActualizarEspecialidadJefe)))
                            .addGroup(jPanel13Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActualizarApellidosJefe)
                                    .addComponent(txtActualizarNombreJefe)
                                    .addComponent(txtActualizarIdJefe, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtActualizarEdadJefe)
                                    .addComponent(txtActualizarGeneroJefe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(txtActualizarIdJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtActualizarNombreJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(txtActualizarApellidosJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtActualizarEdadJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtActualizarGeneroJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(txtActualizarEspecialidadJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtActualizarIdAdmonJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnActualizarJefe)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Actualizar", jPanel13);

        tablaJefe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaJefe);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jTabbedPane2))
                .addContainerGap())
        );

        PanelPestañas.addTab("Jefe", jPanel2);

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel31.setText("Id Proyecto: ");

        jLabel32.setText("Nombre: ");

        jLabel33.setText("Objetivo: ");

        jLabel34.setText("Estado: ");

        jLabel35.setText("Fecha Inicio: ");

        txtFechaInicioProyecto.setText("YYYY-MM-DD");

        jLabel36.setText("Fecha Termina: ");

        txtFechaTerminaProyecto.setText("YYYY-MM-DD");

        btnInsertarProyecto.setText("Insertar");
        btnInsertarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarProyectoActionPerformed(evt);
            }
        });

        jLabel13.setText("Id Jefe: ");

        taObjetivoProyecto.setColumns(20);
        taObjetivoProyecto.setRows(5);
        taObjetivoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        taObjetivoProyecto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taObjetivoProyecto.setDragEnabled(true);
        jScrollPane8.setViewportView(taObjetivoProyecto);

        comboEstadoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proceso", "Terminada", "Pendiente", " " }));
        comboEstadoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        comboEstadoProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstadoProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel14Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboEstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtFechaTerminaProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                .addComponent(txtFechaInicioProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                                                .addComponent(txtIdJefeProyecto))))))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnInsertarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(txtIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(txtNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(comboEstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(txtFechaInicioProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtFechaTerminaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtIdJefeProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnInsertarProyecto)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Insertar", jPanel14);

        jPanel15.setForeground(new java.awt.Color(153, 153, 153));

        jLabel91.setText("Id Proyecto: ");

        jLabel92.setText("Nombre: ");

        jLabel93.setText("Objetivo: ");

        jLabel94.setText("Estado: ");

        jLabel95.setText("Fecha Inicio: ");

        txtActualizarFechaInicioProyecto.setText("YYYY-MM-DD");

        jLabel96.setText("Fecha Termina: ");

        txtActualizarFechaTerminaProyecto.setText("YYYY-MM-DD");

        jLabel14.setText("Id Jefe: ");

        btnActualizarProyecto.setText("Actualizar");
        btnActualizarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarProyectoActionPerformed(evt);
            }
        });

        taActualizarObjetivoProyecto.setColumns(20);
        taActualizarObjetivoProyecto.setRows(5);
        taActualizarObjetivoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jScrollPane9.setViewportView(taActualizarObjetivoProyecto);

        comboActualizarEstadoProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proceso", "Terminada", "Pendiente", " " }));
        comboActualizarEstadoProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel91)
                            .addComponent(jLabel92)
                            .addComponent(jLabel93)
                            .addComponent(jLabel94)
                            .addComponent(jLabel95)
                            .addComponent(jLabel96)
                            .addComponent(jLabel14))
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActualizarIdProyecto)
                                    .addComponent(txtActualizarNombreProyecto)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtActualizarFechaTerminaProyecto)
                                    .addComponent(txtActualizarIdJefeProyecto)))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboActualizarEstadoProyecto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtActualizarFechaInicioProyecto)))))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnActualizarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel91)
                    .addComponent(txtActualizarIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel92)
                    .addComponent(txtActualizarNombreProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel93)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94)
                    .addComponent(comboActualizarEstadoProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel95)
                    .addComponent(txtActualizarFechaInicioProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(txtActualizarFechaTerminaProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtActualizarIdJefeProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnActualizarProyecto)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Actualizar", jPanel15);

        tablaProyecto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaProyecto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(jTabbedPane3))
                .addContainerGap())
        );

        PanelPestañas.addTab("Proyecto", jPanel3);

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel43.setText("Id Participante: ");

        jLabel44.setText("Nombres: ");

        jLabel45.setText("Apellidos: ");

        jLabel46.setText("Correo: ");

        jLabel47.setText("Edad: ");

        btnInsertarParticipante.setText("Insertar");
        btnInsertarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarParticipanteActionPerformed(evt);
            }
        });

        jLabel15.setText("Genero:");

        jLabel16.setText("Especialidad:");

        txtGeneroParticipante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Prefiero no decir" }));
        txtGeneroParticipante.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCorreoParticipante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtApellidosParticipante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtIdParticipante)
                            .addComponent(txtNombreParticipante)
                            .addComponent(txtEdadParticipante)
                            .addComponent(txtEspecialidadParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(txtGeneroParticipante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnInsertarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txtIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(txtNombreParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(txtApellidosParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(txtCorreoParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtEdadParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtGeneroParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtEspecialidadParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnInsertarParticipante)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Insertar", jPanel16);

        jPanel17.setForeground(new java.awt.Color(153, 153, 153));

        jLabel49.setText("Id Participante: ");

        jLabel50.setText("Nombres: ");

        jLabel51.setText("Apellidos:");

        jLabel52.setText("Correo:");

        jLabel53.setText("Edad:");

        txtActualizarNombreParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtActualizarNombreParticipanteActionPerformed(evt);
            }
        });

        btnActualizarParticipante.setText("Actualizar");
        btnActualizarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarParticipanteActionPerformed(evt);
            }
        });

        jLabel37.setText("Genero:");

        jLabel38.setText("Especialidad:");

        txtActualizarGeneroParticipante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Prefiero no decir" }));
        txtActualizarGeneroParticipante.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel37)
                            .addComponent(jLabel38))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActualizarCorreoParticipante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtActualizarIdParticipante, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtActualizarNombreParticipante)
                            .addComponent(txtActualizarApellidosParticipante)
                            .addComponent(txtActualizarEdadParticipante)
                            .addComponent(txtActualizarEspecialidadParticipante, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                            .addComponent(txtActualizarGeneroParticipante, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnActualizarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtActualizarIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtActualizarNombreParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txtActualizarApellidosParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52)
                    .addComponent(txtActualizarCorreoParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(txtActualizarEdadParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtActualizarGeneroParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txtActualizarEspecialidadParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnActualizarParticipante)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Actualizar", jPanel17);

        jLabel48.setText("Id Participante: ");

        btnBorrarParticipante.setText("Borrar");
        btnBorrarParticipante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarParticipanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel48)
                        .addGap(11, 11, 11)
                        .addComponent(txtBorrarIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btnBorrarParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtBorrarIdParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBorrarParticipante)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("Borrar", jPanel8);

        tablaParticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaParticipante);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(jTabbedPane4))
                .addContainerGap())
        );

        PanelPestañas.addTab("Participante", jPanel4);

        jTabbedPane5.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel55.setText("Id Tarea: ");

        jLabel56.setText("Nombre: ");

        jLabel57.setText("Estado: ");

        jLabel58.setText("Fecha Inicio: ");

        txtFechaInicioTarea.setText("YYYY-MM-DD");

        jLabel59.setText("Fecha Termina: ");

        txtFechaTerminaTarea.setText("YYYY-MM-DD");

        jLabel60.setText("Id Proyecto:  ");

        btnInsertarTarea.setText("Insertar");
        btnInsertarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarTareaActionPerformed(evt);
            }
        });

        jLabel71.setText("Prioridad: ");

        comboEstadoTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proceso", "Terminada", "Pendiente", " " }));
        comboEstadoTarea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        comboPrioridadTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja", " " }));
        comboPrioridadTarea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdTarea)
                            .addComponent(txtNombreTarea)
                            .addComponent(comboEstadoTarea, 0, 133, Short.MAX_VALUE)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel71)
                        .addGap(45, 45, 45)
                        .addComponent(comboPrioridadTarea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaInicioTarea)
                            .addComponent(txtFechaTerminaTarea)
                            .addComponent(txtIdProyectoTarea)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnInsertarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(txtIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(txtNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(comboEstadoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(comboPrioridadTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(txtFechaInicioTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(txtFechaTerminaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(txtIdProyectoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnInsertarTarea)
                .addContainerGap(136, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Insertar", jPanel18);

        jLabel97.setText("Id Tarea: ");

        btnBorrarTarea.setText("Borrar");
        btnBorrarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel97)
                        .addGap(11, 11, 11)
                        .addComponent(txtBorrarIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btnBorrarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(txtBorrarIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBorrarTarea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Borrar", jPanel11);

        jPanel19.setForeground(new java.awt.Color(153, 153, 153));

        jLabel61.setText("Id Tarea: ");

        jLabel62.setText("Nombre: ");

        jLabel63.setText("Estado: ");

        jLabel64.setText("Fecha Inicio: ");

        jLabel65.setText("Fecha Termina: ");

        jLabel66.setText("Id Proyecto: ");

        txtActualizarFechaInicioTarea.setText("YYYY-MM-DD");

        txtActualizarFechaTerminaTarea.setText("YYYY-MM-DD");

        btnActualizarTarea.setText("Actualizar");
        btnActualizarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTareaActionPerformed(evt);
            }
        });

        jLabel72.setText("Prioridad: ");

        comboActualizarEstadoTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proceso", "Terminada", "Pendiente", " " }));
        comboActualizarEstadoTarea.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        comboActualizarPrioridadTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alta", "Media", "Baja" }));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel63))
                                .addGap(49, 49, 49))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel72)
                                    .addComponent(jLabel64))
                                .addGap(30, 30, 30)))
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboActualizarEstadoTarea, javax.swing.GroupLayout.Alignment.LEADING, 0, 121, Short.MAX_VALUE)
                            .addComponent(txtActualizarNombreTarea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActualizarIdTarea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboActualizarPrioridadTarea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel66)
                            .addComponent(jLabel65))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtActualizarFechaInicioTarea, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                            .addComponent(txtActualizarFechaTerminaTarea)
                            .addComponent(txtActualizarIdProyectoTarea))))
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnActualizarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(txtActualizarIdTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtActualizarNombreTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(comboActualizarEstadoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel72)
                    .addComponent(comboActualizarPrioridadTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(txtActualizarFechaInicioTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(txtActualizarFechaTerminaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(txtActualizarIdProyectoTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btnActualizarTarea)
                .addContainerGap(145, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Actualizar", jPanel19);

        tablaTarea.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tablaTarea);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane5)
                    .addComponent(jTabbedPane5))
                .addContainerGap())
        );

        PanelPestañas.addTab("Tarea", jPanel5);

        jTabbedPane6.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel67.setText("Id Proyecto: ");

        jLabel68.setText("Id Participante: ");

        btnAsignarProyPar.setText("Asignar");
        btnAsignarProyPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarProyParActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdProyectoProyPar, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(txtIdParticipanteProyPar)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnAsignarProyPar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(txtIdProyectoProyPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(txtIdParticipanteProyPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnAsignarProyPar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Asignar", jPanel20);

        jPanel21.setForeground(new java.awt.Color(153, 153, 153));

        btnProyectosCompletos.setText("Mostrar Proyectos Completos");
        btnProyectosCompletos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectosCompletosActionPerformed(evt);
            }
        });

        txtCantidadProyectos.setEditable(false);
        txtCantidadProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadProyectosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnProyectosCompletos))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(lblnumpt))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(txtCantidadProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblnumpt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProyectosCompletos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCantidadProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(430, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Completos", jPanel21);

        tablaProyectoParticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablaProyectoParticipante);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane6)
                    .addComponent(jTabbedPane6))
                .addContainerGap())
        );

        PanelPestañas.addTab("Proyecto/Participante", jPanel6);

        jTabbedPane7.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel69.setText("Id Tarea: ");

        jLabel70.setText("Id Participante: ");

        btnAsignarTarPar.setText("Asignar");
        btnAsignarTarPar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarTarParActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel70)
                    .addComponent(jLabel69))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdParTar, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(txtIdTarPar))
                .addContainerGap())
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnAsignarTarPar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(txtIdParTar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(txtIdTarPar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAsignarTarPar)
                .addContainerGap(368, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Asignar", jPanel22);

        lblnumtc.setForeground(new java.awt.Color(153, 153, 153));

        btnTareasCompletas.setText("Mostrar Tareas Completas");
        btnTareasCompletas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareasCompletasActionPerformed(evt);
            }
        });

        txtCantidadTareas.setEditable(false);

        javax.swing.GroupLayout lblnumtcLayout = new javax.swing.GroupLayout(lblnumtc);
        lblnumtc.setLayout(lblnumtcLayout);
        lblnumtcLayout.setHorizontalGroup(
            lblnumtcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblnumtcLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblnumtc1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lblnumtcLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel39)
                .addGap(114, 114, 114)
                .addComponent(txtCantidadTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
            .addGroup(lblnumtcLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(btnTareasCompletas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lblnumtcLayout.setVerticalGroup(
            lblnumtcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblnumtcLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnTareasCompletas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblnumtcLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(txtCantidadTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addComponent(lblnumtc1)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jTabbedPane7.addTab("Completos", lblnumtc);

        tablaTareaParticipante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablaTareaParticipante);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane7)
                    .addComponent(jTabbedPane7))
                .addContainerGap())
        );

        PanelPestañas.addTab("Tareas/Participantes", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPestañas)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPestañas)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertarAdmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAdmonActionPerformed
        try {
            con.AgregarAdministradorProyecto(txtIdAdmon.getText(), txtNombreAdmon.getText(), txtApellidosAdmon.getText(), txtEdadAdmon.getText(), txtGeneroAdmon.getSelectedItem().toString(), txtEspecialidadAdmon.getText());
            con.finalizeCall();
            message("Administrador de Proyectos agregado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar agregar el Administrador de Proyectos: " + ex.getMessage());
        }
        insertaradmon();
    }//GEN-LAST:event_btnInsertarAdmonActionPerformed

    private void btnInsertarJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarJefeActionPerformed
        try {
            con.AgregarJefeProyecto(txtIdJefe.getText(), txtNombreJefe.getText(), txtApellidosJefe.getText(), txtEdadJefe.getText(), txtGeneroJefe.getSelectedItem().toString(), txtEspecialidadJefe.getText(), txtIdAdmonJefe.getText());
            con.finalizeCall();
            message("Jefe de Proyecto agregado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar agregar el Jefe de Proyectos: " + ex.getMessage());
        }
        insertarjefe();
    }//GEN-LAST:event_btnInsertarJefeActionPerformed

    private void btnInsertarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarParticipanteActionPerformed
        try {
            con.AgregarParticipante(txtIdParticipante.getText(), txtNombreParticipante.getText(), txtApellidosParticipante.getText(), txtCorreoParticipante.getText(), txtEdadParticipante.getText(), txtGeneroParticipante.getSelectedItem().toString(), txtEspecialidadParticipante.getText());
            con.finalizeCall();
            message("Participante agregado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar agregar el Participante: " + ex.getMessage());
        }
        insertarparticipante();
    }//GEN-LAST:event_btnInsertarParticipanteActionPerformed

    private void btnActualizarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarParticipanteActionPerformed
        try {

            con.ActualizarParticipante(txtActualizarIdParticipante.getText(), txtActualizarNombreParticipante.getText(), txtActualizarApellidosParticipante.getText(), txtActualizarCorreoParticipante.getText(), txtActualizarEdadParticipante.getText(), txtActualizarGeneroParticipante.getSelectedItem().toString(), txtActualizarEspecialidadAdmon.getText());
            con.finalizeCall();
            message("Participante actualizado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar actualizar el Participante. " + ex.getMessage());
        }
        actualizarparticipante();
    }//GEN-LAST:event_btnActualizarParticipanteActionPerformed

    private void btnBorrarParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarParticipanteActionPerformed
        try {
            con.EliminarParticipante(txtBorrarIdParticipante.getText());
            con.finalizeCall();
            message("Participante Eliminado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar eliminar el Participante: " + ex.getMessage());
        }
        eliminarparticipante();
    }//GEN-LAST:event_btnBorrarParticipanteActionPerformed

    private void btnInsertarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarProyectoActionPerformed
        try {
            con.AgregarProyecto(txtIdProyecto.getText(), txtNombreProyecto.getText(), taObjetivoProyecto.getText(), comboEstadoProyecto.getSelectedItem().toString(), txtFechaInicioProyecto.getText(), txtFechaTerminaProyecto.getText(), txtIdJefeProyecto.getText());
            con.finalizeCall();
            message("Proyecto agregado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar agregar Proyecto. " + ex.getMessage());
        }
        insertarproyecto();
    }//GEN-LAST:event_btnInsertarProyectoActionPerformed

    private void btnActualizarAdmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdmonActionPerformed
        try {
            con.ActualizarAdministrador(txtActualizarIdAdmon.getText(), txtActualizarNombreAdmon.getText(), txtActualizarApellidosAdmon.getText(), txtActualizarEdadAdmon.getText(), txtActualizarGeneroAdmon.getSelectedItem().toString(), txtActualizarEspecialidadAdmon.getText());
            con.finalizeCall();
            message("Administrador actualizado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar actualizar Administrador. " + ex.getMessage());
        }
        actualizaradmon();
    }//GEN-LAST:event_btnActualizarAdmonActionPerformed

    private void btnActualizarJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarJefeActionPerformed
        try {

            con.ActualizarJefeProyecto(txtActualizarIdJefe.getText(), txtActualizarNombreJefe.getText(), txtActualizarApellidosJefe.getText(), txtActualizarEdadJefe.getText(), txtActualizarGeneroJefe.getSelectedItem().toString(), txtActualizarEspecialidadJefe.getText(), txtActualizarIdAdmonJefe.getText());
            con.finalizeCall();
            message("Jefe de proyecto actualizado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar actualizar el Jefe. " + ex.getMessage());
        }
        actualizarjefe();
    }//GEN-LAST:event_btnActualizarJefeActionPerformed

    private void btnActualizarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarProyectoActionPerformed
        try {

            con.ActualizarProyecto(txtActualizarIdProyecto.getText(), txtActualizarNombreProyecto.getText(), taActualizarObjetivoProyecto.getText(), comboActualizarEstadoProyecto.getSelectedItem().toString(), txtActualizarFechaInicioProyecto.getText(), txtActualizarFechaTerminaProyecto.getText(), txtActualizarIdJefeProyecto.getText());
            con.finalizeCall();
            message("Proyecto actualizado exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar actualizar el Proyecto. " + ex.getMessage());
        }
        actualizarproyecto();
    }//GEN-LAST:event_btnActualizarProyectoActionPerformed

    private void btnInsertarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarTareaActionPerformed
        try {
            con.AgregarTarea(txtIdTarea.getText(), txtNombreTarea.getText(), comboPrioridadTarea.getSelectedItem().toString(), comboEstadoTarea.getSelectedItem().toString(), txtFechaInicioTarea.getText(), txtFechaTerminaTarea.getText(), txtIdProyectoTarea.getText());
            con.finalizeCall();
            message("Tarea agregada exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar agregar Tarea. " + ex.getMessage());
        }
        insertartarea();
    }//GEN-LAST:event_btnInsertarTareaActionPerformed

    private void btnActualizarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTareaActionPerformed
        try {
            con.ActualizarTarea(txtActualizarIdTarea.getText(), txtActualizarNombreTarea.getText(), comboActualizarPrioridadTarea.getSelectedItem().toString(), comboActualizarEstadoTarea.getSelectedItem().toString(), txtActualizarFechaInicioTarea.getText(), txtActualizarFechaTerminaTarea.getText(), txtActualizarIdProyectoTarea.getText());
            con.finalizeCall();
            message("Tarea actualizada exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar actualizar Tarea. " + ex.getMessage());
        }
        actualizartarea();
    }//GEN-LAST:event_btnActualizarTareaActionPerformed

    private void btnAsignarProyParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarProyParActionPerformed
        try {
            con.AsignarParticipantesAProyecto(txtIdProyectoProyPar.getText(), txtIdParticipanteProyPar.getText());
            con.finalizeCall();
            message("El participante ya está asignado a este proyecto.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar asignar Proyecto a Participante. " + ex.getMessage());
        }
        asignarpp();
    }//GEN-LAST:event_btnAsignarProyParActionPerformed

    private void btnBorrarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarTareaActionPerformed
        try {
            con.EliminarTarea(txtBorrarIdTarea.getText());
            con.finalizeCall();
            message("Tarea eliminada exitosamente.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar eliminar Tarea. " + ex.getMessage());
        }
        eliminartarea();
    }//GEN-LAST:event_btnBorrarTareaActionPerformed

    private void txtEspecialidadAdmonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEspecialidadAdmonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEspecialidadAdmonActionPerformed

    private void txtIdAdmonJefeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAdmonJefeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAdmonJefeActionPerformed

    private void txtActualizarNombreParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtActualizarNombreParticipanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtActualizarNombreParticipanteActionPerformed

    private void btnProyectosCompletosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectosCompletosActionPerformed
        try {
            // Llamada al método en la clase GestorCRUD para obtener el resultado del procedimiento almacenado
            ResultSet rs = con.MostrarProyectosTerminados();

            // Procesar el resultado y actualizar el TextField
            if (rs.next()) {
                int proyectosCompletos = rs.getInt(1);
                txtCantidadProyectos.setText(Integer.toString(proyectosCompletos));
            }

            // Cerrar el ResultSet (importante)
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades
        }
    }//GEN-LAST:event_btnProyectosCompletosActionPerformed

    private void btnAsignarTarParActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarTarParActionPerformed
        try {
            con.AsignarTareaEmpleado(txtIdParTar.getText(), txtIdTarPar.getText());
            con.finalizeCall();
            message("El participante ya está asignado a esta tarea.");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprime la pila de llamadas
            message("Error al intentar asignar Tarea a Participante. " + ex.getMessage());
        }
        asignartp();
    }//GEN-LAST:event_btnAsignarTarParActionPerformed

    private void comboEstadoProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstadoProyectoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEstadoProyectoActionPerformed

    private void txtCantidadProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadProyectosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadProyectosActionPerformed

    private void btnTareasCompletasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareasCompletasActionPerformed
        try {
            // Llamada al método en la clase GestorCRUD para obtener el resultado del procedimiento almacenado
            ResultSet rs = con.MostrarTareasTerminadas();

            // Procesar el resultado y actualizar el TextField
            if (rs.next()) {
                int tareasCompletas = rs.getInt(1);
                txtCantidadTareas.setText(Integer.toString(tareasCompletas));
            }

            // Cerrar el ResultSet (importante)
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades
        }
    }//GEN-LAST:event_btnTareasCompletasActionPerformed

    void insertaradmon() {
        columnasAdmon.addRow(new Object[]{
            txtIdAdmon.getText(), txtNombreAdmon.getText(), txtApellidosAdmon.getText(), txtEdadAdmon.getText(), txtGeneroAdmon.getSelectedItem().toString(), txtEspecialidadAdmon.getText()
        });
    }

    void insertarjefe() {
        columnasJefe.addRow(new Object[]{
            txtIdJefe.getText(), txtNombreJefe.getText(), txtApellidosJefe.getText(), txtEdadJefe.getText(), txtGeneroJefe.getSelectedItem().toString(), txtEspecialidadJefe.getText()
        });
    }

    void insertarproyecto() {
        columnasProyecto.addRow(new Object[]{
            txtIdProyecto.getText(), txtNombreProyecto.getText(), taObjetivoProyecto.getText(), comboEstadoProyecto.getSelectedItem().toString(), txtFechaInicioProyecto.getText(), txtFechaTerminaProyecto.getText(), txtIdJefeProyecto.getText()
        });
    }

    void insertarparticipante() {
        columnasParticipante.addRow(new Object[]{
            txtIdParticipante.getText(), txtNombreParticipante.getText(), txtApellidosParticipante.getText(), txtCorreoParticipante.getText(), txtEdadParticipante.getText(), txtGeneroParticipante.getSelectedItem().toString(), txtEspecialidadParticipante.getText()
        });
    }

    void insertartarea() {
        columnasTarea.addRow(new Object[]{
            txtIdTarea.getText(), txtNombreTarea.getText(), comboEstadoTarea.getSelectedItem().toString(), comboPrioridadTarea.getSelectedItem().toString(), txtFechaInicioTarea.getText(), txtFechaTerminaTarea.getText(), txtIdProyectoTarea.getText()
        });
    }

    void asignarpp() {
        columnasProyPar.addRow(new Object[]{
            txtIdProyectoProyPar.getText(), txtIdParticipanteProyPar.getText()
        });
    }

    void asignartp() {
        columnasTarPar.addRow(new Object[]{
            txtIdParTar.getText(), txtIdTarPar.getText()
        });
    }

    void actualizaradmon() {
        int fila = tablaAdmon.getSelectedRow();
        columnasAdmon.setValueAt(txtActualizarIdAdmon.getText(), fila, 1);
        columnasAdmon.setValueAt(txtActualizarNombreAdmon.getText(), fila, 2);
        columnasAdmon.setValueAt(txtActualizarApellidosAdmon.getText(), fila, 3);
        columnasAdmon.setValueAt(txtActualizarEdadAdmon.getText(), fila, 4);
        columnasAdmon.setValueAt(txtActualizarGeneroAdmon.getSelectedItem().toString(), fila, 5);
        columnasAdmon.setValueAt(txtActualizarEspecialidadAdmon.getText(), fila, 6);
    }

    void actualizarjefe() {
        int fila = tablaJefe.getSelectedRow();
        columnasJefe.setValueAt(txtActualizarIdJefe.getText(), fila, 1);
        columnasJefe.setValueAt(txtActualizarNombreJefe.getText(), fila, 2);
        columnasJefe.setValueAt(txtActualizarApellidosJefe.getText(), fila, 3);
        columnasJefe.setValueAt(txtActualizarEdadJefe.getText(), fila, 4);
        columnasJefe.setValueAt(txtActualizarGeneroJefe.getSelectedItem().toString(), fila, 5);
        columnasJefe.setValueAt(txtActualizarEspecialidadJefe.getText(), fila, 6);
        columnasJefe.setValueAt(txtActualizarIdAdmonJefe.getText(), fila, 7);
    }

    void actualizarproyecto() {
        int fila = tablaProyecto.getSelectedRow();
        columnasProyecto.setValueAt(txtActualizarIdProyecto.getText(), fila, 1);
        columnasProyecto.setValueAt(txtActualizarNombreProyecto.getText(), fila, 2);
        columnasProyecto.setValueAt(taActualizarObjetivoProyecto.getText(), fila, 3);
        columnasProyecto.setValueAt(comboActualizarEstadoProyecto.getSelectedItem().toString(), fila, 4);
        columnasProyecto.setValueAt(txtActualizarFechaInicioProyecto.getText(), fila, 5);
        columnasProyecto.setValueAt(txtActualizarFechaTerminaProyecto.getText(), fila, 6);
        columnasProyecto.setValueAt(txtActualizarIdJefeProyecto.getText(), fila, 7);
    }

    void actualizarparticipante() {
        int fila = tablaParticipante.getSelectedRow();
        columnasAdmon.setValueAt(txtActualizarIdParticipante.getText(), fila, 1);
        columnasAdmon.setValueAt(txtActualizarNombreParticipante.getText(), fila, 2);
        columnasAdmon.setValueAt(txtActualizarApellidosParticipante.getText(), fila, 3);
        columnasAdmon.setValueAt(txtActualizarCorreoParticipante.getText(), fila, 4);
        columnasAdmon.setValueAt(txtActualizarEdadParticipante.getText(), fila, 5);
        columnasAdmon.setValueAt(txtActualizarGeneroParticipante.getSelectedItem().toString(), fila, 6);
        columnasAdmon.setValueAt(txtActualizarEspecialidadParticipante.getText(), fila, 7);
    }

    void actualizartarea() {
        int fila = tablaTarea.getSelectedRow();
        columnasTarea.setValueAt(txtActualizarIdTarea.getText(), fila, 1);
        columnasTarea.setValueAt(txtActualizarNombreTarea.getText(), fila, 2);
        columnasTarea.setValueAt(comboActualizarEstadoTarea.getSelectedItem().toString(), fila, 3);
        columnasTarea.setValueAt(comboActualizarPrioridadTarea.getSelectedItem().toString(), fila, 4);
        columnasTarea.setValueAt(txtActualizarFechaInicioTarea.getText(), fila, 5);
        columnasTarea.setValueAt(txtActualizarFechaTerminaTarea.getText(), fila, 6);
        columnasTarea.setValueAt(txtActualizarIdProyectoTarea.getText(), fila, 7);
    }

    void eliminarparticipante() {
        int fila = tablaParticipante.getSelectedRow();
        columnasParticipante.removeRow(fila);
    }

    void eliminartarea() {
        int fila = tablaTarea.getSelectedRow();
        columnasTarea.removeRow(fila);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PanelPestañas;
    private javax.swing.JButton btnActualizarAdmon;
    private javax.swing.JButton btnActualizarJefe;
    private javax.swing.JButton btnActualizarParticipante;
    private javax.swing.JButton btnActualizarProyecto;
    private javax.swing.JButton btnActualizarTarea;
    private javax.swing.JButton btnAsignarProyPar;
    private javax.swing.JButton btnAsignarTarPar;
    private javax.swing.JButton btnBorrarParticipante;
    private javax.swing.JButton btnBorrarTarea;
    private javax.swing.JButton btnInsertarAdmon;
    private javax.swing.JButton btnInsertarJefe;
    private javax.swing.JButton btnInsertarParticipante;
    private javax.swing.JButton btnInsertarProyecto;
    private javax.swing.JButton btnInsertarTarea;
    private javax.swing.JButton btnProyectosCompletos;
    private javax.swing.JButton btnTareasCompletas;
    private javax.swing.JComboBox<String> comboActualizarEstadoProyecto;
    private javax.swing.JComboBox<String> comboActualizarEstadoTarea;
    private javax.swing.JComboBox<String> comboActualizarPrioridadTarea;
    private javax.swing.JComboBox<String> comboEstadoProyecto;
    private javax.swing.JComboBox<String> comboEstadoTarea;
    private javax.swing.JComboBox<String> comboPrioridadTarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblnumpt;
    private javax.swing.JPanel lblnumtc;
    private javax.swing.JLabel lblnumtc1;
    private javax.swing.JTextArea taActualizarObjetivoProyecto;
    private javax.swing.JTextArea taObjetivoProyecto;
    private javax.swing.JTable tablaAdmon;
    private javax.swing.JTable tablaJefe;
    private javax.swing.JTable tablaParticipante;
    private javax.swing.JTable tablaProyecto;
    private javax.swing.JTable tablaProyectoParticipante;
    private javax.swing.JTable tablaTarea;
    private javax.swing.JTable tablaTareaParticipante;
    private javax.swing.JTextField txtActualizarApellidosAdmon;
    private javax.swing.JTextField txtActualizarApellidosJefe;
    private javax.swing.JTextField txtActualizarApellidosParticipante;
    private javax.swing.JTextField txtActualizarCorreoParticipante;
    private javax.swing.JTextField txtActualizarEdadAdmon;
    private javax.swing.JTextField txtActualizarEdadJefe;
    private javax.swing.JTextField txtActualizarEdadParticipante;
    private javax.swing.JTextField txtActualizarEspecialidadAdmon;
    private javax.swing.JTextField txtActualizarEspecialidadJefe;
    private javax.swing.JTextField txtActualizarEspecialidadParticipante;
    private javax.swing.JTextField txtActualizarFechaInicioProyecto;
    private javax.swing.JTextField txtActualizarFechaInicioTarea;
    private javax.swing.JTextField txtActualizarFechaTerminaProyecto;
    private javax.swing.JTextField txtActualizarFechaTerminaTarea;
    private javax.swing.JComboBox<String> txtActualizarGeneroAdmon;
    private javax.swing.JComboBox<String> txtActualizarGeneroJefe;
    private javax.swing.JComboBox<String> txtActualizarGeneroParticipante;
    private javax.swing.JTextField txtActualizarIdAdmon;
    private javax.swing.JTextField txtActualizarIdAdmonJefe;
    private javax.swing.JTextField txtActualizarIdJefe;
    private javax.swing.JTextField txtActualizarIdJefeProyecto;
    private javax.swing.JTextField txtActualizarIdParticipante;
    private javax.swing.JTextField txtActualizarIdProyecto;
    private javax.swing.JTextField txtActualizarIdProyectoTarea;
    private javax.swing.JTextField txtActualizarIdTarea;
    private javax.swing.JTextField txtActualizarNombreAdmon;
    private javax.swing.JTextField txtActualizarNombreJefe;
    private javax.swing.JTextField txtActualizarNombreParticipante;
    private javax.swing.JTextField txtActualizarNombreProyecto;
    private javax.swing.JTextField txtActualizarNombreTarea;
    private javax.swing.JTextField txtApellidosAdmon;
    private javax.swing.JTextField txtApellidosJefe;
    private javax.swing.JTextField txtApellidosParticipante;
    private javax.swing.JTextField txtBorrarIdParticipante;
    private javax.swing.JTextField txtBorrarIdTarea;
    private javax.swing.JTextField txtCantidadProyectos;
    private javax.swing.JTextField txtCantidadTareas;
    private javax.swing.JTextField txtCorreoParticipante;
    private javax.swing.JTextField txtEdadAdmon;
    private javax.swing.JTextField txtEdadJefe;
    private javax.swing.JTextField txtEdadParticipante;
    private javax.swing.JTextField txtEspecialidadAdmon;
    private javax.swing.JTextField txtEspecialidadJefe;
    private javax.swing.JTextField txtEspecialidadParticipante;
    private javax.swing.JTextField txtFechaInicioProyecto;
    private javax.swing.JTextField txtFechaInicioTarea;
    private javax.swing.JTextField txtFechaTerminaProyecto;
    private javax.swing.JTextField txtFechaTerminaTarea;
    private javax.swing.JComboBox<String> txtGeneroAdmon;
    private javax.swing.JComboBox<String> txtGeneroJefe;
    private javax.swing.JComboBox<String> txtGeneroParticipante;
    private javax.swing.JTextField txtIdAdmon;
    private javax.swing.JTextField txtIdAdmonJefe;
    private javax.swing.JTextField txtIdJefe;
    private javax.swing.JTextField txtIdJefeProyecto;
    private javax.swing.JTextField txtIdParTar;
    private javax.swing.JTextField txtIdParticipante;
    private javax.swing.JTextField txtIdParticipanteProyPar;
    private javax.swing.JTextField txtIdProyecto;
    private javax.swing.JTextField txtIdProyectoProyPar;
    private javax.swing.JTextField txtIdProyectoTarea;
    private javax.swing.JTextField txtIdTarPar;
    private javax.swing.JTextField txtIdTarea;
    private javax.swing.JTextField txtNombreAdmon;
    private javax.swing.JTextField txtNombreJefe;
    private javax.swing.JTextField txtNombreParticipante;
    private javax.swing.JTextField txtNombreProyecto;
    private javax.swing.JTextField txtNombreTarea;
    // End of variables declaration//GEN-END:variables

    private void message(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

}
