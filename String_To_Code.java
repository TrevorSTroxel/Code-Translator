
public class String_To_Code {
    TR_Variables TRV = new TR_Variables();
    Create CR = new Create();
    // public static String[] Spliting_Words = input.split(" ");
    

    public void Translation(String INPUT2) 
    {
        // call panel settings to set them up correctly
        if (INPUT2.contains("new file")) {
            // call method for new window to appear and grab input
            // CR.Input_Window(TRV.Folder_Panel);
            // call file creatation method
            // Create.create_file();
            // triggers a new window window to ask for the file directory, any file name

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
