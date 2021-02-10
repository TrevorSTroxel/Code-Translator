/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 3.0
 */
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * We store all our variables in here for better organization
 * We also made them all static so that we can grab them at any point
 * look more into why static makes things work for our program
 * All possiblt think aobut creating another group of generic variables
 * of buttons and text area so that there are not so many variables.
 * will make a copy of this program and experiment with that idea later
 */
public class Variables 
{
    // These variables are for creating the starting window
    public static JFrame Translator = new JFrame("Translator");
    public static JPanel TR_Panel = new JPanel();
    public static JTextArea TR_Text_Area = new JTextArea(1, 20);
    public static JButton TR_Enter = new JButton("Enter");
    public static String User_Input = new String();
    //testing variables for the first planel
    public static JButton Help = new JButton("Click if you do not know what to do");
    public static JTextArea Instructions = new JTextArea(20, 20);
    public static JPanel Help_Panel = new JPanel();
    ////////////////////////////////////////////////////////////////////////
    public static Queue<String> Order_Of_Commands = new LinkedList<>(); //used to store all the commands that the user has put into it
    public static JFrame Input_Window = new JFrame(); //The secondary window that is reused several times
    public static JButton Remove = new JButton("Click this button to move onto the next command"); //pressing this will remove the top element from the queue to move to the next command
    ////////////////////////////////////////////////////////////////////////
    // generic variables that we call on to re-use at anytime
    //File location button to grab the location
    public static JButton Path_Button = new JButton("Click this to select your folder");
    //This is for when we ask the user to name something, will make a method to change the text later
    public static JButton Naming_Button1 = new JButton("Click this once you have entered a name 1");
    public static JButton Naming_Button2 = new JButton("Click this once you have entered a name 2");

    //Where the users inputs for the different text fields will go
    public static JTextArea Text_Area_Paramater1 = new JTextArea(1,20);
    public static JTextArea Text_Area_Paramater2 = new JTextArea(1,20);
    public static JTextArea Text_Area_Paramater3 = new JTextArea(1,20);

    //something to store the text results in
    public static String Paramater1 = new String();
    public static String Paramater2 = new String();
    public static String Paramater3 = new String();
    ////////////////////////////////////////////////////////////////////////
    //this section is where we will have the different panels
    //may think about making a method where it also 
    //creats a bunch of generic variabels depending on the queue size, but for now it is fine
    //File creation variables
    public static JPanel Folder_Panel = new JPanel();
    //adding methods to the file variable
    public static JPanel Method_Panel = new JPanel();
    //Adding content panel
    public static JPanel Content_Panel = new JPanel();
}
