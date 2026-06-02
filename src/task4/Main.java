package task4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        setOfStrings();
        setOfCats();
        workWithList();
    }

    public static void setOfStrings() {
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
    }

    public static void setOfCats() {
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
    }
}
