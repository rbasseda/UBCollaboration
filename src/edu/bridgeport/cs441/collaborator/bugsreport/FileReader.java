/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package filereader;

package edu.bridgeport.cs441.collaborator.bugsreport;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.System.in;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Kai
 */
public class FileReader {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
	public static void read(String[] args) {
        String input = "test.txt",fileContents = "",searchWord= "",curLine="";
        ArrayList<String> fileLines = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the path to file");
        input = scan.nextLine();
        
        try {
            scan = new Scanner(new File(input));
            
            while(scan.hasNextLine()) {
                curLine = scan.nextLine();
                fileContents+=curLine;
                fileLines.add(curLine);
            }
            scan.close();
            // TODO code application logic here
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while(!searchWord.equals("q"))
        {
            curLine = "";
            scan = new Scanner(System.in);
            System.out.println("Enter the String to search for or q to quit");
            searchWord = scan.nextLine();
            int i = 0;
            Pattern p = Pattern.compile(searchWord);
            Matcher m = p.matcher( fileContents );
            while (m.find()) {
                i++;
            }
            int x = 1;
            for(String element : fileLines)
            {
                if(element.contains(searchWord))
                {
                    curLine += x + " ";
                }
                x++;
            }
            System.out.println("The word occurs "+i+" time(s) in the file");
            System.out.println(searchWord + " occurs in "+curLine+" line(s) of the file");
        }
        
    }
    
}
