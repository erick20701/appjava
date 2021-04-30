/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makeapp;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author DELL
 */
public class Data implements Serializable{
    private String day1;
    private String name,note;
    private long money;
    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getDay1() {
        return day1;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public long getMoney() {
        return money;
    }
    
    
}
