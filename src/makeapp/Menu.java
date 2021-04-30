/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeapp;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;


/**
 *
 * @author DELL
 */

public final class Menu {
    public JFrame f = new JFrame("");
    public static ArrayList <Data> list;
    public static int dkdemo=0;
    public static int dma=0;
    public static long ma=0;
    public static Sgin sgin1 = new Sgin();
    public static Nhap11 nhap1 = new Nhap11();
    public static Tieu tieu1 = new Tieu();
    public static Show11 show1 = new Show11();
    public static DemoNhap d1 = new DemoNhap();
    public static DemoShow d2 = new DemoShow();
    public static DemoTieu d3 = new DemoTieu();
    public static Pass pass = new Pass();
    public Menu(){
        list = new ArrayList <>();
        docdata();
        f.setSize(960, 600);
        f.setResizable(false);
        f.add(pass);
        f.add(d1);f.add(d2);f.add(d3);f.add(tieu1);
        f.add(nhap1);
        f.add(show1);
        f.add(sgin1);
        show1.setBounds(165, 72, 660, 340);
        nhap1.setBounds(271,115 , 400, 260);
        tieu1.setBounds(271,115 , 400, 260);
        pass.setBounds(1, 1, 960, 560);
        d1.setBounds(515,127 , 89, 18);
        d2.setBounds(414,220 , 82, 30);
        d3.setBounds(650,205 , 82, 30);
        sgin1.setVisible(false);
        nhap1.setVisible(false);
        show1.setVisible(false);tieu1.setVisible(false);
        d1.setVisible(false);
        d2.setVisible(false);
        d3.setVisible(false);
        pass.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
    }
    public void docdata(){
        
        try (Scanner sc = new Scanner(new File("Data1.txt"))) {
           
                while (sc.hasNext()){
                    Data s = new Data();
                    s.setDay1(sc.nextLine());
                    s.setName(sc.nextLine());
                    s.setMoney(Long.parseLong(sc.nextLine()));
                    s.setNote(sc.nextLine());
                    this.list.add(s);
                }
            
        } catch (Exception e) {
        }
        
    }
}
