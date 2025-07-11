/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin.Pegawai;

import Admin.DashboardAdmin;
import Utill.DBConnection;
import Utill.MessageDialog;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nirleka
 */
public class KelolaPegawai extends javax.swing.JFrame {

    /**
     * Creates new form kelola_pegawai
     */
    private String ID_Pegawai = "";
    
    public KelolaPegawai() {
        initComponents();
        tampilkanDataKeTabel();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        inputNama = new java.awt.TextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnPerbarui = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        inputGender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        inputAlamat = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        inputTelepon = new java.awt.TextField();
        jLabel4 = new javax.swing.JLabel();
        inputJabatan = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();
        inputTanggal = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        pemilihTanggal = new datechooser.beans.DateChooserPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nama", "Gender", "Alamat", "Telepon", "Jabatan", "Tanggal Gabung"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        btnKembali.setText("Kembali ke Dashboard");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama");

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnPerbarui.setText("Perbarui");
        btnPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPerbarui, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inputGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-Laki", "Perempuan" }));
        inputGender.setSelectedIndex(-1);

        jLabel2.setText("Gender");

        jLabel3.setText("Alamat");

        jLabel4.setText("Telepon");

        jLabel5.setText("Jabatan");

        jLabel6.setText("Tanggal Gabung");

        pemilihTanggal.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                pemilihTanggalOnSelectionChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(inputJabatan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTelepon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputAlamat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputGender, javax.swing.GroupLayout.Alignment.LEADING, 0, 268, Short.MAX_VALUE)
                            .addComponent(inputNama, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pemilihTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
                .addGap(8, 8, 8))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(inputNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputAlamat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(inputTelepon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(inputJabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(inputTanggal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(pemilihTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnKembali)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(75, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void pemilihTanggalOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_pemilihTanggalOnSelectionChange
        java.sql.Date tanggal = new java.sql.Date(pemilihTanggal.getSelectedDate().getTimeInMillis());
        inputTanggal.setText(String.valueOf(tanggal));
    }//GEN-LAST:event_pemilihTanggalOnSelectionChange

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        String nama = inputNama.getText();
        String gender = inputGender.getSelectedItem().toString();
        String alamat = inputAlamat.getText();
        String telepon = inputTelepon.getText();
        String jabatan = inputJabatan.getText();
        String tanggalGabung = inputTanggal.getText();
        
        if (nama.isEmpty() ||
            gender.isEmpty() ||
            alamat.isEmpty() ||
            telepon.isEmpty() ||
            jabatan.isEmpty() ||
            tanggalGabung.isEmpty())
        {
            MessageDialog.showUserErrorMessage("Semua field harus diisi!");
            return;
        }
        
        String query = "INSERT INTO pegawai (Nama, Gender, Alamat, Telepon, Jabatan, Tanggal_Gabung) VALUES"
                        + "(?, ?, ?, ?, ?, ?)";
        Object[] parameters = {nama, gender, alamat, telepon, jabatan, tanggalGabung};
        int result = DBConnection.updateData(query, parameters);
        
        if (result < 1)
        {
            return;
        }else 
        {
            MessageDialog.showSuccessMessage("Data berhasil ditambah, data yang ditambah: " + result);            
        }
        
        tampilkanDataKeTabel();
        inputNama.setText("");
        inputGender.setSelectedIndex(-1);
        inputAlamat.setText("");
        inputTelepon.setText("");
        inputJabatan.setText("");
        inputTanggal.setText("");
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        
        int selectedRow = tabel.getSelectedRow();
        this.ID_Pegawai = String.valueOf(tabel.getValueAt(selectedRow, 0));
        
        String query ="SELECT * FROM pegawai WHERE ID_Pegawai = ?";
        Object[] parameters = {ID_Pegawai};
        ResultSet result = DBConnection.getData(query, parameters);
        
        try
        {
            if (result.next())
            {
                inputNama.setText(result.getString("Nama"));
                inputGender.setSelectedItem(result.getString("Gender"));;
                inputAlamat.setText(result.getString("Alamat"));
                inputTelepon.setText(result.getString("Telepon"));
                inputJabatan.setText(result.getString("Jabatan"));
                inputTanggal.setText(result.getString("Tanggal_Gabung"));
            }
        }catch (SQLException e)
        {
            MessageDialog.showProgramErrorMessage(e.getMessage());
        }
        
    }//GEN-LAST:event_tabelMouseClicked

    private void btnPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiActionPerformed
        String nama = inputNama.getText();
        String gender = inputGender.getSelectedItem().toString();;
        String alamat = inputAlamat.getText();
        String telepon = inputTelepon.getText();
        String jabatan = inputJabatan.getText();
        String tanggalGabung = inputTanggal.getText();
        
        if (nama.isEmpty() ||
            gender.isEmpty() ||
            alamat.isEmpty() ||
            telepon.isEmpty() ||
            jabatan.isEmpty() ||
            tanggalGabung.isEmpty())
        {
            MessageDialog.showUserErrorMessage("Semua field harus diisi!");
            return;
        } else if (this.ID_Pegawai.isEmpty())
        {
            MessageDialog.showUserErrorMessage("Silahkan pilih baris pada tabel terlebih dahulu");
        }
        
        String query = "UPDATE pegawai SET Nama = ?, Gender = ? , Alamat = ?, Telepon = ?, Jabatan = ?, Tanggal_Gabung = ? WHERE ID_Pegawai = ?";
        Object[] parameters = {nama, gender, alamat, telepon, jabatan, tanggalGabung, this.ID_Pegawai};
        int result = DBConnection.updateData(query, parameters);
        
        if (result < 1)
        {
            return;
        }else 
        {
            MessageDialog.showSuccessMessage("Data berhasil diperbarui, data yang diperbarui: " + result);            
        }
        
        tabel.clearSelection();
        this.ID_Pegawai = "";
        tampilkanDataKeTabel();
        inputNama.setText("");
        inputGender.setSelectedIndex(-1);
        inputAlamat.setText("");
        inputTelepon.setText("");
        inputJabatan.setText("");
        inputTanggal.setText("");
    }//GEN-LAST:event_btnPerbaruiActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if (MessageDialog.showConfirmDialog("Apakah anda yakin ingin menghapus data dengan ID: " + this.ID_Pegawai + " ?"))
        {
            String query = "DELETE FROM pegawai WHERE ID_Pegawai = ?";
            int result = DBConnection.updateData(query, new Object[] {this.ID_Pegawai});
            
            if (result >= 1)
            {
                MessageDialog.showSuccessMessage("Data berhasil dihapus, banyaknya data yang dihapus: " + result);
            }
            
            tabel.clearSelection();
            this.ID_Pegawai = "";
            tampilkanDataKeTabel();
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        new DashboardAdmin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void tampilkanDataKeTabel()
    {
        try
        {
            String query = "SELECT * FROM pegawai";
            ResultSet result = DBConnection.getData(query);

            DefaultTableModel model = (DefaultTableModel) tabel.getModel();
            model.setRowCount(0);

            while (result.next())
            {
                model.addRow(new Object[] {
                    result.getString("ID_Pegawai"),
                    result.getString("Nama"),
                    result.getString("Gender"),
                    result.getString("Alamat"),
                    result.getString("Telepon"),
                    result.getString("Jabatan"),
                    result.getString("Tanggal_Gabung")
                });
            }
        } catch (SQLException e)
        {
            MessageDialog.showProgramErrorMessage(e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(KelolaPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KelolaPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KelolaPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KelolaPegawai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KelolaPegawai().setVisible(true);
               ;
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPerbarui;
    private javax.swing.JButton btnSimpan;
    private java.awt.TextField inputAlamat;
    private javax.swing.JComboBox<String> inputGender;
    private java.awt.TextField inputJabatan;
    private java.awt.TextField inputNama;
    private java.awt.TextField inputTanggal;
    private java.awt.TextField inputTelepon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private datechooser.beans.DateChooserPanel pemilihTanggal;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
