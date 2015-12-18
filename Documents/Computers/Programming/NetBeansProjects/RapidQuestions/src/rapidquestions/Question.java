/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rapidquestions;

import AristotleToolBox.Check;
import AristotleToolBox.DRY;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Ari
 */
public class Question {

    private String question = "";
    private ArrayList<String> answers = new ArrayList<>();
    private String correctAnswer;

    Question() {
    }

    Question(String question, String[] answers, String correctAnswer) {
        if (Check.isNotEmptyString(question, new String[]{})
                && answers.length != 0
                && Check.isNotEmptyString(correctAnswer, new String[]{})) {
            setQuestion(question);
            setAnswer(answers);
            setCorrect(correctAnswer);
        } else {
            DRY.errorMsg(new String[]{"Dude thats some empty fields your passing",
                "Don't give me an empty feidl!"});
        }
    }

    public boolean promptQuestion() {
        if (correctAnswer.equals(DRY.requestSpecificAnswer(getQuestion() + "\n" + getAnswers()).toUpperCase())) {
            System.out.println("You got the right answer!");
            return true;
        }
        System.out.println("WRONG!");
        return false;

    }

    private String getQuestion() {
        return this.question;
    }

    private String getAnswers() {
        String allAnswers = "";
        int counter = 64;
        for (String answer : this.answers) {
            allAnswers += (char) ++counter + ": " + answer + "\n";
        }
        return allAnswers;
    }

    private boolean setQuestion(String question) {
        this.question = question;
        return true;
    }

    private boolean setAnswer(String[] answer) {
        if (answer.length != 0) {
            this.answers.addAll(Arrays.asList(answer));
            return true;
        }
        return false;
    }

    private boolean setCorrect(String correctAnswer) {
        if (Check.isNotEmptyString(correctAnswer, new String[]{"Dude thats some empty fields your passing",
            "Don't give me an empty feidl!"})) {
            int counter = 64;
            for (String a : answers) {
                ++counter;
                if (correctAnswer.equalsIgnoreCase(a)) {
                    this.correctAnswer = String.format("%s", (char) counter);
                    return true;
                }
            }
            
        }
        return false;
    }

}
