import javax.swing.JFrame;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class First_Window extends JFrame implements ActionListener {
    Methods M = new Methods();
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

    public void ActionSetter()
    {
        Variables.File_Name_Button.addActionListener(this);
        Variables.Folder_Path_Button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Variables.INPUT2 = Variables.TR_Text_Area.getText();
        Variables.INPUT2.toLowerCase(); // for easier coding
        Methods.Input_Parsing(Variables.INPUT2);
        ActionSetter();
        if (e.getSource() == Variables.TR_Enter) 
        {
            Methods.Translation(Variables.INPUT2);
        }
        else 
        {
            M.actionPerformed(e);
        }
    }
}
