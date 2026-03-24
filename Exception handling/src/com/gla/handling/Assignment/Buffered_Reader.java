package com.gla.handling.Assignment;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Buffered_Reader {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("info.txt"))){
        String line;
        while ((line = reader.readLine()) != null){
            System.out.println(line);
          }
        }
        catch (IOException e){
            System.out.println("Error reading file: "+e.getMessage());
        }
    }
}
