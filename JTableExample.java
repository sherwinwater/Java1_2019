package javaCodeGeeks;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/*
 * A basic swing example with JTable
 */

public class JTableExample {

  public static void main(String[] args) {
    JFrame frame = new JFrame("Hello Swing");

    // Set data inside the table
    String[][] data = {{"01", "Alex", "18"}, {"02", "Brandon", "20"}, {"03", "Cassie", "18"}, {"04", "Steve", "25"}};
    String[] column = {"ID", "Name", "Age"};

    // Create JTable
    JTable jt = new JTable(data, column);
    JScrollPane sp = new JScrollPane(jt);

    frame.add(sp);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

}