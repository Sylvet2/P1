/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

/**
 *
 * @author USUARIO
 */
public class InterfazMujer extends javax.swing.JFrame {

    /**
     * Creates new form InferazMujer
     */
    public InterfazMujer() {
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

        jPanel1 = new javax.swing.JPanel();
        btnPrendasBasicasMujer = new javax.swing.JButton();
        btnVeranoMujer = new javax.swing.JButton();
        btnInviernoMujer = new javax.swing.JButton();
        btnAtrasMujer = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrendasBasicasMujer.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnPrendasBasicasMujer.setForeground(new java.awt.Color(51, 51, 51));
        btnPrendasBasicasMujer.setText("Atrás ");
        btnPrendasBasicasMujer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnPrendasBasicasMujer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrendasBasicasMujerActionPerformed(evt);
            }
        });
        jPanel1.add(btnPrendasBasicasMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 70, 30));

        btnVeranoMujer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVeranoMujer.setForeground(new java.awt.Color(51, 51, 51));
        btnVeranoMujer.setText("INVIERNO");
        btnVeranoMujer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnVeranoMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 80, 30));

        btnInviernoMujer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnInviernoMujer.setForeground(new java.awt.Color(51, 51, 51));
        btnInviernoMujer.setText("VERANO");
        btnInviernoMujer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnInviernoMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 80, 30));

        btnAtrasMujer.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtrasMujer.setForeground(new java.awt.Color(51, 51, 51));
        btnAtrasMujer.setText("PRENDAS BÁSICAS");
        btnAtrasMujer.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnAtrasMujer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Seleccione una temporada...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nubemujer.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 290));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrendasBasicasMujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrendasBasicasMujerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPrendasBasicasMujerActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazMujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazMujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazMujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazMujer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazMujer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasMujer;
    private javax.swing.JButton btnInviernoMujer;
    private javax.swing.JButton btnPrendasBasicasMujer;
    private javax.swing.JButton btnVeranoMujer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
