import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class calculator extends JFrame
{
    private JTextField text;
    private JButton btn[];
    private JPanel panel1;
    private JPanel panel2;
    
    public calculator()
    {
        super("Calculator");
        setLayout(new BorderLayout());
        panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        text = new JTextField(20);
        panel2.add(text);
        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4,3));
        ButtonHandler handler = new ButtonHandler();
        btn = new JButton[10];
        for(int i = 0; i < 9;i++)
        {
            btn[i] = new JButton(String.valueOf(i+1));
            btn[i].addActionListener(handler);
            panel1.add(btn[i]);
        }
        btn[9] = new JButton("AC");
        btn[9].addActionListener(handler);
        panel1.add(btn[9]);
        add(panel2, BorderLayout.NORTH);
        add(panel1, BorderLayout.CENTER);
        
    }
    
    private class ButtonHandler implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            Object source = event.getSource();
            JButton btn;
            if (source instanceof JButton)
            {
                btn = (JButton) source;
                text.setText(text.getText() + Integer.parseInt(btn.getText()));
            }
            
        }
    }
    
    public static void main(String args[])
    {
        calculator calc = new calculator();
        calc.setVisible(true);
        calc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calc.setSize(300,300);
    }
}
