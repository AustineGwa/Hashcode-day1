package com.gwazasoftwares;

import com.gwazasoftwares.models.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
   static private List<Student> thirdYears = new ArrayList<>();

    public static void main(String[] args) {
	    thirdYears.add(new Student("Austine","SIT/001",3));
        thirdYears.add(new Student("Mosses","SIT/002",3));
        thirdYears.add(new Student("Vivian","SIT/003",4));


       // printThird(thirdYears);
        printAll();
        Student searchedStudent = getStudentByName("Mosses");
        searchedStudent.setName("Joshua");

        System.out.println("updated........");
        printAll();
    }

    private static Student getStudentByName(String searchName) {
         //thirdYears.stream().filter(student -> student.getName() == searchName).forEach(System.out::println);
        Student searchedStudent = new Student();
        for(Student student : thirdYears){
            if(student.getName().equals(searchName)){
                searchedStudent = student;
            }
        }
        return  searchedStudent;

    }

    private static void printThird(List<Student> thirdYears) {
        //thirdYears.stream().filter(student -> student.getYeaOfStudy() ==3).forEach(System.out::println);
        for(int i=0; i<thirdYears.size(); i++){

            System.out.println(thirdYears);

        }
    }


    private static void printAll() {
        for(Student student : thirdYears){
            System.out.println(student);
        }
    }
}
