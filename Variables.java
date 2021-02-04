import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Variables {
    // These variables are for creating the starting window
    public static JFrame Translator = new JFrame("Translator");
    public static JPanel TR_Panel = new JPanel();
    public static JTextArea TR_Text_Area = new JTextArea(1, 20);
    public static JButton TR_Enter = new JButton("Enter");
    public static JButton test = new JButton("test");
    ////////////////////////////////////////////////////////////////////////
    // generic variables
    public static ArrayList<String> Panel_Name_Storage = new ArrayList<String>(); // stores the names of the panels to be
                                                                           // grabbed for later use
    public static String Paramater1 = new String();
    public static String Paramater2 = new String();
    public static JLabel l = new JLabel();
    public static Queue<String> Order_Of_Commands = new LinkedList<>(); //look more into why static makes things work for our program
    public static String INPUT2 = new String();

    ////////////////////////////////////////////////////////////////////////
    public static JFrame Input_Window = new JFrame();
    ////////////////////////////////////////////////////////////////////////
    public static JPanel Folder_Panel = new JPanel();

    public static JButton Folder_Path_Button = new JButton("Path button");
    public static JTextArea Folder_Path_Text_Area = new JTextArea(1, 20);

    public static JButton File_Name_Button = new JButton("name button");
    public static JTextArea File_Name_Text_Area = new JTextArea(1, 20);
    ////////////////////////////////////////////////////////////////////////
    public static JPanel File_Naming_test_EX = new JPanel();
    ////////////////////////////////////////////////////////////////////////
    // testing variables
    int i = 0; // variable stays here for simplicity sake,
    int a = 0; // for testing loops arguments, and it works so far, but need to make the
               // program waits first before this can be fully implimented
}
