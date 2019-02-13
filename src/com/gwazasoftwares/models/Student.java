package com.gwazasoftwares.models;

public class Student {
   private String name;
   private String regNo;
   private int yeaOfStudy;

    public Student() {
    }

    public Student(String name, String regNo, int yeaOfStudy) {
        this.name = name;
        this.regNo = regNo;
        this.yeaOfStudy = yeaOfStudy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public int getYeaOfStudy() {
        return yeaOfStudy;
    }

    public void setYeaOfStudy(int yeaOfStudy) {
        this.yeaOfStudy = yeaOfStudy;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo='" + regNo + '\'' +
                ", yeaOfStudy=" + yeaOfStudy +
                '}';
    }
}
