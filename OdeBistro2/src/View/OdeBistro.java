package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author sherl
 */
public class OdeBistro extends javax.swing.JFrame implements ListSelectionListener {

    public JTextField getInputKodePegawai() {
        return inputKodePegawai;
    }

    public JPasswordField getInputPassword() {
        return inputPassword;
    }

    DataMeja datameja = new DataMeja();
    Bahan bahan = new Bahan();
    LihatPesanan pesanan = new LihatPesanan();
    Member member = new Member();
    MenuPage menu = new MenuPage();
    PaymentMeja payment = new PaymentMeja();
    RedeemPoint redeem = new RedeemPoint();
    Invoice invoice = new Invoice();

    public OdeBistro() {
        initComponents();
        this.add(datameja);
        this.add(bahan);
        this.add(pesanan);
        this.add(member);
        this.add(menu);
        this.add(payment);
        this.add(redeem);
        this.add(invoice);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        inputKodePegawai = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        buttonLogin = new javax.swing.JButton();
        inputPassword = new javax.swing.JPasswordField();
        jLabel20 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        UserName = new javax.swing.JMenu();
        Home = new javax.swing.JMenuItem();
        Logout = new javax.swing.JMenuItem();
        shutDown = new javax.swing.JMenuItem();
        Page = new javax.swing.JMenu();
        lihatpesananchef = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("OdeBistro Cafe");
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 525));
        getContentPane().setLayout(new java.awt.CardLayout());

        LoginPanel.setName(""); // NOI18N

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Employee Login");

        jLabel18.setText("Kode Pegawai");

        jLabel19.setText("Password");

        buttonLogin.setBackground(new java.awt.Color(153, 204, 255));
        buttonLogin.setText("Login");
        buttonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoginActionPerformed(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.jpg"))); // NOI18N
        jLabel20.setText("jLabel4");

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginPanelLayout.createSequentialGroup()
                .addContainerGap(271, Short.MAX_VALUE)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17))
                    .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(LoginPanelLayout.createSequentialGroup()
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel18)
                                .addComponent(jLabel19))
                            .addGap(18, 18, 18)
                            .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputKodePegawai, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(inputPassword)))))
                .addGap(282, 282, 282))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(inputKodePegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(buttonLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(LoginPanel, "card3");

        UserName.setText("UserName");

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        UserName.add(Home);

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });
        UserName.add(Logout);

        shutDown.setText("Shut Down");
        shutDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shutDownActionPerformed(evt);
            }
        });
        UserName.add(shutDown);

        jMenuBar1.add(UserName);

        Page.setText("Page");
        Page.add(lihatpesananchef);

        jMenuBar1.add(Page);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shutDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shutDownActionPerformed
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/odebistrosolo?useSSL=false", "root", "")) {
            try (Statement stmt = con.createStatement()) {
                // Hapus semua data dari tabel
                String sqlDelete = "DELETE FROM menupage";
                stmt.executeUpdate(sqlDelete);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Gagal mereset data SQL: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        System.exit(0);
    }//GEN-LAST:event_shutDownActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        inputKodePegawai.setText("");
        inputPassword.setText("");
        inputKodePegawai.setEnabled(true);
        inputPassword.setEnabled(true);
        buttonLogin.setEnabled(true);
        Page.removeAll();
    }//GEN-LAST:event_LogoutActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        LoginPanel.setVisible(false);
        datameja.setVisible(false);
        bahan.setVisible(false);
        pesanan.setVisible(false);
        member.setVisible(false);
        menu.setVisible(false);
        payment.setVisible(false);
        redeem.setVisible(false);
    }//GEN-LAST:event_HomeActionPerformed

    private void buttonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoginActionPerformed
        String kodepegawai = inputKodePegawai.getText().trim();
        String passwordpegawai = new String(inputPassword.getPassword()).trim();

        if (kodepegawai.isEmpty() || passwordpegawai.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Silakan masukkan Kode Pegawai dan Password!", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            String sql = "SELECT * FROM DataPegawai WHERE KodePegawai=? AND PasswordPegawai=?";
            try (PreparedStatement stm = con.prepareStatement(sql)) {
                stm.setString(1, kodepegawai);
                stm.setString(2, passwordpegawai);
                try (ResultSet rs = stm.executeQuery()) {
                    if (rs.next()) {
                        String posisiPegawai = rs.getString("PosisiPegawai");
                        String namaPegawai = rs.getString("NamaPegawai");
                        JOptionPane.showMessageDialog(this, "Selamat datang, " + namaPegawai + " (" + posisiPegawai + ")!", "Login Berhasil", JOptionPane.INFORMATION_MESSAGE);
                        inputKodePegawai.setEnabled(false);
                        inputPassword.setEnabled(false);
                        buttonLogin.setEnabled(false);

                        addMenuToPage(posisiPegawai, namaPegawai);
                        LoginPanel.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Kode Pegawai atau Password salah!", "Login Gagal", JOptionPane.ERROR_MESSAGE);
                        inputKodePegawai.setText("");
                        inputPassword.setText("");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan koneksi database: " + e.getMessage(), "Error Database", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonLoginActionPerformed

    private void addMenuToPage(String posisiPegawai, String namaPegawai) {
        UserName.setText(namaPegawai);

        JMenuItem menuItemDataMeja = new javax.swing.JMenuItem("Data Meja");
        JMenuItem menuItemMenuPage = new javax.swing.JMenuItem("Menu Page");
        JMenuItem menuItemPesanan = new javax.swing.JMenuItem("Lihat Pesanan");
        JMenuItem menuItemStock = new javax.swing.JMenuItem("Stock");
        JMenuItem menuItemPayment = new javax.swing.JMenuItem("Payment");
        JMenuItem menuItemMember = new javax.swing.JMenuItem("Member");
        JMenuItem menuItemInvoice = new javax.swing.JMenuItem("Invoice");

        switch (posisiPegawai) {
            case "Server":
                Page.add(menuItemDataMeja);
                Page.add(menuItemMenuPage);
                Page.add(menuItemPesanan);
                break;
            case "Chef":
                Page.add(menuItemPesanan);
                break;
            case "Stocker":
                Page.add(menuItemStock);
                break;
            case "Cashier":
                Page.add(menuItemPayment);
                Page.add(menuItemMember);
                Page.add(menuItemInvoice);
                break;
            case "Owner":
                Page.add(menuItemDataMeja);
                Page.add(menuItemMenuPage);
                Page.add(menuItemPayment);
                Page.add(menuItemMember);
                Page.add(menuItemPesanan);
                Page.add(menuItemStock);
                break;
        }

        menuItemDataMeja.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginPanel.setVisible(false);
                datameja.setVisible(true);
                bahan.setVisible(false);
                pesanan.setVisible(false);
                member.setVisible(false);
                menu.setVisible(false);
                payment.setVisible(false);
                redeem.setVisible(false);
                invoice.setVisible(false);
            }
        });
        menuItemMember.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                LoginPanel.setVisible(false);
                datameja.setVisible(false);
                bahan.setVisible(false);
                pesanan.setVisible(false);
                member.setVisible(true);
                menu.setVisible(false);
                payment.setVisible(false);
                redeem.setVisible(false);
                invoice.setVisible(false);
            }
        });
        menuItemMenuPage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                LoginPanel.setVisible(false);
                datameja.setVisible(false);
                bahan.setVisible(false);
                pesanan.setVisible(false);
                member.setVisible(false);
                menu.setVisible(true);
                payment.setVisible(false);
                redeem.setVisible(false);
                invoice.setVisible(false);
            }
        });
        menuItemPayment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                LoginPanel.setVisible(false);
                datameja.setVisible(false);
                bahan.setVisible(false);
                pesanan.setVisible(false);
                member.setVisible(false);
                menu.setVisible(false);
                payment.setVisible(true);
                redeem.setVisible(false);
                invoice.setVisible(false);
            }
        });
        menuItemPesanan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                LoginPanel.setVisible(false);
                datameja.setVisible(false);
                bahan.setVisible(false);
                pesanan.setVisible(true);
                member.setVisible(false);
                menu.setVisible(false);
                payment.setVisible(false);
                redeem.setVisible(false);
                invoice.setVisible(false);
            }
        });
        menuItemStock.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                LoginPanel.setVisible(false);
                datameja.setVisible(false);
                bahan.setVisible(true);
                pesanan.setVisible(false);
                member.setVisible(false);
                menu.setVisible(false);
                payment.setVisible(false);
                redeem.setVisible(false);
                invoice.setVisible(false);
            }
        });
        menuItemInvoice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ev) {
                LoginPanel.setVisible(false);
                datameja.setVisible(false);
                bahan.setVisible(false);
                pesanan.setVisible(false);
                member.setVisible(false);
                menu.setVisible(false);
                payment.setVisible(false);
                redeem.setVisible(false);
                invoice.setVisible(true);
            }
        });
    }//GEN-LAST:event_buttonLoginActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OdeBistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdeBistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdeBistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdeBistro.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdeBistro().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Home;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JMenuItem Logout;
    private javax.swing.JMenu Page;
    private javax.swing.JMenu UserName;
    private javax.swing.JButton buttonLogin;
    private javax.swing.JTextField inputKodePegawai;
    private javax.swing.JPasswordField inputPassword;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem lihatpesananchef;
    private javax.swing.JMenuItem shutDown;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
