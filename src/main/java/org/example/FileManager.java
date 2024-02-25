package org.example;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileManager {

    public void saveToFile(String fileName, ArrayList<Integer> list){
        try {
            PrintWriter writer = new PrintWriter(fileName);
            writer.println(list);
            writer.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public FileManager() {
    }
}
