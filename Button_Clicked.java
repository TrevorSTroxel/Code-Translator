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
		else if (e.getSource() == Variables.File_Button)
		{
			Generic_Methods.Location(Variables.File_Text_Area, 2);
			Variables.Paramater1 = Variables.File_Text_Area.getText();
		}
		else if (e.getSource() == Variables.Return_Type_Button)
		{
			Variables.Paramater2 = Variables.Return_Type_Text_Area.getText();
		}
		else if (e.getSource() == Variables.Method_Name_Button)
		{
			Variables.Paramater3 = Variables.Method_Name_Text_Area.getText();
			Create.Create_Method(Variables.Paramater1, Variables.Paramater2, Variables.Paramater3);
			Generic_Methods.Remove_Button_Enabler(1);
		}
		////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		//will com back to, but first I want to add the functionality to add methods
		//add content panel buttons
		else if (e.getSource() == Variables.File_Path_Button)
		{
			Generic_Methods.Location(Variables.File_Path_Text_Area, 2); //grabs the text in the folder path area
			Variables.Paramater1 = Variables.File_Path_Text_Area.getText(); //sets the generic paramater1 to hold the folder location
		}
		else if (e.getSource() == Variables.Getting_Method_Name_Button)
		{
			Variables.Paramater2 = Variables.Getting_Method_Name_Text_Area.getText();
		}
		else if (e.getSource() == Variables.File_Add_Content_Button)
		{
			Variables.Paramater3 = Variables.File_Add_Content_Text_Area.getText();
			Create.Add_To_Method(Variables.Paramater1, Variables.Paramater2, Variables.Paramater3);
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

		
	}

    
}
