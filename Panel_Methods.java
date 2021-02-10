
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 3.0
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Panel_Methods {
	/**
	 * This takes a JPanel input so the window can add the correct JPanel depending
	 * on what current action is taking place
	 * 
	 * @param JP
	 */
	public static void Input_Window(JPanel JP) {
		Variables.Input_Window.getContentPane().removeAll();// This is to make sure that the window is reuseable every
		Variables.Input_Window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // the new window only closes that window and not others
		Variables.Input_Window.setSize(700, 700);
		Variables.Input_Window.add(JP); // adds the correct JPanel depending on what the user wants
		Variables.Input_Window.setLocationRelativeTo(null); // sets the panel in the middle of the users screen
		Variables.Input_Window.setVisible(true);
		Variables.Input_Window.getContentPane().validate();
		Variables.Input_Window.repaint();
	}

	/**
	 * This solves a lot of our problems we had before Since we set everything to
	 * static, we can have a proper JPanel paramater. Depending on how may buttons
	 * we need the panel to have, the 'i' variable will determine how many buttons
	 * we need to add
	 * 
	 * @param JP
	 * @param i
	 */
	public static void Panel_Settings(JPanel JP, int i) {
		JP.setLayout(new GridLayout(i, 2)); // how may rows we need for our buttons, we will only ever have 2 coloums
		
		JP.add(Variables.Path_Button);
		Generic_Methods.Text_Button(Variables.Path_Button, 2); //sets the text
		
		JP.add(Variables.Text_Area_Paramater1);
		Generic_Methods.Text_Box_Format_Method(Variables.Text_Area_Paramater1);

		JP.add(Variables.Naming_Button1);
		Variables.Naming_Button1.setEnabled(false);
		Generic_Methods.Text_Button(Variables.Naming_Button1, 1); //sets the text

		JP.add(Variables.Text_Area_Paramater2);
		Generic_Methods.Text_Box_Format_Method(Variables.Text_Area_Paramater2);

		switch (i) 
		{
			case 4:
				JP.add(Variables.Naming_Button2);
				Variables.Naming_Button2.setEnabled(false);
				Generic_Methods.Text_Button(Variables.Naming_Button2, 1); //sets the text
				
				JP.add(Variables.Text_Area_Paramater3);
				Generic_Methods.Text_Box_Format_Method(Variables.Text_Area_Paramater3);
		}

		JP.add(Variables.Remove);
		Variables.Remove.setEnabled(false);

		JP.add(Variables.Queue_Content);
		Generic_Methods.Text_Box_Format_Method(Variables.Queue_Content);
		Variables.Queue_Content.setEditable(false);
	}
}
