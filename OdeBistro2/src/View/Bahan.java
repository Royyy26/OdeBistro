package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sherl
 */
public class Bahan extends javax.swing.JPanel {

    private DefaultTableModel tableModel;
    private JTextField namaMenuField, hargaMenuField;

    public Bahan() {
        initComponents();

        tableModel = new DefaultTableModel(new Object[]{"Kode Menu", "Nama Menu", "Jumlah Menu"}, 0);
        TableStok = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(TableStok);
        cmbkode = new JComboBox<>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TableStok = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtjumlah = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbstocker = new javax.swing.JComboBox<>();
        btnsave = new javax.swing.JButton();
        cmbkode = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(800, 500));

        TableStok.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Kode", "Nama", "Jumlah"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableStok);
        if (TableStok.getColumnModel().getColumnCount() > 0) {
            TableStok.getColumnModel().getColumn(0).setResizable(false);
            TableStok.getColumnModel().getColumn(1).setResizable(false);
            TableStok.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Restock Input"));

        jLabel1.setText("Kode");

        txtjumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlahActionPerformed(evt);
            }
        });

        jLabel2.setText("Amount");

        jLabel3.setText("Stocker");

        cmbstocker.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jennifer Brenna Harris", "Johnny Jr Stewart" }));
        cmbstocker.setSelectedIndex(-1);

        btnsave.setBackground(new java.awt.Color(153, 204, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        cmbkode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MSna001", "MSna002", "MSna003", "MSna004", "MPas001", "MPas002", "MPas003", "MPas004", "MPas005", "MDri001", "MDri002", "MDri003", "MDri004", "MDri005", "MDes001", "MDes002", "MDes003", "MDes004", "MDes005" }));
        cmbkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbkodeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbstocker, 0, 203, Short.MAX_VALUE)
                            .addComponent(txtjumlah)
                            .addComponent(cmbkode, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnsave)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbkode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtjumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbstocker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addComponent(btnsave)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtjumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlahActionPerformed

    private void cmbkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbkodeActionPerformed
        String kodeMenu = (String) cmbkode.getSelectedItem();
        if (kodeMenu != null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
                    String sql = "SELECT NamaMenu FROM NamaMenu WHERE KodeMenu=?";
                    try (PreparedStatement stm = (PreparedStatement) con.prepareStatement(sql)) {
                        stm.setString(1, kodeMenu);
                        try (ResultSet rs = stm.executeQuery()) {
                            if (rs.next()) {
                                namaMenuField.setText(rs.getString("NamaMenu"));
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException | SQLException e) {
            }
        }
    }//GEN-LAST:event_cmbkodeActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if (cmbkode.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Kode Menu is required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else if (txtjumlah.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Jumlah Stok is required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else if (cmbstocker.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Stocker is required!", "Warning Message", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                // Membuat koneksi ke database
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "");

                // Menyusun kueri SQL
                String sql = "INSERT INTO Restock (KodeMenu, NamaMenu, NamaPegawai, jumlahstok) VALUES (?, ?, ?, ?)";

                // Membuat prepared statement
                PreparedStatement stmt = con.prepareStatement(sql);

                // Mengatur parameter pada prepared statement
                stmt.setString(1, cmbkode.getSelectedItem().toString());
                stmt.setString(2, txtjumlah.getText());
                stmt.setString(3, cmbstocker.getSelectedItem().toString());

                // Mengeksekusi kueri SQL
                stmt.executeUpdate();

                // Menutup statement dan koneksi
                stmt.close();
                con.close();

                // Menambahkan data ke tabel
                tableModel.addRow(new Object[]{cmbkode.getSelectedItem(), txtjumlah.getText(), cmbstocker.getSelectedItem()});
                TableStok.setModel(tableModel);

                // Mengosongkan inputan
                cmbkode.setSelectedItem(null);
                txtjumlah.setText("");
                cmbstocker.setSelectedIndex(0); 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableStok;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmbkode;
    private javax.swing.JComboBox<String> cmbstocker;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtjumlah;
    // End of variables declaration//GEN-END:variables
}
