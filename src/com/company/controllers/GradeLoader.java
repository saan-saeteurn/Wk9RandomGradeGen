package com.company.controllers;
import com.company.views.UserInput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class GradeLoader {
    private BufferedReader in;
    public List<String> students;

    public GradeLoader() throws FileNotFoundException {
        UserInput userInput = new UserInput();
        String fileName = "src/";
        Path thePath = Paths.get(fileName + userInput.fileName);
        in = new BufferedReader(new FileReader(String.valueOf(thePath)));

        students = new ArrayList<>();
        String line = null;

        try{
            line = in.readLine();

            while(line != null) {
                students.add(line);
                line = in.readLine();
            }

            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getStudents() {
        return students;
    }

}
