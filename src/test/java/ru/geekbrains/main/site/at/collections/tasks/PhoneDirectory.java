package ru.geekbrains.main.site.at.collections.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneDirectory {
    private HashMap<String, List<String>> hm = new HashMap<>();

    public void add(String name, String phone) {
        List<String> existingPhones = hm.get(name);
        if (existingPhones == null) {
            existingPhones = new ArrayList<String>();
            hm.put(name, existingPhones);
        }

        existingPhones.add(phone);
    }

    public List<String> get(String name) {
        return hm.get(name);
    }
}
