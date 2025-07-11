package ex3;

public class Main {
    public static void main(String[] args) {
        CountryCapitalGame game = new CountryCapitalGame();
        game.loadCountryCapitalData("src/ex3/resources/countries.txt");
        game.runQuiz();

    }
}
