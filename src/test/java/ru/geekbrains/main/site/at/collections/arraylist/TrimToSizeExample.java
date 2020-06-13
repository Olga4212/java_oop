package ru.geekbrains.main.site.at.collections.arraylist;

import ru.geekbrains.main.site.at.collections.objects.Dog;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


// TODO необходимо разобраться как продемонстрировать работу методов ensureCapacity и trimToSize


public class TrimToSizeExample {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ArrayList<Dog> dogs = new ArrayList<>();
        for(int i = 0; i<30;i++) {
            System.out.println("Current size " + dogs.size() + " Current capacity " + cap(dogs));
            dogs.add(new Dog(i));
        }
        dogs.ensureCapacity(100);
        System.out.println("Current size " + dogs.size() + " Current capacity " + cap(dogs));
        dogs.ensureCapacity(99);
        System.out.println("Current size " + dogs.size() + " Current capacity " + cap(dogs));
        dogs.trimToSize();
        System.out.println("Current size " + dogs.size() + " Current capacity " + cap(dogs));
    }

    public static int cap(List list) throws NoSuchFieldException, IllegalAccessException {
        Field f = ArrayList.class.getDeclaredField("elementData");
        f.setAccessible(true);
        return ((Object[]) f.get(list)).length;
    }
}
