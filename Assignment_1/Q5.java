package Assignment_1;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
    	/*5. Basic Quiz Application

Problem Statement: 
Develop a simple quiz application that asks the user three multiple-choice questions. 
For each question, the user should input their answer, and the program should keep track of the score. 
At the end of the quiz, display the total score and percentage.

Requirements:
Use variables to store questions, options, user answers, and scores.
Implement type casting if necessary (e.g., converting user input to an integer for score calculation).
Use escape sequences to format the questions and options clearly.
Calculate the percentage based on the total score.*/
        
        Scanner scanner = new Scanner(System.in);

       
        int score = 0;
        int totalQuestions = 4;

        // Question 1
        System.out.println("Question 1: How many states are there in India?");
        System.out.println("1. 28\n2. 29\n3. 27\n4. 30");
        System.out.print("Your answer: ");
        int answer1 = scanner.nextInt();
        if (answer1 == 1) { // Correct answer is option 1
            score++;
        }

        // Question 2
        System.out.println("\nQuestion 2: _________ is India’s second longest river after the Ganges.");
        System.out.println("1. Cauvery\n2. Krishna\n3. Godavari\n4. Yamuna");
        System.out.print("Your answer: ");
        int answer2 = scanner.nextInt();
        if (answer2 == 3) { // Correct answer is option 3
            score++;
        }

        // Question 3
        System.out.println("\nQuestion 3: Ghoomar is a traditional folk dance of _________");
        System.out.println("1. Rajasthan\n2. Chandigarh\n3. Madhya Pradesh\n4. Uttar Pradesh");
        System.out.print("Your answer: ");
        int answer3 = scanner.nextInt();
        if (answer3 == 1) { // Correct answer is option 1
            score++;
        }

        // Question 4
        System.out.println("\nQuestion 4: Which of the following is not a Union Territory?");
        System.out.println("1. Rajasthan\n2. Gujarat\n3. Jammu and Kashmir\n4. Sikkim");
        System.out.print("Your answer: ");
        int answer4 = scanner.nextInt();
        if (answer4 == 2) { // Correct answer is option 2
            score++;
        }

        // Calculate percentage
        double percentage = ((double) score / totalQuestions) * 100;

        // Display quiz results
        System.out.println("\n--- Quiz Results ---");
        System.out.println("Total Score: " + score + " out of " + totalQuestions);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        // Close the scanner
        scanner.close();
    }
}

