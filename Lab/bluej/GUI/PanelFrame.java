import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PanelFrame extends JFrame {
    private JPanel buttonJPanel;
    private JButton buttons[];
    private JLabel label;
    
    public PanelFrame()
    {
        super("Panel Demo");
        buttons = new JButton[5]; // create buttons array
        buttonJPanel = new JPanel(); // set up panel
        label = new JLabel();
        buttonJPanel.setLayout(new GridLayout(1,buttons.length));
        ButtonHandler handler = new ButtonHandler();
        //create and add buttons
        for(int count = 0; count < buttons.length;count++)
        {
            buttons[count] = new JButton("Button" + (count+1));
            buttons[count].addActionListener(handler);
            buttonJPanel.add(buttons[count]); //add button to panel
        }
        add(buttonJPanel, BorderLayout.SOUTH);//add panel to jframe
        add(label, BorderLayout.CENTER);
    }
    private class ButtonHandler implements ActionListener{
    public void actionPerformed(ActionEvent event) {
        label.setText(event.getActionCommand());
    }
    }
}
