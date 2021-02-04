/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 2.0
 */
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First_Window extends JFrame implements ActionListener {
    Generic_Methods M = new Generic_Methods();
    private static final long serialVersionUID = 1L;
    /**
     * This method will be better set up later. Right now we just needed a mock
     * window to test out our code
     */
    public void New_Window() {
        Variables.Translator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.Translator.setSize(500, 500);
        Variables.TR_Enter.addActionListener(this);
        Variables.TR_Panel.setLayout(new GridLayout(2, 1));
        Variables.TR_Panel.add(Variables.TR_Text_Area);
        Variables.TR_Panel.add(Variables.TR_Enter);
        Variables.Translator.add(Variables.TR_Panel);
        Variables.Translator.setVisible(true);
    }

    //we had to move this here because we can't use "this" in a static context, 
    //so we decided to make a method here for it
    public void ActionSetter()
    {
        //create file button action listeners, "new file"
        Variables.File_Name_Button.addActionListener(this);
        Variables.Folder_Path_Button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Variables.User_Input = Variables.TR_Text_Area.getText();
        Variables.User_Input.toLowerCase(); // for easier coding
        if (e.getSource() == Variables.TR_Enter) 
        {
            ActionSetter(); //this will set all the action listers for all the panel buttons
            Generic_Methods.Panel_Name_Setter(); //this is used to set names of panels so for later arguments
            Generic_Methods.Input_Parsing(Variables.User_Input); //Used in our queue so that commands will be put in the correct order
            Generic_Methods.Translation();//calles the method works out what commands to run
        }
        else 
        {
            M.actionPerformed(e); //this is used so that all other button presses that are used are transfered to the other file to be interperted
        }
    }
}
