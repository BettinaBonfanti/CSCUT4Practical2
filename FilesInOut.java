import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.io.File;  // Import the File class
import java.util.Scanner;  // Import the Scanner class

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {

        File input = new File("Macintosh HD\u2069 ▸ \u2068Users\u2069 ▸ \u2068bettina\u2069 ▸ \u2068IdeaProjects\u2069 ▸ \u2068CSCUT4Practical2\u2069"); // Specify the filename (input)
        File input = new File("formatted.txt");// Specify the filename (output).
        // Initially it will be easier to hardcode suitable file names.

        
        String line = myObj.nextLine();// Processing line by line would be sensible here.
        System.out.print(line);// Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOut
