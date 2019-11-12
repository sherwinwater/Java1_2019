import javax.swing.JFrame;

public class JFrameExample {
  public static void main(String[] args) {
    JFrame frame = new JFrame("hello frame");
    frame.setSize(300,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);

  }
}
