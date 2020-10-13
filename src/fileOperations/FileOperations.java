package fileOperations;

import java.io.*;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.Scanner;

public class FileOperations {
    public static void main(String[] args) {
//        try {
//            PrintWriter pw = new PrintWriter("aktualny_czas.txt");
//            pw.println("Aktualny czas: " + LocalTime.now());
//            pw.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        try {
            String absPath = Paths.get("").toAbsolutePath().toString() +
                    "\\aktualny_czas.txt";
            FileWriter fw = new FileWriter(absPath,true);
            fw.append("Czas zapisu: " + LocalTime.now() + "\n");
            fw.close();
            File file = new File(absPath);
            Scanner input = new Scanner(file);
            while (input.hasNextLine()){    // czy istnieje linijka tekstu do pobrania
                System.out.println(input.nextLine());
            }
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
