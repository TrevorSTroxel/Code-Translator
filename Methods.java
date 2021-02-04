import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Methods implements ActionListener {
	// Method storage
	    //had to move this to test something
    //THIS IS CURSED
    public static void Translation(String INPUT2)
    {
        if (Variables.Order_Of_Commands.peek().equals("new file"))
        {
            Methods.File_Creation_Panel(); // look at file for desription
            Methods.Input_Window("Folder Panel");
        }
        else if (Variables.Order_Of_Commands.peek().equals("say"))
        {
            // PWM.Input_Window("Folder Panel");
        }
    } //so the menu only works after the method is finished. look into ways to work around this
	
	/**
	 * The only purpose of this method is to run all my Panel settings methods. We
	 * could not find a more efficient way of adding content to my panels in a
	 * effectively. This is the most effective way whitout have a large amount of
	 * code
	 */
	public static void Method_Runner() 
	{
		// will add more methods to run later, for now its only one
		//File_Creation_Panel();
		Panel_Name_Setter();
	}

	// JP is considerend its own, seperate JPanel and not the input the method call
	public static void Input_Window(String JP) // we have to grab the name of the panel input to set it correctly
	{
		Variables.Input_Window.getContentPane().removeAll();// This is to make sure that the wondow is reuseable every time
		Variables.Input_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Variables.Input_Window.setSize(500, 500);

		// We will have to do a few different loops once we add more panels
		// this is the only way to get different panels added to the frame
		// look into switch statements later
		if (JP == Variables.Folder_Panel.getName()) {
			Variables.Input_Window.add(Variables.Folder_Panel);
		} else if (JP == "File naming") {
			Variables.Input_Window.add(Variables.File_Naming_test_EX);
		}

		// these are at the end because these need to happen last
		Variables.Input_Window.setVisible(true);
		Variables.Input_Window.getContentPane().validate();
		Variables.Input_Window.repaint();
	}

	public static void File_Creation_Panel() {
		Variables.Folder_Panel.setLayout(new GridLayout(2, 2));

		Variables.Folder_Panel.add(Variables.Folder_Path_Button);
		Variables.Folder_Panel.add(Variables.Folder_Path_Text_Area);


		Variables.Folder_Panel.add(Variables.File_Name_Button);
		Variables.Folder_Panel.add(Variables.File_Name_Text_Area);
	}

	// This function will set names for panels and store the names in an array to be
	// used later
	public static void Panel_Name_Setter() {
		Variables.Folder_Panel.setName("Folder Panel");
	}

	public static void FileSelect(JTextArea JTF) {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) 
		{
            // set the label to the path of the selected directory
            Variables.l.setText(j.getSelectedFile().getAbsolutePath());
        }
        JTF.setText(Variables.l.getText());
    }

	//we are attempting to do queues in our code
	public static void Input_Parsing(String INPUT2)
	{
		if (INPUT2.contains("new file"))
		{
			Variables.Order_Of_Commands.add("new file");
		}
		else if (INPUT2.contains("say"))
		{
			Variables.Order_Of_Commands.add("say");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Variables.Folder_Path_Button) 
		{
			Methods.FileSelect(Variables.Folder_Path_Text_Area);
			Variables.Paramater1 = Variables.Folder_Path_Text_Area.getText();
		} 
		else if (e.getSource() == Variables.File_Name_Button) 
		{
			Variables.Paramater2 = Variables.File_Name_Text_Area.getText();
			Create.create_file(Variables.Paramater1, Variables.Paramater2);
			Variables.Order_Of_Commands.remove();
			Translation(Variables.INPUT2);
		}

	}
}
