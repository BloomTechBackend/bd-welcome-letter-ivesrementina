package com.bloomtech.welcomeletter.fileIO;
import com.bloomtech.welcomeletter.models.Employee;
import com.bloomtech.welcomeletter.services.FormLetterService;

import java.io.*;
import java.util.Scanner;
public class FileManager {
    public FileManager() {
    }

    public String getTextFromFile(String filename) {
        File file = new File("src/resources/" + filename + ".txt");
        String returnString = "";
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                returnString += line + "\n";
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return returnString;
    }

    public void writeTextToFile(String outFileName, String text) {
        File file = new File("src/resources/out/" + outFileName + ".txt");
        try {

            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(text);

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}