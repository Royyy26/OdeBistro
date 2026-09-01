package View;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.sql.*;

/**
 *
 * @author ELROY
 */
public class Invoice extends javax.swing.JPanel {

    /**
     * Creates new form Invoice
     */
    public Invoice() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        printinvoice = new javax.swing.JTextArea();

        printinvoice.setEditable(false);
        printinvoice.setColumns(20);
        printinvoice.setRows(5);
        printinvoice.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                printinvoiceAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(printinvoice);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void printinvoiceAncestorAdded(javax.swing.event.AncestorEvent evt) {
        printinvoice.setText("");
        printinvoice.setText("====================================================\n");
        printinvoice.append("                     ODE BISTRO                     \n");
        printinvoice.append("             Jl. Kanggraksan No 111, Cirebon        \n");
        printinvoice.append("                  Telp: 0821-2676-2838              \n");
        printinvoice.append("====================================================\n");
        printinvoice.append("Waktu: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss")) + "\n");
        printinvoice.append("Kasir: P042202 (Cashier)\n");
        printinvoice.append("----------------------------------------------------\n");
        printinvoice.append(String.format("%-20s %-5s %-10s %-10s\n", "Menu", "Qty", "Harga", "Total"));
        printinvoice.append("----------------------------------------------------\n");

        int grandTotal = 0;
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            String sql = "SELECT * FROM menupage";
            try (PreparedStatement pst = con.prepareStatement(sql); ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String menu = rs.getString("NamaMenu");
                    int quantity = rs.getInt("Quantity");
                    int hargaSatuan = rs.getInt("HargaMenu");
                    int subtotal = rs.getInt("TotalHarga");
                    grandTotal += subtotal;

                    printinvoice.append(String.format("%-20s %-5d Rp%-8d Rp%-8d\n", menu, quantity, hargaSatuan, subtotal));
                }
            }
        } catch (SQLException e) {
            // Handled gracefully
        }
        printinvoice.append("----------------------------------------------------\n");
        double tax = grandTotal * 0.11;
        double netTotal = grandTotal + tax;

        printinvoice.append(String.format("%-36s Rp%,.0f\n", "Subtotal:", (double) grandTotal));
        printinvoice.append(String.format("%-36s Rp%,.0f\n", "PB1 (11%):", tax));
        printinvoice.append(String.format("%-36s Rp%,.0f\n", "GRAND TOTAL:", netTotal));
        printinvoice.append("====================================================\n");
        printinvoice.append("           TERIMA KASIH ATAS KUNJUNGAN ANDA!        \n");
        printinvoice.append("             Follow IG: @odebistro.official        \n");
        printinvoice.append("====================================================\n");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea printinvoice;
    // End of variables declaration//GEN-END:variables
}
