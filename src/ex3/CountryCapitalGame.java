package ex3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class CountryCapitalGame {
    private Map<String, String> countryCapitalMap = new HashMap<>();

    public void loadData(String filePath) {
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

    public void startQuiz() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWelcome to the game Capital Quizz! Match the country to its capital " +
                "and get you best highscore!");
        System.out.print("Please enter your name: ");
        String userName = sc.nextLine();
        System.out.println("Perfect, " + userName + ", let's begin!");

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

    }
}
