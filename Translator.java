import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * END GOAL INPUT: create file that makes program say hello world KEYWORDS:
 * create file, say: "Hello world" OUT: make a file that sets up a main function
 * that makes the system say hello world
 * 
 */
public class Translator {

    /**
     * Our methods should be based around the key words we want the program to
     * reconize create file: new file in location (combine file and class creation,
     * and make special case for if the file is string name contains main) method:
     * creats a new method inside of the selected file say: (String) repeat (loop)
     * count: (iterate) add variable
     */

    public static void Create_File(String file_directory, String file_name, String file_path, String class_name) {
        try {
            String[] FileFix = file_name.split(" ");
            file_name = FileFix[0] + ".java";
            File new_file = new File(file_directory + "\\" + file_name);
            new_file.getParentFile().mkdirs();
            new_file.createNewFile();
        } catch (FileAlreadyExistsException e) { // this is to prevet the program from making a file that already exists
        } catch (IOException e) { // this is meant to make sure that the commands are being interperted correctly
            System.out
                    .println("There was an error when creating your new file, try making sure you have correct inputs");
            e.printStackTrace();
        }
        if (file_name.contains("main") || file_name.contains("test")) { // this checks to see if the input it got has an
                                                                        // extention or not
                                                                        // special method call to create a main function
            try {
                List<String> fileContents = new ArrayList<>(
                        Files.readAllLines(Paths.get(file_path), StandardCharsets.UTF_8));
                fileContents.add(0,
                        "public class " + class_name + "{\n public static void main(String[] args) {\n\n} \n}");
                Files.write(Paths.get(file_path), fileContents, StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        } else {
            try {
                List<String> fileContents = new ArrayList<>(
                        Files.readAllLines(Paths.get(file_path), StandardCharsets.UTF_8));
                fileContents.add(0, "public class " + class_name + "(){\n\n}");
                Files.write(Paths.get(file_path), fileContents, StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }
}