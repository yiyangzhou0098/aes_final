/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.fp_1.view.PartPurchasing;

import com.fp_1.dao.PartPurchasing.PartPurchasingDao;
import com.fp_1.model.PartPurchasing.PartPurchase;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author yiyangzhou
 */
public class PartPurchaseJPanel extends javax.swing.JPanel {

    private PartPurchasingDao partPurchasingDao;
    /**
     * Creates new form PartPurchaseJPanel
     */
    public PartPurchaseJPanel() {
        initComponents();
    }

    private void populatePage(){
        // todo
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        SearchFiled = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        partnameField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        statusBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        warehouseField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        numberField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        perpriceField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        forcarField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        createtimeDate = new com.toedter.calendar.JDateChooser();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 570));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "PartName", "Status", "WarehouseID", "Number", "PerPrice", "ForCar", "CreateTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        refreshButton.setText("Refresh");

        jLabel1.setText("Search By ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "PartName", "CarType", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        SearchFiled.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        SearchFiled.setText("Type here ...");
        SearchFiled.setToolTipText("");
        SearchFiled.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchFiledActionPerformed(evt);
            }
        });

        jLabel2.setText("ID");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("Part Name");

        partnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partnameFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Status");

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Unavailable", "Awaiting" }));

        jLabel5.setText("Warehouse ID");

        warehouseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Number");

        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Per Price");

        perpriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perpriceFieldActionPerformed(evt);
            }
        });

        jLabel8.setText("For Car");

        forcarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forcarFieldActionPerformed(evt);
            }
        });

        jLabel9.setText("Create Time");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(SearchFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel4)
                                            .addGap(31, 31, 31))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addContainerGap()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(idField)
                                        .addComponent(partnameField, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                                        .addComponent(statusBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(42, 42, 42)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(perpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(warehouseField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(354, 354, 354)
                                    .addComponent(refreshButton)))
                            .addGap(48, 48, 48)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addComponent(addButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(deleteButton))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(forcarField, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addComponent(createtimeDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(29, 29, 29))))))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(createtimeDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(refreshButton)
                            .addComponent(addButton)
                            .addComponent(deleteButton))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(warehouseField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(forcarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addComponent(jLabel6))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(partnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(statusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(perpriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idFieldActionPerformed

    private void partnameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partnameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partnameFieldActionPerformed

    private void warehouseFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_warehouseFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_warehouseFieldActionPerformed

    private void numberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberFieldActionPerformed

    private void perpriceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perpriceFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perpriceFieldActionPerformed

    private void forcarFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forcarFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forcarFieldActionPerformed

    private void SearchFiledActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchFiledActionPerformed
    }//GEN-LAST:event_SearchFiledActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String partname = partnameField.getText();
        if(partname.equals("")){
            JOptionPane.showMessageDialog(this, "Part name can not be null");
            return;
        }
        
        int id = 0;
        try{
            id = Integer.valueOf(idField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "ID invalid");
            return;
        }
        if(id == 0){
            JOptionPane.showMessageDialog(this, "ID invalid");
            return;
        }
        
        Date createtime = createtimeDate.getDate();
        // todo 判断是否空
        
        short status = -1;
        String s_status = (String) statusBox.getSelectedItem();
        switch (s_status) {
            case "Available":
                status = 1;
                break;
            case "Unvailable":
                status = 0;
                break;
            case "Awaiting":
                status = 2;
                break;
            default:
                break;
        }
        
        int warehouseid = 0;
        try{
            warehouseid = Integer.valueOf(warehouseField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Warehouse ID invalid");
            return;
        }
        if(warehouseid == 0){
            JOptionPane.showMessageDialog(this, "Warehouse id invalid");
            return;
        }
        
        int number = 0;
        try{
            number = Integer.valueOf(numberField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Warehouse ID invalid");
            return;
        }
        
        float perprice = (float) 0.000;
        try{
            perprice = Float.valueOf(perpriceField.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Per price invalid");
            return;
        }
        if(perprice == 0.000){
            JOptionPane.showMessageDialog(this, "Warehouse id invalid");
            return;
        }
   
        
        String forcar = forcarField.getText();
        if(forcar.equals("")){
            JOptionPane.showMessageDialog(this, "Car type can not be null");
            return;
        }     
        
        PartPurchase partPurchase = new PartPurchase();
        partPurchase.setID(id);
        partPurchase.setPartName(partname);
        partPurchase.setCreateTime(createtime);
        partPurchase.setStatus(status);
        partPurchase.setWarehouseID(warehouseid);
        partPurchase.setNumber(number);
        partPurchase.setPerPrice(perprice);
        partPurchase.setForCar(forcar);
         
        partPurchasingDao = new PartPurchasingDao();
        if(partPurchasingDao.add(partPurchase)){
            System.out.println(partPurchase.getID());
            JOptionPane.showMessageDialog(null, "Add successfully");
            populatePage();
        
        }else{
          JOptionPane.showMessageDialog(null, "Add failed");
        }
    }//GEN-LAST:event_addButtonActionPerformed
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchFiled;
    private javax.swing.JButton addButton;
    private com.toedter.calendar.JDateChooser createtimeDate;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField forcarField;
    private javax.swing.JTextField idField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField numberField;
    private javax.swing.JTextField partnameField;
    private javax.swing.JTextField perpriceField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JTextField warehouseField;
    // End of variables declaration//GEN-END:variables
}
