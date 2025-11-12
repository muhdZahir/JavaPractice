import java.awt.*;
import javax.swing.*;
public class frameClass extends JFrame
{
    private JList list;
    private JPanel p;
    private JButton b1;
    private JButton b2;
    public frameClass()
    {
        super("List example");
        setLayout(new BorderLayout());
        p = new JPanel();
        b1 = new JButton();
        b2 = new JButton();
        p.setLayout(new FlowLayout());
        String arr[] = {"item1","item2"};
        list = new JList(arr);
        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        p.add(b1);
        p.add(b2);
        add(list, BorderLayout.CENTER);
        add(p, BorderLayout.NORTH);
    }
    
}
