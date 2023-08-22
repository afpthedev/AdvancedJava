package File;

import java.io.FileNotFoundException;
import java.util.Scanner;


// Detail information to https://docs.oracle.com/javase/8/docs/api/java/io/File.html
public class File {
    public static void main(String[] args) {


        java.io.File file =  new java.io.File("/Users/farukpala/IdeaProjects/AdvancedJava/src/File/secret.txt");

        // Absolute Path Getting Comment
        System.out.println(file.getAbsolutePath());

        // Get Path
        System.out.println(file.getPath());

        // Conditions
        boolean fileExists = file.exists();

        System.out.println(fileExists);

        // Print file
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    }

