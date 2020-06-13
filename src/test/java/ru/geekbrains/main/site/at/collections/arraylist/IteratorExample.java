package ru.geekbrains.main.site.at.collections.arraylist;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class IteratorExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Том");
        cats.add("Барсик");
        cats.add("Бармаглот");
        cats.add("Черныш");

        ListIterator<String> iterator = cats.listIterator();
        while (iterator.hasNext()) {
            String cat = iterator.next();
            System.out.println(cat);
        }

        ListIterator<String> iterator2 = cats.listIterator(cats.size());
        while (iterator2.hasPrevious()) {
            String cat = iterator2.previous();
            System.out.println(cat);
        }
    }
}
