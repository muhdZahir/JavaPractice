import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButtonFrame extends JFrame
{
    private JTextField input;
    private JButton clickButton;
    private JLabel label;
    private JRadioButton _3;
    private JRadioButton _4;
    private JRadioButton _5;
    private int random = (int)(Math.random()*99)+1;
    
    public ButtonFrame()
    {
        super("Guess The Number!!!");
        setLayout(new FlowLayout());
    
        input = new JTextField("What's the number?",10);
        add(input);
        
        clickButton = new JButton("Guess");
        add(clickButton);
        
        label = new JLabel("Please enter a number a guess.");
        add(label);
        
        _3 = new JRadioButton("3",false);
        _4 = new JRadioButton("4",false);
        _5 = new JRadioButton("5",false);
        add(_3);
        add(_4);
        add(_5);
        
        String s = input.getText();
        //int a = Integer.parseInt(s);
        
        ButtonHandler handler = new ButtonHandler();
        clickButton.addActionListener(handler);
        
    }
    
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            if(event.getSource() == clickButton)
            {
                if(random == Integer.parseInt(input.getText()))
                    label.setText("You guessed correctly!");
                else if(random < Integer.parseInt(input.getText()))
                    label.setText("Guess lower!");
                else
                    label.setText("Guess higher!");
            }
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}
