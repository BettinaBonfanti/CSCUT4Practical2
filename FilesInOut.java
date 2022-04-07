import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.io.File;  // Import the File class
import java.util.Scanner;  // Import the Scanner class
import java.io.FileNotFoundException;  // Import this class to handle errors

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
        File input;
        try {
            PrintWriter writer = new PrintWriter("formatted.txt");
            input = new File("input.txt");// Specify the filename (input).
            Scanner reader = new Scanner(input);// Set up a new Scanner to read the input file.
            while (reader.hasNextLine()) {
                String line = reader.nextLine();// Processing input file line by line.
                String delim=" "; //Setting white space as delimiter for split function

                System.out.println(line);
                String [] tokens = line.split(delim); //create an array of separate entries in each line
                    for (int t=0; t<tokens.length; t++) {
                        if (t == 0 || t == 1){
                            tokens[t] = formatString(tokens[t], false);
                        }
                        else {
                            tokens[t]= tokens[t].substring(0,2) + "/" + tokens[t].substring(2,4) + "/" + tokens[t].substring(4);
                        }
                    }
                String outputLine="";
                outputLine = outputLine.concat(tokens[0] + "\t" + tokens[1] + "\t" + tokens[2]);
                writer.println(outputLine);
            }
            writer.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred."); //handle exception if an error occurs
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

}// main
public String formatString(String inputString, boolean isAllCaps){
    if (isAllCaps){
        return inputString.toUpperCase();
    }
    else{
        return inputString.substring(0,1).toUpperCase() + inputString.substring(1);
    }
}

}// FilesInOut