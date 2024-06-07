package Clases;

import Conexiones.Conexion;
import java.awt.Image;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Main extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = Conexion.getConexion();

    DefaultTableModel model = new DefaultTableModel();
    PreparedStatement ps = null;
    Statement st = null;
    ResultSet rs = null;

    static ResultSet res;

    public Main() {
        //Abrir ventana con componentes principales
        initComponents();
        Image icon = new ImageIcon(getClass().getResource("/Clases/Bopisa_icono.png")).getImage();
        setIconImage(icon);
        fechaOCS.setVisible(false);

        //Cargar tabla para mostrar todas las ordenes
        CargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnPrint = new javax.swing.JButton();
        OC = new javax.swing.JTextField();
        Qty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        OCS = new javax.swing.JTextField();
        fechaOCS = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaOrdenes = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOPISA ETIQUETAS DE LOTES");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar (1).png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Orden de compra");

        btnPrint.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/file.png"))); // NOI18N
        btnPrint.setText("Imprimir");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        OC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        OC.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        Qty.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cantidad");

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Orden de compra");

        OCS.setEditable(false);
        OCS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        OCS.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        fechaOCS.setEditable(false);
        fechaOCS.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fechaOCS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fechaOCS.setName(""); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(OC, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fechaOCS, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(OCS, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Qty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrint)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Qty, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OCS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPrint)
                    .addComponent(fechaOCS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch))
            .addComponent(OC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel6.getAccessibleContext().setAccessibleName("OC");

        jPanel2.setBackground(new java.awt.Color(0, 136, 172));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/BOPISA-white.png"))); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Impresión etiquetas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );

        tablaOrdenes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tablaOrdenes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaOrdenes.setRowHeight(25);
        tablaOrdenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaOrdenesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaOrdenes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Impresión");

        getAccessibleContext().setAccessibleName("Bopisa etiquetas");
        getAccessibleContext().setAccessibleDescription("Cambio de operaciones en BOM");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void CargarTabla() {
        String[] titulos = {"OC", "No_Lote", "ItemID", "Cantidad", "Proveedor", "Fecha"};
        String[] registros = new String[200];
        //PCS_DES_LOTESPO
        String sql = "SELECT dbo.PCS_DES_LOTESPO.* FROM dbo.PCS_DES_LOTESPO ORDER BY [02_Fecha] DESC";

        model = new DefaultTableModel(null, titulos);
        Connection conect = Conexion.getConexion();
        try {
            st = (Statement) conect.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {

                registros[0] = rs.getString("05_OC");
                registros[1] = rs.getString("01_No_Lote");
                registros[2] = rs.getString("03_ItemID");
                registros[3] = rs.getString("08_Cantidad");
                registros[4] = rs.getString("10_Name_Prov");
                registros[5] = rs.getString("02_Fecha");

                model.addRow(registros);
            }
            tablaOrdenes.setModel(model);

        } catch (SQLException ex) {
            System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
        }
        /* Prueba datos
        registros[0] = "PRUEBA1";
        model.addRow(registros);
        registros[0] = "PRUEBA2";
        model.addRow(registros);
        registros[0] = "PRUEBA3";
        model.addRow(registros);
        registros[0] = "PRUEBA4";//registros[4] = rs.getString("WOO_OperationSeqDescription");7model.addRow(registros);
        tablaOrdenes.setModel(model);*/
    }

    private void tablaOrdenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaOrdenesMouseClicked
        int seleccionar = tablaOrdenes.rowAtPoint(evt.getPoint());
        OCS.setText(String.valueOf(tablaOrdenes.getValueAt(seleccionar, 0)));
        fechaOCS.setText(String.valueOf(tablaOrdenes.getValueAt(seleccionar, 5)));
    }//GEN-LAST:event_tablaOrdenesMouseClicked

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        if (Qty.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR:         \n Por favor ingrese una cantidad.", "ERROR", 0);
        } else {
            try {
                Conexion con = new Conexion();
                Connection cn = Conexion.getConexion();

                //String path = "C:\\Users\\hecto\\Documents\\NetBeansProjects\\ImpresionEtiquetasBopisa\\src\\Reportes\\etiqueta.jasper";
                //Bolseadora 15 y 17
                String path = "C:\\ImpresionEtiquetasBopisa\\src\\Reportes\\etiqueta.jasper";
                // Parámetros para el reporte
                Map<String, Object> parametro = new HashMap<>();
                parametro.put("OC", OCS.getText());
                parametro.put("fechaOC", fechaOCS.getText());
                parametro.put("QtyEt", Qty.getText());
                
                // Obtener la cantidad de etiquetas a imprimir
                int cantidad = Integer.parseInt(Qty.getText());
                //System.out.println("Cantidad de etiquetas a imprimir: " + cantidad);

                // Cargar el reporte
                //System.out.println("Cargando el reporte desde: " + path);
                JasperReport reporte = (JasperReport) JRLoader.loadObjectFromFile(path);

                // Crear un JasperPrint vacío
                JasperPrint finalJprint = new JasperPrint();
                finalJprint.setPageWidth(425);  // Ancho de la página en pixels
                finalJprint.setPageHeight(283); // Asegúrate de que esto coincide con el alto de tus páginas

                // Llenar el reporte para cada etiqueta
                for (int i = 0; i < cantidad; i++) {
                    String paginaActual = Integer.toString(i+1);
                    System.out.println("Generando etiqueta " + paginaActual);
                    parametro.put("pagAct", paginaActual);
                    //System.out.println("Generando etiqueta " + (i + 1));
                    JasperPrint jprint = JasperFillManager.fillReport(reporte, parametro, cn);
                    //System.out.println("Número de páginas generadas: " + jprint.getPages().size());
                    for (int pageIndex = 0; pageIndex < jprint.getPages().size(); pageIndex++) {
                        finalJprint.addPage(jprint.getPages().get(pageIndex));
                        //System.out.println("Página " + (pageIndex + 1) + " agregada al reporte final.");
                    }
                }

                // Mostrar el reporte en una sola ventana
                //System.out.println("Mostrando el reporte final.");
                JasperViewer view = new JasperViewer(finalJprint, false);
                view.setDefaultCloseOperation(JasperViewer.DISPOSE_ON_CLOSE);
                view.setVisible(true);

            } catch (JRException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    //Metodo para buscar una orden en especifico
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        if (OC.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ERROR:         \n Buscador vacio", "ERROR", 0);
            CargarTabla();
        } else {
            String sql = "SELECT [01_No_Lote], [03_ItemID], [08_Cantidad], [05_OC], [10_Name_Prov], [02_Fecha] FROM dbo.PCS_DES_LOTESPO "
                    + "WHERE [05_OC] LIKE '%" + OC.getText() + "%' ORDER BY [02_Fecha] DESC";
            String[] titulos = {"OC", "No_Lote", "ItemID", "Cantidad", "Proveedor", "Fecha"};
            String[] registros = new String[200];

            model = new DefaultTableModel(null, titulos);
            Connection conect = Conexion.getConexion();
            try {
                st = (Statement) conect.createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {

                    registros[0] = rs.getString("05_OC");
                    registros[1] = rs.getString("01_No_Lote");
                    registros[2] = rs.getString("03_ItemID");
                    registros[3] = rs.getString("08_Cantidad");
                    registros[4] = rs.getString("10_Name_Prov");
                    registros[5] = rs.getString("02_Fecha");

                    model.addRow(registros);
                }
                tablaOrdenes.setModel(model);

            } catch (SQLException ex) {
                System.out.println("ERROR AL BUSCAR LOS DATOS : " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField OC;
    public static javax.swing.JTextField OCS;
    public static javax.swing.JTextField Qty;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnSearch;
    public static javax.swing.JTextField fechaOCS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaOrdenes;
    // End of variables declaration//GEN-END:variables
}
