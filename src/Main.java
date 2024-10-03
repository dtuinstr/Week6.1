import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        demoJOptionPaneAndIcon();

//        comparisonsAndLambdas();

//        framesDemo();

        System.out.println("Exiting Demos");
    }

    public static void demoJOptionPaneAndIcon() {
        JOptionPane.showMessageDialog(
                null,
                "Aloha, World!");
        JOptionPane.showMessageDialog(
                null,
                "Hello, World!",
                "Hello Message",
                JOptionPane.INFORMATION_MESSAGE,
                new ImageIcon("images/globe.gif")
        );
        JOptionPane.showMessageDialog(
                null,
                "Hello, World!",
                "Hello Message",
                JOptionPane.INFORMATION_MESSAGE,
                new MarsIcon(75)
        );
    }

    public static void comparisonsAndLambdas() {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));

        // Original ordering
        printCollection("original order", countries);

        // Sort by area
        Collections.sort(countries);
        printCollection("by area (using Comparable)", countries);

        // Sort by name
        Comparator<Country> compByName = new CountryComparator();
        countries.sort(compByName);
        printCollection("by name (using Comparator)", countries);

        // Reverse sort by name
        Comparator<Country> compByNameRev = new CountryComparator(-1);
        countries.sort(compByNameRev);
        printCollection("by name reversed (using Comparator)", countries);

        Comparator<Country> compByAreaRev =
                (c1, c2) -> -1 * Double.compare(c1.getArea(), c2.getArea());

        countries.sort(compByAreaRev);
        printCollection("by area reversed (using lambda)", countries);
    }

    public static void printCollection(String label, Collection<Country> countries) {
        System.out.println("====================");
        System.out.println(label);
        for (Country c : countries) {
            System.out.println(c);
        }
    }

    public static void framesDemo() {
        final int FIELD_WIDTH = 20;

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setTitle("Hello World GUI");

        JButton helloButton = new JButton("Say Hello");
        JButton goodbyeButton = new JButton("Say Goodbye");
        final JTextField textField = new JTextField(FIELD_WIDTH);
        textField.setText("Click a button!");

        helloButton.addActionListener(event ->
                textField.setText("Hello, World!"));
        goodbyeButton.addActionListener(event ->
                textField.setText("Goodbye, World"));

        frame.add(helloButton);
        frame.add(goodbyeButton);
        frame.add(textField);

        frame.pack();
        frame.setVisible(true);
    }
}