/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginpage;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nusrat Ali
 */
public class userdashboard extends javax.swing.JFrame {

    /**
     * Creates new form userdashboard
     */
    public userdashboard() {
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

        jPanel2 = new javax.swing.JPanel();
        welcomelbl = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        feedbackbtn = new javax.swing.JButton();
        orderproductbtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblsignout = new javax.swing.JLabel();
        logutbtn = new javax.swing.JLabel();
        lblexit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        welcomelbl.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        welcomelbl.setForeground(new java.awt.Color(0, 102, 51));
        welcomelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomelbl.setText("Welcome To Grocery Store");
        welcomelbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 102, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(welcomelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(welcomelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 500, -1));

        jPanel1.setOpaque(false);

        feedbackbtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        feedbackbtn.setForeground(new java.awt.Color(0, 102, 0));
        feedbackbtn.setText("Feedback");
        feedbackbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        feedbackbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                feedbackbtnMouseClicked(evt);
            }
        });
        feedbackbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackbtnActionPerformed(evt);
            }
        });

        orderproductbtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        orderproductbtn.setForeground(new java.awt.Color(0, 102, 0));
        orderproductbtn.setText("Order Products");
        orderproductbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        orderproductbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderproductbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(feedbackbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderproductbtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(orderproductbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addComponent(feedbackbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 470));

        jPanel3.setOpaque(false);

        lblsignout.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        lblsignout.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        lblsignout.setForeground(new java.awt.Color(0, 102, 51));
        lblsignout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsignout.setText("Sign Out");
        lblsignout.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 51), null));
        lblsignout.setOpaque(true);
        lblsignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsignoutMouseClicked(evt);
            }
        });

        logutbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        logutbtn.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        logutbtn.setForeground(new java.awt.Color(0, 102, 51));
        logutbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logutbtn.setText("Log Out");
        logutbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 51), null));
        logutbtn.setOpaque(true);
        logutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logutbtnMouseClicked(evt);
            }
        });

        lblexit.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        lblexit.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        lblexit.setForeground(new java.awt.Color(0, 102, 51));
        lblexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexit.setText("Exit");
        lblexit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 102, 51), null));
        lblexit.setOpaque(true);
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblexit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblsignout, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(logutbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(lblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblsignout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(logutbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, -1, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nusrat Ali\\Desktop\\New folder\\gu.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 830));

        setBounds(0, 0, 736, 869);
    }// </editor-fold>//GEN-END:initComponents

    private void lblsignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsignoutMouseClicked
        // TODO add your handling code here:
        welcome we = new welcome();
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are you sure to Logout?" );
        switch (res) {
            case 0:
            we.setVisible(true);   
            this.setVisible(false);     
            break;
            //this.setVisible(true);
            default:
            break;
        }
    }//GEN-LAST:event_lblsignoutMouseClicked

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are You sure to exit?");
        System.out.println(res);
        if (res == 0){ 
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));        // TODO add your handling code here:
    }//GEN-LAST:event_lblexitMouseClicked
    }
    private void feedbackbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_feedbackbtnMouseClicked
       userfeedback uf = new userfeedback();
        uf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_feedbackbtnMouseClicked

    private void orderproductbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderproductbtnMouseClicked
        orderproduct op = new orderproduct();
        op.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_orderproductbtnMouseClicked

    private void logutbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logutbtnMouseClicked
        userlogin ul = new userlogin();
        ul.setVisible(true);
        this.setVisible(false);    }//GEN-LAST:event_logutbtnMouseClicked

    private void feedbackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_feedbackbtnActionPerformed

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
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userdashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userdashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton feedbackbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblsignout;
    private javax.swing.JLabel logutbtn;
    private javax.swing.JButton orderproductbtn;
    private javax.swing.JLabel welcomelbl;
    // End of variables declaration//GEN-END:variables
}
