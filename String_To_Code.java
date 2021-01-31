public class String_To_Code {
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();
    // Threads might be the answer we are looking for in our program, if i cant get
    // them to work, you try getting them to work abed
    // possible solution, look into wait() and notify() to make the program wait,
    // and then it will be notified to continue later\

    // Another idea when working on this would be a break and contine command
    // this would be another thing to look into if the threading does not work

    //maybe we need to put this whole thing ionto a do while loop or something idk

    //the only other idea that I can currently think of is that each method would get its own window, but that seems highly inefficient
    
    //instead of ifs and else ifs, maybe have them be while loops? look more into this as i think this and threads are what we may possible need
    public synchronized void Translation(String INPUT2) 
    {
        PWM.Method_Runner(); // look at file for desription
        // work on makeing the program wait until it first completes creating a new
        // file, then make it do all other commands
        // Most important thing though IS MAKING THE PROGRAM WAIT, ELSE IT WILL RUN
        // THROUGH ALL OTHER COMMANDS AND NOT WORK CORRETLY
        while (INPUT2.contains("new file") && TRV.a == 0) // right now the program looks into this only and then ends the
                                                       // program, so adding an extra paramater is needed
        {
            /**
             * we need to make these functions wait and do one thing at a time, it first
             * needs to make a new file and then it looks to see if what else the user has
             * said
             */
            PWM.Input_Window("Folder Panel"); // we wil stick with name to make sure that it is consistant
            TRV.a = 1;
            // after the a is set to 1, then have the program wait. and then in the
            // Panel_Window_Methods file, in the actionPreformed methods, have the program
            // start again to run to the next statement it detects
            // working to see if this will work or not
            // break;
        }
        // testing out a theory i had, normally commented out
        while (INPUT2.contains("say")) 
        {
            System.out.println("help");
            PWM.Input_Window("File naming");
        }

        while (INPUT2.contains("add to file")) 
        {
            if (INPUT2.contains("say")) 
            {
                // say();
            }
        }
    }
}
