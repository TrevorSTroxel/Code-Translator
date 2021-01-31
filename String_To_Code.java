public class String_To_Code { // remove later if it causes to many problems
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();
    // Threads might be the answer we are looking for in our program, if i cant get
    // them to work, you try getting them to work abed
    // possible solution, look into wait() and notify() to make the program wait,
    // and then it will be notified to continue later

    public synchronized void Translation(String INPUT2) {

        // look into a do while (int i < INPUT2.lengh()) or something like that


        do // reason we do this so that it loops through everything, make sure to add a
           // extra condition so that the same method in not chosen again
        {
            // work on makeing the program wait until it first completes creating a new
            // file, then make it do all other commands
            // Most important thing though IS MAKING THE PROGRAM WAIT, ELSE IT WILL RUN
            // THROUGH ALL OTHER COMMANDS AND NOT WORK CORRETLY
            if (INPUT2.contains("new file") && TRV.a == 0) // right now the program looks into this only and then ends the
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
                TRV.a = 1;
                // after the a is set to 1, then have the program wait. and then in the
                // Panel_Window_Methods file, in the actionPreformed methods, have the program
                // start again to run to the next statement it detects
                //working to see if this will work or not
                break;
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
            TRV.i++;
            break;
        }while(TRV.i < INPUT2.length()); //not correct, looping to many times. look into better way of shortening the loop so it only loops for the amount of keywords the user put in
     //possibly look into having manipulations with the while loop to only run when a certain variable is set to something, but this is more of a spitball idea   
    }
}
