/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 2.0
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
            Panel_Methods.File_Creation_Panel(); //used to run the file creation panel settings
            Panel_Methods.Input_Window("Folder Panel"); //sets the second window panel to the correct one
        }
        else if (Variables.Order_Of_Commands.peek().equals("say"))
        {
			Panel_Methods.Input_Window("File naming"); //dummy panel right now. will set up actual panel later
        }
    }

	//Used for setting the names of the panels for later for arguments
	public static void Panel_Name_Setter() 
	{
		Variables.Folder_Panel.setName("Folder Panel");
	}

	//this allows the users to click a button and set either the folder location or the file location
	public static void Location(JTextArea JTF, int i) 
	{
		if (i == 1) //this is used for if the user must select a folder
		{
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); //this opens up a crude file explorer for the user to use
			j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); //this makes it so that they can only select folder locations
			if (j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) //this checks to make sure that the option you choose was valid
			{
				JTF.setText(j.getSelectedFile().getAbsolutePath()); //this writes the file path to the text area for the user to see
			}
		}

		else if (i == 2) //used to select files
		{
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); //this opens up a crude file explorer for the user to use
			j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); //this makes it so that they can only select folder locations
			if (j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) //this checks to make sure that the option you choose was valid
			{
				JTF.setText(j.getSelectedFile().getAbsolutePath()); //this writes the file path to the text area for the user to see
			}
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
		if (User_Input.contains("new file"))
		{
			Variables.Order_Of_Commands.add("new file");
		}
		if (User_Input.contains("say"))
		{
			Variables.Order_Of_Commands.add("say");
		}
	}

}
