/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.*;
import java.util.Date;
import javax.swing.JOptionPane;



/**
 *
 * @author moniskhan
 */
public class ClientDisplay extends javax.swing.JFrame {

    /**
     * Creates new form ClientDisplay
     */
    public ClientDisplay() {
        initComponents();
        this.setLocationRelativeTo(null);
        dt.setMinSelectableDate(new Date(50,01,01));
        dt.setMaxSelectableDate(new Date());
        TKeyReleased(null);
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
        jLabel1 = new javax.swing.JLabel();
        T = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        showTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        n = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        g1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        dt = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        c = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        a = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        l1 = new javax.swing.JCheckBox();
        l2 = new javax.swing.JCheckBox();
        l3 = new javax.swing.JCheckBox();
        l4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        uid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name: ");

        T.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });
        T.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TKeyReleased(evt);
            }
        });

        showTable.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        showTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "DOB", "Country", "Address", "Language"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        showTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(showTable);
        if (showTable.getColumnModel().getColumnCount() > 0) {
            showTable.getColumnModel().getColumn(0).setMinWidth(5);
            showTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            showTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            showTable.getColumnModel().getColumn(3).setPreferredWidth(50);
        }

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 0));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Name :");

        n.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        n.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Gender :");

        buttonGroup1.add(g1);
        g1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        g1.setSelected(true);
        g1.setText("Male");

        buttonGroup1.add(g2);
        g2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        g2.setText("Female");

        buttonGroup1.add(g3);
        g3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        g3.setText("Other");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("DOB :");

        dt.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Country :");

        c.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        c.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "India", "China", "Pakistan", "Sri Lanka", "Nepal", "Russia" }));

        a.setColumns(20);
        a.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        a.setRows(5);
        jScrollPane3.setViewportView(a);

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Address :");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Languages :");

        l1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        l1.setSelected(true);
        l1.setText("Hindi");

        l2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        l2.setText("English");
        l2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l2ActionPerformed(evt);
            }
        });

        l3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        l3.setText("Chinese");
        l3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l3ActionPerformed(evt);
            }
        });

        l4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        l4.setText("Russian");
        l4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 51, 255));
        jButton1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 30)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 51, 255));
        jButton3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 30)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("ID :");

        uid.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        uid.setText("-----------------");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(l1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l2)
                                .addGap(9, 9, 9)
                                .addComponent(l3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(l4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(g1)
                                        .addGap(18, 18, 18)
                                        .addComponent(g2)))
                                .addGap(18, 18, 18)
                                .addComponent(g3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(c, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(n, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uid, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(n, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(g1)
                            .addComponent(g2)
                            .addComponent(g3))
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(dt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l1)
                            .addComponent(l2)
                            .addComponent(l3)
                            .addComponent(l4))))
                .addGap(22, 22, 22))
        );

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(T, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            connector.Dbc.c.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

    private void nActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nActionPerformed

    private void l2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l2ActionPerformed

    private void l3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l3ActionPerformed

    private void l4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_l4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = n.getText().trim();
        java.util.Date date = dt.getDate();
        String address = a.getText().trim();

        if(date!= null && !name.equals("") && !address.equals("")){

            String gender = "";
            if(g1.isSelected()){
                gender = g1.getText();
            }else if(g2.isSelected()){
                gender = g2.getText();
            }else{
                gender = g3.getText();
            }

            String country = (String)c.getSelectedItem();

            String language = "";
            if(l1.isSelected()){
                language += l1.getText() + "/";
            }
            if(l2.isSelected()){
                language += l2.getText() + "/";
            }
            if(l3.isSelected()){
                language += l3.getText() + "/";
            }
            if(l4.isSelected()){
                language += l4.getText() + "/";
            }

            language = language.substring(0,language.length()-1);

            try{
                //Inserting elements
                connector.Dbc.updateClient.setString(1, name);
                connector.Dbc.updateClient.setString(2, gender);

                //converting type of date
                java.sql.Date dob = new java.sql.Date(date.getTime());
                connector.Dbc.updateClient.setDate(3, dob);
                connector.Dbc.updateClient.setString(4, country);
                connector.Dbc.updateClient.setString(5, address);
                connector.Dbc.updateClient.setString(6, language);
                int cid = Integer.parseInt(uid.getText());
                connector.Dbc.updateClient.setInt(7, cid);
                connector.Dbc.updateClient.executeUpdate();
                JOptionPane.showMessageDialog(null, "Updated!");
                TKeyReleased(null);
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, ex);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please fill full form");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rs = JOptionPane.showConfirmDialog(null, "Do you really want to delete?");
        if(rs==JOptionPane.YES_OPTION){
            
            try {
                int id = Integer.parseInt(uid.getText());
                connector.Dbc.st.executeUpdate("delete from clien_info where cid="+id);
                JOptionPane.showMessageDialog(null, "Deleted!");
                
                TKeyReleased(null);
                
                uid.setText("-----------------------");
                n.setText("");
                g1.setSelected(true);
                dt.setDate(null);
                c.setSelectedIndex(0);
                a.setText("");
                l1.setSelected(true);
                l2.setSelected(false);
                l3.setSelected(false);
                l4.setSelected(false);
                
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Something went wrong!");
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TKeyReleased
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)showTable.getModel();
        
        String SName = T.getText();
        try {
            int rc = dtm.getRowCount();
            while(rc-- !=0){
                dtm.removeRow(0);
            }
            
            connector.Dbc.viewClient.setString(1, "%"+SName+"%");
            ResultSet rs = connector.Dbc.viewClient.executeQuery();
            while(rs.next()){
                java.util.Vector v = new java.util.Vector();
                v.add(rs.getInt("cid"));
                v.add(rs.getString("name"));
                v.add(rs.getString("gender"));
                v.add(rs.getDate("dob"));
                v.add(rs.getString("country"));
                v.add(rs.getString("address"));
                v.add(rs.getString("language"));
                
                dtm.addRow(v);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
            System.out.print(ex);
        }
    }//GEN-LAST:event_TKeyReleased

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TActionPerformed

    private void showTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showTableMouseClicked
        int ri = showTable.getSelectedRow();
        if(ri!=-1){
            int id = (Integer) showTable.getValueAt(ri, 0);
            String name = (String) showTable.getValueAt(ri, 1);
            String gender = (String) showTable.getValueAt(ri, 2);
            java.util.Date date = (java.util.Date) showTable.getValueAt(ri, 3);
            String country = (String) showTable.getValueAt(ri, 4);
            String address = (String) showTable.getValueAt(ri, 5);
            String language = (String) showTable.getValueAt(ri, 6);
            
            uid.setText(String.valueOf(id));
            n.setText(name);
            if(gender.equals("Male")){
                g1.setSelected(true);
            }else if(gender.equals("Female")){
                g2.setSelected(true);
            }else{
                g3.setSelected(true);
            }
            dt.setDate(date);
            c.setSelectedItem(country);
            a.setText(address);
            
            l1.setSelected(false);
            l2.setSelected(false);
            l3.setSelected(false);
            l4.setSelected(false);
            
            java.util.StringTokenizer st = new java.util.StringTokenizer(language,"/");
            while(st.hasMoreTokens()){
                String s = st.nextToken();
                if(s.equals("Hindi")){
                    l1.setSelected(true);
                }else if(s.equals("English")){
                    l2.setSelected(true);
                }else if(s.equals("Chinese")){
                    l3.setSelected(true);
                }else if(s.equals("Russian")){
                    l4.setSelected(true);
                }
            }
        }else{
            
        }
    }//GEN-LAST:event_showTableMouseClicked

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
            java.util.logging.Logger.getLogger(ClientDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientDisplay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T;
    private javax.swing.JTextArea a;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> c;
    private com.toedter.calendar.JDateChooser dt;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox l1;
    private javax.swing.JCheckBox l2;
    private javax.swing.JCheckBox l3;
    private javax.swing.JCheckBox l4;
    private javax.swing.JTextField n;
    private javax.swing.JTable showTable;
    private javax.swing.JLabel uid;
    // End of variables declaration//GEN-END:variables
}
