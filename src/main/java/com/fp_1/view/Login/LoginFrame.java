/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.fp_1.view.Login;

import javax.swing.JOptionPane;

/**
 *
 * @author kai
 */
public class LoginFrame extends javax.swing.JFrame {

    /**
     * Creates new form LoginFrame
     */
    public String sysadUser="1";
    public String sysadPw="1";
    
    public LoginFrame() {
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

        loginBtn = new javax.swing.JButton();
        clrBtn1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idBox = new javax.swing.JComboBox<>();
        txtUser = new javax.swing.JTextField();
        pwPassword = new javax.swing.JPasswordField();
        clrBtn = new javax.swing.JButton();
        regBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        clrBtn1.setText("Exit");
        clrBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtn1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Login ");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel2.setText("UserName");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel4.setText("Select Your Identity");

        idBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Supplier-MP", "Supplier-PP", "Supplier-PS", "System Admin", " " }));
        idBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idBoxActionPerformed(evt);
            }
        });

        clrBtn.setText("Clear");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });

        regBtn.setText("Register");
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(377, 377, 377))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(clrBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(idBox, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idBox)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pwPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(regBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(clrBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        String loginNa=txtUser.getText();
        String loginPw=pwPassword.getText();

        Object idslct;
        idslct=idBox.getSelectedItem();

        //sysAdminFrame sysAdminFrame=new sysAdminFrame(pDirectory,dDirectory,uDirectory,comDirectory,eHistory,hDirectory,cityDirectory,houseDirectory,this.loginUser);
        //comAdminFrame comAdminFrame=new comAdminFrame(pDirectory,dDirectory,comDirectory,eHistory,hDirectory,cityDirectory,houseDirectory);
        //hosAdminFrame hosAdminFrame=new hosAdminFrame(pDirectory,dDirectory,comDirectory,eHistory,hDirectory,cityDirectory,houseDirectory);

        //patientFrame patientFrame=new patientFrame(pDirectory,dDirectory,hDirectory,eHistory);

        //JOptionPane.showMessageDialog(this, idslct.toString());
        if (idslct.toString()=="System Admin"){
            //sysAdminFrame.setUserIdentity("Sys");
            if (loginNa.equals(sysadUser) & loginPw.equals(sysadPw))
            {
               
                txtUser.setText("");
                pwPassword.setText("");

                
                //sysAdminFrame.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(this, "No Such SysAdmin In System");
                txtUser.setText("");
                pwPassword.setText("");
                return;
            }
            //this.setVisible(false);
        }

        if (idslct.toString()=="Supplier-MP"){
            boolean isin=false;
            //sysAdminFrame.setUserIdentity("Com");
            for (Users us:uDirectory.getDirectory()){
                if(loginNa.equals(us.getUserName()) & loginPw.equals(us.getUserPassword()) & idslct.toString().equals(us.getUserIdentity()))
                {
                    txtUser.setText("");
                    pwPassword.setText("");
                    comAdminFrame comAdminFrame=new comAdminFrame(pDirectory,dDirectory,comDirectory,eHistory,hDirectory,cityDirectory,houseDirectory);
                    comAdminFrame.setVisible(true);
                    isin=true;
                }

            }
            if (!isin){
                JOptionPane.showMessageDialog(this, "No Such ComAdmin In System");
                txtUser.setText("");
                pwPassword.setText("");
            }

            //this.setVisible(false);
        }

        if (idslct.toString()=="Supplier-PP"){
            boolean isin=false;
            for (Users us:uDirectory.getDirectory())
            {
                if(loginNa.equals(us.getUserName()) & loginPw.equals(us.getUserPassword()) & idslct.toString().equals(us.getUserIdentity()))
                {
                    txtUser.setText("");
                    pwPassword.setText("");
                    hosAdminFrame hosAdminFrame=new hosAdminFrame(pDirectory,dDirectory,comDirectory,eHistory,hDirectory,cityDirectory,houseDirectory);
                    hosAdminFrame.setVisible(true);
                    isin=true;
                }

            }
            //sysAdminFrame.setUserIdentity("Hos");
            //JOptionPane.showMessageDialog(this, idslct.toString());
            if (!isin){
                JOptionPane.showMessageDialog(this, "No Such HosAdmin In System");
                txtUser.setText("");
                pwPassword.setText("");
            }
            //this.setVisible(false);
        }

        if (idslct.toString()=="Supplier-PS"){
            boolean isin=false;
            for (Patient pt:pDirectory.getHistory())
            {
                if(loginNa.equals(pt.getMeUser().getUserName()) & loginPw.equals(pt.getMeUser().getUserPassword()) )
                {
                    txtUser.setText("");
                    pwPassword.setText("");
                    String pid=pt.getPatientID();
                    patientFrame patientFrame=new patientFrame(pDirectory,dDirectory,hDirectory,eHistory,uDirectory,pid);
                    patientFrame.setVisible(true);
                    isin=true;
                }

            }
            if (!isin){
                JOptionPane.showMessageDialog(this, "No Such Patient In System");
                txtUser.setText("");
                pwPassword.setText("");
            }
            //this.setVisible(false);
        }

        /*if (idslct.toString()=="Doctor"){
            boolean isin=false;
            for (Doctor dp:dDirectory.getHistory())
            {
                if(loginNa.equals(dp.getMeUser().getUserName()) & loginPw.equals(dp.getMeUser().getUserPassword()) )
                {
                    txtUser.setText("");
                    pwPassword.setText("");
                    String pid=dp.getDoctorID();
                    doctorFrame doctorFrame = new doctorFrame(pDirectory,dDirectory,eHistory,hDirectory,pid);
                    doctorFrame.setVisible(true);
                    isin=true;
                }

            }
            if (!isin){
                JOptionPane.showMessageDialog(this, "No Such Doctor In System");
                txtUser.setText("");
                pwPassword.setText("");
            }

            //this.setVisible(false);
        }*/

    }//GEN-LAST:event_loginBtnActionPerformed

    private void clrBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtn1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_clrBtn1ActionPerformed

    private void idBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idBoxActionPerformed

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnActionPerformed
        txtUser.setText("");
        pwPassword.setText("");
    }//GEN-LAST:event_clrBtnActionPerformed

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_regBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clrBtn;
    private javax.swing.JButton clrBtn1;
    private javax.swing.JComboBox<String> idBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField pwPassword;
    private javax.swing.JButton regBtn;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
