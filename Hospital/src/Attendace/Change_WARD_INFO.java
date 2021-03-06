/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Attendace;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Change_WARD_INFO extends javax.swing.JFrame {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/itp";
   protected main home;
   //  Database credentials
   static final String USER = "itp";
   static final String PASS = "itp";
   private String ptno;
   private String old_wardno;
   private String old_date;
    /**
     * Creates new form Change_WARD_INFO
     */
   public boolean check_for_db(){
        Connection conn = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            //System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
            return false;
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
            return false;
        } //end finally try
        
        return true;
    }
    public Change_WARD_INFO() {
        initComponents();
        if(check_for_db()){
                Connection conn = null;
                Statement stmt = null;
                try {
                    //STEP 2: Register JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");

                    //STEP 3: Open a connection
                    //System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);

                    //STEP 4: Execute a query
                    //System.out.println("Creating statement...");
                    stmt = conn.createStatement();
                    String sql;
                    
                    sql = "SELECT DISTINCT `ward_No` FROM `ward`";
                    ResultSet rs = stmt.executeQuery(sql);
                    rs = stmt.executeQuery(sql);
                    cmb_ward_wardno.removeAllItems();
                    
                    while (rs.next()) {
                        //Retrieve by column name
                        
                        cmb_ward_wardno.addItem(rs.getString("ward_No"));
                        
                        
                      
                       
                    }
                    
                    rs.close();
                    stmt.close();
                    conn.close();
                    
                    //STEP 6: Clean-up environment
                    
                } catch (SQLException se) {
                    //Handle errors for JDBC
                    se.printStackTrace();
                    
                } catch (Exception e) {
                    //Handle errors for Class.forName
                    e.printStackTrace();
                    
                } finally {
                    //finally block used to close resources
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                    } catch (SQLException se2) {
                    }// nothing we can do
                    try {
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException se) {
                        se.printStackTrace();

                    }//end finally try
                }
                
                
                
                
                
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

        jPanel10 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jlable14 = new javax.swing.JLabel();
        jlable15 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt_ward_notes = new javax.swing.JTextArea();
        btn_ward_attendace = new javax.swing.JButton();
        cmb_ward_wardno = new javax.swing.JComboBox();
        jlable19 = new javax.swing.JLabel();
        txt_ward_bedno = new javax.swing.JTextField();
        jlable21 = new javax.swing.JLabel();
        date_ward_date = new com.toedter.calendar.JDateChooser();

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setMaximumSize(new java.awt.Dimension(941, 416));
        jPanel10.setMinimumSize(new java.awt.Dimension(941, 416));

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Patient Reg No");

        jlable14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlable14.setText("Bed No");

        jlable15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlable15.setText("Notes");

        txt_ward_notes.setColumns(20);
        txt_ward_notes.setRows(5);
        jScrollPane4.setViewportView(txt_ward_notes);

        btn_ward_attendace.setText("Update Record");
        btn_ward_attendace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ward_attendaceActionPerformed(evt);
            }
        });

        cmb_ward_wardno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "WD 01", "WD 02" }));

        jlable19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlable19.setText("Ward No");

        txt_ward_bedno.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jlable21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jlable21.setText("Date");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlable14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlable15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlable19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                            .addComponent(jlable21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_ward_attendace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmb_ward_wardno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_ward_bedno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(date_ward_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jSeparator7)
                .addContainerGap())
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlable19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_ward_wardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jlable21)
                        .addGap(27, 27, 27)
                        .addComponent(jlable14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(jlable15))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(date_ward_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txt_ward_bedno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(27, 48, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addGap(11, 11, 11))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(btn_ward_attendace)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setPatientId(String pid,String wardno,String date) {
             ptno = pid;
        old_wardno = wardno;
        old_date = date;
            if(check_for_db()){
                Connection conn = null;
                Statement stmt = null;
                try {
                    //STEP 2: Register JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");

                    //STEP 3: Open a connection
                    //System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);

                    //STEP 4: Execute a query
                    
                    //System.out.println("Creating statement...");
                    stmt = conn.createStatement();
                    String sql;
                    sql = "SELECT `pId`, `wardno`, `notes`, `date`, `bedNo` FROM `patient_ward` WHERE `pId` = '"+ ptno +"' and `date` = '"+ old_date +"' and `wardno` = '"+ old_wardno +"'";
                    ResultSet rs = stmt.executeQuery(sql);
                    //cmb_clinic_pno.removeAllItems();
                    //STEP 5: Extract data from result set
                   
                    
                    while (rs.next()) {
                        //Retrieve by column name
                        jLabel9.setText("Patient Reg No : "+rs.getString(1));
                        cmb_ward_wardno.setSelectedItem(rs.getString(2));
                        txt_ward_notes.setText(rs.getString(3));
                        txt_ward_bedno.setText(rs.getString(3));
                        System.out.println(rs.getString(4));
                         
                        date_ward_date.setDate(rs.getDate(4));
                        
                        
                        
                        
                       // cmb_clinic_pno.addItem(rs.getString("ID"));
                       // cmb_ward_pno.addItem(rs.getString("ID"));
                      
                       
                    }
                    
                    
                    
                    rs.close();
                    stmt.close();
                    conn.close();
                    
                    //STEP 6: Clean-up environment
                    
                } catch (SQLException se) {
                    //Handle errors for JDBC
                    se.printStackTrace();
                    
                } catch (Exception e) {
                    //Handle errors for Class.forName
                    e.printStackTrace();
                    
                } finally {
                    //finally block used to close resources
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                    } catch (SQLException se2) {
                    }// nothing we can do
                    try {
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException se) {
                        se.printStackTrace();

                    }//end finally try
                }
                
                
                
                
                
            }
    }
    private void btn_ward_attendaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ward_attendaceActionPerformed
        // TODO add your handling code here:
        String date;
        
        
        if(cmb_ward_wardno.getSelectedIndex()<0){
            return;
        }
       if(check_for_db()){
                Connection conn = null;
                Statement stmt = null;
                try {
                    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date from_datetime = date_ward_date.getDate();
        date = dateFormat.format(from_datetime);
                    //STEP 2: Register JDBC driver
                    Class.forName("com.mysql.jdbc.Driver");

                    //STEP 3: Open a connection
                    //System.out.println("Connecting to database...");
                    conn = DriverManager.getConnection(DB_URL, USER, PASS);

                    //STEP 4: Execute a query
                    
                    //System.out.println("Creating statement...");
                    stmt = conn.createStatement();
                    String sql;
                    sql = "UPDATE `patient_ward` SET `wardno`='"+ cmb_ward_wardno.getSelectedItem().toString() +"',`notes`='" + txt_ward_notes.getText() + "',`date`='"+ date +"',`bedNo`='"+ txt_ward_bedno.getText() +"' WHERE `pId` = '"+ ptno +"' and `wardno` = '"+ old_wardno +"' and `date` = '"+ old_date +"'";
                    
                    //cmb_clinic_pno.removeAllItems();
                    //STEP 5: Extract data from result set
                   
                    
                    stmt.executeUpdate(sql);
                    stmt.close();
                    conn.close();
                    this.hide();
                    home.update_recover_table();
                    home.change_footer("Update Successfull", 1);
                    //STEP 6: Clean-up environment
                    
                } catch (SQLException se) {
                    //Handle errors for JDBC
                    se.printStackTrace();
                    
                } catch (Exception e) {
                    //Handle errors for Class.forName
                    JOptionPane.showMessageDialog(null, "Fill the form Properly","Warning",JOptionPane.WARNING_MESSAGE);
                    e.printStackTrace();
                    
                } finally {
                    //finally block used to close resources
                    try {
                        if (stmt != null) {
                            stmt.close();
                        }
                    } catch (SQLException se2) {
                    }// nothing we can do
                    try {
                        if (conn != null) {
                            conn.close();
                        }
                    } catch (SQLException se) {
                        se.printStackTrace();

                    }//end finally try
                }
        
       }
        
    }//GEN-LAST:event_btn_ward_attendaceActionPerformed

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
            java.util.logging.Logger.getLogger(Change_WARD_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_WARD_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_WARD_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_WARD_INFO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_WARD_INFO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ward_attendace;
    private javax.swing.JComboBox cmb_ward_wardno;
    private com.toedter.calendar.JDateChooser date_ward_date;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jlable14;
    private javax.swing.JLabel jlable15;
    private javax.swing.JLabel jlable19;
    private javax.swing.JLabel jlable21;
    private javax.swing.JTextField txt_ward_bedno;
    private javax.swing.JTextArea txt_ward_notes;
    // End of variables declaration//GEN-END:variables
}
