/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.rest.demo.model;

/**
 *
 * @author Ruchira
 */
public class Student {

    private String id;
    private String studentName;
    private String address;

    public Student() {
    }

    public Student(String id, String studentName, String address) {
        this.id = id;
        this.studentName = studentName;
        this.address = address;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
