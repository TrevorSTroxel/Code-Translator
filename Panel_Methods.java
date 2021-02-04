import javax.swing.JFrame;
import java.awt.GridLayout;

public class Panel_Methods {
    //this is where all the panels we create will be set up in
    // Input_Window method is used to add the correct panel to the program
    
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
        else if (JP == "File naming") 
		{
			Variables.Input_Window.add(Variables.File_Naming_test_EX);
		}

		Variables.Input_Window.setVisible(true);
        //the bottom two commands make it so the window refreshes itself so that the use does not have to move it
		Variables.Input_Window.getContentPane().validate();
		Variables.Input_Window.repaint();
	}

    //This is the Panel settings for File Creation
    //this called when "new file" is typed
    //the action listers for the buttons were moved because they can not be called statically
	public static void File_Creation_Panel() 
	{
		Variables.Folder_Panel.setLayout(new GridLayout(2, 2));

		Variables.Folder_Panel.add(Variables.Folder_Path_Button);
		Variables.Folder_Panel.add(Variables.Folder_Path_Text_Area);

		Variables.Folder_Panel.add(Variables.File_Name_Button);
		Variables.Folder_Panel.add(Variables.File_Name_Text_Area);
	}
    
}
