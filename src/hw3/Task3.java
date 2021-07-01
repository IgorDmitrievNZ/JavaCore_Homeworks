package hw3;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();


    public static void main(String[] args) {

//        guessNumber();  // Launch first game
        guessPassword();  // Launch second game

    }

    /**
     * # Task 1
     */

    public static void guessNumber() {
        int restart;
        int count = 0;
        int answer = random.nextInt(10);

        while (true) {
            if (count < 3) {
                System.out.println("Guess a number from 0 to 9");
                int userAnswer = sc.nextInt(10);
                count++;
                if (userAnswer > answer) {
                    System.out.println("Too big number");
                }
                if (userAnswer < answer) {
                    System.out.println("To small number");
                }
                if (userAnswer == answer) {
                    System.out.println("Congratulations you won!");
                    count = 3;
                }
            } else {
                System.out.println("GAME OVER");
                System.out.println("restart game press 1 or 0 for exit");
                restart = sc.nextInt(2);
                if (restart == 0) {
                    System.out.println("SEE YOU SOON MATE!");
                    break;
                }
                if (restart == 1) {
                    count = 0;
                }
            }
        }
    }

    /**
     * Task # 2
     */


    public static void guessPassword() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic",
                "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String answer = words[random.nextInt(words.length - 1)];
        String finalAnswer = answer;
        for (int i = answer.length(); i <= 15; i++) {
            answer = answer + "#";
        }

        String userAnswer;

        do {
            System.out.println("Guess a word:");
            userAnswer = sc.nextLine();
            for (int i = userAnswer.length(); i <= 15; i++) {
                userAnswer = userAnswer + "#";
            }
            if (!userAnswer.equals(answer)) {
                String result = "";

                for (int i = 0; i < userAnswer.length(); i++) {
                    if (userAnswer.charAt(i) == answer.charAt(i)) {
                        result = result + userAnswer.charAt(i);
                    } else {
                        result = result + "#";
                    }
                }
                System.out.println(result);

            }
        } while (!answer.equals(userAnswer));

        System.out.println("Congratulations you won! Right answer is " + finalAnswer);
    }

}

