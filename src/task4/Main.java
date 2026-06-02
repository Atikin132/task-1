package task4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        setOfStrings();
        setOfCats();
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
        for (String string : stringSet) {
            System.out.println(string);
        }
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
    }
}
