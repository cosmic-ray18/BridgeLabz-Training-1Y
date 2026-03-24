package com.gla.handling.Assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class IO_Exception {
     public static void main(String[] args) {
            Path file = Paths.get("data.txt");
         try {
             List<String> lines = Files.readAllLines(file);
             for (String line : lines) {
                 System.out.println(line);
             }
         }
             catch (IOException e){
                 System.err.println("File not found: " + e.getMessage());
             }

         }

     }

