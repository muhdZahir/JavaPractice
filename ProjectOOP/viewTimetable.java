 

import javax.swing.*;
import java.awt.*;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class viewTimetable {


   

    private JFrame frame;
    private int totalSum = 0;
    private int[] subjectValues;


    
    
    

    public viewTimetable(int[] subjectValues) {
        this.subjectValues = subjectValues;
        


        int valueScience = 0;
        int valueMath = 0;
        int valueArt = 0;
        int valueAccount = 0;
        
        
        //First Row Subject-------------------------------------------------------------------------------------
        JPanel sciencePanel = createSubjectPanel("Science","8 AM - 11 AM", Color.getHSBColor(238, 147, 178), 80, 80, 190, 210); //tukaq y ja
        JPanel mathPanel = createSubjectPanel("Mathematics","8 AM - 11 AM", Color.getHSBColor(238, 137, 80), 80, 80, 460, 210);
        JPanel artPanel = createSubjectPanel("Art","8 AM - 11 AM", Color.getHSBColor(280 , 133 ,292), 80, 80, 640, 210);
        JPanel accountingPanel = createSubjectPanel("Accounting","8 AM - 11 AM", Color.getHSBColor(136, 268, 190), 80, 80, 280, 210);
        

        //Second Row Subject-------------------------------------------------------------------------------------
        JPanel sciencePanel2 = createSubjectPanel("Science","11 AM - 2 PM", Color.getHSBColor(238, 147, 178), 80, 80, 370, 295);
        JPanel mathPanel2 = createSubjectPanel("Mathematics","11 AM - 2 PM", Color.getHSBColor(238, 137, 80), 80, 80, 280, 295);
        JPanel artPanel2 = createSubjectPanel("Art","11 AM - 2 PM", Color.getHSBColor(280 , 133 ,292), 80, 80, 730, 295);
        JPanel accountingPanel2 = createSubjectPanel("Accounting","11 AM - 2 PM", Color.getHSBColor(136, 268, 190), 80, 80, 550, 295);
        

        //Third Row Subject-------------------------------------------------------------------------------------
        JPanel sciencePanel3 = createSubjectPanel("Science","3 PM - 7 PM", Color.getHSBColor(238, 147, 178), 80, 80, 550, 380);
        JPanel mathPanel3 = createSubjectPanel("Mathematics","3 PM - 7 PM", Color.getHSBColor(238, 137, 80), 80, 80, 370, 380);
        JPanel artPanel3 = createSubjectPanel("Art","3 PM - 7 PM", Color.getHSBColor(280 , 133 ,292), 80, 80, 460, 380);
        JPanel accountingPanel3 = createSubjectPanel("Accounting","3 PM - 7 PM", Color.getHSBColor(136, 268, 190), 80, 80, 730, 380);
        

        //Fourth Row Subject-------------------------------------------------------------------------------------
        JPanel sciencePanel4 = createSubjectPanel("Science","7 PM - 9 PM", Color.getHSBColor(238, 147, 178), 80, 80, 640, 463);
        JPanel mathPanel4 = createSubjectPanel("Mathematics","7 PM - 9 PM", Color.getHSBColor(238, 137, 80), 80, 80, 190, 463);
        JPanel artPanel4 = createSubjectPanel("Art","7 PM - 9 PM", Color.getHSBColor(280 , 133 ,292), 80, 80, 280, 463);
        JPanel accountingPanel4 = createSubjectPanel("Accounting","7 PM - 9 PM", Color.getHSBColor(136, 268, 190), 80, 80, 460, 463);



        JPanel background = new JPanel();
        background.setBackground(Color.darkGray);
        background.setBounds( 0 , 0 , 1000 ,800);

        ImageIcon calendar = new ImageIcon(new ImageIcon("image/calendar.jpg").getImage().getScaledInstance(750, 670, Image.SCALE_DEFAULT));
        JLabel calendarIcon = new JLabel(calendar);
        calendarIcon.setBounds(0, 100, 750, 670);
        

 
        frame = new JFrame("Timetable");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  

    
 
        if (subjectValues[0] > 0) {  
            totalSum += 50;
            frame.add(sciencePanel);
            frame.add(sciencePanel2);
            frame.add(sciencePanel3);
            frame.add(sciencePanel4);
        }

        if (subjectValues[3] > 0) {   
            totalSum += 60;
            frame.add(mathPanel);
            frame.add(mathPanel2);
            frame.add(mathPanel3);
            frame.add(mathPanel4);
        }

        if (subjectValues[2] > 0) {  
            totalSum += 70;
            frame.add(artPanel);
            frame.add(artPanel2);
            frame.add(artPanel3);
            frame.add(artPanel4);
        }

        if (subjectValues[1] > 0) {  
            totalSum += 80;
            frame.add(accountingPanel);
            frame.add(accountingPanel2);
            frame.add(accountingPanel3);
            frame.add(accountingPanel4);
        }

        



        

    
        JButton PrintButton = new JButton("PRINT");
        PrintButton.setBounds(20, 130, 100, 30);
        PrintButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Time table have been printed successfully !");
                
                
            }
        });

 
        JButton durationButton = new JButton("DURATION");
        durationButton.setBounds(20, 70, 100, 30);
        durationButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 openChooseDuration(totalSum);  
                 
             }
         });



        

    
        JButton backButton = new JButton("RESET");
        backButton.setBounds(20, 20, 100, 30);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                goBackToSelectSubject();  
            }
        });
        

        
        frame.add(durationButton);
        frame.add(PrintButton);
        frame.add(backButton);
        background.add(calendarIcon);

        frame.add(background);
      
        frame.setVisible(true);

        

        
    }



    private void openChooseDuration(int totalSum) {
        frame.dispose();  
        chooseDuration durationScreen = new chooseDuration(totalSum);  
    }

    public int getTotalSum() {
        return totalSum;
    }

    private void goBackToSelectSubject() {
        frame.dispose();  
        selectSubject subject = new selectSubject();  
    }
    

    

    private JPanel createSubjectPanel(String subjectName, String SubjectTme , Color color, int width, int height, int x, int y) {
        JPanel panel = new JPanel();
        panel.setBackground(color);
        panel.setSize(width, height);
        panel.setLocation(x, y);

        JLabel time = new JLabel(SubjectTme);
        time.setForeground(Color.black);
        time.setBounds(10, 20, 100, 20);  
        panel.add(time);

        JLabel label = new JLabel(subjectName);
        label.setForeground(Color.black);
        label.setBounds(10, 10, 100, 20);  
        panel.add(label);

        

        return panel;
    }
}
