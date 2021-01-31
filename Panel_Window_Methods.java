//import javax.swing.JFrame;
//import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Window_Methods implements ActionListener {
	// This file will store where out panels settings are stored
	TR_Variables TRV = new TR_Variables();
	Create CR = new Create();
	//String_To_Code STC = new String_To_Code(); // this breaks the code for some
	// reason

	/**
	 * The only purpose of this method is to run all my Panel settings methods. We
	 * could not find a more efficient way of adding content to my panels in a
	 * effectively. This is the most effective way whitout have a large amount of
	 * code
	 */


	// PPOSSIBLE LOOK INTO MAKING THE PROGRAM WAIT UNTIL A BUTTON IS PRESSED, THEN
	// AFTER A BUTTON IS PRESSED IT GOES TO THE NEXT COMMAND THAT THE USER HAS
	// INPUTED
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == TRV.Folder_Path_Button) {
			TRV.Paramater1 = TRV.Folder_Path_Text_Area.getText();
		} else if (e.getSource() == TRV.File_Name_Button) {
			TRV.Paramater2 = TRV.File_Name_Text_Area.getText();
			CR.create_file(TRV.Paramater1, TRV.Paramater2);
			//have the translator method continue once the button is hit so it can run through the next part of the sentence the user put in
			// STC.Translation(TRV.TR_Text_Area.getText()); //can't run without the object,
			// and the object breaks the program
			TRV.a = 2;
			notify();
		}
	}
}
