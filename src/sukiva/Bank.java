/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sukiva;

import java.awt.Font;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Snake_Eye
 */
public class Bank extends javax.swing.JInternalFrame {
DefaultTableModel defaultTableModel = new DefaultTableModel();

    /** Creates new form employer */
    public Bank() {
        initComponents();
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

tbsearch.setBackground(new java.awt.Color(0,0,0,0));
        tbdate.setBackground(new java.awt.Color(0,0,0,0));
        tbsearch2.setBackground(new java.awt.Color(0,0,0,1));
        tbdes.setBackground(new java.awt.Color(0,0,0,1));
         tbamt.setBackground(new java.awt.Color(0,0,0,1));
         
         
         
         
           
          bscroll.setBackground(new java.awt.Color(0,0,0,1));
        bscroll.getViewport().setBackground(new java.awt.Color(0,0,0,1));
         bt.setBackground(new java.awt.Color(0,0,0,1));
     
         
         JTableHeader header = bt.getTableHeader();
        header.setBackground(new java.awt.Color(0,0,0,0));
        bt.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
        
    
        Object columns[] = {"Description"," Debit","Credit"};
        defaultTableModel.setColumnIdentifiers(columns);
        bt.setModel(defaultTableModel);




    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbamt = new javax.swing.JTextField();
        bsearch = new javax.swing.JButton();
        tbsearch2 = new javax.swing.JTextField();
        bdelete = new javax.swing.JButton();
        bscroll = new javax.swing.JScrollPane();
        bt = new javax.swing.JTable();
        bdebit = new javax.swing.JButton();
        bdes = new javax.swing.JLabel();
        tbdate = new com.toedter.calendar.JDateChooser();
        bupdate = new javax.swing.JButton();
        bcredit = new javax.swing.JButton();
        bdate = new javax.swing.JLabel();
        tbsearch = new javax.swing.JComboBox<>();
        tbdes = new javax.swing.JTextField();
        bamt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(960, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbamt.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tbamt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbamt.setOpaque(false);
        tbamt.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tbamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, 20));

        bsearch.setBackground(new java.awt.Color(176, 106, 179));
        bsearch.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bsearch.setForeground(new java.awt.Color(0, 0, 204));
        bsearch.setText("Search");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });
        getContentPane().add(bsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 110, 40));

        tbsearch2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tbsearch2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbsearch2.setOpaque(false);
        tbsearch2.setPreferredSize(new java.awt.Dimension(6, 22));
        tbsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbsearch2ActionPerformed(evt);
            }
        });
        getContentPane().add(tbsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 160, 30));

        bdelete.setBackground(new java.awt.Color(176, 106, 179));
        bdelete.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bdelete.setForeground(new java.awt.Color(0, 0, 204));
        bdelete.setText("Delete");
        getContentPane().add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 80, 40));

        bscroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bscroll.setOpaque(false);

        bt.setBackground(new java.awt.Color(176, 106, 179));
        bt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        bt.setFont(new java.awt.Font("Ebrima", 0, 10)); // NOI18N
        bt.setForeground(new java.awt.Color(0, 0, 0));
        bt.setModel(new javax.swing.table.DefaultTableModel(
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
        bt.setGridColor(new java.awt.Color(0, 0, 0));
        bt.setOpaque(false);
        bscroll.setViewportView(bt);

        getContentPane().add(bscroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 610, 530));

        bdebit.setBackground(new java.awt.Color(176, 106, 179));
        bdebit.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bdebit.setForeground(new java.awt.Color(0, 0, 204));
        bdebit.setText("DEBIT");
        bdebit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdebitActionPerformed(evt);
            }
        });
        getContentPane().add(bdebit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 80, 40));

        bdes.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bdes.setForeground(new java.awt.Color(0, 0, 0));
        bdes.setText("Description");
        getContentPane().add(bdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));

        tbdate.setBackground(new java.awt.Color(176, 106, 179));
        tbdate.setForeground(new java.awt.Color(176, 106, 179));
        tbdate.setOpaque(false);
        tbdate.setPreferredSize(new java.awt.Dimension(22, 6));
        getContentPane().add(tbdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 160, 30));

        bupdate.setBackground(new java.awt.Color(176, 106, 179));
        bupdate.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bupdate.setForeground(new java.awt.Color(0, 0, 204));
        bupdate.setText("update");
        getContentPane().add(bupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 90, 40));

        bcredit.setBackground(new java.awt.Color(176, 106, 179));
        bcredit.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bcredit.setForeground(new java.awt.Color(0, 0, 204));
        bcredit.setText("CREDIT");
        getContentPane().add(bcredit, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 90, 40));

        bdate.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bdate.setForeground(new java.awt.Color(0, 0, 0));
        bdate.setText("Date");
        getContentPane().add(bdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 120, 30));

        tbsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbsearch.setOpaque(false);
        getContentPane().add(tbsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 160, 40));

        tbdes.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tbdes.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbdes.setOpaque(false);
        tbdes.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tbdes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 160, 20));

        bamt.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bamt.setForeground(new java.awt.Color(0, 0, 0));
        bamt.setText("Amount");
        getContentPane().add(bamt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 120, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sukiva/images/internal.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(998, 580));
        jLabel1.setMinimumSize(new java.awt.Dimension(998, 580));
        jLabel1.setPreferredSize(new java.awt.Dimension(960, 560));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bsearchActionPerformed

    private void tbsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbsearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbsearch2ActionPerformed

    private void bdebitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdebitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdebitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bamt;
    private javax.swing.JButton bcredit;
    private javax.swing.JLabel bdate;
    private javax.swing.JButton bdebit;
    private javax.swing.JButton bdelete;
    private javax.swing.JLabel bdes;
    private javax.swing.JScrollPane bscroll;
    private javax.swing.JButton bsearch;
    private javax.swing.JTable bt;
    private javax.swing.JButton bupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField tbamt;
    private com.toedter.calendar.JDateChooser tbdate;
    private javax.swing.JTextField tbdes;
    private javax.swing.JComboBox<String> tbsearch;
    private javax.swing.JTextField tbsearch2;
    // End of variables declaration//GEN-END:variables

}