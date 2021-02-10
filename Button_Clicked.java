/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 3.0
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
		/**
		 * Since we have switched over to generics vaziables insteads of having serveral unique functions,
		 * This file is now much more manageable to use now.
		 * This is subject to change, but for the moment this is a easy to manage file
		 */
		if (e.getSource() == Variables.Path_Button)
		{
			if (Variables.Folder_Panel.isDisplayable() == true)
			{
				Generic_Methods.Location(Variables.Text_Area_Paramater1, 1); //grabs the text in the folder path area
				Variables.Paramater1 = Variables.Text_Area_Paramater1.getText(); //sets the generic paramater1 to hold the folder location
			}
			else
			{
				Generic_Methods.Location(Variables.Text_Area_Paramater1, 2); //grabs the text in the folder path area
				Variables.Paramater1 = Variables.Text_Area_Paramater1.getText(); //sets the generic paramater1 to hold the folder location
			}
			Variables.Naming_Button1.setEnabled(true);
		}
		else if (e.getSource() == Variables.Naming_Button1)
		{
			Variables.Paramater2 = Variables.Text_Area_Paramater2.getText();
			if (Variables.Folder_Panel.isDisplayable() == true)
			{
				Create.Create_File(Variables.Paramater1, Variables.Paramater2); //runs our file creation method using our paramaters
				Variables.Remove.setEnabled(true);
			}
			else 
			{ 
				Variables.Naming_Button2.setEnabled(true);
			}
		}
		else if (e.getSource() == Variables.Naming_Button2)
		{
			Variables.Paramater3 = Variables.Text_Area_Paramater3.getText();

			if (Variables.Method_Panel.isDisplayable() == true)
			{
				Create.Create_Method(Variables.Paramater1, Variables.Paramater2, Variables.Paramater3);
			}
			else if (Variables.Content_Panel.isDisplayable() == true)
			{
				Create.Add_To_Method(Variables.Paramater1, Variables.Paramater2, Variables.Paramater3);
			}
			Variables.Remove.setEnabled(true);
		}
	}

    
}
