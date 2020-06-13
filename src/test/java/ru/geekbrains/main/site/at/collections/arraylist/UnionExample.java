package ru.geekbrains.main.site.at.collections.arraylist;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.List;


public class UnionExample {
    public static void main(String[] args) {
        List<String> cats = new ArrayList<>();
        cats.add("Том");
        cats.add("Барсик");

        List<String> cats2 = new ArrayList<>();
        cats2.add("Бармаглот");
        cats2.add("Черныш");

        System.out.println(cats);
        System.out.println(cats2);

        System.out.println(ListUtils.union(cats, cats2));
    }
}
