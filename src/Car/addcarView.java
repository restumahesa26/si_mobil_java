package Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AL-HACK3R
 */
import Connection.koneksilogin;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class addcarView extends javax.swing.JFrame {
    Connection con;
    Statement stm;
    ResultSet rs;
    DefaultTableModel tabModel;
    /**
     * Creates new form addcarView
     */
    public addcarView() {
        initComponents();
        setTitle("Form Tambah Mobil");
        tampil_data();
        editBtn.setVisible(false);
        deleteBtn.setVisible(false);
    }
    
    private void clear() {
        merkField.setText("");
        typeField.setText("");
        yearCmb.setSelectedIndex(0);
        noField.setText("");
        priceField.setText("");
        statusCmb.setSelectedIndex(0);
        editBtn.setVisible(false);
        deleteBtn.setVisible(false);
    }
    
    private void tampil_data() {
        Object baris[] = {"Id", "Merek Mobil", "Tipe Mobil", "Tahun Produksi", "No. Polisi", "Harga Sewa", "Status"};
        tabModel = new DefaultTableModel(null, baris);
        table.setModel(tabModel);
        try {
            con = new koneksilogin().ConnectDB();
            String select = "select * from addcar order by merek ASC";
            stm = con.createStatement();
            rs = stm.executeQuery(select);
            while(rs.next()) {
                String id = rs.getString("id");
                String merek = rs.getString("merek");
                String type = rs.getString("type");
                String tahun = rs.getString("tahun");
                String nopol = rs.getString("nopol");
                String harga = rs.getString("harga");
                String status = rs.getString("status");
                String[] data = {id, merek, type, tahun, nopol, harga, status};
                tabModel.addRow(data);
            }
        }catch(SQLException e) {
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        merkField = new javax.swing.JTextField();
        typeField = new javax.swing.JTextField();
        yearCmb = new javax.swing.JComboBox();
        noField = new javax.swing.JTextField();
        priceField = new javax.swing.JTextField();
        statusCmb = new javax.swing.JComboBox();
        tambahBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        clearBtn = new javax.swing.JButton();
        refreshBtn = new javax.swing.JButton();
        closeBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1366, 768));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/edit.png"))); // NOI18N
        editBtn.setText(" EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        getContentPane().add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 170, -1));

        deleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/bin.png"))); // NOI18N
        deleteBtn.setText(" DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(deleteBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 40, 64));
        jLabel1.setText("FORM TAMBAH MOBIL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Merek Mobil");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Tipe Mobil");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setText("Tahun Produksi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("No. Polisi");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Harga Sewa/Hari");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Status");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, -1));

        merkField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(merkField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 280, -1));

        typeField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(typeField, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 280, -1));

        yearCmb.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        yearCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pilih Tahun", "2015", "2016", "2017", "2018", "2019", "2020" }));
        getContentPane().add(yearCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 280, -1));

        noField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(noField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 280, -1));

        priceField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        getContentPane().add(priceField, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 280, -1));

        statusCmb.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        statusCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tersedia", "Tidak Tersedia" }));
        getContentPane().add(statusCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, 280, -1));

        tambahBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        tambahBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/plus.png"))); // NOI18N
        tambahBtn.setText(" ADD");
        tambahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBtnActionPerformed(evt);
            }
        });
        getContentPane().add(tambahBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 170, -1));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 1260, 230));

        clearBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh.png"))); // NOI18N
        clearBtn.setText(" CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        refreshBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/refresh (1).png"))); // NOI18N
        refreshBtn.setText(" REFRESH");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        getContentPane().add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        closeBtn.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit.png"))); // NOI18N
        closeBtn.setText(" CLOSE");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 390, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/TAMBAH MOBIL.png"))); // NOI18N
        jLabel8.setText("kk");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBtnActionPerformed
        try {
            String merek = merkField.getText();
            String type = typeField.getText();
            int tahun = Integer.parseInt(yearCmb.getSelectedItem().toString());
            String nopol = noField.getText();
            long harga = Long.parseLong(priceField.getText());
            String check = statusCmb.getSelectedItem().toString();
            if(merek.equals("")) {
                JOptionPane.showMessageDialog(null, "Form Merek Belum Diisi");
            }
            if(type.equals("")) {
                JOptionPane.showMessageDialog(null, "Form Tipe Belum Diisi");
            }
            if(nopol.equals("")) {
                JOptionPane.showMessageDialog(null, "Form No.Polisi Belum Diisi");
            }
            if(harga < 0) {
                JOptionPane.showMessageDialog(null, "Form Harga Belum Diisi Dengan Benar");
            }
            if(!nopol.equals("") && !type.equals("") && !merek.equals("") && (harga<0 == false)) {
                con = new koneksilogin().ConnectDB();
                String addCar = "INSERT INTO addcar VALUES (null, '"+merek+"','"+type+"','"+tahun+"','"+nopol+"','"+harga+"','"+check+"')";
                stm = con.createStatement();
                stm.executeUpdate(addCar);
                JOptionPane.showMessageDialog(null, "Berhasil Menambah Data");
                tampil_data();
                clear();
            }     
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal Menambah Data");
        }

    }//GEN-LAST:event_tambahBtnActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        editBtn.setVisible(true);
        deleteBtn.setVisible(true);
        int sel = table.getSelectedRow();
        String id = tabModel.getValueAt(sel, 0).toString();
        int ID = Integer.parseInt(id);
        try {
            String click = "select * from addcar where id = '" +ID+ "'";
            rs = stm.executeQuery(click);
            while(rs.next()) {
                String merek = rs.getString("merek");
                String type = rs.getString("type");
                String tahun = rs.getString("tahun");
                String nopol = rs.getString("nopol");
                String harga = rs.getString("harga");
                String check = rs.getString("status");
                
                merkField.setText(merek);
                typeField.setText(type);
                yearCmb.setSelectedItem(tahun);
                noField.setText(nopol);
                priceField.setText(harga);
                statusCmb.setSelectedItem(check);
            }
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }//GEN-LAST:event_tableMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            String merek = merkField.getText();
            String type = typeField.getText();
            int tahun = Integer.parseInt(yearCmb.getSelectedItem().toString());
            String nopol = noField.getText();
            long harga = Long.parseLong(priceField.getText());
            String check = statusCmb.getSelectedItem().toString();
            int sel = table.getSelectedRow();
            String id = tabModel.getValueAt(sel, 0).toString();
            int ID = Integer.parseInt(id);
            if(merek.equals("")) {
                JOptionPane.showMessageDialog(null, "Form Merek Belum Diisi");
            }
            if(type.equals("")) {
                JOptionPane.showMessageDialog(null, "Form Tipe Belum Diisi");
            }
            if(nopol.equals("")) {
                JOptionPane.showMessageDialog(null, "Form No.Polisi Belum Diisi");
            }
            if(harga < 0) {
                JOptionPane.showMessageDialog(null, "Form Harga Belum Diisi Dengan Benar");
            }
            if(!nopol.equals("") && !type.equals("") && !merek.equals("") && (harga<0 == false)) {
                con = new koneksilogin().ConnectDB();
                String editCar = "update addcar set merek = '"+merek+"', type = '"+type+"', tahun = '"+tahun+"', nopol = '"+nopol+"', harga = '"+harga+"', status = '"+check+"' where id = '"+ID+"'";
                stm = con.createStatement();
                stm.executeUpdate(editCar);
                JOptionPane.showMessageDialog(null, "Berhasil Mengubah Data");
                tampil_data();
                clear();
            }                  
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Gagal Mengubah Data");
        }
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int sel = table.getSelectedRow();
        String id = tabModel.getValueAt(sel, 0).toString();
        int ID = Integer.parseInt(id);        
        int doHapus = JOptionPane.showConfirmDialog(table, (Object) "Yakin Ingin Menghapus Data Ini?", "Hapus Data", 0);

        if (doHapus == 0) {
            try {
                con = new koneksilogin().ConnectDB();
                String deleteCar = "delete from addcar WHERE id = '" + ID + "'";
                stm = con.createStatement();
                stm.executeUpdate(deleteCar);
                JOptionPane.showMessageDialog(null, "Berhasil Menghapus Menu");
                tampil_data();
                clear();
            }catch (SQLException e) {
                
            }
        }
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        this.dispose();
        new addcarView().setVisible(true);
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

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
            java.util.logging.Logger.getLogger(addcarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addcarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addcarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addcarView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addcarView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton closeBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField merkField;
    private javax.swing.JTextField noField;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JComboBox statusCmb;
    private javax.swing.JTable table;
    private javax.swing.JButton tambahBtn;
    private javax.swing.JTextField typeField;
    private javax.swing.JComboBox yearCmb;
    // End of variables declaration//GEN-END:variables
}
