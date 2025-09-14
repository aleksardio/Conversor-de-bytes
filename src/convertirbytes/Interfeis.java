package convertirbytes;

import javax.swing.JOptionPane;
public class Interfeis extends javax.swing.JFrame {
    public Interfeis() {
        initComponents();
        setLocationRelativeTo(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bytestxt = new javax.swing.JTextField();
        conver1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        conver2 = new javax.swing.JComboBox<>();
        conversionlbl = new javax.swing.JLabel();
        converbut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setFont(new java.awt.Font("DengXian", 1, 24)); // NOI18N
        jLabel1.setText("CONVERTIR BYTES");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Convertir");

        bytestxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bytestxtActionPerformed(evt);
            }
        });

        conver1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bytes", "Kilobytes", "Megabytes", "Gigabytes", "Terabytes" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("a");

        conver2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bytes", "Kilobytes", "Megabytes", "Gigabytes", "Terabytes" }));

        conversionlbl.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        converbut.setText("convertir");
        converbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                converbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bytestxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(conver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(converbut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(conversionlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(bytestxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(conver1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(conver2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(converbut)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(conversionlbl)
                .addGap(59, 59, 59))
        );

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

    private void bytestxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bytestxtActionPerformed
    }//GEN-LAST:event_bytestxtActionPerformed

    private void converbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_converbutActionPerformed
        String textoBytes = bytestxt.getText();
        if (textoBytes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, introduce una cantidad.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            double cantidad = Double.parseDouble(textoBytes);

            String unidadOrigen = (String) conver1.getSelectedItem();
            String unidadDestino = (String) conver2.getSelectedItem();

            if (unidadOrigen.equals(unidadDestino)) {
                 JOptionPane.showMessageDialog(this, "Por favor, selecciona unidades diferentes.", "Aviso", JOptionPane.WARNING_MESSAGE);
                return; 
            }
            double cantidadEnBytes = 0;
            switch (unidadOrigen) {
                case "Bytes":
                    cantidadEnBytes = cantidad;
                    break;
                case "Kilobytes":
                    cantidadEnBytes = cantidad * 1024;
                    break;
                case "Megabytes":
                    cantidadEnBytes = cantidad * Math.pow(1024, 2);
                    break;
                case "Gigabytes":
                    cantidadEnBytes = cantidad * Math.pow(1024, 3);
                    break;
                case "Terabytes":
                    cantidadEnBytes = cantidad * Math.pow(1024, 4);
                    break;
            }
            double resultado = 0;
            switch (unidadDestino) {
                case "Bytes":
                    resultado = cantidadEnBytes;
                    break;
                case "Kilobytes":
                    resultado = cantidadEnBytes / 1024;
                    break;
                case "Megabytes":
                    resultado = cantidadEnBytes / Math.pow(1024, 2);
                    break;
                case "Gigabytes":
                    resultado = cantidadEnBytes / Math.pow(1024, 3);
                    break;
                case "Terabytes":
                    resultado = cantidadEnBytes / Math.pow(1024, 4);
                    break;
            }
            conversionlbl.setText(String.format("%.12f %s", resultado, unidadDestino));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor ingresado no es un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_converbutActionPerformed

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
            java.util.logging.Logger.getLogger(Interfeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfeis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfeis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bytestxt;
    private javax.swing.JComboBox<String> conver1;
    private javax.swing.JComboBox<String> conver2;
    private javax.swing.JButton converbut;
    private javax.swing.JLabel conversionlbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
