package com.company.controllers;
import com.company.models.Student;


import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        List<Student> studentList = new ArrayList<>();
        GradeLoader gradeLoader = new GradeLoader();
        List<String> students = gradeLoader.getStudents();

        for (String student: students) {
            Student newStudent = new Student(student);
            newStudent.assignScore();
            studentList.add(newStudent);
        }

        for (Student currentStudent: studentList) {
            currentStudent.getGrade();
        }

    }
}
