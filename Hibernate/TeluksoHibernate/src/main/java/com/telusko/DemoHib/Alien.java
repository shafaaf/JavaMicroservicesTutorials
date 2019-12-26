package com.telusko.DemoHib;

import javax.persistence.*;

@Entity
@Table(name="alien_table2")
public class Alien {

    @Id
    private int aid;

    @Transient
    private String aname;

    @Column(name="alien_color")
    private String color;

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public String getAname() {
        return aname;
    }
    public void setAname(String aname) {
        this.aname = aname;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
