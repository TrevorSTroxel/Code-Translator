
public class String_To_Code 
{
    // public static String[] Spliting_Words = input.split(" ");

    public static void Translation(String INPUT2)
    {
        Create.File_Creation_Panel();
        if (INPUT2.contains("new file"))
        {
            //call method for new window to appear and grab input
            Create.Input_Window(TR_Variables.Folder_Panel);
            //call file creatation method
            //Create.create_file();
            //triggers a new window window to ask for the file directory, any file name

            if (INPUT2.contains("say"))
            {
               //say();
            }
        }

        else if (INPUT2.contains("add to file"))
        {
            if (INPUT2.contains("say"))
            {
                //say();
            }
        }
    }
    

    // public static String say()
    // {
    //     int index = input.indexOf("say");
    //     String string_contents = new String();
    //     for (int i = index + 1; i < input.length(); i++)
    //     {
    //         if(!Spliting_Words[i].equals("new"))
    //         {
    //             string_contents += Spliting_Words[i] + " ";
    //         }
    //     }
    //     return string_contents;
    // }
}
