package ru.geekbrains.main.site.at.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");
        cats.add("Барсик");


        System.out.println(Collections.frequency(cats, "Барсик"));
    }
}
