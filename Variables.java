/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 2.0
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
    public static JButton test = new JButton("testing help file");
    public static JTextArea Instructions = new JTextArea(20, 20);
    public static JPanel Help_Panel = new JPanel();
    ////////////////////////////////////////////////////////////////////////
    public static Queue<String> Order_Of_Commands = new LinkedList<>(); //used to store all the commands that the user has put into it
    ////////////////////////////////////////////////////////////////////////
    // generic variables that we call on to re-use at anytime
    public static String Paramater1 = new String();
    public static String Paramater2 = new String();
    public static String Paramater3 = new String();
    ////////////////////////////////////////////////////////////////////////
    public static JFrame Input_Window = new JFrame(); //The secondary window that is reused several times
    public static JButton Remove = new JButton("Click this button to move onto the next command"); //pressing this will remove the top element from the queue to move to the next command
    ////////////////////////////////////////////////////////////////////////
    //File creation variables
    public static JPanel Folder_Panel = new JPanel();

    public static JButton Folder_Path_Button = new JButton("Click to select the folder where you want to create a file");
    public static JTextArea Folder_Path_Text_Area = new JTextArea(1, 20);

    public static JButton File_Name_Button = new JButton("Click this button once you have typed what you want to name the file");
    public static JTextArea File_Name_Text_Area = new JTextArea(1, 20);
    ////////////////////////////////////////////////////////////////////////
    //adding methods to the file variable
    public static JPanel Method_Panel = new JPanel();

    public static JButton File_Button = new JButton("Click to select the folder where you want to create a file");
    public static JTextArea File_Text_Area = new JTextArea(1, 20);

    public static JButton Return_Type_Button = new JButton("Enter the return type of your method");
    public static JTextArea Return_Type_Text_Area = new JTextArea(1, 20);

    public static JButton Method_Name_Button = new JButton("Enter what you want to name your method");
    public static JTextArea Method_Name_Text_Area = new JTextArea(1, 20);

    ////////////////////////////////////////////////////////////////////////
    //Adding content variables
    public static JPanel Content_Panel = new JPanel();

    //what file to add it to
    public static JButton File_Path_Button = new JButton("Click to select the file you want to add content to");
    public static JTextArea File_Path_Text_Area = new JTextArea(1, 20);

    public static JButton Getting_Method_Name_Button = new JButton("What is the name of the method you  want to add to?");
    public static JTextArea Getting_Method_Name_Text_Area = new JTextArea(1, 20);
    
    public static JButton File_Add_Content_Button = new JButton("Click this button once you have typed what you want the program to say");
    public static JTextArea File_Add_Content_Text_Area = new JTextArea(1, 20);
    ////////////////////////////////////////////////////////////////////////
    // testing variables
    public static JPanel File_Naming_test_EX = new JPanel();
}
