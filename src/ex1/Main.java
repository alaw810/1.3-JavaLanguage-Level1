package ex1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Month> listMonths = new ArrayList<>();

        listMonths.add(new Month("January"));
        listMonths.add(new Month("February"));
        listMonths.add(new Month("March"));
        listMonths.add(new Month("April"));
        listMonths.add(new Month("May"));
        listMonths.add(new Month("June"));
        listMonths.add(new Month("July"));
        listMonths.add(new Month("September"));
        listMonths.add(new Month("October"));
        listMonths.add(new Month("November"));
        listMonths.add(new Month("December"));

        // Using for to print the list before adding August
        System.out.println("\n--- Month list before adding August ---");
        for (int i = 0 ; i < listMonths.size() ; i++) {
            System.out.println((i + 1) + ". " + listMonths.get(i).getName());
        }

        listMonths.add(7, new Month("August"));

        // Using an Iterator to print the list after adding August
        System.out.println("\n--- Month list after adding August ---");
        Iterator<Month> it = listMonths.iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.println(i + ". " + it.next().getName());
            i++;
        }

    }
}
