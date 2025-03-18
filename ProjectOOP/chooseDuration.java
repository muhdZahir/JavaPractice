 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Set;

public class chooseDuration extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            chooseDuration duration = new chooseDuration(0); 
        });
    }

    private int sumFromSelectSubjectClass;
    private JLabel totalSumLabel;   

        private Set<String> selectedSubjects;  


    public chooseDuration(int sum) {

        
        
        this.sumFromSelectSubjectClass = sum;

        // ------------[Create the main frame]----------------------

        JFrame mainFrame = new JFrame();
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(1000, 800);
        mainFrame.setTitle("Select Duration");
        mainFrame.setLocationRelativeTo(null);

 
        JPanel panel = new JPanel();

 
        panel.setBackground(Color.darkGray);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        panel.setLayout(null);   

    
        JRadioButton radioBtn1 = new JRadioButton("1 Month");
        JRadioButton radioBtn3 = new JRadioButton("3 Months");
        JRadioButton radioBtn5 = new JRadioButton("5 Months");

 
        radioBtn1.setBounds(120, 490, 100, 30);
        radioBtn3.setBounds(450, 490, 100, 30);
        radioBtn5.setBounds(770, 490, 100, 30);

 
        ButtonGroup group = new ButtonGroup();
        group.add(radioBtn1);
        group.add(radioBtn3);
        group.add(radioBtn5);

 
        Icon book1 = new ImageIcon(new ImageIcon("image/paper.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        JLabel displaypaper = new JLabel(book1);
        displaypaper.setBounds(20, 220, 300, 300);
        displaypaper.setBorder(BorderFactory.createLineBorder(Color.white, 10));

        Icon book2 = new ImageIcon(new ImageIcon("image/onebook.jpg").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        JLabel displaybook = new JLabel(book2);
        displaybook.setBounds(350, 220, 300, 300);
        displaybook.setBorder(BorderFactory.createLineBorder(Color.white, 10));

        Icon book3 = new ImageIcon(new ImageIcon("image/manybook.png").getImage().getScaledInstance(300, 300, Image.SCALE_DEFAULT));
        JLabel displaybook3 = new JLabel(book3);
        displaybook3.setBounds(670, 220, 300, 300);
        displaybook3.setBorder(BorderFactory.createLineBorder(Color.white, 10));


        ImageIcon banner = new ImageIcon(new ImageIcon("image/durationbanner.jpg").getImage().getScaledInstance(800, 170, Image.SCALE_DEFAULT));
        JLabel bannericon = new JLabel(banner);
        bannericon.setBounds(90, 10, 800, 170);



        JPanel greyPanel = new JPanel();
        greyPanel.setBackground(Color.getHSBColor(20, 150, 100));
        greyPanel.setBounds(0, 0, 1000, 195);

        JPanel buttonwhitepanel1 = new JPanel();
        buttonwhitepanel1.setBackground(Color.white);
        buttonwhitepanel1.setBounds(20, 480, 300, 40);

        JPanel buttonwhitepanel2 = new JPanel();
        buttonwhitepanel2.setBackground(Color.white);
        buttonwhitepanel2.setBounds(350, 480, 300, 40);

        JPanel buttonwhitepanel3 = new JPanel();
        buttonwhitepanel3.setBackground(Color.white);
        buttonwhitepanel3.setBounds(670, 480, 300, 40);

        JPanel whitesumPanel = new JPanel();
        whitesumPanel.setBounds(20, 610, 200, 40);

        totalSumLabel = new JLabel("Total Sum: RM0.00");
        totalSumLabel.setBounds(50, 615, 150, 30);

        // Back button
        JButton resetbutton = new JButton("RESELECT COURSE");
        resetbutton.setBounds(20, 655, 200, 50);
        resetbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();  
                selectSubject subject = new selectSubject();  
            }
        });

    
        
        JButton paymentButton = new JButton("PROCEED PAYMENT");
        paymentButton.setBounds(770, 655, 200, 50);
        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
                openPaymentUI();   
            }
        });
        
   
         
        panel.add(radioBtn1);
        panel.add(radioBtn3);
        panel.add(radioBtn5);

        panel.add(buttonwhitepanel1);
        panel.add(buttonwhitepanel2);
        panel.add(buttonwhitepanel3);

        panel.add(displaypaper);
        panel.add(displaybook);
        panel.add(displaybook3);
        panel.add(bannericon);
        panel.add(greyPanel);

        panel.add(totalSumLabel);
        panel.add(whitesumPanel);

        panel.add(resetbutton);  
        panel.add(paymentButton);  

     
        mainFrame.add(panel);

        
        radioBtn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalSum(1);
            }
        });

        radioBtn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalSum(3);
            }
        });

        radioBtn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateTotalSum(5);
            }
        });

        

 
        mainFrame.setVisible(true);
    }

        private void openPaymentUI() {
            paymentUI.createAndShowGUI();
    }
    

    private void calculateTotalSum(int months) {
        int totalSum = sumFromSelectSubjectClass * months;
        totalSumLabel.setText("Total Sum: RM" + totalSum + ".00");   
        JOptionPane.showMessageDialog(null, "Total Sum for " + months + " months = RM" + totalSum + ".00");
    }
}
