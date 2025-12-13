//toDo proper scanner

import java.util.*;

public class SantasStudentGroups {
    public static void main(String[] args) {
        String[] childrenNames = {
            "Petraitis Rokas",
            "Augė Artūras",
            "Mikalauskaitė Aušra",
            "Šlivka Donatas",
            "Stakėnaitė Ieva",
            "Skrėbė Domas",
            "Bruzgaitė Akvilė"
        };

        Map<String, List<String>> hMap = new HashMap<>();

        for (String childrenName : childrenNames) {
            String[] parts = childrenName.split(" ");
            String firstName = parts[1];
            String key = firstName.endsWith("a") ? "EndsWithA" : "Other";
            hMap.putIfAbsent(key, new ArrayList<>());
            hMap.get(key).add(childrenName);
        }
        List<String> girls = hMap.getOrDefault("EndsWithA", Collections.emptyList());
        System.out.println(girls.size());
        for (String s : girls) {
            System.out.println(s);
        }
    }
}