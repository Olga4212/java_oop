package ru.geekbrains.main.site.at.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(4);
        integers.add(2);
        integers.add(-5);
        Collections.sort(integers);

        System.out.println(integers);
    }
}
