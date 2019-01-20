/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManganRek;

import java.sql.*;
import javax.swing.JOptionPane;
import ManganRek.koneksi;
import java.awt.List;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import java.util.Date;

/**
 *
 * @author denny
 */
public class detailpesananadmin extends javax.swing.JFrame {

    private Connection conn = new koneksi().connect();
    private DefaultTableModel tabmode;
    login log = new login();

    String getadmin = log.getuser.toString();

    protected void aktif() {
        System.out.println("Coba" + getadmin);
        getusertxt.setText("Selamat Datang " + getadmin);
    }

    protected void kosong() {

    }

    protected void datatable() {
        Object[] Baris = {"ID PEMBELI", "ID MAKANAN", "USERNAME", "JUMLAH", "JUMLAH HARGA", "TANGGAL", "HASIL", "ALAMAT"};
        tabmode = new DefaultTableModel(null, Baris);
        tblstokbarang.setModel(tabmode);
        String sql = "SELECT p.ID_PEMBELI, p.ID_MAKANAN, p.USERNAME, p.JUMLAH, p.JUMLAHHARGA, p.TANGGAL, p.HASIL, l.ALAMAT "
                + "FROM pembeli AS p INNER JOIN login AS l ON p.USERNAME = l.USERNAME ORDER BY p.ID_PEMBELI";
        try {
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()) {
                String id_pmbl = hasil.getString("id_pembeli");
                String id_mkn = hasil.getString("id_makanan");
                String user = hasil.getString("username");
                String jml = hasil.getString("jumlah");
                String tot = hasil.getString("jumlahharga");
                String tgl = hasil.getString("tanggal");
                String hsl = hasil.getString("hasil");
                String alamat = hasil.getString("alamat");
                String[] data = {id_pmbl, id_mkn, user, jml, tot, tgl, hsl, alamat};
                tabmode.addRow(data);
                System.out.println(data);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public detailpesananadmin(String para) {
        initComponents();
        aktif();
        usertxt.setText(para);
        datatable();
    }

    public detailpesananadmin() {
        initComponents();
        aktif();
        datatable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idpembelitxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblstokbarang = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cancel = new javax.swing.JToggleButton();
        btnExit = new javax.swing.JToggleButton();
        getusertxt = new javax.swing.JLabel();
        usertxt = new javax.swing.JLabel();
        idmkn = new javax.swing.JLabel();
        jmltxt = new javax.swing.JLabel();
        totaltxt = new javax.swing.JLabel();
        tanggaltxt = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idpembelitxt.setText("id_pembeli");

        tblstokbarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No", "Nama", "Alamat", "Title 4"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblstokbarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblstokbarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblstokbarang);

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel4.setText("DATA MENU ");

        cancel.setText("Kembali");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        btnExit.setText("X");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        getusertxt.setText("Selamat Datang ");

        usertxt.setText("user");

        idmkn.setText("id_makanan");

        jmltxt.setText("jumlah");

        totaltxt.setText("total");

        tanggaltxt.setText("tanggal");

        jLabel7.setText("pcs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addComponent(getusertxt)
                .addGap(39, 39, 39)
                .addComponent(usertxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(idpembelitxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idmkn)
                        .addGap(45, 45, 45)
                        .addComponent(jmltxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addGap(75, 75, 75)
                        .addComponent(totaltxt)
                        .addGap(77, 77, 77)
                        .addComponent(tanggaltxt)
                        .addGap(179, 179, 179)
                        .addComponent(cancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnExit)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(getusertxt)
                        .addComponent(usertxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idpembelitxt)
                    .addComponent(cancel)
                    .addComponent(idmkn)
                    .addComponent(jmltxt)
                    .addComponent(totaltxt)
                    .addComponent(tanggaltxt)
                    .addComponent(jLabel7))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        this.dispose();
        stok_barang pms = new stok_barang(usertxt.getText());
        pms.setVisible(true);
    }//GEN-LAST:event_cancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        int selectedOption = JOptionPane.showConfirmDialog(null,
                "Apakah anda akan menutup system?", "Tutup Aplikasi", JOptionPane.YES_NO_OPTION);
        if (selectedOption == JOptionPane.YES_OPTION) {
            this.dispose();
            login log = new login();
            log.setVisible(true);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void tblstokbarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblstokbarangMouseClicked
        int bar = tblstokbarang.getSelectedRow();
        String id_pbl = tabmode.getValueAt(bar, 0).toString();
        String id_mkn = tabmode.getValueAt(bar, 1).toString();
        String jml = tabmode.getValueAt(bar, 3).toString();
        String total = tabmode.getValueAt(bar, 4).toString();
        String tgl = tabmode.getValueAt(bar, 5).toString();

        idpembelitxt.setText(id_pbl);
        idmkn.setText(id_mkn);
        jmltxt.setText(jml);
        totaltxt.setText(total);
        tanggaltxt.setText(tgl);
    }//GEN-LAST:event_tblstokbarangMouseClicked

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
            java.util.logging.Logger.getLogger(detailpesananadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailpesananadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailpesananadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailpesananadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new detailpesananadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnExit;
    private javax.swing.JToggleButton cancel;
    private javax.swing.JLabel getusertxt;
    private javax.swing.JLabel idmkn;
    private javax.swing.JLabel idpembelitxt;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jmltxt;
    private javax.swing.JLabel tanggaltxt;
    private javax.swing.JTable tblstokbarang;
    private javax.swing.JLabel totaltxt;
    private javax.swing.JLabel usertxt;
    // End of variables declaration//GEN-END:variables
}