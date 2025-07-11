package ex1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> monthsList = new ArrayList<>();

        monthsList.add(new Month("January"));
        monthsList.add(new Month("February"));
        monthsList.add(new Month("March"));
        monthsList.add(new Month("April"));
        monthsList.add(new Month("May"));
        monthsList.add(new Month("June"));
        monthsList.add(new Month("July"));
        monthsList.add(new Month("September"));
        monthsList.add(new Month("October"));
        monthsList.add(new Month("November"));
        monthsList.add(new Month("December"));

        // Using for to print the list before adding August
        System.out.println("\n--- Month list before adding August ---");
        for (int i = 0; i < monthsList.size(); i++) {
            System.out.println((i + 1) + ". " + monthsList.get(i).getName());
        }

        monthsList.add(7, new Month("August"));

        // Using an Iterator to print the list after adding August
        System.out.println("\n--- Month list after adding August ---");
        Iterator<Month> it = monthsList.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.println(i + ". " + it.next().getName());
            i++;
        }

        // Adding duplicate values before creating the HashSet
        monthsList.add(new Month("March"));
        monthsList.add(new Month("July"));
        monthsList.add(new Month("October"));
        System.out.println("\nList size after adding duplicates: " + monthsList.size());

        // Creating the HashSet and checking its size
        Set<Month> monthSet = new HashSet<>(monthsList);
        System.out.println("\nSet size after adding the list: " + monthSet.size() +
                ". Duplicate values were removed.");

        // Iterating the set
        System.out.println("\n--- Month set ---");
        i = 1;
        for (var m : monthSet) {
            System.out.println(i + ". " + m.getName());
            i++;
        }
    }
}
