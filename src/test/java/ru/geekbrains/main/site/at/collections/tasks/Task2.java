package ru.geekbrains.main.site.at.collections.tasks;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("ru");
        words.add("geekbrains");
        words.add("main");
        words.add("site");
        words.add("at");
        words.add("collections");
        words.add("tasks");
        words.add("main");
        words.add("ru");
        words.add("java");
        words.add("util");
        words.add("package");
        words.add("import");

        Set<String> wordsSet = new HashSet<>();
        wordsSet.addAll(words);

        System.out.println(wordsSet);
        System.out.println(wordsSet.size());

        Iterator<String> iterator = wordsSet.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            System.out.println(word + " " +Collections.frequency(words, word));
        }
    }
}

