package javaCodeGeeks;

import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


/*
 * A basic swing example with JButton
 */

public class JButtonExample {

  public static void main(String[] args) {
    // Define frame, label and panel
    JFrame frame = new JFrame("Hello Swing");
    JLabel label = new JLabel("I'm a JLabel", JLabel.CENTER);
    JLabel label2 = new JLabel("I'm a JLabel2", JLabel.LEFT);

    JPanel panel = new JPanel();

    // Setting for the panel
    BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
    panel.setLayout(boxlayout);
    panel.setBorder(new EmptyBorder(new Insets(0, 10, 45, 70)));

    // Define new buttons
    JButton jb1 = new JButton("Button 1");
    JButton jb2 = new JButton("Button 2");
    JButton jb3 = new JButton("Button 3");

    // Add buttons to the frame (and spaces between buttons)
    panel.add(jb1);
    panel.add(jb3);
    panel.add(jb2);


    // Add the label and panel to the frame
    frame.setLayout(new GridLayout(3, 1));
    frame.add(panel);
    frame.add(label2);
    frame.add(label);

    // Settings for the frame
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }

}
