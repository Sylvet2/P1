/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

/**
 *
 * @author Dayana
 */
public class GUI_Factura extends javax.swing.JFrame {

    /**
     * Creates new form GUI_Factura
     */
    public GUI_Factura() {
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

        pnlFondo = new javax.swing.JPanel();
        pnlBlanco = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPagoFinal = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        cmbClientes = new javax.swing.JComboBox<>();
        btnCliente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInformacion = new javax.swing.JTable();
        txtNúmeroFactura1 = new javax.swing.JTextField();
        btnGuardarFactura = new javax.swing.JButton();
        lblBlanco = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBlanco.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Número");
        pnlBlanco.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtPagoFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPagoFinal.setForeground(new java.awt.Color(255, 0, 0));
        txtPagoFinal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPagoFinal.setCaretColor(new java.awt.Color(255, 255, 204));
        txtPagoFinal.setDisabledTextColor(new java.awt.Color(255, 255, 204));
        txtPagoFinal.setSelectionColor(new java.awt.Color(255, 255, 204));
        pnlBlanco.add(txtPagoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, 120, 25));
        pnlBlanco.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 80, 20));

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbClientes.setSelectedIndex(-1);
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });
        pnlBlanco.add(cmbClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 300, 25));

        btnCliente.setText("Nuevo Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });
        pnlBlanco.add(btnCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        tblInformacion.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblInformacion);

        pnlBlanco.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 620, 310));

        txtNúmeroFactura1.setForeground(new java.awt.Color(255, 0, 0));
        txtNúmeroFactura1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        pnlBlanco.add(txtNúmeroFactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 25));

        btnGuardarFactura.setText("Guardar");
        btnGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFacturaActionPerformed(evt);
            }
        });
        pnlBlanco.add(btnGuardarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, -1, -1));

        lblBlanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hoja en blanco.png"))); // NOI18N
        pnlBlanco.add(lblBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 610));

        pnlFondo.add(pnlBlanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 690, 610));

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo simple rosa celeste.png"))); // NOI18N
        pnlFondo.add(lblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 950, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarFacturaActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        GUI_DatosUsuario irUsuario = new GUI_DatosUsuario();
        irUsuario.setVisible(true);
       
    }//GEN-LAST:event_btnClienteActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_cmbClientesActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Factura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Factura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnGuardarFactura;
    public javax.swing.JComboBox<String> cmbClientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBlanco;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JPanel pnlBlanco;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTable tblInformacion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNúmeroFactura1;
    private javax.swing.JTextField txtPagoFinal;
    // End of variables declaration//GEN-END:variables
}