/**
 * @author nishant
 */

// Event Handling - Button Listener

import java.awt.*;
import java.awt.event.*;

class click implements ActionListener {
    Frame f;
    TextField l;

    click() {
        f = new Frame("Click Me!");
        l = new TextField("--Click First--");
        Button b = new Button("Click");
        l.setBounds(100, 100, 150, 40);
        b.setBounds(100, 150, 70, 40);
        f.add(l);
        f.add(b);
        b.addActionListener(this);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        l.setText("Button Pressed!");
    }
}

public class code_6B {
    public static void main(String[] args) {
        new click();
    }
}