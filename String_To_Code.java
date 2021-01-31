public class String_To_Code {
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();
    // possible solution, look into wait() and notify() to make the program wait,
    // and then it will be notified to continue later

    public void Translation(String INPUT2) throws InterruptedException {
        // look into a do while (int i < INPUT2.lengh()) or something like that
        PWM.Method_Runner(); // look at file for desription
        int i = 0; // variable stays here for simplicity sake,
        int a = 0;
        do // reason we do this so that it loops through everything, make sure to add a
           // extra condition so that the same method in not chosen again
        {
            // work on makeing the program wait until it first completes creating a new
            // file, then make it do all other commands
            // Most important thing though IS MAKING THE PROGRAM WAIT, ELSE IT WILL RUN
            // THROUGH ALL OTHER COMMANDS AND NOT WORK CORRETLY
            if (INPUT2.contains("new file") && a == 0) // right now the program looks into this only and then ends the
                                                       // program, so adding an extra paramater is needed
            {
                /**
                 * we need to make these functions wait and do one thing at a time, it first
                 * needs to make a new file and then it looks to see if what else the user has
                 * said
                 */
                PWM.Input_Window("Folder Panel"); // look into something that can be grabed from the this JPanel that is
                                                  // unique
                // //CR.create_file(TRV.Folder_Path_Text_Area.getText(),
                // TRV.File_Name_Text_Area.getText());
                a = 1;
                //I am currently testing this, working on seeing if i can make the program wait and then when a button is pressed it will continue
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //testing out a theory i had, normally commented out
            else if (INPUT2.contains("say"))
            {
            System.out.println("help");
            PWM.Input_Window("File naming");
            }


            else if (INPUT2.contains("add to file")) 
            {
                if (INPUT2.contains("say")) 
                {
                    // say();
                }
            }
            i++;
        }while(i < INPUT2.length()); //not correct, looping to many times. look into better way of shortening the loop so it only loops for the amount of keywords the user put in
        
    }
}
