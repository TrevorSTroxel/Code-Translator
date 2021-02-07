/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 2.0
 */
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JScrollPane;


public class Panel_Methods 
{
	/**
	 * this is where all the panels we create will be set up in
	 * Input_Window method is used to add the correct panel to the program
	 */
    public static void Input_Window(String JP) // we have to grab the name of the panel input to set it correctly
	{
		Variables.Input_Window.getContentPane().removeAll();// This is to make sure that the window is reuseable every time
		Variables.Input_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variables.Input_Window.setSize(500, 500);

        //We need this to set the correct panels to the correct statements
        //look into switch statements later
		if (JP == Variables.Folder_Panel.getName()) 
		{
			Variables.Input_Window.add(Variables.Folder_Panel);
		} 
        else if (JP == "File says") 
		{
			Variables.Input_Window.add(Variables.Content_Panel);
		}

		Variables.Input_Window.setVisible(true);
        //the bottom two commands make it so the window refreshes itself so that the use does not have to move it
		Variables.Input_Window.getContentPane().validate();
		Variables.Input_Window.repaint();
	}


	/**
	 * Sets up the window for the user to read the instructions
	 */
	public static void Help_Settings()
	{
		Variables.Instructions.setEditable(false); // the user can't edit the text
        Font f = new Font("Times New Roman", Font.BOLD, 16); // this sets up the style of the text for the new window
        Variables.Instructions.setFont(f); // sets the style of the text
        JScrollPane iscrollPane = new JScrollPane(Variables.Instructions); // we have a large txt document, so this is
                                                                           // used to see all the contents of it
        iscrollPane.setPreferredSize(new Dimension(650, 500)); // sets up how much room is seen on the text file
        Variables.Help_Panel.add(iscrollPane);
        Variables.Help_Panel.setEnabled(true);

        Variables.Input_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.Input_Window.setSize(700, 700);
        Variables.Input_Window.add(Variables.Help_Panel);
        Variables.Input_Window.setVisible(true);
	}


	/**
	 * This is the Panel settings for File Creation
	 * this called when "new file" is typed
	 * the action listers for the buttons were moved because they can not be called statically
	 */
	public static void File_Creation_Panel() 
	{
		Variables.Folder_Panel.setLayout(new GridLayout(3, 2));

		Variables.Folder_Panel.add(Variables.Folder_Path_Button);
		Variables.Folder_Panel.add(Variables.Folder_Path_Text_Area);

		Variables.Folder_Panel.add(Variables.File_Name_Button);
		Variables.Folder_Panel.add(Variables.File_Name_Text_Area);

		Variables.Folder_Panel.add(Variables.Remove);
	}

	public static void Add_Content_Panel()
	{
		Variables.Content_Panel.setLayout(new GridLayout(3, 2));

		Variables.Content_Panel.add(Variables.File_Path_Button);
		Variables.Content_Panel.add(Variables.File_Path_Text_Area);

		Variables.Content_Panel.add(Variables.File_Add_Content_Button);
		Variables.Content_Panel.add(Variables.File_Add_Content_Text_Area);

		Variables.Content_Panel.add(Variables.Remove);
	}
}
