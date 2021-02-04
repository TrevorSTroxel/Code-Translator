public class String_To_Code 
{
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();
    //we are no looking into queues to see if that can work
    public synchronized void Translation(String INPUT2) throws InterruptedException 
    {
        PWM.Method_Runner(); // look at file for desription
        
        if (INPUT2.contains("new file")) // right now the program looks into this only and then ends
                                                          // the
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
            //THIS ALMOST WORKS. WE JUST HAVE TO GET THE MENU FULLY LOADED AND THEN I THINK WE WILL BE ON THE RIGHT TRACK
            //wait();
            // // testing out a theory i had, normally commented out
            // while (INPUT2.contains("say")) 
            // {

            //     System.out.println("help");
            //     PWM.Input_Window("File naming");
            // }
        }
        // while (INPUT2.contains("add to file")) 
        // {
        //     if (INPUT2.contains("say")) 
        //     {
        //         // say();
        //     }
        // }
    } //so the menu only works after the method is finished. look into ways to work around this

}
