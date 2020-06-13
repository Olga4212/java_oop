package ru.geekbrains.main.site.at.collections.arraylist;

import ru.geekbrains.main.site.at.collections.objects.Dog;

import java.util.ArrayList;
import java.util.List;

public class CollectionsOfExample {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog(111));
        dogs.add(new Dog(345));
        dogs.add(new Dog(123));
        dogs.add(new Dog(678));
        dogs.add(new Dog(345));

        Dog dog1 = new Dog(345);
        boolean dog1existsInDogs = dogs.contains(dog1);
        System.out.println(dog1existsInDogs);

        System.out.println(dogs.contains(new Dog(543)));
    }
}
