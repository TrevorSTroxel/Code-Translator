import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//We store all our variables in here for better organization
//We also made them all static so that we can grab them at any point
//look more into why static makes things work for our program
public class Variables {
    // These variables are for creating the starting window
    public static JFrame Translator = new JFrame("Translator");
    public static JPanel TR_Panel = new JPanel();
    public static JTextArea TR_Text_Area = new JTextArea(1, 20);
    public static JButton TR_Enter = new JButton("Enter");
    public static JButton test = new JButton("test");
    public static String User_Input = new String();
    ////////////////////////////////////////////////////////////////////////
    public static Queue<String> Order_Of_Commands = new LinkedList<>(); //used to store all the commands that the user has put into it
    ////////////////////////////////////////////////////////////////////////
    // generic variables that we call on to re-use at anytime
    public static String Paramater1 = new String();
    public static String Paramater2 = new String();
    ////////////////////////////////////////////////////////////////////////
    public static JFrame Input_Window = new JFrame(); //The secondary window that is reused several times
    ////////////////////////////////////////////////////////////////////////
    //File creation variables
    public static JPanel Folder_Panel = new JPanel();

    public static JButton Folder_Path_Button = new JButton("Click to select the folder where you want to create a file");
    public static JTextArea Folder_Path_Text_Area = new JTextArea(1, 20);

    public static JButton File_Name_Button = new JButton("Click this button once you have typed what you want to name the file");
    public static JTextArea File_Name_Text_Area = new JTextArea(1, 20);
    ////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////
    // testing variables
    public static JPanel File_Naming_test_EX = new JPanel();
}
