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
public class managestaff extends javax.swing.JFrame {
    managestaffBll mcb = new managestaffBll();
    ManageStaffDao mcd = new ManagestaffDaoImpl();
    /**
     * Creates new form managestaff
     */
    public managestaff() {
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
        jPanel3 = new javax.swing.JPanel();
        lblboard = new javax.swing.JLabel();
        lblexit = new javax.swing.JLabel();
        lblsignout = new javax.swing.JLabel();
        gobacklbl = new javax.swing.JLabel();
        newusernamelbl = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        staffusernamelbl = new javax.swing.JLabel();
        staffusernametxt = new javax.swing.JTextField();
        remvebtn = new javax.swing.JButton();
        submitbtn = new javax.swing.JButton();
        editbtn = new javax.swing.JButton();
        lblnewpassword = new javax.swing.JLabel();
        txtnewpassword = new javax.swing.JTextField();
        lblnewaddress = new javax.swing.JLabel();
        txtnewaddress = new javax.swing.JTextField();
        lblnewcontactno = new javax.swing.JLabel();
        txtnewcontactno = new javax.swing.JTextField();
        newstaffusernamelbl = new javax.swing.JLabel();
        newstaffusernametxt = new javax.swing.JTextField();
        staffidlbl = new javax.swing.JLabel();
        staffidtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));

        lblboard.setBackground(new java.awt.Color(0, 96, 50));
        lblboard.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblboard.setForeground(new java.awt.Color(255, 255, 255));
        lblboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblboard.setText("Dashboard");
        lblboard.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 51), null));
        lblboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblboardMouseClicked(evt);
            }
        });

        lblexit.setBackground(new java.awt.Color(0, 96, 50));
        lblexit.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblexit.setForeground(new java.awt.Color(255, 255, 255));
        lblexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblexit.setText("Exit");
        lblexit.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 51), null));
        lblexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblexitMouseClicked(evt);
            }
        });

        lblsignout.setBackground(new java.awt.Color(0, 96, 50));
        lblsignout.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblsignout.setForeground(new java.awt.Color(255, 255, 255));
        lblsignout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblsignout.setText("Sign Out");
        lblsignout.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 51), null));
        lblsignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsignoutMouseClicked(evt);
            }
        });

        gobacklbl.setBackground(new java.awt.Color(0, 96, 50));
        gobacklbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        gobacklbl.setForeground(new java.awt.Color(255, 255, 255));
        gobacklbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gobacklbl.setText("Go Back");
        gobacklbl.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 153, 51), null));
        gobacklbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gobacklblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblsignout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(gobacklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(gobacklbl, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(lblboard, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(lblexit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lblsignout, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 170, 780));

        newusernamelbl.setBackground(new java.awt.Color(0, 102, 0));

        jLabel2.setFont(new java.awt.Font("Old English Text MT", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Manage Staff");

        staffusernamelbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        staffusernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        staffusernamelbl.setText("Staff Username");

        staffusernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffusernametxtActionPerformed(evt);
            }
        });

        remvebtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        remvebtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        remvebtn.setForeground(new java.awt.Color(255, 255, 255));
        remvebtn.setText("Remove");
        remvebtn.setOpaque(false);
        remvebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                remvebtnMouseClicked(evt);
            }
        });

        submitbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        submitbtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        submitbtn.setForeground(new java.awt.Color(255, 255, 255));
        submitbtn.setText("Submit");
        submitbtn.setOpaque(false);
        submitbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitbtnMouseClicked(evt);
            }
        });
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        editbtn.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        editbtn.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        editbtn.setForeground(new java.awt.Color(255, 255, 255));
        editbtn.setText("Edit");
        editbtn.setOpaque(false);
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });
        editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editbtnActionPerformed(evt);
            }
        });

        lblnewpassword.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblnewpassword.setForeground(new java.awt.Color(255, 255, 255));
        lblnewpassword.setText("Password");

        txtnewpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewpasswordActionPerformed(evt);
            }
        });

        lblnewaddress.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblnewaddress.setForeground(new java.awt.Color(255, 255, 255));
        lblnewaddress.setText("Address");

        txtnewaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewaddressActionPerformed(evt);
            }
        });

        lblnewcontactno.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblnewcontactno.setForeground(new java.awt.Color(255, 255, 255));
        lblnewcontactno.setText("Contact No");

        txtnewcontactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnewcontactnoActionPerformed(evt);
            }
        });

        newstaffusernamelbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        newstaffusernamelbl.setForeground(new java.awt.Color(255, 255, 255));
        newstaffusernamelbl.setText("Staff New Username");

        newstaffusernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newstaffusernametxtActionPerformed(evt);
            }
        });

        staffidlbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        staffidlbl.setForeground(new java.awt.Color(255, 255, 255));
        staffidlbl.setText("Staff ID");

        javax.swing.GroupLayout newusernamelblLayout = new javax.swing.GroupLayout(newusernamelbl);
        newusernamelbl.setLayout(newusernamelblLayout);
        newusernamelblLayout.setHorizontalGroup(
            newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newusernamelblLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(newusernamelblLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(newusernamelblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remvebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(newusernamelblLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblnewpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(staffusernamelbl, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                    .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblnewcontactno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                        .addComponent(lblnewaddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(newstaffusernamelbl)
                    .addComponent(staffidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114)
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(staffidtxt)
                    .addComponent(txtnewaddress)
                    .addComponent(staffusernametxt)
                    .addComponent(txtnewpassword)
                    .addComponent(txtnewcontactno, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(newstaffusernametxt, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))
                .addContainerGap())
        );
        newusernamelblLayout.setVerticalGroup(
            newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newusernamelblLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffusernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffusernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newstaffusernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newstaffusernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnewpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnewaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnewaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblnewcontactno, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(txtnewcontactno))
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newusernamelblLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(staffidlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newusernamelblLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(staffidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(newusernamelblLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remvebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(newusernamelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 480, 560));

        jLabel1.setBackground(new java.awt.Color(33, 150, 48));
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 800, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void staffusernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffusernametxtActionPerformed
    }//GEN-LAST:event_staffusernametxtActionPerformed

    private void lblboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblboardMouseClicked
        adminboard ad = new adminboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblboardMouseClicked

    private void lblexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblexitMouseClicked
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are You sure to exit?");
        System.out.println(res);
        if (res == 0){
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_lblexitMouseClicked

    private void lblsignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsignoutMouseClicked
        welcome we = new welcome();
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are you sure to Logout?" );
        switch (res) {
            case 0:
            we.setVisible(true);   
            this.setVisible(false);     
            break;
        }        
    }//GEN-LAST:event_lblsignoutMouseClicked
  
    private void remvebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_remvebtnMouseClicked
       int userId = Integer.parseInt(staffidtxt.getText());
       mcb.setstaffid(userId);
       mcb.setusername(staffusernametxt.getText());
       int res = JOptionPane.showConfirmDialog(this, "Are you sure to remove the account?");
       if(res == 0){
            mcd.removestaff(mcb);
            staffusernametxt.setText(null);
            staffidtxt.setText(null);
       }
       else{
           staffusernametxt.setText(null);
           staffidtxt.setText(null);
       }

    }//GEN-LAST:event_remvebtnMouseClicked

    
    public void editstaff(){
        staffusernametxt.setVisible(false);
        staffidtxt.setVisible(false);
        staffusernamelbl.setVisible(false);
        staffidlbl.setVisible(false);
        remvebtn.setVisible(false);
        editbtn.setVisible(false);
        newstaffusernamelbl.setVisible(true);
        newstaffusernametxt.setVisible(true);
        lblnewpassword.setVisible(true);
        txtnewpassword.setVisible(true);
        lblnewaddress.setVisible(true);
        txtnewaddress.setVisible(true);
        lblnewcontactno.setVisible(true);
        txtnewcontactno.setVisible(true);
        submitbtn.setVisible(true);
        int userId = Integer.parseInt(staffidtxt.getText());
        mcb.setstaffid(userId);
        mcb.setusername(staffusernametxt.getText());
    }
    
    
    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        editstaff();        
    }//GEN-LAST:event_editbtnMouseClicked

    private void submitbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitbtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_submitbtnMouseClicked

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed

        mcb.setNewPassword(txtnewpassword.getText());
        mcb.setNewAddress(txtnewaddress.getText());
        mcb.setNewPhoneNo(txtnewcontactno.getText());
        mcd.editstaff(mcb);
        JOptionPane.showMessageDialog(this, "Profile edited Successfully.");
        txtnewpassword.setText(null);
        txtnewaddress.setText(null);
        txtnewcontactno.setText(null);
    }//GEN-LAST:event_submitbtnActionPerformed

    private void editbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editbtnActionPerformed
    }//GEN-LAST:event_editbtnActionPerformed

    private void gobacklblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gobacklblMouseClicked
        adminboard ad = new adminboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_gobacklblMouseClicked

    private void txtnewpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewpasswordActionPerformed

    private void txtnewaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewaddressActionPerformed

    private void txtnewcontactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnewcontactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnewcontactnoActionPerformed

    private void newstaffusernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newstaffusernametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newstaffusernametxtActionPerformed

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
            java.util.logging.Logger.getLogger(managestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(managestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(managestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(managestaff.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new managestaff().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editbtn;
    private javax.swing.JLabel gobacklbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblboard;
    private javax.swing.JLabel lblexit;
    private javax.swing.JLabel lblnewaddress;
    private javax.swing.JLabel lblnewcontactno;
    private javax.swing.JLabel lblnewpassword;
    private javax.swing.JLabel lblsignout;
    private javax.swing.JLabel newstaffusernamelbl;
    private javax.swing.JTextField newstaffusernametxt;
    private javax.swing.JPanel newusernamelbl;
    private javax.swing.JButton remvebtn;
    private javax.swing.JLabel staffidlbl;
    private javax.swing.JTextField staffidtxt;
    private javax.swing.JLabel staffusernamelbl;
    private javax.swing.JTextField staffusernametxt;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField txtnewaddress;
    private javax.swing.JTextField txtnewcontactno;
    private javax.swing.JTextField txtnewpassword;
    // End of variables declaration//GEN-END:variables
}
