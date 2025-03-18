 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

public class selectSubject {

    

    private JFrame frame;
    private JPanel mainPanel;
    private CardLayout cardLayout;
    private int sum = 0;  
    private Set<String> registeredCourses = new HashSet<>(); // Set to store registered courses
    private JLabel totalFeeLabel;

   
    private boolean subjectsSelected = false;
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new selectSubject();
        });
    }

   

    public selectSubject() {

        //-------------------------------[Main Panel]-------------------------------------------------------
        mainPanel = new JPanel();
        mainPanel.setLayout(null);

 
        mainPanel.setBackground(Color.darkGray);

        // Add 4 buttons to the main panel with custom sizes
        Icon SCicon = new ImageIcon(new ImageIcon("image/science.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        JButton btnSubject1 = new JButton(SCicon);
        btnSubject1.setBounds(290, 130, 300, 300);
        btnSubject1.setBorder(BorderFactory.createLineBorder(Color.white, 6));

        Icon MTicon = new ImageIcon(new ImageIcon("image/math.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        JButton btnSubject2 = new JButton(MTicon);
        btnSubject2.setBounds(600, 130, 300, 300);
        btnSubject2.setBorder(BorderFactory.createLineBorder(Color.white, 6));

        Icon ARTicon = new ImageIcon(new ImageIcon("image/art.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        JButton btnSubject3 = new JButton(ARTicon);
        btnSubject3.setBounds(290, 440, 300, 300);
        btnSubject3.setBorder(BorderFactory.createLineBorder(Color.white, 6));

        Icon ACCicon = new ImageIcon(new ImageIcon("image/accounting.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        JButton btnSubject4 = new JButton(ACCicon);
        btnSubject4.setBounds(600, 440, 300, 300);
        btnSubject4.setBorder(BorderFactory.createLineBorder(Color.white, 6));

        JPanel greyPanel = new JPanel();
        greyPanel.setBackground(Color.getHSBColor(20, 150, 100));
        greyPanel.setBounds(250, 0, 800, 120); 

        JPanel UserPanel = new JPanel();
        UserPanel.setBackground(Color.white);
        UserPanel.setBounds(250, 0, 10, 800); 

        
        Icon additionalbanner = new ImageIcon(new ImageIcon("image/additionalclass.jpg").getImage().getScaledInstance(700, 110, Image.SCALE_DEFAULT));
        JLabel additionalicon = new JLabel(additionalbanner);
        additionalicon.setBounds(275, 05, 700, 110);
   
        


        JPanel costPanel = new JPanel();
        costPanel.setBackground(Color.white);
        costPanel.setBounds(20, 130, 200, 50); 

        JButton logoutBtn = new JButton("LOGOUT");
        logoutBtn.setBounds(20, 670, 205, 40);

        

        JButton timetableBtn = new JButton("PREVIEW TIMETABLE");
        timetableBtn.setBounds(20, 620, 205, 40);
        
        Icon userIcon = new ImageIcon(new ImageIcon("image/user.png").getImage().getScaledInstance(203, 103, Image.SCALE_DEFAULT));
        JLabel userDisplay = new JLabel(userIcon);
        userDisplay.setBounds(20, 10, 203, 103);
     
        
        

   
        totalFeeLabel = new JLabel("Total Fee per month =  RM0");
        totalFeeLabel.setBounds(30, 145, 200, 20);

        mainPanel.add(userDisplay);
        mainPanel.add(totalFeeLabel);
        mainPanel.add(costPanel);
        
        mainPanel.add(timetableBtn);
        mainPanel.add(logoutBtn);
        mainPanel.add(additionalicon);
        
        
        

        mainPanel.add(btnSubject1);
        mainPanel.add(btnSubject2);
        mainPanel.add(btnSubject3);
        mainPanel.add(btnSubject4);
        

        mainPanel.add(UserPanel);
        mainPanel.add(greyPanel);
        
        //--------------[Give attribute to button]-------------------------

        logoutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                    frame.dispose();
                    mainClass main = new mainClass();
                    main.showFrame();
                    
                
            }
        });

        //--------------[Give attribute to button]-------------------------

        timetableBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // Close the current frame
               confirmSubject confirmed = new confirmSubject(registeredCourses);
                
                frame.dispose();

                
            }
        });

        
       

        
        

        //-------------------------------[Set values to panel's variable]-------------------------------------------------------
        JPanel panelSub1 = createSubPanel("SCIENCE", Color.getHSBColor(238, 147, 178), "SUBJECT : SCIENCE ADDITIONAL CLASS",
        "Registration fee : RM50.00 per month",
        "For this class, you will revise advance fundemental in Science ",
        "including basic biology , you will also learn more about the",
        "proper handling and usage of microscopes in the laboratory. ",
        "image/science.jpg", 300, 300, 100, 150 ,50);


        JPanel panelSub2 = createSubPanel("MATHEMATICS", Color.getHSBColor(238, 137, 80), "SUBJECT : MATHEMATICS ADDITIONAL CLASS" 
        ,"Registration fee : RM60.00 per month" ,
        "For this class, you will learn the basic mathematical and",
        "introduction to logarithm and its application. This class ",
        "aim to apply deeper understanding and logical thinking.",
        "image/math.jpg", 300, 300, 100, 150 , 60);


        JPanel panelSub3 = createSubPanel("ART", Color.getHSBColor(280 , 133 ,292), "SUBJECT : ART ADDITIONAL CLASS" ,
        "Registration fee : RM70.00 per month (Material included)" ,
        "For this class, you will learn how to draw anatomy and live ",
        "painting . You will also learn color theory and brush handling",
        "This class aim to refine drawing technique efficiently",
        "image/art.jpg", 300, 300, 100, 150 , 70);


        JPanel panelSub4 = createSubPanel("ACCOUNTING", Color.getHSBColor(136, 268, 190), "SUBJECT : ACCOUNTING ADDITIONAL CLASS" ,
        "Registration fee : RM80.00 per month (Material included)" ,
        "For this class, you will revise basic economy mathematics ",
        "cost accounting , business strategy , financial analysis.",
        "You will also learn advance calculator usage.",
        "image/accounting.jpg", 300, 300, 100, 150 , 80);

        



        //-------------------------------[CardLayout]-------------------------------------------------------
        cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        cardPanel.add(mainPanel, "main");
        cardPanel.add(panelSub1, "1");
        cardPanel.add(panelSub2, "2");
        cardPanel.add(panelSub3, "3");
        cardPanel.add(panelSub4, "4");

        cardLayout.show(cardPanel, "main");  

        //-------------------------[Switching panels when clicking button]-------------------------------------------------


        btnSubject1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardLayout.show(cardPanel, "1");
                updateTotalFeeLabel();
            }
        });

        btnSubject2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardLayout.show(cardPanel, "2");
                updateTotalFeeLabel();
            }
        });

        btnSubject3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardLayout.show(cardPanel, "3");
                updateTotalFeeLabel();
            }
        });

        btnSubject4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                cardLayout.show(cardPanel, "4");
                updateTotalFeeLabel();
            }
        });
        

        updateTotalFeeLabel(); 
        

        frame = new JFrame("Select Subject");
        frame.setSize(1000, 800);
        frame.add(cardPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        



        
        

    }//end of Public selectSubject()


    private void updateTotalFeeLabel() {
        SwingUtilities.invokeLater(() -> {
            totalFeeLabel.setText("Total Fee per month =  RM" + sum+".00");
            mainPanel.revalidate();
            mainPanel.repaint();
        });
    
    
    
    
        
    }



    private JPanel createSubPanel(String subjectName, Color color, String text,  String subjectDesc , String DescLine1 ,String DescLine2 ,
                                      String DescLine3,String imagePath, int imageWidth, int imageHeight, int imageX, int imageY , int fee) {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(color);


        //------------------------[register button]--------------------------------

        JButton btnRegister = new JButton("Register course");
        btnRegister.setBounds(610, 310, 140, 50);

        

        //------------------------[Unregister button]--------------------------------

        JButton btnUndo = new JButton("Unregister course");
        btnUndo.setBounds(460, 310, 140, 50);
        btnUndo.setEnabled(false);


        btnUndo.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
        
                sum -= fee;
                JOptionPane.showMessageDialog(frame, "Course unregistered ! Your total Fee = RM" + sum+".00");
                btnRegister.setEnabled(true); 
                btnUndo.setEnabled(false); 
                unregisterCourse(subjectName); 
            }
        });
        panel.add(btnUndo);


        if (isCourseRegistered(subjectName)) {
            btnRegister.setEnabled(false);
            btnUndo.setEnabled(true);  
        } 
        
        else {

            btnRegister.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {

                    sum += fee;
                    JOptionPane.showMessageDialog(frame, "Registration successful! Total Fee = RM" + sum+".00");
                    btnRegister.setEnabled(false);
                    btnUndo.setEnabled(true); 
                    registerCourse(subjectName); 
                }
            });
        }   
    
        //------------------------[back button]--------------------------------
        JButton btnBack = new JButton("Back to Main page");
        btnBack.setBounds(520, 380, 140, 50);

        //give action to back button when clicked
        btnBack.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                //go back to main panel
                cardLayout.show(mainPanel.getParent(), "main");
                updateTotalFeeLabel();
            }
        });


        

        
    

       
        

        //------------------[Subject description creation]--------------------------------------------

        JLabel textLabel = new JLabel(text);
        textLabel.setBounds(130, 100, 600, 20);
        Font fontheader = new Font("Helvetica CY", Font.BOLD, 20); 
        textLabel.setFont(fontheader);

        JLabel subjectDescription = new JLabel(subjectDesc);
        subjectDescription.setBounds(430, 190, 400, 20);
        Font font = new Font("Arial", Font.BOLD, 13); 
        subjectDescription.setFont(font);



        JLabel subjectLine1 = new JLabel(DescLine1);
        subjectLine1.setBounds(430, 230, 400, 20);

        JLabel subjectLine2 = new JLabel(DescLine2);
        subjectLine2.setBounds(430, 250, 400, 20);

        JLabel subjectLine3 = new JLabel(DescLine3);
        subjectLine3.setBounds(430, 270, 400, 20);
        
        panel.add(textLabel);
        panel.add(subjectDescription);
        panel.add(subjectLine1);
        panel.add(subjectLine2);
        panel.add(subjectLine3);
        panel.add(btnBack);
        panel.add(btnRegister);

 
        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);
        whitePanel.setBounds(410, 150, 400, 300); 
        panel.add(whitePanel);
    
 
        JPanel titlePanel = new JPanel();
        titlePanel.setBackground(Color.WHITE);
        
        titlePanel.setBounds(100, 80, 710, 60);
        panel.add(titlePanel);
 
        if (imagePath != null && !imagePath.isEmpty()) {
            ImageIcon icon = new ImageIcon(new ImageIcon(imagePath).getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_DEFAULT));
            JLabel imageLabel = new JLabel(icon);
            imageLabel.setBorder(BorderFactory.createLineBorder(Color.white, 6));
            imageLabel.setBounds(imageX, imageY, imageWidth, imageHeight);
            panel.add(imageLabel);
        }
    
        return panel;

    }//End of private JPanel createSubPanel

 



 
    private void unregisterCourse(String courseName) {
        registeredCourses.remove(courseName);
        subjectsSelected = !registeredCourses.isEmpty();
    }


    // Helper method to check if a course is already registered
    private boolean isCourseRegistered(String courseName) {
 
        return registeredCourses.contains(courseName);
    }


    // Helper method to mark a course as registered
    private void registerCourse(String courseName) {
 
        registeredCourses.add(courseName);
        subjectsSelected = !registeredCourses.isEmpty(); 
    }


    // Add a getter method for the 'sum' variable
    public int getSum() {
        return sum;
    }

}//End of selectSubject class

