package View;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JTextField;

/**
 *
 * @author sherl
 */
public class PaymentMeja extends javax.swing.JPanel {

    private int totalHargaKeseluruhan;

    public JTextField getTxtdiskon() {
        return txtdiskon;
    }

    public void setTxtdiskon(int diskon) {
        txtdiskon.setText(String.valueOf(diskon));
    }

    public JTextField getTxtharga() {
        return txtharga;
    }

    public void setTxtharga(int totalHarga) {
        txtharga.setText(String.valueOf(totalHarga));
    }

    public JTextField getTxtpajak() {
        return txtpajak;
    }

    public void setTxtpajak(int pajak) {
        txtpajak.setText(String.valueOf(pajak));
    }

    public JTextField getTxttotal() {
        return txttotal;
    }

    public void setTxttotal(int totalAkhir) {
        txttotal.setText(String.valueOf(totalAkhir));
    }

    public PaymentMeja() {
        initComponents();
    }
    private String noResi = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ListPesananPayment = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbmetode = new javax.swing.JComboBox<>();
        btninvoice = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        txtmasukankode = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtpajak = new javax.swing.JTextField();
        txtdiskon = new javax.swing.JTextField();
        txttotal = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        cmbnomeja = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        btnloginmember = new javax.swing.JButton();
        txtphone = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("List Pesanan"));

        ListPesananPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Menu", "Qty", "Notes", "Harga", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListPesananPayment.getTableHeader().setReorderingAllowed(false);
        ListPesananPayment.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListPesananPaymentAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(ListPesananPayment);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addGap(41, 41, 41))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pembayaran"));

        jLabel1.setText("Metode Pembayaran");

        cmbmetode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Ovo", "Gopay", "BCA Credit Card", "BNI Credit Card", "Visa Tap" }));

        btninvoice.setBackground(new java.awt.Color(153, 204, 255));
        btninvoice.setText("Print Invoice");
        btninvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninvoiceActionPerformed(evt);
            }
        });

        jLabel47.setText("Insert Discount Code");

        txtmasukankode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmasukankodeActionPerformed(evt);
            }
        });

        jLabel48.setText("Harga");

        jLabel49.setText("Tax (11%)");

        jLabel50.setText("Disc");

        jLabel51.setText("Total");

        txtharga.setEditable(false);
        txtharga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthargaActionPerformed(evt);
            }
        });

        txtpajak.setEditable(false);
        txtpajak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpajakActionPerformed(evt);
            }
        });

        txtdiskon.setEditable(false);

        txttotal.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtmasukankode)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btninvoice))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel48))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtharga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpajak, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(cmbmetode, 0, 169, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txtharga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(txtpajak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtdiskon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel51)
                    .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel47)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtmasukankode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbmetode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btninvoice)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Member"));

        jLabel4.setText("Nomor Meja");

        cmbnomeja.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Table 1", "Table 2", "Table 3", "Table 4", "Table 5", "Table 6", "Table 7", "Table 8", "Table 9", "Table 10", "Table 11", "Table 12" }));
        cmbnomeja.setSelectedIndex(-1);

        jLabel62.setText("Nomor Telepon");

        btnloginmember.setBackground(new java.awt.Color(153, 204, 255));
        btnloginmember.setText("Login Member");
        btnloginmember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginmemberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(btnloginmember, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel62))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbnomeja, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtphone))))
                .addGap(14, 14, 14))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbnomeja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnloginmember)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btninvoiceActionPerformed(java.awt.event.ActionEvent evt) {
        String totalText = txttotal.getText().trim();
        if (totalText.isEmpty() || totalText.equals("0")) {
            JOptionPane.showMessageDialog(this, "Tidak ada tagihan pembayaran aktif!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String metode = (String) cmbmetode.getSelectedItem();
        String selectedTable = (String) cmbnomeja.getSelectedItem();
        int totalBayar = Integer.parseInt(totalText);

        // Record payment to database
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            String sqlPay = "INSERT INTO pembayaran(id_pembayaran, tipe_pembayaran, tgl_pembelian, deskripsi, kasir) VALUES (?, ?, CURDATE(), ?, ?)";
            try (PreparedStatement pst = con.prepareStatement(sqlPay)) {
                int randomId = (int) (Math.random() * 9000) + 1000;
                pst.setInt(1, randomId);
                pst.setString(2, metode);
                pst.setString(3, "Pembayaran " + selectedTable + " via " + metode);
                pst.setString(4, "P042202");
                pst.executeUpdate();
            }
            // Clear menupage table after successful checkout
            try (Statement stmt = con.createStatement()) {
                stmt.executeUpdate("DELETE FROM menupage");
            }
            JOptionPane.showMessageDialog(this, "===============================\n" +
                    "        ODE BISTRO INVOICE        \n" +
                    "===============================\n" +
                    "Meja: " + selectedTable + "\n" +
                    "Metode: " + metode + "\n" +
                    "Total Pembayaran: Rp " + totalBayar + "\n" +
                    "Status: LUNAS\n" +
                    "===============================\n" +
                    "Terima kasih atas kunjungan Anda!", "Invoice Pembayaran Sukses", JOptionPane.INFORMATION_MESSAGE);

            // Reset fields
            txtharga.setText("0");
            txtpajak.setText("0");
            txtdiskon.setText("0");
            txttotal.setText("0");
            txtmasukankode.setText("");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal memproses pembayaran: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnloginmemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginmemberActionPerformed
        String phoneNumber = txtphone.getText();

        if (phoneNumber != null && !phoneNumber.isEmpty()) {
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
                String sqlCheckMember = "SELECT nama FROM member WHERE no_telp_member = ?";
                try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlCheckMember)) {
                    pst.setString(1, phoneNumber);
                    try (ResultSet rs = pst.executeQuery()) {
                        if (rs.next()) {
                            String namaMember = rs.getString("nama");
                            JOptionPane.showMessageDialog(this, "Hai, " + namaMember);
                        } else {

                        }
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnloginmemberActionPerformed

    private void ListPesananPaymentAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListPesananPaymentAncestorAdded
        DefaultTableModel model = new DefaultTableModel(new String[]{"Menu", "Qty", "Notes", "Harga", "Total"}, 0);
        totalHargaKeseluruhan = 0;

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            try {
                String sql = "SELECT * FROM menupage";
                try (PreparedStatement pst = con.prepareStatement(sql)) {
                    ResultSet rs = pst.executeQuery();

                    // Iterasi melalui hasil query
                    while (rs.next()) {
                        String namaMenu = rs.getString("NamaMenu");
                        int quantity = rs.getInt("Quantity");
                        String notes = rs.getString("notes");
                        int harga = rs.getInt("HargaMenu");
                        int totalharga = harga * quantity; // Hitung total harga

                        model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});
                        totalHargaKeseluruhan += totalharga; // Tambahkan ke total harga keseluruhan
                    }
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(PaymentMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(PaymentMeja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        // Tampilkan total harga keseluruhan di JTextField
        txtharga.setText(String.valueOf(totalHargaKeseluruhan));

        ListPesananPayment.setModel(model);

        // Memperbarui total pajak setelah total harga keseluruhan ditampilkan
        updateTotalPajak();
    }//GEN-LAST:event_ListPesananPaymentAncestorAdded
    private void updateTotalHarga() {
        // Mendapatkan model dari tabel
        DefaultTableModel model = (DefaultTableModel) ListPesananPayment.getModel();

        // Inisialisasi variabel total harga
        int totalHarga = 0;

        // Iterasi melalui semua baris dalam tabel
        for (int i = 0; i < model.getRowCount(); i++) {
            // Mendapatkan nilai harga dari kolom total harga
            int harga = Integer.parseInt(model.getValueAt(i, 4).toString());
            // Menambahkan harga ke total harga
            totalHarga += harga;
        }

        // Menampilkan total harga di txtharga
        txtharga.setText(String.valueOf(totalHarga));
    }
    private void txthargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthargaActionPerformed
        updateTotalHarga();
    }//GEN-LAST:event_txthargaActionPerformed
    private void updateTotalPajak() {
        // Asumsi pajak adalah 11%
        double pajakRate = 0.11;
        int pajak = (int) (totalHargaKeseluruhan * pajakRate); // Menggunakan total harga keseluruhan

        // Menampilkan pajak di txtpajak
        txtpajak.setText(String.valueOf(pajak));
    }
    private void txtpajakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpajakActionPerformed
        updateTotalPajak();
    }//GEN-LAST:event_txtpajakActionPerformed

    private void txtmasukankodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmasukankodeActionPerformed
        String voucherCode = txtmasukankode.getText().trim();
        int totalHarga = Integer.parseInt(txtharga.getText());
        int voucherDiscount = 0;

        if (totalHarga >= 200000) {
            if (voucherCode.equalsIgnoreCase("bistroode")) {
                voucherDiscount = 25000;
            } else if (voucherCode.equalsIgnoreCase("odebistro")) {
                voucherDiscount = 30000;
            } else {
                // Handle voucher code yang tidak valid
                JOptionPane.showMessageDialog(this, "Voucher code tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Handle pembelian tidak mencapai minimal 200 ribu
            JOptionPane.showMessageDialog(this, "Minimal pembelian harus 200 ribu untuk menggunakan voucher diskon", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menampilkan total harga setelah diskon
        int totalHargaSetelahDiskon = totalHarga - voucherDiscount;
        txttotal.setText(String.valueOf(totalHargaSetelahDiskon));
        txtdiskon.setText(String.valueOf(voucherDiscount));
    }//GEN-LAST:event_txtmasukankodeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListPesananPayment;
    private javax.swing.JButton btninvoice;
    private javax.swing.JButton btnloginmember;
    private javax.swing.JComboBox<String> cmbmetode;
    private javax.swing.JComboBox<String> cmbnomeja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField txtdiskon;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtmasukankode;
    private javax.swing.JTextField txtpajak;
    private javax.swing.JTextField txtphone;
    private javax.swing.JTextField txttotal;
    // End of variables declaration//GEN-END:variables

}
