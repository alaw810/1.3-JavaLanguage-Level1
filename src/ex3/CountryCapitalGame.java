package ex3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CountryCapitalGame {
    private Map<String, String> countryCapitalMap = new HashMap<>();

    public void loadCountryCapitalData(String filePath) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            for (var l : lines) {
                String[] parts = l.split(" ");
                if (parts.length == 2) {
                    countryCapitalMap.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }

    public void runQuiz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the game Capital Quizz!");
        System.out.println("You will be given 10 countries, try to guess their capitals.");
        System.out.println("Let's see if you can get a high score!\n");

        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        System.out.println("\nGreat, " + userName + "! Let's begin!\n");

        List<String> countries = new ArrayList<>(countryCapitalMap.keySet());
        Collections.shuffle(countries);
        List<String> quizCountries = countries.subList(0, 10);

        int score = 0;

        for (var country : quizCountries) {
            System.out.print("What is the capital of " + country + "? ");
            String answer = sc.nextLine().trim();

            String correct = countryCapitalMap.get(country);
            if (answer.equalsIgnoreCase(correct)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The capital of " + country + " is " + correct + ".");
            }
        }

        System.out.println("Quiz complete! " + userName + ", your final score is: " + score + "/10");
        System.out.println("Your result has been saved to the leaderboard");
        saveScoreToFile(userName, score);

    }

    private void saveScoreToFile(String userName, int score) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/ex3/resources/leaderboard.txt", true))) {
            writer.write(userName + ": " + score);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error saving result: " + e.getMessage());
        }
    }

}
