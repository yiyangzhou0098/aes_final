/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.fp_1.view.PartProducingFrame;

import com.fp_1.model.MaterialPurchasing.StorageMaterial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kai
 */
public class PartProducingPanel extends javax.swing.JPanel {

    /**
     * Creates new form PartProducingPanel
     */
    private static final String username="root";
    private static final String password="mysql0226";
    private static final String dataConn="jdbc:mysql://localhost:3306/connector";
    private JFrame thisframe;
    
    ArrayList<StorageMaterial> SMList= new ArrayList();
    
    Connection sqlConn=null;
    PreparedStatement pstSM=null;
    PreparedStatement pstMP=null;
    PreparedStatement pstPP=null;
    PreparedStatement pstdel=null;
    
    ResultSet rsSM=null;
    ResultSet rsMP=null;
    ResultSet rsPP=null;
    ResultSet rsdel=null;
    
    int i,thisNum,delNum;
    boolean isAed;
    
    public PartProducingPanel() {
        initComponents();
    }

    public void updateDBforSM() throws ClassNotFoundException, SQLException{

        ArrayList<String> Mname=new ArrayList();
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn=DriverManager.getConnection(dataConn,username,password);
        //Statement stmt = sqlConn.createStatement();
        //stmt.executeUpdate("TRUNCATE StorageMaterial");
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataConn,username,password);
            
            pstSM=sqlConn.prepareStatement("select * from StorageMaterial");
            
            
            
