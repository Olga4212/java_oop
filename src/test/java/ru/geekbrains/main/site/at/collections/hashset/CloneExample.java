package ru.geekbrains.main.site.at.collections.hashset;

import java.util.HashSet;
import java.util.Set;

public class CloneExample {
    public static void main(String[] args) {
        HashSet<String> cats = new HashSet<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");

        Set<String> cats2 = (HashSet<String>) cats.clone();

        System.out.println(cats2);
        System.out.println(cats2.size());
    }
}
