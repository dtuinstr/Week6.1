import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
//        JOptionPane.showMessageDialog(null, "Aloha, World!");

//        JOptionPane.showMessageDialog(null,
//                "Hello, World!",
//                "Dialog Title",
//                JOptionPane.INFORMATION_MESSAGE,
//                //new ImageIcon("images/globe.gif")
//                new MarsIcon(50));

        JFrame frame = new JFrame();
        frame.setTitle("Hello / Goodbye");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setLocation(500, 500);

        final int FIELD_WIDTH = 20;
        final JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button");

        JButton helloButton = new JButton("Say Hello");
        helloButton.addActionListener(
                createButtonTextFieldUpdater("Hello, World!",
                        textField)
        );

        JButton goodbyeButton = new JButton("Say Goodbye");
        goodbyeButton.addActionListener(
                createButtonTextFieldUpdater("Goodbye, World!",
                        textField)
        );

        frame.add(helloButton);
        frame.add(goodbyeButton);
        frame.add(textField);

        frame.pack();
        frame.setVisible(true);
    }

    public static ActionListener createButtonTextFieldUpdater(
            String message, JTextField textField) {
        return new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                textField.setText(message);
            }
        };
    }
}