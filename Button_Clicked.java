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
		/**
		 * These new generics work correctly, and my other paramaters are also working as intended
		 * next step is to basically just have generics in my variable file.
		 * Reason why we do that is because it is 
		 * 1. easier to program and to help clear up some coding space for us
		 * 2. gives us less confusion on the naming scheme for a lot of these parmaters
		 * 3. When we actually need to have a unique buttons and jtextareas, it will be a lot more noticable for us
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
		}
		else if (e.getSource() == Variables.Naming_Button1)
		{
			Variables.Paramater2 = Variables.Text_Area_Paramater2.getText();
			if (Variables.Folder_Panel.isDisplayable() == true)
			{
				Create.Create_File(Variables.Paramater1, Variables.Paramater2); //runs our file creation method using our paramaters
				Generic_Methods.Remove_Button_Enabler(1);
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
			Generic_Methods.Remove_Button_Enabler(1);
		}
	}

    
}
