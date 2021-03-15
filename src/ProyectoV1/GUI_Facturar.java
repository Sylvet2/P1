/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoV1;

import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dayana
 */
public class GUI_Facturar extends javax.swing.JFrame {
    DefaultTableModel modeloTabla;
    int contador = 1;
    public Usuario datosUsuario;
    
    /**
     * Creates new form GUI_Facturar
     */
    public GUI_Facturar() {
        initComponents();
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Modelo");
        modeloTabla.addColumn("Precio Unitario");
        modeloTabla.addColumn("Cantidad");
      modeloTabla.addColumn("Talla");
        modeloTabla.addColumn("Color");
        modeloTabla.addColumn("Tipo");
        //modeloTabla.addColumn("Valor a pagar");
        tblInformacion.setModel(modeloTabla);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroFactura = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        bntGuardarUsuario = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInformacion = new javax.swing.JTable();
        btnGuardarFactura = new javax.swing.JButton();
        txtPagoFinal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logotipo circular  recta mediano.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 100));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Número");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, -1));

        txtNumeroFactura.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtNumeroFactura.setForeground(new java.awt.Color(255, 0, 0));
        txtNumeroFactura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNumeroFactura.setText("0");
        txtNumeroFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroFacturaActionPerformed(evt);
            }
        });
        jPanel2.add(txtNumeroFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 120, 25));

        txtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaActionPerformed(evt);
            }
        });
        jPanel2.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 80, 20));
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, -1));
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, -1));
        jPanel2.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 140, -1));
        jPanel2.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 140, -1));
        jPanel2.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 140, -1));
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 140, -1));

        bntGuardarUsuario.setFont(new java.awt.Font("Times New Roman", 3, 12)); // NOI18N
        bntGuardarUsuario.setText("GUARDAR USUARIO");
        bntGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntGuardarUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(bntGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        lblNombre.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblNombre.setText("Nombre:");
        jPanel2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        lblApellido.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblApellido.setText("Apellido:");
        jPanel2.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        lblDireccion.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblDireccion.setText("Dirección:");
        jPanel2.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        lblCedula.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblCedula.setText("Cédula:");
        jPanel2.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        lblTelefono.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblTelefono.setText("Teléfono:");
        jPanel2.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lblCorreo.setText("Correo:");
        jPanel2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 620, 310));

        btnGuardarFactura.setText("Guardar");
        btnGuardarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarFacturaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuardarFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, -1, -1));

        txtPagoFinal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPagoFinal.setForeground(new java.awt.Color(255, 0, 0));
        txtPagoFinal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtPagoFinal.setCaretColor(new java.awt.Color(255, 255, 204));
        txtPagoFinal.setDisabledTextColor(new java.awt.Color(255, 255, 204));
        txtPagoFinal.setSelectionColor(new java.awt.Color(255, 255, 204));
        jPanel2.add(txtPagoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 620, 120, 25));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Hoja en blanco.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 670));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 680, 670));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo simple rosa celeste.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-200, 0, 950, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroFacturaActionPerformed
        // TODO add your handling code here:
        Calendar c1 = Calendar.getInstance();

        String dia = Integer.toString(c1.get(Calendar.DATE));
        String mes = Integer.toString(c1.get(Calendar.MONTH));
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        //hola
    }//GEN-LAST:event_txtNumeroFacturaActionPerformed

    private void txtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaActionPerformed

    private void bntGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntGuardarUsuarioActionPerformed
        // TODO add your handling code here:

        try{

            if (txtNombre.getText().isEmpty() || txtApellido.getText().isEmpty() ||txtDireccion.getText().isEmpty() ||
                    txtCedula.getText().isEmpty() ||txtTelefono.getText().isEmpty() ||txtCorreo.getText().isEmpty() ) {
                JOptionPane.showMessageDialog(null, "Estimado Usuario, por favor debe ingresar todos sus datos");
            }
            else{

                String nombre;
                String apellido;
                String direccion;
                String cedula;
                long telefono;
                String correo;

                nombre = txtNombre.getText();
                apellido = txtApellido.getText();
                direccion = txtDireccion.getText();
                cedula = txtCedula.getText();
                telefono = Long.parseLong(txtTelefono.getText());
                correo = txtCorreo.getText();

                int verificador = 0;

                int[] digito = new int[10];

                if (cedula.length() == 10 ){
                    //Asignación de los digitos de la cedula a un array de tipo int
                    for (int i = 0; i < 10; i++) {
                        digito[i] = Integer.parseInt(cedula.substring(i,i+1));
                    }

                    //Suma de los dígitos pares
                    int sumaPares = 0;

                    for (int i = 1; i < 9; i=i+2) {
                        sumaPares = sumaPares+digito[i] ;
                    }

                    //Suma de los dígitos pares
                    int sumaImpares = 0;

                    for (int i = 0; i < 10; i=i+2) {
                        digito[i] = digito[i] * 2;
                        if (digito[i] > 9){
                            digito[i] = digito[i] - 9;
                        }
                        sumaImpares = sumaImpares + digito[i] ;
                    }

                    //Suma Total
                    int sumaTotal = sumaPares +sumaImpares;

                    //Digito verificador
                    verificador = 10-sumaTotal%10 ;

                    if (verificador == digito[9]){
                        //Crea la instancia

                        datosUsuario = new Usuario (nombre, apellido , direccion, correo, telefono, cedula);
                        
                        datosUsuario.agregarTipoPrenda(new TempVerano(GUI_Principal.listaVerano));
                        datosUsuario.agregarTipoPrenda(new TempInvierno(GUI_Principal.listaInvierno));
                        datosUsuario.agregarTipoPrenda(new PrendasBasicas(GUI_Principal.listaBasico));
                        
                        

                        GUI_Principal.usuarios.add(datosUsuario);
                                                                        
                        for (int i = 0; i <= datosUsuario.tipoPrenda.get(0).listaDePrendas.size()-1; ++i) {
                           modeloTabla.addRow(new Object []{datosUsuario.tipoPrenda.get(0).listaDePrendas.get(i).getNombre(),
                           datosUsuario.tipoPrenda.get(0).listaDePrendas.get(i).getPrecio(),
                           datosUsuario.tipoPrenda.get(0).listaDePrendas.get(i).getCantidad(),
                           datosUsuario.tipoPrenda.get(0).listaDePrendas.get(i).getTalla(),
                           datosUsuario.tipoPrenda.get(0).listaDePrendas.get(i).getColor(),"Verano",
                           //datosUsuario.tipoPrenda.get(0).pago
                           });
                        }
                        for (int i = 0; i <= datosUsuario.tipoPrenda.get(1).listaDePrendas.size()-1; ++i) {
                           modeloTabla.addRow(new Object []{datosUsuario.tipoPrenda.get(1).listaDePrendas.get(i).getNombre(),
                           datosUsuario.tipoPrenda.get(1).listaDePrendas.get(i).getPrecio(),
                           datosUsuario.tipoPrenda.get(1).listaDePrendas.get(i).getCantidad(),
                           datosUsuario.tipoPrenda.get(1).listaDePrendas.get(i).getTalla(),
                           datosUsuario.tipoPrenda.get(1).listaDePrendas.get(i).getColor(),"Invierno",
                          // datosUsuario.tipoPrenda.get(1).pago
                           });
                        }
                        for (int i = 0; i <= datosUsuario.tipoPrenda.get(2).listaDePrendas.size()-1; ++i) {
                           modeloTabla.addRow(new Object []{datosUsuario.tipoPrenda.get(2).listaDePrendas.get(i).getNombre(),
                           datosUsuario.tipoPrenda.get(2).listaDePrendas.get(i).getPrecio(),
                           datosUsuario.tipoPrenda.get(2).listaDePrendas.get(i).getCantidad(),
                           datosUsuario.tipoPrenda.get(2).listaDePrendas.get(i).getTalla(),
                           datosUsuario.tipoPrenda.get(2).listaDePrendas.get(i).getColor(),"Basicas",
                           //datosUsuario.tipoPrenda.get(2).pago
                           });
                        }

                    }
                    else {
                        //Cedula no valida
                        JOptionPane.showMessageDialog(null, "Lo sentimos,la cédula ingresada no es válida\nPor favor ingresar de nuevo los datos");
                        txtCedula.setText(null);
                    }
                }
                else {
                    //No tiene 10 digitos
                    JOptionPane.showMessageDialog(null, "Estiamdo usuario, la cédula debe contener 10 digitos\nPor favor volver a ingresar sus datos");
                    txtCedula.setText(null);
                }

                //    lista = new DefaultComboBoxModel(Usuarios);

                //dispose();

            }

        } catch (NumberFormatException nfe){
            JOptionPane.showMessageDialog(rootPane,"Sólo se puede colocar números en Telefóno y Cédula");

            txtTelefono.setText(null);
            txtCedula.setText(null);

        }
    }//GEN-LAST:event_bntGuardarUsuarioActionPerformed

    private void btnGuardarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarFacturaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        txtNumeroFactura.setText(Integer.toString((Integer.parseInt(txtNumeroFactura.getText())+ 1)));
        
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(GUI_Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Facturar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Facturar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntGuardarUsuario;
    private javax.swing.JButton btnGuardarFactura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblInformacion;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroFactura;
    private javax.swing.JTextField txtPagoFinal;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}