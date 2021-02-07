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
     * and do the correct action.
	 * We are doing this for better organization and easier changes down the line
     */
    @Override
    public void actionPerformed(ActionEvent e) 
    {
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//Create file panel buttons
        if (e.getSource() == Variables.Folder_Path_Button) 
		{
			Generic_Methods.Location(Variables.Folder_Path_Text_Area, 1); //grabs the text in the folder path area
			Variables.Paramater1 = Variables.Folder_Path_Text_Area.getText(); //sets the generic paramater1 to hold the folder location
		} 
		else if (e.getSource() == Variables.File_Name_Button) 
		{
			Variables.Paramater2 = Variables.File_Name_Text_Area.getText(); //sets the text in the file name area to the generic paramater2
			Create.Create_File(Variables.Paramater1, Variables.Paramater2); //runs our file creation method using our paramaters
			Generic_Methods.Remove_Button_Enabler(1);
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//add content panel buttons
		else if (e.getSource() == Variables.File_Path_Button)
		{
			//need to come back to and fix things
			// Generic_Methods.Location(Variables.File_Path_Text_Area, 2); //grabs the text in the folder path area
			// Variables.Paramater1 = Variables.File_Path_Text_Area.getText(); //sets the generic paramater1 to hold the folder location
		}
		else if (e.getSource() == Variables.File_Add_Content_Button)
		{
			//need to come back and fix things
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		
	}

    
}
