import javax.swing.JFrame;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Window_Methods implements ActionListener {
	// This file will store where out panels settings are stored
	TR_Variables TRV = new TR_Variables();
	Create CR = new Create();
	String_To_Code STC = new String_To_Code();
	
	/**
	 * The only purpose of this method is to run all my Panel settings methods.
	 * We could not find a more efficient way of adding content to my panels in a effectively.
	 * This is the most effective way whitout have a large amount of code
	 */
	public void Method_Runner() 
	{
		//will add more methods to run later, for now its only one
		File_Creation_Panel();
		Panel_Name_Setter();
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
		if (JP == TRV.Folder_Panel.getName()) 
		{
			TRV.Input_Window.add(TRV.Folder_Panel); // find out why JP does not work //turns out you need to manually set the manels
		}
		else if (JP == "File naming")
		{
			TRV.Input_Window.add(TRV.File_Naming_test_EX);
		}
		
		//these are at the end because these need to happen last
		TRV.Input_Window.getContentPane().validate();
		TRV.Input_Window.repaint();
		TRV.Input_Window.setVisible(true);
	}

	public void File_Creation_Panel() 
	{
		TRV.Folder_Panel.setLayout(new GridLayout(2,2));

		TRV.File_Name_Button.addActionListener(this);
		TRV.Folder_Path_Button.addActionListener(this);
		
		TRV.Folder_Panel.add(TRV.Folder_Path_Button);
		TRV.Folder_Panel.add(TRV.Folder_Path_Text_Area);

		TRV.Folder_Panel.add(TRV.File_Name_Button);
		TRV.Folder_Panel.add(TRV.File_Name_Text_Area);
	}

	//This function will set names for panels and store the names in an array to be used later
	public void Panel_Name_Setter()
	{
		TRV.Folder_Panel.setName("Folder Panel");
	}

	//PPOSSIBLE LOOK INTO MAKING THE PROGRAM WAIT UNTIL A BUTTON IS PRESSED, THEN AFTER A BUTTON IS PRESSED IT GOES TO THE NEXT COMMAND THAT THE USER HAS INPUTED
	@Override
	public void actionPerformed(ActionEvent e) 
	{
        if(e.getSource() == TRV.Folder_Path_Button)
        {
            TRV.Paramater1 = TRV.Folder_Path_Text_Area.getText();
        }
        else if(e.getSource() == TRV.File_Name_Button)
        {
            TRV.Paramater2 = TRV.File_Name_Text_Area.getText();
			CR.create_file(TRV.Paramater1, TRV.Paramater2);
            STC.Translation(TRV.TR_Text_Area.getText());
        }
	}
}
