import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Oracle implements ActionListener {

    JLabel label;
    JLabel label2;
    JFrame frame;
    JPanel panel;


    public Oracle (){
        frame = new JFrame();
        JButton button = new JButton("Ask me");
        button.addActionListener(this);
        label = new JLabel("Type what you want to know!");
        label2 = new JLabel("");



        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(200 ,200,500,200));
        panel.setLayout(new GridLayout(0,1));
        panel.add(label);



        JTextArea userText = new JTextArea();
        userText.setBounds(100,90,120,200);
        panel.add(userText);
        panel.add(button);
        panel.add(label2);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Magic");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Oracle();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int i = ThreadLocalRandom.current().nextInt(0,2);
        if ((i == 0)) {
            label2.setText("                        YES");
        } else {
            label2.setText("                        NO");
        }
    }
}
