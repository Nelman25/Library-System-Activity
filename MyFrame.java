import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MyFrame implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton button;
    JPanel topSection;

    MyFrame() {
        frame = new JFrame();
        textField = new JTextField();
        button = new JButton("Search");
        topSection = new JPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700,700);
        frame.setLayout(new FlowLayout());
        frame.setResizable(false);

        topSection.setBackground(Color.lightGray);
        topSection.setPreferredSize(new Dimension(700,50));

        textField.setPreferredSize(new Dimension(300,30));

        button.setSize(100,50);
        button.addActionListener(this);

        frame.add(topSection,BorderLayout.NORTH);
        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            String bookTitle = textField.getText();
            BookInfo bookInfo = new BookInfo();
        }
    }
}