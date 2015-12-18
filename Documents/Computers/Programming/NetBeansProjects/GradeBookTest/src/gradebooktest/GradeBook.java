/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradebooktest;

/**
 *
 * @author Ari
 */
class GradeBook {

    private String courseName; // course name for this GradeBook
   /* write code to declare a second String instance variable */
    private String instructorName;

    // constructor initializes courseName with String supplied as argument
    public GradeBook(String name, String instructor) {
        courseName = name; // initializes courseName
        instructorName = instructor;
    } // end constructor 

    // method to set the course name
    public void setCourseName(String name) {
        courseName = name; // store the course name
    } // end method setCourseName

    // method to retrieve the course name
    public String getCourseName() {
        return courseName;
    } // end method getCourseName

    /* write code to declare a get and a set method for the instructor’s name */
    public void setInstructorName(String name) {
        instructorName = name;
    }

    public String getInstructorName() {
        return instructorName;
    }

    // display a welcome message to the GradeBook user
    public void displayMessage() {
        // this statement calls getCourseName to get the 
        // name of the course this GradeBook represents
        System.out.printf("Welcome to the grade book for\n%s!\n",
                getCourseName());
        /* write code to output the instructor’s name */
        System.out.format("The instructor for this course is %s %n", getInstructorName());
    } // end method displayMessage
} // end class GradeBook
