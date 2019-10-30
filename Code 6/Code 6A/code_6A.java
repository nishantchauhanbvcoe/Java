/**
 * @author nishant
 */

// Event Handling - Mouse Listener

import java.awt.*;
import java.awt.event.*;

class paint extends MouseMotionAdapter {
    Frame f;
    
    paint() {
        f = new Frame("Draw");
        f.addMouseMotionListener(this);
        f.setSize(500, 500);
        f.setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(), e.getY(), 10, 10);
    }
}

public class code_6A {
    public static void main(String[] args) {
        new paint();
    }
}