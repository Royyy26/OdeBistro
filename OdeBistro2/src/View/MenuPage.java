package View;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 *
 * @author sherl
 */
public class MenuPage extends javax.swing.JPanel {

    public MenuPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        btnfinish = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablepesanan = new javax.swing.JTable();
        btndelete = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        ScrollableMenu = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        btntf = new javax.swing.JButton();
        btnts = new javax.swing.JButton();
        btnms = new javax.swing.JButton();
        btnmct = new javax.swing.JButton();
        btnsc = new javax.swing.JButton();
        btnlccb = new javax.swing.JButton();
        btnpao = new javax.swing.JButton();
        btnpp = new javax.swing.JButton();
        btnsb = new javax.swing.JButton();
        btnmcc = new javax.swing.JButton();
        btnlm = new javax.swing.JButton();
        btnbm = new javax.swing.JButton();
        btnmw = new javax.swing.JButton();
        btnilt = new javax.swing.JButton();
        btnsp = new javax.swing.JButton();
        btnvg = new javax.swing.JButton();
        btnmp = new javax.swing.JButton();
        btncyc = new javax.swing.JButton();
        btnbfy = new javax.swing.JButton();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        btntf1 = new javax.swing.JButton();
        btnts1 = new javax.swing.JButton();
        btnms1 = new javax.swing.JButton();
        btnlccb1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        btnsc1 = new javax.swing.JButton();
        btnmct1 = new javax.swing.JButton();
        btnpp1 = new javax.swing.JButton();
        btnsb1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        btnpao1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        btnsp1 = new javax.swing.JButton();
        btnmp1 = new javax.swing.JButton();
        btncyc1 = new javax.swing.JButton();
        btnvg1 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        btnbfy1 = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        btnbm1 = new javax.swing.JButton();
        btnlm1 = new javax.swing.JButton();
        btnmcc1 = new javax.swing.JButton();
        btnmw1 = new javax.swing.JButton();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        btnilt1 = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();

        jLabel3.setText("Disc");

        jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("List Pesanan"));

        btnfinish.setBackground(new java.awt.Color(153, 204, 255));
        btnfinish.setText("Finish Order");
        btnfinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinishActionPerformed(evt);
            }
        });

        tablepesanan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        tablepesanan.getTableHeader().setReorderingAllowed(false);
        jScrollPane5.setViewportView(tablepesanan);
        if (tablepesanan.getColumnModel().getColumnCount() > 0) {
            tablepesanan.getColumnModel().getColumn(0).setResizable(false);
            tablepesanan.getColumnModel().getColumn(1).setResizable(false);
            tablepesanan.getColumnModel().getColumn(2).setResizable(false);
        }

        btndelete.setText("Delete Item");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnedit.setText("Edit Item");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel65)
                        .addGap(45, 45, 45)
                        .addComponent(btnfinish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addComponent(btnedit, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btndelete)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel65, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btndelete)
                                .addComponent(btnedit))
                            .addGap(40, 40, 40)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnfinish)))
                .addGap(137, 137, 137))
        );

        ScrollableMenu.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrollableMenu.setMinimumSize(new java.awt.Dimension(530, 500));
        ScrollableMenu.setPreferredSize(new java.awt.Dimension(530, 500));

        jPanel1.setMinimumSize(new java.awt.Dimension(515, 1000));
        jPanel1.setPreferredSize(new java.awt.Dimension(515, 1500));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Truffle Fries");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Mushroom Soup");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Tuna Salad");

        jLabel8.setText("30000");

        jLabel9.setText("25000");

        jLabel10.setText("25000");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Mac n Cheese with");

        jLabel12.setText("42000");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setText("Spaghetti Carbonara");

        jLabel14.setText("40000");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setText("Lime and Chili Chicken");

        jLabel16.setText("35000");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setText("Spaghetti Bolognese");

        jLabel18.setText("35000");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel19.setText("Penne Pesto");

        jLabel20.setText("37000");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel21.setText("Penne Aglio e Olio");

        jLabel22.setText("35000");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel23.setText("Milkshake Cookies");

        jLabel24.setText("22000");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel25.setText("Lemon Mojito");

        jLabel26.setText("22000");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setText("Blue Mojito");

        jLabel28.setText("20000");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setText("Strawberry Pancake");

        jLabel30.setText("23000");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setText("Ice Lemon Tea");

        jLabel32.setText("15000");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setText("Mineral Water");

        jLabel34.setText("10000");

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel35.setText("Burger");

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel36.setText("Truffle");

        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel37.setText("and Cream");

        jLabel38.setText("22000");

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel39.setText("Vanilla Gelato");

        jLabel40.setText("20000");

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setText("Choco Yum Cake");

        jLabel42.setText("20000");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel43.setText("Matcha Pancake");

        jLabel44.setText("22000");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel45.setText("Blueberry Frozen");

        jLabel46.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel46.setText("Yogurt");

        btntf.setBackground(new java.awt.Color(153, 204, 255));
        btntf.setText("Add");
        btntf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntfActionPerformed(evt);
            }
        });

        btnts.setBackground(new java.awt.Color(153, 204, 255));
        btnts.setText("Add");
        btnts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntsActionPerformed(evt);
            }
        });

        btnms.setBackground(new java.awt.Color(153, 204, 255));
        btnms.setText("Add");
        btnms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmsActionPerformed(evt);
            }
        });

        btnmct.setBackground(new java.awt.Color(153, 204, 255));
        btnmct.setText("Add");
        btnmct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmctActionPerformed(evt);
            }
        });

        btnsc.setBackground(new java.awt.Color(153, 204, 255));
        btnsc.setText("Add");
        btnsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscActionPerformed(evt);
            }
        });

        btnlccb.setBackground(new java.awt.Color(153, 204, 255));
        btnlccb.setText("Add");
        btnlccb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlccbActionPerformed(evt);
            }
        });

        btnpao.setBackground(new java.awt.Color(153, 204, 255));
        btnpao.setText("Add");
        btnpao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpaoActionPerformed(evt);
            }
        });

        btnpp.setBackground(new java.awt.Color(153, 204, 255));
        btnpp.setText("Add");
        btnpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnppActionPerformed(evt);
            }
        });

        btnsb.setBackground(new java.awt.Color(153, 204, 255));
        btnsb.setText("Add");
        btnsb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsbActionPerformed(evt);
            }
        });

        btnmcc.setBackground(new java.awt.Color(153, 204, 255));
        btnmcc.setText("Add");
        btnmcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmccActionPerformed(evt);
            }
        });

        btnlm.setBackground(new java.awt.Color(153, 204, 255));
        btnlm.setText("Add");
        btnlm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlmActionPerformed(evt);
            }
        });

        btnbm.setBackground(new java.awt.Color(153, 204, 255));
        btnbm.setText("Add");
        btnbm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbmActionPerformed(evt);
            }
        });

        btnmw.setBackground(new java.awt.Color(153, 204, 255));
        btnmw.setText("Add");
        btnmw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmwActionPerformed(evt);
            }
        });

        btnilt.setBackground(new java.awt.Color(153, 204, 255));
        btnilt.setText("Add");
        btnilt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniltActionPerformed(evt);
            }
        });

        btnsp.setBackground(new java.awt.Color(153, 204, 255));
        btnsp.setText("Add");
        btnsp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspActionPerformed(evt);
            }
        });

        btnvg.setBackground(new java.awt.Color(153, 204, 255));
        btnvg.setText("Add");
        btnvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvgActionPerformed(evt);
            }
        });

        btnmp.setBackground(new java.awt.Color(153, 204, 255));
        btnmp.setText("Add");
        btnmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmpActionPerformed(evt);
            }
        });

        btncyc.setBackground(new java.awt.Color(153, 204, 255));
        btncyc.setText("Add");
        btncyc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncycActionPerformed(evt);
            }
        });

        btnbfy.setBackground(new java.awt.Color(153, 204, 255));
        btnbfy.setText("Add");
        btnbfy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbfyActionPerformed(evt);
            }
        });

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Borgir.png"))); // NOI18N
        jLabel95.setText("jLabel1");

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Mushroom.png"))); // NOI18N
        jLabel96.setText("jLabel1");

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truffle.png"))); // NOI18N
        jLabel97.setText("jLabel1");

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/salad.png"))); // NOI18N
        jLabel98.setText("jLabel1");

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mac and cheese.png"))); // NOI18N
        jLabel99.setText("jLabel1");

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Carbonara.png"))); // NOI18N
        jLabel100.setText("jLabel1");

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aglio e olio.png"))); // NOI18N
        jLabel101.setText("jLabel1");

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/penne pesto.png"))); // NOI18N
        jLabel102.setText("jLabel1");

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bolognese.png"))); // NOI18N
        jLabel103.setText("jLabel1");

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/blue mojito.png"))); // NOI18N
        jLabel104.setText("jLabel1");

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lemon mojito.png"))); // NOI18N
        jLabel105.setText("jLabel1");

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milkshake.png"))); // NOI18N
        jLabel106.setText("jLabel1");

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mineral water.png"))); // NOI18N
        jLabel107.setText("jLabel1");

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lemon tea.png"))); // NOI18N
        jLabel108.setText("jLabel1");

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/strawberry pancake.png"))); // NOI18N
        jLabel109.setText("jLabel1");

        jLabel110.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/matchapancake.png"))); // NOI18N
        jLabel110.setText("jLabel1");

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/choco yum.png"))); // NOI18N
        jLabel111.setText("jLabel1");

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/25 Ice Cream Photography Tips - Creative Ice Cream Photoshoot Ideas (1) (1).jpeg"))); // NOI18N
        jLabel112.setText("jLabel1");

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/blueberry froyo.png"))); // NOI18N
        jLabel113.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel34)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnmw, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(40, 40, 40)
                                            .addComponent(btntf, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel22)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnpao, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel16)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnlccb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel28)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnbm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 1, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel38)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnmp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnbfy, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel32)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                                .addComponent(btnilt, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnlm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                        .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel20)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnpp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jLabel41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel42)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btncyc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)))
                                        .addGap(7, 7, 7)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnsp, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnvg, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnmcc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnmct, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnms, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnsb, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel106, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addComponent(jLabel109, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(btnts, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnsc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel98, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel97, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(btnts)
                    .addComponent(btnms)
                    .addComponent(btntf)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel95, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(btnsc)
                                    .addComponent(jLabel12)
                                    .addComponent(btnmct))))
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlccb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel101, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(btnpao)
                            .addComponent(jLabel20)
                            .addComponent(btnpp)
                            .addComponent(jLabel18)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsb)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel104, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel23))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(btnmcc)
                            .addComponent(btnlm)
                            .addComponent(jLabel26)
                            .addComponent(btnbm)
                            .addComponent(jLabel28))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(btnmw)
                            .addComponent(jLabel32)
                            .addComponent(btnilt)
                            .addComponent(jLabel30)
                            .addComponent(btnsp))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel110, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jLabel43)
                    .addComponent(jLabel39))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(btnmp)
                    .addComponent(jLabel42)
                    .addComponent(btncyc)
                    .addComponent(jLabel40)
                    .addComponent(btnvg))
                .addGap(18, 18, 18)
                .addComponent(jLabel113, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(btnbfy))
                .addGap(53, 53, 53))
        );

        ScrollableMenu.setViewportView(jPanel1);

        jTabbedPane1.addTab("All", ScrollableMenu);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setText("Mushroom Soup");

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setText("Tuna Salad");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setText("Burger");

        jLabel51.setText("30000");

        jLabel53.setText("25000");

        jLabel54.setText("25000");

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel59.setText("Lime and Chili Chicken");

        jLabel60.setText("35000");

        jLabel67.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel67.setText("Truffle Fries");

        btntf1.setBackground(new java.awt.Color(153, 204, 255));
        btntf1.setText("Add");
        btntf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntf1ActionPerformed(evt);
            }
        });

        btnts1.setBackground(new java.awt.Color(153, 204, 255));
        btnts1.setText("Add");
        btnts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnts1ActionPerformed(evt);
            }
        });

        btnms1.setBackground(new java.awt.Color(153, 204, 255));
        btnms1.setText("Add");
        btnms1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnms1ActionPerformed(evt);
            }
        });

        btnlccb1.setBackground(new java.awt.Color(153, 204, 255));
        btnlccb1.setText("Add");
        btnlccb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlccb1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/salad.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Borgir.png"))); // NOI18N
        jLabel92.setText("jLabel1");

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/truffle.png"))); // NOI18N
        jLabel93.setText("jLabel1");

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Mushroom.png"))); // NOI18N
        jLabel94.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(80, 80, 80))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel53)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btntf1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel60)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnlccb1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addGap(78, 78, 78))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnms1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnts1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel53)
                            .addComponent(btntf1)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jLabel48))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel51)
                            .addComponent(jLabel54)
                            .addComponent(btnts1)
                            .addComponent(btnms1))))
                .addGap(24, 24, 24)
                .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel59))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel50)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(btnlccb1))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        jTabbedPane1.addTab("Snacks", jScrollPane1);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel55.setText("40000");

        jLabel56.setText("37000");

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel68.setText("Spaghetti Carbonara");

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel52.setText("Penne Pesto");

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel57.setText("Mac n Cheese with");

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel63.setText("Truffle");

        jLabel64.setText("42000");

        jLabel58.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel58.setText("Spaghetti Bolognese");

        jLabel61.setText("35000");

        btnsc1.setBackground(new java.awt.Color(153, 204, 255));
        btnsc1.setText("Add");
        btnsc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsc1ActionPerformed(evt);
            }
        });

        btnmct1.setBackground(new java.awt.Color(153, 204, 255));
        btnmct1.setText("Add");
        btnmct1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmct1ActionPerformed(evt);
            }
        });

        btnpp1.setBackground(new java.awt.Color(153, 204, 255));
        btnpp1.setText("Add");
        btnpp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpp1ActionPerformed(evt);
            }
        });

        btnsb1.setBackground(new java.awt.Color(153, 204, 255));
        btnsb1.setText("Add");
        btnsb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsb1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Carbonara.png"))); // NOI18N
        jLabel2.setText("jLabel1");

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mac and cheese.png"))); // NOI18N
        jLabel89.setText("jLabel1");

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/penne pesto.png"))); // NOI18N
        jLabel90.setText("jLabel1");

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/bolognese.png"))); // NOI18N
        jLabel91.setText("jLabel1");

        jLabel124.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/aglio e olio.png"))); // NOI18N
        jLabel124.setText("jLabel1");

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel62.setText("Penne Aglio e Olio");

        jLabel125.setText("35000");

        btnpao1.setBackground(new java.awt.Color(153, 204, 255));
        btnpao1.setText("Add");
        btnpao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpao1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnsc1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel55)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel61)
                                .addGap(40, 40, 40)
                                .addComponent(btnsb1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnmct1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel56)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnpp1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(180, 180, 180))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel125)
                                .addGap(36, 36, 36)
                                .addComponent(btnpao1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel68)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel55)
                            .addComponent(btnsc1))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel58)
                            .addComponent(jLabel62))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(btnsb1)
                            .addComponent(jLabel125)
                            .addComponent(btnpao1)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel90, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel56)
                                    .addComponent(btnmct1)
                                    .addComponent(btnpp1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel4);

        jTabbedPane1.addTab("Pasta", jScrollPane2);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jLabel66.setText("23000");

        jLabel69.setText("20000");

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel70.setText("Strawberry Pancake");

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel71.setText("Choco Yum Cake");

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel72.setText("Matcha Pancake");

        jLabel74.setText("22000");

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel75.setText("Vanilla Gelato");

        jLabel76.setText("20000");

        btnsp1.setBackground(new java.awt.Color(153, 204, 255));
        btnsp1.setText("Add");
        btnsp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsp1ActionPerformed(evt);
            }
        });

        btnmp1.setBackground(new java.awt.Color(153, 204, 255));
        btnmp1.setText("Add");
        btnmp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmp1ActionPerformed(evt);
            }
        });

        btncyc1.setBackground(new java.awt.Color(153, 204, 255));
        btncyc1.setText("Add");
        btncyc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncyc1ActionPerformed(evt);
            }
        });

        btnvg1.setBackground(new java.awt.Color(153, 204, 255));
        btnvg1.setText("Add");
        btnvg1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvg1ActionPerformed(evt);
            }
        });

        jLabel47.setText("25000");

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel73.setText("Blueberry Frozen");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setText("Yogurt");

        btnbfy1.setBackground(new java.awt.Color(153, 204, 255));
        btnbfy1.setText("Add");
        btnbfy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbfy1ActionPerformed(evt);
            }
        });

        jLabel114.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/strawberry pancake.png"))); // NOI18N
        jLabel114.setText("jLabel1");

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/matchapancake.png"))); // NOI18N
        jLabel115.setText("jLabel1");

        jLabel116.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/choco yum.png"))); // NOI18N
        jLabel116.setText("jLabel1");

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/25 Ice Cream Photography Tips - Creative Ice Cream Photoshoot Ideas (1) (1).jpeg"))); // NOI18N
        jLabel117.setText("jLabel1");

        jLabel118.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/blueberry froyo.png"))); // NOI18N
        jLabel118.setText("jLabel1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                    .addComponent(jLabel76)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnvg1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46))
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel66)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnsp1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnbfy1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jLabel73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(btnmp1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addComponent(jLabel69, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btncyc1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30))))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel70)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(btnsp1)
                            .addComponent(jLabel74)
                            .addComponent(btnmp1)
                            .addComponent(jLabel69)
                            .addComponent(btncyc1)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel116, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72))))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel73)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(btnbfy1)
                            .addComponent(btnvg1)
                            .addComponent(jLabel76))))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel7);

        jTabbedPane1.addTab("Dessert", jScrollPane3);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel8.setPreferredSize(new java.awt.Dimension(518, 450));

        jLabel78.setText("23000");

        jLabel79.setText("20000");

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel80.setText("Blue Mojito");

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel81.setText("Milkshake Cookies");

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel82.setText("Lemon Mojito");

        jLabel83.setText("22000");

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel84.setText("Mineral Water");

        jLabel85.setText("20000");

        btnbm1.setBackground(new java.awt.Color(153, 204, 255));
        btnbm1.setText("Add");
        btnbm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbm1ActionPerformed(evt);
            }
        });

        btnlm1.setBackground(new java.awt.Color(153, 204, 255));
        btnlm1.setText("Add");
        btnlm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlm1ActionPerformed(evt);
            }
        });

        btnmcc1.setBackground(new java.awt.Color(153, 204, 255));
        btnmcc1.setText("Add");
        btnmcc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmcc1ActionPerformed(evt);
            }
        });

        btnmw1.setBackground(new java.awt.Color(153, 204, 255));
        btnmw1.setText("Add");
        btnmw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmw1ActionPerformed(evt);
            }
        });

        jLabel86.setText("25000");

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel87.setText("Ice Lemon Tea");

        btnilt1.setBackground(new java.awt.Color(153, 204, 255));
        btnilt1.setText("Add");
        btnilt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnilt1ActionPerformed(evt);
            }
        });

        jLabel88.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel88.setText("and Cream");

        jLabel119.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/blue mojito.png"))); // NOI18N
        jLabel119.setText("jLabel1");

        jLabel120.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lemon mojito.png"))); // NOI18N
        jLabel120.setText("jLabel1");

        jLabel121.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/milkshake.png"))); // NOI18N
        jLabel121.setText("jLabel1");

        jLabel122.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/mineral water.png"))); // NOI18N
        jLabel122.setText("jLabel1");

        jLabel123.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/lemon tea.png"))); // NOI18N
        jLabel123.setText("jLabel1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addGap(40, 40, 40)
                        .addComponent(btnbm1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 290, Short.MAX_VALUE)
                        .addComponent(btnmcc1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnmw1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel84, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel123, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel87, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel86, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnilt1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel80, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel83)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnlm1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel121, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel79, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel88, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel85, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel119, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel80))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel121, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel81)
                            .addComponent(jLabel82))))
                .addComponent(jLabel88)
                .addGap(4, 4, 4)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel79)
                    .addComponent(btnmcc1)
                    .addComponent(btnlm1)
                    .addComponent(jLabel83)
                    .addComponent(btnbm1)
                    .addComponent(jLabel78))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel122, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel84)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(btnmw1)
                            .addComponent(jLabel86)
                            .addComponent(btnilt1)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jScrollPane4.setViewportView(jPanel8);

        jTabbedPane1.addTab("Beverages", jScrollPane4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(191, 191, 191))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Tab1");
    }// </editor-fold>//GEN-END:initComponents

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        int selectedRow = tablepesanan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin dihapus", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            String namaMenu = (String) model.getValueAt(selectedRow, 0);
            int quantity = (Integer) model.getValueAt(selectedRow, 1);
            String notes = (String) model.getValueAt(selectedRow, 2);
            int harga = (Integer) model.getValueAt(selectedRow, 3);
            int totalharga = (Integer) model.getValueAt(selectedRow, 4);
            try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
                String sqlDelete = "DELETE FROM menupage WHERE NamaMenu = ? AND Quantity = ? AND notes = ? AND HargaMenu = ? AND TotalHarga = ?";
                try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlDelete)) {
                    pst.setString(1, namaMenu);
                    pst.setInt(2, quantity);
                    pst.setString(3, notes);
                    pst.setInt(4, harga);
                    pst.setInt(5, totalharga);
                    int delete = pst.executeUpdate();
                    if (delete == 1) {
                        model.removeRow(selectedRow);
                        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                    } else {
                        JOptionPane.showMessageDialog(this, "Gagal menghapus data", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btntfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntfActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Truffle Fries";
        int quantity = 1;
        String notes = "";
        int harga = 25000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btntfActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        int selectedRow = tablepesanan.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin diubah", "Peringatan", JOptionPane.WARNING_MESSAGE);
        } else {
            String namaMenu = (String) model.getValueAt(selectedRow, 0);
            int currentQuantity = Integer.parseInt(model.getValueAt(selectedRow, 1).toString()); // Convert to Integer
            String notes = (String) model.getValueAt(selectedRow, 2);
            int harga = Integer.parseInt(model.getValueAt(selectedRow, 3).toString()); // Convert to Integer

            // Meminta input dari user untuk quantity baru
            String inputQuantity = JOptionPane.showInputDialog(this, "Masukkan quantity baru:", currentQuantity);
            String inputNotes = JOptionPane.showInputDialog(this, "Masukkan notes baru:", notes);
            if (inputQuantity != null && !inputQuantity.isEmpty() && inputNotes != null) {
                try {
                    int newQuantity = Integer.parseInt(inputQuantity);
                    int totalHarga = newQuantity * harga; // Hitung total harga baru

                    // Memperbarui data di JTable
                    model.setValueAt(newQuantity, selectedRow, 1); // Set as Integer
                    model.setValueAt(inputNotes, selectedRow, 2);
                    model.setValueAt(totalHarga, selectedRow, 4); // Set totalHarga

                    // Memperbarui data di database
                    try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
                        String sqlUpdate = "UPDATE menupage SET Quantity = ?, notes = ?, TotalHarga = ? WHERE NamaMenu = ?";
                        try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlUpdate)) {
                            pst.setInt(1, newQuantity);
                            pst.setString(2, inputNotes);
                            pst.setInt(3, totalHarga);
                            pst.setString(4, namaMenu);
                            int update = pst.executeUpdate();
                            if (update == 1) {
                                JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
                            } else {
                                JOptionPane.showMessageDialog(this, "Gagal memperbarui data", "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Masukkan angka yang valid", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btntsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntsActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Tuna Salad";
        int quantity = 1;
        String notes = "";
        int harga = 30000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btntsActionPerformed

    private void btnmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmsActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Mushroom Soup";
        int quantity = 1;
        String notes = "";
        int harga = 25000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmsActionPerformed

    private void btnlccbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlccbActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Lime and Chili Chicken Burger";
        int quantity = 1;
        String notes = "";
        int harga = 35000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnlccbActionPerformed

    private void btnscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Spaghetti Carbonara";
        int quantity = 1;
        String notes = "";
        int harga = 40000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnscActionPerformed

    private void btnmctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmctActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Mac n Cheese with Truffle";
        int quantity = 1;
        String notes = "";
        int harga = 42000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmctActionPerformed

    private void btnpaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpaoActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Penne Aglio e Olio";
        int quantity = 1;
        String notes = "";
        int harga = 35000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnpaoActionPerformed

    private void btnppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnppActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Penne Pesto";
        int quantity = 1;
        String notes = "";
        int harga = 37000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnppActionPerformed

    private void btnsbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsbActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Spaghetti Bolognese";
        int quantity = 1;
        String notes = "";
        int harga = 35000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnsbActionPerformed

    private void btnbmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbmActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Blue Mojito";
        int quantity = 1;
        String notes = "";
        int harga = 20000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnbmActionPerformed

    private void btnlmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlmActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Lemon Mojito";
        int quantity = 1;
        String notes = "";
        int harga = 22000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnlmActionPerformed

    private void btnmccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmccActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Milkshake Cookies and Cream";
        int quantity = 1;
        String notes = "";
        int harga = 22000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmccActionPerformed

    private void btnmwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmwActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Mineral Water";
        int quantity = 1;
        String notes = "";
        int harga = 10000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmwActionPerformed

    private void btniltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniltActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Ice Lemon Tea";
        int quantity = 1;
        String notes = "";
        int harga = 15000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btniltActionPerformed

    private void btnspActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Strawberry Pancake";
        int quantity = 1;
        String notes = "";
        int harga = 23000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnspActionPerformed

    private void btnmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmpActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Matcha Pancake";
        int quantity = 1;
        String notes = "";
        int harga = 22000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmpActionPerformed

    private void btncycActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncycActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Choco Yum Cake";
        int quantity = 1;
        String notes = "";
        int harga = 20000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btncycActionPerformed

    private void btnvgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvgActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Vanilla Gelato";
        int quantity = 1;
        String notes = "";
        int harga = 20000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnvgActionPerformed

    private void btnbfyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbfyActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Blueberry Frozen Yogurt";
        int quantity = 1;
        String notes = "";
        int harga = 25000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnbfyActionPerformed

    private void btntf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntf1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Truffle Fries";
        int quantity = 1;
        String notes = "";
        int harga = 25000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btntf1ActionPerformed

    private void btnts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnts1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Tuna Salad";
        int quantity = 1;
        String notes = "";
        int harga = 30000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnts1ActionPerformed

    private void btnms1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnms1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Mushroom Soup";
        int quantity = 1;
        String notes = "";
        int harga = 25000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnms1ActionPerformed

    private void btnlccb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlccb1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Lime and Chili Chicken Burger";
        int quantity = 1;
        String notes = "";
        int harga = 35000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnlccb1ActionPerformed

    private void btnsc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsc1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Spaghetti Carbonara";
        int quantity = 1;
        String notes = "";
        int harga = 40000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnsc1ActionPerformed

    private void btnmct1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmct1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Mac n Cheese with Truffle";
        int quantity = 1;
        String notes = "";
        int harga = 42000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmct1ActionPerformed

    private void btnpp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpp1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Penne Pesto";
        int quantity = 1;
        String notes = "";
        int harga = 37000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnpp1ActionPerformed

    private void btnsb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsb1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Spaghetti Bolognese";
        int quantity = 1;
        String notes = "";
        int harga = 35000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnsb1ActionPerformed

    private void btnsp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsp1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Strawberry Pancake";
        int quantity = 1;
        String notes = "";
        int harga = 23000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnsp1ActionPerformed

    private void btnmp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmp1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Matcha Pancake";
        int quantity = 1;
        String notes = "";
        int harga = 22000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmp1ActionPerformed

    private void btncyc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncyc1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Choco Yum Cake";
        int quantity = 1;
        String notes = "";
        int harga = 20000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btncyc1ActionPerformed

    private void btnvg1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvg1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Vanilla Gelato";
        int quantity = 1;
        String notes = "";
        int harga = 20000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnvg1ActionPerformed

    private void btnbfy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbfy1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Blueberry Frozen Yogurt";
        int quantity = 1;
        String notes = "";
        int harga = 25000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnbfy1ActionPerformed

    private void btnbm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbm1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Blue Mojito";
        int quantity = 1;
        String notes = "";
        int harga = 20000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnbm1ActionPerformed

    private void btnlm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlm1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Lemon Mojito";
        int quantity = 1;
        String notes = "";
        int harga = 22000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnlm1ActionPerformed

    private void btnmcc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmcc1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Milkshake Cookies and Cream";
        int quantity = 1;
        String notes = "";
        int harga = 22000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmcc1ActionPerformed

    private void btnmw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmw1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Mineral Water";
        int quantity = 1;
        String notes = "";
        int harga = 10000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnmw1ActionPerformed

    private void btnilt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnilt1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Ice Lemon Tea";
        int quantity = 1;
        String notes = "";
        int harga = 15000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnilt1ActionPerformed

    private void btnfinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinishActionPerformed
        // Menampilkan pesan
        JOptionPane.showMessageDialog(this, "Silahkan lanjutkan pembayaran di kasir");
        this.setVisible(false);
    }//GEN-LAST:event_btnfinishActionPerformed

    private void btnpao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpao1ActionPerformed
        // Mengambil DefaultTableModel dari JTable yang ada
        DefaultTableModel model = (DefaultTableModel) tablepesanan.getModel();
        String namaMenu = "Penne Aglio e Olio";
        int quantity = 1;
        String notes = "";
        int harga = 35000;
        int totalharga = harga * quantity;

        try (Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/OdeBistro?useSSL=false", "root", "")) {
            // Menambahkan data ke tabel detilpemesanan
            String sqlInsert = "INSERT INTO menupage(NamaMenu, Quantity, notes, HargaMenu, TotalHarga) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement pst = (PreparedStatement) con.prepareStatement(sqlInsert)) {
                pst.setString(1, namaMenu);
                pst.setInt(2, quantity);
                pst.setString(3, notes);
                pst.setInt(4, harga);
                pst.setInt(5, totalharga);
                int insert = pst.executeUpdate();
                if (insert == 1) {
                    JOptionPane.showMessageDialog(this, "Data tersimpan");
                }
            }

            // Menampilkan data ke JTable
            model.addRow(new Object[]{namaMenu, quantity, notes, harga, totalharga});

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Terjadi kesalahan: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Menetapkan model tabel yang diperbarui ke JTable
        tablepesanan.setModel(model);
    }//GEN-LAST:event_btnpao1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollableMenu;
    private javax.swing.JButton btnbfy;
    private javax.swing.JButton btnbfy1;
    private javax.swing.JButton btnbm;
    private javax.swing.JButton btnbm1;
    private javax.swing.JButton btncyc;
    private javax.swing.JButton btncyc1;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnfinish;
    private javax.swing.JButton btnilt;
    private javax.swing.JButton btnilt1;
    private javax.swing.JButton btnlccb;
    private javax.swing.JButton btnlccb1;
    private javax.swing.JButton btnlm;
    private javax.swing.JButton btnlm1;
    private javax.swing.JButton btnmcc;
    private javax.swing.JButton btnmcc1;
    private javax.swing.JButton btnmct;
    private javax.swing.JButton btnmct1;
    private javax.swing.JButton btnmp;
    private javax.swing.JButton btnmp1;
    private javax.swing.JButton btnms;
    private javax.swing.JButton btnms1;
    private javax.swing.JButton btnmw;
    private javax.swing.JButton btnmw1;
    private javax.swing.JButton btnpao;
    private javax.swing.JButton btnpao1;
    private javax.swing.JButton btnpp;
    private javax.swing.JButton btnpp1;
    private javax.swing.JButton btnsb;
    private javax.swing.JButton btnsb1;
    private javax.swing.JButton btnsc;
    private javax.swing.JButton btnsc1;
    private javax.swing.JButton btnsp;
    private javax.swing.JButton btnsp1;
    private javax.swing.JButton btntf;
    private javax.swing.JButton btntf1;
    private javax.swing.JButton btnts;
    private javax.swing.JButton btnts1;
    private javax.swing.JButton btnvg;
    private javax.swing.JButton btnvg1;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablepesanan;
    // End of variables declaration//GEN-END:variables
}
