
public class English_Translator 
{
    // public static String[] Spliting_Words = input.split(" ");


    public static void Translation(String INPUT2)
    {

        if (INPUT2.contains("new file"))
        {
            //call file creatation method
            //triggers a new window window to ask for the file directory, anf file name

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
