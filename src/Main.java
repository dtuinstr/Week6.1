import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(
                null,
                "Aloha, World!");

//        JOptionPane.showMessageDialog(
//                null,
//                "Hello, World!",
//                "Hello Message",
//                JOptionPane.WARNING_MESSAGE,
//                new ImageIcon("images/globe.gif")
//                //new MarsIcon(75)
//        );

//        countryTester();
    }

    public static void countryTester()    {
        ArrayList<Country> countries = new ArrayList<>();
        countries.add(new Country("Uruguay", 176220));
        countries.add(new Country("Thailand", 514000));
        countries.add(new Country("Belgium", 30510));

        Collections.sort(countries);
        // Now the array list is sorted by area
        for (Country c : countries)
            System.out.println(c.getName() + " " + c.getArea());
    }
}