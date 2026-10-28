package com.pluralsight;

import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //prompt user for name of the story they want to look up
        System.out.println("Enter the name of a story: ");
        String fileName = keyboard.nextLine();

        try(BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/" + fileName))){

            String line;
            int lineNumber = 1;

            while((line = reader.readLine()) !=null){
                System.out.println(lineNumber + ". "+line);
                lineNumber++;
            }
        }catch (IOException e){
            System.out.println("Error: Could not find or read the file");
        }
        keyboard .close();
    }
}
