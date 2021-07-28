package hw10;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Phonebook {

    private Map<String, Set<String>> phoneBook = new TreeMap<>();

    public void add(String name, String phoneNumber) {
        Set<String> phone = phoneBook.getOrDefault(name, new HashSet<>());
        phone.add(phoneNumber);
        phoneBook.put(name, phone);
    }

    public Set<String> get(String name) {
        return phoneBook.get(name);
    }

}
