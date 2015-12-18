/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingfiletest;

import java.io.IOException;

/**
 *
 * @author Ari
 */
public class ReadingFileTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int SIZE = 0;
        char[][] letters = null;

        String file_name1 = "C:\\Users\\mwilson\\Documents\\NetBeansProjects\\ReadingFile\\letters1.txt";
        String file_name3 = "C:\\Users\\mwilson\\Documents\\NetBeansProjects\\ReadingFile\\output1.txt";
        try {

            //read first file into string array
            ReadingFile file = new ReadingFile(file_name1);
            String[] lettersLines = file.OpenFile();

            //store the size of the array
            SIZE = lettersLines.length;
            //create 2D array of predetermined size
            letters = new char[SIZE][SIZE];

            //convert the lines into a 2D array
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    letters[i][j] = lettersLines[i].charAt(j);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {

                System.out.print(letters[i][j]);
            }
             System.out.println();
        }
       
        //write to a file
         try {

            //read first file into string array
            ReadingFile file = new ReadingFile(file_name1);
            file.writeFile1(file_name3,"Hello World");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
}
