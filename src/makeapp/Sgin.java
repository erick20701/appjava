/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeapp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JLabel;

/**
 *
 * @author DELL
 */
public final class Sgin extends javax.swing.JPanel {

    

    /**
     * Creates new form Sgin
     */
    public Sgin() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseExited(evt);
            }
        });
        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 70, 70));

        jLayeredPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane2MouseExited(evt);
            }
        });
        add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, 60, 60));

        jLayeredPane3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLayeredPane3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLayeredPane3MouseExited(evt);
            }
        });
        add(jLayeredPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 40, 40));
        add(jLayeredPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 460, -1, -1));

        jLayeredPane5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane5MouseClicked(evt);
            }
        });
        add(jLayeredPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 520, 30, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel-button.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(897, 516, 60, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Backgrsgin.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 560));
    }// </editor-fold>//GEN-END:initComponents

   
    private void jLayeredPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseClicked
        // TODO add your handling code here:
        Menu.d1.setVisible(false);
        Menu.nhap1.setVisible(true);Menu.dkdemo=1;
    }//GEN-LAST:event_jLayeredPane1MouseClicked

    private void jLayeredPane1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseEntered
        // TODO add your handling code here:
        if (Menu.dkdemo==0) Menu.d1.setVisible(true);
        
    }//GEN-LAST:event_jLayeredPane1MouseEntered

    private void jLayeredPane1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseExited
        // TODO add your handling code here:
        Menu.d1.setVisible(false);
    }//GEN-LAST:event_jLayeredPane1MouseExited

    private void jLayeredPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane2MouseClicked
        // TODO add your handling code here:
        Menu.d2.setVisible(false);
        Menu.show1.setVisible(true);Menu.dkdemo=1;
    }//GEN-LAST:event_jLayeredPane2MouseClicked

    private void jLayeredPane2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane2MouseEntered
        // TODO add your handling code here:
        
         if (Menu.dkdemo==0) Menu.d2.setVisible(true);
    }//GEN-LAST:event_jLayeredPane2MouseEntered

    private void jLayeredPane2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane2MouseExited
        // TODO add your handling code here:
         Menu.d2.setVisible(false);
    }//GEN-LAST:event_jLayeredPane2MouseExited

    private void jLayeredPane3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane3MouseClicked
        // TODO add your handling code here:
        Menu.d3.setVisible(false);
        Menu.tieu1.setVisible(true);Menu.dkdemo=1;
    }//GEN-LAST:event_jLayeredPane3MouseClicked

    private void jLayeredPane3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane3MouseEntered
        // TODO add your handling code here:
        if (Menu.dkdemo==0) Menu.d3.setVisible(true);
    }//GEN-LAST:event_jLayeredPane3MouseEntered

    private void jLayeredPane3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane3MouseExited
        // TODO add your handling code here:
        Menu.d3.setVisible(false);
    }//GEN-LAST:event_jLayeredPane3MouseExited

    private void jLayeredPane5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLayeredPane5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    // End of variables declaration//GEN-END:variables
}
