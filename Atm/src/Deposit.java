import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame implements ActionListener {

    private Container container;
    private JLabel userLabel;
    private JLabel passwordLabel;
    private JTextField userTextField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton resetButton;
    Profile profile = new Profile();

    public Deposit() {
        container = getContentPane();
        container.setLayout(null);

        userLabel = new JLabel("Amount");
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

        loginButton = new JButton("Deposit");
        loginButton.setBounds(50, 120, 100, 30);
        loginButton.addActionListener(this);
        container.add(loginButton);

        resetButton = new JButton("Back");
        resetButton.setBounds(200, 120, 100, 30);
        resetButton.addActionListener(this);
        container.add(resetButton);

        setTitle("Deposit");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String amountText;
            String passwordText;
            amountText = userTextField.getText();
            passwordText = passwordField.getText();
            if (passwordText.equalsIgnoreCase("788")) {
                add(amountText);
                JOptionPane.showMessageDialog(this, "Deposit Successful");
                setVisible(false);
                new Menu();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Password");
            }
        } else if (e.getSource() == resetButton) {
            setVisible(false);
            new Menu();
        }
    }

    void add(String amount){
        int amount1=Integer.parseInt(amount);
        profile.balance1+=amount1;
    }
}