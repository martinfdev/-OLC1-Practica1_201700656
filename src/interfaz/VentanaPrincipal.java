package interfaz;

import clases.Lexico;
import clases.Token;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author pedro
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private String path;
    private final ArrayList<Token> salidaToken;
    private final Lexico lex;

    public VentanaPrincipal() {
        salidaToken = new ArrayList();
        lex = new Lexico(salidaToken);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCodigoEntrada = new javax.swing.JEditorPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jScrollPane4 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        comboBoxImagenes = new javax.swing.JComboBox<>();
        btnGenerarAutomatas = new javax.swing.JButton();
        btnAnalizarEntrada = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalida = new javax.swing.JEditorPane();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuGuardarComo = new javax.swing.JMenuItem();
        menuGenerateXml = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Archivo de entrada");

        jScrollPane2.setViewportView(txtCodigoEntrada);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Lista");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("g");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Arboles");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("d");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Tabla de siguientes");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("g");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Tabla de transiciones");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("h");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Automatas");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("n");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane3.setViewportView(jTree1);

        jScrollPane4.setViewportView(jEditorPane1);

        comboBoxImagenes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arboles", "Siguientes", "Transiciones", "Automatas" }));

        btnGenerarAutomatas.setText("Generar Automatas");

        btnAnalizarEntrada.setText("Analizar Entrada");
        btnAnalizarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarEntradaActionPerformed(evt);
            }
        });

        txtSalida.setEditable(false);
        txtSalida.setBackground(new java.awt.Color(0, 0, 0));
        txtSalida.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        txtSalida.setForeground(new java.awt.Color(95, 163, 242));
        txtSalida.setCaretColor(java.awt.Color.white);
        txtSalida.setDisabledTextColor(new java.awt.Color(0, 51, 255));
        txtSalida.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        txtSalida.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtSalida);

        jLabel2.setText("Salida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(comboBoxImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGenerarAutomatas)
                                .addGap(165, 165, 165)
                                .addComponent(btnAnalizarEntrada)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(comboBoxImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAnalizarEntrada)
                    .addComponent(btnGenerarAutomatas))
                .addGap(3, 3, 3)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenu1.setText("Archivo");

        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(menuAbrir);

        menuGuardar.setText("Guardar");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardar);

        menuGuardarComo.setText("Guardar Como");
        menuGuardarComo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarComoActionPerformed(evt);
            }
        });
        jMenu1.add(menuGuardarComo);

        menuGenerateXml.setText("Generar XML");
        jMenu1.add(menuGenerateXml);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        File archivo;
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        file.setFileSelectionMode(JFileChooser.FILES_ONLY);
        file.addChoosableFileFilter(new FileNameExtensionFilter("Archivo tipo er", "er"));
        file.setAcceptAllFileFilterUsed(true);
        int opcion = file.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {

            archivo = file.getSelectedFile();
            path = file.getSelectedFile().getPath();
            //  System.out.println(archivo+" "+path);
            if (archivo.canRead()) {
                String documento = leerArchivo(archivo);
                txtCodigoEntrada.setText(documento);
            }
        }
    }//GEN-LAST:event_menuAbrirActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        System.out.println("menu guardar");
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuGuardarComoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarComoActionPerformed
        System.out.println("guardar como");
    }//GEN-LAST:event_menuGuardarComoActionPerformed

    private void btnAnalizarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarEntradaActionPerformed
        if (!"".equals(txtCodigoEntrada.getText())) {
            lex.scanner(txtCodigoEntrada.getText());
            limpiarConsola();
            imprimirResultado();
        }
    }//GEN-LAST:event_btnAnalizarEntradaActionPerformed

    private String leerArchivo(File archivo) {
        FileInputStream entrada;
        InputStreamReader ent;
        String documento = "";
        try {
            entrada = new FileInputStream(archivo);
            ent = new InputStreamReader(entrada, "UTF-8");

            int ascci;

            while ((ascci = ent.read()) != -1) {
                char caracter = (char) ascci;
                documento += caracter;
            }
        } catch (Exception e) {
        }
        return documento;
    }

    private void imprimirResultado() {
        String texto="";
        for (Token token : salidaToken) {
            texto = texto+""+token.getLexema()+"\t\t"+token.getTipoToken()+"\n";
        }
        txtSalida.setText(texto);
    }
    
    private void limpiarConsola(){
        txtSalida.setText("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarEntrada;
    private javax.swing.JButton btnGenerarAutomatas;
    private javax.swing.JComboBox<String> comboBoxImagenes;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenuItem menuGenerateXml;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuGuardarComo;
    private javax.swing.JEditorPane txtCodigoEntrada;
    private javax.swing.JEditorPane txtSalida;
    // End of variables declaration//GEN-END:variables
}