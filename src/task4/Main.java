package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        workWithSet();
        workWithList();
        workWithMap();
        workWithTreeSet();
    }

    public static void workWithSet() {
        System.out.println("1 - Set of strings");
        Set<String> stringSet = new HashSet<>();
        stringSet.add("first");
        stringSet.add("second");
        stringSet.add("third");
        stringSet.add("fourth");
        stringSet.add("fifth");

        System.out.println("Strings (foreach output):");
        stringSet.forEach(s -> System.out.println(s));
        System.out.println();
        System.out.println("Add duplicate and output with iterator:");
        stringSet.add("first");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("1 - Set of cats");
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Motya", 9));
        cats.add(new Cat("Vasya", 5));
        cats.add(new Cat("Barsik", 3));
        cats.add(new Cat("Bulka", 9));
        cats.add(new Cat("Murzik", 2));

        System.out.println("Cats (foreach output):");
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println();

        cats.add(new Cat("Motya", 9));
        System.out.println("Add duplicate and output:");
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println();
    }

    public static void workWithList() {
        System.out.println("2 - Lists");

        List<String> stringList = new ArrayList<>();
        stringList.add("string1");
        stringList.add("string2");
        stringList.add("string3");
        stringList.add("string4");

        System.out.println("List (for(foreach) output):");

        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Add element to second position:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
            if (i == 2) {
                stringList.add(1, "string5");
            }
        }

        System.out.println();
        System.out.println("Add element to second position (output):");
        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Remove element from second position:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
            if (i == 2) {
                stringList.remove(1);
            }
        }

        System.out.println();
        System.out.println("Remove element from second position (output):");
        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println();
    }

    private static void workWithMap() {
        System.out.println("3 - Map");
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("1", "string1");
        stringMap.put("2", "string2");
        stringMap.put("3", "string3");
        System.out.println(stringMap);
        System.out.println();

        System.out.println("Add element with duplicate key");
        stringMap.put("2", "string4");
        stringMap.forEach((s, s2) -> System.out.println(s + ": " + s2));
        System.out.println();

        System.out.println("3 - Cat owner map");
        Map<Cat, String> catOwnerMap = new HashMap<>();
        catOwnerMap.put(new Cat("Motya", 9), "Karina");
        catOwnerMap.put(new Cat("Vasya", 4), "Vika");
        catOwnerMap.put(new Cat("Murzik", 6), "Lena");
        catOwnerMap.forEach((cat, owner) -> System.out.println(cat + ", owner: " + owner));
        System.out.println();

        System.out.println("Add element with duplicate key");
        catOwnerMap.put(new Cat("Murzik", 6), "Vova");
        catOwnerMap.forEach((cat, owner) -> System.out.println(cat + ", owner: " + owner));
        System.out.println();
    }

    private static void workWithTreeSet() {
        System.out.println("4 - String TreeSet");

        Set<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("Lemon");
        stringTreeSet.add("Apple");
        stringTreeSet.add("Pineapple");

        for (String s : stringTreeSet) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("4 - Cat TreeSet");
        Set<Cat> catTreeSet = new TreeSet<>();
        catTreeSet.add(new Cat("Vasya", 5));
        catTreeSet.add(new Cat("Motya", 9));
        catTreeSet.add(new Cat("Barsik", 3));

        for (Cat cat : catTreeSet) {
            System.out.println(cat);
        }
    }
}
