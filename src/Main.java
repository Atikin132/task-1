import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Copy your files");
        Path sourcePath = readSourceFile(scanner, "Enter the path to the file you want to copy:");
        Path destinationDir = readDestinationDir(scanner, "Enter the path where you want to copy:");
        Path destinationPath = destinationDir.resolve(sourcePath.getFileName());
        Map<Integer, FileCopier> fileCopiers = Map.of(
                1, new IOCopier(),
                2, new NIOCopier(),
                3, new NIO2Copier()
        );

        while (true) {
            System.out.println("Source Path: " + sourcePath);
            System.out.println("Destination Path: " + destinationPath);
            printMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            try {
                switch (choice) {
                    case 1:
                    case 2:
                    case 3:
                        if (Files.exists(destinationPath)) {
                            System.out.println("File already exists. Overwrite? (y/n): ");
                            String answer = scanner.nextLine().trim().toLowerCase();

                            if (!answer.equals("y") && !answer.equals("yes")) {
                                System.out.println("Copy cancelled.");
                                break;
                            }
                        }
                        FileCopier fileCopier = fileCopiers.get(choice);
                        fileCopier.copy(sourcePath.toString(), destinationPath.toString());
                        break;
                    case 4:
                        sourcePath = readSourceFile(scanner, "Enter the new path to the file you want to copy:");
                        destinationPath = destinationDir.resolve(sourcePath.getFileName());
                        break;
                    case 5:
                        destinationDir = readDestinationDir(scanner, "Enter the new path where you want to copy:");
                        destinationPath = destinationDir.resolve(sourcePath.getFileName());
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
        System.out.println("1. Copy with package io");
        System.out.println("2. Copy with package nio");
        System.out.println("3. Copy with package nio2");
        System.out.println("4. Change Source Path");
        System.out.println("5. Change Destination Path");
        System.out.println("0. Exit");
    }

    static Path readSourceFile(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.err.println("Path cannot be empty");
                continue;
            }
            Path path = Path.of(input);
            if (!Files.exists(path)) {
                System.err.println("File does not exist");
                continue;
            }
            if (Files.isDirectory(path)) {
                System.err.println("Source must be a file, not a directory");
                continue;
            }
            return path;
        }
    }


    static Path readDestinationDir(Scanner scanner, String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.err.println("Path cannot be empty");
                continue;
            }
            Path path = Path.of(input);
            if (!Files.exists(path)) {
                System.err.println("Destination folder does not exist");
                continue;
            }
            if (!Files.isDirectory(path)) {
                System.err.println("Destination must be a directory");
                continue;
            }

            return path.normalize();
        }
    }
}
