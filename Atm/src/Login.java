import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    private Container container;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton resetButton;

    public Login() {
        container = getContentPane();
        container.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setBounds(50, 20, 100, 30);
        container.add(userLabel);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(50, 70, 100, 30);
        container.add(passwordLabel);

        userTextField = new JTextField();
        userTextField.setBounds(150, 20, 150, 30);
        container.add(userTextField);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 70, 150, 30);
        container.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 120, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        resetButton = new JButton("Exit");
        resetButton.setBounds(200, 120, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);

        setTitle("Login Form");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String passwordText;
            userText = userTextField.getText();
            passwordText = passwordField.getText();
            if (userText.equalsIgnoreCase("jubaer") && passwordText.equalsIgnoreCase("788")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                setVisible(false);
                new Menu();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        } else if (e.getSource() == resetButton) {
            setVisible(false);
        }
    }
}