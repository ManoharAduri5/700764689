package com.example.demo.student;

import java.time.LocalDate;

public class student {
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public student(long l, String manohar, String mail, LocalDate localDate, int i) {
    }

    public student(Integer age,
                   LocalDate dob,
                   String email,
                   String name,
                   Long id) {
        this.age = age;
        this.dob = dob;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public student(String name,
                   String email,
                   LocalDate dob,
                   Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
