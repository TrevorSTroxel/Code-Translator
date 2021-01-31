import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class String_To_Code implements ActionListener {
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();
    // Threads might be the answer we are looking for in our program, if i cant get
    // them to work, you try getting them to work abed
    // possible solution, look into wait() and notify() to make the program wait,
    // and then it will be notified to continue later\

    // Another idea when working on this would be a break and contine command
    // this would be another thing to look into if the threading does not work

    // maybe we need to put this whole thing ionto a do while loop or something idk

    // the only other idea that I can currently think of is that each method would
    // get its own window, but that seems highly inefficient

    // instead of ifs and else ifs, maybe have them be while loops? look more into
    // this as i think this and threads are what we may possible need
    public synchronized void Translation(String INPUT2) throws InterruptedException {
        Method_Runner(); // look at file for desription
        // work on makeing the program wait until it first completes creating a new
        // file, then make it do all other commands
        // Most important thing though IS MAKING THE PROGRAM WAIT, ELSE IT WILL RUN
        // THROUGH ALL OTHER COMMANDS AND NOT WORK CORRETLY
        if (INPUT2.contains("new file")) // right now the program looks into this only and then ends
                                         // the
                                         // program, so adding an extra paramater is needed
        {
            /**
             * we need to make these functions wait and do one thing at a time, it first
             * needs to make a new file and then it looks to see if what else the user has
             * said
             */
            Input_Window("Folder Panel"); // we wil stick with name to make sure that it is consistant
            TRV.a = 1;
            // after the a is set to 1, then have the program wait. and then in the
            // Panel_Window_Methods file, in the actionPreformed methods, have the program
            // start again to run to the next statement it detects
            // working to see if this will work or not
            // break;
            // THIS ALMOST WORKS. WE JUST HAVE TO GET THE MENU FULLY LOADED AND THEN I THINK
            // WE WILL BE ON THE RIGHT TRACK
            // wait();

            // // testing out a theory i had, normally commented out
            // while (INPUT2.contains("say"))
            // {

            // System.out.println("help");
            // PWM.Input_Window("File naming");
            // }
        }

        // while (INPUT2.contains("add to file"))
        // {
        // if (INPUT2.contains("say"))
        // {
        // // say();
        // }
        // }
    } // so the menu only works after the method is finished. look into ways to work
      // around this

    // testing out idea
    public void Input_Window(String JP) // we have to grab the name of the panel input to set it correctly
    {
        TRV.Input_Window.getContentPane().removeAll();// This is to make sure that the wondow is reuseable every time
        TRV.Input_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TRV.Input_Window.setSize(500, 500);

        // We will have to do a few different loops once we add more panels
        // this is the only way to get different panels added to the frame
        // look into switch statements later
        if (JP == TRV.Folder_Panel.getName()) {
            TRV.Input_Window.add(TRV.Folder_Panel); // find out why JP does not work //turns out you need to manually
                                                    // set the manels
        } else if (JP == "File naming") {
            TRV.Input_Window.add(TRV.File_Naming_test_EX);
        }

        // these are at the end because these need to happen last
        TRV.Input_Window.setVisible(true);
        TRV.Input_Window.getContentPane().validate();
        TRV.Input_Window.repaint();
    }

    public void Method_Runner() {
        // will add more methods to run later, for now its only one
        File_Creation_Panel();
        Panel_Name_Setter();
    }

    // JP is considerend its own, seperate JPanel and not the input the method call

    public void File_Creation_Panel() {
        TRV.Folder_Panel.setLayout(new GridLayout(2, 2));

        TRV.File_Name_Button.addActionListener(this);
        TRV.Folder_Path_Button.addActionListener(this);

        TRV.Folder_Panel.add(TRV.Folder_Path_Button);
        TRV.Folder_Panel.add(TRV.Folder_Path_Text_Area);

        TRV.Folder_Panel.add(TRV.File_Name_Button);
        TRV.Folder_Panel.add(TRV.File_Name_Text_Area);
    }

    // This function will set names for panels and store the names in an array to be
    // used later
    public void Panel_Name_Setter() {
        TRV.Folder_Panel.setName("Folder Panel");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }
}
