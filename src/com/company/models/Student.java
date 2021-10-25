package com.company.models;

import java.util.Random;

public class Student {
    public String name;
    public String grade;
    public int percentage;

    public Student(String name) {
        this.name = name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public void assignScore() {
        int low = 0;
        int high = 100;
        Random random = new Random();
        percentage = random.nextInt(high-low) + low;

        if (percentage >= 90)
            grade = "A";
        else if (percentage >= 80 && percentage < 89)
            grade = "B";
        else if (percentage >= 70 && percentage < 79 )
            grade = "C";
        else if (percentage >= 60 && percentage < 69)
            grade = "D";
        else
            grade = "F";
    }

    public void getGrade() {
        System.out.println("\nName: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Percentage: " + Double.valueOf(percentage) + " %");
    }
}
