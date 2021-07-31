package hw10;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        String[] arr10Words = {"Bars", "Amur", "Murmur", "Lemur", "Bars", "Amur", "Murmur", "Java", "Core", "Bars"};
        System.out.println(Arrays.toString(arr10Words));
        Map<String, Integer> map = new TreeMap<>();
        for (String s : arr10Words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println("Unique words " + map.keySet());
        System.out.println(map);
        System.out.println("*******************************");

        Phonebook phonebook = new Phonebook();
        phonebook.add("Bond", "+7-922-6587977");
        phonebook.add("James", "+7-994-5467942");
        phonebook.add("Bond", "+7-916-8493720");
        phonebook.add("Bars", "+7-903-7480824");
        phonebook.add("Amur", "+7-999-5480827");

        System.out.println("Phone number " + phonebook.get("Bond"));
        System.out.println("Phone number " + phonebook.get("Br"));
        System.out.println("Phone number " + phonebook.get("Amur"));

    }
}
