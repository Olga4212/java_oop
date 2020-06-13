package ru.geekbrains.main.site.at.collections.hashset;

import java.util.*;


public class IteratorExample {
    public static void main(String[] args) {
        HashSet<String> cats = new HashSet<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");
        cats.add("Черныш");

        Iterator<String> iterator = cats.iterator();
        while (iterator.hasNext()) {
            String cat = iterator.next();
            System.out.println(cat);
        }
    }
}
