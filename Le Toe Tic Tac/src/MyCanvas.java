import java.awt.*;
import java.awt.geom.Line2D;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.JComponent;
import javax.swing.JFrame;

class MyCanvas extends JComponent {

    public void x(Graphics g, int x1, int y1, int x2, int y2){
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x1, y2, x2, y1);
    }

    public void paint(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g.drawString("Hello Friends", 120,330);
      //this piece of code will draw the box game board

        g.drawRect (10, 10, 300, 300);
        g.drawRect (10, 10, 300, 100);
        g.drawRect (10, 11, 300, 200);
        g.drawRect (10, 10, 200, 300);
        g.drawRect (10, 10, 100, 300);
        //This chunk of code draws a red circle
        g.setColor(Color.RED);
        g.drawOval(15,15,90,90);
        //This Chunk of code changes the Color back to black and draws an X
        g.setColor(Color.BLUE);

        x(g, 20,20,100,100);
        x(g, 20,20,100,100);
    }
}


