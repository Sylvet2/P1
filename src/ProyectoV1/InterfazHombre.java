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
public class InterfazHombre extends javax.swing.JFrame {

    /**
     * Creates new form Inferfaz_Hombre
     */
    public InterfazHombre() {
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

        btnPrendasBásicasHombre1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnPrendasBásicasHombre = new javax.swing.JButton();
        btnAtrasHombre = new javax.swing.JButton();
        btnInviernoHombre1 = new javax.swing.JButton();
        btnVeranoHombre1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        btnPrendasBásicasHombre1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnPrendasBásicasHombre1.setText("PRENDAS BÁSICAS");
        btnPrendasBásicasHombre1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPrendasBásicasHombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnPrendasBásicasHombre.setForeground(new java.awt.Color(51, 51, 51));
        btnPrendasBásicasHombre.setText("Atrás");
        btnPrendasBásicasHombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnPrendasBásicasHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 80, 30));

        btnAtrasHombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnAtrasHombre.setForeground(new java.awt.Color(51, 51, 51));
        btnAtrasHombre.setText("PRENDAS BÁSICAS");
        btnAtrasHombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnAtrasHombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 140, 30));

        btnInviernoHombre1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnInviernoHombre1.setForeground(new java.awt.Color(51, 51, 51));
        btnInviernoHombre1.setText("INVIERNO");
        btnInviernoHombre1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnInviernoHombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 100, 30));

        btnVeranoHombre1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnVeranoHombre1.setForeground(new java.awt.Color(51, 51, 51));
        btnVeranoHombre1.setText("VERANO");
        btnVeranoHombre1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(btnVeranoHombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Selecciona una temporada..");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nubehombre.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 399, 278));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(InterfazHombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazHombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazHombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazHombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazHombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtrasHombre;
    private javax.swing.JButton btnInviernoHombre1;
    private javax.swing.JButton btnPrendasBásicasHombre;
    private javax.swing.JButton btnPrendasBásicasHombre1;
    private javax.swing.JButton btnVeranoHombre1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
