package ru.geekbrains.main.site.at.collections.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AddAllExample {
    public static void main(String[] args) {
        List<String> catsList = new ArrayList<>();
        catsList.add("Том");
        catsList.add("Пушок");
        catsList.add("Черныш");


        Set<String> cats = new HashSet<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");

        cats.addAll(catsList);

        System.out.println(cats);
        System.out.println(cats.size());
    }
}
