import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TR_Variables 
{
    //These variables are for creating the starting window
    public JFrame Translator = new JFrame("Translator");
    public JPanel TR_Panel = new JPanel();
    public JTextArea TR_Text_Area = new JTextArea(1,20);
    public JButton TR_Enter = new JButton("Enter");
    ////////////////////////////////////////////////////////////////////////
    //generic variables
    ////////////////////////////////////////////////////////////////////////
    public JFrame Input_Window = new JFrame();
    ////////////////////////////////////////////////////////////////////////
    public JPanel Folder_Panel = new JPanel();

    public JButton Folder_Path_Button = new JButton("Path button");
    public JTextArea Folder_Path_Text_Area = new JTextArea(1,20);
    
    public JButton File_Name_Button = new JButton("name button");
    public JTextArea File_Name_Text_Area = new JTextArea(1,20);
    ////////////////////////////////////////////////////////////////////////
    //testing variables 

}
