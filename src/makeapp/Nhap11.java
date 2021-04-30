/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeapp;

import java.awt.Component;
import java.io.File;
import java.io.PrintWriter;
import static java.lang.Float.NaN;

import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class Nhap11 extends javax.swing.JPanel {

    private Component rootPane;

    /**
     * Creates new form Nhap11
     */
    public Nhap11() {
        initComponents();
        cDay.setVisible(false);
        cMoney.setVisible(false);
        cName.setVisible(false);
        cNote.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nhapday1 = new javax.swing.JTextField();
        nhapname1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nhapmoney1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nhapnote1 = new javax.swing.JTextField();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel7 = new javax.swing.JLabel();
        cDay = new javax.swing.JLabel();
        cName = new javax.swing.JLabel();
        cMoney = new javax.swing.JLabel();
        cNote = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelnhap = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(nhapday1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 234, -1));
        add(nhapname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 234, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ngày :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Người Thêm :");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 31));
        add(nhapmoney1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 234, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Số Tiền : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ghi Chú : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));
        add(nhapnote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 234, -1));

        jLayeredPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane2MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back-arrow (1).png"))); // NOI18N
        jLayeredPane2.add(jLabel8);
        jLabel8.setBounds(0, 0, 40, 40);

        add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 40, 40));

        jLayeredPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLayeredPane1MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/piggy-bank (1).png"))); // NOI18N
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(10, 0, 40, 40);

        add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 50, 40));

        cDay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checked.png"))); // NOI18N
        add(cDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 40));

        cName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checked.png"))); // NOI18N
        add(cName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, -1, 40));

        cMoney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checked.png"))); // NOI18N
        add(cMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 40));

        cNote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/checked.png"))); // NOI18N
        add(cNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 156, -1, 50));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        panelnhap.setForeground(new java.awt.Color(255, 255, 255));
        panelnhap.setName(""); // NOI18N
        add(panelnhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void jLayeredPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane2MouseClicked
        // TODO add your handling code here:
        Menu.nhap1.setVisible(false);Menu.dkdemo=0;
        nhapday1.setText("");
        nhapname1.setText("");
        nhapmoney1.setText("");
        nhapnote1.setText("");
        cDay.setVisible(false);
        cMoney.setVisible(false);
        cName.setVisible(false);
        cNote.setVisible(false);
    }//GEN-LAST:event_jLayeredPane2MouseClicked
    
    private void jLayeredPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLayeredPane1MouseClicked
        // TODO add your handling code here:
        int c1=ktranhapday();
        int c2=ktranhapname();
        int c3=ktranhapmoney();
        int c4=ktranhapnote();
        if (c1+c2+c3+c4<4){
            JOptionPane.showMessageDialog(rootPane,"Thông Tin Không Hợp Lệ");
            if (c1==1) cDay.setVisible(true);
            else cDay.setVisible(false);
            if (c2==1) cName.setVisible(true);
            else cName.setVisible(false);
            if (c3==1) cMoney.setVisible(true);
            else cMoney.setVisible(false);
            if (c4==1) cNote.setVisible(true);
            else cNote.setVisible(false);
        }
        else
        {
        cDay.setVisible(true);
        cMoney.setVisible(true);
        cName.setVisible(true);
        cNote.setVisible(true);
        JOptionPane.showMessageDialog(rootPane,"Đã Lưu Thông Tin");
        Data s = new Data();
        s.setDay1(nhapday1.getText());
        s.setName(nhapname1.getText());
        s.setMoney(Long.parseLong(nhapmoney1.getText()));
        s.setNote(nhapnote1.getText());
        Menu.list.add(s);
        if (Menu.show1.tv!=0){Menu.show1.tv+=s.getMoney();
        Menu.show1.cl+=s.getMoney();}
        ghidata();
        Menu.show1.model.addRow(new Object[]{
            s.getDay1(),s.getName(),s.getMoney(),s.getNote()
        });
        }
    }//GEN-LAST:event_jLayeredPane1MouseClicked
    private int ktranhapname(){
        if (nhapname1.getText().length()<1) return 0;
        return 1;
    }  
    private int ktranhapmoney(){
        long d=0;
        if (nhapmoney1.getText().length()<1) return 0;
        d=Long.parseLong(nhapmoney1.getText());
        if ((d!=0)&&d<500) return 0;
        if (d<500) return 0;
        return 1;
    }  
     private int ktranhapnote(){
        if (nhapnote1.getText().length()<1) return 0;
        return 1;
    }  
    
    private int ktranhapday(){
        if (nhapday1.getText().length()!=10) return 0;
        if ((nhapday1.getText().charAt(2)!='/')||(nhapday1.getText().charAt(5)!='/')) return 0;
        return 1;
    }  
    public void ghidata(){
        try (PrintWriter pw = new PrintWriter(new File("Data1.txt"))) {
            for (Data s: Menu.list){
                pw.println(s.getDay1());
                   pw.println(s.getName());
                   pw.println(s.getMoney());
                   pw.println(s.getNote());
            }
        } catch (Exception e) {
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cDay;
    private javax.swing.JLabel cMoney;
    private javax.swing.JLabel cName;
    private javax.swing.JLabel cNote;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JTextField nhapday1;
    private javax.swing.JTextField nhapmoney1;
    private javax.swing.JTextField nhapname1;
    private javax.swing.JTextField nhapnote1;
    private javax.swing.JLabel panelnhap;
    // End of variables declaration//GEN-END:variables
}
