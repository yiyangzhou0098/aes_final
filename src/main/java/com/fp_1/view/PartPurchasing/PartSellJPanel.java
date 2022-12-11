/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.fp_1.view.PartPurchasing;

import com.fp_1.dao.PartPurchasing.PartPurchasingDao;
import com.fp_1.dao.PartPurchasing.PartSellDao;
import com.fp_1.dao.PartSelling.PartSellingDao;
import com.fp_1.model.PartPurchasing.PartPurchase;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yiyangzhou
 */
public class PartSellJPanel extends javax.swing.JPanel {

    private PartSellDao partsellingDao;
    private SimpleDateFormat formatter;
    private String oldValue = "";

    /**
     * Creates new form PartPurchaseJPanel
     */
    public PartSellJPanel() {
        initComponents();
        editTableListen();
        populateTable();
    }

    private void editTableListen() {
        partsellingDao = new PartSellDao();
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        model.addTableModelListener(new TableModelListener() {

            public void tableChanged(TableModelEvent e) {
                if (e.getColumn() < 0) {
                    return;
                }
                String nVal = table.getValueAt(e.getLastRow(), e.getColumn())
                        .toString();

                if (nVal.equals(oldValue)) {
                    return;
                }

                if (e.getColumn() == 0) {

                    table.setValueAt(oldValue, e.getLastRow(), e.getColumn());
                    return;
                }
                // 更新数据
                int result = JOptionPane.showConfirmDialog(null, "Sure to edit?");

                if (result == JOptionPane.OK_OPTION) {
                    PartPurchase partPurchase = new PartPurchase();
                    partPurchase.setID(Integer.valueOf(table.getValueAt(e.getLastRow(),
                            0).toString()));
                    partPurchase.setPartName(table.getValueAt(e.getLastRow(), 1).toString());
                    partPurchase.setWarehouseID(Integer.valueOf(table.getValueAt(e.getLastRow(), 3).toString()));
                    partPurchase.setStatus(Short.valueOf(table.getValueAt(e.getLastRow(), 2).toString()));
                    partPurchase.setNumber(Integer.valueOf(table.getValueAt(e.getLastRow(),
                            4).toString()));
                    partPurchase.setPerPrice(Float.valueOf(table.getValueAt(e.getLastRow(),
                            5).toString()));
                    partPurchase.setForCar(table.getValueAt(e.getLastRow(), 6).toString());
                    
                    SimpleDateFormat formatter = new SimpleDateFormat( "yyyy-MM-dd");
                    String str = table.getValueAt(e.getLastRow(),7).toString();
                    try{
                        Date date1 = formatter.parse(str);
                        partPurchase.setCreateTime(date1);
                    }catch (java.text.ParseException e1) {
                            // TODO Auto-generated catch block
                            e1.printStackTrace();
                        }
                    
                    
                    partsellingDao.update(partPurchase);
                    populateTable();
                }
                
            }
        });
    }
    
    private void populateTable() {
        partsellingDao = new PartSellDao();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().clear();

        List<PartPurchase> listPartPurchase = partsellingDao.QueryAll();

        for (PartPurchase partPurchase : listPartPurchase) {
            // 添加 行数据

//          cob.setSelectedItem(new Dept(user.getDeptid()));
            model.addRow(new Object[]{
                partPurchase.getID(),
                partPurchase.getPartName(),
                //              cob.getSelectedItem(),
                partPurchase.getStatus(),
                partPurchase.getWarehouseID(),
                partPurchase.getNumber(),
                partPurchase.getPerPrice(),
                partPurchase.getForCar(),
                partPurchase.getCreateTime()

            });
        }

    }

    private void populateTableByType(String type, Object value) {
        partsellingDao = new PartSellDao();
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.getDataVector().clear();

        List<PartPurchase> listPartPurchase = null;
        switch (type) {
            case "ID":
                listPartPurchase = partsellingDao.QueryById((String) value);
                break;
            case "PartName":
                listPartPurchase = partsellingDao.QueryByName((String) value);
                break;
            case "CarType":
                listPartPurchase = partsellingDao.QueryByCar((String) value);
                break;
            default:
                JOptionPane.showMessageDialog(this, "Search type must be specific");

                return;
        }

        for (PartPurchase partPurchase : listPartPurchase) {
            // 添加 行数据

//          cob.setSelectedItem(new Dept(user.getDeptid()));
            model.addRow(new Object[]{
                partPurchase.getID(),
                partPurchase.getPartName(),
                //              cob.getSelectedItem(),
                partPurchase.getStatus(),
                partPurchase.getWarehouseID(),
                partPurchase.getNumber(),
                partPurchase.getPerPrice(),
                partPurchase.getForCar(),
                partPurchase.getCreateTime()

            });
        }

    }

