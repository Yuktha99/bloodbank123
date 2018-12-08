
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author polep
 */
public class loginasd extends javax.swing.JFrame {
     Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form loginasd
     */
    public loginasd() {
           super("Blood bank");
        initComponents();
        conn=orconnect.connectdb();
    }
  
     public void showtabledata()
     {
         try
         {
             String sql="select r.req_no,r.r_name"
                     + " from transaction t,request r"
                     + " where t.d_id=?"
                     + " and t.req_no=r.req_no";
             pst=conn.prepareStatement(sql);
             pst.setString(1,jTextField1.getText());
             rs=pst.executeQuery();
             jTable1.setRowHeight(40);
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }
     public void clearfields()
     {
         jTextField1.setText(null);
         jTextField2.setText(null);
         jTextField3.setText(null);
         jTextField4.setText(null);
         jPasswordField1.setText(null);
     }

        public void Retrieve1()
    {
        String a1=jTextField1.getText();
        String sql="select * from donor where d_id="+a1;
        try
        {
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next())
           {
               
               jComboBox1.setSelectedItem(rs.getString(2));
               jTextField2.setText(rs.getString(3));
               jComboBox2.setSelectedItem(rs.getString(4));
               jTextField3.setText(rs.getString(5));
               jTextField4.setText(rs.getString(6));
              
              
               
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel3.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Enter Id:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(40, 80, 120, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Enter password:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(40, 130, 190, 29);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField1);
        jTextField1.setBounds(230, 80, 270, 40);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel3.add(jPasswordField1);
        jPasswordField1.setBounds(230, 130, 270, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1);
        jButton1.setBounds(540, 129, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Blood group:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(50, 260, 160, 29);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Name:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(50, 320, 90, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Gender:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(60, 370, 110, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Phone:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(60, 420, 90, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Email:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(60, 470, 80, 29);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel3.add(jComboBox1);
        jComboBox1.setBounds(210, 260, 290, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField2.setToolTipText("");
        jPanel3.add(jTextField2);
        jTextField2.setBounds(210, 310, 290, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel3.add(jComboBox2);
        jComboBox2.setBounds(210, 360, 290, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField3);
        jTextField3.setBounds(210, 410, 290, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField4);
        jTextField4.setBounds(210, 460, 290, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(850, 420, 120, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(850, 480, 120, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(850, 540, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel3.add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 610);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Donor information", jPanel1);

        jPanel4.setLayout(null);

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(60, 90, 920, 380);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel4.add(jLabel9);
        jLabel9.setBounds(0, 0, 1210, 607);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("transactions", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        setSize(new java.awt.Dimension(1082, 706));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            String a1=jTextField1.getText();
        String a2=jPasswordField1.getText();
        String sql="select * from donor where d_id='"+a1+"' and d_password='"+a2+"'";
        try
        {  
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next())
           {
               rs.close();
               pst.close();
               Retrieve1();
               showtabledata();
                          
           }
           else
           {
               JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
            rs.close();
            pst.close();
        }catch(Exception e)
                {
                
                }
    }                                        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
             try
        {
            String sql="update donor set blood_gr=?,d_name=?,d_gender=?,d_phone=?,d_email=?,d_password=? where d_id=?";
             pst=conn.prepareStatement(sql);
              pst.setString(1,(String)jComboBox1.getSelectedItem());
             pst.setString(2,jTextField2.getText()); 
             pst.setString(3,(String)jComboBox2.getSelectedItem());
             pst.setString(4,jTextField3.getText());
             pst.setString(5,jTextField4.getText());
             pst.setString(6,jPasswordField1.getText()); 
             pst.setString(7,jTextField1.getText());
             
             pst.execute();
             JOptionPane.showMessageDialog(null,"Updated Successfully");
             showtabledata();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
            String sql="delete from donor where d_id=?";
         try
        {
             pst=conn.prepareStatement(sql);
              pst.setString(1,jTextField2.getText());
            
             pst.execute();
             JOptionPane.showMessageDialog(null,"deleted Successfully");
             clearfields();
             showtabledata();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Loginas ob=new Loginas();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
           boolean a= jTable1.isEditing();
        if(a==false)
        {
            JOptionPane.showMessageDialog(null, "Table cannot be edited");
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(loginasd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginasd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginasd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginasd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginasd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
