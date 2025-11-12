import javax.swing.*;
import java.awt.*;
public class Guess
{
    public static void main(String args[])
    {
        ButtonFrame buttonFrame = new ButtonFrame();
        JFrame f= new JFrame();
	buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	buttonFrame.setSize(275,110);
	buttonFrame.setVisible(true);
    }
}