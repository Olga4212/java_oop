package ru.geekbrains.main.site.at.collections.hashmap;

import ru.geekbrains.main.site.at.collections.objects.Dog;
import ru.geekbrains.main.site.at.collections.objects.Human;

import java.util.HashMap;
import java.util.Map;

public class isEmptyExample {
   public static void main(String[] args) {
        Map<Human, Dog> dogs = new HashMap<>();

        System.out.println(dogs.isEmpty());
   }
}
