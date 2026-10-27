package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class SearchEngineLogger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        writetxt(scanner);











    }

    public static void writetxt(Scanner scanner){


        String line;
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("logs.txt"));
            while(true) {
                System.out.print("Enter a search term (X or x to exit): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("x")){
                    break;
                }
                writer.write(input);
                writer.newLine();

            }
            writer.close();
        }catch (Exception e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }

    }

}
