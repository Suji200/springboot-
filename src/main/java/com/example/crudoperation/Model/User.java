package com.example.crudoperation.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "datas")
public class User {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column
    private long id;
    @Column
    private String firsName;
    @Column
    private   String lastName;
    @Column
    private int age;
    @Column
    private String occupation;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
