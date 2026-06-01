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
                        IOCopier ioCopier = new IOCopier();
                        ioCopier.copy("C:\\Users\\user\\Desktop\\test.txt", "D:\\test\\test.txt");
                        break;
                    case 2:
                        NIOCopier nioCopier = new NIOCopier();
                        nioCopier.copy("C:\\Users\\user\\Desktop\\test.txt", "D:\\test\\test1.txt");
                        break;
                    case 3:
                        NIO2Copier nio2Copier = new NIO2Copier();
                        nio2Copier.copy("C:\\Users\\user\\Desktop\\test.txt", "D:\\test\\test2.txt");
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
