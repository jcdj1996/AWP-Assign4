/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapidquestions;

import java.util.ArrayList;

/**
 *
 * @author Ari
 */
public class RapidQuestions {

    //Constants
    private static String[] TRUE_OR_FALSE = new String[]{"True", "False"};

    //Variables
    private static ArrayList<Question> questions = new ArrayList<>();

    public static void main(String[] args) {

        questions.add(new Question("Until the 1980s, project management primarily focused on providing schedule and resource data to top management in the military, computer, and construction industries.",
                TRUE_OR_FALSE, "True"));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));
        questions.add(new Question("",
                "".split("\n"), ""));

        for (Question q : questions) {
            while (!q.promptQuestion());
        }

    }

}
