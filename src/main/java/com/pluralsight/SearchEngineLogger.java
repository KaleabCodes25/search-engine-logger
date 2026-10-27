package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);











    }


    public static void writetxt(Scanner scanner){

        System.out.println("Enter a search term (X or x to exit): ");
        String input = scanner.nextLine();

        String line;
        try {
            while(!input.equalsIgnoreCase("x")) {
                BufferedWriter writer = new BufferedWriter(new FileWriter(input));


            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }


    }

}
