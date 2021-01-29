import javax.swing.JFrame;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Window_Methods implements ActionListener {
	// This file will store where out panels settings are stored
	TR_Variables TRV = new TR_Variables();
	
	/**
	 * The only purpose of this method is to run all my Panel settings methods.
	 * We could not find a more efficient way of adding content to my panels in a effectively.
	 * This is the most effective way whitout have a large amount of code
	 */
	public void Method_Runner() 
	{
		//will add more methods to run later, for now its only one
		File_Creation_Panel();
	}


	//JP is considerend its own, seperate JPanel and not the input the method call
	public void Input_Window(String JP) //we have to grab the name of the panel input to set it correctly
	{
		TRV.Input_Window.getContentPane().removeAll();//This is to make sure that the wondow is reuseable every time
		TRV.Input_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TRV.Input_Window.setSize(500, 500);
		
		
		//We will have to do a few different loops once we add more panels
		//this is the only way to get different panels added to the frame
		//look into switch statements later
		if (JP == TRV.Folder_Panel.getUIClassID()) 
		{
			TRV.Input_Window.add(TRV.Folder_Panel); // find out why JP does not work //turns out you need to manually set the manels
		}
		
		//these are at the end because these need to happen last
		TRV.Input_Window.getContentPane().validate();
		TRV.Input_Window.repaint();
		TRV.Input_Window.setVisible(true);
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

		TRV.Folder_Panel.setEnabled(true);
	}

	// //dumb idea but i wat to test it
	// public void testing_something()
	// {
	// 	JP.setLayout(new GridLayout(2,2));
	// 	JP.add(TRV.Folder_Path_Button);
	// 	JP.add(TRV.Folder_Path_Text_Area);

	// 	JP.add(TRV.File_Name_Button);
	// 	JP.add(TRV.File_Name_Text_Area);

	// 	TRV.File_Name_Button.addActionListener(this);
	// 	TRV.Folder_Path_Button.addActionListener(this);
	// }

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Possible have the inputs be moved to its own file so that we can have a dedicated file for it

	}
}
