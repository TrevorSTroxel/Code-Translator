/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 3.0
 */
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

// Method storage
public class Generic_Methods
{
	//used to seperate the commands that the user inputs
    public static void Translation()
    {
        if (Variables.Order_Of_Commands.peek().equals("new file"))
        {
			//This will be for File creation
			Panel_Methods.Panel_Settings(Variables.Folder_Panel, 3);
            Panel_Methods.Input_Window(Variables.Folder_Panel); //sets the second window panel to the correct one
        }
		//testing to see if a JPanel can be used as a paramater in take
		else if (Variables.Order_Of_Commands.peek().equals("make"))
        {
			//This is for adding methods to files
			Panel_Methods.Panel_Settings(Variables.Method_Panel, 4);
			Panel_Methods.Input_Window(Variables.Method_Panel); //calles the method to get the second window
        }
        else if (Variables.Order_Of_Commands.peek().equals("say"))
        {
			//this is for add any for of content to a method found within a file
			Panel_Methods.Panel_Settings(Variables.Content_Panel, 4);
			Panel_Methods.Input_Window(Variables.Content_Panel); //calles the method to get the second window
        }
    }

	/**
	 * This will put certain things in the queue in order so that
	 * no matter where the user types the commands, the program will put them in the correct order
	 * and then run the commands in the proer order they must go in.
	 * More commands will be add later that can be interperted and added to the queue
	 * @param User_Input
	 * 
	 * We also have to make sure that when we add things to this queue, they go in a logical order
	 * we can think about the logic of how commands should be interperted at a later point, but for now
	 * we are just trying to get our program worrking correctly
	 * 
	 * We also want to add a JLabel to go along with the queue
	 * The JLabel will display what the current list of commands are in there so that the user knows what is happening
	 */
	public static void Input_Parsing(String User_Input)
	{
		//if the user wants to make a new file
		if (User_Input.contains("new file"))
		{
			Variables.Order_Of_Commands.add("new file");
		}
		//if the user wants to make a method
		if (User_Input.contains("make")) //may want to change later to be something easier to type in a nromal sentence, but for now this is what we have
		{
			Variables.Order_Of_Commands.add("make");
		}
		//this is subject to change for what the user can say to trigger this, but this will be where the user asks where to put stuff
		if (User_Input.contains("say"))
		{
			Variables.Order_Of_Commands.add("say");
		}
	}


	//this allows the users to click a button and set either the folder location or the file location
	public static void Location(JTextArea JTA, int i) 
	{
		if (i == 1) //this is used for if the user must select a folder
		{
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); //this opens up a crude file explorer for the user to use
			j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //this makes it so that they can only select folder locations
			if (j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) //this checks to make sure that the option you choose was valid
			{
				JTA.setText(j.getSelectedFile().getAbsolutePath()); //this writes the file path to the text area for the user to see
			}
		}

		else if (i == 2) //used to select files
		{
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
			j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
			if (j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION);
			{
				JTA.setText(j.getSelectedFile().getAbsolutePath());
			}
		}
    }

	/**
	 * This method will be used for cleaning out the JTextAreas
	 * Everytime that they are called apon to be used again they will be cleaned out here
	 * 
	 */
	public static void Text_Cleaner()
	{
		Variables.Text_Area_Paramater1.selectAll();
		Variables.Text_Area_Paramater1.replaceSelection("");
		
		Variables.Text_Area_Paramater2.selectAll();
		Variables.Text_Area_Paramater2.replaceSelection("");
		
		Variables.Text_Area_Paramater3.selectAll();
		Variables.Text_Area_Paramater3.replaceSelection("");
	}

}
