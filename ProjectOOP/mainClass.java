 

import javax.swing.*;
import java.awt.*;

public class mainClass {

    private JFrame frame;

    //--------[run mainClass]-----------------------------


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new mainClass().showFrame();
        });
    }


    //-------------------[Creating main frame]--------------------------
    
    public void showFrame() {
        frame = new JFrame("Hogwart Academic Helper");
        frame.setSize(1000, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        ImageIcon portal = new ImageIcon(new ImageIcon("image/Portal.jpg").getImage().getScaledInstance(800, 170, Image.SCALE_DEFAULT));
        JLabel portalicon = new JLabel(portal);
        portalicon.setBounds(20, 490, 800, 170);

        JPanel redpanel = new JPanel();
        redpanel.setBackground(Color.getHSBColor(20, 150, 100));
        redpanel.setPreferredSize(new Dimension(200, 200));

    
        LoginUI loginUI = new LoginUI();
        JPanel loginpanel = loginUI.getPanel();
        loginpanel.setPreferredSize(new Dimension(400, 300));

        redpanel.add(portalicon);

        frame.add(redpanel, BorderLayout.NORTH);
        frame.add(loginpanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    public void disposeFrame() {
        if (frame != null) {
            frame.dispose();
        }
    }
}
