package View;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.sql.*;
import javax.swing.JPanel;

/**
 *
 * @author sherl
 */
public class DataMeja extends javax.swing.JPanel {

    private JPanel previousPanel;
    private JTextField[] tables = new JTextField[12];
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private MenuPage menuPage;

    public void setPreviousPanel(JPanel panel) {
        this.previousPanel = panel;
    }

    public DataMeja() {
        initComponents();
        initTables();
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        menuPage = new MenuPage();
        mainPanel.add(menuPage, "menu");
    }

    private void initTables() {
        tables[0] = table1;
        tables[1] = table2;
        tables[2] = table3;
        tables[3] = table4;
        tables[4] = table5;
        tables[5] = table6;
        tables[6] = table7;
        tables[7] = table8;
        tables[8] = table9;
        tables[9] = table10;
        tables[10] = table11;
        tables[11] = table12;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cmbserver = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        btninput = new javax.swing.JButton();
        cmbmeja = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnChangeMeja = new javax.swing.JButton();
        cmbmejaAwal = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbmejaBaru = new javax.swing.JComboBox<>();
        paneltable = new javax.swing.JPanel();
        table3 = new javax.swing.JTextField();
        table7 = new javax.swing.JTextField();
        table5 = new javax.swing.JTextField();
        table6 = new javax.swing.JTextField();
        table4 = new javax.swing.JTextField();
        table8 = new javax.swing.JTextField();
        table9 = new javax.swing.JTextField();
        table11 = new javax.swing.JTextField();
        table10 = new javax.swing.JTextField();
        table2 = new javax.swing.JTextField();
        table1 = new javax.swing.JTextField();
        table12 = new javax.swing.JTextField();

        jButton5.setText("jButton5");

        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Customer"));

        jLabel3.setText("Meja");

        cmbserver.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morgan Christina", "Mackenzie Nicolas", "Shaquille Mark", "Ruth Alaina", "Morgan Columbus" }));
        cmbserver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbserverActionPerformed(evt);
            }
        });

        jLabel5.setText("Server");

        btninput.setBackground(new java.awt.Color(153, 204, 255));
        btninput.setText("Input");
        btninput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninputActionPerformed(evt);
            }
        });

        cmbmeja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6", "Table 7", "Table 8", "Table 9", "Table 10", "Table 11", "Table 12" }));
        cmbmeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmejaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btninput, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbmeja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbserver, 0, 225, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbmeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbserver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(btninput)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Move Table"));

        jLabel4.setText("Meja Awal");

        btnChangeMeja.setBackground(new java.awt.Color(153, 204, 255));
        btnChangeMeja.setText("Input");
        btnChangeMeja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeMejaActionPerformed(evt);
            }
        });

        cmbmejaAwal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6", "Table 7", "Table 8", "Table 9", "Table 10", "Table 11", "Table 12" }));
        cmbmejaAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmejaAwalActionPerformed(evt);
            }
        });

        jLabel7.setText("Meja Sekarang");

        cmbmejaBaru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6", "Table 7", "Table 8", "Table 9", "Table 10", "Table 11", "Table 12" }));
        cmbmejaBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmejaBaruActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnChangeMeja, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbmejaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbmejaBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbmejaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmbmejaBaru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnChangeMeja)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        table3.setEditable(false);
        table3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table3.setText("Table 3");

        table7.setEditable(false);
        table7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table7.setText("Table 7");

        table5.setEditable(false);
        table5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table5.setText("Table 5");

        table6.setEditable(false);
        table6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table6.setText("Table 6");

        table4.setEditable(false);
        table4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table4.setText("Table 4");

        table8.setEditable(false);
        table8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table8.setText("Table 8");

        table9.setEditable(false);
        table9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table9.setText("Table 9");

        table11.setEditable(false);
        table11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table11.setText("Table 11");

        table10.setEditable(false);
        table10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table10.setText("Table 10");

        table2.setEditable(false);
        table2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table2.setText("Table 2");

        table1.setEditable(false);
        table1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table1.setText("Table 1");

        table12.setEditable(false);
        table12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        table12.setText("Table 12");

        javax.swing.GroupLayout paneltableLayout = new javax.swing.GroupLayout(paneltable);
        paneltable.setLayout(paneltableLayout);
        paneltableLayout.setHorizontalGroup(
            paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addComponent(table10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(table11, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addComponent(table7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(table8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addComponent(table4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(table5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneltableLayout.createSequentialGroup()
                        .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(table2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(table12, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        paneltableLayout.setVerticalGroup(
            paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneltableLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(table3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(table2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(table1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(paneltableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(table12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table11, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table10, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paneltable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paneltable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private void updateTableStatus(int selectedTable, Color color) {
        if (selectedTable >= 0 && selectedTable < tables.length) {
            tables[selectedTable].setBackground(color);
        }
    }
    private void cmbserverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbserverActionPerformed
        String kodepegawaiValue = cmbserver.getSelectedItem().toString();
        String namaServer = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
                try (PreparedStatement stm = (PreparedStatement) con.prepareStatement("SELECT NamaPegawai FROM DataPegawai WHERE KodePegawai=?")) {
                    stm.setString(1, kodepegawaiValue);
                    try (ResultSet rs = stm.executeQuery()) {
                        if (rs.next()) {
                            String namaPegawai = rs.getString("NamaPegawai");
                            JOptionPane.showMessageDialog(this, "Nama Pegawai: " + namaPegawai, "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        } else {
//                            JOptionPane.showMessageDialog(this, "Kode Pegawai tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cmbserverActionPerformed

    private void btninputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninputActionPerformed
        int selectedTable = cmbmeja.getSelectedIndex();
        String selectedServer = (String) cmbserver.getSelectedItem();

        updateTableStatus(selectedTable, Color.RED);
        saveToDatabase(selectedTable + 1, selectedServer);
    }//GEN-LAST:event_btninputActionPerformed
    private void saveToDatabase(int meja, String namaPegawai) {
        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro", "root", "")) {
            String sql = "INSERT INTO customer (Meja, NamaPegawai) VALUES (?, ?)";
            try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                stmt.setInt(1, meja);
                stmt.setString(2, namaPegawai);
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan", "Success", JOptionPane.PLAIN_MESSAGE);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void cmbmejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmejaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmejaActionPerformed

    private void btnChangeMejaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeMejaActionPerformed
        int selectedTable = cmbmejaAwal.getSelectedIndex(); // Basis 0
        int MejaBaru = cmbmejaBaru.getSelectedIndex(); // Basis 0

        if (deleteFromDatabase(selectedTable + 1)) { // Basis 1 untuk database
            updateTableStatus(selectedTable, Color.WHITE); // Basis 0 untuk tampilan
            updateTableStatus(MejaBaru, Color.RED); // Basis 0 untuk tampilan
        } else {

        }
    }//GEN-LAST:event_btnChangeMejaActionPerformed
    private boolean deleteFromDatabase(int meja) {
        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro", "root", "")) {
            String sql = "DELETE FROM customer WHERE Meja = ?";
            try (PreparedStatement stmt = (PreparedStatement) con.prepareStatement(sql)) {
                stmt.setInt(1, meja);
                int rowsDeleted = stmt.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Success", JOptionPane.PLAIN_MESSAGE);
                    return true;
                } else {
                    JOptionPane.showMessageDialog(this, "Tidak ada data yang dihapus", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    private void cmbmejaAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmejaAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmejaAwalActionPerformed

    private void cmbmejaBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmejaBaruActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbmejaBaruActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeMeja;
    private javax.swing.JButton btninput;
    private javax.swing.JComboBox<String> cmbmeja;
    private javax.swing.JComboBox<String> cmbmejaAwal;
    private javax.swing.JComboBox<String> cmbmejaBaru;
    private javax.swing.JComboBox<String> cmbserver;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel paneltable;
    private javax.swing.JTextField table1;
    private javax.swing.JTextField table10;
    private javax.swing.JTextField table11;
    private javax.swing.JTextField table12;
    private javax.swing.JTextField table2;
    private javax.swing.JTextField table3;
    private javax.swing.JTextField table4;
    private javax.swing.JTextField table5;
    private javax.swing.JTextField table6;
    private javax.swing.JTextField table7;
    private javax.swing.JTextField table8;
    private javax.swing.JTextField table9;
    // End of variables declaration//GEN-END:variables
}
