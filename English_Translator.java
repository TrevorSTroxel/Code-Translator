
public class English_Translator 
{
    public static String input = WindowVar.P1_Text_Field.getText();
    public static String[] Spliting_Words = input.split(" ");
    
    public static void Translation()
    {
        if (input.contains("new file"))
        {
            //call file creatation method
            if (input.contains("say"))
            {
               say();
            }
        }

        else if (input.contains("add to file"))
        {
            if (input.contains("say"))
            {
                say();
            }
        }
    }
    

    public static String say()
    {
        int index = input.indexOf("say");
        String string_contents = new String();
        for (int i = index + 1; i < input.length(); i++)
        {
            if(!Spliting_Words[i].equals("new"))
            {
                string_contents += Spliting_Words[i] + " ";
            }
        }
        return string_contents;
    }
}
