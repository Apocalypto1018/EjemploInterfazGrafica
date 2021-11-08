/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpractico2;

/**
 *
 * @author Copito
 */
public class FormularioFinal extends javax.swing.JDialog {

    /**
     * Creates new form FormularioFinal
     */
    public FormularioFinal(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        jPCarreras = new javax.swing.JPanel();
        jRBEnfermeria = new javax.swing.JRadioButton();
        jRBNutricion = new javax.swing.JRadioButton();
        jRBFisioterapia = new javax.swing.JRadioButton();
        jRBInformatica = new javax.swing.JRadioButton();
        jPRegistrar = new javax.swing.JPanel();
        jLNombre = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTFApellido = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTFTelefono = new javax.swing.JTextField();
        jLEdad = new javax.swing.JLabel();
        jTFEdad = new javax.swing.JTextField();
        jLSexo = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPDetalleInscripcion = new javax.swing.JPanel();
        jCBAlumnosEnEnfermeria = new javax.swing.JComboBox<>();
        jCBAlumnosEnFisioterapia = new javax.swing.JComboBox<>();
        jSPNutricion = new javax.swing.JScrollPane();
        jLiNutricion = new javax.swing.JList<>();
        jSPInformatica = new javax.swing.JScrollPane();
        jLiInformatica = new javax.swing.JList<>();
        jBLimpiar = new javax.swing.JButton();
        jVaciar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLCantEnEnfermeria = new javax.swing.JLabel();
        jTFEnferFemeninos = new javax.swing.JTextField();
        jTFEnferMasculinos = new javax.swing.JTextField();
        jLCantEnNutricion = new javax.swing.JLabel();
        jTFNutriFemeninos = new javax.swing.JTextField();
        jTFNutriMasculinos = new javax.swing.JTextField();
        jLCantEnFisioterapia = new javax.swing.JLabel();
        jTFFisioFemeninos = new javax.swing.JTextField();
        jTFFisioMasculinos = new javax.swing.JTextField();
        jLCantEnInformatica = new javax.swing.JLabel();
        jTFInforFemeninos = new javax.swing.JTextField();
        jTFInforMasculinos = new javax.swing.JTextField();
        jBInscribir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(230, 230, 230));

        Panel.setBackground(new java.awt.Color(240, 240, 240));

        jPCarreras.setBackground(new java.awt.Color(240, 240, 240));
        jPCarreras.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Carreras", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jPCarreras.setForeground(new java.awt.Color(0, 0, 0));
        jPCarreras.setLayout(new java.awt.GridLayout(4, 1));

        jRBEnfermeria.setText("Lic. en Enfermeria");
        jPCarreras.add(jRBEnfermeria);

        jRBNutricion.setText("Lic. en Nutrición");
        jPCarreras.add(jRBNutricion);

        jRBFisioterapia.setText("Lic. en Fisioterapia y Kinesiología");
        jPCarreras.add(jRBFisioterapia);

        jRBInformatica.setText("Lic. en Informática");
        jPCarreras.add(jRBInformatica);

        jPRegistrar.setBackground(new java.awt.Color(240, 240, 240));
        jPRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Registrar Alumnos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        jLNombre.setText("Nombre: ");

        jTFNombre.setText("Nombre");

        jLApellido.setText("Apellido:");

        jTFApellido.setText("Apellido");

        jLTelefono.setText("Telefono:");

        jTFTelefono.setText("Telefono");

        jLEdad.setText("Edad:");

        jTFEdad.setText("Edad");

