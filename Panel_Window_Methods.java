import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Window_Methods implements ActionListener {
	// This file will store where out panels settings are stored
	TR_Variables TRV = new TR_Variables();

	public void Input_Window(JPanel JP) //work on gettign JP to work correctly
	{
		TRV.Input_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TRV.Input_Window.setSize(500, 500);
		TRV.Input_Window.add(TRV.Folder_Panel); // find out why JP does not work
		TRV.Input_Window.setVisible(true);
	}

	/**
	 * The only purpose of this method is to run all my Panel settings methods.
	 * We could not find a more efficient way of adding content to my panels in a effectively.
	 * This is the most effective way whitout have a large amount of code
	 */
	public void Method_Runner() 
	{
		File_Creation_Panel();
	}

	public void File_Creation_Panel() 
	{
		TRV.Folder_Panel.setLayout(new GridLayout(2,2));
		TRV.Folder_Panel.add(TRV.Folder_Path_Button);
		TRV.Folder_Panel.add(TRV.Folder_Path_Text_Area);

		TRV.Folder_Panel.add(TRV.File_Name_Button);
		TRV.Folder_Panel.add(TRV.File_Name_Text_Area);

		TRV.File_Name_Button.addActionListener(this);
		TRV.Folder_Path_Button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Possible have the inputs be moved to its own file so that we can have a dedicated file for it

	}
}
