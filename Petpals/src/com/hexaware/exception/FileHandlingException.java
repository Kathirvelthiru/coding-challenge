package com.hexaware.exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingException {
    public static void main(String[] args) {
        try {
            File file = new File("Pet.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(data);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}
