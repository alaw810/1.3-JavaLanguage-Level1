package ex2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7);
        List<Integer> list2 = new ArrayList<>();

        ListIterator<Integer> it = list1.listIterator(list1.size());
        while (it.hasPrevious()) {
            list2.add(it.previous());
        }

        System.out.println("\nOriginal list:");
        for (var n : list1) {
            System.out.println(n);
        }

        System.out.println("\nReversed list:");
        for (var n : list2) {
            System.out.println(n);
        }

    }
}
