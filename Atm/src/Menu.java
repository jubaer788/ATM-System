import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    Container container = new Container();
    JLabel menuLabel = new JLabel();
    JButton depositButton= new JButton();
    JButton withdrawButton = new JButton();
    JButton checkProfileButton = new JButton();
    JButton backButton = new JButton();
    Profile profile = new Profile();


    public Menu(){
        container.setLayout(null);
        menuLabel.setText("Main Menu");
        menuLabel.setBounds(220, 20, 100, 50);
        container.add(menuLabel);

        depositButton.setText("Deposit");
        depositButton.setBounds(180, 70, 150, 30);
        depositButton.setFocusable(false);
        depositButton.addActionListener(this);
        container.add(depositButton);

        withdrawButton.setText("Withdraw");
        withdrawButton.setBounds(180, 120, 150, 30);
        withdrawButton.setFocusable(false);
        withdrawButton.addActionListener(this);
        container.add(withdrawButton);

        checkProfileButton.setText("Check Profile");
        checkProfileButton.setBounds(180, 170, 150, 30);
        checkProfileButton.setFocusable(false);
        checkProfileButton.addActionListener(this);
        container.add(checkProfileButton);

        backButton.setText("Exit");
        backButton.setBounds(180, 220, 150, 30);
        backButton.setFocusable(false);
        backButton.addActionListener(this);
        container.add(backButton);


        frame.add(container);
        frame.setTitle("Atm");
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==depositButton){
            frame.setVisible(false);
            new Deposit();

        } else if (e.getSource()==withdrawButton) {
            frame.setVisible(false);
            new Withdraw();

        }else if (e.getSource()==checkProfileButton) {
            frame.setVisible(false);
            profile.profile();
        }
        else if (e.getSource()==backButton) {
            frame.setVisible(false);

        }
    }
}
