
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 2.0
 */
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.io.InputStreamReader;

public class First_Window extends JFrame implements ActionListener 
{
    Button_Clicked BC = new Button_Clicked();
    private static final long serialVersionUID = 1L; //makes VSCode
    
    /**
     * Used to set up the first window the user sees
     * May change or work on later to lok better, have a better layout than current one
     */
    public void New_Window() 
    {
        Variables.Translator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.Translator.setSize(500, 500);
        Variables.TR_Panel.setLayout(new GridLayout(3, 1));
        Variables.TR_Panel.add(Variables.TR_Text_Area);
        Variables.TR_Panel.add(Variables.TR_Enter);
        Variables.TR_Panel.add(Variables.test); //this will change from time to time, meaning that we will remove it sometimes and other times we will keep it  
        Variables.TR_Enter.addActionListener(this);
        Variables.test.addActionListener(this);        
        Variables.Translator.add(Variables.TR_Panel);
        Variables.Translator.setVisible(true);
    }

    /**
     * we can not use "this" in static context, so we decided
     * to make a method that sets all the button action listeners
     * up right here. this may change later if we can find a better way but for 
     * right now this will suit our needs
     */
    public void ActionSetter()
    {
        //////////////////////////////////////////////////////
        //this button will be added to all panels
        Variables.Remove.addActionListener(this);
        //////////////////////////////////////////////////////
        //create file button action listeners, "new file"
        Variables.Folder_Path_Button.addActionListener(this);
        Variables.File_Name_Button.addActionListener(this);
        //////////////////////////////////////////////////////
        //Adding content action listers, "say"
        Variables.File_Path_Button.addActionListener(this);
        Variables.File_Add_Content_Button.addActionListener(this);
        //////////////////////////////////////////////////////
        //////////////////////////////////////////////////////
        //////////////////////////////////////////////////////
        //////////////////////////////////////////////////////
        //////////////////////////////////////////////////////
        //////////////////////////////////////////////////////
    }

    //made this method so that the program does not try to run commands when the queue is empty
    public void Queue_Check()
    {
        if (!Variables.Order_Of_Commands.isEmpty())
        {
            Variables.Order_Of_Commands.poll();//removes the top most element from the queue
        }
        else if (Variables.Order_Of_Commands.isEmpty())
        {
            System.out.println("The commands are all done");
        }
    }

    public void Help() 
    {
        /**
         * This code was imported from our other project
         * we decided that since it was already there and still useable, why not just use it again
         * Read some text from the resource file to display in the JTextArea.
         */
        try 
        {
            Variables.Instructions.read(new InputStreamReader(getClass().getResourceAsStream("/help.txt")), null);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
        Panel_Methods.Help_Settings();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Variables.User_Input = Variables.TR_Text_Area.getText();
        Variables.User_Input.toLowerCase(); // for easier coding
        if (e.getSource() == Variables.TR_Enter) 
        {
            ActionSetter(); //this will set all the action listers for all the panel buttons
            Generic_Methods.Panel_Name_Setter(); //this is used to set names of panels so for later arguments
            Generic_Methods.Input_Parsing(Variables.User_Input); //Used in our queue so that commands will be put in the correct order
            Generic_Methods.Translation();//calles the method works out what commands to run
        }
        else if (e.getSource() == Variables.test)
        {
            Help();
        }
        else if (e.getSource() == Variables.Remove)
        {
            Queue_Check();
			Generic_Methods.Translation(); //called again to run the next command
        }
        else 
        {
            BC.actionPerformed(e); //this is used so that all other button presses that are used are transfered to the other file to be interperted
        }
    }
}
