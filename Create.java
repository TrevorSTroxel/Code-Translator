import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * These are all the online sources that we used to help create this program in
 * thos file: reference: https://www.w3schools.com/java/java_files_create.asp
 * reference:
 * https://stackoverflow.com/questions/37276996/java-add-text-to-a-specific-line-in-a-file
 * reference:
 * https://stackoverflow.com/questions/20039980/java-replace-line-in-text-file
 * 
 * This file holds all of our methods that are called manipulating the file It
 * will create files, classes, methods, and add content to that method
 * 
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */

public class Create {
	/**
	 * This method when called will grab the file path the user has chosen and
	 * create a file inside the desired location. If the user does not geve the file
	 * a supported extention, the the program will auto add to the end of it a .txt
	 * to convert it into a text file.
	 * 
	 * Unfortuanutly we did not add a case for is the user adds a file type at the
	 * end but we do not support it So you could end up with something like
	 * test.tocx.txt, which is an invalid file. In the future we would improve this
	 * argument so that even if you gave us a file type already, the program would
	 * change it to one of the two valid types we set.
	 * 
	 * @param file_directory
	 * @param file_name
	 */
	public static void create_file(String file_directory, String file_name) {
		// if (!(file_name.contains(".txt")) || !(file_name.contains(".java"))) { //this
		// checks to see if the input it got has an extention or not
		// String[] FileFix = file_name.split(" ");
		// file_name = FileFix[0] + ".txt";
		// }
		try {
			File new_file = new File(file_directory + "\\" + file_name);
			new_file.getParentFile().mkdirs();
			new_file.createNewFile();
		} catch (FileAlreadyExistsException e) { // this is to prevet the program from making a file that already exists
		} catch (IOException e) { // this is meant to make sure that the commands are being interperted correctly
			System.out
					.println("There was an error when creating your new file, try making sure you have correct inputs");
			e.printStackTrace();
		}
	}

	/**
	 * What this will do is create a class inside the file that they have selected.
	 * this method grabs all the content of that file and adds a class to the top of
	 * the file
	 * 
	 * This does not delete anything that is already in the file, all it does is add
	 * to the top of the file It also adds a public static void main(String[] args)
	 * to the file, so if a user wants to run the program, they are able to.
	 * 
	 * @param file_path
	 * @param class_name
	 */
	public static void creatr_class(String file_path, String class_name) {
		try {
			List<String> fileContents = new ArrayList<>(Files.readAllLines(Paths.get(file_path), StandardCharsets.UTF_8));
			fileContents.add("public class " + class_name + "{\n public static void main(String[] args) {\n\n} \n}");
			Files.write(Paths.get(file_path), fileContents, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	/**
	 * This method when called ads a method to the selected file the user wants The
	 * method can be called whatever the user wants, but in order to even add this
	 * their must first be a class inside the file If there is no class, the program
	 * will not add anything to the file.
	 * 
	 * @param File_Directory
	 * @param return_type
	 * @param method_name
	 */
	public static void create_method(String File_Directory, String return_type, String method_name) {
		try {
			List<String> fileContents = new ArrayList<>(
					Files.readAllLines(Paths.get(File_Directory), StandardCharsets.UTF_8));
			for (int i = 0; i < fileContents.size(); i++) {
				String testing = fileContents.get(i);
				if (testing.contains("class")) {
					for (int j = i; j < fileContents.size(); j++) {
						if (fileContents.get(j).equals("")) {
							fileContents.set(j, "public " + return_type + " " + method_name + "(){\n\n}");
						}
					}
				}
			}
			Files.write(Paths.get(File_Directory), fileContents, StandardCharsets.UTF_8);
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	/**
	 * This program will add content to any method the user has in the file We have
	 * it set up so that the when searching for a method name, it will remove ()
	 * from it and add our own. This was added because if there are two methods
	 * called test and test2, it will reach both and add the content to both of
	 * them. The way we have it set up now will only search for the name + (), so
	 * that even if two methods are named similarly, it will be able to tell the
	 * difference between them
	 * 
	 * @param Method_Name
	 * @param File_dir
	 * @param Contents_To_Add
	 */
	public static void Add_To_Method(String File_Dir, String Method_Name, String Contents_To_Add) {
		Method_Name = WordsOnly(Method_Name); // used to help search for
		try {
			List<String> fileContents = new ArrayList<>(
					Files.readAllLines(Paths.get(File_Dir), StandardCharsets.UTF_8));
			for (int i = 0; i < fileContents.size(); i++) {
				String test = fileContents.get(i); // this is used to help simplify our code
				if (test.contains(Method_Name)) {
					for (int j = i; j < fileContents.size(); j++) {
						if (fileContents.get(j).equals("")) {
							fileContents.set(j, Contents_To_Add + "\n");
							break;
						}
					}
				}
			}
			Files.write(Paths.get(File_Dir), fileContents, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * This was added to help clean up the users search for a method name, as they
	 * might add () to the end of it by accident
	 * 
	 * @param simple
	 * @return String
	 */
	public static String WordsOnly(String simple) {
		String Clean = simple.replaceAll("[^a-zA-Z0-9]", "");
		return Clean;
	}
}
