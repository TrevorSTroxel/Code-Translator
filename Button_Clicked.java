/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 2.0
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button_Clicked implements ActionListener 
{
    /**
     * the only point of this file is that it will intake button presses
     * and do the correct action
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
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
			Generic_Methods.Translation(); //called again to run the next command
		}

    }

    
}
