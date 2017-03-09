/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import sun.util.logging.PlatformLogger;

/**
 *
 * @author Dafa Zakhulhaq
 */
public class frmMain extends javax.swing.JFrame {

    int nol_jam ;
    int nol_menit ;
    int nol_detik ;
    
    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
        
        SetJam() ;
        SetTanggal() ;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jm = new javax.swing.JLabel();
        tgl = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ddd = new javax.swing.JLabel();
        kelastv = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailtv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        wr = new javax.swing.JRadioButton();
        pr = new javax.swing.JRadioButton();
        namatv = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nistv = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamattv = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        tempattv = new javax.swing.JTextField();
        ddd1 = new javax.swing.JLabel();
        tanggaltv = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdata = new javax.swing.JTable();
        clear = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(null);

        jm.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jm.setForeground(new java.awt.Color(255, 255, 255));
        jm.setText("Jam");
        jPanel1.add(jm);
        jm.setBounds(710, 40, 130, 40);

        tgl.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        tgl.setForeground(new java.awt.Color(255, 255, 255));
        tgl.setText("Tanggal");
        jPanel1.add(tgl);
        tgl.setBounds(710, 10, 80, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 80);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Isian data siswa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(null);

        ddd.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ddd.setForeground(new java.awt.Color(255, 255, 255));
        ddd.setText("Kelas");
        jPanel2.add(ddd);
        ddd.setBounds(10, 180, 80, 40);

