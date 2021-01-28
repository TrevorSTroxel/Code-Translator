import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Translator_Window extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    public void New_Window()
    {
        TR_Variables.Translator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TR_Variables.Translator.setSize(500,500);
        TR_Variables.TR_Enter.addActionListener(this);
        TR_Variables.TR_Panel.add(TR_Variables.TR_Text_Area);
        TR_Variables.TR_Panel.add(TR_Variables.TR_Enter);
        TR_Variables.Translator.add(TR_Variables.TR_Panel);
        TR_Variables.Translator.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = TR_Variables.TR_Text_Area.getText();
        input.toLowerCase();

        if(e.getSource() == TR_Variables.TR_Enter)
        {
            String_To_Code.Translation(input);
        }

    }
    
}
