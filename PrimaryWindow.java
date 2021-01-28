import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 * This is what creates the first window that appears when running the program
 * and handles the inputs of the second window settings
 * 
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */

public class PrimaryWindow extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L; // this is needed to keep VSCode happy
    /**
     * Object creations so that if a button press is called that is not enter, it
     * will transfer over the input into a different file so it can handle that.
     */
    SecondaryWindows NewWindows = new SecondaryWindows();

    /**
     * This method is generic and mostly used to call the other methods to have the
     * window settings set up correctly
     */
    public void WindowCreation() {
        WindowVar.MainWindow.setSize(500, 500); // sets size of the first window
        addContents(); // calls a methods to set up settings
    }

    /**
     * This will add most of the content to the main window function Any settings
     * that we want to change to the main window will be in here We call it its own
     * methods so that we can edit it with ease
     */
    private void addContents() {
        WindowVar.MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes it so you can close the program

        // JTextFeild settings
        Text_Field_Input.Text_Box_Settings(WindowVar.P1_Text_Field);

        /**
         * ActionListener enabler This part makes it so the buttons will react once you
         * have clicked on them
         */
        WindowVar.P1_Enter.addActionListener(this);
        WindowVar.P1_Tutorial.addActionListener(this);
        WindowVar.test.addActionListener(this);

        /**
         * JPanel additions This sets up what will be added to the panel at the start
         * This is also where if wanted to edit the panel in anyway, we would come here
         * to check
         */
        WindowVar.Panel1.add(WindowVar.P1_Text_Field);
        WindowVar.Panel1.add(WindowVar.P1_Enter);
        WindowVar.Panel1.add(WindowVar.P1_Tutorial);
        WindowVar.Panel1.add(WindowVar.test);
        WindowVar.Panel1.setSize(100, 100);
        WindowVar.Panel1.setLayout(new GridLayout(4, 1));
        WindowVar.Panel1.setEnabled(true);

        // Adds the panel to the window and allows it to be see to users
        WindowVar.MainWindow.add(WindowVar.Panel1);
        WindowVar.MainWindow.setVisible(true);
    }

    /**
     * @param e this will look at the first word that the user has writen and the
     *          program will call the correct methods as needed The reason why we
     *          look at the second word and not the first is actually for a better
     *          user experience reasons. We want the user to feel like when they
     *          type "create file" they are actually creating a file
     * 
     *          If we had more time a feature we would like to add is better
     *          translator useage. right now we have the user put in key words for a
     *          program to use, rather than imputing a sentence and haveing the
     *          program translate that If this project is worked on, the next thing
     *          that would be added would be berrter translators
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String INPUT = WindowVar.P1_Text_Field.getText(); // this reads the input the users said
        INPUT.toLowerCase(); // we do this for easier argument sake
        WindowVar.WordChoice = INPUT.split(" "); // will help decide where the program needs to go
        if (e.getSource() == WindowVar.test) {
            English_Translator.Translation();
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("file")) {
            // what this does is that it clears the second window of any panels if they are
            // enabled, so that you can say to create multiple different things
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel2(); // calls the method for panel settings
            /**
             * Each panel has buttons that it adds when called We were unable to activate
             * their ActionListoner inside the methods in the other file, and the only way
             * was to do it here. In the future we would like to find an alternative way of
             * doing this so that it looks cleaner
             */
            WindowVar.P2_File_Path_Button.addActionListener(this);
            WindowVar.P2_File_Name_Button.addActionListener(this);
            WindowVar.P2_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate(); // this is for when we remove all the contents of the
                                                                   // wondow, it makes sure that it is still reuseable
            WindowVar.Creation_Window.getContentPane().repaint(); // this is that the window is refreshed and it has the
                                                                  // new content in it
            WindowVar.Panel2.setVisible(true); // this is used for making sure that the user can see the panel
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("class")) {
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel3();
            WindowVar.P3_File_Path_Button.addActionListener(this);
            WindowVar.P3_Class_Name_Button.addActionListener(this);
            WindowVar.P3_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel3.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("method")) {
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel4();
            WindowVar.P4_File_Path_Button.addActionListener(this);
            WindowVar.P4_Return_Type_Button.addActionListener(this);
            WindowVar.P4_Method_Name_Button.addActionListener(this);
            WindowVar.P4_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel4.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("content")) {
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel5();
            WindowVar.P5_File_Path_Button.addActionListener(this);
            WindowVar.P5_Method_Name_Button.addActionListener(this);
            WindowVar.P5_Add_Contents_Button.addActionListener(this);
            WindowVar.P5_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel5.setVisible(true);
        } else if (e.getSource() == WindowVar.test) {
            Text_Field_Input.addPanel6();
            WindowVar.P6_Classname.addActionListener(this);
            WindowVar.P6_Filename.addActionListener(this);
            WindowVar.P6_NewFile.addActionListener(this);
            WindowVar.P6_dir.addActionListener(this);
            WindowVar.run.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel6.setVisible(true);
        } else { // this is used for if any other button is pushed, it carries that input into a
                 // different file to be handled
            NewWindows.actionPerformed(e);
        }

    }

}
