
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 3.0
 */
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JScrollPane;


public class Panel_Methods 
{
	/**
	 * This takes a JPanel input so the window 
	 * can add the correct JPanel depending on what current action is taking place
	 * @param JP
	 */
    public static void Input_Window(JPanel JP)
	{
		Variables.Input_Window.getContentPane().removeAll();// This is to make sure that the window is reuseable every time
		Variables.Input_Window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //the new window only closes that window and not others
		Variables.Input_Window.setSize(500, 500);
		
		Variables.Input_Window.add(JP); //adds the correct JPanel depending on what the user wants
		
		Variables.Input_Window.setVisible(true);
		Variables.Input_Window.getContentPane().validate();
		Variables.Input_Window.repaint();
	}

	/**
	 * Sets up the window for the user to read the instructions
	 * Imported from our old code, as this is still reauseable.
	 * Did not want to re-invent the wheel
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

        Variables.Input_Window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Variables.Input_Window.setSize(700, 700);
        Variables.Input_Window.add(Variables.Help_Panel);
        Variables.Input_Window.setVisible(true);
	}

	/**
	 * This solves a lot of our problems we had before
	 * Since we set everything to static, we can have a proper JPanel paramater.
	 * Depending on how may buttons we need the panel to have, the 'i' variable will determine
	 * how many buttons we need to add
	 * @param JP
	 * @param i
	 */
	public static void Panel_Settings(JPanel JP, int i)
	{
		JP.setLayout(new GridLayout(i, 2));

		JP.add(Variables.Path_Button);
		JP.add(Variables.Text_Area_Paramater1);

		JP.add(Variables.Naming_Button1);
		//We disable these buttons so that the user can not do them out of order
		//They are re-enabled once the user clicks on the previous one
		Variables.Naming_Button1.setEnabled(false); 
		JP.add(Variables.Text_Area_Paramater2);

		if (i == 4)
		{
			JP.add(Variables.Naming_Button2);
			Variables.Naming_Button2.setEnabled(false);
			JP.add(Variables.Text_Area_Paramater3);
		}

		JP.add(Variables.Remove);
		Variables.Remove.setEnabled(false);
		JP.add(Variables.Queue_Content);
		Variables.Queue_Content.setEnabled(false);
	}
}
