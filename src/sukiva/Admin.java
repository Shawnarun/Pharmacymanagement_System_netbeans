/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sukiva;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Snake_Eye
 */
public class Admin extends javax.swing.JFrame {
    int xm;
    int ym;

    /**
     * Creates new form Admin
     */
    public Admin() {
        initComponents();
               setBackground(new Color(0,0,0,0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JLabel();
        distributor = new javax.swing.JButton();
        employer = new javax.swing.JButton();
        cheque = new javax.swing.JButton();
        accounts1 = new javax.swing.JButton();
        stock = new javax.swing.JButton();
        q = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        admin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(150, 30));
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sukiva/images/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 40));

        distributor.setBackground(new java.awt.Color(138, 104, 191));
        distributor.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        distributor.setText("Distributor");
        distributor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        distributor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributorActionPerformed(evt);
            }
        });
        getContentPane().add(distributor, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, 40));

        employer.setBackground(new java.awt.Color(138, 104, 191));
        employer.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        employer.setText("Bank");
        employer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        employer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employerActionPerformed(evt);
            }
        });
        getContentPane().add(employer, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 70, 160, 40));

        cheque.setBackground(new java.awt.Color(176, 106, 179));
        cheque.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        cheque.setText("Cheque");
        cheque.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        cheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequeActionPerformed(evt);
            }
        });
        getContentPane().add(cheque, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 160, 40));

        accounts1.setBackground(new java.awt.Color(138, 104, 191));
        accounts1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        accounts1.setText("Cash In Hand");
        accounts1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        accounts1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accounts1ActionPerformed(evt);
            }
        });
        getContentPane().add(accounts1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 160, 40));

        stock.setBackground(new java.awt.Color(176, 106, 179));
        stock.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        stock.setText("Stock");
        stock.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockActionPerformed(evt);
            }
        });
        getContentPane().add(stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 160, 40));

        q.setOpaque(false);
        q.setPreferredSize(new java.awt.Dimension(960, 560));
        getContentPane().add(q, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 960, 560));

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, 30, 20));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 30, 20));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Admin");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 30, 140, 20));

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 1000, 50));

        admin.setBackground(new java.awt.Color(176, 106, 179));
        admin.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sukiva/images/admin.png"))); // NOI18N
        admin.setText("jLabel1");
        admin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 999, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
        
         this.dispose();
         new welcome().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        for(double i=0.0;i<1.0;i=i+0.1)
        {
            String val=i+"";
            float f=Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(50);
            }
            catch(Exception e){
            }
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockActionPerformed
        // TODO add your handling code here:
        q.removeAll();
        stock ne = new stock();
        q.add(ne).setVisible(true);
     
    }//GEN-LAST:event_stockActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        JFrame Frame = new JFrame();
         if (JOptionPane.showConfirmDialog( Frame,"confirm if you Want to Exit","SUKYVA PHARMACY",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void chequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequeActionPerformed
        // TODO add your handling code here:
         q.removeAll();
        cheque ne = new cheque();
        q.add(ne).setVisible(true);
    }//GEN-LAST:event_chequeActionPerformed

    private void employerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employerActionPerformed
        // TODO add your handling code here:CashinHand
         q.removeAll();
        Bank ne = new Bank();
        q.add(ne).setVisible(true);
    }//GEN-LAST:event_employerActionPerformed

    private void distributorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributorActionPerformed
        // TODO add your handling code here:
        q.removeAll();
        distributor ne = new distributor();
        q.add(ne).setVisible(true);
    }//GEN-LAST:event_distributorActionPerformed

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        // TODO add your handling code here:
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x - xm, y - ym);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        xm=evt.getX();
        ym=evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void accounts1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accounts1ActionPerformed
        // TODO add your handling code here:
        q.removeAll();
        CashinHand ne = new CashinHand();
        q.add(ne).setVisible(true);
    }//GEN-LAST:event_accounts1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
          q.removeAll();
        dashboard ne = new dashboard();
        q.add(ne).setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accounts1;
    public static javax.swing.JLabel admin;
    private javax.swing.JLabel back;
    private javax.swing.JButton cheque;
    private javax.swing.JButton distributor;
    private javax.swing.JButton employer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JPanel q;
    private javax.swing.JButton stock;
    // End of variables declaration//GEN-END:variables
}
