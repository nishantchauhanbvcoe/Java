/**
 * @author nishant
 */

// Smiley

import java.applet.Applet;
import java.awt.*;

public class code_5B extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawOval(50, 50, 100, 100);
        g.fillOval(50, 50, 100, 100);
        g.setColor(Color.red);
        g.drawOval(70, 70, 20, 20);
        g.fillOval(70, 70, 20, 20);
        g.drawOval(110, 70, 20, 20);
        g.fillOval(110, 70, 20, 20);
        g.drawArc(85, 100, 35, 35, -30, -120);
        g.fillArc(85, 100, 35, 35, -30, -120);
        g.setColor(Color.blue);
        g.drawArc(88, 100, 30, 30, -30, -120);
        g.fillArc(88, 100, 30, 30, -30, -120);
    }
}