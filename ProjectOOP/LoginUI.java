 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class LoginUI {

    private static JPanel panel;
    private static JLabel idLabelCreate;
    private static JLabel passLabelCreate;
    private static JLabel successLogin;
    private static JTextField idTextCreate;
    private static JPasswordField passTextCreate;
    private static JButton confirmButton;


    
    
    
    public LoginUI() {



    //------------------------------------[label creation]-----------------------------------

    idLabelCreate = new JLabel();
    idLabelCreate.setText("User            = ");
    idLabelCreate.setBounds(320, 180, 80, 25);  // x , y , size kot dua ni

    passLabelCreate = new JLabel();
    passLabelCreate.setText("Password  = ");
    passLabelCreate.setBounds(320, 220, 80, 25);

    successLogin = new JLabel("");
    successLogin.setText("Please enter student ID and password to login");
    successLogin.setBounds(340, 135, 300, 25);

    //------------------------------------[textfield creation]-----------------------------------

    idTextCreate = new JTextField();
    idTextCreate.setBounds(400, 180, 200, 25);

    passTextCreate = new JPasswordField();
    passTextCreate.setBounds(400, 220, 200, 25);

    //------------------------------------[Button creation]-----------------------------------

    confirmButton = new JButton();
    confirmButton.setText("Login");
    confirmButton.setBounds(440, 260, 80, 40);

    ButtonHandler handler = new ButtonHandler();
    confirmButton.addActionListener(handler);

    //------------------------------------[Panel creation]-----------------------------------

    panel = new JPanel();
    panel.setLayout(null);  
    panel.setBorder(BorderFactory.createEmptyBorder(10, 200, 150, 200)); // atas , kiri , bawah , kanan

    JPanel whitepanel = new JPanel();
    whitepanel.setBounds( 300 , 120 , 350, 200);


    
    panel.add(successLogin);
    panel.add(idLabelCreate);
    panel.add(idTextCreate);
    panel.add(passLabelCreate);
    panel.add(passTextCreate);
    panel.add(confirmButton);
    
    panel.add(whitepanel);
    panel.setBackground(Color.darkGray);



    //----------------------------------[Frame creation]----------------------------------




    }//end of LoginUI Method


    //enable panel untuk guna dekat mainClass
    public JPanel getPanel() {
        return panel;
    
    }
    
    
    
    //--------------[Give attribute to button]-------------------------
    
    private class ButtonHandler implements ActionListener {
            
        public void actionPerformed(ActionEvent event) {
            String user = idTextCreate.getText();
            String pass = new String(passTextCreate.getPassword());
    
            if (user.equals("0001") && pass.equals("123")) {
                successLogin.setText("Login successful");
                JOptionPane.showMessageDialog(panel, "You have successfully logged in " , "success" , JOptionPane.INFORMATION_MESSAGE);
                
                selectSubject selectSubjectClass = new selectSubject();
    
                ((JFrame) SwingUtilities.getWindowAncestor(panel)).dispose();
    
                
            } else {
                successLogin.setText("Please try again");
            }
        }
    }

    
}
