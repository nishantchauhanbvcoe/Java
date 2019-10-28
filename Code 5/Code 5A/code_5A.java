/**
 * @author nishant
 */

// Two strings in different fonts inside a rectangle

import java.applet.Applet;
import java.awt.*;

public class code_5A extends Applet {
    private static final long serialVersionUID = 1L;

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(130, 130, 120, 40);
        g.fillRect(130, 130, 120, 40);
        Font f = new Font("TimesRoman", Font.PLAIN, 20);
        g.setFont(f);
        g.setColor(Color.red);
        g.drawString("Nishant", 158, 155);

        g.setColor(Color.red);
        g.drawRect(130, 230, 120, 40);
        g.fillRect(130, 230, 120, 40);
        f = new Font("monospace", Font.BOLD, 20);
        g.setFont(f);
        g.setColor(Color.blue);
        g.drawString("chauhan", 155, 257);
    }
}