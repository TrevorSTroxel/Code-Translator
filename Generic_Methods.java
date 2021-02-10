
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 3.0
 */
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;

// Method storage
public class Generic_Methods
{
	//used to seperate the commands that the user inputs
    public static void Translation()
    {
		switch(Variables.Order_Of_Commands.peek())
		{
			case "new file":
				//This will be for File creation
				Panel_Methods.Panel_Settings(Variables.Folder_Panel, 3);
				Panel_Methods.Input_Window(Variables.Folder_Panel); //sets the second window panel to the correct one
				break;
			case "method":
				//This is for adding methods to files
				Panel_Methods.Panel_Settings(Variables.Method_Panel, 4);
				Panel_Methods.Input_Window(Variables.Method_Panel); //calles the method to get the second window
				break;
			case "add":
				//this is for add any for of content to a method found within a file
				Panel_Methods.Panel_Settings(Variables.Content_Panel, 4);
				Panel_Methods.Input_Window(Variables.Content_Panel); //calles the method to get the second window
				break;
		}
    }

	/**
	 * This will put certain things in the queue in order so that
	 * no matter where the user types the commands, the program will put them in the correct order
	 * and then run the commands in the proer order they must go in.
	 * More commands will be add later that can be interperted and added to the queue
	 * @param User_Input
	 */
	public static void Input_Parsing(String User_Input)
	{
		//Creates a file
		if (User_Input.contains("new file") || User_Input.contains("new program"))
		{
			Variables.Order_Of_Commands.add("new file");
			//adds a list to the JTextArea for the user to see so they know what is happening
			Variables.Storage.add(". Creating a new file.");
		}
		//Adds a method
		if (User_Input.contains("make") || User_Input.contains("create")) //change later to be something easier to type in a normal sentence, but for now this is what we have
		{
			Variables.Order_Of_Commands.add("method");
			Variables.Storage.add(". Adding a method the chosen file.");
		}
		//this is subject to change for what the user can say to trigger this, but this will be where the user asks where to put stuff
		//Add more paramaters for what can trigger this in the near future
		//Adds content to a file
		if (User_Input.contains("times")) //loops
		{
			Variables.Order_Of_Commands.add("add");
			Variables.Storage.add(". Adding content to add to a method. (Loops)");
		}
		if (User_Input.contains("say")) //make the system say things
		{
			Variables.Order_Of_Commands.add("add");
			Variables.Storage.add(". Adding content to add to a method. (System says something)");
		}
		//puts things from the ArrayList into the JTextArea for the user to see
		List_Of_Actions();
	}

	//made this method so that the program does not try to run commands when the queue is empty
    //change later so that once the commande runs out, it closes the program
    public static void Queue_Check()
    {
        if (!Variables.Order_Of_Commands.isEmpty() == true)
        {
            //now this will update the list for the user so that they know what is happening in real time
            Variables.Order_Of_Commands.poll();//removes the top most element from the queue
            Variables.Storage.remove(0); //removes the first element in the ArrayList
            //this should clear out the text so that it can be updated proporly
			Text_Cleaner(1); //cleans up the JTextArea to be useable again
			List_Of_Actions();
        }
    }

	public static void List_Of_Actions()
	{
		for (int j = 0; j < Variables.Storage.size(); j++)
		{
			String indexNumber = Variables.Storage.get(j);
			Variables.Queue_Content.append((Variables.Storage.indexOf(indexNumber) + 1) + Variables.Storage.get(j) + "\n");
		}
	}

	//Allows the user to select a location
	public static void Location(JTextArea JTA, int i) 
	{
		JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); //this opens up a crude file explorer for the user to use
		switch (i)
		{
			case 1:
				j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //this makes it so that they can only select folder locations
				if (j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) //this checks to make sure that the option you choose was valid
				{
					JTA.setText(j.getSelectedFile().getAbsolutePath()); //this writes the file path to the text area for the user to see
				}
				break;
			case 2:
				j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				if (j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION);
				{
					JTA.setText(j.getSelectedFile().getAbsolutePath());
				}
				break;
		}
    }

	/**
	 * This method will be used for cleaning out the JTextAreas
	 * Everytime that they are called apon to be used again they will be cleaned
	 */
	public static void Text_Cleaner(int i)
	{	
		switch(i)
		{
			case 1:
				Variables.Queue_Content.selectAll();
        		Variables.Queue_Content.replaceSelection("");
				break;
			default:
				Variables.Text_Area_Paramater1.selectAll();
				Variables.Text_Area_Paramater1.replaceSelection("");
				
				Variables.Text_Area_Paramater2.selectAll();
				Variables.Text_Area_Paramater2.replaceSelection("");
				
				Variables.Text_Area_Paramater3.selectAll();
				Variables.Text_Area_Paramater3.replaceSelection("");
				break;
		}
	}

	/**
	 * All the methods/code below are imported from our old project.
	 * Lazy, but effective
	 */
    public static void Text_Box_Format_Method(JTextArea JTF) 
	{
        JTF.setLineWrap(true); //wraps any text around to fit inside the box
        JTF.setFont(new Font("Times New Roman", Font.BOLD, 18)); //best font choice
    }

	public static void Text_Button(JButton JB, int i)
	{
		switch (i)
		{
			case 0: //the user has finished the step
			JB.setText("Done");
			break;

			case 1: //disabled buttons
			JB.setText("Finish the previous step to move on");
			break;

			case 2: //path button
			JB.setText("Select your destination");
			break;

			case 3: //only for when naming the file
			JB.setText("What do you want to name your file?");
			break;

			case 4:
			JB.setText("What is the return type of your method?");
			break;

			case 5:
			JB.setText("What is the name of method are we adding this content to?");
			break;
		}
	}
}
