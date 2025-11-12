import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


public class MultipleSelectionFrame extends JFrame{
    @SuppressWarnings("rawtypes")
    private JList colorJList; // list to hold colornames
    @SuppressWarnings("rawtypes")
    private JList copyJList; // list to copy color names into
    private JButton copyJButton; // button to copy selected names
    private final String colorNames[] = {"Black","Blue","Cyan",
            "Dark Gray", "Gray","Green","Light Gray", "Magenta",
            "Orange","Pink", "Red", "White","Yellow"};
    
    // Multiple Selection list constructor
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public MultipleSelectionFrame()
    {
        super("Multiple Selection Test");
        setLayout(new FlowLayout());
        colorJList = new JList(colorNames); // holds names of all colors
        colorJList.setVisibleRowCount(5); // show 5 rows
        colorJList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); 
        add(new JScrollPane(colorJList));// add list with scrollpane
        
        copyJButton = new JButton(("Copy >>>>")); // create a copy button
        copyJButton.addActionListener( // anonymous inner class
        
            new ActionListener()
            {
                @SuppressWarnings({ "deprecation" })
                public void actionPerformed(ActionEvent event)
                {
                    copyJList.setListData(colorJList.getSelectedValues());
                }
        }
        );
        add(copyJButton); // add copy button to JList
        copyJList = new JList();// create list to hold copied color names
        copyJList.setVisibleRowCount(5); // show 5 rows
        copyJList.setFixedCellHeight(15);// set width
        copyJList.setFixedCellWidth(100); // set height
        copyJList.setSelectionMode(
                ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        add( new JScrollPane(copyJList));
    }
    
}
