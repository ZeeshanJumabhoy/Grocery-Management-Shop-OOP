/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.loginpage;

import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Nusrat Ali
 */
public class adminboard extends javax.swing.JFrame {

    /**
     * Creates new form adminboard
     */
    public adminboard() {
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

        jPanel3 = new javax.swing.JPanel();
        lblsignout = new javax.swing.JLabel();
        lblexit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        addstaff = new javax.swing.JButton();
        managestaff = new javax.swing.JButton();
        addproduct = new javax.swing.JButton();
        manageproduct = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);

        lblsignout.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        lblsignout.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        lblsignout.setForeground(new java.awt.Color(0, 102, 51));
        lblsignout.setText("Sign Out");
        lblsignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsignoutMouseClicked(evt);
            }
        });

        lblexit.setFont(new java.awt.Font("Georgia", 1, 20)); // NOI18N
        lblexit.setForeground(new java.awt.Color(0, 102, 51));
        lblexit.setText("Exit");
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
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblsignout, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(lblexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(lblsignout, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(lblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 170, 310));

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 51));
        jLabel2.setText("Welcome To Admin Panel");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 470, 40));

        jPanel1.setOpaque(false);

        addstaff.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addstaff.setForeground(new java.awt.Color(0, 102, 0));
        addstaff.setText("Add Staff");
        addstaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        addstaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addstaffMouseClicked(evt);
            }
        });

        managestaff.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        managestaff.setForeground(new java.awt.Color(0, 102, 0));
        managestaff.setText("Manage Staff");
        managestaff.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        managestaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                managestaffMouseClicked(evt);
            }
        });

        addproduct.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        addproduct.setForeground(new java.awt.Color(0, 102, 0));
        addproduct.setText("Add product");
        addproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        addproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addproductMouseClicked(evt);
            }
        });
        addproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addproductActionPerformed(evt);
            }
        });

        manageproduct.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        manageproduct.setForeground(new java.awt.Color(0, 102, 0));
        manageproduct.setText("Manage Product");
        manageproduct.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        manageproduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageproductMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(manageproduct, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(addproduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(managestaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addstaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addstaff, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(managestaff, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(addproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(manageproduct, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addGap(25, 25, 25))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 210, 480));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nusrat Ali\\Desktop\\New folder\\gu.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 860));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblsignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsignoutMouseClicked
        welcome we = new welcome();
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are you sure to Logout?" );
        switch (res) {
            case 0:
                
                we.setVisible(true);    //opens the LoginType Jframe.
                this.setVisible(false);     //closes the current JFrame form.
                break;
        //this.setVisible(true);
            default:
                break;
        }
    }//GEN-LAST:event_lblsignoutMouseClicked

    private void addstaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addstaffMouseClicked
        addstaff ad = new addstaff();
        ad.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_addstaffMouseClicked

    private void addproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addproductMouseClicked
    addproduct ap = new addproduct();
        ap.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_addproductMouseClicked

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
    int res;
        res = JOptionPane.showConfirmDialog(this, "Are You sure to exit?");
        System.out.println(res);
        if (res == 0){  
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));        // TODO add your handling code here:
    }//GEN-LAST:event_lblexitMouseClicked
    }
    private void managestaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_managestaffMouseClicked
        managestaff mc =new managestaff();
        mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_managestaffMouseClicked

    private void addproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addproductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addproductActionPerformed

    private void manageproductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageproductMouseClicked
        manageproduct mp =new manageproduct();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_manageproductMouseClicked
    
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
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addproduct;
    private javax.swing.JButton addstaff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblsignout;
    private javax.swing.JButton manageproduct;
    private javax.swing.JButton managestaff;
    // End of variables declaration//GEN-END:variables

}
