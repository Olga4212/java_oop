package ru.geekbrains.main.site.at.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SetExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");

        System.out.println(cats);

        cats.set(1, "Черныш");
        System.out.println(cats);
    }
}