        jLSexo.setText("Sexo:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPRegistrarLayout = new javax.swing.GroupLayout(jPRegistrar);
        jPRegistrar.setLayout(jPRegistrarLayout);
        jPRegistrarLayout.setHorizontalGroup(
            jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFNombre)
                    .addComponent(jTFApellido)
                    .addComponent(jTFTelefono)
                    .addComponent(jTFEdad)
                    .addComponent(jComboBox1, 0, 344, Short.MAX_VALUE))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPRegistrarLayout.setVerticalGroup(
            jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNombre)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellido))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLEdad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLSexo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPDetalleInscripcion.setBackground(new java.awt.Color(240, 240, 240));
        jPDetalleInscripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Detalle de Inscipción", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        jCBAlumnosEnEnfermeria.setBackground(new java.awt.Color(240, 240, 240));
        jCBAlumnosEnEnfermeria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBAlumnosEnEnfermeria.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumnos de Enfermeria", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        jCBAlumnosEnFisioterapia.setBackground(new java.awt.Color(240, 240, 240));
        jCBAlumnosEnFisioterapia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jCBAlumnosEnFisioterapia.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumnos de Fisioterapia", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        jLiNutricion.setBackground(new java.awt.Color(255, 255, 255));
        jLiNutricion.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Alumnos de Nutrición", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jLiNutricion.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jSPNutricion.setViewportView(jLiNutricion);

        jLiInformatica.setBackground(new java.awt.Color(255, 255, 255));
        jLiInformatica.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Alumnos de Nutrición", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jLiInformatica.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jSPInformatica.setViewportView(jLiInformatica);

        javax.swing.GroupLayout jPDetalleInscripcionLayout = new javax.swing.GroupLayout(jPDetalleInscripcion);
        jPDetalleInscripcion.setLayout(jPDetalleInscripcionLayout);
        jPDetalleInscripcionLayout.setHorizontalGroup(
            jPDetalleInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDetalleInscripcionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPDetalleInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBAlumnosEnEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBAlumnosEnFisioterapia, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jSPNutricion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jSPInformatica, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPDetalleInscripcionLayout.setVerticalGroup(
            jPDetalleInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDetalleInscripcionLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPDetalleInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPDetalleInscripcionLayout.createSequentialGroup()
                        .addComponent(jCBAlumnosEnEnfermeria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jCBAlumnosEnFisioterapia, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPDetalleInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSPInformatica, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSPNutricion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jBLimpiar.setText("Limpiar datos de Matriculación");

        jVaciar.setText("Vaciar Detalle de Inscripción");

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Cantidad de Alumnos por Carrera:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(240, 240, 240));

        jLCantEnEnfermeria.setText("Enfermeria:");

        jTFEnferFemeninos.setEditable(false);
        jTFEnferFemeninos.setBackground(new java.awt.Color(240, 240, 240));
        jTFEnferFemeninos.setText("0");
        jTFEnferFemeninos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Femenino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jTFEnferFemeninos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFEnferFemeninosActionPerformed(evt);
            }
        });

        jTFEnferMasculinos.setEditable(false);
        jTFEnferMasculinos.setBackground(new java.awt.Color(240, 240, 240));
        jTFEnferMasculinos.setText("0");
        jTFEnferMasculinos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Masculino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        jLCantEnNutricion.setText("Nutrición:");

        jTFNutriFemeninos.setEditable(false);
        jTFNutriFemeninos.setBackground(new java.awt.Color(240, 240, 240));
        jTFNutriFemeninos.setText("0");
        jTFNutriFemeninos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Femenino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        jTFNutriMasculinos.setEditable(false);
        jTFNutriMasculinos.setBackground(new java.awt.Color(240, 240, 240));
        jTFNutriMasculinos.setText("0");
        jTFNutriMasculinos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Masculino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N

        jLCantEnFisioterapia.setText("Fisioterapia:");

        jTFFisioFemeninos.setEditable(false);
        jTFFisioFemeninos.setBackground(new java.awt.Color(240, 240, 240));
        jTFFisioFemeninos.setText("0");
        jTFFisioFemeninos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Femenino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jTFFisioFemeninos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFisioFemeninosActionPerformed(evt);
            }
        });

        jTFFisioMasculinos.setEditable(false);
        jTFFisioMasculinos.setBackground(new java.awt.Color(240, 240, 240));
        jTFFisioMasculinos.setText("0");
        jTFFisioMasculinos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Masculino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jTFFisioMasculinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFFisioMasculinosActionPerformed(evt);
            }
        });

        jLCantEnInformatica.setText("Informatica:");

        jTFInforFemeninos.setEditable(false);
        jTFInforFemeninos.setBackground(new java.awt.Color(240, 240, 240));
        jTFInforFemeninos.setText("0");
        jTFInforFemeninos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Femenino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jTFInforFemeninos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFInforFemeninosActionPerformed(evt);
            }
        });

        jTFInforMasculinos.setEditable(false);
        jTFInforMasculinos.setBackground(new java.awt.Color(240, 240, 240));
        jTFInforMasculinos.setText("0");
        jTFInforMasculinos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Masculino", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(100, 100, 100))); // NOI18N
        jTFInforMasculinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFInforMasculinosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addComponent(jLCantEnEnfermeria)
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jLCantEnNutricion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFNutriFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFEnferFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFEnferMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNutriMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(134, 134, 134)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCantEnInformatica)
                        .addGap(50, 50, 50)
                        .addComponent(jTFInforFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCantEnFisioterapia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFFisioFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTFFisioMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFInforMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFEnferMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFEnferFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFFisioFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFFisioMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLCantEnEnfermeria))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLCantEnFisioterapia)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNutriFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNutriMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFInforFemeninos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFInforMasculinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCantEnNutricion)
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLCantEnInformatica)
                        .addGap(35, 35, 35))))
        );

        jBInscribir.setText("Inscribir Alumno");

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPDetalleInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(117, 117, 117)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBInscribir)
                    .addComponent(jVaciar)
                    .addComponent(jBLimpiar))
                .addGap(18, 18, 18)
                .addComponent(jPDetalleInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFEnferFemeninosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFEnferFemeninosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFEnferFemeninosActionPerformed

    private void jTFFisioFemeninosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFisioFemeninosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFisioFemeninosActionPerformed

    private void jTFFisioMasculinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFFisioMasculinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFFisioMasculinosActionPerformed

    private void jTFInforFemeninosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFInforFemeninosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFInforFemeninosActionPerformed

    private void jTFInforMasculinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFInforMasculinosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFInforMasculinosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormularioFinal dialog = new FormularioFinal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JComboBox<String> jCBAlumnosEnEnfermeria;
    private javax.swing.JComboBox<String> jCBAlumnosEnFisioterapia;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLCantEnEnfermeria;
    private javax.swing.JLabel jLCantEnFisioterapia;
    private javax.swing.JLabel jLCantEnInformatica;
    private javax.swing.JLabel jLCantEnNutricion;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLSexo;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JList<String> jLiInformatica;
    private javax.swing.JList<String> jLiNutricion;
    private javax.swing.JPanel jPCarreras;
    private javax.swing.JPanel jPDetalleInscripcion;
    private javax.swing.JPanel jPRegistrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRBEnfermeria;
    private javax.swing.JRadioButton jRBFisioterapia;
    private javax.swing.JRadioButton jRBInformatica;
    private javax.swing.JRadioButton jRBNutricion;
    private javax.swing.JScrollPane jSPInformatica;
    private javax.swing.JScrollPane jSPNutricion;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFEdad;
    private javax.swing.JTextField jTFEnferFemeninos;
    private javax.swing.JTextField jTFEnferMasculinos;
    private javax.swing.JTextField jTFFisioFemeninos;
    private javax.swing.JTextField jTFFisioMasculinos;
    private javax.swing.JTextField jTFInforFemeninos;
    private javax.swing.JTextField jTFInforMasculinos;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFNutriFemeninos;
    private javax.swing.JTextField jTFNutriMasculinos;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JButton jVaciar;
    // End of variables declaration//GEN-END:variables
}
