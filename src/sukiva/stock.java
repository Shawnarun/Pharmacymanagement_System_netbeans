/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukiva;

import com.toedter.calendar.JTextFieldDateEditor;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Snake_Eye
 */
public class stock extends javax.swing.JInternalFrame {

  DefaultTableModel defaultTableModel = new DefaultTableModel();
  /**
     * Creates new form shawn
     */
    public stock() {
        initComponents();
        
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tsearch2.setBackground(new java.awt.Color(0,0,0,1));
        tdri.setBackground(new java.awt.Color(0,0,0,1));
          tdrn.setBackground(new java.awt.Color(0,0,0,1));

        tqua.setBackground(new java.awt.Color(0,0,0,1));
        tunp.setBackground(new java.awt.Color(0,0,0,1));
        tbn.setBackground(new java.awt.Color(0,0,0,1));
        tta.setBackground(new java.awt.Color(0,0,0,1));

        
        
        tsearch.setBackground(new java.awt.Color(0,0,0,0));
        tdis.setBackground(new java.awt.Color(0,0,0,0));
        
        scroll.setBackground(new java.awt.Color(0,0,0,1));
        scroll.getViewport().setBackground(new java.awt.Color(0,0,0,1));
        st.setBackground(new java.awt.Color(0,0,0,1));
     
        JTableHeader header = st.getTableHeader();
        header.setBackground(new java.awt.Color(0,0,0,0));
        st.getTableHeader().setFont(new Font("Times New Roman", Font.BOLD, 14));
        
    
        Object columns[] = {"Drugs Name", "EXP Date", "Distributor Name","Brand Name","Quantity"};
        defaultTableModel.setColumnIdentifiers(columns);
        st.setModel(defaultTableModel);
  
        
        ((JTextFieldDateEditor)texp1.getDateEditor()).setBackground(new java.awt.Color(0,0,0,1));
        ((JTextFieldDateEditor)texp1.getDateEditor()).setBorder(javax.swing.BorderFactory.createEmptyBorder());
        (texp1.getCalendarButton()).setBackground(new java.awt.Color(0,0,0,0));

        ((JTextFieldDateEditor)tdd.getDateEditor()).setBackground(new java.awt.Color(0,0,0,1));
        ((JTextFieldDateEditor)tdd.getDateEditor()).setBorder(javax.swing.BorderFactory.createEmptyBorder());
        (tdd.getCalendarButton()).setBackground(new java.awt.Color(0,0,0,0));

        ((JTextFieldDateEditor)tsear.getDateEditor()).setBackground(new java.awt.Color(0,0,0,1));
        ((JTextFieldDateEditor)tsear.getDateEditor()).setBorder(javax.swing.BorderFactory.createEmptyBorder());
        (tsear.getCalendarButton()).setBackground(new java.awt.Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        tsearch = new javax.swing.JComboBox<>();
        dri = new javax.swing.JLabel();
        exd = new javax.swing.JLabel();
        dis = new javax.swing.JLabel();
        unp = new javax.swing.JLabel();
        drn = new javax.swing.JLabel();
        qua = new javax.swing.JLabel();
        tdri = new javax.swing.JTextField();
        tqua = new javax.swing.JTextField();
        tunp = new javax.swing.JTextField();
        tsearch2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        dd = new javax.swing.JLabel();
        tdd = new com.toedter.calendar.JDateChooser();
        tsear = new com.toedter.calendar.JDateChooser();
        jButton4 = new javax.swing.JButton();
        scroll = new javax.swing.JScrollPane();
        st = new javax.swing.JTable();
        tdis = new javax.swing.JComboBox<>();
        tdrn = new javax.swing.JTextField();
        tbn = new javax.swing.JTextField();
        bn = new javax.swing.JLabel();
        ta = new javax.swing.JLabel();
        tta = new javax.swing.JTextField();
        texp1 = new com.toedter.calendar.JDateChooser();
        bg = new javax.swing.JLabel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(960, 560));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(176, 106, 179));
        jButton2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setText("Delete");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 80, 40));

        tsearch.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        tsearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Drug Name", "Drug ID", "Brand Name", "EXP Date", "Distributor", "Delivery Date" }));
        tsearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tsearch.setOpaque(false);
        getContentPane().add(tsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 140, 30));

        dri.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        dri.setForeground(new java.awt.Color(0, 0, 0));
        dri.setText("Drug ID");
        getContentPane().add(dri, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 30));

        exd.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        exd.setForeground(new java.awt.Color(0, 0, 0));
        exd.setText("EXP Date");
        getContentPane().add(exd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 120, 30));

        dis.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        dis.setForeground(new java.awt.Color(0, 0, 0));
        dis.setText("Distributor");
        getContentPane().add(dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 120, 30));

        unp.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        unp.setForeground(new java.awt.Color(0, 0, 0));
        unp.setText("Unit price");
        getContentPane().add(unp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 120, 30));

        drn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        drn.setForeground(new java.awt.Color(0, 0, 0));
        drn.setText("Drug Name");
        getContentPane().add(drn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 30));

        qua.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        qua.setForeground(new java.awt.Color(0, 0, 0));
        qua.setText("Quantity");
        getContentPane().add(qua, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 120, 30));

        tdri.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tdri.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tdri.setOpaque(false);
        tdri.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tdri, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 160, 20));

        tqua.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tqua.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tqua.setOpaque(false);
        tqua.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tqua, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, 20));

        tunp.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tunp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tunp.setOpaque(false);
        tunp.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tunp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 160, 20));

        tsearch2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tsearch2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tsearch2.setOpaque(false);
        tsearch2.setPreferredSize(new java.awt.Dimension(6, 22));
        tsearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearch2ActionPerformed(evt);
            }
        });
        getContentPane().add(tsearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 160, 30));

        jButton1.setBackground(new java.awt.Color(176, 106, 179));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 496, 110, -1));

        jButton3.setBackground(new java.awt.Color(176, 106, 179));
        jButton3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setText("Update");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 90, 40));

        dd.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        dd.setForeground(new java.awt.Color(0, 0, 0));
        dd.setText("Delivery Date");
        getContentPane().add(dd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 130, 30));

        tdd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tdd.setOpaque(false);
        tdd.setPreferredSize(new java.awt.Dimension(22, 6));
        getContentPane().add(tdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, 30));

        tsear.setBackground(new java.awt.Color(176, 106, 179));
        tsear.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tsear.setForeground(new java.awt.Color(176, 106, 179));
        tsear.setOpaque(false);
        tsear.setPreferredSize(new java.awt.Dimension(22, 6));
        getContentPane().add(tsear, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 160, 30));

        jButton4.setBackground(new java.awt.Color(176, 106, 179));
        jButton4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 204));
        jButton4.setText("Add");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 80, 40));

        scroll.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        scroll.setOpaque(false);

        st.setBackground(new java.awt.Color(176, 106, 179));
        st.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        st.setFont(new java.awt.Font("Ebrima", 0, 10)); // NOI18N
        st.setForeground(new java.awt.Color(0, 0, 0));
        st.setModel(new javax.swing.table.DefaultTableModel(
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
        st.setGridColor(new java.awt.Color(0, 0, 0));
        st.setOpaque(false);
        scroll.setViewportView(st);

        getContentPane().add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 610, 530));

        tdis.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tdis.setOpaque(false);
        getContentPane().add(tdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 30));

        tdrn.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tdrn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tdrn.setOpaque(false);
        tdrn.setPreferredSize(new java.awt.Dimension(6, 22));
        tdrn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdrnActionPerformed(evt);
            }
        });
        getContentPane().add(tdrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 160, 20));

        tbn.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tbn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tbn.setOpaque(false);
        tbn.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 160, 20));

        bn.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bn.setForeground(new java.awt.Color(0, 0, 0));
        bn.setText("Brand Name");
        getContentPane().add(bn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 120, 30));

        ta.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        ta.setForeground(new java.awt.Color(0, 0, 0));
        ta.setText("Total Amount");
        getContentPane().add(ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 120, 30));

        tta.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        tta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tta.setOpaque(false);
        tta.setPreferredSize(new java.awt.Dimension(6, 22));
        getContentPane().add(tta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 160, 20));

        texp1.setBackground(new java.awt.Color(176, 106, 179));
        texp1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        texp1.setForeground(new java.awt.Color(176, 106, 179));
        texp1.setOpaque(false);
        texp1.setPreferredSize(new java.awt.Dimension(22, 6));
        getContentPane().add(texp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, 30));

        bg.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bg.setForeground(new java.awt.Color(0, 0, 204));
        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sukiva/images/large.png"))); // NOI18N
        bg.setText("jLabel1");
        bg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tsearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearch2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsearch2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tdrnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdrnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tdrnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bn;
    private javax.swing.JLabel dd;
    private javax.swing.JLabel dis;
    private javax.swing.JLabel dri;
    private javax.swing.JLabel drn;
    private javax.swing.JLabel exd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel qua;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable st;
    private javax.swing.JLabel ta;
    private javax.swing.JTextField tbn;
    private com.toedter.calendar.JDateChooser tdd;
    private javax.swing.JComboBox<String> tdis;
    private javax.swing.JTextField tdri;
    private javax.swing.JTextField tdrn;
    private com.toedter.calendar.JDateChooser texp1;
    private javax.swing.JTextField tqua;
    private com.toedter.calendar.JDateChooser tsear;
    private javax.swing.JComboBox<String> tsearch;
    private javax.swing.JTextField tsearch2;
    private javax.swing.JTextField tta;
    private javax.swing.JTextField tunp;
    private javax.swing.JLabel unp;
    // End of variables declaration//GEN-END:variables
}
