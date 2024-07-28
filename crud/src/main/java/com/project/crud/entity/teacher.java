package com.project.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "teacher")
public class teacher {
     @Id
     @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_seq_gen")
     @SequenceGenerator(name = "my_seq_gen", sequenceName = "my_seq", allocationSize = 1)
     @Column(name="teacher_id", length = 11)
     private int teacherid;

    @Column(name="teacher_name", length = 50)
     private String teachername;

    @Column(name="phone", length = 12)
     private String phone;

        //constructr


    public teacher(int teacherid, String teachername, String phone) {
        this.teacherid = teacherid;
        this.teachername = teachername;
        this.phone = phone;
    }

    public teacher(String teachername, String phone) {
        this.teachername = teachername;
        this.phone = phone;
    }

    public teacher() {
    }

    public int getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "teacherid=" + teacherid +
                ", teachername='" + teachername + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