            rsSM=pstSM.executeQuery();

            
            ResultSetMetaData stData=rsSM.getMetaData();
            
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel)jTable2.getModel();
            RecordTable.setRowCount(0);
            
            while(rsSM.next())
            {
                Vector columnData=new Vector();
                mBox1.addItem(rsSM.getString("MaterialName"));
                mBox2.addItem(rsSM.getString("MaterialName"));
                mBox3.addItem(rsSM.getString("MaterialName"));
                
                for (i=1;i<=q;i++)
                {
                    String cname,cweight,cUP;
                    cname=rsSM.getString("MaterialName");
                    cweight=rsSM.getString("Weight");
                    cUP=rsSM.getString("UnitPrice");
                    
                    columnData.add(cname);
                    columnData.add(cweight);
                    columnData.add(cUP);
                    
                    
                    
                    //columnData.add(rs.getString("IsArrived"));
                }
                RecordTable.addRow(columnData);
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
            
        }
    
    public void updateDBforPP() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn=DriverManager.getConnection(dataConn,username,password);
        //Statement stmt = sqlConn.createStatement();
        //stmt.executeUpdate("TRUNCATE StorageMaterial");
        
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataConn,username,password);
            
            pstPP=sqlConn.prepareStatement("select * from CarParts");
            
            
            
            rsPP=pstPP.executeQuery();

            
            ResultSetMetaData stData=rsPP.getMetaData();
            
            int q=stData.getColumnCount();
            DefaultTableModel RecordTable= (DefaultTableModel)jTable1.getModel();
            RecordTable.setRowCount(0);
            
            while(rsPP.next())
            {
                Vector columnData=new Vector();
                for (i=1;i<=q;i++)
                {
                    
                    
                    columnData.add(rsPP.getString("PartName"));
                    columnData.add(rsPP.getString("Location"));
                    columnData.add(rsPP.getString("Weight"));
                    columnData.add(rsPP.getString("Material1"));
                    columnData.add(rsPP.getString("Material2"));
                    columnData.add(rsPP.getString("Material3"));
                    columnData.add(rsPP.getString("Mweight1"));
                    columnData.add(rsPP.getString("Mweight2"));
                    columnData.add(rsPP.getString("Mweight3"));
                    columnData.add(rsPP.getString("PartCost"));
                    //columnData.add(rs.getString("IsArrived"));
                }
                RecordTable.addRow(columnData);
                
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCost = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mBox1 = new javax.swing.JComboBox<>();
        mBox2 = new javax.swing.JComboBox<>();
        mBox3 = new javax.swing.JComboBox<>();
        delBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        newBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        StorageUpBtn = new javax.swing.JButton();
        txtWeight1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtWeight2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtWeight3 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtLoc = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        exitBtn = new javax.swing.JButton();

        txtCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel1.setText("Location");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel12.setText("Material2");

        jLabel13.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel13.setText("Material3");

        mBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select material" }));

        mBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select material" }));

        mBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select material" }));

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel8.setText("Material Storage Catalog");

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel9.setText("Edit CarPart Producing Info");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PartName", "Location", "Weight", "Material1", "Material2", "Material3", "PartCost"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        newBtn.setText("New Order");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Weight", "UnitPrice"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        StorageUpBtn.setText("Update Storage");
        StorageUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StorageUpBtnActionPerformed(evt);
            }
        });

        txtWeight1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeight1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel10.setText("CarPart Producing Catalog");

        txtWeight2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeight2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel2.setText("Part Name");

        txtWeight3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeight3ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel11.setText("Material1");

        jLabel14.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel14.setText("Mweight1");

        txtLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel15.setText("Mweight2");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel3.setText("Weight");

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel16.setText("Mweight3");

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jLabel4.setText("Part Cost");

        exitBtn.setText("Exit");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel11)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel13))
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(mBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 164, Short.MAX_VALUE)
                                                    .addComponent(mBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(mBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtLoc, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtWeight3))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel15)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtWeight2))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel14)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(txtWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(jLabel9))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(StorageUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(125, 125, 125))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtLoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(mBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(mBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(mBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtWeight1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel14))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtWeight2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtWeight3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StorageUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        DefaultTableModel jModel=(DefaultTableModel)jTable1.getModel();
        int slctRow=jTable1.getSelectedRow();

        try
        {
            String slctname= jModel.getValueAt(slctRow, 0).toString();
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataConn,username,password);
            pstPP=sqlConn.prepareStatement("delete from CarParts where PartName=?");

            pstPP.setString(1, slctname);
            pstPP.executeUpdate();// Use set to set the '?' as parameters in the declaration

            txtName.setText("");
            txtLoc.setText("");
            txtCost.setText("");
            txtWeight.setText("");
            txtWeight1.setText("");
            txtWeight2.setText("");
            txtWeight3.setText("");

            JOptionPane.showMessageDialog(this, "Current Part Producing Deleted");
            updateDBforPP();
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PartProducingPanel.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this, "ClassEx");
        }
        catch(SQLException ex)
        {
            java.util.logging.Logger.getLogger(PartProducingPanel.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this, "SQLEx");
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel jModel=(DefaultTableModel)jTable1.getModel();
        int slctRow=jTable1.getSelectedRow();
        txtName.setText(jModel.getValueAt(slctRow, 1).toString());
        txtLoc.setText(jModel.getValueAt(slctRow, 2).toString());
        txtWeight.setText(jModel.getValueAt(slctRow, 3).toString());

        //txtWeight1.setText(jModel.getValueAt(slctRow, 4).toString());
        //txtWeight2.setText(jModel.getValueAt(slctRow, 5).toString());
        //txtWeight.setText(jModel.getValueAt(slctRow, 6).toString());

        txtCost.setText(jModel.getValueAt(slctRow, 7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataConn,username,password);
            pstPP=sqlConn.prepareStatement("INSERT INTO CarParts(PartName,Location,Weight,Material1,Material2,Material3,"
                + "Mweight1,Mweight2,Mweight3,Partcost) VALUES (?,?,?,?,?,?,?,?,?,?)");

            pstPP.setString(1,txtName.getText());
            pstPP.setString(2,txtLoc.getText());
            pstPP.setString(3,txtWeight.getText());

            pstPP.setString(4, (String) mBox1.getSelectedItem());
            pstPP.setString(5, (String) mBox2.getSelectedItem());
            pstPP.setString(6, (String) mBox3.getSelectedItem());

            pstPP.setString(7,txtWeight1.getText());

            if(txtWeight2.getText().equals(""))
            {
                pstPP.setString(8,"0");
            }
            else
            {
                pstPP.setString(8,txtWeight2.getText());
            }

            if(txtWeight3.getText().equals(""))
            {
                pstPP.setString(9,"0");
            }
            else
            {
                pstPP.setString(9,txtWeight3.getText());
            }

            pstPP.setString(10, txtCost.getText());

            pstPP.executeUpdate();

            txtName.setText("");
            txtLoc.setText("");
            txtCost.setText("");
            txtWeight.setText("");
            txtWeight1.setText("");
            txtWeight2.setText("");
            txtWeight3.setText("");

            JOptionPane.showMessageDialog(this, "New Part Producing Added");
            updateDBforPP();
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PartProducingPanel.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this, "ClassEx");
        }
        catch(SQLException ex)
        {
            java.util.logging.Logger.getLogger(PartProducingPanel.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this, "SQLEx");
        }

    }//GEN-LAST:event_newBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        DefaultTableModel jModel=(DefaultTableModel)jTable1.getModel();
        int slctRow=jTable1.getSelectedRow();

        try
        {

            thisNum=Integer.parseInt(jModel.getValueAt(slctRow, 0).toString());
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataConn,username,password);

            pstPP=sqlConn.prepareStatement("update CarParts set PartName =?,Location =?,Weight =?,Material1 =?,Material2 =?,"
                + "Material3 =?,mWeight1 =?,mWeight2 =? mWeight3=? where PartName =?");

            pstPP.setString(1,txtName.getText());
            pstPP.setString(2,txtLoc.getText());
            pstPP.setString(3,txtWeight.getText());

            pstPP.setString(4, (String) mBox1.getSelectedItem());
            pstPP.setString(5, (String) mBox2.getSelectedItem());
            pstPP.setString(6, (String) mBox3.getSelectedItem());

            pstPP.setString(7,txtWeight1.getText());

            if(txtWeight2.getText().equals(""))
            {
                pstPP.setString(8,"0");
            }
            else
            {
                pstPP.setString(8,txtWeight2.getText());
            }

            if(txtWeight3.getText().equals(""))
            {
                pstPP.setString(9,"0");
            }
            else
            {
                pstPP.setString(9,txtWeight3.getText());
            }

            pstPP.setString(10, txtCost.getText());
            pstPP.executeUpdate();// Use set to set the '?' as parameters in the declaration

            txtName.setText("");
            txtLoc.setText("");
            txtCost.setText("");
            txtWeight.setText("");
            txtWeight1.setText("");
            txtWeight2.setText("");
            txtWeight3.setText("");

            JOptionPane.showMessageDialog(this, "Current Part Producing Updated");
            updateDBforPP();
        }
        catch(ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(PartProducingPanel.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this, "ClassEx");
        }
        catch(SQLException ex)
        {
            java.util.logging.Logger.getLogger(PartProducingPanel.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(this, "SQLEx");
        }

    }//GEN-LAST:event_updateBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed

        txtName.setText("");
        txtLoc.setText("");
        txtCost.setText("");
        txtWeight.setText("");
        txtWeight1.setText("");
        txtWeight2.setText("");
        txtWeight3.setText("");
    }//GEN-LAST:event_resetBtnActionPerformed

    private void StorageUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StorageUpBtnActionPerformed

        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn=DriverManager.getConnection(dataConn,username,password);
            pstMP=sqlConn.prepareStatement("select * from connector");

            rsMP=pstMP.executeQuery();
            ResultSetMetaData stData=rsMP.getMetaData();

            int q=stData.getColumnCount();
            //JOptionPane.showMessageDialog(this, q);
            double cweight,cUP,cprice;

            while(rsMP.next())
            {
                //JOptionPane.showMessageDialog(this, "hi");
                //for(i=1;i<=q;i++)
                {

                    if(!SMList.isEmpty())//when the array not null than compare and insert
                    {
                        boolean isExist=false;

                        for(StorageMaterial sm:SMList)//compare with every sm in the list
                        {
                            //JOptionPane.showMessageDialog(this, sm.getMaterialName());
                            if (rsMP.getString("MaterialName").equals(sm.getMaterialName()))// if have previous storage history
                            {
                                isExist=true;
                                cweight=Double.parseDouble(rsMP.getString("Weight"));
                                cUP=Double.parseDouble(rsMP.getString("UnitPrice"));
                                cprice=cUP*cweight;

                                double sweight,sup,stotal;
                                sweight=sm.getWeight();
                                stotal=sm.getTotalPrice();

                                sm.setWeight(sweight+cweight);
                                sm.setTotalPrice(cprice+stotal);

                                //JOptionPane.showMessageDialog(this, i);

                            }
                        }
                        if(!isExist)
                        {
                            StorageMaterial temp = new StorageMaterial();

                            temp.setMaterialName(rsMP.getString("MaterialName"));
                            temp.setWeight(Double.parseDouble(rsMP.getString("Weight")));
                            temp.setUnitPrice(Double.parseDouble(rsMP.getString("UnitPrice")));
                            temp.setTotalPrice(temp.getWeight()*temp.getUnitPrice());

                            SMList.add(temp);
                        }

                    }

                    if(SMList.isEmpty())
                    {
                        StorageMaterial temp = new StorageMaterial();

                        temp.setMaterialName(rsMP.getString("MaterialName"));
                        temp.setWeight(Double.parseDouble(rsMP.getString("Weight")));
                        temp.setUnitPrice(Double.parseDouble(rsMP.getString("UnitPrice")));
                        temp.setTotalPrice(temp.getWeight()*temp.getUnitPrice());

                        SMList.add(temp);

                        //JOptionPane.showMessageDialog(this, temp.getMaterialName());
                        //JOptionPane.showMessageDialog(this, SMList.isEmpty());
                    }
                }
            }

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,ex);
        }

        for(StorageMaterial sm:SMList)
        {
            sm.setUnitPrice(sm.getTotalPrice()/sm.getWeight());

            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                sqlConn=DriverManager.getConnection(dataConn,username,password);
                pstSM=sqlConn.prepareStatement("INSERT INTO StorageMaterial(MaterialName, Weight, UnitPrice, TotalPrice) VALUES (?,?,?,?)");
                pstSM.setString(1, sm.getMaterialName());
                pstSM.setString(2, sm.getWeight().toString());
                pstSM.setString(3, sm.getUnitPrice().toString());
                pstSM.setString(4, sm.getTotalPrice().toString());

                pstSM.executeUpdate();
            }
            catch(ClassNotFoundException ex)
            {
                java.util.logging.Logger.getLogger(PartProducingFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                //JOptionPane.showMessageDialog(this, "ClassEx");
            }
            catch(SQLException ex)
            {
                java.util.logging.Logger.getLogger(PartProducingFrame.class.getName()).log(java.util.logging.Level.SEVERE,null,ex);
                //JOptionPane.showMessageDialog(this, "SQLEx");
            }
        }

        try {
            updateDBforSM();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PartProducingFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PartProducingFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_StorageUpBtnActionPerformed

    private void txtWeight1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeight1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeight1ActionPerformed

    private void txtWeight2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeight2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeight2ActionPerformed

    private void txtWeight3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeight3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeight3ActionPerformed

    private void txtLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        thisframe =new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(thisframe,"Confirm If You Want To Exit","MySQL Connector",JOptionPane.YES_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton StorageUpBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> mBox1;
    private javax.swing.JComboBox<String> mBox2;
    private javax.swing.JComboBox<String> mBox3;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField txtCost;
    private javax.swing.JTextField txtLoc;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtWeight1;
    private javax.swing.JTextField txtWeight2;
    private javax.swing.JTextField txtWeight3;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
