import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PanelDemo2 extends JFrame implements ActionListener{
    public static final int WIDTH = 300;
    public static final int HEIGHT = 300;
    
    public static void main(String args[]) {
        PanelDemo2 guiWithPanel = new PanelDemo2();
        guiWithPanel.setVisible(true);
        
    }
    public PanelDemo2() {
        setSize(WIDTH,HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Panel Demo2");
        Container contentPane = getContentPane(); 
        contentPane.setBackground(Color.CYAN);
        contentPane.setLayout(new BorderLayout());
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setBackground(Color.WHITE);
        buttonPanel.setLayout(new FlowLayout());
        
        JButton stopButton = new JButton("Red");
        stopButton.setBackground(Color.RED);
        stopButton.addActionListener(this);
        buttonPanel.add(stopButton);
        
        JButton goButton = new JButton("Green");
        goButton.setBackground(Color.GREEN);
        goButton.addActionListener(this);
        buttonPanel.add(goButton);
        
        contentPane.add(buttonPanel,BorderLayout.NORTH);
    }
    
    public void actionPerformed(ActionEvent e) {
        Container contentPane = getContentPane();
        if(e.getActionCommand().equals("Red")) {
            contentPane.setBackground(Color.RED);
        }
        else if(e.getActionCommand().equals("Green")) {
            contentPane.setBackground(Color.GREEN);
        }
        else {
            System.out.println("Error in button interface");
        }
    }

}
