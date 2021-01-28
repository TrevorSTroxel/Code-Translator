import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.*;

//https://www.genuinecoder.com/directory-folder-indexing-program-using-java-source-code-html/

/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */

public class Text_Field_Input {

    /**
     * display error messages in case of typos
     * WIP, does not currently work
     * @param JP
     */
    public static void ERROR(JPanel JP) {
        WindowVar.errorTextArea.setEditable(false);
        WindowVar.errorTextArea.setText("You mistyped something in the text area, try again.");
        WindowVar.errorTextArea.setVisible(true);
        WindowVar.Panel2.add(WindowVar.errorTextArea);
    }

    /**
     * change the settings of a JTextArea variable for formating purposes
     * 
     * @param JTF
     */
    public static void Text_Box_Settings(JTextArea JTF) {
        JTF.setVisible(true);
        JTF.setEditable(true);
        JTF.setLineWrap(true);
        JTF.setFont(new Font("Times New Roman", Font.BOLD, 18));
    }


    /**
     * creats a new file in the desired location
     * Handles Panel2 settings
     */
    public static void addPanel2() {
        WindowVar.Panel2.setLayout(new GridLayout(3, 3));

        WindowVar.Panel2.add(WindowVar.P2_File_Path_Button);
        WindowVar.Panel2.add(WindowVar.P2_File_Path_Label);
        WindowVar.Panel2.add(WindowVar.P2_File_Path_Text_Field);

        WindowVar.Panel2.add(WindowVar.P2_File_Name_Button);
        WindowVar.Panel2.add(WindowVar.P2_File_Name_Label);
        WindowVar.Panel2.add(WindowVar.P2_File_Name_Text_Field);

        WindowVar.Panel2.add(WindowVar.P2_Call_Method_Button);

        Text_Box_Settings(WindowVar.P2_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P2_File_Name_Text_Field);

        WindowVar.Panel2.setVisible(true);

        SecondaryWindows.SecondSetUp();
        WindowVar.Creation_Window.add(WindowVar.Panel2);
    }


    /**
     * adds method to selected file
     * Handles Panel3 settings
     */
    public static void addPanel3() {
        WindowVar.Panel3.setLayout(new GridLayout(3, 3));

        WindowVar.Panel3.add(WindowVar.P3_File_Path_Button);
        WindowVar.Panel3.add(WindowVar.P3_File_Path_Label);
        WindowVar.Panel3.add(WindowVar.P3_File_Path_Text_Field);

        WindowVar.Panel3.add(WindowVar.P3_Class_Name_Button);
        WindowVar.Panel3.add(WindowVar.P3_Class_Name_Label);
        WindowVar.Panel3.add(WindowVar.P3_Class_Name_Text_Field);

        WindowVar.Panel3.add(WindowVar.P3_Call_Method_Button);

        Text_Box_Settings(WindowVar.P3_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P3_Class_Name_Text_Field);

        WindowVar.Panel3.setVisible(true);

        SecondaryWindows.SecondSetUp();
        WindowVar.Creation_Window.add(WindowVar.Panel3);
    }


    /**
     * Allows the user to make a class inside the file they made
     * Handles Panel4 settigns
     */
    public static void addPanel4() {
        WindowVar.Panel4.setLayout(new GridLayout(4, 3));

        WindowVar.Panel4.add(WindowVar.P4_File_Path_Button);
        WindowVar.Panel4.add(WindowVar.P4_File_Path_Label);
        WindowVar.Panel4.add(WindowVar.P4_File_Path_Text_Field);

        WindowVar.Panel4.add(WindowVar.P4_Return_Type_Button);
        WindowVar.Panel4.add(WindowVar.P4_Return_Type_Label);
        WindowVar.Panel4.add(WindowVar.P4_Return_Type_Text_Field);

        WindowVar.Panel4.add(WindowVar.P4_Method_Name_Button);
        WindowVar.Panel4.add(WindowVar.P4_Method_Name_Label);
        WindowVar.Panel4.add(WindowVar.P4_Method_Name_Text_Field);

        WindowVar.Panel4.add(WindowVar.P4_Call_Method_Button);

        Text_Box_Settings(WindowVar.P4_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P4_Method_Name_Text_Field);
        Text_Box_Settings(WindowVar.P4_Return_Type_Text_Field);

        WindowVar.Panel4.setVisible(true);

        SecondaryWindows.SecondSetUp();
        WindowVar.Creation_Window.add(WindowVar.Panel4);
    }


    /**
     * allows the user to add contents to methods they have created
     * Handles Panel5 settings
     */
    public static void addPanel5() {
        WindowVar.Panel5.setLayout(new GridLayout(4, 3));
        WindowVar.Panel5.add(WindowVar.P5_File_Path_Button);
        WindowVar.Panel5.add(WindowVar.P5_File_Path_Label);
        WindowVar.Panel5.add(WindowVar.P5_File_Path_Text_Field);

        WindowVar.Panel5.add(WindowVar.P5_Method_Name_Button);
        WindowVar.Panel5.add(WindowVar.P5_Method_Name_Label);
        WindowVar.Panel5.add(WindowVar.P5_Method_Name_Text_Field);

        WindowVar.Panel5.add(WindowVar.P5_Add_Contents_Button);
        WindowVar.Panel5.add(WindowVar.P5_Contents_To_Add_Label);
        WindowVar.Panel5.add(WindowVar.P5_Contents_To_Add_Text_Field);

        WindowVar.Panel5.add(WindowVar.P5_Call_Method_Button);

        Text_Box_Settings(WindowVar.P5_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P5_Method_Name_Text_Field);
        Text_Box_Settings(WindowVar.P5_Contents_To_Add_Text_Field);

        WindowVar.Panel5.setVisible(true);

        SecondaryWindows.SecondSetUp();
        WindowVar.Creation_Window.add(WindowVar.Panel5);
    }

    public static void addPanel6()
    {
        WindowVar.Panel6.setLayout(new GridLayout(5,2));

        WindowVar.Panel6.add(WindowVar.P6_dir);
        WindowVar.Panel6.add(WindowVar.P6_dir_text);
        WindowVar.Panel6.add(WindowVar.P6_Filename);
        WindowVar.Panel6.add(WindowVar.P6_Filename_text);
        WindowVar.Panel6.add(WindowVar.P6_NewFile);
        WindowVar.Panel6.add(WindowVar.P6_NewFile_text);
        WindowVar.Panel6.add(WindowVar.P6_Classname);
        WindowVar.Panel6.add(WindowVar.P6_Classname_text);
        WindowVar.Panel6.add(WindowVar.run);
        
        WindowVar.Panel6.setVisible(true);

        SecondaryWindows.SecondSetUp();
        WindowVar.Creation_Window.add(WindowVar.Panel6);
    }

}
