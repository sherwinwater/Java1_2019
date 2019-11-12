package javaCodeGeeks;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * A basic swing example with JComboBox
 */

public class ComboBoxExample {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello Swing");
    JPanel panel = new JPanel();


    // Set data in the drop-down list
    String[] country = {"Australia", "China", "England", "Russia", "United States"};

    // Create combobox
    JComboBox cb = new JComboBox(country);
//    panel.setSize(1000,900);
    frame.setSize(600,700);

    panel.add(cb);
    frame.add(panel);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}