package com.company.views;

import java.util.Scanner;

public class UserInput {

    public String fileName;

    public UserInput() {
        System.out.print("Enter student file: ");
        Scanner input = new Scanner(System.in);
        fileName =  input.next();
    }

}
