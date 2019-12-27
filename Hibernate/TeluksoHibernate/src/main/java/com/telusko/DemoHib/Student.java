package com.telusko.DemoHib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int marks;

//    @OneToOne
//    private Laptop laptop;

    @ManyToMany(mappedBy="students")
    private List<Laptop> laptops = new ArrayList<Laptop>();

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptop(List<Laptop> laptops) {
        this.laptops = laptops;
    }
}