    private void setAllInputBlank() {
        partnameField.setText("");
        idField.setText("");
        forcarField.setText("");
        statusBox.setSelectedIndex(0);
        numberField.setText("");
        warehouseField.setText("");
        perpriceField.setText("");
        //createtimeDate.cleanup();
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
        table = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchBox = new javax.swing.JComboBox<>();
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
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(44, 62, 80));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(800, 570));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
                java.lang.Integer.class, java.lang.String.class, java.lang.Short.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search By ");

        searchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "PartName", "CarType", " " }));
        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ID");

        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Part Name");

        partnameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partnameFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Status");

        statusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Available", "Unavailable", "Awaiting" }));

        jLabel5.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Warehouse ID");

        warehouseField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                warehouseFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Number");

        numberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberFieldActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Per Price");

        perpriceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perpriceFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("For Car");

        forcarField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forcarFieldActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Create Time");

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

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
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(SearchFiled, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn))
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
                                    .addGap(6, 6, Short.MAX_VALUE)
                                    .addComponent(forcarField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(29, 29, 29))))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchFiled, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(partnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

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
        if (partname.equals("")) {
            JOptionPane.showMessageDialog(this, "Part name can not be null");
            return;
        }

        int id = 0;
        try {
            id = Integer.valueOf(idField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "ID invalid");
            return;
        }
        if (id == 0) {
            JOptionPane.showMessageDialog(this, "ID invalid");
            return;
        }

        //Date createtime = createtimeDate.getDate();
        // todo 判断是否空
        /*if (createtime.equals("")) {
            JOptionPane.showMessageDialog(this, "Create time can not be empty");
            return;
        }*/

        short status = -1;
        String s_status = (String) statusBox.getSelectedItem();
        switch (s_status) {
            case " ":
                JOptionPane.showMessageDialog(this, "Status can not be empty");
                return;
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
        try {
            warehouseid = Integer.valueOf(warehouseField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Warehouse ID invalid");
            return;
        }
        if (warehouseid == 0) {
            JOptionPane.showMessageDialog(this, "Warehouse id invalid");
            return;
        }

        int number = 0;
        try {
            number = Integer.valueOf(numberField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Warehouse ID invalid");
            return;
        }

        float perprice = (float) 0.000;
        try {
            perprice = Float.valueOf(perpriceField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Per price invalid");
            return;
        }
        if (perprice == 0.000) {
            JOptionPane.showMessageDialog(this, "Per price can not be empty");
            return;
        }

        String forcar = forcarField.getText();
        if (forcar.equals("")) {
            JOptionPane.showMessageDialog(this, "Car type can not be null");
            return;
        }

        PartPurchase partPurchase = new PartPurchase();
        partPurchase.setID(id);
        partPurchase.setPartName(partname);
        //partPurchase.setCreateTime(createtime);
        partPurchase.setStatus(status);
        partPurchase.setWarehouseID(warehouseid);
        partPurchase.setNumber(number);
        partPurchase.setPerPrice(perprice);
        partPurchase.setForCar(forcar);

        partsellingDao = new PartSellDao();
        if (partsellingDao.add(partPurchase)) {
            System.out.println(partPurchase.getID());
            JOptionPane.showMessageDialog(null, "Add successfully");
            populateTable();
            setAllInputBlank();

        } else {
            JOptionPane.showMessageDialog(null, "Add failed");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        populateTable();        // TODO add your handling code here:
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        String search_txt = SearchFiled.getText();
        String search_type = (String) searchBox.getSelectedItem();
        if (!search_txt.equals("Type here ...")) {
            switch (search_type) {
                case "ID":
                    populateTableByType("ID",search_txt);
                    break;
                case "PartName":
                    populateTableByType("PartName",search_txt);
                    break;
                case "CarType":
                    populateTableByType("CarType",search_txt);
                    break;
                default:
                    return;
            }
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        if (table.getSelectedRowCount() <= 0) {
            JOptionPane.showMessageDialog(null, "Select at least one row");
            return;
        }
        int result = JOptionPane.showConfirmDialog(null, "Sure to delete?");
        // 判断用户是否点击

        if (result == JOptionPane.OK_OPTION) {
            int id = Integer.valueOf(table.getValueAt(
                    table.getSelectedRow(), 0).toString());
            partsellingDao = new PartSellDao();
            partsellingDao.delete(id);
            populateTable();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SearchFiled;
    private javax.swing.JButton addButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField forcarField;
    private javax.swing.JTextField idField;
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
    private javax.swing.JTextField numberField;
    private javax.swing.JTextField partnameField;
    private javax.swing.JTextField perpriceField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JComboBox<String> searchBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox<String> statusBox;
    private javax.swing.JTable table;
    private javax.swing.JTextField warehouseField;
    // End of variables declaration//GEN-END:variables
}
