package QuizGame;

import java.util.Scanner;

public class QuizGame {
    public static void main(String args[]) {
        String[][] quiz = {
                { "What is the Longest river in the world?", "Nile" },
                { "Which is India's first super Computer?", "Param8000" },
                { "Which bank is called nankers Bank of india?", "Reserve Bank of India" },
        };
        int score = 0;

        for (int i = 0; i < quiz.length; i++) {
            String question = quiz[i][0];
            String answer = quiz[i][1];

            System.out.println(question);
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The answer is " + answer + ".");
            }
        }
        System.out.println("Your Final score is " + score + " out of " + quiz.length + ".");
    }
}
