
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
public class aredit extends javax.swing.JFrame {
     Connection conn;
    ResultSet rs;
    PreparedStatement pst;

    /**
     * Creates new form aredit
     */
    public aredit() {
            super("Blood bank");
        initComponents();
        conn=orconnect.connectdb();
        showtabledata();
    }
       public void clearfields()
    {
        jTextField1.setText(null);
        jTextField2.setText(null);
        jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jTextField8.setText(null);
        jTextField9.setText(null);
        jTextField10.setText(null);
        jTextField11.setText(null);
        jTextField12.setText(null);
        jTextField13.setText(null);
        jTextField14.setText(null);
        jTextField15.setText(null);
        jTextField16.setText(null);
        jTextField17.setText(null);
       
        
        
    }
         public void showtabledata()
     {
         try
         {
             String sql="select * from request";
             pst=conn.prepareStatement(sql);
             rs=pst.executeQuery();
             jTable1.setRowHeight(40);
             jTable1.setModel(DbUtils.resultSetToTableModel(rs));
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null,e);
         }
     }
         
      public void Retrieve()
    {
        String a1=jTextField6.getText();
        String sql="select * from request where req_no='"+a1+"'";
        try
        {
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next())
           {
               jTextField16.setText(rs.getString(2));
               jTextField7.setText(rs.getString(3));
               jTextField17.setText(rs.getString(4));
               jTextField8.setText(rs.getString(5));
               jTextField9.setText(rs.getString(6));
               jTextField10.setText(rs.getString(7));
               
               
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
           public void Retrieve1()
    {
        String a1=jTextField11.getText();
        String sql="select * from request where req_no='"+a1+"'";
        try
        {
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next())
           {
               
               jComboBox5.setSelectedItem(rs.getString(2));
               jTextField12.setText(rs.getString(3));
               jComboBox6.setSelectedItem(rs.getString(4));
               jTextField13.setText(rs.getString(5));
               jTextField14.setText(rs.getString(6));
               jTextField15.setText(rs.getString(7));
              
               
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
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jComboBox5 = new javax.swing.JComboBox<>();
        jTextField12 = new javax.swing.JTextField();
        jComboBox6 = new javax.swing.JComboBox<>();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Request info");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(30, 20, 250, 44);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Id:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 100, 30, 29);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Blood group:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 160, 170, 29);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Name:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 220, 140, 29);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Gender:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 280, 110, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Phone:");
        jLabel11.setToolTipText("");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 340, 100, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Email:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(40, 400, 80, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Password:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(40, 460, 130, 29);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(200, 96, 280, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(jTextField2);
        jTextField2.setBounds(200, 210, 280, 40);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(200, 150, 280, 40);

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel2.add(jComboBox2);
        jComboBox2.setBounds(200, 270, 280, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(jTextField3);
        jTextField3.setBounds(200, 330, 280, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(jTextField4);
        jTextField4.setBounds(200, 390, 280, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel2.add(jTextField5);
        jTextField5.setBounds(200, 450, 280, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(870, 460, 110, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(870, 530, 120, 40);

        jLabel30.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\download.png")); // NOI18N
        jPanel2.add(jLabel30);
        jLabel30.setBounds(810, 100, 150, 160);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 610);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Add", jPanel1);

        jPanel4.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Request info");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(40, 20, 250, 44);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Id:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(50, 100, 30, 30);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Blood group:");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(50, 160, 160, 29);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setText("Name:");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(50, 220, 100, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Gender:");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(50, 280, 100, 30);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Phone:");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(50, 340, 73, 29);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Email:");
        jPanel4.add(jLabel19);
        jLabel19.setBounds(50, 400, 90, 29);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Password:");
        jPanel4.add(jLabel20);
        jLabel20.setBounds(50, 460, 120, 29);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel4.add(jTextField6);
        jTextField6.setBounds(220, 100, 260, 40);

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel4.add(jTextField7);
        jTextField7.setBounds(220, 220, 260, 40);

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel4.add(jTextField8);
        jTextField8.setBounds(220, 340, 260, 40);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel4.add(jTextField9);
        jTextField9.setBounds(220, 400, 260, 40);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel4.add(jTextField10);
        jTextField10.setBounds(220, 460, 260, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Search");
        jButton3.setActionCommand("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(510, 100, 110, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(870, 460, 130, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5);
        jButton5.setBounds(870, 530, 130, 50);

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel4.add(jTextField16);
        jTextField16.setBounds(220, 160, 260, 40);

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel4.add(jTextField17);
        jTextField17.setBounds(220, 276, 260, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel4.add(jLabel2);
        jLabel2.setBounds(0, 0, 1060, 610);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Delete", jPanel3);

        jPanel6.setLayout(null);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Request Info");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(30, 20, 240, 44);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Id:");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(50, 110, 30, 29);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Blood group:");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(50, 160, 180, 29);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Name:");
        jPanel6.add(jLabel24);
        jLabel24.setBounds(50, 220, 110, 29);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setText("Gender:");
        jPanel6.add(jLabel25);
        jLabel25.setBounds(50, 280, 120, 29);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setText("Phone:");
        jPanel6.add(jLabel26);
        jLabel26.setBounds(60, 340, 100, 29);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setText("Email:");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(60, 400, 64, 29);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setText("Password:");
        jPanel6.add(jLabel28);
        jLabel28.setBounds(60, 460, 150, 29);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField11);
        jTextField11.setBounds(190, 100, 290, 40);

        jComboBox5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jPanel6.add(jComboBox5);
        jComboBox5.setBounds(190, 160, 290, 40);

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField12);
        jTextField12.setBounds(190, 220, 290, 40);

        jComboBox6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jPanel6.add(jComboBox6);
        jComboBox6.setBounds(190, 280, 290, 40);

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField13);
        jTextField13.setBounds(190, 340, 290, 40);

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField14);
        jTextField14.setBounds(190, 400, 290, 40);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField15);
        jTextField15.setBounds(190, 460, 290, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(500, 100, 120, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("Update");
        jButton7.setActionCommand("");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7);
        jButton7.setBounds(880, 490, 120, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8);
        jButton8.setBounds(880, 550, 130, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel6.add(jLabel3);
        jLabel3.setBounds(0, 0, 1090, 610);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Update", jPanel5);

        jPanel8.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Request Info");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(20, 20, 230, 44);

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

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 960, 402);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton9);
        jButton9.setBounds(883, 539, 110, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel8.add(jLabel4);
        jLabel4.setBounds(-5, 0, 1240, 610);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
               try
        {
            String sql="insert into request (req_no,blood_gr,r_name,r_gender,r_phone,r_email,r_password) values (?,?,?,?,?,?,?) ";
             pst=conn.prepareStatement(sql);
           
             pst.setString(1,jTextField1.getText());
             pst.setString(2,(String)jComboBox1.getSelectedItem());
             pst.setString(3,jTextField2.getText()); 
             pst.setString(4,(String)jComboBox2.getSelectedItem());
             pst.setString(5,jTextField3.getText());
             pst.setString(6,jTextField4.getText());
             pst.setString(7,jTextField5.getText());
             pst.execute();
             JOptionPane.showMessageDialog(null,"Inserted Successfully");
             clearfields();
             showtabledata();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        adminhome ob=new adminhome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Retrieve();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
           String sql="delete from request where req_no=?";
         try
        {
             pst=conn.prepareStatement(sql);
              pst.setString(1,jTextField6.getText());
            
             pst.execute();
             JOptionPane.showMessageDialog(null,"deleted Successfully");
             clearfields();
             showtabledata();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        adminhome ob=new adminhome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Retrieve1();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
            try
        {
            String sql="update request set blood_gr=?,r_name=?,r_gender=?,r_phone=?,r_email=?,r_password=? where req_no=?";
             pst=conn.prepareStatement(sql);
              pst.setString(1,(String)jComboBox5.getSelectedItem());
             pst.setString(2,jTextField12.getText()); 
             pst.setString(3,(String)jComboBox6.getSelectedItem());
             pst.setString(4,jTextField13.getText());
             pst.setString(5,jTextField14.getText());
             pst.setString(6,jTextField15.getText()); 
             pst.setString(7,jTextField11.getText());
             
             pst.execute();
             JOptionPane.showMessageDialog(null,"Updated Successfully");
             clearfields();
             showtabledata();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        adminhome ob=new adminhome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
          setVisible(false);
        adminhome ob=new adminhome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(aredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aredit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
