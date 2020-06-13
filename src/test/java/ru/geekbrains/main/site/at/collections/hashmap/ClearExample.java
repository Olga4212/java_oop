package ru.geekbrains.main.site.at.collections.hashmap;

import ru.geekbrains.main.site.at.collections.objects.Dog;
import ru.geekbrains.main.site.at.collections.objects.Human;

import java.util.HashMap;
import java.util.Map;

public class ClearExample {

        public static void main(String[] args) {
        Map<Human, Dog> dogs = new HashMap<>();


        dogs.put(
                new Human("Олег"),
                new Dog(111));

        dogs.put(
                new Human("Ольга"),
                new Dog(345));

        dogs.put(
                new Human("Михаил"),
                new Dog(123));


        dogs.clear();
        System.out.println(dogs);

    }
}
