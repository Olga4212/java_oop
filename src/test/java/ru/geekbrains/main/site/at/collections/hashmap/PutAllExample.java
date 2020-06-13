package ru.geekbrains.main.site.at.collections.hashmap;

import ru.geekbrains.main.site.at.collections.objects.Dog;
import ru.geekbrains.main.site.at.collections.objects.Human;

import java.util.HashMap;
import java.util.Map;

public class PutAllExample {
    public static void main(String[] args) {

        Map<Human, Dog> dogsSource = new HashMap<>();
        dogsSource.put(
                new Human("Олег"),
                new Dog(111));

        dogsSource.put(
                new Human("Ольга"),
                new Dog(345));

        dogsSource.put(
                new Human("Михаил"),
                new Dog(123));

        Map<Human, Dog> dogs = new HashMap<>();
        dogs.putAll(dogsSource);

        System.out.println(dogs.size());
        System.out.println(dogs);
    }
}
