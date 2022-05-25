package Inventory;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.JOptionPane;
import javaapplication12.*;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author student.admin
 */
public class CashierUI extends javax.swing.JFrame {

    Connect c = new Connect();
    boolean flag = false;
    JButton button = new JButton();

    /**
     * Creates new form NewJFrame
     */
    public CashierUI() {
        initComponents();
        this.setLocationRelativeTo(null);
        updateTable();
        button();
//        target.setText(new LoginUI().cashier());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        totall = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        target = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        salesTotal = new javax.swing.JTextField();
        discount = new javax.swing.JTextField();
        due = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel2.setText("jLabel2");

        jButton3.setText("SEARCH PRODUCT");

        jButton9.setText("CHANGE PASSWORD");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));

        jTextField2.setBackground(new java.awt.Color(0, 0, 51));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("CASHIER");
        jTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextField2.setHighlighter(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        totall.setBackground(new java.awt.Color(0, 0, 51));
        totall.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        totall.setForeground(new java.awt.Color(255, 255, 255));
        totall.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        totall.setText("0");
        totall.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        totall.setHighlighter(null);
        totall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totallActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(0, 0, 51));
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("|");
        jTextField4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        target.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        target.setForeground(new java.awt.Color(255, 255, 255));
        target.setText("jLabel7");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(target)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totall, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(target))
                .addGap(0, 21, Short.MAX_VALUE))
        );

        dt.setBackground(new java.awt.Color(240, 240, 240));
        dt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        dt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        dt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtActionPerformed(evt);
            }
        });

        jTable2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DESCRIPTION", "PRICE", "QUANTITY", "DISCOUNT", "TOTAL"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(1).setMaxWidth(800);
            jTable2.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(2).setMaxWidth(800);
            jTable2.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(3).setMaxWidth(800);
            jTable2.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable2.getColumnModel().getColumn(4).setMaxWidth(800);
        }

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("NEW TRANSACTION");
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("ADD DISCOUNT");
        jButton4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("SETTLE PAYMENT");
        jButton5.setBorderPainted(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.setText("LOGOUT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("SALES TOTAL");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("DISCOUNT");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("TOTAL DUE");

        salesTotal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        salesTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesTotalActionPerformed(evt);
            }
        });

        discount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        due.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(562, 562, 562)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(due, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(salesTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(359, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(1, 1, 1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(discount, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addGap(2, 2, 2))
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(due, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("BILLING", jPanel3);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Inventory ID", "Product", "Description", "Buying Price", "Selling Price", "Quantity", "Unit of Measure", "Expiration Date", "Threshold", ""
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1257, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("SEARCH PRODUCT", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    public void updateTable() {
        try {

            Statement stmt = c.connect().createStatement();
            ResultSet rs = stmt.executeQuery("select * from inventory where status='enabled'");
            DefaultTableModel tm = (DefaultTableModel) jTable1.getModel();
            tm.setRowCount(0);

            while (rs.next()) {
                Object o[] = {rs.getInt(1), rs.getString(2), rs.getString(3), rs.getFloat(4), rs.getFloat(5), rs.getFloat(6), rs.getString(7), rs.getString(8), rs.getInt(9)};
                tm.addRow(o);
//                d = rs.getString(8);

            }
            c.connect().close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    private void totallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totallActionPerformed
    private static long idCounter = 0;

    public static synchronized String createID() {
        return String.valueOf(idCounter++);
    }

    public static void totalDue() {
        double dues = Double.parseDouble(salesTotal.getText()) - Double.parseDouble(discount.getText());
        due.setText(String.valueOf(dues));

    }

    public static String target() {
        String s = target.getText();
        return s;
    }

    public static void setCashierName(String s) {
        target.setText(s);
    }
    private void dtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtActionPerformed

    private void salesTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salesTotalActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        //        this.setVisible(false);
        //        new LoginUI().setVisible(true);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (flag == false) {
            JOptionPane.showConfirmDialog(null,
                    "No Product", "", JOptionPane.DEFAULT_OPTION);
        } else {

            String amount = JOptionPane.showInputDialog(null, "Amount");

            ArrayList item = new ArrayList();
            for (int i = 0; i < jTable2.getModel().getRowCount(); i++) {
                item.add(jTable2.getModel().getValueAt(i, 1));
            }

            item.add("-----------------------------------------------------------------------------");
            item.add("Total Item");
            item.add("Discount");
            item.add("-----------------------------------------------------------------------------");
            item.add("Total Due");
            item.add("Cash");
            item.add("Change");

            ArrayList qty = new ArrayList();
            for (int i = 0; i < jTable2.getModel().getRowCount(); i++) {
                qty.add(jTable2.getModel().getValueAt(i, 3));
            }

            qty.add("-------------------------");
            qty.add("");
            qty.add("");
            qty.add("-------------------------");
            qty.add("");
            qty.add("");
            qty.add("");

            ArrayList price = new ArrayList();
            for (int i = 0; i < jTable2.getModel().getRowCount(); i++) {
                price.add(jTable2.getModel().getValueAt(i, 2));
            }

            price.add("--------------");
            price.add(salesTotal.getText());
            price.add(discount.getText());
            price.add("--------------");
            price.add(due.getText());
            price.add(amount);
            double change = Double.parseDouble(amount) - Double.parseDouble(due.getText());
            price.add(String.valueOf(change));

            String itemString = String.join("\r\n", item);
            String qtyString = String.join("\r\n", qty);
            String priceString = String.join("\r\n", price);

            //        Receipt r = new Receipt();
            //        r.addItem(itemString);
            //        r.addQty(qtyString);
            //        r.addPrice(priceString);
            //
            //        r.setVisible(true);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (jTable2.getSelectedRowCount() > 0) {

            int column = 3;
            int row = jTable2.getSelectedRow();
            String to = jTable2.getModel().getValueAt(row, 4).toString();
            String qty = JOptionPane.showInputDialog(null, "DISCOUNT(%)");
            double percent = Double.parseDouble(qty) / 100;
            double sales = Double.parseDouble(salesTotal.getText());
            double dis = Double.parseDouble(to) * percent;
            //double discounted = sales-dis;
            discount.setText(String.format("%.2f", dis));
            //        String tran = transaction.getText();
//            try {
//
//                String des = jTable2.getModel().getValueAt(row, 1).toString();
//
//                PreparedStatement ps = c.connect().prepareStatement("update dailysales set discount=? where description =? and transaction_number=?");
//                ps.setDouble(1, Double.parseDouble(String.format("%.2f", dis)));
//                ps.setString(2, des);
//                            ps.setString(3, tran);
//                ps.executeUpdate();
//
//                c.connect().close();
//            } catch (SQLException ex) {
//                Logger.getLogger(CashierUI.class.getName()).log(Level.SEVERE, null, ex);
//            }

//            try {
//                Statement stmt = c.connect().createStatement();
//                ResultSet rs = stmt.executeQuery("select Sum(discount) as sumdiscount from dailySales where transaction_number =");
//
//                while (rs.next()) {
//                    String sum = rs.getString("sumdiscount");
//                    discount.setText(sum);
//                    double discounted = sales - Double.parseDouble(sum);
//                    due.setText(String.valueOf(discounted));
//                }
//                c.connect().close();
//            } catch (SQLException ex) {
//                Logger.getLogger(CashierUI.class.getName()).log(Level.SEVERE, null, ex);
//            }

            //due.setText(String.valueOf(discounted));
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setValueAt(String.format("%.2f", dis), row, column);
        } else {
            JOptionPane.showConfirmDialog(null,
                    "Select product", "", JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    public void button() {
        jTable1.getColumn("").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("").setCellEditor(new ButtonEditor(new JCheckBox()));

        button.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String qty = JOptionPane.showInputDialog(null, "QUANTITY");

                int row = jTable1.getSelectedRow();
//                String pcode = jTable1.getModel().getValueAt(row, 1).toString();
                String product = jTable1.getModel().getValueAt(row, 1).toString();
                String price = jTable1.getModel().getValueAt(row, 4).toString();
                float total = (Float.parseFloat(price)) * (Float.parseFloat(qty));
                String stock = jTable1.getModel().getValueAt(row, 5).toString();

                if (Float.parseFloat(stock) < Integer.parseInt(qty) || Integer.parseInt(qty) <= 0) {
                    JOptionPane.showConfirmDialog(null,
                            "Input another quantity", "Not enough stock", JOptionPane.DEFAULT_OPTION);
                } else {

                    AddRowToJtable(new Object[]{
                        product, price, qty, 0.0, total

                    });
                    discount.setText("0");
                    updateTable();
                    String a = totall.getText();
                    Float b = Float.parseFloat(a);
                    Float c = b + total;
                    totall.setText(String.valueOf(c));
                    salesTotal.setText(String.valueOf(c));
                    float d = Float.parseFloat(discount.getText());
                    float e = c - d;
                    due.setText(String.valueOf(e));
                }

            }
        }
        );

    }

    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value,
                boolean isSelected, boolean hasFocus, int row, int column) {
            setText("ADD");
            return this;
        }
    }

    class ButtonEditor extends DefaultCellEditor {

        private String label;

        public ButtonEditor(JCheckBox checkBox) {
            super(checkBox);
        }

        public Component getTableCellEditorComponent(JTable table, Object value,
                boolean isSelected, int row, int column) {
            label = (value == null) ? "ADD" : value.toString();
            button.setText(label);
            return button;
        }

        public Object getCellEditorValue() {
            return new String(label);
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //
        //        Date date = new Date();
        //        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        //        String strDate = formatter.format(date);
        //        formatter = new SimpleDateFormat("dd MMMM yyyy");
        //        strDate = formatter.format(date);
        //        dates.setText(strDate);
        //        LocalDate today = LocalDate.now();
        //        String d = today.toString();
        //
        //        createID();
        //
        //        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        //        model.setRowCount(0);
        //        total.setText("0.0");
        //        salesTotal.setText("");
        //        discount.setText("0.0");
        //
        //        try {
        //            Statement s = c.connect().createStatement();
        //            ResultSet rs = s.executeQuery("select * from dailysales");
        //            while (rs.next()) {
        //
        //                if (transaction.getText().equals(rs.getString(2))) {
        //                    idCounter++;
        //                    transaction.setText(d.replaceAll("-", "") + "000" + idCounter);
        //                } else {
        //                    transaction.setText(d.replaceAll("-", "") + "000" + idCounter);
        //
        //                }
        //            }
        //            c.connect().close();
        //        } catch (SQLException ex) {
        //            Logger.getLogger(CashierUI.class.getName()).log(Level.SEVERE, null, ex);
        //        }

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void AddRowToJtable(Object[] dataRow) {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.addRow(dataRow);
    }

    public static void addTotal(String t) {
        salesTotal.setText(t);
    }

    public static void total(String s) {
        totall.setText(s);
    }

//    public static String getNo() {
//        String s = transaction.getText();
//        return s;
//
//    }
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
            java.util.logging.Logger.getLogger(CashierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CashierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CashierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CashierUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField discount;
    private static javax.swing.JTextField dt;
    private static javax.swing.JTextField due;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private static javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField salesTotal;
    private static javax.swing.JLabel target;
    private static javax.swing.JTextField totall;
    // End of variables declaration//GEN-END:variables
}
