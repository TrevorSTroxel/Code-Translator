import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * This file is where we will hold new variables we will need to deal with. The
 * reason why we moved them here is that our other files were becoming to
 * bloated and confusing. With this our coding shall look much nicer and much
 * better to manage as we can now change any variable configuration here
 * 
 * Our naming conventions goes like this: 
 * First part : what panel it belongs to
 * end part : what tpye of variable is it
 *
 * How we organize our variable is by: JPanel, JLabel, JTextArea, JButtons
 *
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */
public class WindowVar {
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // These varables are special, they get their own space
    // I wanted to almost all variables inside here for better organization
    // Variables from: PrimaryWindow.java
    /**
     * the first window/frame that appears when running the program
     */
    public static JFrame MainWindow = new JFrame("Jave Program Creation");// main window
    /**
     * the first panel in the main window
     */
    public static JPanel Panel1 = new JPanel(); // Starting panel for people to see
    /**
     * The text input area in the first panel
     */
    public static JTextArea P1_Text_Field = new JTextArea(); // Users first choice into what to do
    /**
     * The Enter button in the first panel
     */
    public static JButton P1_Enter = new JButton("Enter"); // for confermation and selection process
    /**
     * The button in the first panel which triggers a second window with instructions on how to use the program
     */
    public static JButton P1_Tutorial = new JButton("Help"); // tutorial button
    /**
     * utiltiy string to extract certain words from a string
     */
    public static String[] WordChoice; // generic string array
    /**
     * Window that features instructions to use this program
     */
    public static JFrame Help_Window = new JFrame("Tutorial");
    /**
     * the panel container which includes the text instrucions
     */
    public static JPanel Help_Panel = new JPanel();
    /**
     * The place where the text is displayed
     */
    public static JTextArea Instructions = new JTextArea(20, 20);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // Variables from: SecondayWindow.java
    /**
     * This is the window displayed when a creat command is entered
     */
    public static JFrame Creation_Window = new JFrame("Program execution");
    /**
     * utiltiy string to extract certain words from a string
     */
    public static String[] Word_Split;
    /**
     * generic label that is used to change the text on labels when clicked
     */
    public static JLabel l = new JLabel();
    /**
     * String to store the file name
     */
    public static String P2_FILE_NAME = new String();
    /**
     * String to store the file directory/path
     */
    public static String P2_FILE_PATH = new String();
    /**
     * String to store the class name
     */
    public static String P3_CLASS_NAME = new String();
    /**
     * String to store the class directory/path
     */
    public static String P3_FILE_PATH = new String();
    /**
     * String to store the method directory
     */
    public static String P4_File_Path = new String();
    /**
     * String to store the method return type
     */
    public static String P4_Return_Type = new String();
    /**
     * String to store the method name
     */
    public static String P4_Method_Name = new String();
    /**
     * String to store the file directory/path
     */
    public static String P5_File_Path = new String();
    /**
     *  String to store the method name
     */
    public static String P5_Method_Name = new String();
    /**
     * String to store the content which needs to be added
     */
    public static String P5_Add_Contents = new String();
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // Everything below this line should be orginally created in this file
    /**
     * panel container 
     */
    public static JPanel Panel2 = new JPanel(); // this panel is being used for creating files in folders
    /**
     * text label to store and showcase the text for file path
     */
    public static JLabel P2_File_Path_Label = new JLabel("<html>Click Button to <br/>select your directory.</html>");
    /**
     * text label to store and showcase the text for the button
     */
    public static JLabel P2_File_Name_Label = new JLabel("Enter what you want to name your file: ");
    /**
     * Text area to showcase the choosen directory
     */
    public static JTextArea P2_File_Path_Text_Field = new JTextArea();
    /**
     * Text area input to take in the name for the file
     */
    public static JTextArea P2_File_Name_Text_Field = new JTextArea();
    /**
     * button to invoke the file explorer inorder to select the needed directory 
     */
    public static JButton P2_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    /**
     * button to call the function which will set the inputted file name
     */
    public static JButton P2_File_Name_Button = new JButton("Enter File Name");
    /**
     * button to call the create file fuction which as the name suggests will create a file in the enterd directory
     */
    public static JButton P2_Call_Method_Button = new JButton("Create file in location");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * panel container 
     */
    public static JPanel Panel3 = new JPanel(); // this panel will be used to create methods inside the desired file
    /**
     * label to store text for button
     */
    public static JLabel P3_File_Path_Label = new JLabel( "<html>Click Button to <br/>select your directory and file.</html>");
    /**
     * label to store text for class name
     */
    public static JLabel P3_Class_Name_Label = new JLabel("Enter what you want to name your class: ");
    /**
     * text input area for file path
     */
    public static JTextArea P3_File_Path_Text_Field = new JTextArea();
    /**
     * text input area for class name
     */
    public static JTextArea P3_Class_Name_Text_Field = new JTextArea();
    /**
     * button to enter the file path
     */
    public static JButton P3_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    /**
     * button to enter the class name
     */
    public static JButton P3_Class_Name_Button = new JButton("Enter Name of class");
    /**
     * button to call the create method function
     */
    public static JButton P3_Call_Method_Button = new JButton("Create class");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * panel container
     */
    public static JPanel Panel4 = new JPanel(); // this will be used to create methods in files
    /**
     * label to store the text for button
     */
    public static JLabel P4_File_Path_Label = new JLabel("<html>Click Button to <br/>select your directory and file.</html>");
    /**
     * label to store text to prompt the user to enter the return type of the method
     */
    public static JLabel P4_Return_Type_Label = new JLabel("Enter what data type the method should return: ");
    /**
     * label to store text to prompt the user to enter the method name
     */
    public static JLabel P4_Method_Name_Label = new JLabel("Enter the name of your method: ");
    /**
     * text input area for file path
     */
    public static JTextArea P4_File_Path_Text_Field = new JTextArea();
    /**
     * text input area for method return type
     */
    public static JTextArea P4_Return_Type_Text_Field = new JTextArea();
    /**
     * text input area for method name
     */
    public static JTextArea P4_Method_Name_Text_Field = new JTextArea();
    /**
     * button to enter file path
     */
    public static JButton P4_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    /**
     * button to enter the method return type
     */
    public static JButton P4_Return_Type_Button = new JButton("Enter Return Type.");
    /**
     * button to enter method name
     */
    public static JButton P4_Method_Name_Button = new JButton("Enter Method Name.");
    /**
     * button to call the method create function
     */
    public static JButton P4_Call_Method_Button = new JButton("Create Method.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * panel container
     */
    public static JPanel Panel5 = new JPanel(); // this will be used to add content to panels
    /**
     * lable to store text for button
     */
    public static JLabel P5_File_Path_Label = new JLabel("<html>Click Button to <br/>select your directory and file.</html>");
    /**
     * label to store the text promptin the user to enter a name for their method
     */
    public static JLabel P5_Method_Name_Label = new JLabel("Enter the name of your method: ");
    /**
     * label to store the text promptin the user to enter the contents they want to add to the method
     */
    public static JLabel P5_Contents_To_Add_Label = new JLabel("Enter what you want to add to the method: ");
    /**
     * text input area to take in the file directory
     */
    public static JTextArea P5_File_Path_Text_Field = new JTextArea();
    /**
     * text input area to take in the method name
     */
    public static JTextArea P5_Method_Name_Text_Field = new JTextArea();
    /**
     * text input area tp take in the contents needed to be added 
     */
    public static JTextArea P5_Contents_To_Add_Text_Field = new JTextArea();
    /**
     * button to enter the directory
     */
    public static JButton P5_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    /**
     * button to enter the method name
     */
    public static JButton P5_Method_Name_Button = new JButton("Enter Method Name.");
    /**
     * button to add content
     */
    public static JButton P5_Add_Contents_Button = new JButton("Enter Contents.");
    /**
     * button to call the method
     */
    public static JButton P5_Call_Method_Button = new JButton("Add Contents To Methods.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // We kept our naming convention simple to help avoid confusion on what they do
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * text area to display error messages
     */
    public static JTextArea errorTextArea = new JTextArea(20, 20); // this will display an error message
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    //testing new fucntion
    public static JPanel Panel6 = new JPanel();
    public static JButton test = new JButton("Try new function");

    public static JButton P6_dir = new JButton("dir");
    public static JTextArea P6_dir_text = new JTextArea();

    public static JButton P6_Filename = new JButton("name");
    public static JTextArea P6_Filename_text = new JTextArea();

    public static JButton P6_NewFile = new JButton("New dir");
    public static JTextArea P6_NewFile_text = new JTextArea();

    public static JButton P6_Classname = new JButton("class name");
    public static JTextArea P6_Classname_text = new JTextArea();

    public static String input1 = new String();
    public static String input2 = new String();
    public static String input3 = new String();
    public static String input4 = new String();

    public static JButton run = new JButton("run method");
}
