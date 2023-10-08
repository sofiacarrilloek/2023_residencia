/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;

import java.awt.Color;
import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;

/**
 *
 * @author sofia
 */
public class corte extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    Color  btnColor= new Color(152,82,87);
     Color btnColorEntered = new Color(193,142,151);
    public corte() {
        this.setExtendedState(MAXIMIZED_BOTH);
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

        jPanel5 = new javax.swing.JPanel();
        panelBackground = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnApartados = new javax.swing.JButton();
        btnVentas = new javax.swing.JButton();
        btnClientes1 = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnProductos1 = new javax.swing.JButton();
        btnCorte = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(191, 130, 135));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("IMAGEN");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.setPreferredSize(new java.awt.Dimension(300, 100));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 300, 60));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Punto de venta");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 450, 80));

        panelBackground.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30000, 80));

        jPanel2.setBackground(new java.awt.Color(237, 191, 194));

        btnApartados.setBackground(new java.awt.Color(193, 142, 151));
        btnApartados.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnApartados.setForeground(new java.awt.Color(255, 255, 255));
        btnApartados.setText("Apartados");
        btnApartados.setBorderPainted(false);
        btnApartados.setFocusPainted(false);
        btnApartados.setFocusable(false);
        btnApartados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnApartadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnApartadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnApartadosMouseExited(evt);
            }
        });
        btnApartados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApartadosActionPerformed(evt);
            }
        });

        btnVentas.setBackground(new java.awt.Color(193, 142, 151));
        btnVentas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnVentas.setForeground(new java.awt.Color(255, 255, 255));
        btnVentas.setText("Ventas");
        btnVentas.setBorderPainted(false);
        btnVentas.setFocusPainted(false);
        btnVentas.setFocusable(false);
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVentasMouseExited(evt);
            }
        });
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });

        btnClientes1.setBackground(new java.awt.Color(155, 82, 87));
        btnClientes1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnClientes1.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes1.setText("Clientes");
        btnClientes1.setBorderPainted(false);
        btnClientes1.setFocusPainted(false);
        btnClientes1.setFocusable(false);
        btnClientes1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClientes1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientes1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientes1MouseExited(evt);
            }
        });
        btnClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes1ActionPerformed(evt);
            }
        });

        btnInventario.setBackground(new java.awt.Color(193, 142, 151));
        btnInventario.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnInventario.setForeground(new java.awt.Color(255, 255, 255));
        btnInventario.setText("Inventario");
        btnInventario.setBorderPainted(false);
        btnInventario.setFocusPainted(false);
        btnInventario.setFocusable(false);
        btnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInventarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInventarioMouseExited(evt);
            }
        });
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnProductos1.setBackground(new java.awt.Color(193, 142, 151));
        btnProductos1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnProductos1.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos1.setText("Productos");
        btnProductos1.setBorderPainted(false);
        btnProductos1.setFocusPainted(false);
        btnProductos1.setFocusable(false);
        btnProductos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProductos1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductos1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductos1MouseExited(evt);
            }
        });
        btnProductos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos1ActionPerformed(evt);
            }
        });

        btnCorte.setBackground(new java.awt.Color(193, 142, 151));
        btnCorte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCorte.setForeground(new java.awt.Color(255, 255, 255));
        btnCorte.setText("Corte");
        btnCorte.setBorderPainted(false);
        btnCorte.setFocusPainted(false);
        btnCorte.setFocusable(false);
        btnCorte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCorteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCorteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCorteMouseExited(evt);
            }
        });
        btnCorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCorteActionPerformed(evt);
            }
        });

        btnReporte.setBackground(new java.awt.Color(193, 142, 151));
        btnReporte.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnReporte.setForeground(new java.awt.Color(255, 255, 255));
        btnReporte.setText("Reportes");
        btnReporte.setBorderPainted(false);
        btnReporte.setFocusPainted(false);
        btnReporte.setFocusable(false);
        btnReporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnReporteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReporteMouseExited(evt);
            }
        });
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnApartados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReporte)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClientes1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApartados, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelBackground.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 2000, 50));

        jLabel7.setBackground(new java.awt.Color(89, 89, 89));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("       Corte");
        jLabel7.setOpaque(true);
        panelBackground.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1540, 30));

        getContentPane().add(panelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 3000, 3000));

        setBounds(0, 0, 1510, 771);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApartadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartadosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnApartadosMouseClicked

    private void btnApartadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartadosMouseEntered
        // TODO add your handling code here:
        //btnAcceder.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnApartadosMouseEntered

    private void btnApartadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnApartadosMouseExited
        // TODO add your handling code heres:
        //btnAcceder.setBackground(btnColor);
    }//GEN-LAST:event_btnApartadosMouseExited

    private void btnApartadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApartadosActionPerformed
        // TODO add your handling code here:
        corte a = new corte();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnApartadosActionPerformed

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
        // TODO add your handling code here:
        btnVentas.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseEntered
        // TODO add your handling code here:
        btnVentas.setBackground(btnColorEntered);
    }//GEN-LAST:event_btnVentasMouseEntered

    private void btnVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVentasMouseExited

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        // TODO add your handling code here:
        dashboard dash = new dashboard();
        dash.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnClientes1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientes1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes1MouseClicked

    private void btnClientes1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientes1MouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_btnClientes1MouseEntered

    private void btnClientes1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientes1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes1MouseExited

    private void btnClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes1ActionPerformed
        // TODO add your handling code here:
        Clientes clientes = new Clientes();
        clientes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnClientes1ActionPerformed

    private void btnInventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioMouseClicked

    private void btnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioMouseEntered

    private void btnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInventarioMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioMouseExited

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnProductos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos1MouseClicked

    private void btnProductos1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos1MouseEntered

    private void btnProductos1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductos1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos1MouseExited

    private void btnProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProductos1ActionPerformed

    private void btnCorteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorteMouseClicked

    private void btnCorteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorteMouseEntered

    private void btnCorteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorteMouseExited

    private void btnCorteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCorteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCorteActionPerformed

    private void btnReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteMouseClicked

    private void btnReporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteMouseEntered

    private void btnReporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReporteMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteMouseExited

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReporteActionPerformed

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
            java.util.logging.Logger.getLogger(corte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(corte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(corte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(corte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new corte().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApartados;
    private javax.swing.JButton btnClientes1;
    private javax.swing.JButton btnCorte;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnProductos1;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel panelBackground;
    // End of variables declaration//GEN-END:variables
}
