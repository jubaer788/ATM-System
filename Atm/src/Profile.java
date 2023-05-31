import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Profile extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    Container container = new Container();
    JButton backButton = new JButton("Back");
    String name = "Jubaer";
    String acc = "777A";
    static  int balance1 = 1000;
    String balance = String.valueOf(balance1);

    public void  profile(){
        container.setLayout(null);
        String[] column={"Account No","Name","Balance"};
        DefaultTableModel model = new DefaultTableModel(column, 0);
        model.addRow(new Object[]{acc, name, balance});


        backButton.setFocusable(false);
        backButton.addActionListener(this);
        JTable table = new JTable(model);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JScrollPane(table), BorderLayout.CENTER);
        panel.add(backButton, BorderLayout.SOUTH);


        frame.setTitle("Profile");
        frame.add(panel);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==backButton){
            frame.setVisible(false);
            new Menu();
        }
    }
}
