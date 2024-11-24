import java.io.*;
import java.nio.file.*;

public class main {
    public static void main(String[] args) {
        createfile("folder", "/home/yanis_truc/Bureau/", "blackzombie");
        createfile("file", "/home/yanis_truc/Bureau/", "blackzombie.txt");
        moveFile("/home/yanis_truc/Bureau/", "/home/yanis_truc/Bureau/blackzombie/", "blackzombie.txt");
    }

    private static void print(String text) {
        System.out.println(text);
    }

    private static void createfile(String type, String path, String name) {
        if (type.equals("file")) {
            File file = new File(path + name);
            try {
                if (!file.exists()) {
                    if (file.createNewFile()) {
                        print("File created: " + file.getAbsolutePath());
                    } else {
                        print("File already exists.");
                    }
                } else {
                    print("File already exists.");
                }
            } catch (IOException e) {
                print("An error occurred while creating the file: " + e.getMessage());
            }
        }

        if (type.equals("folder")) {
            File folder = new File(path + name);
            if (!folder.exists()) {
                if (folder.mkdir()) {
                    print("Folder created: " + folder.getAbsolutePath());
                } else {
                    print("Failed to create the folder.");
                }
            } else {
                print("Folder already exists.");
            }
        }
    }

    private static void moveFile(String path, String dest, String name) {
        Path sourcePath = Paths.get(path + name);
        Path destPath = Paths.get(dest + name);

        try {
            Files.createDirectories(Paths.get(dest));
            
            Files.move(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
            print("File moved to: " + destPath.toString());
        } catch (IOException e) {
            print("An error occurred while moving the file: " + e.getMessage());
        }
    }
}
