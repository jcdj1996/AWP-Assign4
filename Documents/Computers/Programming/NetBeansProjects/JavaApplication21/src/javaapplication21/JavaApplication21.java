package javaapplication21;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Ari
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //uncomment lines to see the results
        scanThis("files/letters1.txt", "files/words1.txt");
        scanThis("files/letters2.txt", "files/words2.txt");
        scanThis("files/letters3.txt", "files/words3.txt");
        scanThis("files/letters4.txt", "files/words4.txt");
    }

    /**
     * I only require one method is required with this technique I could have made more
     * however I would be calling methods inside of other methods and I believe
     * this would be extremely messy to look a
     */
    private static void scanThis(String fileName, String wordDoc) throws IOException {
        Scanner s = null;

        /**
         * This first reading counts the number of lines in the letter scrambled
         * puzzle. This is is used to build an array that can be used by the
         * program, count is used to store the size of the array we are to
         * build. These would have been two separate methods
         */
        int count = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (s.hasNext()) {
                s.next();
                count++;
            }
        } catch (Exception e) {
            System.out.format("Bad puzzle file name%n");
            System.exit(0);
        } finally {
            if (s != null) {
                s.close();
            }
        }

        /**
         * Once the size is known its time to build the array to store all the
         * letters. letters[][] is the 2D array that will hold the information.
         * Count is then reset and used again for the first dimension of the
         * letters array. line is used to convert the line of text into the
         * arrays second dimension. The next section of code reads each line and
         * then stores it in the newly created array.
         */
        char[][] letters = new char[count][count];
        String line;    //holds the l

        count = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            while (s.hasNext()) {
                line = s.next();
                for (int i = 0; i < line.length(); i++) {
                    letters[count][i] = line.charAt(i);
                }
                count++;
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

        /**
         * Next the same procedure is used to import the word list. word count
         * is used to count the number of words found in the list
         */
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(wordDoc)));
            while (s.hasNext()) {
                s.next();
                wordCount++;
            }
        } catch (Exception e) {
            System.out.format("Bad word list file name%n");
            System.exit(0);
        } finally {
            if (s != null) {
                s.close();
            }
        }

        /**
         * Now that the words have been counted words[] will hold the list of
         * words and wordCount is reset.
         */
        String[] words = new String[wordCount];
        wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(wordDoc)));
            while (s.hasNext()) {
                words[wordCount] = s.next();
                wordCount++;
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }

        /**
         * If both letters[][] and words[] have been populated the next section
         * searches the entire words puzzle for each word. l wordFound[] keeps
         * track if a word is found, in the case a word is not found the user
         * will receive that message. C is the abbreviation of letter counter
         * and is used each time the first letter of a word is found to
         * determine how many letters are found in the puzzle. maxLetterTrack
         * holds the largest sequence of letters that has been found in the
         * puzzle. if the word was not found after searching through th whole
         * puzzle the user is presented with the percentage of the word that was
         * found. direction[][] is used to tell the user which direction the
         * program found the word in. Since there is only eight possible
         * directions it is possible to use a store all the names in a 3x3 array
         * to reference later direction[][] stores all the directions based on
         * the way the program will search.
         */
        boolean[] wordFound = new boolean[wordCount];//hold if the word was found
        int lC; //abbreviated letterCounter
        int maxLetterTrack;//tracks number of letters found
        String direction[][] = new String[][]{{"up left", "up", "up right"}, {"left", null, "right"}, {"down left", "down", "down right"}};

        //Loop to keep track of the word being searched
        for (int i = 0; i < wordCount; i++) {

            //Each time a new word is accessed the max tracked letters is reset to 1
            maxLetterTrack = 0;

            //Loops to go through each letter of the puzzle 
            for (int dDir = 0; dDir < count; dDir++) {//all letters rows:
                for (int rDir = 0; rDir < count; rDir++) {//all letters columsn: rightDirection

                    //if the letter in the puzzle is the same as the first letter letter case is ignored
                    if (letters[dDir][rDir] == words[i].charAt(0) || (char) letters[dDir][rDir] + 32 == words[i].charAt(0)) {
                        maxLetterTrack = 0;
                        //Loops to cycle through all the directions around the matched letter
                        for (int d = -1; d <= 1; d++) {
                            for (int r = -1; r <= 1; r++) {

                                //if the direction is not increasing vertically or horizontally this pushes into the next direction
                                if (d == 0 & r == 0) {
                                    //continue will skip this iteration and move the inside loop to the next number
                                    continue;
                                }

                                // for each direction the letter counter is reset to one this skips the rechecking of the first letter
                                lC = 1;

                                //loop checks if the search is still inside the boundary of the puzzle, 
                                //0 is the boundary for the top and left sides of the puzzle, count is boundary for the right and bottom sides of the puzzle 
                                while (dDir + d * lC >= 0 && dDir + d * lC < count && rDir + r * lC >= 0 && rDir + r * lC < count
                                        //if the search is stil in boundary the letter will be searched, the && will short circuit not look if the boundary has been exceeded
                                        // this prevents array out of bounds errors
                                        && (letters[dDir + d * lC][rDir + r * lC] == words[i].charAt(lC) | (char) letters[dDir + d * lC][rDir + r * lC] + 32 == words[i].charAt(lC))) {

                                    //if the letter count has matched the length of the word
                                    if (lC == words[i].length() - 1) {

                                        //outputs directly if the word was found
                                        System.out.format("Word %s found at location [%d,%d] searching %s.%n", words[i], dDir, rDir, direction[1 + d][1 + r]);

                                        //changes the lowercase letters to capitals if they have not been already
                                        while (lC >= 0) {
                                            if ((int) letters[dDir + d * lC][rDir + r * lC] >= 97) { //if not capital
                                                letters[dDir + d * lC][rDir + r * lC] = (char) ((int) words[i].charAt(lC) - 32);
                                            }
                                            lC--;
                                        }

                                        //disables %complete
                                        wordFound[i] = true;

                                        //breaks out of the direction moves onto the next word
                                        break;
                                    }
                                    lC++;
                                }

                                //if the letter count has exceeded the maximum found at any point the tracking number is overwritten
                                maxLetterTrack = (lC > maxLetterTrack) ? lC + 1 : maxLetterTrack;
                            }
                        }
                    }
                }
            }

            //if the word was not found and the tracking number is greater than one the user will see how much of the word was found
            if (!wordFound[i] && maxLetterTrack > 1) {
                System.out.format("%3.2f%% of %s has been found.%n", ((double) (maxLetterTrack - 1) / words[i].length()) * 100, words[i]);
            } //if the word was not found and the tracker is still at one the user will recieve a different message
            else if (!wordFound[i] && maxLetterTrack == 1) {
                System.out.format("Word %s not found.%n", words[i]);
            }
        }

        //prints out the array as requested
        System.out.format("%n ****Printing the array with Capitals****%n%n");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                System.out.format("%c", letters[i][j]);
            }
            System.out.format("%n");
        }
    }
}
