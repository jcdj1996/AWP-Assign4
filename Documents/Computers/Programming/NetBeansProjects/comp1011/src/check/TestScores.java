/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

/**
 * This class is the object necessary to answer quetion 1
 * @author Ari
 */
public class TestScores {

    double[] scores;

    /**
     * Constructs a new Test Scores Object based on size
     * @param classSize
     */
    public TestScores(int classSize) {
        scores = new double[classSize];
    }
    
    /**
     * updates a entry in the array
     * @param score the grade to be entered
     * @param studentNumber array location of the student
     * @return true if the update succeeds, else false
     */
    public boolean setScore (double score, int studentNumber){
        if (score < 0 ){
            return false;
        }
        this.scores[studentNumber] = score;
        return true;
    }
    
    /**
     * Returns the grade of a student
     * @param studentNumber the array location of a student
     * @return the grade of the student
     */
    public double getScore (int studentNumber){
        return this.scores[studentNumber];
    }
    
    /**
     * calculates the average of all the grades in the array
     * @return average of the grades
     */
    public double average(){
        double sum = 0;
        for (int i = 0; i < scores.length; i++){
            sum += scores[i];
        }
        return sum / this.scores.length;
    }
    
}
