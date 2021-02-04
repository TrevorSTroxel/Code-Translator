import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Method storage
public class Generic_Methods implements ActionListener 
{
	//used to seperate the commands that the user inputs
    public static void Translation()
    {
        if (Variables.Order_Of_Commands.peek().equals("new file"))
        {
            Panel_Methods.File_Creation_Panel(); //used to run the file creation panel settings
            Panel_Methods.Input_Window("Folder Panel");
        }
        else if (Variables.Order_Of_Commands.peek().equals("say"))
        {
			Panel_Methods.Input_Window("File naming");
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

		else if (i == 2)
		{
			JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory()); //this opens up a crude file explorer for the user to use
			j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); //this makes it so that they can only select folder locations
			if (j.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) //this checks to make sure that the option you choose was valid
			{
				JTF.setText(j.getSelectedFile().getAbsolutePath()); //this writes the file path to the text area for the user to see
			}
		}
    }

	//This will put certain things in the queue in order so that
	//no matter where the user types the commands, the program will put them in the correct order
	//and then run the commands in the proer order they must go in
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

	//this is for cleaner code. Allows us to deal with other button presses.
	//might want to move this to its own file if we get enough commands
	//for right now it is fine here
	@Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Variables.Folder_Path_Button) 
		{
			Generic_Methods.Location(Variables.Folder_Path_Text_Area, 1); //grabs the text in the folder path area
			Variables.Paramater1 = Variables.Folder_Path_Text_Area.getText(); //sets the generic paramater1 to hold the folder location
		} 
		else if (e.getSource() == Variables.File_Name_Button) 
		{
			Variables.Paramater2 = Variables.File_Name_Text_Area.getText(); //sets the text in the file name area to the generic paramater2
			Create.create_file(Variables.Paramater1, Variables.Paramater2); //runs our file creation method using our paramaters
			//we need these functions because this is the only way to load up the next command the user inputed
			//may want to move these to be run after a different button is pressed, maybe a next command or something like that
			Variables.Order_Of_Commands.poll(); //removes the top most element from the queue
			Translation(); //called again to run the next command
		}
	}
}
