
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
        if (Variables.Order_Of_Commands.peek().equals("new file"))
        {
			//This will be for File creation
			Panel_Methods.Panel_Settings(Variables.Folder_Panel, 3);
            Panel_Methods.Input_Window(Variables.Folder_Panel); //sets the second window panel to the correct one
        }
		else if (Variables.Order_Of_Commands.peek().equals("make")) //add more paramaters
        {
			//This is for adding methods to files
			Panel_Methods.Panel_Settings(Variables.Method_Panel, 4);
			Panel_Methods.Input_Window(Variables.Method_Panel); //calles the method to get the second window
        }
        else if (Variables.Order_Of_Commands.peek().equals("say")) //add mkore paramaters
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
	 */
	public static void Input_Parsing(String User_Input)
	{
		int i = 0; //this will be used to make a list to the JLabel, making it easier for users to understand
		//possibly think about making an array list and then putting all that content inside a jtextarea
		//that way when one command is done, it removes it from the list and will update that for the user

		//Creates a file
		if (User_Input.contains("new file"))
		{
			i++;
			Variables.Order_Of_Commands.add("new file");
			//adds a list to the JTextArea for the user to see so they know what is happening
			Variables.Storage.add(i + ". Creating a new file.");
		}
		//Adds a method
		if (User_Input.contains("make")) //change later to be something easier to type in a normal sentence, but for now this is what we have
		{
			i++;
			Variables.Order_Of_Commands.add("make");
			Variables.Storage.add(i + ". Adding a method the chosen file.");
		}
		//this is subject to change for what the user can say to trigger this, but this will be where the user asks where to put stuff
		//Add more paramaters for what can trigger this in the near future
		//Adds content to a file
		if (User_Input.contains("say"))
		{
			i++;
			Variables.Order_Of_Commands.add("say");
			Variables.Storage.add(i + ". Adding content to add to a method.");
		}

		for (int j = 0; j < Variables.Storage.size(); j++)
		{
			Variables.Queue_Content.setText(Variables.Queue_Content.getText() + Variables.Storage.get(j) + "\n");
		}
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
            Variables.Queue_Content.selectAll();
            Variables.Queue_Content.replaceSelection("");
            for (int j = 0; j < Variables.Storage.size(); j++)
            {
                Variables.Queue_Content.append(Variables.Storage.get(j) + "\n");
    		}
        }
    }

	//Allows the user to select a location
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
	 * Everytime that they are called apon to be used again they will be cleaned
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

	/**
	 * All the methods/code below are imported from our old project.
	 * Lazy, but effective
	 */
    public static void Text_Box_Format_Method(JTextArea JTF) 
	{
        JTF.setLineWrap(true); //wraps any text around to fit inside the box
        JTF.setFont(new Font("Times New Roman", Font.BOLD, 18)); //best font choice
    }

	//come back to this later, add another paramater so that the program can know what to set the text to in particular
	public static void Button_Text_Change(JButton JB)
	{
		if (JB == Variables.Path_Button)
		{
			JB.setText("<html>You have chosen your directory.<br/>Move on to the next part</html>");
		}
		else 
		{
			JB.setText("<html>Name has been set.<br/>You may change it by typeing in something different and clicking again</html>");
		}
	}

}
