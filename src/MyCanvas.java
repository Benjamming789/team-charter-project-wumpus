import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    public void paint(Graphics g) {
        g.drawRect (10, 10, 300, 300);
        g.drawRect (10, 10, 300, 100);
        g.drawRect (10, 11, 300, 200);
        g.drawRect (10, 10, 200, 300);
        g.drawRect (10, 10, 100, 300);
    }
}


