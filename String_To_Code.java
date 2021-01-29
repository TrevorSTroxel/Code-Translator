import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class String_To_Code implements ActionListener {
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();
    // public static String[] Spliting_Words = input.split(" ");

    public void Translation(String INPUT2) {
        PWM.Method_Runner(); // look at file for desription
        PWM.Panel_Name_Setter();
        if (INPUT2.contains("new file")) {
            /**
             * we need to make these functions wait and do one thing at a time, it first
             * needs to make a new file and then it looks to see if what else the user has
             * said
             */
            PWM.Input_Window("Folder Panel"); // look into something that can be grabed from the this JPanel that is
                                              // unique
            // //CR.create_file(TRV.Folder_Path_Text_Area.getText(),
            // TRV.File_Name_Text_Area.getText());
            // if (INPUT2.contains("say"))
            // {
            // System.out.println("help");
            // //PWM.Input_Window("File naming");
            // }
        }

        else if (INPUT2.contains("add to file")) {
            if (INPUT2.contains("say")) {
                // say();
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
