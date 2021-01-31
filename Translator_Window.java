import javax.swing.JFrame;
import java.awt.GridLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Translator_Window extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
    TR_Variables TRV = new TR_Variables();
    String_To_Code STC = new String_To_Code();
    Panel_Window_Methods PWM = new Panel_Window_Methods();
    Create CR = new Create();

    /**
     * This method will be better set up later. Right now we just needed a mock
     * window to test out our code
     */
    public void New_Window() {
        TRV.Translator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TRV.Translator.setSize(500, 500);
        TRV.TR_Enter.addActionListener(this);
        TRV.TR_Panel.setLayout(new GridLayout(2, 1));
        TRV.TR_Panel.add(TRV.TR_Text_Area);
        TRV.TR_Panel.add(TRV.TR_Enter);
        TRV.Translator.add(TRV.TR_Panel);
        TRV.Translator.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        String input = TRV.TR_Text_Area.getText();
        input.toLowerCase(); // for easier coding
        if (e.getSource() == TRV.TR_Enter) 
        {
            STC.Translation(input);
        } else 
        {
            PWM.actionPerformed(e);
        }
    }
}
