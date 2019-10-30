/**
 * @author nishant
 */

// Event Handling - Key Listener

import java.awt.*;
import java.awt.event.*;

class type extends KeyAdapter {
    Frame f;
    Label l;
    TextArea text;

    type() {
        f = new Frame("Type & Type!");
        l = new Label("--Type First--");
        l.setBounds(100, 80, 150, 40);
        text = new TextArea();
        text.addKeyListener(this);
        text.setBounds(100, 180, 300, 100);
        f.add(l);
        f.add(text);
        f.setSize(500, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void keyReleased(KeyEvent e) {
        String str = text.getText();
        l.setText("Text Length: " + str.length());
    }
}

public class code_6C {
    public static void main(String[] args) {
        new type();
    }
}