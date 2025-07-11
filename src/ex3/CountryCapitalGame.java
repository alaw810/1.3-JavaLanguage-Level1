package ex3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
