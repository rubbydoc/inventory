/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inventory;

/**
 *
 * @author student.admin
 */
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;

class Button extends JFrame {

    JTable jTable1;
    Connect c = new Connect();
    String d;

    int i = 0;
    private JPanel topPanel;

    private JScrollPane scrollPane;

    JButton button = new JButton();

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

    public Button() {
        setTitle("Search Product");
        setSize(1330, 730);
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        getContentPane().add(topPanel);

        jTable1 = new javax.swing.JTable();
        jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Inventory ID", "Product", "Description", "Buying Price", "Selling Price", "Quantity", "Unit of Measure", "Expiration Date", "Threshold", ""
                }
        ));

        updateTable();

        jTable1.getColumn("").setCellRenderer(new ButtonRenderer());
        jTable1.getColumn("").setCellEditor(new ButtonEditor(new JCheckBox()));

        scrollPane = new JScrollPane(jTable1);
        topPanel.add(scrollPane, BorderLayout.CENTER);

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
                   

                    CashierUI.AddRowToJtable(new Object[]{
                         product, price, qty, 0.0, total

                    });

//                    try {
//
//                    String no = CashierUI.getNo();
//                        PreparedStatement ps = c.connect().prepareStatement("INSERT INTO dailySales( description, price, quantity,total, date, transaction_number, cashier) VALUES (?,?,?,?,?,?,?)");
//                        ps.setString(1, product);
//                        ps.setDouble(2, Double.parseDouble(price));
//                        ps.setInt(3, Integer.parseInt(qty));
//                        ps.setDouble(4, total);
//                        ps.setDate(5, java.sql.Date.valueOf(java.time.LocalDate.now()));
//                    ps.setString(6, no);
//                        ps.setString(7, CashierUI.target());
//                        ps.executeUpdate();
//                        Statement stmt = c.connect().createStatement();
//                        ResultSet rs = stmt.executeQuery("select Sum(total) as sumtotal from dailySales where transaction_number =");
//
//                        while (rs.next()) {
//                            String sum = rs.getString("sumtotal");
//                            CashierUI.addTotal(String.valueOf(sum));
//                            CashierUI.total(String.valueOf(sum));
//                            CashierUI.totalDue();
//
//                        }
//                        c.connect().close();
//                    } catch (SQLException e) {
//                        System.out.println(e);
//                    }

//                    try {
//                        PreparedStatement ps = c.connect().prepareStatement("update product set stock=? where product_code=?");
//                        ps.setInt(1, Integer.parseInt(stock) - Integer.parseInt(qty));
//                        ps.setString(2, pcode);
//
//                        ps.executeUpdate();
//                        c.connect().close();
//                    } catch (SQLException ex) {
//                        Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
//                    }

                    updateTable();
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

}
