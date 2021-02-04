public class String_To_Code 
{
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();
    //we are no looking into queues to see if that can work
    public void Translation(String INPUT2)
    {
        PWM.Method_Runner(); // look at file for desription
        if (TR_Variables.Order_Of_Commands.peek().equals("new file"))
        {
            PWM.Input_Window("Folder Panel");
        }
        else if (TR_Variables.Order_Of_Commands.peek().equals("say"))
        {
            // PWM.Input_Window("Folder Panel");
        }
    } //so the menu only works after the method is finished. look into ways to work around this
}
