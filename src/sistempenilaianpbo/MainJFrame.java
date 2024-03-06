/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistempenilaianpbo;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author BoedNoNiwa
 */
public class MainJFrame extends javax.swing.JFrame {
    String nama, nik;
    int mapel1,mapel2,mapel3,lulus;

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTabbedPanel = new javax.swing.JTabbedPane();
        panelPenilaian = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        LabelNoInduk = new javax.swing.JLabel();
        FieldNoInduk = new javax.swing.JTextField();
        LabelNama = new javax.swing.JLabel();
        FieldNama = new javax.swing.JTextField();
        LabelMapel1 = new javax.swing.JLabel();
        FieldMapel1 = new javax.swing.JTextField();
        LabelMapel2 = new javax.swing.JLabel();
        FieldMapel2 = new javax.swing.JTextField();
        LabelMapel3 = new javax.swing.JLabel();
        FieldMapel3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        panelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(820, 460));
        setSize(new java.awt.Dimension(800, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jButton1.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jButton1.setText("Penilaian");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jButton2.setText("Tabel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 400));

        jLabel1.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEM PENILAIAN SISWA");

        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Masukkan angka 1-100 untuk field dibawah mapel");

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        LabelNoInduk.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        LabelNoInduk.setForeground(new java.awt.Color(0, 0, 0));
        LabelNoInduk.setText("No. Induk");

        FieldNoInduk.setBackground(new java.awt.Color(204, 204, 204));
        FieldNoInduk.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        FieldNoInduk.setForeground(new java.awt.Color(0, 0, 0));
        FieldNoInduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNoIndukActionPerformed(evt);
            }
        });

        LabelNama.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        LabelNama.setForeground(new java.awt.Color(0, 0, 0));
        LabelNama.setText("Nama Siswa");

        FieldNama.setBackground(new java.awt.Color(204, 204, 204));
        FieldNama.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        FieldNama.setForeground(new java.awt.Color(0, 0, 0));
        FieldNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldNamaActionPerformed(evt);
            }
        });

        LabelMapel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        LabelMapel1.setForeground(new java.awt.Color(0, 0, 0));
        LabelMapel1.setText("Pemrograman Dasar");

        FieldMapel1.setBackground(new java.awt.Color(204, 204, 204));
        FieldMapel1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        FieldMapel1.setForeground(new java.awt.Color(0, 0, 0));
        FieldMapel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldMapel1ActionPerformed(evt);
            }
        });

        LabelMapel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        LabelMapel2.setForeground(new java.awt.Color(0, 0, 0));
        LabelMapel2.setText("Basis Data");

        FieldMapel2.setBackground(new java.awt.Color(204, 204, 204));
        FieldMapel2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        FieldMapel2.setForeground(new java.awt.Color(0, 0, 0));
        FieldMapel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldMapel2ActionPerformed(evt);
            }
        });

        LabelMapel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 18)); // NOI18N
        LabelMapel3.setForeground(new java.awt.Color(0, 0, 0));
        LabelMapel3.setText("Pemrograman Web");

        FieldMapel3.setBackground(new java.awt.Color(204, 204, 204));
        FieldMapel3.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        FieldMapel3.setForeground(new java.awt.Color(0, 0, 0));
        FieldMapel3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldMapel3ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Montserrat Black", 0, 15)); // NOI18N
        jButton3.setText("SIMPAN");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(FieldNoInduk, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                        .addComponent(FieldNama, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LabelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LabelNoInduk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(85, 85, 85)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FieldMapel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LabelMapel2)
                        .addComponent(LabelMapel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FieldMapel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FieldMapel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelMapel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(62, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(LabelMapel1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FieldMapel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNoInduk)
                    .addComponent(LabelMapel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(FieldNoInduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FieldMapel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelMapel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FieldMapel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelPenilaianLayout = new javax.swing.GroupLayout(panelPenilaian);
        panelPenilaian.setLayout(panelPenilaianLayout);
        panelPenilaianLayout.setHorizontalGroup(
            panelPenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPenilaianLayout.createSequentialGroup()
                .addGroup(panelPenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPenilaianLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPenilaianLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel1))
                    .addGroup(panelPenilaianLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel3)))
                .addContainerGap(223, Short.MAX_VALUE))
        );
        panelPenilaianLayout.setVerticalGroup(
            panelPenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPenilaianLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jTabbedPanel.addTab("tab1", panelPenilaian);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No. Induk", "Nama", "PemDas", "Basis Data", "PemWeb"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelTableLayout = new javax.swing.GroupLayout(panelTable);
        panelTable.setLayout(panelTableLayout);
        panelTableLayout.setHorizontalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTableLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addGap(229, 229, 229))
        );
        panelTableLayout.setVerticalGroup(
            panelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTableLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPanel.addTab("tab2", panelTable);

        getContentPane().add(jTabbedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, -40, -1, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTabbedPanel.setSelectedIndex(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FieldNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNamaActionPerformed

    private void FieldNoIndukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldNoIndukActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldNoIndukActionPerformed

    private void FieldMapel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldMapel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMapel1ActionPerformed

    private void FieldMapel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldMapel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMapel2ActionPerformed

    private void FieldMapel3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldMapel3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldMapel3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            String username = "root";
            String password = "";
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/penilaian", username, password);
            Statement stmt = koneksi.createStatement();
            
            nama = FieldNama.getText();
            nik =  FieldNoInduk.getText();
            mapel1 = Integer.parseInt(FieldMapel1.getText());
            mapel2 = Integer.parseInt(FieldMapel2.getText());
            mapel3 = Integer.parseInt(FieldMapel3.getText());
            
            
            if (mapel1 < 80 && mapel2 < 80) {
                lulus = 1;
            } else if (mapel1 < 80 && mapel3 < 80) {
                lulus = 1;
            } else if (mapel2 < 80 && mapel3 < 80) {
                lulus = 1;
            };
        
            
            String sql = "INSERT INTO `siswa` (`no_induk`, `nama`, `mapel1`, `mapel2`, `mapel3`, `lulus`) VALUES ("
                + nik + ", '" + nama + "', " + mapel1 + ", " + mapel2 + ", " + mapel3 + ", " + lulus + ")";
            
            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Statement created successfully!");

            
        }catch(SQLException | InstantiationException | IllegalAccessException | ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error creating statement: " + e.getMessage());
        };
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPanel.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField FieldMapel1;
    public static javax.swing.JTextField FieldMapel2;
    public static javax.swing.JTextField FieldMapel3;
    public static javax.swing.JTextField FieldNama;
    public static javax.swing.JTextField FieldNoInduk;
    private javax.swing.JLabel LabelMapel1;
    private javax.swing.JLabel LabelMapel2;
    private javax.swing.JLabel LabelMapel3;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelNoInduk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPanel;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelPenilaian;
    private javax.swing.JPanel panelTable;
    // End of variables declaration//GEN-END:variables
}