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
 * @version 2.0
 */

public class Create
{
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
	 * 
	 * idea. when we create the file we should also create the class att the same time
	 * i will attempt this now
	 */
	public static void Create_File(String file_directory, String file_name) 
	{
		String testing[] = file_name.split("[ |\\.]"); //this will seperate any spaces and . found in the file name the user put int
		file_name = testing[0] + ".java";
		try 
		{
			File new_file = new File(file_directory + "\\" + file_name);
			String test = new String(file_directory + "\\" + file_name);
			new_file.getParentFile().mkdirs();
			new_file.createNewFile();
			Create_Class(test);
		} 
		catch (FileAlreadyExistsException e) 
		{ 
			// this is to prevet the program from making a file that already exists
		} 
		catch (IOException e) // this is meant to make sure that the commands are being interperted correctly
		{ 
			System.out.println("There was an error when creating your new file, try making sure you have correct inputs");
			e.printStackTrace();
		}
	}
	/**
	 * What this will do is create a class inside the file that they have selected.
	 * this method grabs all the content of that file and adds a class to the top of
	 * the file
	 * 
	 * This does not delete anything that is already in the file, all it does is add
	 * to the top of the file It also adds a public void main(String[] args) to the
	 * file, so if a user wants to run the program, they are able to.
	 * 
	 * @param file_path
	 * @param Content_Say
	 */
	public static void Create_Class(String file_path) 
	{
		File file = new File(file_path); //this creats a file for the program to use
		String[] File_Name_Array = file.getName().split("[\\.]"); //this grabs the name of the file and splits it up between the name and the extention
		String NameHolder = File_Name_Array[0].toLowerCase(); //puts the proper name inside the case, also makes it all lower case for our sanity
		try 
		{
			List<String> fileContents = new ArrayList<>(Files.readAllLines(Paths.get(file_path), StandardCharsets.UTF_8));
			if (NameHolder.equals("main")) { //if they want to make a main function, this adds the functionality to run the program
			//We formatted it like this so we can get a better picture of what things will look like in the file
			fileContents.add("public class " + NameHolder +
			"\n{\n" +
				"\tpublic void main(String[] args)" +
				"\n\t{\n"+
				"\n\t}\n"+
			"\n}");
			Files.write(Paths.get(file_path), fileContents, StandardCharsets.UTF_8);
			}
			else { //this is for every other file name
				fileContents.add("public class " + NameHolder +
				"\n{\n" +
				"\n}");
				Files.write(Paths.get(file_path), fileContents, StandardCharsets.UTF_8);
			}

		} 
		catch (IOException e) 
		{
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
	public static void Create_Method(String File_Directory, String return_type, String method_name) 
	{
		try 
		{
			//this reads all the lines in the selected file path
			List<String> fileContents = new ArrayList<>(Files.readAllLines(Paths.get(File_Directory), StandardCharsets.UTF_8));
			for (int i = 0; i < fileContents.size(); i++) //this will iterate through all the lines that the file has
			{
				String testing = fileContents.get(i); //this puts the contents of what ever line the program is in into a string to search for stuff later
				if (testing.contains("class")) //this looks for the "public class (name)" part of the code
				{ //once it finds where class is, it then tries to find the next empty spot it can to make a method
					for (int j = i; j < fileContents.size(); j++) //this starts a new loop to interate through to check for empty spaces
					{
						if (fileContents.get(j).equals("")) //found an empty line
						{
							fileContents.set(j, 
							"\tpublic " + return_type + " " + method_name + "()" +
							"\n\t{" +
							"\n\n\t}"); //we do 2 new lines because we want to have space inside the method for the user to be able to insert things inside the method
						}
					}
				}
			}
			Files.write(Paths.get(File_Directory), fileContents, StandardCharsets.UTF_8); //writes a method to the file
			System.out.println("Successfully wrote to the file.");
		} 
		catch (IOException e) 
		{
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
	 * 
	 * Since this is a new program, we will want to first call a method with the paramater of Contents_To_Add and from there look at what the user wants to do
	 * basically its like a translator within a translator, but for now this works
	 */
	public static void Add_To_Method(String File_Dir, String Method_Name, String Contents_To_Add) 
	{
		Method_Name = WordsOnly(Method_Name); // used to help search for
		try 
		{
			List<String> fileContents = new ArrayList<>(Files.readAllLines(Paths.get(File_Dir), StandardCharsets.UTF_8));
			for (int i = 0; i < fileContents.size(); i++) 
			{
				String test = fileContents.get(i); // this is used to help simplify our code
				if (test.contains(Method_Name)) 
				{
					for (int j = i; j < fileContents.size(); j++) 
					{
						if (fileContents.get(j).equals("")) 
						{
							//this is where we would call the mini-translator method, so the content that we add is what the user wants
							fileContents.set(j, "\t\t" + Contents_To_Add + "\n");
							break;
						}
					}
				}
			}
			Files.write(Paths.get(File_Dir), fileContents, StandardCharsets.UTF_8);
		}
		catch (IOException e) 
		{
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
	public static String WordsOnly(String simple) 
	{
		String Clean = simple.replaceAll("[^a-zA-Z0-9]", "");
		return Clean;
	}
}
