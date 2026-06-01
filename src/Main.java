import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Hello, World!");
        while (true) {
            printMenu();
            Scanner scanner = new Scanner(System.in);
            try {
                switch (scanner.nextInt()) {
                    case 1:
                        IOCopier copier = new IOCopier();
                        copier.copy("C:\\Users\\user\\Desktop\\test.txt", "D:\\test\\test.txt");
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    case 0:
                        return;
                }
            } catch (CopyException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    static void printMenu() {
        System.out.println("Copy your files");
        System.out.println("1. Copy with package io");
        System.out.println("2. Copy with package nio");
        System.out.println("3. Copy with package nio2");
        System.out.println("0. Exit");
    }

}
