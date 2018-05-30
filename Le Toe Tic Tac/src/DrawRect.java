import javax.swing.*;

public class DrawRect {
    public static void main(String[] a) {
        JLabel label = new JLabel("yeah");
        label.setText("hello everyone");
        JFrame window = new JFrame("Le Toe Tic Tac");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setBounds(30, 30, 350, 380);
        window.getContentPane().add(new MyCanvas());
        window.setVisible(true);
    }
}