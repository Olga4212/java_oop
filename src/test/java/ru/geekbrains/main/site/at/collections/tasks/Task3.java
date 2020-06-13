package ru.geekbrains.main.site.at.collections.tasks;


import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        PhoneDirectory dir = new PhoneDirectory();
        dir.add("Иванов", "8914567890");
        dir.add("Петров", "8912123456");
        dir.add("Сидоров", "89131234567");
        dir.add("Васильев", "8912345678");
        dir.add("Васильев", "8912985678");
        dir.add("Иванов", "891834567876");

        System.out.println(dir.get("Штирлиц"));
        System.out.println(dir.get("Васильев"));
        System.out.println(dir.get("Петров"));
    }
}
