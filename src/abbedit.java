
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
public class abbedit extends javax.swing.JFrame {
     Connection conn;
    ResultSet rs;
    PreparedStatement pst;


    /**
     * Creates new form abbedit
     */
    public abbedit() {
         super("Blood bank");
        initComponents();
        conn=orconnect.connectdb();
        showtabledata();
    }
     public void Search()
    {
        String a1=jTextField1.getText();
        String sql="select * from Branch where b_id="+a1+"'";
        try
        {
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
        if(rs.next())
        {
           jTextField2.setText(rs.getString(2));
           jTextField3.setText(rs.getString(4));
           rs.close();
           pst.close();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Incorrect Username");
        }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void Retrieve()
    {
        String a1=jTextField8.getText();
        String sql="select * from Branch where B_id="+a1;
        try
        {
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next())
           {
               jTextField9.setText(rs.getString(2));
               jTextField10.setText(rs.getString(3));
               jTextField11.setText(rs.getString(4));
               jTextField12.setText(rs.getString(5));
               jTextField13.setText(rs.getString(6));
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    public void Retrieve1()
    {
        String a1=jTextField14.getText();
        String sql="select * from Branch where B_id="+a1;
        try
        {
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery();
           if(rs.next())
           {
               jTextField15.setText(rs.getString(2));
               jTextField16.setText(rs.getString(3));
               jTextField17.setText(rs.getString(4));
               jTextField18.setText(rs.getString(5));
               jTextField19.setText(rs.getString(6));
               jTextField20.setText(rs.getString(7));
           }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
     public void showtabledata()
     {
         try
         {
             String sql="select * from Branch order by b_id";
             pst=conn.prepareStatement(sql);
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
        jTextField18.setText(null);
        jTextField19.setText(null);
        jTextField20.setText(null);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Id:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 90, 30, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 160, 90, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Address:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 230, 120, 29);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(890, 460, 90, 37);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Pincode:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 300, 120, 29);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Phone:");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 370, 100, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Email:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 440, 100, 29);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(180, 90, 280, 40);

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField2);
        jTextField2.setBounds(180, 160, 280, 40);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField3);
        jTextField3.setBounds(180, 230, 280, 40);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4);
        jTextField4.setBounds(180, 296, 280, 40);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField5);
        jTextField5.setBounds(180, 366, 280, 40);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField6);
        jTextField6.setBounds(180, 430, 280, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Password:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 510, 109, 30);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel1.add(jTextField7);
        jTextField7.setBounds(180, 500, 280, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(890, 530, 100, 40);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Blood bank info");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(10, 20, 270, 44);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1060, 610);

        jTabbedPane1.addTab("Add", jPanel1);

        jPanel3.setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Id:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(40, 100, 30, 29);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Name:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(40, 160, 70, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Address:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(40, 230, 110, 29);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Pincode:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(40, 310, 120, 29);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Phone:");
        jPanel3.add(jLabel14);
        jLabel14.setBounds(40, 370, 110, 29);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Email:");
        jPanel3.add(jLabel15);
        jLabel15.setBounds(40, 440, 64, 29);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField8);
        jTextField8.setBounds(140, 90, 250, 40);

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField9);
        jTextField9.setBounds(140, 160, 250, 40);

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField10);
        jTextField10.setBounds(140, 230, 250, 40);

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField11);
        jTextField11.setBounds(140, 300, 250, 40);

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField12);
        jTextField12.setBounds(140, 370, 250, 40);

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel3.add(jTextField13);
        jTextField13.setBounds(140, 440, 250, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(410, 90, 110, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("Delete");
        jButton4.setActionCommand("");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4);
        jButton4.setBounds(880, 450, 110, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5);
        jButton5.setBounds(890, 520, 100, 40);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Blood bank info");
        jPanel3.add(jLabel26);
        jLabel26.setBounds(20, 20, 270, 44);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(0, 0, 1060, 610);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Delete", jPanel2);

        jPanel6.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setText("Id:");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(40, 110, 30, 29);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("Name:");
        jPanel6.add(jLabel18);
        jLabel18.setBounds(40, 180, 80, 29);

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Address:");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(40, 250, 100, 29);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Pincode:");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(40, 310, 120, 40);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("Phone:");
        jPanel6.add(jLabel21);
        jLabel21.setBounds(40, 390, 110, 29);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Email:");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(40, 450, 100, 29);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Password:");
        jPanel6.add(jLabel23);
        jLabel23.setBounds(40, 510, 150, 29);

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jTextField14.setToolTipText("");
        jPanel6.add(jTextField14);
        jTextField14.setBounds(170, 100, 260, 40);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField15);
        jTextField15.setBounds(170, 170, 260, 40);

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField16);
        jTextField16.setBounds(170, 240, 260, 40);

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField17);
        jTextField17.setBounds(170, 310, 260, 40);

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField18);
        jTextField18.setBounds(170, 380, 260, 40);

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField19);
        jTextField19.setBounds(170, 446, 260, 40);

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jPanel6.add(jTextField20);
        jTextField20.setBounds(170, 510, 260, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6);
        jButton6.setBounds(470, 100, 110, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("Update");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7);
        jButton7.setBounds(870, 450, 130, 50);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8);
        jButton8.setBounds(870, 530, 130, 50);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Blood bank info");
        jPanel6.add(jLabel27);
        jLabel27.setBounds(10, 20, 247, 44);

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel6.add(jLabel16);
        jLabel16.setBounds(0, 0, 1340, 610);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Update", jPanel4);

        jPanel7.setLayout(null);

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

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(20, 90, 1010, 402);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Blood bank info");
        jPanel7.add(jLabel28);
        jLabel28.setBounds(20, 20, 270, 44);

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton9);
        jButton9.setBounds(850, 529, 110, 50);

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\polep\\Downloads\\1055x607.jpg")); // NOI18N
        jPanel7.add(jLabel24);
        jLabel24.setBounds(-5, 0, 1270, 610);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1055, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("View", jPanel5);

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

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          try
        {
            String sql="insert into branch (b_id,b_name,b_address,pincode,b_phone,b_email,b_password) values (?,?,?,?,?,?,?) ";
             pst=conn.prepareStatement(sql);
           
             pst.setString(1,jTextField1.getText());
             pst.setString(2,jTextField2.getText());
             pst.setString(3,jTextField3.getText()); 
             pst.setString(4,jTextField4.getText());
             pst.setString(5,jTextField5.getText());
             pst.setString(6,jTextField6.getText());
             pst.setString(7,jTextField7.getText());
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
         String sql="delete from Branch where b_id=?";
         try
        {
             pst=conn.prepareStatement(sql);
              pst.setString(1,jTextField8.getText());
            
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

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        adminhome ob=new adminhome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          try
        {
            String sql="update branch set b_name=?,b_address=?,pincode=?,b_phone=?,b_email=?,b_password=? where b_id=?";
             pst=conn.prepareStatement(sql);
             pst.setString(1,jTextField15.getText());
             pst.setString(2,jTextField16.getText());
             pst.setString(3,jTextField17.getText()); 
             pst.setString(4,jTextField18.getText());
             pst.setString(5,jTextField19.getText());
             pst.setString(6,jTextField20.getText());
             pst.setString(7,jTextField14.getText());
             pst.execute();
             JOptionPane.showMessageDialog(null,"Updated Successfully");
             clearfields();
             showtabledata();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        boolean a= jTable1.isEditing();
        if(a==false)
        {
            JOptionPane.showMessageDialog(null, "Table cannot be edited");
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        adminhome ob=new adminhome();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(abbedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(abbedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(abbedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(abbedit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new abbedit().setVisible(true);
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
