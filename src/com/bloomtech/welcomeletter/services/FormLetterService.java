package com.bloomtech.welcomeletter.services;
import com.bloomtech.welcomeletter.fileIO.FileManager;
import com.bloomtech.welcomeletter.models.Employee;
import java.io.*;
import java.io.IOException;
public class FormLetterService {
    private static final FileManager fileManager = new FileManager();

    public void generateWelcomeLetter(Employee employee) throws IOException {
        //TODO: Get template text from resources
        String txt = fileManager.getTextFromFile("LetterTemplate");
        //TODO: Replace []ed text with correct info

        txt = txt.replace("[company name]", employee.getCompany().getCompanyname())
                .replace("[fullname]", employee.getFirstname() + " " + employee.getLastname())
                .replace("[startdate]", String.valueOf(employee.getStartdate()))
                .replace("[startingsalary]", String.valueOf(employee.getSalary()))
                .replace("[company starttime]", employee.getCompany().getCompanyname());


        //TODO: Write finalized String to file
        fileManager.writeTextToFile("WelcomeTestEmployee", txt);
    }
}