        kelastv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelastvActionPerformed(evt);
            }
        });
        jPanel2.add(kelastv);
        kelastv.setBounds(10, 210, 170, 30);

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Jenis Kelamin");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 110, 110, 40);

        emailtv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtvActionPerformed(evt);
            }
        });
        jPanel2.add(emailtv);
        emailtv.setBounds(10, 260, 170, 30);

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Alamat");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 280, 80, 40);

        buttonGroup1.add(wr);
        wr.setText("Wanita");
        jPanel2.add(wr);
        wr.setBounds(10, 160, 59, 23);

        buttonGroup1.add(pr);
        pr.setText("Pria");
        jPanel2.add(pr);
        pr.setBounds(10, 140, 43, 23);

        namatv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namatvActionPerformed(evt);
            }
        });
        jPanel2.add(namatv);
        namatv.setBounds(10, 90, 170, 30);

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NAMA");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 60, 80, 40);

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIS");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 10, 80, 40);

        nistv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nistvActionPerformed(evt);
            }
        });
        jPanel2.add(nistv);
        nistv.setBounds(10, 40, 170, 30);

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 230, 80, 40);

        alamattv.setColumns(20);
        alamattv.setRows(5);
        jScrollPane1.setViewportView(alamattv);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 310, 166, 70);

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tanggal  Lahir");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 430, 110, 40);

        tempattv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tempattvActionPerformed(evt);
            }
        });
        jPanel2.add(tempattv);
        tempattv.setBounds(10, 410, 170, 30);

        ddd1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        ddd1.setForeground(new java.awt.Color(255, 255, 255));
        ddd1.setText("Tempat Lahir");
        jPanel2.add(ddd1);
        ddd1.setBounds(10, 380, 80, 40);
        jPanel2.add(tanggaltv);
        tanggaltv.setBounds(10, 470, 170, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 190, 510);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(null);

        delete.setBackground(new java.awt.Color(204, 0, 0));
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete);
        delete.setBounds(340, 90, 80, 40);

        save.setBackground(new java.awt.Color(204, 0, 0));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel3.add(save);
        save.setBounds(210, 90, 80, 40);

        edit.setBackground(new java.awt.Color(204, 0, 0));
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel3.add(edit);
        edit.setBounds(750, 90, 80, 40);

        refresh.setBackground(new java.awt.Color(204, 0, 0));
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel3.add(refresh);
        refresh.setBounds(610, 90, 80, 40);

        tbdata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "JenisKelamin", "Kelas", "Email", "Alamat", "tempat", "tanggal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbdata);
        if (tbdata.getColumnModel().getColumnCount() > 0) {
            tbdata.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(210, 140, 630, 402);

        clear.setBackground(new java.awt.Color(204, 0, 0));
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel3.add(clear);
        clear.setBounds(480, 90, 80, 40);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 850, 490);

        print.setBackground(new java.awt.Color(204, 0, 0));
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(400, 510, 130, 60);

        setBounds(0, 0, 861, 641);
    }// </editor-fold>//GEN-END:initComponents

    private void kelastvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelastvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelastvActionPerformed

    private void emailtvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtvActionPerformed

    private void namatvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namatvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namatvActionPerformed

    private void nistvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nistvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nistvActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
    // TODO add your handling code here:
        
        int baris = tbdata.getSelectedRow() ;
        if(baris != -1){
            String NIS = tbdata.getValueAt(baris, 0).toString() ;
            String SQL = "Delete From t_siswa Where NIS='"+NIS+"'" ;
            int status = KoneksiDB.execute(SQL) ;
            if(status == 1){
                
                JOptionPane.showMessageDialog(this, "Berhasil Dihapus","sukses",JOptionPane.INFORMATION_MESSAGE);
                selectdata();
            }else{
                
                JOptionPane.showMessageDialog(this, "Gagal Dihapus","gagal",JOptionPane.WARNING_MESSAGE);
                
            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd") ;
        String tanggal = dateformat.format(tanggaltv.getDate()) ;
        if("".equals(nistv.getText()) || "".equals(alamattv.getText()) || "".equals(kelastv.getText()) || "".equals(namatv.getText()) || "".equals(emailtv.getText()) || "".equals(emailtv.getText()) || "".equals(tempattv.getText()) || "".equals(tanggal) ){
            JOptionPane.showMessageDialog(this, "Harap lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);
            
        }else{
            String JK = "" ;
            if(pr.isSelected()){
                JK = "L" ;
            }else if(wr.isSelected()){
                JK = "W" ;
            }else{
                
                JK = "Belum Diisi" ;
            }
            
            
            String SQL = "Insert Into t_siswa(NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,tempat,tanggal)"+"Values('"+nistv.getText()+"','"+namatv.getText()+"','"+JK+"','"+kelastv.getText()+"','"+emailtv.getText()+"','"+alamattv.getText()+"','"+tempattv.getText()+"','"+tanggal+"')" ;
            int status = KoneksiDB.execute(SQL) ;
            if(status == 1){
                
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan","sukses",JOptionPane.INFORMATION_MESSAGE);
                selectdata();
            }else{
                
                JOptionPane.showMessageDialog(this, "Gagal Ditambahkan","gagal",JOptionPane.WARNING_MESSAGE);
                
            }
            
        }
        
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        
        
                if("".equals(nistv.getText()) || "".equals(alamattv.getText()) || "".equals(kelastv.getText()) || "".equals(namatv.getText()) || "".equals(emailtv.getText()) ){
            JOptionPane.showMessageDialog(this, "Harap lengkapi Data","Error", JOptionPane.WARNING_MESSAGE);
            
        }else{
            String JK = "" ;
            if(pr.isSelected()){
                JK = "L" ;
            }else if(wr.isSelected()){
                JK = "W" ;
            }else{
                
                JK = "Belum Diisi" ;
            }
            
            
            String SQL = "UPDATE t_siswa SET NIS='"+nistv.getText()+"',NamaSiswa='"+namatv.getText()+"',JenisKelamin='"+JK+"',Kelas='"+kelastv.getText()+"',Email='"+emailtv.getText()+"',Alamat='"+alamattv.getText()+"' WHERE NIS='"+nistv.getText()+"' " ;
            int status = KoneksiDB.execute(SQL) ;
            if(status == 1){
                
                JOptionPane.showMessageDialog(this, "Berhasil Ditambahkan","sukses",JOptionPane.INFORMATION_MESSAGE);
                selectdata();
            }else{
                
                JOptionPane.showMessageDialog(this, "Gagal Ditambahkan","gagal",JOptionPane.WARNING_MESSAGE);
            
            }
            
        }
    }//GEN-LAST:event_editActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        
        MessageFormat header = new MessageFormat("Biodata Telkom") ;
        MessageFormat footer = new MessageFormat("Page (0,number,integer)") ;
        
        try{
            tbdata.print(JTable.PrintMode.FIT_WIDTH, header, footer,true, null, true, null) ;
            
        }catch(java.awt.print.PrinterException e)
        {
            System.err.format("Cannot print", e.getMessage()) ;
            
        }
        
   
    }//GEN-LAST:event_printActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        selectdata();
    }//GEN-LAST:event_refreshActionPerformed

    private void tbdataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdataMouseClicked
        // TODO add your handling code here:
        int baris = tbdata.getSelectedRow() ;
        if(baris != -1){
            
            nistv.setText(tbdata.getValueAt(baris, 0).toString()) ;
            namatv.setText(tbdata.getValueAt(baris, 1).toString()) ;
            if ("Pria".equals(tbdata.getValueAt(baris, 2).toString()))
            {
                pr.setSelected(true);
                
            }else{
                
                wr.setSelected(true);
            }
            kelastv.setText(tbdata.getValueAt(baris, 3).toString()) ;
            emailtv.setText(tbdata.getValueAt(baris, 4).toString()) ;
            alamattv.setText(tbdata.getValueAt(baris, 5).toString()) ;
           
        }
        
    }//GEN-LAST:event_tbdataMouseClicked

    private void tempattvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tempattvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tempattvActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        
        namatv.setText("");
        nistv.setText("");
        kelastv.setText("");
        emailtv.setText("");
        alamattv.setText("");
        tempattv.setText("");
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamattv;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JLabel ddd;
    private javax.swing.JLabel ddd1;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField emailtv;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jm;
    private javax.swing.JTextField kelastv;
    private javax.swing.JTextField namatv;
    private javax.swing.JTextField nistv;
    private javax.swing.JRadioButton pr;
    private javax.swing.JButton print;
    private javax.swing.JButton refresh;
    private javax.swing.JButton save;
    private com.toedter.calendar.JDateChooser tanggaltv;
    private javax.swing.JTable tbdata;
    private javax.swing.JTextField tempattv;
    private javax.swing.JLabel tgl;
    private javax.swing.JRadioButton wr;
    // End of variables declaration//GEN-END:variables

    public void SetTanggal(){
        
        java.util.Date skrg = new java.util.Date() ;
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy") ;
        tgl.setText(kal.format(skrg));
        
    }
    public void SetJam() {
        ActionListener taskPerformer = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                Date dt = new Date() ;
                int nilai_jam = dt.getHours() ;
                int nilai_menit = dt.getMinutes();
                int nilai_detik = dt.getSeconds();
                if(nilai_jam <= 9){
                    
                    nol_jam = 0 ;
                    
                }if(nilai_menit <= 9){
                    
                    nol_menit = 0 ;
                    
                }if(nilai_detik <= 9){
                    
                    nol_detik = 0 ;
                   
                }
                
                String jam = nol_jam + Integer.toString(nilai_jam) ;                
                String menit = nol_menit + Integer.toString(nilai_menit) ;
                String detik = nol_detik + Integer.toString(nilai_detik) ;
                jm.setText("Jam "+jam+" : "+ menit+" : "+detik);
                
                
            }
            
        };
        
            new Timer(100, taskPerformer).start() ;
            
    }
    
    private void selectdata() {
    
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat","tempat","tanggal"} ;
        DefaultTableModel dtm = new DefaultTableModel(null, kolom) ;
        String SQL = "Select * From t_siswa " ;
        ResultSet rs = KoneksiDB.executeQuery(SQL) ;
        try {
            
            while(rs.next()){
                String NIS = rs.getString(1) ;
                String NamaSiswa = rs.getString(2) ;
                String JenisKelamin = "" ;
                if("L".equals(rs.getString(3))){
                    JenisKelamin = "Pria" ;
                    
                }
                else{
                    JenisKelamin = "Wanita" ;
                    
                }
                String Kelas = rs.getString(4) ;
                String Email = rs.getString(5) ;
                String Alamat = rs.getString(6) ;
                String tempat = rs.getString(7) ;
                String tanggal = rs.getString(8) ;
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat,tempat,tanggal} ;
                dtm.addRow(data);
            }
            
        }catch(SQLException ex){
            
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex) ;
        }
        tbdata.setModel(dtm);
        
    }
}
