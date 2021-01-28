import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel_Window_Creation implements ActionListener{
    // This file will store where out panels settings are stored
    TR_Variables TRV = new TR_Variables();
	public void Input_Window(JPanel JP) {
		TRV.Input_Window.add(JP);
		TRV.Input_Window.setVisible(true);
	}

	public void File_Creation_Panel() {
		TRV.Folder_Panel.add(TRV.Folder_Path_Button);
		TRV.Folder_Panel.add(TRV.Folder_Path_Text_Area);

		TRV.Folder_Panel.add(TRV.File_Name_Button);
		TRV.Folder_Panel.add(TRV.File_Name_Text_Area);

		TRV.File_Name_Button.addActionListener(this);
		TRV.Folder_Path_Button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
