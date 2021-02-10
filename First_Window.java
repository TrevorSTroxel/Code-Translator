
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 3.0
 */
import javax.swing.JFrame;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
import java.io.InputStreamReader;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JScrollPane;

public class First_Window extends JFrame implements ActionListener 
{
    Button_Clicked BC = new Button_Clicked(); //Only time we will need to make an Object, all other times are will be static
    private static final long serialVersionUID = 1L; //makes VSCode happy
    
    /**
     * Used to set up the first window the user sees
     * May change or work on later to look better, have a better layout than current one
     * Look into possible cleanup of this method later
     */
    public void New_Window() 
    {
        Variables.Translator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Variables.Translator.setSize(500, 500);
        Variables.TR_Panel.setLayout(new GridLayout(3, 1));
        Variables.TR_Panel.add(Variables.TR_Text_Area);
        Variables.TR_Panel.add(Variables.TR_Enter);
        Variables.TR_Panel.add(Variables.Help); 

        Variables.TR_Enter.addActionListener(this);
        Variables.Help.addActionListener(this);     

        Variables.Translator.add(Variables.TR_Panel);
        Variables.Translator.setLocationRelativeTo(null); //sets it in the middle of the screen
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
        //these are the only buttons that we will need, not more unique buttons.
        //possibly add more here later, but for now we only have these
        Variables.Remove.addActionListener(this);
        Variables.Path_Button.addActionListener(this);
        Variables.Naming_Button1.addActionListener(this);
        Variables.Naming_Button2.addActionListener(this);
        //////////////////////////////////////////////////////
    }

    /**
     * This code was imported from our other project
     * we decided that since it was already there and still useable, why not just use it again
     * Read some text from the resource file to display in the JTextArea.
     * want to change this later, as it is somewhat ugly looking
     */
    public void Help() 
    {
        try 
        {
            Variables.Instructions.read(new InputStreamReader(getClass().getResourceAsStream("/help.txt")), null);
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }

		Variables.Instructions.setEditable(false); // the user can't edit the text
        Font f = new Font("Times New Roman", Font.BOLD, 16); // this sets up the style of the text for the new window
        Variables.Instructions.setFont(f); // sets the style of the text
        JScrollPane iscrollPane = new JScrollPane(Variables.Instructions); // we have a large txt document, so this is
                                                                           // used to see all the contents of it
        iscrollPane.setPreferredSize(new Dimension(650, 500)); // sets up how much room is seen on the text file
        Variables.Help_Panel.add(iscrollPane);
        Variables.Help_Panel.setEnabled(true);

        Variables.Input_Window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Variables.Input_Window.setSize(700, 700);
        Variables.Input_Window.add(Variables.Help_Panel);
		Variables.Input_Window.setLocationRelativeTo(null);
        Variables.Input_Window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Variables.User_Input = Variables.TR_Text_Area.getText();
        Variables.User_Input.toLowerCase(); // for easier coding

        if (e.getSource() == Variables.TR_Enter) 
        {
            ActionSetter(); //this will set all the action listers for all the panels to use
            Generic_Methods.Input_Parsing(Variables.User_Input); //Used in our queue so that commands will be put in the correct order
            Generic_Methods.Translation();//calles the method works out what commands to run
        }

        else if (e.getSource() == Variables.Remove)
        {
            Generic_Methods.Text_Cleaner(0); //this will be called every time we move onto a new command as we need clean fields every time
            Generic_Methods.Queue_Check(); //at the moment not working correctly, but is supposed to stop the user from removing what is not there
			Generic_Methods.Translation(); //called again to run the next command
        }  

        else if (e.getSource() == Variables.Help)
        {
            Help(); //for thoses who do not know what they are doing
        }

        else 
        {
            BC.actionPerformed(e); //this is used so that all other button presses that are used are transfered to the other file to be interperted
        }
    }
}
