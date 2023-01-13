/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package satria_26122022.view;

import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import satria_26122022.controller.PengembalianController;

/**
 *
 * @author satri
 */
public class FormPengembalian extends javax.swing.JFrame {

    /** Creates new form FormPengembalian */
    PengembalianController Controller;
    public FormPengembalian() {
        initComponents();
        Controller = new PengembalianController(this);
        Controller.bersihForm();
        Controller.setCboNobp();
        Controller.setCboKodeBuku();
        Controller.setCboKembali();
        Controller.tampilData();
        
    }
    public JTable getTablePengembalian() {
        return TablePengembalian;
    }

    public JComboBox<String> getCboKodeBuku() {
        return cboKodeBuku;
    }

    public JComboBox<String> getCboNobp() {
        return cboNobp;
    }

    public JComboBox<String> getCboTanggalKembali() {
        return cboTanggalKembali;
    }

    public JTextField getTxtTanggalPengembalian() {
        return txtTanggalPengembalian;
    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboNobp = new javax.swing.JComboBox<>();
        cboKodeBuku = new javax.swing.JComboBox<>();
        cboTanggalKembali = new javax.swing.JComboBox<>();
        txtTanggalPengembalian = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablePengembalian = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("No BP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 40, 60, 30);

        jLabel2.setText("Kode Buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 77, 60, 30);

        jLabel3.setText("Tanggal Kembali");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 120, 130, 30);

        jLabel4.setText("Tanggal Pengembalian");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 160, 130, 40);

        cboNobp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboNobp);
        cboNobp.setBounds(160, 40, 330, 20);

        cboKodeBuku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboKodeBuku);
        cboKodeBuku.setBounds(160, 80, 330, 20);

        cboTanggalKembali.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cboTanggalKembali);
        cboTanggalKembali.setBounds(160, 120, 330, 20);

        txtTanggalPengembalian.setText("jTextField1");
        getContentPane().add(txtTanggalPengembalian);
        txtTanggalPengembalian.setBounds(160, 160, 330, 30);

        btnInsert.setText("INSERT");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(30, 230, 69, 23);

        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(160, 230, 71, 23);

        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(310, 230, 69, 23);

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(440, 230, 71, 23);

        TablePengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No BP", "Kode Buku", "Tanggal Peminjaman", "Tanggal Pengembalian"
            }
        ));
        jScrollPane1.setViewportView(TablePengembalian);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 300, 452, 100);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
       Controller.save();
       Controller.tampilData();
       Controller.bersihForm();    
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        Controller.update();
        Controller.tampilData();
        Controller.bersihForm();      
// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
     Controller.delete();
     Controller.tampilData();
     Controller.bersihForm();
     
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
     Controller.bersihForm();
        
// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPengembalian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablePengembalian;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboKodeBuku;
    private javax.swing.JComboBox<String> cboNobp;
    private javax.swing.JComboBox<String> cboTanggalKembali;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtTanggalPengembalian;
    // End of variables declaration//GEN-END:variables

}
