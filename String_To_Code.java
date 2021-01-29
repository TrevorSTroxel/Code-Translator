
public class String_To_Code {
    TR_Variables TRV = new TR_Variables();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    // public static String[] Spliting_Words = input.split(" ");
    

    public void Translation(String INPUT2) 
    {
        PWM.Method_Runner(); //look at file for desription
        if (INPUT2.contains("new file")) 
        {
            /**
             * we need to make these functions wait and do one thing at a time, 
             * it first needs to make a new file and then it looks to see if 
             * what else the user has said
            */
            PWM.Input_Window(TRV.Folder_Panel);
            if (INPUT2.contains("say")) {
                // say();
            }
        }

        else if (INPUT2.contains("add to file")) 
        {
            if (INPUT2.contains("say")) {
                // say();
            }
        }
    }

    // public static String say()
    // {
    // int index = input.indexOf("say");
    // String string_contents = new String();
    // for (int i = index + 1; i < input.length(); i++)
    // {
    // if(!Spliting_Words[i].equals("new"))
    // {
    // string_contents += Spliting_Words[i] + " ";
    // }
    // }
    // return string_contents;
    // }
}
