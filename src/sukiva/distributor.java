/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sukiva;

import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import static sukiva.Admin.q;

/**
 *
 * @author Snake_Eye
 */
public class distributor extends javax.swing.JInternalFrame {
  DefaultTableModel defaultTableModel = new DefaultTableModel();
   Connection connection = null;
    PreparedStatement prp = null;
    ResultSet rs = null;
        int delete;
    /** Creates new form employer */
    public distributor() {
        initComponents();
        
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

         tname.setBackground(new java.awt.Color(0,0,0,1));
         tcn.setBackground(new java.awt.Color(0,0,0,1));
         tsrn.setBackground(new java.awt.Color(0,0,0,1));
                  tsrn.setBackground(new java.awt.Color(0,0,0,1));
         tddue.setBackground(new java.awt.Color(0,0,0,1));

         tdsearch.setBackground(new java.awt.Color(0,0,0,0));
         tdsearch2.setBackground(new java.awt.Color(0,0,0,1));
         
         
         
         
          dscroll.setBackground(new java.awt.Color(0,0,0,1));
        dscroll.getViewport().setBackground(new java.awt.Color(0,0,0,1));
         dt.setBackground(new java.awt.Color(0,0,0,1));
     
         
         JTableHeader header = dt.getTableHeader();
                 header.setEnabled(false);
        header.setBackground(new java.awt.Color(0,0,0,0));
        dt.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
           dt.setDefaultEditor(Object.class, null);
    
        Object columns[] = {"Company Name"," Agent Name", " Contact Number","Due","ID"};
        defaultTableModel.setColumnIdentifiers(columns);
        dt.setModel(defaultTableModel);
         loadData();
    }
  public void loadData() {
        connection = DataBase.database.ConnectDb();
        String sql = "SELECT `coname`, `cnum`, `salesrn`, `due`,`did` FROM `distributors`";
        try {
            prp = connection.prepareStatement(sql);
            rs = prp.executeQuery();
            Object columnData[] = new Object[5];
            while (rs.next()) {
                columnData[0] = rs.getString("coname");
                columnData[1] = rs.getString("salesrn");
                columnData[2] = rs.getString("cnum");
                columnData[3] = rs.getString("due");
                 columnData[4] = rs.getString("did");
               
                
                defaultTableModel.addRow(columnData);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dadd = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        agn = new javax.swing.JLabel();
        tsrn = new javax.swing.JTextField();
        dsearch = new javax.swing.JButton();
        tname = new javax.swing.JTextField();
        dupdate = new javax.swing.JButton();
        tcn = new javax.swing.JTextField();
        ddelete = new javax.swing.JButton();
        cn = new javax.swing.JLabel();
        dscroll = new javax.swing.JScrollPane();
        dt = new javax.swing.JTable();
        tdsearch = new javax.swing.JComboBox<>();
        tdsearch2 = new javax.swing.JTextField();
        tddue = new javax.swing.JTextField();
        ddue = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(958, 558));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dadd.setBackground(new java.awt.Color(176, 106, 179));
        dadd.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        dadd.setForeground(new java.awt.Color(0, 0, 204));
        dadd.setText("Add");
        dadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daddActionPerformed(evt);
            }
        });
        getContentPane().add(dadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, 40));

        name.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(0, 0, 0));
        name.setText("Company Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 30));

        agn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        agn.setForeground(new java.awt.Color(0, 0, 0));
        agn.setText("Sales Rep Name");
        getContentPane().add(agn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 140, 30));

        tsrn.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tsrn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tsrn.setOpaque(false);
        tsrn.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tsrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 160, 20));

        dsearch.setBackground(new java.awt.Color(176, 106, 179));
        dsearch.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        dsearch.setForeground(new java.awt.Color(0, 0, 204));
        dsearch.setText("Search");
        getContentPane().add(dsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 110, 30));

        tname.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tname.setOpaque(false);
        tname.setPreferredSize(new java.awt.Dimension(6, 22));
        tname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tnameActionPerformed(evt);
            }
        });
        getContentPane().add(tname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 160, 20));

        dupdate.setBackground(new java.awt.Color(176, 106, 179));
        dupdate.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        dupdate.setForeground(new java.awt.Color(0, 0, 204));
        dupdate.setText("update");
        dupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dupdateActionPerformed(evt);
            }
        });
        getContentPane().add(dupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 90, 40));

        tcn.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tcn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tcn.setOpaque(false);
        tcn.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tcn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 160, 20));

        ddelete.setBackground(new java.awt.Color(176, 106, 179));
        ddelete.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        ddelete.setForeground(new java.awt.Color(0, 0, 204));
        ddelete.setText("Delete");
        ddelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddeleteActionPerformed(evt);
            }
        });
        getContentPane().add(ddelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, 40));

        cn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        cn.setForeground(new java.awt.Color(0, 0, 0));
        cn.setText("Contact No");
        getContentPane().add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 120, 30));

        dscroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        dscroll.setOpaque(false);

        dt.setBackground(new java.awt.Color(176, 106, 179));
        dt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        dt.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        dt.setForeground(new java.awt.Color(0, 0, 0));
        dt.setModel(new javax.swing.table.DefaultTableModel(
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
        dt.setGridColor(new java.awt.Color(0, 0, 0));
        dt.setOpaque(false);
        dt.setSelectionBackground(new java.awt.Color(170, 106, 181));
        dt.setSelectionForeground(new java.awt.Color(0, 0, 0));
        dt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dtMouseEntered(evt);
            }
        });
        dscroll.setViewportView(dt);

        getContentPane().add(dscroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 610, 530));

        tdsearch.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        tdsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Company Name", "Contact No", "Sales Rep Name", "Due" }));
        tdsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tdsearch.setOpaque(false);
        tdsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdsearchActionPerformed(evt);
            }
        });
        getContentPane().add(tdsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 160, 40));

        tdsearch2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tdsearch2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tdsearch2.setOpaque(false);
        tdsearch2.setPreferredSize(new java.awt.Dimension(6, 22));
        tdsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdsearch2ActionPerformed(evt);
            }
        });
        getContentPane().add(tdsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 160, 30));

        tddue.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tddue.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tddue.setOpaque(false);
        tddue.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tddue, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 160, 20));

        ddue.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        ddue.setForeground(new java.awt.Color(0, 0, 0));
        ddue.setText("Due");
        getContentPane().add(ddue, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 30));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sukiva/images/internal.png"))); // NOI18N
        bg.setText("jLabel1");
        bg.setMaximumSize(new java.awt.Dimension(998, 580));
        bg.setMinimumSize(new java.awt.Dimension(998, 580));
        bg.setPreferredSize(new java.awt.Dimension(960, 560));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tnameActionPerformed

    private void daddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daddActionPerformed
        // TODO add your handling code here:
          String name = tname.getText();
          String cn = tcn.getText();
          String srn = tsrn.getText();
          String due = tddue.getText();
            
       if(name.equals("")||cn.equals("")||srn.equals("")||due.equals("")){
            
               JOptionPane.showMessageDialog(null,"Complete Your Employer Information","Missing Information",2);
               
        }
        else {
           String sql = "INSERT INTO `distributors`(`coname`, `cnum`, `salesrn`, `due`) VALUES (?,?,?,?)";
        if (connection != null) {
            
            try {
                prp = connection.prepareStatement(sql);
                prp.setString(1, name);
                prp.setString(2, cn);
                prp.setString(3, srn);
                prp.setString(4, due);
                prp.execute();
                defaultTableModel.getDataVector().removeAllElements();
                defaultTableModel.fireTableDataChanged();
                loadData();
                JOptionPane.showMessageDialog(null, "Data Saved");
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } 
          }
                 tname.setText("");
                 tcn.setText("");
                 tsrn.setText("");
                 tddue.setText("");
        
    }//GEN-LAST:event_daddActionPerformed

    private void dupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dupdateActionPerformed
        // TODO add your handling code here:
        
       
         String fullname = tname.getText();
         String username = tsrn.getText();
         String contact_no = tcn.getText();
         String due= tddue.getText();
         if(fullname.equals("")||contact_no.equals("")||username.equals("")||due.equals("")){
            
               JOptionPane.showMessageDialog(null,"Complete Your Employer Information","Missing Information",2);
               
        }
        else {
        String sql = "UPDATE `distributors` SET `coname`='"+ fullname +"',`cnum`='"+ contact_no +"',`salesrn`='"+ username +"',`due`='"+ due +"' WHERE did ='" + delete + "'";
                try {
                    prp = connection.prepareStatement(sql);
                    prp.execute();
                    defaultTableModel.getDataVector().removeAllElements();
                    defaultTableModel.fireTableDataChanged();
                    loadData();
                    q.removeAll();
        distributor ne = new distributor();
        q.add(ne).setVisible(true);
                    JOptionPane.showMessageDialog(null, "Data Updated");
                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, e);
                }
         }
        
        
    }//GEN-LAST:event_dupdateActionPerformed

    private void tdsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdsearchActionPerformed

    private void tdsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdsearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdsearch2ActionPerformed

    private void dtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_dtMouseEntered

    private void dtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dtMouseClicked
        // TODO add your handling code here:
         int row = dt.getSelectedRow();
        
        tname.setText(dt.getValueAt(row, 0).toString());
        tsrn.setText(dt.getValueAt(row, 1).toString());
        tcn.setText(dt.getValueAt(row, 2).toString());
        tddue.setText(dt.getValueAt(row, 3).toString());
         delete = Integer.parseInt(dt.getValueAt(row, 4).toString());
    }//GEN-LAST:event_dtMouseClicked

    private void ddeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddeleteActionPerformed
        // TODO add your handling code here:
        String name=tsrn.getText();
         String sql = "Delete from `distributors` where did ='" + delete + "'";
        try {
            prp = connection.prepareStatement(sql);
            prp.execute();
            JOptionPane.showMessageDialog(null, "Employer " + name + " has been deleted");
            defaultTableModel.getDataVector().removeAllElements();
            defaultTableModel.fireTableDataChanged();
            loadData();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Employer nicid " + delete + " not found");
        }
         
                 tname.setText("");
                 tcn.setText("");
                 tsrn.setText("");
                 tddue.setText("");
    }//GEN-LAST:event_ddeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel agn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel cn;
    private javax.swing.JButton dadd;
    private javax.swing.JButton ddelete;
    private javax.swing.JLabel ddue;
    private javax.swing.JScrollPane dscroll;
    private javax.swing.JButton dsearch;
    private javax.swing.JTable dt;
    private javax.swing.JButton dupdate;
    private javax.swing.JLabel name;
    private javax.swing.JTextField tcn;
    public javax.swing.JTextField tddue;
    private javax.swing.JComboBox<String> tdsearch;
    private javax.swing.JTextField tdsearch2;
    public javax.swing.JTextField tname;
    public javax.swing.JTextField tsrn;
    // End of variables declaration//GEN-END:variables

}
