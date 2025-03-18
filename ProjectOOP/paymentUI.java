 

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener; 

public class paymentUI {

    

    private static chooseDuration durationScreen;

    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    static void createAndShowGUI() {
        JFrame frame = new JFrame("Payment");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
    
        ImageIcon portal = new ImageIcon(new ImageIcon("image/Portal.jpg").getImage().getScaledInstance(800, 170, Image.SCALE_DEFAULT));
        JLabel portalIcon = new JLabel(portal);
        portalIcon.setBounds(175, 10, 800, 170);
    
        ImageIcon payment = new ImageIcon(new ImageIcon("image/payment.png").getImage().getScaledInstance(814, 900, Image.SCALE_DEFAULT));
        JLabel paymentIcon = new JLabel(payment);
    
        JScrollPane scrollPane = new JScrollPane(paymentIcon);
        scrollPane.setBounds(170, 195, 814, 600);
    
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.getHSBColor(20, 150, 100));
        redPanel.setBounds(0, 0, 1000, 192);
    
        JPanel sidePanel = new JPanel();
        sidePanel.setBackground(Color.getHSBColor(20, 150, 100));
        sidePanel.setBounds(140, 0, 30, 800);
    
        JPanel background = new JPanel();
        background.setBackground(Color.darkGray);
        background.setBounds(0, 0, 1000, 800);
    
        JCheckBox newCheckBox = new JCheckBox("Not a robot ?");
        newCheckBox.setBounds(10, 710, 120, 25);
    
        JButton paymentButton = new JButton("PROCEED");
        paymentButton.setBounds(10, 670, 120, 30);
        paymentButton.setEnabled(false);
    
        // ItemListener for the newCheckBox
        newCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                updatePaymentButtonState(newCheckBox.isSelected(), paymentButton);
            }
        });
    
        paymentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Redirecting to payment page");
            }
        });
    
        frame.add(paymentButton);
    
        JButton openDurationButton = new JButton("RESELECT");
        openDurationButton.setBounds(10, 620, 120, 30);
    
        // Open Duration Button ActionListener
        openDurationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                selectSubject reopenClass = new selectSubject();
            }
        });
    
        frame.add(portalIcon);
        frame.add(redPanel);
        frame.add(sidePanel);
        frame.add(scrollPane);
        frame.add(newCheckBox);
        frame.add(paymentButton);
        frame.add(openDurationButton);
        frame.add(background);
    
        frame.setVisible(true);
    }

    private static void updatePaymentButtonState(boolean newCheckBoxSelected, JButton paymentButton) {
        paymentButton.setEnabled(newCheckBoxSelected);
    }
}
